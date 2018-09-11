package com.sixliu.creditloan.workflow.dao;

import com.sixliu.creditloan.workflow.entity.WorkflowTaskWorkerModel;

/**
 * @author:MG01867
 * @date:2018年9月7日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 自动处理worker配置 数据访问接口
 */
public interface WorkflowTaskWorkerModelDao {

	WorkflowTaskWorkerModel get(String id);

	WorkflowTaskWorkerModel getByTaskId(String taskId);
	
	int insert(WorkflowTaskWorkerModel workflowTaskWorkerModel);

}
