package com.sixliu.creditloan.workflow.entity;

import lombok.Data;

/**
*@author:MG01867
*@date:2018年9月6日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
@Data
public abstract class BaseEntity {

	/**数据id业务无关性:VARCHAR(36)**/
	private String id;
}
