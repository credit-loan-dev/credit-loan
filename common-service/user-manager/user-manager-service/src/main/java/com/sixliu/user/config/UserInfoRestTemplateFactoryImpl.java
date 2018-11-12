package com.sixliu.user.config;

import org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoRestTemplateFactory;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.stereotype.Component;

/**
*@author:MG01867
*@date:2018年11月12日
*@email:359852326@qq.com
*@version:
*@describe //TODO
*/
@Component
public class UserInfoRestTemplateFactoryImpl implements UserInfoRestTemplateFactory{

	@Override
	public OAuth2RestTemplate getUserInfoRestTemplate() {
		return null;
	}

}
