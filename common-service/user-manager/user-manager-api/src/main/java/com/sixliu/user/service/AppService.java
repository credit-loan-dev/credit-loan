package com.sixliu.user.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sixliu.user.ServiceName;

/**
*@author:MG01867
*@date:2018年11月10日
*@email:359852326@qq.com
*@version:
*@describe //TODO
*/
@FeignClient(ServiceName.SERVICE_NAME)
@Validated
@RequestMapping("/app")
public interface AppService extends ClientDetailsService{

}
