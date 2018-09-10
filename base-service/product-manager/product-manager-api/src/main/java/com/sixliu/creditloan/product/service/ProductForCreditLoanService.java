package com.sixliu.creditloan.product.service;

import javax.validation.constraints.NotBlank;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sixliu.creditloan.product.ProductManagerApi;
import com.sixliu.creditloan.product.dto.ProductCreditDTO;
import com.sixliu.creditloan.product.dto.ProductCreditSnapshotDTO;

/**
 * @author:MG01867
 * @date:2018年7月9日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 产品服务-面向授信
 */
@FeignClient(ProductManagerApi.SERVICE_NAME)
@Validated
public interface ProductForCreditLoanService {

	@RequestMapping(value = "/credit/getProduct", method = RequestMethod.POST)
	@ResponseBody
	ProductCreditDTO getProductCreditConfig(
			@NotBlank(message = "The product's Id must be non blank") @RequestParam(name = "productId") String productId);

	@RequestMapping(value = "/credit/generateProductSnapshot", method = RequestMethod.POST)
	@ResponseBody
	String generateProductSnapshot(
			@NotBlank(message = "The product's id must be non blank") @RequestParam(name = "id") String productId);

	@RequestMapping(value = "/credit/getProductSnapshot", method = RequestMethod.POST)
	@ResponseBody
	ProductCreditSnapshotDTO getProductSnapshot(
			@NotBlank(message = "The productSnapshot's Id must be non blank") @RequestParam(name = "productSnapshotId") String productSnapshotId);
}
