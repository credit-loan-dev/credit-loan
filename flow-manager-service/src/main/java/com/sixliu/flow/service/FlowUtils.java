package com.sixliu.flow.service;

import java.util.Date;

import com.sixliu.flow.FlowJob;
import com.sixliu.flow.FlowJobModel;
import com.sixliu.flow.FlowTask;
import com.sixliu.flow.FlowTaskModel;
import com.sixliu.flow.JobStatus;
import com.sixliu.flow.TaskStatus;

/**
 * @author:MG01867
 * @date:2018年7月23日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
public class FlowUtils{
	
	public static FlowJob newFlowJob(FlowJobModel flowJobModel,String createUserId) {
		FlowJob flowJob = new FlowJob();
		flowJob.setCreateUserId(createUserId);
		flowJob.setStatus(JobStatus.STARTED);
		flowJob.setUpdateDate(new Date());
		return flowJob;
	}

	public static FlowTask newFlowTask(FlowTaskModel flowTaskModel, String flowJobId,
			String userId) {
		FlowTask flowTask = new FlowTask();
		flowTask.setFlowTaskModelId(flowTaskModel.getId());
		flowTask.setFlowJobId(flowJobId);
		flowTask.setPhase(flowTaskModel.getPhase());
		flowTask.setStatus(TaskStatus.POOLING);
		flowTask.setType(flowTaskModel.getType());
		flowTask.setWorker(flowTaskModel.getWorker());
		Date nowDate = new Date();
		flowTask.setCreateDate(nowDate);
		flowTask.setUpdateDate(nowDate);
		flowTask.setCreateUserId(userId);
		return flowTask;
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
