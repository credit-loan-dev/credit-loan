package com.sixliu.flow.status;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sixliu.flow.ApprovalResult;
import com.sixliu.flow.JobStatus;
import com.sixliu.flow.TaskStatus;
import com.sixliu.flow.dao.FlowTaskClassDao;
import com.sixliu.flow.entity.FlowJob;
import com.sixliu.flow.entity.FlowTask;
import com.sixliu.flow.entity.FlowTaskClass;
import com.sixliu.flow.service.FlowUtils;

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
	private FlowTaskClassDao flowTaskClassDao;

	public TaskStatusMachine get(TaskStatus taskStatus) {
		if (TaskStatus.POOLING == taskStatus) {
			return POOLING;
		} else if (TaskStatus.PENDING == taskStatus) {
			return PENDING;
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
				@NonNull ApprovalResult approvalResult) {
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
				@NonNull ApprovalResult approvalResult) {
			TaskStatus next = approvalResult.getStatus();
			FlowTask nextFlowTask = null;
			if (TaskStatus.PASS == next) {
				FlowTaskClass nextFlowTaskClass = flowTaskClassDao
						.getByflowJobClassAndPhase(flowJob.getFlowJobModelId(), flowTask.getPhase() + 1);
				if (null != nextFlowTaskClass) {
					nextFlowTask = FlowUtils.newFlowTask(nextFlowTaskClass, flowTask.getFlowJobId(),
							approvalResult.getChannel(), approvalResult.getUserId());
				} else {
					flowJob.setStatus(JobStatus.PASS_ENDED);
					flowJob.setUpdateDate(new Date());
				}
			} else if (TaskStatus.REJECT == next) {
				flowJob.setStatus(JobStatus.REJECT_ENDED);
				flowJob.setUpdateDate(new Date());
			} else if (TaskStatus.HANG_UP == next) {

			} else if (TaskStatus.OVERRULE == next) {
				FlowTaskClass overruleFlowTaskClass = flowTaskClassDao
						.getByflowJobClassAndPhase(flowJob.getFlowJobModelId(), approvalResult.getOverrulePhase());
				if (null == overruleFlowTaskClass) {
					throw new IllegalArgumentException("the ");
				}
				if (overruleFlowTaskClass.getPhase() > flowTask.getPhase()) {
					throw new IllegalArgumentException("the ");
				}
				nextFlowTask = FlowUtils.newFlowTask(overruleFlowTaskClass, flowTask.getFlowJobId(),
						approvalResult.getChannel(), approvalResult.getUserId());
			} else {
				throw new IllegalStateException(String.format(
						"This approvalResult's status[%s] of flowTask[%s][%s] is illegal", approvalResult.getStatus(),
						approvalResult.getFlowTaskId(), approvalResult.getStatus()));
			}
			flowTask.setStatus(approvalResult.getStatus());
			flowTask.setInnerOpinion(approvalResult.getInnerOpinion());
			flowTask.setOuterOpinion(approvalResult.getOuterOpinion());
			flowTask.setEndDate(new Date());
			return nextFlowTask;
		}
	};

	/** 通过 **/
	private TaskStatusMachine PASS = new TaskStatusMachine() {
		@Override
		public FlowTask process(@NonNull FlowJob flowJob, @NonNull FlowTask flowTask,
				@NonNull ApprovalResult approvalResult) {
			throw new UnsupportedOperationException(
					String.format("No operation is supported when the flowTask[%s]'s status[%s] of flowJob[%s]",
							flowTask.getId(), PASS, flowJob.getId()));
		}
	};

	/** 拒绝 **/
	private TaskStatusMachine REJECT = new TaskStatusMachine() {
		@Override
		public FlowTask process(@NonNull FlowJob flowJob, @NonNull FlowTask flowTask,
				@NonNull ApprovalResult approvalResult) {
			throw new UnsupportedOperationException(
					String.format("No operation is supported when the flowTask[%s]'s status[%s] of flowJob[%s]",
							flowTask.getId(), REJECT, flowJob.getId()));
		}
	};

	/** 驳回 **/
	private TaskStatusMachine OVERRULE = new TaskStatusMachine() {
		@Override
		public FlowTask process(@NonNull FlowJob flowJob, @NonNull FlowTask flowTask,
				@NonNull ApprovalResult approvalResult) {
			throw new UnsupportedOperationException(
					String.format("No operation is supported when the flowTask[%s]'s status[%s] of flowJob[%s]",
							flowTask.getId(), OVERRULE, flowJob.getId()));
		}
	};

	/** 挂起 **/
	private TaskStatusMachine HANG_UP = new TaskStatusMachine() {
		@Override
		public FlowTask process(@NonNull FlowJob flowJob, @NonNull FlowTask flowTask,
				@NonNull ApprovalResult approvalResult) {
			TaskStatus next = approvalResult.getStatus();
			if (TaskStatus.POOLING == next || TaskStatus.PENDING == next) {
				flowTask.setStatus(next);
			}
			return null;
		}
	};
}
