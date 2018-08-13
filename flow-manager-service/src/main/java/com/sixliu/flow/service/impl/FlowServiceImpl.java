package com.sixliu.flow.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.sixliu.credit.common.exception.IllegalArgumentAppException;
import com.sixliu.credit.user.api.UserManagerClient;
import com.sixliu.credit.user.dto.UserDTO;
import com.sixliu.flow.ApprovalResult;
import com.sixliu.flow.JobStatus;
import com.sixliu.flow.TaskStatus;
import com.sixliu.flow.approval.AutoApprovalHandler;
import com.sixliu.flow.approval.AutoApprovalHandlerManager;
import com.sixliu.flow.component.FlowTaskSubmitAop;
import com.sixliu.flow.component.FlowTaskSubmitAopManager;
import com.sixliu.flow.cto.CreateFlowJobDTO;
import com.sixliu.flow.dao.FlowJobClassDao;
import com.sixliu.flow.dao.FlowJobDao;
import com.sixliu.flow.dao.FlowTaskClassDao;
import com.sixliu.flow.dao.FlowTaskDao;
import com.sixliu.flow.entity.FlowJob;
import com.sixliu.flow.entity.FlowJobClass;
import com.sixliu.flow.entity.FlowTask;
import com.sixliu.flow.entity.FlowTaskClass;
import com.sixliu.flow.entity.TaskType;
import com.sixliu.flow.service.FlowService;
import com.sixliu.flow.service.FlowUtils;
import com.sixliu.flow.status.TaskStatusMachine;
import com.sixliu.flow.status.TaskStatusMachineFactory;

