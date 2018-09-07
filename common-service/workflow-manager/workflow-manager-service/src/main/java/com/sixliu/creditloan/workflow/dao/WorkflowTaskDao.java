package com.sixliu.creditloan.workflow.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sixliu.creditloan.workflow.constant.TaskStatus;
import com.sixliu.creditloan.workflow.entity.WorkflowTask;

/**
 * @author:MG01867
 * @date:2018年8月13日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
public interface WorkflowTaskDao {

	int insert(WorkflowTask workflowTask);

	WorkflowTask get(String id);
	
	WorkflowTask getByJobIdForPooling(String jobId);

	List<WorkflowTask> listByRoleId(String roleId);
	
	List<WorkflowTask> listByRoleIdAndStatus(@Param("roleId") String roleId,@Param("status") TaskStatus status);

	int update(WorkflowTask workflowTask);
	
	int updateOwnerUserIdAndStatus(String id,String ownerUserId,TaskStatus status,String updateUserid,int version);
	
	int updateStatus(String id,TaskStatus status,String updateUserid,int version);
}
