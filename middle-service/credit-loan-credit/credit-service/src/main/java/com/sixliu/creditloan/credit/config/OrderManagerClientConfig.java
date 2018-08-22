package com.sixliu.creditloan.credit.config;

import org.springframework.cloud.openfeign.FeignClient;

import com.sixliu.creditloan.order.service.OrderManagerService;

/**
*@author:MG01867
*@date:2018年8月21日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
@FeignClient("order-manager")
public interface OrderManagerClientConfig extends OrderManagerService{

}
