package com.sixliu.creditloan.credit.component;

import java.util.UUID;

import org.springframework.stereotype.Component;

/**
*@author:MG01867
*@date:2018年8月10日
*@E-mail:359852326@qq.com
*@version:
*@describe 授信订单id生成器
*/
@Component
public class CreditOrderIdGenerator {

	public String generator(String productId) {
		return UUID.randomUUID().toString();
	}
}
