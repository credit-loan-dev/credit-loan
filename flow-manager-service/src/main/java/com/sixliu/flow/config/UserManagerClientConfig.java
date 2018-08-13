package com.sixliu.flow.config;

import org.springframework.cloud.openfeign.FeignClient;

import com.sixliu.credit.user.api.UserManagerClient;

/**
 * @author:MG01867
 * @date:2018年7月9日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
@FeignClient("user-manager")
public interface UserManagerClientConfig extends UserManagerClient{
	
}
