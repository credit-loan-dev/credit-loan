package com.sixliu.creditloan.workflow.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sixliu.creditloan.workflow.BaseTest;
import com.sixliu.creditloan.workflow.constant.TaskStatus;
import com.sixliu.creditloan.workflow.entity.WorkflowTask;
import com.sixliu.creditloan.workflow.entity.WorkflowTaskModel;

/**    
 * @author: sixliu
 * @email:  359852326@qq.com
 * @date:   2018年9月6日 下午11:39:26   
 * @version V1.0 
 * @Description:TODO
 */
public class WorkflowTaskDaoTest extends BaseTest{
	
	@Autowired
	WorkflowTaskDao workflowTaskDao;
	
	@Autowired
	WorkflowTaskModelDao workflowTaskModelDao;

	
	@Test
	public void testInsert() {
		List<WorkflowTaskModel> workflowTaskModels=workflowTaskModelDao.listByJobModelId("a50d9f82-b1e9-11e8-8bec-000c29851249");
		for(WorkflowTaskModel workflowTaskModel:workflowTaskModels) {
			WorkflowTask workflowTask=new WorkflowTask();
			workflowTask.setJobId("f93c67ec-b1ea-11e8-8bec-000c29851249");
			workflowTask.setModelId(workflowTaskModel.getId());
			workflowTask.setName(workflowTaskModel.getName());
			workflowTask.setPhase(workflowTaskModel.getPhase());
			workflowTask.setType(workflowTaskModel.getType());
			workflowTask.setWorker(workflowTaskModel.getWorker());
			workflowTask.setStatus(TaskStatus.POOLING);
			workflowTask.setWorker("sixliu");
			workflowTask.setRemarks("remarks");
			workflowTask.setCreateUserId("sixliu");
			workflowTask.setUpdateUserId("sixliu");
			workflowTaskDao.insert(workflowTask);
		}
		checkOk(null);

	}

}
