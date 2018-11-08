package com.sixliu.creditloan.workflow.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sixliu.creditloan.workflow.BaseTest;
import com.sixliu.creditloan.workflow.entity.WorkflowTask;
import com.sixliu.creditloan.workflow.entity.WorkflowTaskOpinion;

/**    
 * @author: sixliu
 * @email:  359852326@qq.com
 * @date:   2018年9月7日 上午12:06:23   
 * @version V1.0 
 * @Description:TODO
 */
public class WorkflowTaskOpinionDaoTest extends BaseTest{

	@Autowired
	WorkflowTaskOpinionDao workflowTaskOpinionDao;
	
	@Autowired
	WorkflowTaskDao workflowTaskDao;
	
	@Test
	public void testInsert() {
		WorkflowTask workflowTask=workflowTaskDao.get("796d60cf-b1ed-11e8-8bec-000c29851249");
		WorkflowTaskOpinion workflowTaskOpinion=new WorkflowTaskOpinion();
		workflowTaskOpinion.setJobId(workflowTask.getJobId());
		workflowTaskOpinion.setTaskId(workflowTask.getId());
		workflowTaskOpinion.setInnerOpinion("工作信息作假");
		workflowTaskOpinion.setOuterOpinion("综合评分过低");
		workflowTaskOpinion.setCreateUserId("sixliu");
		workflowTaskOpinion.setUpdateUserId("sixliu");
		workflowTaskOpinionDao.insert(workflowTaskOpinion);
		checkOk(workflowTaskOpinion);
	}

	@Test
	public void testGet() {
		WorkflowTaskOpinion workflowTaskOpinion=workflowTaskOpinionDao.get("6f7b4a31-b1ef-11e8-8bec-000c29851249");
		checkOk(workflowTaskOpinion);
	}
	
	@Test
	public void testGetByTaskId() {
		WorkflowTaskOpinion workflowTaskOpinion=workflowTaskOpinionDao.getByTaskId("796d60cf-b1ed-11e8-8bec-000c29851249");
		checkOk(workflowTaskOpinion);
	}
}
