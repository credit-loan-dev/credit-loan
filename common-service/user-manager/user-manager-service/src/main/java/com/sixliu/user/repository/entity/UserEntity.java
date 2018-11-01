package com.sixliu.user.repository.entity;

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

	/**用户名VARCHAR(40)**/
	private String name;
	
	/**用户昵称**/
	private String nickname;
	
	/**密码**/
	private String password;
}
