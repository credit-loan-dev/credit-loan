package com.sixliu.creditloan.credit.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sixliu.creditloan.credit.CreditApplyDTO;

/**
 * @author:MG01867
 * @date:2018年8月6日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 授信商店服务
 */
@FeignClient("credit")
public interface CreditShopService {

	/**
	 * 授信申请
	 * 
	 * @param creditApplyFormDTO
	 * @return 返回授信申请id
	 */
	@RequestMapping(value = "/credit/shop/apply", method = RequestMethod.POST)
	String apply(@Validated @RequestBody CreditApplyDTO creditApply);
	
	
	@RequestMapping(value = "/credit/shop/listByCustomerid", method = RequestMethod.POST)
	List<String> listByCustomerid(String customerId);

}
