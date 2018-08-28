package com.sixliu.creditloan.product.service;



import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sixliu.creditloan.product.BaseTest;
import com.sixliu.creditloan.product.dto.ProductDTO;
import com.sixliu.creditloan.product.service.ProductConfigService;

/**
*@author:MG01867
*@date:2018年6月28日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
public class ProductConfigServiceTest extends BaseTest {

	@Autowired
	ProductConfigService productManagerService;

	@Test
	public void testInsert() {
		ProductDTO product=productManagerService.get("c43d00de-9d29-11e8-9e01-005056986f0b");
		checkOk(product);
	}

}
