package com.sixliu.creditloan.order.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sixliu.creditloan.order.BaseTest;
import com.sixliu.creditloan.product.dto.ProductForCreditDTO;
import com.sixliu.creditloan.product.service.ProductConfigService;


/**
 * @author:MG01867
 * @date:2018年7月10日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
public class OrderServiceTest extends BaseTest {

	@Autowired
	OrderManagerService orderManagerService;
	
	@Autowired
	ProductConfigService productManagerService;

	@Test
	public void testApply() {
		ProductForCreditDTO productInnerDTO=productManagerService.get("c43d00de-9d29-11e8-9e01-005056986f0b");
		System.out.println(productInnerDTO);
	}
}
