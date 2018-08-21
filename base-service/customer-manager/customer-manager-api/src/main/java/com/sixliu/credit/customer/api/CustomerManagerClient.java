package com.sixliu.credit.customer.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sixliu.credit.customer.CustomerDTO;

/**
 * @author:MG01867
 * @date:2018年8月6日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
@FeignClient("customer-manager")
public interface CustomerManagerClient {
	
	@RequestMapping(value = "/product/inner/get", method = RequestMethod.POST)
	CustomerDTO getAndHitBlacklist(@RequestParam(name="customerId") String customerId,@RequestParam(name="blacklistGroup") String blacklistGroup);
	
}
