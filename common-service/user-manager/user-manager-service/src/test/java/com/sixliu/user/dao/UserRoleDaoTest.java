package com.sixliu.user.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sixliu.user.BaseTest;
import com.sixliu.user.repository.dao.UserRoleDao;
import com.sixliu.user.repository.entity.UserRoleEntity;

/**
*@author:MG01867
*@date:2018年11月6日
*@email:359852326@qq.com
*@version:
*@describe //TODO
*/
public class UserRoleDaoTest extends BaseTest{

	@Autowired
	UserRoleDao userRoleDao;
	
	@Test
	public void testAdd() {
		UserRoleEntity userRole=new UserRoleEntity();
		userRole.setUserId("02460d0de0e811e89e01005056986f0b");
		userRole.setRoleId("ca60a67be17511e89e01005056986f0b");
		userRole.setCreateUserId("02460d0de0e811e89e01005056986f0b");
		userRole.setUpdateUserId("02460d0de0e811e89e01005056986f0b");
		int count=userRoleDao.add(userRole);
		checkOk(count);
	}
	
	@Test
	public void testGet() {
		UserRoleEntity userRole=userRoleDao.get("e3a604c0e18711e89e01005056986f0b");
		checkOk(userRole);
	}
	
	@Test
	public void testListByRoleId() {
		List<UserRoleEntity> userRoles=userRoleDao.listByRoleId("ca60a67be17511e89e01005056986f0b");
		checkOk(userRoles);
	}
}
