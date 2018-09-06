package com.sixliu.creditloan.workflow.status;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sixliu.creditloan.workflow.constant.JobStatus;
import com.sixliu.creditloan.workflow.constant.TaskStatus;
import com.sixliu.creditloan.workflow.dao.WorkflowTaskModelDao;
import com.sixliu.creditloan.workflow.dto.FlowTask;
import com.sixliu.creditloan.workflow.dto.FlowTaskResult;
import com.sixliu.creditloan.workflow.entity.WorkflowJob;
import com.sixliu.creditloan.workflow.entity.WorkflowTaskModel;
import com.sixliu.creditloan.workflow.util.FlowUtils;

/**
 * @author:MG01867
 * @date:2018年8月13日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
@Component
public class TaskStatusMachineFactory {

	@Autowired
	private WorkflowTaskModelDao flowTaskModelDao;

	public TaskStatusMachine get(TaskStatus taskStatus) {
		if (TaskStatus.POOLING == taskStatus) {
			return POOLING;
		} else if (TaskStatus.PENDING == taskStatus) {
			return PENDING;
		} else if (TaskStatus.TRANSFER == taskStatus) {
			return TRANSFER;
		} else if (TaskStatus.PASS == taskStatus) {
			return PASS;
		} else if (TaskStatus.REJECT == taskStatus) {
			return REJECT;
		} else if (TaskStatus.OVERRULE == taskStatus) {
			return OVERRULE;
		} else if (TaskStatus.HANG_UP == taskStatus) {
			return HANG_UP;
		} else {
			throw new IllegalArgumentException();
		}
	}

	/** 待认领 **/
	private TaskStatusMachine POOLING = new TaskStatusMachine() {
		@Override
		public FlowTask process(WorkflowJob workflowJob,FlowTask flowTask,FlowTaskResult approvalResult) {
			if (TaskStatus.PENDING != approvalResult.getStatus()) {
				throw new IllegalStateException(String.format(
						"This approvalResult's status[%s] of flowTask[%s][%s] is illegal", approvalResult.getStatus(),
						approvalResult.getFlowTaskId(), approvalResult.getStatus()));
			}
			flowTask.setStatus(approvalResult.getStatus());
			flowTask.setOwnerUserId(approvalResult.getUserId());
			return null;
		}
	};

	/** 待处理 **/
	private TaskStatusMachine PENDING = new TaskStatusMachine() {
		@Override
		public FlowTask process(WorkflowJob workflowJob,FlowTask flowTask,FlowTaskResult approvalResult) {
			TaskStatus next = approvalResult.getStatus();
			FlowTask nextFlowTask = null;
			if (TaskStatus.PASS == next) {
				WorkflowTaskModel nextWorkflowTaskModel = flowTaskModelDao
						.getByJobModelIdAndPhase(workflowJob.getModelId(), flowTask.getPhase() + 1);
				if (null != nextWorkflowTaskModel) {
					nextFlowTask = FlowUtils.newFlowTask(nextWorkflowTaskModel, flowTask.getFlowJobId(),
							approvalResult.getUserId());
				} else {
					workflowJob.setStatus(JobStatus.PASS_ENDED);
					workflowJob.setUpdateDate(new Date());
				}
			} else if (TaskStatus.REJECT == next) {
				workflowJob.setStatus(JobStatus.REJECT_ENDED);
				workflowJob.setUpdateDate(new Date());
			} else if (TaskStatus.HANG_UP == next) {

			} else if (TaskStatus.OVERRULE == next) {
				WorkflowTaskModel overruleWorkflowTaskModel = flowTaskModelDao
						.getByJobModelIdAndPhase(workflowJob.getModelId(), approvalResult.getOverrulePhase());
				if (null == overruleWorkflowTaskModel) {
					throw new IllegalArgumentException("the ");
				}
				if (overruleWorkflowTaskModel.getPhase() > flowTask.getPhase()) {
					throw new IllegalArgumentException("the ");
				}
				nextFlowTask = FlowUtils.newFlowTask(overruleWorkflowTaskModel, flowTask.getFlowJobId(),
						approvalResult.getUserId());
			} else {
				throw new IllegalStateException(String.format(
						"This approvalResult's status[%s] of flowTask[%s][%s] is illegal", approvalResult.getStatus(),
						approvalResult.getFlowTaskId(), approvalResult.getStatus()));
			}
			flowTask.setStatus(approvalResult.getStatus());
			flowTask.setInnerOpinion(approvalResult.getInnerOpinion());
			flowTask.setOuterOpinion(approvalResult.getOuterOpinion());
			flowTask.setUpdateDate(new Date());
			return nextFlowTask;
		}
	};

	/** 通过 **/
	private TaskStatusMachine PASS = new TaskStatusMachine() {
		@Override
		public FlowTask process(WorkflowJob workflowJob,FlowTask flowTask,FlowTaskResult approvalResult) {
			throw new UnsupportedOperationException(
					String.format("No operation is supported when the flowTask[%s]'s status[%s] of flowJob[%s]",
							flowTask.getId(), PASS, workflowJob.getId()));
		}
	};

	/** 转移 **/
	private TaskStatusMachine TRANSFER = new TaskStatusMachine() {
		@Override
		public FlowTask process(WorkflowJob workflowJob,FlowTask flowTask,FlowTaskResult approvalResult) {
			if (JobStatus.STARTED != workflowJob.getStatus()) {
				throw new UnsupportedOperationException(
						String.format("No operation is supported when the flowTask[%s]'s status[%s] of flowJob[%s]",
								flowTask.getId(), PASS, workflowJob.getId()));
			}
			if (TaskStatus.PENDING != flowTask.getStatus()) {
				throw new UnsupportedOperationException(
						String.format("No operation is supported when the flowTask[%s]'s status[%s] of flowJob[%s]",
								flowTask.getId(), PASS, workflowJob.getId()));
			}
			flowTask.setStatus(TaskStatus.TRANSFER);
			flowTask.setUpdateDate(new Date());
			return FlowUtils.copyFlowTask(flowTask, approvalResult.getUserId());
		}
	};

	/** 拒绝 **/
	private TaskStatusMachine REJECT = new TaskStatusMachine() {
		@Override
		public FlowTask process(WorkflowJob workflowJob,FlowTask flowTask,FlowTaskResult approvalResult) {
			throw new UnsupportedOperationException(
					String.format("No operation is supported when the flowTask[%s]'s status[%s] of flowJob[%s]",
							flowTask.getId(), REJECT, workflowJob.getId()));
		}
	};

	/** 驳回 **/
	private TaskStatusMachine OVERRULE = new TaskStatusMachine() {
		@Override
		public FlowTask process(WorkflowJob workflowJob,FlowTask flowTask,FlowTaskResult approvalResult) {
			throw new UnsupportedOperationException(
					String.format("No operation is supported when the flowTask[%s]'s status[%s] of flowJob[%s]",
							flowTask.getId(), OVERRULE, workflowJob.getId()));
		}
	};

	/** 挂起 **/
	private TaskStatusMachine HANG_UP = new TaskStatusMachine() {
		@Override
		public FlowTask process(WorkflowJob workflowJob,FlowTask flowTask,FlowTaskResult approvalResult) {
			TaskStatus next = approvalResult.getStatus();
			if (TaskStatus.POOLING == next || TaskStatus.PENDING == next) {
				flowTask.setStatus(next);
			}
			return null;
		}
	};
}
