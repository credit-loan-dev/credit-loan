package com.sixliu.creditloan.workflow.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sixliu.creditloan.workflow.WorkflowManagerApi;

/**
*@author:MG01867
*@date:2018年9月6日
*@E-mail:359852326@qq.com
*@version:
*@describe 流程配置服务
*/
@FeignClient(WorkflowManagerApi.SERVICE_NAME)
@Validated
public interface WorkflowConfigService {

	/**
	 * 创建流程作业
	 * 
	 * @param jobModelId 作业模型id
	 * @param userId     当前操作用户
	 * @return 返回创建好的作业id
	 */
	@RequestMapping(value = "/runtime/createJob", method = RequestMethod.POST)
	@ResponseBody
	String createJob(String jobModelId, String userId);
}
