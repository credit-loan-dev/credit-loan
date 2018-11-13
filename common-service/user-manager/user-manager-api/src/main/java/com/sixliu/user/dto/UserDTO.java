package com.sixliu.user.dto;



import javax.validation.constraints.NotBlank;

import com.sixliu.user.constant.UserStatus;
import com.sixliu.user.validation.AddValidationGroup;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
*@author:MG01867
*@date:2018年8月13日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class UserDTO extends BaseDTO{

	/**用户名**/
	@NotBlank(message = "The user's name must be not blank",groups= {AddValidationGroup.class})
	private String name;
	
	private UserStatus status;
	
	/**用户昵称**/
	@NotBlank(message = "The user's nickname must be not blank",groups= {AddValidationGroup.class})
	private String nickname;
	
	/**密码**/
	@NotBlank(message = "The user's password must be not blank",groups= {AddValidationGroup.class})
	private String password;
}