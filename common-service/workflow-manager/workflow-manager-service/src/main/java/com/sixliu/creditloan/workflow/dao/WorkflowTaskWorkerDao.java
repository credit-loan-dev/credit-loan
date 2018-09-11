package com.sixliu.creditloan.workflow.dao;

import java.util.List;

import com.sixliu.creditloan.workflow.entity.WorkflowTaskWorker;

/**
*@author:MG01867
*@date:2018年9月11日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
public interface WorkflowTaskWorkerDao {

	WorkflowTaskWorker get(String id);

	WorkflowTaskWorker getByTaskId(String taskId);
	
	int insert(WorkflowTaskWorker workflowTaskWorkerModel);

	List<WorkflowTaskWorker> listAll();
}
