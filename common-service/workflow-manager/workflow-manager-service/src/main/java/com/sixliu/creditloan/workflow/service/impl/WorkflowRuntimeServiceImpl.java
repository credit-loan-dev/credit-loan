package com.sixliu.creditloan.workflow.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

import com.sixliu.credit.user.dto.UserDTO;
import com.sixliu.creditloan.user.service.UserManagerService;
import com.sixliu.creditloan.workflow.component.FlowTaskSubmitAop;
import com.sixliu.creditloan.workflow.component.FlowTaskSubmitAopManager;
import com.sixliu.creditloan.workflow.constant.JobStatus;
import com.sixliu.creditloan.workflow.constant.TaskStatus;
import com.sixliu.creditloan.workflow.constant.TaskType;
import com.sixliu.creditloan.workflow.dao.WorkflowJobDao;
import com.sixliu.creditloan.workflow.dao.FlowJobModelDao;
import com.sixliu.creditloan.workflow.dao.FlowTaskDao;
import com.sixliu.creditloan.workflow.dao.FlowTaskModelDao;
import com.sixliu.creditloan.workflow.dto.FlowJobModel;
import com.sixliu.creditloan.workflow.dto.FlowTask;
import com.sixliu.creditloan.workflow.dto.FlowTaskModel;
import com.sixliu.creditloan.workflow.dto.FlowTaskResult;
import com.sixliu.creditloan.workflow.entity.WorkflowJob;
import com.sixliu.creditloan.workflow.handler.AutoApprovalHandler;
import com.sixliu.creditloan.workflow.handler.impl.AutoApprovalHandlerManager;
import com.sixliu.creditloan.workflow.service.WorkflowRuntimeService;
import com.sixliu.creditloan.workflow.status.TaskStatusMachine;
import com.sixliu.creditloan.workflow.status.TaskStatusMachineFactory;
import com.sixliu.creditloan.workflow.util.FlowUtils;

/**
 * @author:MG01867
 * @date:2018年7月23日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 
 */
@RestController
public class WorkflowRuntimeServiceImpl implements WorkflowRuntimeService {

	@Autowired
	private UserManagerService userManagerService;

	@Autowired
	private FlowJobModelDao flowJobModelDao;

	@Autowired
	private FlowTaskModelDao flowTaskModelDao;

	@Autowired
	private WorkflowJobDao flowJobDao;

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
	public String createFlowJob(String flowJobModelId,String userId) {
		FlowJobModel flowJobModel = flowJobModelDao.get(flowJobModelId);
		if (null == flowJobModel) {
			throw new IllegalArgumentException(
					String.format("The flowJobClass[%s] is non-existent", flowJobModelId));
		}
		UserDTO user = userManagerService.get(flowJobModelId);
		if (null == user) {
			throw new IllegalArgumentException(
					String.format("The user[%s] is non-existent", userId));
		}
		if (!StringUtils.equals(user.getRoleId(), flowJobModel.getCreateRoleId())) {
			throw new IllegalArgumentException(
					String.format("The user[%s] create flowJob of flowJobClass[%s] Permission denied",
							userId, flowJobModel));
		}
		WorkflowJob flowJob = FlowUtils.newFlowJob(flowJobModel, user.getId());
		flowJobDao.insert(flowJob);
		FlowTaskModel flowTaskClass = flowTaskModelDao.getByflowJobModelAndPhase(flowJobModel.getId(), 0);
		if (null == flowTaskClass) {
			throw new IllegalArgumentException(
					String.format("The flowJobClass[%s] configure empty flowTaskModel", flowJobModel.getId()));
		}
		FlowTask flowTask = FlowUtils.newFlowTask(flowTaskClass, flowJob.getId(),
				user.getId());
		flowTaskDao.insert(flowTask);
		return flowJob.getId();
	}

	@Override
	public List<FlowTask> listFlowTask(String userId){
		UserDTO user = getAndCheckUser(userId);
		List<FlowTask> result = flowTaskDao.listByRoleId(user.getRoleId());
		return result;
	}
	
