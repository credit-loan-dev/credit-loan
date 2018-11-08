package com.sixliu.creditloan.workflow.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sixliu.creditloan.workflow.BaseTest;
import com.sixliu.creditloan.workflow.entity.WorkflowJob;
import com.sixliu.workflow.constant.JobStatus;

/**
*@author:MG01867
*@date:2018年9月6日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
public class WorkflowJobDaoTest extends BaseTest{

	@Autowired
	WorkflowJobDao workflowJobDao;
	
	@Test
	public void testInsert() {
		WorkflowJob workflowJob=new WorkflowJob();
		workflowJob.setName("test");
		workflowJob.setModelId("workflowJobModelId");
		workflowJob.setStatus(JobStatus.STARTED);
		workflowJob.setCreateUserId("sixliu");
		workflowJob.setUpdateUserId("sixliu");
		int result=workflowJobDao.insert(workflowJob);
		checkOk(result);
	}
	
	@Test
	public void testGet() {
		WorkflowJob workflowJob=workflowJobDao.get("186c08fa-b1c8-11e8-9e01-005056986f0b");
		checkOk(workflowJob);
	}
	
	@Test
	public void testListLockJobs() {
		List<WorkflowJob> workflowJobs=workflowJobDao.listLockJobs();
		checkOk(workflowJobs);
	}
}
