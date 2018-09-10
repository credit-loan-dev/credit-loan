package com.sixliu.creditloan.workflow.dto;


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
public class AddWorkflowJobModelDTO extends BaseFormDTO{

	/** 流程作业模型名称 **/
	@NotBlank(message="The name must be not blank")
	private String name;
	
	/**允许创建该流程作业角色id**/
	@NotBlank(message="The form'id must be not blank")
	private String createRoleId;
	
	/**数据备注:VARCHAR(100)**/
	private String remarks;
}
