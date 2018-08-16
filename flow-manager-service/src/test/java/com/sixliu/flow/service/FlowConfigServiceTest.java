package com.sixliu.flow.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sixliu.flow.BaseTest;
import com.sixliu.flow.TaskType;
import com.sixliu.flow.dto.FlowTaskModelDTO;

/**
*@author:MG01867
*@date:2018年8月15日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
public class FlowConfigServiceTest extends BaseTest{

	@Autowired
	private FlowConfigService flowConfigService;

	@Test
	public void testAddFlowTaskModel() {
		FlowTaskModelDTO flowTaskModelDTO =new FlowTaskModelDTO();
		flowTaskModelDTO.setName("test");
		flowTaskModelDTO.setType(TaskType.AUTO);
		flowTaskModelDTO.setWorker("worker");
		flowTaskModelDTO.setCreateUserId("sixliu");
		flowConfigService.addFlowTaskModel(flowTaskModelDTO);
	}
}
