package com.sixliu.creditloan.workflow.dao;

import com.sixliu.creditloan.workflow.entity.WorkflowTaskOpinion;

/**    
 * @author: sixliu
 * @email:  359852326@qq.com
 * @date:   2018年9月6日 下午11:59:57   
 * @version V1.0 
 * @Description:TODO
 */
public interface WorkflowTaskOpinionDao {

	WorkflowTaskOpinion get(String id);
	
	int insert(WorkflowTaskOpinion workflowTaskOpinion);

	WorkflowTaskOpinion getByTaskId(String taskId);
	
}
