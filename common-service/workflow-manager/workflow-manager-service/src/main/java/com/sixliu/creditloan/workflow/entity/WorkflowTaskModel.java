package com.sixliu.creditloan.workflow.entity;

import com.sixliu.creditloan.workflow.constant.TaskType;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author:MG01867
 * @date:2018年9月6日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class WorkflowTaskModel extends BaseEntity {
	
	/** 流程作业任务名称 **/
	private String name;

	/** 流程作业模型id **/
	private String jobModelId;

	/** 流程作业任务所处阶段 **/
	private Integer phase;

	/** 流程作业任务处理类型 **/
	private TaskType type;

	/** 流程作业任务处理worker **/
	private String worker;
}
