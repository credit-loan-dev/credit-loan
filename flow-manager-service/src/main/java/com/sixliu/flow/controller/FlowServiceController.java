package com.sixliu.flow.controller;

import org.springframework.web.bind.annotation.RestController;

import com.sixliu.flow.api.FlowManagerClient;

/**
*@author:MG01867
*@date:2018年8月13日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
@RestController
public class FlowServiceController implements FlowManagerClient{

	@Override
	public String createFlowJob() {
		return null;
	}

}
