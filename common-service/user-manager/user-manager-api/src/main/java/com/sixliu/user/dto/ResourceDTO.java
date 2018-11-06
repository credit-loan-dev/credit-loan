package com.sixliu.user.dto;

import javax.validation.constraints.NotBlank;

import com.sixliu.user.constant.ResourceType;
import com.sixliu.user.validation.AddValidationGroup;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
*@author:MG01867
*@date:2018年11月6日
*@email:359852326@qq.com
*@version:
*@describe //TODO
*/
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ResourceDTO extends BaseDTO{

	/**资源名称**/
	@NotBlank(message = "The name must be not blank",groups= {AddValidationGroup.class})
	private String name;
	
	/**资源类型**/
	@NotBlank(message = "The type must be not blank",groups= {AddValidationGroup.class})
	private ResourceType type;
}
