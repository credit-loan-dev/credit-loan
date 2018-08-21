package com.sixliu.creditloan.credit.impl.service;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.sixliu.creditloan.credit.service.CreditOfficeService;


/**
*@author:MG01867
*@date:2018年8月7日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
@RestController
public class CreditOfficeServiceImpl implements CreditOfficeService{

	@Override
	public List<String> listTaskFromPooling(String userId) {
		return null;
	}

	@Override
	public String autoClaimFlowTask(String userId) {
		return null;
	}

	@Override
	public void submitTaskResult(String taskResult) {
		
	}

}
