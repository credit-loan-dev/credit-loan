package com.sixliu.user.service.impl;

import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.web.bind.annotation.RestController;

import com.sixliu.user.service.AppService;

/**
*@author:MG01867
*@date:2018年11月12日
*@email:359852326@qq.com
*@version:
*@describe //TODO
*/
@RestController
public class AppServiceImpl implements AppService,ClientDetailsService{

	@Override
	public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
		return null;
	}

}
