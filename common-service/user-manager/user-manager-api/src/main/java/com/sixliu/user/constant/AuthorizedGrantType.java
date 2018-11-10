package com.sixliu.user.constant;

/**
*@author:MG01867
*@date:2018年11月10日
*@email:359852326@qq.com
*@version:
*@describe //TODO
*/
public enum AuthorizedGrantType {
	/**authorization_code:授权码类型**/
	AUTHORIZATION_CODE,
	
	/**implicit:隐式授权类型**/
	IMPLICAIT,
	
	/**password:资源所有者（即用户）密码类型**/
	PASSWORD,
	
	/**client_credentials:客户端凭据（客户端ID以及Key）类型**/
	CLIENT_CREDENTIALS,
	
	/**refresh_token:通过以上授权获得的刷新令牌来获取新的令牌**/
	REFRESH_TOKEN;
}
