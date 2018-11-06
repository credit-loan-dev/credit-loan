package com.sixliu.user.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sixliu.user.BaseTest;
import com.sixliu.user.repository.dao.RoleDao;
import com.sixliu.user.repository.entity.RoleEntity;

/**
*@author:MG01867
*@date:2018年11月6日
*@email:359852326@qq.com
*@version:
*@describe //TODO
*/
public class RoleDaoTest extends BaseTest{

	@Autowired
	RoleDao roleDao;
	
	@Test
	public void testAdd() {
		RoleEntity role=new RoleEntity();
		role.setName("初审岗位");
		role.setParentId(null);
		role.setCreateUserId("02460d0de0e811e89e01005056986f0b");
		role.setUpdateUserId("02460d0de0e811e89e01005056986f0b");
		int count=roleDao.add(role);
		checkOk(count);
	}
	
	@Test
	public void testGet() {
		RoleEntity role=roleDao.get("ca60a67be17511e89e01005056986f0b");
		checkOk(role);
	}

}
