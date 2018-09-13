package com.sixliu.creditloan.workflow.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sixliu.creditloan.workflow.BaseTest;
import com.sixliu.creditloan.workflow.constant.TaskType;
import com.sixliu.creditloan.workflow.entity.WorkflowTaskModel;

/**
*@author:MG01867
*@date:2018年9月6日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
public class WorkflowTaskModelDaoTest  extends BaseTest{

	@Autowired
	WorkflowTaskModelDao workflowTaskModelDao;
	
	@Test
	public void testInsert() {
		for(int i=0;i<5;i++) {
			WorkflowTaskModel workflowTaskModel=new WorkflowTaskModel();
			workflowTaskModel.setName("test"+i);
			workflowTaskModel.setJobId("a50d9f82-b1e9-11e8-8bec-000c29851249");
			workflowTaskModel.setPhase(i);
			workflowTaskModel.setType(TaskType.MANUAL);
			workflowTaskModel.setWorker("sixliu");
			workflowTaskModel.setRemarks("remarks");
			workflowTaskModel.setCreateUserId("sixliu");
			workflowTaskModel.setUpdateUserId("sixliu");
			workflowTaskModelDao.insert(workflowTaskModel);
		}
		checkOk(null);
	}

}
