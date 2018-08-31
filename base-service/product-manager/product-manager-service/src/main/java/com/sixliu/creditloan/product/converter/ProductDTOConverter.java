package com.sixliu.creditloan.product.converter;

import org.springframework.beans.BeanUtils;

import com.sixliu.creditloan.product.dto.ProductForCreditDTO;
import com.sixliu.creditloan.product.entity.ProductConfig;

/**
*@author:MG01867
*@date:2018年8月22日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
public class ProductDTOConverter {

	public static ProductForCreditDTO convert(ProductConfig productConfig) {
		ProductForCreditDTO product=null;
		if(null!=productConfig) {
			product=new ProductForCreditDTO();
			BeanUtils.copyProperties(productConfig, product);
		}
		return product;
	}
}
