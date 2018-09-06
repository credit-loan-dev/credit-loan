package com.sixliu.creditloan.flow.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;

import com.sixliu.creditloan.flow.constant.TaskStatus;
import com.sixliu.creditloan.flow.dto.FlowTask;
import com.sixliu.creditloan.flow.dto.FlowTaskResult;

/**
 * @author:MG01867
 * @date:2018年7月6日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 流程管理
 */
@FeignClient("product-manager")
@Validated
public interface WorkflowRuntimeService {

	String createFlowJob(String flowJobModelId,String userId);

	List<FlowTask> listFlowTask(String userId);
	
	List<FlowTask> listFlowTask(String userId, TaskStatus status);

	String autoClaimFlowTask(String userId);

	void submitFlowTask(FlowTaskResult approvalResult);

	void cancelFlowJob(String flowJobId, String userId);

}
