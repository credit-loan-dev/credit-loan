package com.sixliu.creditloan.product.service;



import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sixliu.creditloan.product.BaseTest;
import com.sixliu.creditloan.product.dto.ProductCreditDTO;
import com.sixliu.creditloan.product.service.ProductForCreditLoanService;

/**
*@author:MG01867
*@date:2018年6月28日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
public class ProductConfigServiceTest extends BaseTest {

	@Autowired
	ProductForCreditLoanService productForCreditService;

	@Test
	public void testInsert() {
		ProductCreditDTO product=productForCreditService.getProductCreditConfig("c43d00de-9d29-11e8-9e01-005056986f0b");
		checkOk(product);
	}

}
