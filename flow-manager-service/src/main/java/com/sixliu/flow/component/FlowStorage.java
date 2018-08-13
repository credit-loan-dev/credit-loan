package com.sixliu.flow.component;

import java.util.List;

import com.sixliu.flow.entity.FlowInputDataModel;
import com.sixliu.flow.entity.FlowJob;
import com.sixliu.flow.entity.FlowTask;

/**
 * @author:MG01867
 * @date:2018年7月23日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 流程存储器
 */
public interface FlowStorage {

	/**
	 * 保存流程作业和流程作业第一个任务
	 * @param flowJob
	 * @param flowTask
	 */
	void insertFlowJob(FlowJob flowJob, FlowTask firstFlowTask);
	
	FlowJob getFlowJob(String flowJobId);
	
	FlowTask getFlowTask(String flowTaskId);
	
	void updateFlowTask(FlowTask flowTask);
	
	List<FlowInputDataModel> listFlowInputDataModel(String flowJobModelId,String flowTaskModelId);
}
