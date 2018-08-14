package com.sixliu.flow.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:MG01867
 * @date:2018年8月13日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 流程管理
 */
@FeignClient("flow-manager")
@RestController
public interface FlowManagerClient {

	@RequestMapping(value = "/product/inner/get", method = RequestMethod.POST)
	String createFlowJob();

}