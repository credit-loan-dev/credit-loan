package com.sixliu.creditloan.workflow.entity;


import com.sixliu.creditloan.workflow.constant.JobStatus;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
*@author:MG01867
*@date:2018年9月6日
*@E-mail:359852326@qq.com
*@version:
*@describe 流程job
*/
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class WorkflowJob extends BaseEntity{

	/**流程作业名称**/
	private String name;
	
	/**流程作业id**/
	private String modelId;
	
	/**流程作业状态**/
	private JobStatus status;
	
	private String lock;

}
