package com.sixliu.user.repository.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author:MG01867
 * @date:2018年11月10日
 * @email:359852326@qq.com
 * @version:
 * @describe //TODO
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class AppEntity extends AuditBaseEntity {

	/**应用编码varchar(40)**/
	private String code;

	/**应用密码varchar(200)**/
	private String secret;

	/**授权后重定向urlvarchar(200)**/
	private String redirectUrl;

	/**
	 * authorization_code：授权码类型。 implicit：隐式授权类型。 password：资源所有者（即用户）密码类型。
	 * client_credentials：客户端凭据（客户端ID以及Key）类型。 refresh_token：通过以上授权获得的刷新令牌来获取新的令牌。
	 */
	/** 支持的授权类型;分割varchar(200)**/
	private String authorizedGrantTypes;
	
	/** 授权访问范围;分割 **/
	private String scopes;

	private int accessTokenValiditySeconds;

	private int refreshTokenValiditySeconds;
	
	private String describe;
}
