package com.sixliu.flow.service;

import java.util.List;

import com.sixliu.flow.ApprovalResult;
import com.sixliu.flow.TaskStatus;
import com.sixliu.flow.dto.CreateFlowJobDTO;
import com.sixliu.flow.entity.FlowTask;

/**
 * @author:MG01867
 * @date:2018年7月6日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 流程管理
 */
public interface FlowService {

	/**
	 * 创建流程作业
	 * 
	 * @param createFlowJob
	 * @return 返回已创建的流程作业id
	 */
	String createFlowJob(CreateFlowJobDTO createFlowJob);

	/**
	 * 通过用户id和流程任务状态 查询出流程任务集合
	 * 
	 * @param userId
	 *            用户id
	 * @param status
	 *            流程任务状态
	 * @return
	 */
	List<FlowTask> listByUserAndStatus(String userId, TaskStatus status);

	/**
	 * 认领待处理订单审核流程任务
	 * 
	 * @param userId
	 * @param taskId
	 */
	void claimFlowTask(String taskId, String userId);

	/**
	 * 自动认领待处理订单审核流程任务
	 * 
	 * @param userId
	 *            用户id
	 * @return 返回认领到的流程任务id
	 */
	String autoClaimFlowTask(String userId);

	/**
	 * 提交订单审核流程任务处理结果
	 * 
	 * @param result
	 *            订单审核流程任务处理结果
	 */
	void submitApprovalResult(ApprovalResult approvalResult);

	/**
	 * 取消流程job
	 * 
	 * @param flowJobId
	 * @param userId
	 */
	void cancelFlowJob(String flowJobId, String userId);

}
