package com.sixliu.creditloan.flow.dto;

import java.util.Date;

import lombok.Data;

/**
*@author:MG01867
*@date:2018年7月6日
*@E-mail:359852326@qq.com
*@version:
*@describe 流程模型
*/
@Data
public class FlowJobModel{

	/**数据id**/
	private String id;
	
	/**流程作业模型name**/
	private String name;

	/**允许创建该流程作业角色id**/
	private String createRoleId;
	
	/**数据更新用户id:VARCHAR(36)**/
	private String updateUserId;
	
	/**数据更新日期(每次写操作时赋值)**/
	private Date updateDate;
	
	/**数据创建用户id:VARCHAR(36)**/
	private String createUserId;
	
	/**数据创建日期(只在创建时赋值):TIMESTAMP**/
	private Date createDate;
}
