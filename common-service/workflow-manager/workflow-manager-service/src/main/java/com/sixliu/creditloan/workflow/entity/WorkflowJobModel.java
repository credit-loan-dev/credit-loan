package com.sixliu.creditloan.workflow.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author:MG01867
 * @date:2018年9月6日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class WorkflowJobModel extends BaseEntity {
	
	/** 流程作业模型名称 **/
	private String name;
	
	/**允许创建该流程作业角色id**/
	private String createRoleId;
}
