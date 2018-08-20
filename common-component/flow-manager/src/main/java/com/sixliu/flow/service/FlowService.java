package com.sixliu.flow.service;

import java.util.List;

import com.sixliu.flow.FlowTask;
import com.sixliu.flow.FlowTaskResult;
import com.sixliu.flow.TaskStatus;

/**
 * @author:MG01867
 * @date:2018年7月6日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 流程管理
 */
public interface FlowService {

	String createFlowJob(String flowJobModelId,String userId);

	List<FlowTask> listFlowTask(String userId);
	
	List<FlowTask> listFlowTask(String userId, TaskStatus status);

	String autoClaimFlowTask(String userId);

	void submitFlowTask(FlowTaskResult approvalResult);

	void cancelFlowJob(String flowJobId, String userId);

}
