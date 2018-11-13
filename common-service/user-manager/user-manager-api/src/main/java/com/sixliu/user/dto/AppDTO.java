package com.sixliu.user.dto;

import java.util.Set;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author:MG01867
 * @date:2018年11月13日
 * @email:359852326@qq.com
 * @version:
 * @describe //TODO
 */

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class AppDTO extends BaseDTO {
	
	/**应用编码**/
	private String code;

	/**应用密码**/
	private String secret;

	private boolean scoped;
	
	/**授权后重定向url**/
	private String redirectUrl;

	/** 支持的授权类型*/
	private Set<String> authorizedGrantTypes;
	
	/** 授权访问范围**/
	private Set<String> scopes;
	
	private boolean autoApprove;

	private int accessTokenValiditySeconds;

	private int refreshTokenValiditySeconds;
	
	private String describe;
}
