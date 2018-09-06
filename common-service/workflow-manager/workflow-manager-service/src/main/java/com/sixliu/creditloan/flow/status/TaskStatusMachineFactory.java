package com.sixliu.creditloan.flow.status;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sixliu.creditloan.flow.constant.JobStatus;
import com.sixliu.creditloan.flow.constant.TaskStatus;
import com.sixliu.creditloan.flow.dao.FlowTaskModelDao;
import com.sixliu.creditloan.flow.dto.FlowJob;
import com.sixliu.creditloan.flow.dto.FlowTask;
import com.sixliu.creditloan.flow.dto.FlowTaskModel;
import com.sixliu.creditloan.flow.dto.FlowTaskResult;
import com.sixliu.creditloan.flow.util.FlowUtils;

import lombok.NonNull;

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
	private FlowTaskModelDao flowTaskModelDao;

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
		public FlowTask process(@NonNull FlowJob flowJob, @NonNull FlowTask flowTask,
				@NonNull FlowTaskResult approvalResult) {
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
		public FlowTask process(@NonNull FlowJob flowJob, @NonNull FlowTask flowTask,
				@NonNull FlowTaskResult approvalResult) {
			TaskStatus next = approvalResult.getStatus();
			FlowTask nextFlowTask = null;
			if (TaskStatus.PASS == next) {
				FlowTaskModel nextFlowTaskModel = flowTaskModelDao
						.getByflowJobModelAndPhase(flowJob.getFlowJobModelId(), flowTask.getPhase() + 1);
				if (null != nextFlowTaskModel) {
					nextFlowTask = FlowUtils.newFlowTask(nextFlowTaskModel, flowTask.getFlowJobId(),
							approvalResult.getUserId());
				} else {
					flowJob.setStatus(JobStatus.PASS_ENDED);
					flowJob.setUpdateDate(new Date());
				}
			} else if (TaskStatus.REJECT == next) {
				flowJob.setStatus(JobStatus.REJECT_ENDED);
				flowJob.setUpdateDate(new Date());
			} else if (TaskStatus.HANG_UP == next) {

			} else if (TaskStatus.OVERRULE == next) {
				FlowTaskModel overruleFlowTaskModel = flowTaskModelDao
						.getByflowJobModelAndPhase(flowJob.getFlowJobModelId(), approvalResult.getOverrulePhase());
				if (null == overruleFlowTaskModel) {
					throw new IllegalArgumentException("the ");
				}
				if (overruleFlowTaskModel.getPhase() > flowTask.getPhase()) {
					throw new IllegalArgumentException("the ");
				}
				nextFlowTask = FlowUtils.newFlowTask(overruleFlowTaskModel, flowTask.getFlowJobId(),
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
		public FlowTask process(@NonNull FlowJob flowJob, @NonNull FlowTask flowTask,
				@NonNull FlowTaskResult approvalResult) {
			throw new UnsupportedOperationException(
					String.format("No operation is supported when the flowTask[%s]'s status[%s] of flowJob[%s]",
							flowTask.getId(), PASS, flowJob.getId()));
		}
	};

	/** 转移 **/
	private TaskStatusMachine TRANSFER = new TaskStatusMachine() {
		@Override
		public FlowTask process(@NonNull FlowJob flowJob, @NonNull FlowTask flowTask,
				@NonNull FlowTaskResult approvalResult) {
			if (JobStatus.STARTED != flowJob.getStatus()) {
				throw new UnsupportedOperationException(
						String.format("No operation is supported when the flowTask[%s]'s status[%s] of flowJob[%s]",
								flowTask.getId(), PASS, flowJob.getId()));
			}
			if (TaskStatus.PENDING != flowTask.getStatus()) {
				throw new UnsupportedOperationException(
						String.format("No operation is supported when the flowTask[%s]'s status[%s] of flowJob[%s]",
								flowTask.getId(), PASS, flowJob.getId()));
			}
			flowTask.setStatus(TaskStatus.TRANSFER);
			flowTask.setUpdateDate(new Date());
			return FlowUtils.copyFlowTask(flowTask, approvalResult.getUserId());
		}
	};

	/** 拒绝 **/
	private TaskStatusMachine REJECT = new TaskStatusMachine() {
		@Override
		public FlowTask process(@NonNull FlowJob flowJob, @NonNull FlowTask flowTask,
				@NonNull FlowTaskResult approvalResult) {
			throw new UnsupportedOperationException(
					String.format("No operation is supported when the flowTask[%s]'s status[%s] of flowJob[%s]",
							flowTask.getId(), REJECT, flowJob.getId()));
		}
	};

	/** 驳回 **/
	private TaskStatusMachine OVERRULE = new TaskStatusMachine() {
		@Override
		public FlowTask process(@NonNull FlowJob flowJob, @NonNull FlowTask flowTask,
				@NonNull FlowTaskResult approvalResult) {
			throw new UnsupportedOperationException(
					String.format("No operation is supported when the flowTask[%s]'s status[%s] of flowJob[%s]",
							flowTask.getId(), OVERRULE, flowJob.getId()));
		}
	};

	/** 挂起 **/
	private TaskStatusMachine HANG_UP = new TaskStatusMachine() {
		@Override
		public FlowTask process(@NonNull FlowJob flowJob, @NonNull FlowTask flowTask,
				@NonNull FlowTaskResult approvalResult) {
			TaskStatus next = approvalResult.getStatus();
			if (TaskStatus.POOLING == next || TaskStatus.PENDING == next) {
				flowTask.setStatus(next);
			}
			return null;
		}
	};
}
