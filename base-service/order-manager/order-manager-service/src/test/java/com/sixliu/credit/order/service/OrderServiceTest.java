package com.sixliu.credit.order.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sixliu.credit.order.BaseTest;
import com.sixliu.credit.product.api.ProductManagerClient;
import com.sixliu.credit.product.dto.ProductInnerDTO;


/**
 * @author:MG01867
 * @date:2018年7月10日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
public class OrderServiceTest extends BaseTest {

	@Autowired
	OrderService orderService;
	
	@Autowired
	ProductManagerClient productManagerInnerClient;

	@Test
	public void testApply() {
		ProductInnerDTO productInnerDTO=productManagerInnerClient.get("c43d00de-9d29-11e8-9e01-005056986f0b");
		System.out.println(productInnerDTO);
	}
}