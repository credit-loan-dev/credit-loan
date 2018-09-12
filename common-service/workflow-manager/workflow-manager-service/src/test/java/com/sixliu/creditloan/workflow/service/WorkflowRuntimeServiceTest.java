package com.sixliu.creditloan.workflow.service;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sixliu.creditloan.workflow.BaseTest;
import com.sixliu.creditloan.workflow.dto.FlowTask;

/**
*@author:MG01867
*@date:2018年9月12日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
public class WorkflowRuntimeServiceTest extends BaseTest {

	@Autowired
	private WorkflowRuntimeService workflowRuntimeService;
	
	
	@Test
	public void testCreateJob(){
		String jobId=workflowRuntimeService.createJob("940659f0-b1ca-11e8-9e01-005056986f0b", "sixliu");
		checkOk(jobId);
	}
	
	@Test
	public void testListTaskByUserId(){
		List<FlowTask> tasks=workflowRuntimeService.listTaskByUserId("sixliu");
		checkOk(tasks);
	}
}
