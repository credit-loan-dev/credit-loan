package com.sixliu.creditloan.credit.service;

import static org.junit.Assert.assertFalse;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sixliu.creditloan.credit.BaseTest;
import com.sixliu.creditloan.credit.CreditApplyDTO;
import com.sixliu.creditloan.credit.service.CreditShopService;

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

	@Test
	public void testInsert() {
		CreditApplyDTO creditApply=new CreditApplyDTO();
		creditShopService.apply(creditApply);
		assertFalse(false);
	}

}
