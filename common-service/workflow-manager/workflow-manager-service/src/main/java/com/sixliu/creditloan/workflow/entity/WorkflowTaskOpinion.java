package com.sixliu.creditloan.workflow.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author: sixliu
 * @email: 359852326@qq.com
 * @date: 2018年9月6日 下午11:57:46
 * @version V1.0
 * @Description:流程任务意见
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class WorkflowTaskOpinion extends BaseEntity {
	
	/**流程作业id**/
	private String jobId;
	
	/**流程任务id**/
	private String taskId;
	
	/**流程任务内部意见**/
	private String innerOpinion;
	
	/**流程任务外部意见**/
	private String outerOpinion;
}
