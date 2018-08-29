package com.sixliu.creditloan.product.service.credit;

import javax.validation.constraints.NotBlank;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sixliu.creditloan.product.dto.credit.ProductCreditDTO;

/**
 * @author:MG01867
 * @date:2018年8月28日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
@FeignClient("product-manager")
@Validated
public interface ProductCreditConfigService {

	@RequestMapping(value = "/product/credit/get", method = RequestMethod.POST)
	@ResponseBody
	ProductCreditDTO get(
			@NotBlank(message = "The productCredit's Id must be non blank") @RequestParam(name = "id") String id);

	@RequestMapping(value = "/product/credit/getByProductId", method = RequestMethod.POST)
	@ResponseBody
	ProductCreditDTO getByProductId(
			@NotBlank(message = "The product's Id must be non blank") @RequestParam(name = "productId") String productId);
}
