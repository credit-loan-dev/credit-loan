package com.sixliu.creditloan.workflow.util;

import java.util.Date;

import com.sixliu.creditloan.workflow.constant.JobStatus;
import com.sixliu.creditloan.workflow.constant.TaskStatus;
import com.sixliu.creditloan.workflow.dto.FlowTask;
import com.sixliu.creditloan.workflow.entity.WorkflowJob;
import com.sixliu.creditloan.workflow.entity.WorkflowJobModel;
import com.sixliu.creditloan.workflow.entity.WorkflowTask;
import com.sixliu.creditloan.workflow.entity.WorkflowTaskModel;

/**
 * @author:MG01867
 * @date:2018年7月23日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
public class FlowUtils{
	
	public static WorkflowJob newWorkflowJob(WorkflowJobModel workflowJobModel,String createUserId) {
		WorkflowJob workflowJob = new WorkflowJob();
		workflowJob.setName(workflowJobModel.getName());
		workflowJob.setModelId(workflowJobModel.getId());
		workflowJob.setStatus(JobStatus.STARTED);
		workflowJob.setCreateUserId(createUserId);
		workflowJob.setUpdateUserId(createUserId);
		return workflowJob;
	}

	public static WorkflowTask newWorkflowTask(WorkflowTaskModel workflowTaskModel, String jobId,
			String userId) {
		WorkflowTask workflowTask = new WorkflowTask();
		workflowTask.setName(workflowTaskModel.getName());
		workflowTask.setJobId(jobId);
		workflowTask.setModelId(workflowTaskModel.getId());
		workflowTask.setPhase(workflowTaskModel.getPhase());
		workflowTask.setStatus(TaskStatus.POOLING);
		workflowTask.setType(workflowTaskModel.getType());
		workflowTask.setWorker(workflowTaskModel.getWorker());
		workflowTask.setCreateUserId(userId);
		workflowTask.setUpdateUserId(userId);
		return workflowTask;
	}
	
	public static FlowTask copyFlowTask(FlowTask flowTask,String userId) {
		FlowTask newFlowTask = new FlowTask();
		newFlowTask.setFlowTaskModelId(flowTask.getFlowTaskModelId());
		newFlowTask.setFlowJobId(flowTask.getFlowJobId());
		newFlowTask.setPhase(flowTask.getPhase());
		newFlowTask.setStatus(TaskStatus.POOLING);
		newFlowTask.setType(flowTask.getType());
		newFlowTask.setWorker(flowTask.getWorker());
		Date nowDate = new Date();
		newFlowTask.setCreateDate(nowDate);
		newFlowTask.setUpdateDate(nowDate);
		newFlowTask.setCreateUserId(userId);
		return newFlowTask;
	}
}
