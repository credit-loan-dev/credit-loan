package com.sixliu.workflow.dto;


import java.util.Date;

import com.sixliu.workflow.constant.JobStatus;

import lombok.Data;

/**
*@author:MG01867
*@date:2018年7月6日
*@E-mail:359852326@qq.com
*@version:
*@describe 流程作业
*/
@Data
public class FlowJob {

	/**流程作业id**/
	private String id;
	
	/**流程作业名称**/
	private String name;
	
	/**流程作业名称**/
	private String flowJobModelId;
	
	/**流程作业状态**/
	private JobStatus status;
	
	/**数据更新用户id:VARCHAR(36)**/
	private String updateUserId;
	
	/**数据更新日期(每次写操作时赋值)**/
	private Date updateDate;
	
	/**数据创建用户id:VARCHAR(36)**/
	private String createUserId;
	
	/**数据创建日期(只在创建时赋值):TIMESTAMP**/
	private Date createDate;
}
