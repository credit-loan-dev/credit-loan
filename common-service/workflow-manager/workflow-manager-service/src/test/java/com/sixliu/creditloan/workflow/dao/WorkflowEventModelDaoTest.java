package com.sixliu.creditloan.workflow.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sixliu.creditloan.workflow.BaseTest;
import com.sixliu.creditloan.workflow.entity.WorkflowEventModel;
import com.sixliu.workflow.constant.TaskEventType;

/**    
 * @author: sixliu
 * @email:  359852326@qq.com
 * @date:   2018年9月6日 下午11:06:11   
 * @version V1.0 
 * @Description:TODO
 */
public class WorkflowEventModelDaoTest extends BaseTest{

	@Autowired
	WorkflowEventModelDao workflowEventModelDao;
	
	@Test
	public void testInsert() {
		WorkflowEventModel workflowEventModel=new WorkflowEventModel();
		workflowEventModel.setTaskId("c885bca1-b1e9-11e8-8bec-000c29851249");
		workflowEventModel.setType(TaskEventType.CREATED);
		workflowEventModel.setScript("send msg");
		workflowEventModel.setCreateUserId("sixliu");
		workflowEventModel.setUpdateUserId("sixliu");
		int result=workflowEventModelDao.insert(workflowEventModel);
		checkOk(result);
	}
	
	@Test
	public void testGet() {
		WorkflowEventModel workflowEventModel=workflowEventModelDao.get("205dae84-b1ea-11e8-8bec-000c29851249");
		checkOk(workflowEventModel);
	}
	
	@Test
	public void testListByTaskId() {
		List<WorkflowEventModel> workflowEventModels=workflowEventModelDao.listByTaskId("c885bca1-b1e9-11e8-8bec-000c29851249");
		checkOk(workflowEventModels);
	}
}
