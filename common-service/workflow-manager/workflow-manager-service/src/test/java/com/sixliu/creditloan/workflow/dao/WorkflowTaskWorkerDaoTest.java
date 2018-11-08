package com.sixliu.creditloan.workflow.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sixliu.creditloan.workflow.BaseTest;
import com.sixliu.creditloan.workflow.entity.WorkflowTaskModel;
import com.sixliu.creditloan.workflow.entity.WorkflowTaskWorker;
import com.sixliu.workflow.constant.WorkerType;

/**
*@author:MG01867
*@date:2018年9月12日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
public class WorkflowTaskWorkerDaoTest extends BaseTest{

	@Autowired
	WorkflowTaskModelDao workflowTaskModelDao;
	
	@Autowired
	WorkflowTaskWorkerDao workflowTaskWorkerDao;
	
	@Test
	public void testInsert() {
		WorkflowTaskModel workflowTaskModel=workflowTaskModelDao.get("bed5fc39-b1cd-11e8-9e01-005056986f0b");
		WorkflowTaskWorker workflowTaskWorker=new WorkflowTaskWorker();
		workflowTaskWorker.setName("work");
		workflowTaskWorker.setTaskModelId(workflowTaskModel.getId());
		workflowTaskWorker.setTaskPhase(workflowTaskWorker.getTaskPhase());
		workflowTaskWorker.setCheckInterval(1000*60*5);
		workflowTaskWorker.setType(WorkerType.LOCAL_CLASS);
		workflowTaskWorker.setPath("path");
		workflowTaskWorker.setCreateUserId("sixliu");
		workflowTaskWorker.setUpdateUserId("sixliu");
		int result=workflowTaskWorkerDao.insert(workflowTaskWorker);
		checkOk(result);
	}
	
	@Test
	public void testGet() {
		WorkflowTaskWorker workflowTaskWorker=workflowTaskWorkerDao.get("212597d3-b630-11e8-9e01-005056986f0b");
		checkOk(workflowTaskWorker);
	}
	
	@Test
	public void testGetByTaskId() {
		WorkflowTaskWorker workflowTaskWorker=workflowTaskWorkerDao.getByTaskId("bed5fc39-b1cd-11e8-9e01-005056986f0b");
		checkOk(workflowTaskWorker);
	}
	
	@Test
	public void testListAll() {
		List<WorkflowTaskWorker> workflowTaskWorkers=workflowTaskWorkerDao.listAll();
		checkOk(workflowTaskWorkers);
	}

}
