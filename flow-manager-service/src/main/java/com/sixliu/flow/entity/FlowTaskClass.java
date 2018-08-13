package com.sixliu.flow.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
*@author:MG01867
*@date:2018年8月13日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper =true)
public class FlowTaskClass extends FlowTaskModel{

	/** 流程作业任务所处阶段 **/
	private Integer phase;

	/** 流程作业class id **/
	private String flowJobClassId;
	
}