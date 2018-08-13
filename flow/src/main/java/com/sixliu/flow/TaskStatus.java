package com.sixliu.flow;

import java.util.Date;

import com.sixliu.flow.core.FlowUtils;
import com.sixliu.flow.entity.FlowJob;
import com.sixliu.flow.entity.FlowTask;
import com.sixliu.flow.entity.FlowTaskModel;

import lombok.NonNull;

/**
 * @author:MG01867
 * @date:2018年7月6日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 流程作业任务状态机
 */
public enum TaskStatus {

	NONE() {
		@Override
		public FlowTask process(@NonNull FlowJob flowJob, @NonNull FlowTask flowTask,
				@NonNull ApprovalResult approvalResult, @NonNull FlowTaskModelGetter flowTaskModelGetter) {
			throw new UnsupportedOperationException(
					String.format("No operation is supported when the flowTask[%s]'s status[%s] of flowJob[%s]",
							flowTask.getId(),NONE, flowJob.getId()));
		}
	},
	
	/** 待认领 **/
	POOLING() {
		@Override
		public FlowTask process(@NonNull FlowJob flowJob, @NonNull FlowTask flowTask,
				@NonNull ApprovalResult approvalResult, @NonNull FlowTaskModelGetter flowTaskModelGetter) {
			if (PENDING != approvalResult.getStatus()) {
				throw new IllegalStateException(String.format(
						"This approvalResult's status[%s] of flowTask[%s][%s] is illegal", approvalResult.getStatus(),
						approvalResult.getFlowTaskId(), approvalResult.getStatus()));
			}
			flowTask.setStatus(approvalResult.getStatus());
			flowTask.setOwnerUserId(approvalResult.getUserId());
			return null;
		}
	},
	/** 待处理 **/
	PENDING() {
		@Override
		public FlowTask process(@NonNull FlowJob flowJob, @NonNull FlowTask flowTask,
				@NonNull ApprovalResult approvalResult, @NonNull FlowTaskModelGetter flowTaskModelGetter) {
			TaskStatus next = approvalResult.getStatus();
			FlowTask nextFlowTask = null;
			if (PASS == next) {
				FlowTaskModel nextFlowTaskModel = flowTaskModelGetter.getNext(flowJob.getFlowJobModelId(),
						flowTask.getFlowTaskModelId());
				if (null != nextFlowTaskModel) {
					nextFlowTask = FlowUtils.newFlowTask(nextFlowTaskModel, flowTask.getFlowJobId(),
							flowTaskModelGetter.generateFlowTaskId(), approvalResult.getChannel(),
							approvalResult.getUserId());
				} else {
					flowJob.setStatus(JobStatus.PASS_ENDED);
					flowJob.setEndDate(new Date());
				}
			} else if (REJECT == next) {
				flowJob.setStatus(JobStatus.REJECT_ENDED);
				flowJob.setEndDate(new Date());
			} else if (HANG_UP == next) {

			} else if (OVERRULE == next) {
				FlowTaskModel overruleflowTaskModel = flowTaskModelGetter.get(flowJob.getFlowJobModelId(),
						approvalResult.getOverrulePhase());
				if (null == overruleflowTaskModel) {
					throw new IllegalArgumentException("the ");
				}
				if (overruleflowTaskModel.getPhase() >flowTask.getPhase()) {
					throw new IllegalArgumentException("the ");
				}
				nextFlowTask = FlowUtils.newFlowTask(overruleflowTaskModel, flowTask.getFlowJobId(),
						flowTaskModelGetter.generateFlowTaskId(), approvalResult.getChannel(),
						approvalResult.getUserId());
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
	},
	/** 通过 **/
	PASS() {
		@Override
		public FlowTask process(@NonNull FlowJob flowJob, @NonNull FlowTask flowTask,
				@NonNull ApprovalResult approvalResult, @NonNull FlowTaskModelGetter flowTaskModelGetter) {
			throw new UnsupportedOperationException(
					String.format("No operation is supported when the flowTask[%s]'s status[%s] of flowJob[%s]",
							flowTask.getId(), PASS, flowJob.getId()));
		}
	},
	/** 拒绝 **/
	REJECT() {
		@Override
		public FlowTask process(@NonNull FlowJob flowJob, @NonNull FlowTask flowTask,
				@NonNull ApprovalResult approvalResult, @NonNull FlowTaskModelGetter flowTaskModelGetter) {
			throw new UnsupportedOperationException(
					String.format("No operation is supported when the flowTask[%s]'s status[%s] of flowJob[%s]",
							flowTask.getId(), REJECT, flowJob.getId()));
		}
	},
	/** 挂起 **/
	HANG_UP() {
		@Override
		public FlowTask process(@NonNull FlowJob flowJob, @NonNull FlowTask flowTask,
				@NonNull ApprovalResult approvalResult, @NonNull FlowTaskModelGetter getNextFlowTaskModel) {
			TaskStatus next = approvalResult.getStatus();
			if (POOLING == next || PENDING == next) {
				flowTask.setStatus(next);
			}
			return null;
		}
	},
	/** 驳回 **/
	OVERRULE() {
		@Override
		public FlowTask process(@NonNull FlowJob flowJob, @NonNull FlowTask flowTask,
				@NonNull ApprovalResult approvalResult, @NonNull FlowTaskModelGetter getNextFlowTaskModel) {
			throw new UnsupportedOperationException(
					String.format("No operation is supported when the flowTask[%s]'s status[%s] of flowJob[%s]",
							flowTask.getId(), OVERRULE, flowJob.getId()));
		}
	};

	public abstract FlowTask process(@NonNull FlowJob flowJob, @NonNull FlowTask flowTask,
			@NonNull ApprovalResult approvalResult, @NonNull FlowTaskModelGetter getNextFlowTaskModel);

	/**
	 * 流程作业任务模型Getter
	 * 
	 * @author MG01867
	 *
	 */
	public interface FlowTaskModelGetter {

		/**
		 * 生成流程作业任务id
		 * 
		 * @return
		 */
		String generateFlowTaskId();

		/**
		 * 通过流程作业模型id和流程作业任务模型id获取下一个流程作业任务模型
		 * 
		 * @param flowJobModelId
		 *            流程作业模型id
		 * @param flowTaskModelId
		 *            流程作业任务模型id
		 * @return
		 */
		FlowTaskModel getNext(String flowJobModelId, String flowTaskModelId);

		/**
		 * 通过流程作业模型id和指定阶段获取流程作业任务模型
		 * 
		 * @param flowJobModelId
		 *            流程作业模型id
		 * @param phase
		 *            指定阶段
		 * @return
		 */
		FlowTaskModel get(String flowJobModelId, int phase);
	}

}
