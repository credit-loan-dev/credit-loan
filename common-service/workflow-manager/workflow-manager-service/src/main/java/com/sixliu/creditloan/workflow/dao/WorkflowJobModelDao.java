package com.sixliu.creditloan.workflow.dao;

import java.util.List;

import com.sixliu.creditloan.workflow.entity.WorkflowJobModel;

/**
*@author:MG01867
*@date:2018年8月13日
*@E-mail:359852326@qq.com
*@version:
*@describe 流程作业模型数据访问dao
*/
public interface WorkflowJobModelDao {

	int insert(WorkflowJobModel workflowJobModel);

	WorkflowJobModel get(String id);
	
	WorkflowJobModel getByName(String name);
	
	List<WorkflowJobModel> listAll();
}
