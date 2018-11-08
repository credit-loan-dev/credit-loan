package com.sixliu.creditloan.workflow.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.sixliu.creditloan.workflow.dao.WorkflowJobModelDao;
import com.sixliu.creditloan.workflow.dao.WorkflowTaskModelDao;
import com.sixliu.creditloan.workflow.entity.WorkflowJobModel;
import com.sixliu.creditloan.workflow.entity.WorkflowTaskModel;
import com.sixliu.creditloan.workflow.exception.IllegalArgumentAppException;
import com.sixliu.creditloan.workflow.util.ListUtils;
import com.sixliu.workflow.dto.WorkflowJobModelDTO;
import com.sixliu.workflow.dto.WorkflowTaskModelDTO;
import com.sixliu.workflow.service.WorkflowConfigService;

/**
 * @author:MG01867
 * @date:2018年9月6日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe
 */
@RestController
public class WorkflowConfigServiceImpl implements WorkflowConfigService {

	@Autowired
	private WorkflowJobModelDao workflowJobModelDao;

	@Autowired
	private WorkflowTaskModelDao workflowTaskModelDao;

	@Override
	public String addWorkflowJobModel(WorkflowJobModelDTO workflowJobModelDTO) {
		if (null != workflowJobModelDao.getByName(workflowJobModelDTO.getName())) {
			throw new IllegalArgumentAppException(
					String.format("The WorkflowJobModel[%s] already be  exists", workflowJobModelDTO.getName()));
		}
		WorkflowJobModel workflowJobModel = new WorkflowJobModel();
		BeanUtils.copyProperties(workflowJobModelDTO, workflowJobModel);
		workflowJobModel.setId(null);
		workflowJobModel.setCreateUserId(workflowJobModelDTO.getCurrentUserId());
		workflowJobModel.setUpdateUserId(workflowJobModelDTO.getCurrentUserId());
		workflowJobModelDao.insert(workflowJobModel);
		return workflowJobModel.getId();
	}

	@Override
	public String addWorkflowTaskModel(WorkflowTaskModelDTO workflowTaskModelDTO) {
		if (null != workflowTaskModelDao.getByName(workflowTaskModelDTO.getName())) {
			throw new IllegalArgumentAppException(
					String.format("The WorkflowTaskModel[%s] of WorkflowJobModel[%s]  already be exists",
							workflowTaskModelDTO.getName(), workflowTaskModelDTO.getJobId()));
		}
		WorkflowTaskModel workflowTaskModel = new WorkflowTaskModel();
		BeanUtils.copyProperties(workflowTaskModelDTO, workflowTaskModel);
		workflowTaskModel.setId(null);
		workflowTaskModel.setCreateUserId(workflowTaskModelDTO.getCurrentUserId());
		workflowTaskModel.setUpdateUserId(workflowTaskModelDTO.getCurrentUserId());
		workflowTaskModelDao.insert(workflowTaskModel);
		return workflowTaskModel.getId();
	}

	@Override
	public List<WorkflowJobModelDTO> listWorkflowJobModels() {
		List<WorkflowJobModel> workflowJobModels = workflowJobModelDao.listAll();
		return ListUtils.convert(workflowJobModels, workflowJobModel -> {
			WorkflowJobModelDTO workflowJobModelDTO = new WorkflowJobModelDTO();
			BeanUtils.copyProperties(workflowJobModel, workflowJobModelDTO);
			return workflowJobModelDTO;
		});
	}

	@Override
	public List<WorkflowTaskModelDTO> listWorkflowTaskModelsByJobId(String jobId) {
		List<WorkflowTaskModel> workflowTaskModels = workflowTaskModelDao.listByJobId(jobId);
		return ListUtils.convert(workflowTaskModels, workflowTaskModel -> {
			WorkflowTaskModelDTO workflowTaskModelDTO = new WorkflowTaskModelDTO();
			BeanUtils.copyProperties(workflowTaskModel, workflowTaskModelDTO);
			return workflowTaskModelDTO;
		});
	}

}
