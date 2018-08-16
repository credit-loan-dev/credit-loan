package com.sixliu.flow.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
*@author:MG01867
*@date:2018年7月6日
*@E-mail:359852326@qq.com
*@version:
*@describe 流程模型
*/
@Data
@EqualsAndHashCode(callSuper=false)
public class FlowJobModel extends BaseEntity{

	/**流程作业模型name**/
	private String name;

	/**允许创建该流程作业角色id**/
	private String createRoleId;
}
