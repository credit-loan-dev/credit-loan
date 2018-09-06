package com.sixliu.creditloan.workflow.dao;

import java.util.List;

import com.sixliu.creditloan.workflow.entity.WorkflowEventModel;

/**    
 * @author: sixliu
 * @email:  359852326@qq.com
 * @date:   2018年9月6日 下午11:04:44   
 * @version V1.0 
 * @Description:TODO
 */
public interface WorkflowEventModelDao {


	WorkflowEventModel get(String id);
	
	int insert(WorkflowEventModel workflowEventModel);
	
	List<WorkflowEventModel> listByTaskId(String taskId);
}
