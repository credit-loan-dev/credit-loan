package com.sixliu.creditloan.workflow.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import com.sixliu.creditloan.user.dto.UserDTO;
import com.sixliu.creditloan.user.service.UserManagerService;
import com.sixliu.creditloan.workflow.constant.JobStatus;
import com.sixliu.creditloan.workflow.constant.TaskStatus;
import com.sixliu.creditloan.workflow.dao.WorkflowJobDao;
import com.sixliu.creditloan.workflow.dao.WorkflowJobModelDao;
import com.sixliu.creditloan.workflow.dao.WorkflowTaskDao;
import com.sixliu.creditloan.workflow.dao.WorkflowTaskModelDao;
import com.sixliu.creditloan.workflow.dto.FlowTask;
import com.sixliu.creditloan.workflow.dto.TaskProcessResult;
import com.sixliu.creditloan.workflow.entity.WorkflowJob;
import com.sixliu.creditloan.workflow.entity.WorkflowJobModel;
import com.sixliu.creditloan.workflow.entity.WorkflowTask;
import com.sixliu.creditloan.workflow.entity.WorkflowTaskModel;
import com.sixliu.creditloan.workflow.service.WorkflowRuntimeService;
import com.sixliu.creditloan.workflow.util.FlowUtils;
import com.sixliu.creditloan.workflow.worker.impl.AutoProcessWorkerMangaer;

/**
 * @author:MG01867
 * @date:2018年7月23日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 流程管理-运行时服务接口实现
 */
@RestController
public class WorkflowRuntimeServiceImpl implements WorkflowRuntimeService {

	@Autowired
	UserManagerService userManagerService;

	@Autowired
	private WorkflowJobModelDao workflowJobModelDao;

	@Autowired
	private WorkflowTaskModelDao workflowTaskModelDao;

	@Autowired
	private WorkflowJobDao workflowJobDao;

	@Autowired
	private WorkflowTaskDao workflowTaskDao;

	@Autowired
	private AutoProcessWorkerMangaer autoProcessWorkerMangaer;

	@Transactional
	@Override
	public String createJob(String workflowJobModelId, String userId) {
		WorkflowJobModel workflowJobModel = workflowJobModelDao.get(workflowJobModelId);
		if (null == workflowJobModel) {
			throw new IllegalArgumentException(
					String.format("The flowJobClass[%s] is non-existent", workflowJobModelId));
		}
		UserDTO user = getAndCheckUser(userId);
		if (null == user) {
			throw new IllegalArgumentException(String.format("The user[%s] is non-existent", userId));
		}
		if (!StringUtils.equals(user.getRoleId(), workflowJobModel.getCreateRoleId())) {
			throw new IllegalArgumentException(String.format(
					"The user[%s] create flowJob of flowJobClass[%s] Permission denied", userId, workflowJobModelId));
		}
		WorkflowJob flowJob = FlowUtils.newWorkflowJob(workflowJobModel, user.getId());
		workflowJobDao.insert(flowJob);
		WorkflowTaskModel workflowTaskModel = workflowTaskModelDao.getByJobIdAndPhase(workflowJobModel.getId(), 0);
		if (null == workflowTaskModel) {
			throw new IllegalArgumentException(
					String.format("The flowJobClass[%s] configure empty flowTaskModel", workflowJobModel.getId()));
		}
		WorkflowTask workflowTask = FlowUtils.newWorkflowTask(workflowTaskModel, flowJob.getId(), user.getId());
		workflowTaskDao.insert(workflowTask);
		return flowJob.getId();
	}

	@Override
	public List<FlowTask> listTaskByUserId(String userId) {
		UserDTO user = getAndCheckUser(userId);
		List<WorkflowTask> workflowTasks = workflowTaskDao.listByRoleId(user.getRoleId());
		List<FlowTask> result = new ArrayList<>(workflowTasks.size());
		for (WorkflowTask item : workflowTasks) {
			FlowTask flowTask = new FlowTask();
			BeanUtils.copyProperties(item, flowTask);
			result.add(flowTask);
		}
		return result;
	}

	@Override
	public List<FlowTask> listTaskByUserIdAndTaskStatus(String userId, TaskStatus status) {
		UserDTO user = getAndCheckUser(userId);
		workflowTaskDao.listByRoleIdAndStatus(user.getRoleId(), status);
		return null;
	}

	@Override
	public String autoClaimTask(String userId) {
		UserDTO user = getAndCheckUser(userId);
		WorkflowTask claimWorkflowTask = randomWorkflowTask(user.getId());
		TaskProcessResult taskProcessResult = new TaskProcessResult();
		taskProcessResult.setJobId(claimWorkflowTask.getId());
		taskProcessResult.setTaskId(claimWorkflowTask.getId());
		taskProcessResult.setStatus(TaskStatus.PENDING);
		taskProcessResult.setUserId(userId);
		submitTaskProcessResult(taskProcessResult);
		return claimWorkflowTask.getId();
	}

	@Override
	public void submitTaskProcessResult(TaskProcessResult taskProcessResult) {
		autoProcessWorkerMangaer.submitTaskProcessResult(taskProcessResult);
	}

	@Override
	public void cancelJob(String jobId, String userId) {
		WorkflowJob job = workflowJobDao.get(jobId);
		if (null == job) {
			throw new IllegalArgumentException(String.format("This flowTask[%s] is non-existent", jobId));
		}
		if (!StringUtils.equals(userId, job.getCreateUserId())) {
			throw new IllegalArgumentException(
					String.format("The user[%s] cancelFlowJob flowJob[%s] Permission denied", userId, userId, jobId));
		}
		job.setStatus(JobStatus.CANCEL_ENDED);
		job.setUpdateDate(new Date());
	}

	private WorkflowTask randomWorkflowTask(String userId) {
		return null;
	}

	private UserDTO getAndCheckUser(String userId) {
//		UserDTO user = userManagerService.get(userId);
//		if (null == user) {
//			throw new IllegalArgumentException(String.format("The user[%s] is non-existent", userId));
//		}
		UserDTO user = new UserDTO();
		user.setId(userId);
		user.setRoleId(userId);
		return user;
	}
}
