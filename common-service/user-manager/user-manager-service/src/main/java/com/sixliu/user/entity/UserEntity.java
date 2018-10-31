package com.sixliu.user.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
*@author:MG01867
*@date:2018年10月31日
*@email:359852326@qq.com
*@version:
*@describe 用户实体类
*/
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class UserEntity extends BaseEntity{

	/**用户名**/
	private String name;
	
	/**用户昵称**/
	private String nickname;
	
	/**密码**/
	private String password;
	
	/**手机号码**/
	private String mobileNo;
	
	/**邮箱地址**/
	private String email;
}
