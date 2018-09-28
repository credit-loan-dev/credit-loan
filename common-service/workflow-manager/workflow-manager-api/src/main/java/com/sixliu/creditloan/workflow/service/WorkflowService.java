package com.sixliu.creditloan.workflow.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sixliu.creditloan.workflow.WorkflowManagerApi;

/**
 * @author: sixliu
 * @email: 359852326@qq.com
 * @date: 2018年9月7日 下午8:18:45
 * @version V1.0
 * @description:
 */
@FeignClient(WorkflowManagerApi.SERVICE_NAME)
@Validated
public interface WorkflowService {

	String URL_PRE = "check";

	@RequestMapping(value = "/"+URL_PRE + "/{uuid}", method = RequestMethod.GET)
	@ResponseBody
	boolean check(@PathVariable("uuid") String uuid);

	String getUrl();
}
