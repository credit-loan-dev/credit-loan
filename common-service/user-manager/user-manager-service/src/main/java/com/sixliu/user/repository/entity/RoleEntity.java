package com.sixliu.user.repository.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author: sixliu
 * @email: 359852326@qq.com
 * @date: 2018年10月31日 下午8:46:37
 * @version V1.0
 * @description:角色实体
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class RoleEntity extends AuditBaseEntity {

	/** 资源名称 **/
	private String name;
	
	/** 层级深度 **/
	private int depth;

	/** 父资源id **/
	private String parentId;
}
