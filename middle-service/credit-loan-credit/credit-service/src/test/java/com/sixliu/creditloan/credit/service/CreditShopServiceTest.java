package com.sixliu.creditloan.credit.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sixliu.creditloan.credit.BaseTest;
import com.sixliu.creditloan.credit.service.CreditShopService;
import com.sixliu.creditloan.product.service.ProductManagerService;

/**
*@author:MG01867
*@date:2018年8月21日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
public class CreditShopServiceTest extends BaseTest{

	@Autowired
	CreditShopService creditShopService;
	
	@Autowired
	private ProductManagerService productManagerService;

	@Test
	public void testInsert() {
		Object result=productManagerService.get("c43d00de-9d29-11e8-9e01-005056986f0b");
		System.out.println(result);
	}

}
