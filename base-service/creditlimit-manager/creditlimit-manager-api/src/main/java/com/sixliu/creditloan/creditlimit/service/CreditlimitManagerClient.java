package com.sixliu.creditloan.creditlimit.service;

import javax.validation.constraints.NotBlank;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sixliu.creditloan.creditlimit.dto.CreditlimitDTO;

/**
 * @author:MG01867
 * @date:2018年8月6日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
@FeignClient("creditlimit-manager")
@Validated
public interface CreditlimitManagerClient {

	@RequestMapping(value = "/creditlimit/get", method = RequestMethod.POST)
	@ResponseBody
	CreditlimitDTO get(
			@NotBlank(message = "The creditlimit's Id must be non blank") @RequestParam(name = "id") String id);
}
