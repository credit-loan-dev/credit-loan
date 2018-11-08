package com.sixliu.creditloan.workflow.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sixliu.creditloan.workflow.BaseTest;
import com.sixliu.creditloan.workflow.entity.WorkflowJobModel;

/**
*@author:MG01867
*@date:2018年9月6日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
public class WorkflowJobModelDaoTest extends BaseTest{

	@Autowired
	WorkflowJobModelDao workflowJobModelDao;
	
	@Test
	public void testInsert() {
		WorkflowJobModel workflowJobModel=new WorkflowJobModel();
		workflowJobModel.setName("test");
		workflowJobModel.setCreateRoleId("sixliu");
		workflowJobModel.setCreateUserId("sixliu");
		workflowJobModel.setUpdateUserId("sixliu");
		int result=workflowJobModelDao.insert(workflowJobModel);
		checkOk(result);
	}
	
	@Test
	public void testGet() {
		WorkflowJobModel workflowJobModel=workflowJobModelDao.get("940659f0-b1ca-11e8-9e01-005056986f0b");
		checkOk(workflowJobModel);
	}
}
