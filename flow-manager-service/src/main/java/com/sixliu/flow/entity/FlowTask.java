package com.sixliu.flow.entity;

import java.util.Date;

import com.sixliu.flow.TaskStatus;
import com.sixliu.flow.TaskType;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
*@author:MG01867
*@date:2018年7月6日
*@E-mail:359852326@qq.com
*@version:
*@describe 流程任务
*/
@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper =true)
public class FlowTask extends BaseEntity{
	
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
	
	/**流程作业任务审批渠道**/
	private String channelId;
	
	/**流程作业任务开始日期**/
	private Date startDate;
	
	/**流程作业任务结束日期**/
	private Date endDate;
	
	/**流程作业创建用户**/
	private String createUserId;
	
}
