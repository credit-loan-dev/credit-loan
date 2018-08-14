package com.sixliu.flow.entity;


import com.sixliu.flow.JobStatus;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
*@author:MG01867
*@date:2018年7月6日
*@E-mail:359852326@qq.com
*@version:
*@describe 流程作业
*/
@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper =true)
public class FlowJob extends BaseEntity{

	/**流程作业id**/
	private String id;
	
	/**流程作业名称**/
	private String name;
	
	/**流程作业名称**/
	private String flowJobModelId;
	
	/**流程作业状态**/
	private JobStatus status;
}
