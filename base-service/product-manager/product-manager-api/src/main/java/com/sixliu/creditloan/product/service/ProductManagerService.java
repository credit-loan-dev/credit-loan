package com.sixliu.creditloan.product.service;


import javax.validation.constraints.NotBlank;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sixliu.creditloan.product.dto.ProductDTO;

/**
 * @author:MG01867
 * @date:2018年7月9日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
@FeignClient("product-manager")
public interface ProductManagerService {

	/**
	 * 通过产品id获取产品
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/product/get", method = RequestMethod.POST)
	ProductDTO get(@NotBlank(message = "The product's Id must be non blank") @RequestParam(name="id") String id);
	
	/**
	 * 通过产品id获取产品
	 * @param code
	 * @return
	 */
	@RequestMapping(value = "/product/getByCode", method = RequestMethod.POST)
	ProductDTO getByCode(@NotBlank(message = "The product's code must be non blank") @RequestParam(name="code")String code);
	
	/**
	 * 生成产品快照
	 * 
	 * @param id
	 *            产品id
	 * @return 返回产品快照id
	 */
	@RequestMapping(value = "/product/generateProductSnapshot", method = RequestMethod.POST)
	String generateProductSnapshot(@NotBlank(message = "The product's id must be non blank") @RequestParam(name="id")String id);
}
