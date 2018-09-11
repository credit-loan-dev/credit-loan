package com.sixliu.creditloan.workflow.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sixliu.creditloan.workflow.BaseTest;
import com.sixliu.creditloan.workflow.entity.WorkflowTaskModel;
import com.sixliu.creditloan.workflow.entity.WorkflowTaskWorkerModel;

/**
*@author:MG01867
*@date:2018年9月11日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
public class WorkflowTaskWorkerModelDaoTest extends BaseTest{

	@Autowired
	WorkflowTaskModelDao workflowTaskModelDao;
	
	@Autowired
	WorkflowTaskWorkerModelDao workflowTaskWorkerModelDao;
	
	@Test
	public void testInsert() {
		WorkflowTaskModel workflowTaskModel=workflowTaskModelDao.get("bed5fc39-b1cd-11e8-9e01-005056986f0b");
		WorkflowTaskWorkerModel workflowTaskWorkerModel=new WorkflowTaskWorkerModel();
		workflowTaskWorkerModel.setName("调用风控");
		workflowTaskWorkerModel.setTaskId(workflowTaskModel.getId());
		workflowTaskWorkerModel.setUrl("url");
		workflowTaskWorkerModel.setCheckInterval(3000);
		workflowTaskWorkerModel.setRemarks("remarks");
		workflowTaskWorkerModel.setCreateUserId("sixliu");
		workflowTaskWorkerModel.setUpdateUserId("sixliu");
		int result=workflowTaskWorkerModelDao.insert(workflowTaskWorkerModel);
		checkOk(result);
	}
	
	@Test
	public void testGet() {
		WorkflowTaskWorkerModel workflowTaskWorkerModel=workflowTaskWorkerModelDao.get("908cd001-b599-11e8-9e01-005056986f0b");
		checkOk(workflowTaskWorkerModel);
	}
	
	@Test
	public void testGetByTaskId() {
		WorkflowTaskWorkerModel workflowTaskWorkerModel=workflowTaskWorkerModelDao.getByTaskId("bed5fc39-b1cd-11e8-9e01-005056986f0b");
		checkOk(workflowTaskWorkerModel);
	}
}
