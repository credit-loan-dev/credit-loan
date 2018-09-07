package com.sixliu.creditloan.workflow.status;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sixliu.creditloan.workflow.constant.JobStatus;
import com.sixliu.creditloan.workflow.constant.TaskStatus;
import com.sixliu.creditloan.workflow.dao.WorkflowJobDao;
import com.sixliu.creditloan.workflow.dao.WorkflowTaskDao;
import com.sixliu.creditloan.workflow.dao.WorkflowTaskModelDao;
import com.sixliu.creditloan.workflow.dao.WorkflowTaskOpinionDao;
import com.sixliu.creditloan.workflow.dto.TaskProcessResult;
import com.sixliu.creditloan.workflow.entity.WorkflowJob;
import com.sixliu.creditloan.workflow.entity.WorkflowTask;
import com.sixliu.creditloan.workflow.entity.WorkflowTaskOpinion;
import com.sixliu.creditloan.workflow.service.WorkflowService;

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

	@Value("${app.autoProcessWorkerMangaer.initialDelayIncFactor}")
	private String ip;

	@Value("${app.autoProcessWorkerMangaer.initialDelayIncFactor}")
	private int port;

	private String url;

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
	private TxTaskStatusMachine txTaskStatusMachine;

	public AbstractTaskStatusMachine(TaskStatus taskStatus) {
		this.taskStatus = taskStatus;
	}

	@PostConstruct
	public void init() {
		this.url = ip + ":" + port + WorkflowService.PATH;
		taskStatusMachineFactory.register(this);
	}

	@Override
	public final void process(TaskProcessResult taskProcessResult, CompleteCallback completeCallback) {
		txTaskStatusMachine.process(taskProcessResult);
		completeCallback.complete(taskProcessResult.getJobId());
	}

	@Component
	public class TxTaskStatusMachine {

		@Transactional
		public void process(TaskProcessResult taskProcessResult) {
			WorkflowJob workflowJob = workflowJobDao.get(taskProcessResult.getJobId());
			if (null == workflowJob) {
				throw new IllegalArgumentException(
						String.format("This Job[%s] is non-existent", taskProcessResult.getJobId()));
			}
			if (JobStatus.STARTED != workflowJob.getStatus()) {
				throw new UnsupportedOperationException(
						String.format("The job[%s] is ended[%s]", workflowJob.getId(), workflowJob.getStatus()));
			}
			if (null != workflowJob.getLockUUID()) {
				throw new IllegalArgumentException(String.format("The Job[%s] was be lock by target[%s]",
						workflowJob.getLockUrl() + "/" + workflowJob.getLockUUID()));
			}
			int locked = workflowJobDao.tryLock(workflowJob.getId(), url, WorkflowService.UUID,
					workflowJob.getVersion());
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
					log.error(String.format("The user[%s] process task[%s] of job[%s] err",
							taskProcessResult.getUserId(), workflowTask.getId(), workflowJob.getId()), exception);
				} finally {
					workflowJobDao.unlock(workflowJob.getId(), workflowJob.getVersion() + 1);
				}
			} else {
				log.warn(String.format("Try to lock job[%s] failed", workflowJob.getId()));
			}
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
