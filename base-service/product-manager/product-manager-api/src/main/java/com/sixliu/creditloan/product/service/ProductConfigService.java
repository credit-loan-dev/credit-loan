package com.sixliu.creditloan.product.service;

import javax.validation.constraints.NotBlank;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sixliu.creditloan.product.dto.ProductDTO;

/**
 * @author:MG01867
 * @date:2018年7月9日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 产品配置服务
 */
public interface ProductConfigService extends BaseService {

	/**
	 * 通过产品id获取产品
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/product/get", method = RequestMethod.POST)
	@ResponseBody
	ProductDTO get(@NotBlank(message = "The product's Id must be non blank") @RequestParam(name = "id") String id);

	/**
	 * 通过产品id获取产品
	 * 
	 * @param code
	 * @return
	 */
	@RequestMapping(value = "/product/getByCode", method = RequestMethod.POST)
	@ResponseBody
	ProductDTO getByCode(
			@RequestParam(name = "code") @NotBlank(message = "The product's code must be non blank") String code);

	/**
	 * 生成产品快照
	 * 
	 * @param id
	 *            产品id
	 * @return 返回产品快照id
	 */
	@RequestMapping(value = "/product/generateProductSnapshot", method = RequestMethod.POST)
	@ResponseBody
	String generateProductConfigSnapshot(
			@NotBlank(message = "The product's id must be non blank") @RequestParam(name = "id") String id);

}
