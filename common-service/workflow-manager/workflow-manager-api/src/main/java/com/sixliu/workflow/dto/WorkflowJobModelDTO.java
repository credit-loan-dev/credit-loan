package com.sixliu.workflow.dto;


import java.util.Date;

import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
*@author:MG01867
*@date:2018年7月6日
*@E-mail:359852326@qq.com
*@version:
*@describe 流程模型
*/
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class WorkflowJobModelDTO extends BaseFormDTO{

	/**数据id业务无关性:VARCHAR(36)**/
	private String id;
	
	/** 流程作业模型名称 **/
	@NotBlank(message="The name must be not blank")
	private String name;
	
	/**允许创建该流程作业角色id**/
	@NotBlank(message="The form'id must be not blank")
	private String createRoleId;
	
	/**数据备注:VARCHAR(100)**/
	private String remarks;
	
	/**数据版本:INT(11)**/
	private Integer version;
	
	/**数据更新用户id:VARCHAR(36)**/
	private String updateUserId;
	
	/**数据更新日期(每次写操作时赋值):TIMESTAMP**/
	private Date updateDate;
	
	/**数据创建用户id:VARCHAR(36)**/
	private String createUserId;
	
	/**数据创建日期(只在创建时赋值):TIMESTAMP**/
	private Date createDate;
}
