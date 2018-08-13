package com.sixliu.flow.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
*@author:MG01867
*@date:2018年8月13日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
@Data
@EqualsAndHashCode(callSuper=false)
public class FlowJobClass extends FlowJobModel{

	/**流程作业模型id**/
	private String flowJobModelId;

}