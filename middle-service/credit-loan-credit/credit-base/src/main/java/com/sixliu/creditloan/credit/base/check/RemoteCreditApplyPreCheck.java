package com.sixliu.creditloan.credit.base.check;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.sixliu.creditloan.credit.dto.CreditApplyDTO;

/**
*@author:MG01867
*@date:2018年8月29日
*@E-mail:359852326@qq.com
*@version:
*@describe 远程检查
*/
@Component
public class RemoteCreditApplyPreCheck implements CreditApplyPreCheck{

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public void check(CreditApplyDTO creditApplyDTO) {
		String url=generateUrl(creditApplyDTO.getProductId());
		restTemplate.postForEntity(url, creditApplyDTO,Void.class);
	}
	
	private String generateUrl(String productId) {
		return null;
	}

}
