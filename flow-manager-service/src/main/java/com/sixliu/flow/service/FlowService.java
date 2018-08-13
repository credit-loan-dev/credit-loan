package com.sixliu.flow.service;

import java.util.List;

import com.sixliu.flow.ApprovalResult;
import com.sixliu.flow.cto.CreateFlowJobDTO;
import com.sixliu.flow.entity.FlowTask;

/**
*@author:MG01867
*@date:2018年7月6日
*@E-mail:359852326@qq.com
*@version:
*@describe 流程管理
*/
public interface FlowService {

	/**
	 * 创建流程作业
	 * @param createFlowJob
	 * @return 返回已创建的流程作业id
	 */
	String createFlowJob(CreateFlowJobDTO createFlowJob);
	
	/**
	 * 通过流程任务审批用户id从任务池中获取任务
	 * @param userId
	 * @return
	 */
	List<FlowTask> listFlowTaskFromPool(String userId);

	/**
	 * 认领待处理订单审核流程任务
	 * 
	 * @param userId
	 * @param taskId
	 */
	void claimFlowTask(String taskId,String userId);

	/**
	 * 自动认领待处理订单审核流程任务
	 * 
	 * @param userId
	 * @param taskId
	 */
	String autoClaimFlowTask(String userId);

	/**
	 * 提交订单审核流程任务处理结果
	 * 
	 * @param result
	 *            订单审核流程任务处理结果
	 */
	void submitApprovalResult(ApprovalResult approvalResult);
	
	void cancelFlowJob(String flowJobId,String userId);
	
}
