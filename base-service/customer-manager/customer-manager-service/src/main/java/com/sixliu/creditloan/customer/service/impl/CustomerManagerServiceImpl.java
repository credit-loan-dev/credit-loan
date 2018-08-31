package com.sixliu.creditloan.customer.service.impl;

import org.springframework.web.bind.annotation.RestController;

import com.sixliu.creditloan.customer.dto.CustomerDTO;
import com.sixliu.creditloan.customer.service.CustomerManagerService;

/**
*@author:MG01867
*@date:2018年8月31日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
@RestController
public class CustomerManagerServiceImpl implements CustomerManagerService{

	@Override
	public CustomerDTO get(String id) {
		CustomerDTO customerDTO=new CustomerDTO();
		customerDTO.setId(id);
		customerDTO.setCreditlimitId("creditlimitId");
		return customerDTO;
	}

	@Override
	public String register(CustomerDTO customerDTO) {
		// TODO Auto-generated method stub
		return null;
	}

}
