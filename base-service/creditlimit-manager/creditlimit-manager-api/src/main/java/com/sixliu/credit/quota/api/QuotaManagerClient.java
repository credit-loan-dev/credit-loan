package com.sixliu.credit.quota.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sixliu.credit.quota.CreditlimitDTO;

/**
*@author:MG01867
*@date:2018年8月6日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
@FeignClient("customer-manager")
public interface QuotaManagerClient {

	@RequestMapping(value = "/creditlimit/inner/get", method = RequestMethod.POST)
	CreditlimitDTO get(String quotaId);
}
