package com.sixliu.user.repository.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
*@author:MG01867
*@date:2018年11月1日
*@email:359852326@qq.com
*@version:
*@describe 用户角色实体类
*/
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class UserRoleEntity extends AuditBaseEntity{

	/**用户Id**/
	private String userId;
	
	/**角色Id**/
	private String roleId;
}
