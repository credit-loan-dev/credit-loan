package com.sixliu.creditloan.workflow.service.impl;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.sixliu.creditloan.workflow.dto.AddWorkflowJobModelDTO;
import com.sixliu.creditloan.workflow.dto.WorkflowTaskModelDTO;
import com.sixliu.creditloan.workflow.service.WorkflowConfigService;

/**
*@author:MG01867
*@date:2018年9月6日
*@E-mail:359852326@qq.com
*@version:
*@describe 
*/
@RestController
public class WorkflowConfigServiceImpl implements WorkflowConfigService{

	@Override
	public String saveWorkflowJobModel(AddWorkflowJobModelDTO workflowJobModelDTO) {
		return "test";
	}

	@Override
	public String saveWorkflowTaskModel(WorkflowTaskModelDTO workflowTaskModelDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AddWorkflowJobModelDTO> listWorkflowJobModels() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WorkflowTaskModelDTO> listWorkflowTaskModelsByJobId(String jobId) {
		// TODO Auto-generated method stub
		return null;
	}

}
