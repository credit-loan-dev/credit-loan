package com.sixliu.creditloan.credit.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
*@author:MG01867
*@date:2018年8月7日
*@E-mail:359852326@qq.com
*@version:
*@describe 授信办公服务:面向工作用户
*/
@FeignClient("credit")
@RequestMapping("/credit/office")
public interface CreditOfficeService {

	/**
	 * 根据当前用户id获取 授信任务池中的任务
	 * @param userId
	 * @return
	 */
	List<String> listTaskFromPooling(String userId);
	
	/**
	 * 根据当前用户id 自动认领授信任务
	 * @param userId
	 * @return
	 */
	String autoClaimFlowTask(String userId);
	
	/**
	 * 提交授信任务审批结果
	 * @param taskResult
	 */
	void submitTaskResult(String taskResult);
}
