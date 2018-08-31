package com.sixliu.creditloan.customer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sixliu.creditloan.customer.dto.CustomerDTO;

/**
 * @author:MG01867
 * @date:2018年8月6日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 客户管理服务接口
 */
@FeignClient("customer-manager")
@Validated
public interface CustomerManagerService {

	@RequestMapping(value = "/customer/get", method = RequestMethod.POST)
	CustomerDTO get(@RequestParam(name = "id") String id);
	
	@RequestMapping(value = "/customer/register", method = RequestMethod.POST)
	String register(CustomerDTO customerDTO);

}
