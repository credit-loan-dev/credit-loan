package com.sixliu.user.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sixliu.user.BaseTest;
import com.sixliu.user.repository.dao.UserDao;
import com.sixliu.user.repository.entity.UserEntity;

/**
*@author:MG01867
*@date:2018年6月28日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
public class UserDaoTest extends BaseTest{

	@Autowired
	UserDao userDao;
	
	@Test
	public void testAdd() {
		String id="d95cb7f2-dda1-11e8-9e01-005056986f0b";
		System.out.println(id.length());
		UserEntity user=new UserEntity();
		user.setName("sixliu5945");
		user.setPassword("37dzsk9n5w");
		user.setNickname("sixliu");
		user.setCreateUserId("sixliu");
		user.setUpdateUserId("sixliu");
		int count=userDao.add(user);
		checkOk(count);
	}
	
	@Test
	public void testGet() {
		UserEntity user=userDao.get("98d3c392dda211e89e01005056986f0b");
		checkOk(user);
	}
}
