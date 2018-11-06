package com.sixliu.user.repository.entity;

import lombok.Data;

/**
 * @author:MG01867
 * @date:2018年6月15日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 基础po
 */
@Data
public abstract class BaseEntity {

	/**数据id业务无关性:VARCHAR(36)**/
	private String id;
	
	/**数据版本:INT(11)**/
	private int version;
}
