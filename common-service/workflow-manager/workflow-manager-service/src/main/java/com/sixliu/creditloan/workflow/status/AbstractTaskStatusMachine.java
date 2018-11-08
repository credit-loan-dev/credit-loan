package com.sixliu.creditloan.workflow.status;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.sixliu.creditloan.workflow.component.TransactionalHelper;
import com.sixliu.creditloan.workflow.dao.WorkflowJobDao;
import com.sixliu.creditloan.workflow.dao.WorkflowTaskDao;
import com.sixliu.creditloan.workflow.dao.WorkflowTaskModelDao;
import com.sixliu.creditloan.workflow.dao.WorkflowTaskOpinionDao;
import com.sixliu.creditloan.workflow.entity.WorkflowJob;
import com.sixliu.creditloan.workflow.entity.WorkflowTask;
import com.sixliu.creditloan.workflow.entity.WorkflowTaskOpinion;
import com.sixliu.workflow.constant.JobStatus;
import com.sixliu.workflow.constant.TaskStatus;
import com.sixliu.workflow.dto.TaskProcessResult;
import com.sixliu.workflow.service.WorkflowService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author:MG01867
 * @date:2018年9月7日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe
 */
@Slf4j
public abstract class AbstractTaskStatusMachine implements TaskStatusMachine {

	private TaskStatus taskStatus;

	@Autowired
	private WorkflowJobDao workflowJobDao;

	@Autowired
	private WorkflowTaskModelDao workflowTaskModelDao;

	@Autowired
	private WorkflowTaskDao workflowTaskDao;

	@Autowired
	private WorkflowTaskOpinionDao workflowTaskOpinionDao;

	@Autowired
	private TaskStatusMachineFactory taskStatusMachineFactory;

	@Autowired
	private TransactionalHelper transactionalHelper;
	
	@Autowired
	private WorkflowService workflowService;

	public AbstractTaskStatusMachine(TaskStatus taskStatus) {
		this.taskStatus = taskStatus;
	}

	@PostConstruct
	public void init() {
		taskStatusMachineFactory.register(this);
	}

	@Override
	public final void process(TaskProcessResult taskProcessResult, CompleteCallback completeCallback) {
		transactionalHelper.doSomething(() -> {
			processByTransactional(taskProcessResult);
			return null;
		});
		completeCallback.complete(taskProcessResult.getJobId());
	}

	private void processByTransactional(TaskProcessResult taskProcessResult) {
		WorkflowJob workflowJob = workflowJobDao.get(taskProcessResult.getJobId());
		if (null == workflowJob) {
			throw new IllegalArgumentException(
					String.format("This Job[%s] is non-existent", taskProcessResult.getJobId()));
		}
		if (JobStatus.STARTED != workflowJob.getStatus()) {
			throw new UnsupportedOperationException(
					String.format("The job[%s] is ended[%s]", workflowJob.getId(), workflowJob.getStatus()));
		}
		if (null != workflowJob.getLockUrl()) {
			throw new IllegalArgumentException(
					String.format("The Job[%s] was be lock by target[%s]", workflowJob.getLockUrl()));
		}
		int locked = workflowJobDao.tryLock(workflowJob.getId(),workflowService.getUrl(), workflowJob.getVersion());
		if (1 == locked) {
			WorkflowTask workflowTask = workflowTaskDao.get(taskProcessResult.getTaskId());
			try {
				TaskStatus oldStatus = workflowTask.getStatus();
				WorkflowTask nextWorkflowTask = doProcess(workflowJob, workflowTask, taskProcessResult);
				TaskStatus newStatus = workflowTask.getStatus();
				if (oldStatus != newStatus) {
					workflowTaskDao.update(workflowTask);
				}
				if (StringUtils.isNotBlank(taskProcessResult.getInnerOpinion())
						|| StringUtils.isNotBlank(taskProcessResult.getOuterOpinion())) {
					WorkflowTaskOpinion workflowTaskOpinion = new WorkflowTaskOpinion();
					workflowTaskOpinion.setJobId(workflowJob.getId());
					workflowTaskOpinion.setTaskId(workflowTask.getId());
					workflowTaskOpinion.setInnerOpinion(taskProcessResult.getInnerOpinion());
					workflowTaskOpinion.setOuterOpinion(taskProcessResult.getOuterOpinion());
					workflowTaskOpinion.setCreateUserId(taskProcessResult.getUserId());
					workflowTaskOpinion.setUpdateUserId(taskProcessResult.getUserId());
					getWorkflowTaskOpinionDao().insert(workflowTaskOpinion);
				}
				if (null != nextWorkflowTask) {
					workflowTaskDao.insert(nextWorkflowTask);
				}
			} catch (Exception exception) {
				log.error(String.format("The user[%s] process task[%s] of job[%s] err", taskProcessResult.getUserId(),
						workflowTask.getId(), workflowJob.getId()), exception);
			} finally {
				workflowJobDao.unlock(workflowJob.getId(), workflowJob.getVersion() + 1);
			}
		} else {
			log.warn(String.format("Try to lock job[%s] failed", workflowJob.getId()));
		}
	}

	protected abstract WorkflowTask doProcess(WorkflowJob workflowJob, WorkflowTask workflowTask,
			TaskProcessResult taskProcessResult);

	@Override
	public final TaskStatus getTaskStatus() {
		return taskStatus;
	}

	public final WorkflowTaskModelDao getWorkflowTaskModelDao() {
		return workflowTaskModelDao;
	}

	public final WorkflowTaskDao getWorkflowTaskDao() {
		return workflowTaskDao;
	}

	public final WorkflowTaskOpinionDao getWorkflowTaskOpinionDao() {
		return workflowTaskOpinionDao;
	}
}
