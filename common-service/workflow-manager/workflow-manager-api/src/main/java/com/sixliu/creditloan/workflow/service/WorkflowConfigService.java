package com.sixliu.creditloan.workflow.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sixliu.creditloan.workflow.WorkflowManagerApi;
import com.sixliu.creditloan.workflow.dto.WorkflowJobModelDTO;
import com.sixliu.creditloan.workflow.dto.WorkflowTaskModelDTO;

/**
 * @author:MG01867
 * @date:2018年9月6日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 流程配置服务
 */
@FeignClient(WorkflowManagerApi.SERVICE_NAME)
@Validated
public interface WorkflowConfigService {

	@RequestMapping(value = "/config/addWorkflowJobModel", method = RequestMethod.POST)
	@ResponseBody
	String addWorkflowJobModel(@Valid @RequestBody WorkflowJobModelDTO addWorkflowJobModel);

	@RequestMapping(value = "/config/saveWorkflowTaskModel", method = RequestMethod.POST)
	@ResponseBody
	String addWorkflowTaskModel(WorkflowTaskModelDTO workflowTaskModel);

	@RequestMapping(value = "/config/listWorkflowJobModels", method = RequestMethod.POST)
	@ResponseBody
	List<WorkflowJobModelDTO> listWorkflowJobModels();

	@RequestMapping(value = "/config/listWorkflowTaskModelsByJobId", method = RequestMethod.POST)
	@ResponseBody
	List<WorkflowTaskModelDTO> listWorkflowTaskModelsByJobId(String jobId);
}
