package com.sixliu.creditloan.workflow.status.impl;

import org.springframework.stereotype.Component;

import com.sixliu.creditloan.workflow.constant.TaskStatus;
import com.sixliu.creditloan.workflow.dto.TaskProcessResult;
import com.sixliu.creditloan.workflow.entity.WorkflowJob;
import com.sixliu.creditloan.workflow.entity.WorkflowTask;
import com.sixliu.creditloan.workflow.status.AbstractTaskStatusMachine;

/**
 * @author:MG01867
 * @date:2018年9月7日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 任务状态机：任务池
 */
@Component
public class TaskStatusMachineForPooling extends AbstractTaskStatusMachine {

	public TaskStatusMachineForPooling() {
		super(TaskStatus.POOLING);
	}

	@Override
	protected WorkflowTask doProcess(WorkflowJob workflowJob, WorkflowTask workflowTask, TaskProcessResult taskProcessResult) {
		if (TaskStatus.PENDING != taskProcessResult.getStatus()) {
			throw new IllegalStateException(String.format(
					"This approvalResult's status[%s] of flowTask[%s][%s] is illegal", taskProcessResult.getStatus(),
					taskProcessResult.getTaskId(), taskProcessResult.getStatus()));
		}
		workflowTask.setStatus(taskProcessResult.getStatus());
		workflowTask.setOwnerUserId(taskProcessResult.getUserId());
		workflowTask.setUpdateUserId(taskProcessResult.getUserId());
		return null;
	}

}
