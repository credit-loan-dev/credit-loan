package com.sixliu.creditloan.workflow.dto;

import com.sixliu.creditloan.workflow.constant.TaskStatus;

import lombok.Data;

/**
*@author:MG01867
*@date:2018年7月23日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
@Data
public class TaskProcessResult {

	/**流程作业id**/
	private String jobId;
	
	/**流程作业任务id**/
	private String taskId;
	
	/**流程作业任务审批用户**/
	private String userId;
	
	/**流程作业任务审批状态**/
	private TaskStatus status;
	
	/**流程作业任务审批驳回阶段**/
	private int overrulePhase;
	
	/**流程作业任务内部意见**/
	private String innerOpinion;
	
	/**流程作业任务外部意见**/
	private String outerOpinion;
	
}
