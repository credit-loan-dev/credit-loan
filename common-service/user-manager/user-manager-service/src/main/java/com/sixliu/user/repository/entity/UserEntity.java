package com.sixliu.user.repository.entity;

import java.util.Date;

import com.sixliu.user.constant.UserStatus;

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
public class UserEntity extends AuditBaseEntity{

	/**用户名VARCHAR(40)**/
	private String name;
	
	/**状态VARCHAR(20)**/
	private UserStatus status;
	
	/**用户昵称**/
	private String nickname;
	
	/**密码**/
	private String password;
	
	/**过期日期**/
	private Date expiredDate;
}
