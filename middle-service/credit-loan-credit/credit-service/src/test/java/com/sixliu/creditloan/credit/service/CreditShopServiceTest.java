package com.sixliu.creditloan.credit.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.sixliu.creditloan.credit.BaseTest;
import com.sixliu.creditloan.credit.service.CreditShopService;
import com.sixliu.creditloan.product.service.ProductConfigService;

/**
 * @author:MG01867
 * @date:2018年8月21日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
public class CreditShopServiceTest extends BaseTest {

	@Autowired
	CreditShopService creditShopService;

	@Autowired
	ProductConfigService productManagerService;
	
    RestTemplate restTemplate;

	@Test
	public void testInsert() {
		for (int i = 0; i < 10; i++) {
			Object result = productManagerService.get("67ea4cf2-a6d4-11e8-8df1-000c29851249");
			checkObject(result);
		}
	}

}
