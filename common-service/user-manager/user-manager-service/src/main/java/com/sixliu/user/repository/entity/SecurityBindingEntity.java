package com.sixliu.user.repository.entity;

import com.sixliu.user.constant.SecurityBindingType;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
*@author:MG01867
*@date:2018年11月1日
*@email:359852326@qq.com
*@version:
*@describe //TODO
*/
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class SecurityBindingEntity extends AuditBaseEntity {

	/**类型**/
	private SecurityBindingType type;
	
	/**安全key**/
	private String key;
	
	/**安全value**/
	private String value;
	
	/**是否认证**/
	private boolean authenticate;
}