	@Override
	public List<FlowTask> listFlowTask(String userId,TaskStatus status){
		UserDTO user = getAndCheckUser(userId);
		List<FlowTask> result = flowTaskDao.listByRoleIdAndStatus(user.getRoleId(),status);
		return result;
	}


	@Override
	public String autoClaimFlowTask(String userId) {
		UserDTO user = getAndCheckUser(userId);
		FlowTask claimFlowTask = randomFlowTaskId(user.getId());
		FlowTaskResult flowTaskResult=new FlowTaskResult();
		flowTaskResult.setFlowJobId(claimFlowTask.getFlowJobId());
		flowTaskResult.setFlowTaskId(claimFlowTask.getId());
		flowTaskResult.setStatus(TaskStatus.PENDING);
		flowTaskResult.setUserId(userId);
		submitFlowTask(flowTaskResult);
		return claimFlowTask.getId();
	}
	
	
	@Override
	public void submitFlowTask(FlowTaskResult flowTaskResult) {
		WorkflowJob flowJob = getAndCheckWorkflowJob(flowTaskResult.getFlowJobId());
		FlowTask flowTask = getAndCheckFlowTask(flowTaskResult.getFlowJobId());

		FlowTaskSubmitAop flowTaskBeforeSubmitAop = flowTaskSubmitAopManager
				.get(flowTask.getFlowTaskBeforeSubmitAopClass());
		Objects.requireNonNull(flowTaskBeforeSubmitAop,
				String.format("The flowTask[%s] of flowJob[%s] didn't configure flowTaskBeforeSubmitAop",
						flowTask.getId(), flowJob.getId()));
		flowTaskBeforeSubmitAop.intercept(flowTask, flowTaskResult);

		TaskStatus taskStatus = flowTask.getStatus();
		TaskStatusMachine taskStatusMachine = taskStatusMachineFactory.get(taskStatus);
		FlowTask nextFlowTask = taskStatusMachine.process(flowJob, flowTask, flowTaskResult);
		flowTaskDao.update(flowTask);

		FlowTaskSubmitAop flowTaskAfterSubmitAop = flowTaskSubmitAopManager
				.get(flowTask.getFlowTaskAfterSubmitAopClass());
		Objects.requireNonNull(flowTaskAfterSubmitAop,
				String.format("The flowTask[%s] of flowJob[%s] didn't configure flowTaskAfterSubmitAop",
						flowTask.getId(), flowJob.getId()));
		flowTaskAfterSubmitAop.intercept(flowTask, flowTaskResult);

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
		WorkflowJob flowJob = getAndCheckWorkflowJob(flowJobId);
		if (!StringUtils.equals(userId, flowJob.getCreateUserId())) {
			throw new IllegalArgumentException(String
					.format("The user[%s] cancelFlowJob flowJob[%s] Permission denied", userId, userId, flowJobId));
		}
		flowJob.setStatus(JobStatus.CANCEL_ENDED);
		flowJob.setUpdateDate(new Date());
	}
	
	private FlowTask randomFlowTaskId(String userId) {
		return null;
	}

	private UserDTO getAndCheckUser(String userId) {
		UserDTO user = userManagerService.get(userId);
		if (null == user) {
			throw new IllegalArgumentException(String.format("The user[%s] is non-existent", userId));
		}
		return user;
	}
	
	private WorkflowJob getAndCheckWorkflowJob(String workflowJobId) {
		WorkflowJob workflowJob = flowJobDao.get(workflowJobId);
		if (null == workflowJob) {
			throw new IllegalArgumentException(String.format("This workflowJob[%s] is non-existent", workflowJobId));
		}
		return workflowJob;
	}

	private FlowTask getAndCheckFlowTask(String flowTaskId) {
		FlowTask flowTask = flowTaskDao.get(flowTaskId);
		if (null == flowTask) {
			throw new IllegalArgumentException(String.format("This flowTask[%s] is non-existent", flowTaskId));
		}
		return flowTask;
	}

}
