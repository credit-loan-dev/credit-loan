package com.sixliu.creditloan.workflow.dao;

import java.util.List;

import com.sixliu.creditloan.workflow.constant.TaskStatus;
import com.sixliu.creditloan.workflow.dto.FlowTask;

/**
 * @author:MG01867
 * @date:2018年8月13日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
public interface WorkflowTaskDao {

	int insert(FlowTask flowTask);

	FlowTask get(String id);

	List<FlowTask> listByRoleId(String roleId);
	
	List<FlowTask> listByRoleIdAndStatus(String roleId,TaskStatus status);

	int update(FlowTask flowTask);
}
