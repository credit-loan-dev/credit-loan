package com.sixliu.user.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.Transactional;

import com.sixliu.user.BaseTest;
import com.sixliu.user.dto.UserDTO;
import com.sixliu.user.service.UserService;

/**
*@author:MG01867
*@date:2018年11月5日
*@email:359852326@qq.com
*@version:
*@describe //TODO
*/
public class UserServiceTest extends BaseTest{

	@Autowired
	UserService userService;
	
	PlatformTransactionManager platformTransactionManager;
	
	@Transactional
	@Test
	public void testGet() {
		UserDTO result=userService.get("98d3c392dda211e89e01005056986f0b");
		checkOk(result);
	}
}
