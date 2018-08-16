package com.sixliu.flow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sixliu.flow.api.FlowManagerClient;
import com.sixliu.flow.dto.CreateFlowJobDTO;
import com.sixliu.flow.service.FlowService;

/**
*@author:MG01867
*@date:2018年8月13日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
@RestController
public class FlowServiceController implements FlowManagerClient{

	@Autowired
	private FlowService flowService;
	
	@Override
	@RequestMapping(value = "/product/inner/get", method = RequestMethod.POST)
	public String createFlowJob(CreateFlowJobDTO createFlowJob) {
		return flowService.createFlowJob(createFlowJob);
	}
	
	@Override
	@RequestMapping(value = "/product/inner/get", method = RequestMethod.POST)
	public String getFlowJob(String flowJobId,String userId) {
		return null;
	}

}
