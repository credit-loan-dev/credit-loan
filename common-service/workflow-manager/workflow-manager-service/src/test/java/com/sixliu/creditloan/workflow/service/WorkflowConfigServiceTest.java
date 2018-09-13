package com.sixliu.creditloan.workflow.service;

import java.util.List;
import java.util.UUID;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sixliu.creditloan.workflow.BaseTest;
import com.sixliu.creditloan.workflow.constant.TaskType;
import com.sixliu.creditloan.workflow.dto.WorkflowJobModelDTO;
import com.sixliu.creditloan.workflow.dto.WorkflowTaskModelDTO;

/**
 * @author: sixliu
 * @email: 359852326@qq.com
 * @date: 2018年9月4日 下午10:33:22
 * @version V1.0
 * @Description:TODO
 */
public class WorkflowConfigServiceTest extends BaseTest {

	@Autowired
	WorkflowConfigService workflowConfigService;

	@Test
	public void testAddWorkflowJobModel() {
		WorkflowJobModelDTO workflowJobModel = new WorkflowJobModelDTO();
		workflowJobModel.setFormId(UUID.randomUUID().toString());
		workflowJobModel.setName("信贷产品授信流程");
		workflowJobModel.setCreateRoleId("sixliu");
		workflowJobModel.setRemarks("信贷产品授信流程");
		workflowJobModel.setCurrentUserId("sixliu");
		String jobId = workflowConfigService.addWorkflowJobModel(workflowJobModel);
		checkOk(jobId);
	}

	@Test
	public void testAddWorkflowTaskModel() {
		String jobModelId="b1e700c2-b6f9-11e8-9e01-005056986f0b";
		int phase=1;
		WorkflowTaskModelDTO workflowTaskModel1 = new WorkflowTaskModelDTO();
		workflowTaskModel1.setFormId(UUID.randomUUID().toString());
		workflowTaskModel1.setName("初审");
		workflowTaskModel1.setJobId(jobModelId);
		workflowTaskModel1.setPhase(phase++);
		workflowTaskModel1.setType(TaskType.MANUAL);
		workflowTaskModel1.setWorker("sixliu");
		workflowTaskModel1.setRemarks("信贷产品授信流程");
		workflowTaskModel1.setCurrentUserId("sixliu");
		String taskId = workflowConfigService.addWorkflowTaskModel(workflowTaskModel1);
		checkOk(taskId);
		
		WorkflowTaskModelDTO workflowTaskModel2 = new WorkflowTaskModelDTO();
		workflowTaskModel2.setFormId(UUID.randomUUID().toString());
		workflowTaskModel2.setName("复审");
		workflowTaskModel2.setJobId(jobModelId);
		workflowTaskModel2.setPhase(phase++);
		workflowTaskModel2.setType(TaskType.MANUAL);
		workflowTaskModel2.setWorker("sixliu");
		workflowTaskModel2.setRemarks("信贷产品授信流程");
		workflowTaskModel2.setCurrentUserId("sixliu");
		taskId = workflowConfigService.addWorkflowTaskModel(workflowTaskModel2);
		checkOk(taskId);
		
		WorkflowTaskModelDTO workflowTaskModel3 = new WorkflowTaskModelDTO();
		workflowTaskModel3.setFormId(UUID.randomUUID().toString());
		workflowTaskModel3.setName("终审");
		workflowTaskModel3.setJobId(jobModelId);
		workflowTaskModel3.setPhase(phase++);
		workflowTaskModel3.setType(TaskType.MANUAL);
		workflowTaskModel3.setWorker("sixliu");
		workflowTaskModel3.setRemarks("信贷产品授信流程");
		workflowTaskModel3.setCurrentUserId("sixliu");
		taskId = workflowConfigService.addWorkflowTaskModel(workflowTaskModel3);
		checkOk(taskId);
		
		WorkflowTaskModelDTO workflowTaskModel4 = new WorkflowTaskModelDTO();
		workflowTaskModel4.setFormId(UUID.randomUUID().toString());
		workflowTaskModel4.setName("自动风控审批");
		workflowTaskModel4.setJobId(jobModelId);
		workflowTaskModel4.setPhase(phase++);
		workflowTaskModel4.setType(TaskType.AUTO);
		workflowTaskModel4.setWorker("sixliu");
		workflowTaskModel4.setRemarks("信贷产品授信流程");
		workflowTaskModel4.setCurrentUserId("sixliu");
		taskId = workflowConfigService.addWorkflowTaskModel(workflowTaskModel4);
		checkOk(taskId);
	}
	
	@Test
	public void testListWorkflowJobModels() {
		List<WorkflowJobModelDTO> result=workflowConfigService.listWorkflowJobModels();
		checkOk(result);
	}
	
	@Test
	public void testListWorkflowTaskModelsByJobId() {
		List<WorkflowTaskModelDTO> result=workflowConfigService.listWorkflowTaskModelsByJobId("b1e700c2-b6f9-11e8-9e01-005056986f0b");
		checkOk(result);
	}
}
