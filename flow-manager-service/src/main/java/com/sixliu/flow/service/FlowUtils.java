package com.sixliu.flow.service;

import java.util.Date;

import com.sixliu.flow.JobStatus;
import com.sixliu.flow.TaskStatus;
import com.sixliu.flow.entity.FlowJob;
import com.sixliu.flow.entity.FlowJobClass;
import com.sixliu.flow.entity.FlowTask;
import com.sixliu.flow.entity.FlowTaskClass;

/**
 * @author:MG01867
 * @date:2018年7月23日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
public class FlowUtils{
	
	public static FlowJob newFlowJob(FlowJobClass flowJobClass, String flowJobId) {
		FlowJob flowJob = new FlowJob();
		flowJob.setId(flowJobId);
		flowJob.setStatus(JobStatus.STARTED);
		Date nowDate = new Date();
		flowJob.setStartDate(nowDate);
		flowJob.setEndDate(nowDate);
		return flowJob;
	}

	public static FlowTask newFlowTask(FlowTaskClass flowTaskClass, String flowJobId,String channel,
			String userId) {
		FlowTask flowTask = new FlowTask();
		flowTask.setFlowTaskModelId(flowTaskClass.getId());
		flowTask.setFlowJobId(flowJobId);
		flowTask.setPhase(flowTaskClass.getPhase());
		flowTask.setStatus(TaskStatus.POOLING);
		flowTask.setType(flowTaskClass.getType());
		flowTask.setWorker(flowTaskClass.getWorker());
		Date nowDate = new Date();
		flowTask.setStartDate(nowDate);
		flowTask.setEndDate(nowDate);
		flowTask.setChannel(channel);
		flowTask.setCreateUserId(userId);
		return flowTask;
	}
}
