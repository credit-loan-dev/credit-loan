package com.sixliu.flow.dto;


import com.sixliu.flow.TaskType;

import lombok.Data;

/**
*@author:MG01867
*@date:2018年8月15日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
@Data
public class FlowTaskModelDTO {

	/** 流程作业任务名称 **/
	private String name;
	
	/** 流程作业任务处理类型 **/
	private TaskType type;
	
	/** 流程作业任务处理worker **/
	private String worker;
	
	/**数据创建用户id:VARCHAR(36)**/
	private String createUserId;
}
