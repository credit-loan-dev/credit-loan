package com.sixliu.user.repository.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
*@author:MG01867
*@date:2018年10月31日
*@email:359852326@qq.com
*@version:
*@describe 角色资源实体类
*/
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class RoleResourceEntity extends AuditBaseEntity{

	/**角色id**/
	private String roleId;
	
	/**资源id**/
	private String resourceId;
}
