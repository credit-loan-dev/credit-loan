package com.sixliu.flow;

import java.util.Date;

import lombok.Data;

/**
*@author:MG01867
*@date:2018年7月6日
*@E-mail:359852326@qq.com
*@version:
*@describe 流程任务
*/
@Data
public class FlowTask{
	
	/**流程作业任务id**/
	private String id;
	
	/**流程作业任务所属 流程作业任务模型 id**/
	private String flowTaskModelId;
	
	/**流程作业任务所属Job id**/
	private String flowJobId;
	
	/**流程作业任务所处阶段**/
	private int phase;
	
	/**流程作业任务处理类型**/
	private TaskType type;
	
	/** 流程作业任务处理worker或者流程作业任务所属角色 **/
	private String worker;
	
	/**流程作业任务所属用户**/
	private String ownerUserId;
	
	/**流程作业任务提交前切面handler class**/
	private String flowTaskBeforeSubmitAopClass;
	
	/**流程作业任务提交后切面handler class**/
	private String flowTaskAfterSubmitAopClass;
	
	/**流程作业任务所处状态**/
	private TaskStatus status=TaskStatus.PENDING;
	
	/**流程作业任务内部意见**/
	private String innerOpinion;
	
	/**流程作业任务外部意见**/
	private String outerOpinion;
	
	/**数据更新用户id:VARCHAR(36)**/
	private String updateUserId;
	
	/**数据更新日期(每次写操作时赋值)**/
	private Date updateDate;
	
	/**数据创建用户id:VARCHAR(36)**/
	private String createUserId;
	
	/**数据创建日期(只在创建时赋值):TIMESTAMP**/
	private Date createDate;
	
}
