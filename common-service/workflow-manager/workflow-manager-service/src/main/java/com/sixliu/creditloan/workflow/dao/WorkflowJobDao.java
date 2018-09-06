package com.sixliu.creditloan.workflow.dao;

import com.sixliu.creditloan.workflow.entity.WorkflowJob;


/**
 * @author:MG01867
 * @date:2018年8月13日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe WorkflowJob 数据访问接口
 */
public interface WorkflowJobDao {

	WorkflowJob get(String id);
	
	int insert(WorkflowJob workflowJob);

	int delete(String id);
}