/**
 * @author:MG01867
 * @date:2018年7月23日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
public class FlowServiceImpl implements FlowService {

	@Autowired
	private UserManagerClient userManagerClient;

	@Autowired
	private FlowJobClassDao flowJobClassDao;

	@Autowired
	private FlowTaskClassDao flowTaskClassDao;

	@Autowired
	private FlowJobDao flowJobDao;

	@Autowired
	private FlowTaskDao flowTaskDao;

	@Autowired
	private TaskStatusMachineFactory taskStatusMachineFactory;

	@Value("${workerThreads}")
	private int workerThreads;

	@Value("${scheduledThreads}")
	private int scheduledThreads;

	private FlowTaskSubmitAopManager flowTaskSubmitAopManager;

	private AutoApprovalHandlerManager autoApprovalHandlerManager;

	@PostConstruct
	public void init() {
		this.flowTaskSubmitAopManager = new FlowTaskSubmitAopManager();
		this.autoApprovalHandlerManager = new AutoApprovalHandlerManager(workerThreads, scheduledThreads);
	}

	@Override
	public String createFlowJob(CreateFlowJobDTO createFlowJob) {
		FlowJobClass flowJobClass = flowJobClassDao.get(createFlowJob.getFlowJobClassId());
		if (null == flowJobClass) {
			throw new IllegalArgumentAppException(
					String.format("The flowJobClass[%s] is non-existent", createFlowJob.getFlowJobClassId()));
		}
		UserDTO user = userManagerClient.get(createFlowJob.getUserId());
		if (null == user) {
			throw new IllegalArgumentAppException(
					String.format("The user[%s] is non-existent", createFlowJob.getUserId()));
		}
		if (!StringUtils.equals(user.getRoleId(), flowJobClass.getCreateRoleId())) {
			throw new IllegalArgumentAppException(
					String.format("The user[%s] create flowJob of flowJobClass[%s] Permission denied",
							createFlowJob.getUserId(), createFlowJob.getFlowJobClassId()));
		}
		FlowJob flowJob = FlowUtils.newFlowJob(flowJobClass, user.getId());
		flowJobDao.insert(flowJob);
		FlowTaskClass flowTaskClass = flowTaskClassDao.getByflowJobClassAndPhase(flowJobClass.getId(), 0);
		if (null == flowTaskClass) {
			throw new IllegalArgumentException(
					String.format("The flowJobClass[%s] configure empty flowTaskModel", flowJobClass.getId()));
		}
		FlowTask flowTask = FlowUtils.newFlowTask(flowTaskClass, flowJob.getId(), createFlowJob.getChannelId(),
				user.getId());
		flowTaskDao.insert(flowTask);
		return flowJob.getId();
	}

	@Override
	public List<FlowTask> listFlowTaskFromPool(String userId) {
		UserDTO user = userManagerClient.get(userId);
		if (null == user) {
			throw new IllegalArgumentAppException(String.format("The user[%s] is non-existent", userId));
		}
		List<FlowTask> result = flowTaskDao.listManualFlowTaskByRole(user.getRoleId());
		return result;
	}

	@Override
	public void claimFlowTask(String taskId, String userId) {
		FlowTask flowTask = getAndCheckFlowTask(taskId);
		if (TaskStatus.PENDING != flowTask.getStatus()) {
			throw new IllegalArgumentAppException(String.format("The flowTask[%s] has been claimed", taskId));
		}
		UserDTO user = userManagerClient.get(userId);
		if (!StringUtils.equals(user.getRoleId(), flowTask.getWorker())) {
			throw new IllegalArgumentAppException(
					String.format("The user[%s] claim flowTask[%s] of flowJob[%s] Permission denied", userId,
							flowTask.getId(), flowTask.getFlowJobId()));
		}
		flowTaskDao.updateWorkerForManual(flowTask.getId(), userId, new Date(), flowTask.getVersion());
	}

	@Override
	public String autoClaimFlowTask(String userId) {
		UserDTO user = userManagerClient.get(userId);
		String claimFlowTaskId = null;
		while (true) {
			List<FlowTask> flowTasks = flowTaskDao.listManualFlowTaskByRole(user.getRoleId());
			if (null == flowTasks || flowTasks.isEmpty()) {
				break;
			}
			for (int i = 0, size = flowTasks.size(); i < size; i++) {
				FlowTask flowTask = flowTasks.get(i);
				int updateCount = flowTaskDao.updateWorkerForManual(flowTask.getId(), userId, new Date(),
						flowTask.getVersion());
				if (1 == updateCount) {
					claimFlowTaskId = flowTask.getId();
					break;
				}
			}
			if (null != claimFlowTaskId) {
				break;
			}
		}
		return claimFlowTaskId;
	}

	@Override
	public void submitApprovalResult(ApprovalResult approvalResult) {
		FlowJob flowJob = getAndCheckFlowJob(approvalResult.getFlowJobId());
		FlowTask flowTask = getAndCheckFlowTask(approvalResult.getFlowJobId());

		FlowTaskSubmitAop flowTaskBeforeSubmitAop = flowTaskSubmitAopManager
				.get(flowTask.getFlowTaskBeforeSubmitAopClass());
		Objects.requireNonNull(flowTaskBeforeSubmitAop,
				String.format("The flowTask[%s] of flowJob[%s] didn't configure flowTaskBeforeSubmitAop",
						flowTask.getId(), flowJob.getId()));
		flowTaskBeforeSubmitAop.intercept(flowTask, approvalResult);

		TaskStatus taskStatus = flowTask.getStatus();
		TaskStatusMachine taskStatusMachine = taskStatusMachineFactory.get(taskStatus);
		FlowTask nextFlowTask = taskStatusMachine.process(flowJob, flowTask, approvalResult);
		flowTaskDao.updateApprovalResult(flowTask.getId(), flowTask.getStatus(), flowTask.getInnerOpinion(),
				flowTask.getOuterOpinion(), flowTask.getChannelId(), new Date(), flowTask.getVersion());

		FlowTaskSubmitAop flowTaskAfterSubmitAop = flowTaskSubmitAopManager
				.get(flowTask.getFlowTaskAfterSubmitAopClass());
		Objects.requireNonNull(flowTaskAfterSubmitAop,
				String.format("The flowTask[%s] of flowJob[%s] didn't configure flowTaskAfterSubmitAop",
						flowTask.getId(), flowJob.getId()));
		flowTaskAfterSubmitAop.intercept(flowTask, approvalResult);

		if (null != nextFlowTask) {
			flowTaskDao.insert(nextFlowTask);
			if (TaskType.AUTO == nextFlowTask.getType()) {
				AutoApprovalHandler autoApprovalHandler = autoApprovalHandlerManager.get(nextFlowTask.getWorker());
				autoApprovalHandler.process(nextFlowTask);
			}
		}
	}

	@Override
	public void cancelFlowJob(String flowJobId, String userId) {
		FlowJob flowJob = getAndCheckFlowJob(flowJobId);
		if (!StringUtils.equals(userId, flowJob.getCreateUserId())) {
			throw new IllegalArgumentAppException(String
					.format("The user[%s] cancelFlowJob flowJob[%s] Permission denied", userId, userId, flowJobId));
		}
		flowJob.setStatus(JobStatus.CANCEL_ENDED);
		flowJob.setUpdateUserId(userId);
		flowJob.setUpdateDate(new Date());
	}

	private FlowJob getAndCheckFlowJob(String flowJobId) {
		FlowJob flowJob = flowJobDao.get(flowJobId);
		if (null == flowJob) {
			throw new IllegalArgumentException(String.format("This flowJob[%s] is non-existent", flowJobId));
		}
		return flowJob;
	}

	private FlowTask getAndCheckFlowTask(String flowTaskId) {
		FlowTask flowTask = flowTaskDao.get(flowTaskId);
		if (null == flowTask) {
			throw new IllegalArgumentException(String.format("This flowTask[%s] is non-existent", flowTaskId));
		}
		return flowTask;
	}
}
