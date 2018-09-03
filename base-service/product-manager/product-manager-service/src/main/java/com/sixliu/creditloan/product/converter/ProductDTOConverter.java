package com.sixliu.creditloan.product.converter;

import org.springframework.beans.BeanUtils;

import com.sixliu.creditloan.product.dto.ProductCreditDTO;
import com.sixliu.creditloan.product.entity.ProductConfig;

/**
*@author:MG01867
*@date:2018年8月22日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
public class ProductDTOConverter {

	public static ProductCreditDTO convert(ProductConfig productConfig) {
		ProductCreditDTO product=null;
		if(null!=productConfig) {
			product=new ProductCreditDTO();
			BeanUtils.copyProperties(productConfig, product);
		}
		return product;
	}
}
