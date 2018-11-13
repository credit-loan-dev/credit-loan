package com.sixliu.user.repository.entity;

import com.sixliu.user.constant.ResourceType;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
*@author:MG01867
*@date:2018年10月31日
*@email:359852326@qq.com
*@version:
*@describe 资源实体类
*/
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ResourceEntity extends AuditBaseEntity{

	/**应用名称**/
	private String appId;
	
	/**资源名称**/
	private String name;
	
	/**资源类型**/
	private ResourceType type;
	
	/**资源路径**/
	private String path;
	
	/** 层级深度 **/
	private int depth;
	
	/**父资源id**/
	private String parentId;
}
