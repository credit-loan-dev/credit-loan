package com.sixliu.flow.dao;

import java.util.List;

import com.sixliu.flow.FlowTask;
import com.sixliu.flow.TaskStatus;

/**
 * @author:MG01867
 * @date:2018年8月13日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
public interface FlowTaskDao {

	int insert(FlowTask flowTask);

	FlowTask get(String id);

	List<FlowTask> listByRoleId(String roleId);
	
	List<FlowTask> listByRoleIdAndStatus(String roleId,TaskStatus status);

	int update(FlowTask flowTask);
}
