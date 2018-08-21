package com.sixliu.creditloan.credit.config;

import org.springframework.cloud.openfeign.FeignClient;

import com.sixliu.credit.customer.api.CustomerManagerClient;

/**
*@author:MG01867
*@date:2018年8月21日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
@FeignClient("customer-manager")
public interface CustomerManagerClientConfig extends CustomerManagerClient{

}
