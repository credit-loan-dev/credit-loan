package com.sixliu.flow.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author:MG01867
 * @date:2018年7月6日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 流程作业任务模型
 */

@Data
@EqualsAndHashCode(callSuper = false)
public class FlowTaskModel extends BaseEntity {

	/** 流程作业任务名称 **/
	private String name;
	
	/** 流程作业任务所处阶段 **/
	private Integer phase;

	/** 流程作业任务处理类型 **/
	private TaskType type;
	
	/** 流程作业任务处理worker **/
	private String worker;
	
}
