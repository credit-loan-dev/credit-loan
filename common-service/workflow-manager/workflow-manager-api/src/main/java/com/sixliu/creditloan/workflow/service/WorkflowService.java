package com.sixliu.creditloan.workflow.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sixliu.creditloan.workflow.WorkflowManagerApi;

/**
 * @author: sixliu
 * @email: 359852326@qq.com
 * @date: 2018年9月7日 下午8:18:45
 * @version V1.0
 * @Description:TODO
 */
@FeignClient(WorkflowManagerApi.SERVICE_NAME)
@Validated
public interface WorkflowService {

	String PATH = "/getUUID";

	String UUID=java.util.UUID.randomUUID().toString();
	
	@RequestMapping(value = PATH, method = RequestMethod.GET)
	@ResponseBody
	default String getUUID() {
		return UUID;
	}
}
