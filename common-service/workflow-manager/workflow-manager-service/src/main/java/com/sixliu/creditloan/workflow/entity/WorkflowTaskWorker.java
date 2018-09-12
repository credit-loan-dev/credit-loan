package com.sixliu.creditloan.workflow.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
*@author:MG01867
*@date:2018年9月11日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class WorkflowTaskWorker extends BaseEntity {

	/** 自动处理worker名称 **/
	private String name;
	
	/** 流程任务模型id **/
	private String taskModelId;
	
	/** 流程任务id **/
	private String taskPhase;

	/** 自动处理worker扫描任务间隔时间 **/
	private long checkInterval;
	
	/** 自动处理worker远程url**/
	private String url;
}