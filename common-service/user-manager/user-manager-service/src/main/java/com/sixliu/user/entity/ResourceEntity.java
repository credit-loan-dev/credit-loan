package com.sixliu.user.entity;

import com.sixliu.user.constant.ResourceType;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
*@author:MG01867
*@date:2018年10月31日
*@email:359852326@qq.com
*@version:
*@describe 
*/
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ResourceEntity extends BaseEntity{

	/**资源名称**/
	private String name;
	
	/**资源类型**/
	private ResourceType type;
}
