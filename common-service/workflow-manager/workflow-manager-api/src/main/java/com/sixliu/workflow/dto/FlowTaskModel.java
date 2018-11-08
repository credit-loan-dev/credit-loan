package com.sixliu.workflow.dto;

import java.util.Date;

import com.sixliu.workflow.constant.TaskType;

import lombok.Data;

/**
 * @author:MG01867
 * @date:2018年7月6日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 流程作业任务模型
 */
@Data
public class FlowTaskModel{

	/**数据id**/
	private String id;
	
	/** 流程作业任务名称 **/
	private String name;
	
	/** 流程作业 id **/
	private String flowJobModelId;
	
	/** 流程作业任务所处阶段 **/
	private Integer phase;

	/** 流程作业任务处理类型 **/
	private TaskType type;
	
	/** 流程作业任务处理worker **/
	private String worker;
	
	/**数据更新用户id:VARCHAR(36)**/
	private String updateUserId;
	
	/**数据更新日期(每次写操作时赋值)**/
	private Date updateDate;
	
	/**数据创建用户id:VARCHAR(36)**/
	private String createUserId;
	
	/**数据创建日期(只在创建时赋值):TIMESTAMP**/
	private Date createDate;
	
}
