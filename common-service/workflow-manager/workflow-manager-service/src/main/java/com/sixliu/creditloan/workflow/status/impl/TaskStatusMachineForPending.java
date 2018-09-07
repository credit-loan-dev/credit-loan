package com.sixliu.creditloan.workflow.status.impl;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.sixliu.creditloan.workflow.constant.JobStatus;
import com.sixliu.creditloan.workflow.constant.TaskStatus;
import com.sixliu.creditloan.workflow.dto.TaskProcessResult;
import com.sixliu.creditloan.workflow.entity.WorkflowJob;
import com.sixliu.creditloan.workflow.entity.WorkflowTask;
import com.sixliu.creditloan.workflow.entity.WorkflowTaskModel;
import com.sixliu.creditloan.workflow.status.AbstractTaskStatusMachine;
import com.sixliu.creditloan.workflow.util.FlowUtils;

/**
 * @author:MG01867
 * @date:2018年9月7日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 任务状态机：待处理
 */
@Component
public class TaskStatusMachineForPending extends AbstractTaskStatusMachine {

	public TaskStatusMachineForPending() {
		super(TaskStatus.PENDING);
	}

	@Override
	protected WorkflowTask doProcess(WorkflowJob workflowJob, WorkflowTask workflowTask,
			TaskProcessResult taskProcessResult) {
		TaskStatus next = taskProcessResult.getStatus();
		WorkflowTask nextWorkflowTask = null;
		if (TaskStatus.PASS == next) {
			WorkflowTaskModel nextWorkflowTaskModel = getWorkflowTaskModelDao()
					.getByJobModelIdAndPhase(workflowJob.getModelId(), workflowTask.getPhase() + 1);
			if (null != nextWorkflowTaskModel) {
				nextWorkflowTask = FlowUtils.newWorkflowTask(nextWorkflowTaskModel, workflowTask.getJobId(),
						taskProcessResult.getUserId());
			} else {
				workflowJob.setStatus(JobStatus.PASS_ENDED);
				workflowJob.setUpdateDate(new Date());
			}
		} else if (TaskStatus.REJECT == next) {
			workflowJob.setStatus(JobStatus.REJECT_ENDED);
			workflowJob.setUpdateDate(new Date());
		} else if (TaskStatus.HANG_UP == next) {

		} else if (TaskStatus.OVERRULE == next) {
			WorkflowTaskModel overruleWorkflowTaskModel = getWorkflowTaskModelDao()
					.getByJobModelIdAndPhase(workflowJob.getModelId(), taskProcessResult.getOverrulePhase());
			if (null == overruleWorkflowTaskModel) {
				throw new IllegalArgumentException("the ");
			}
			if (overruleWorkflowTaskModel.getPhase() > workflowTask.getPhase()) {
				throw new IllegalArgumentException("the ");
			}
			nextWorkflowTask = FlowUtils.newWorkflowTask(overruleWorkflowTaskModel, workflowTask.getJobId(),
					taskProcessResult.getUserId());
		} else {
			throw new IllegalStateException(String.format(
					"This approvalResult's status[%s] of flowTask[%s][%s] is illegal", taskProcessResult.getStatus(),
					taskProcessResult.getTaskId(), taskProcessResult.getStatus()));
		}
		return nextWorkflowTask;
	}
}
