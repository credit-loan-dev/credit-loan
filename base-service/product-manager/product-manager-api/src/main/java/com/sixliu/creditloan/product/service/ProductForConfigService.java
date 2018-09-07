package com.sixliu.creditloan.product.service;

import javax.validation.constraints.NotBlank;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sixliu.creditloan.product.dto.ProductConfigPagedQueryDTO;
import com.sixliu.creditloan.product.ProductManagerApi;
import com.sixliu.creditloan.product.dto.PagedQueryResultDTO;
import com.sixliu.creditloan.product.dto.ProductConfigDTO;

/**
*@author:MG01867
*@date:2018年9月3日
*@E-mail:359852326@qq.com
*@version:
*@describe 产品服务-面向配置
*/
@FeignClient(ProductManagerApi.SERVICE_NAME)
@Validated
public interface ProductForConfigService {
	
	/**
	 * 通过产品id获取产品:面向授信
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/config/getProduct", method = RequestMethod.POST)
	@ResponseBody
	ProductConfigDTO getProduct(@NotBlank(message = "The product's Id must be non blank") @RequestParam(name = "productId") String productId);
	
	
	@RequestMapping(value = "/config/listProducts", method = RequestMethod.POST)
	@ResponseBody
	PagedQueryResultDTO<ProductConfigDTO> listProducts(ProductConfigPagedQueryDTO productConfigPagedQueryDTO);
}
