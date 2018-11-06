package com.sixliu.user.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sixliu.user.BaseTest;
import com.sixliu.user.repository.dao.RoleResourceDao;
import com.sixliu.user.repository.entity.RoleResourceEntity;

/**
 * @author:MG01867
 * @date:2018年11月6日
 * @email:359852326@qq.com
 * @version:
 * @describe //TODO
 */
public class RoleResourceDaoTest extends BaseTest {

	@Autowired
	RoleResourceDao roleResourceDao;

	@Test
	public void testAdd() {
		RoleResourceEntity roleResource = new RoleResourceEntity();
		roleResource.setRoleId("ca60a67be17511e89e01005056986f0b");
		roleResource.setResourceId("b85e7251e18a11e89e01005056986f0b");
		roleResource.setCreateUserId("02460d0de0e811e89e01005056986f0b");
		roleResource.setUpdateUserId("02460d0de0e811e89e01005056986f0b");
		int count = roleResourceDao.add(roleResource);
		checkOk(count);
	}
	
	@Test
	public void testGet() {
		RoleResourceEntity roleResource =roleResourceDao.get("8dfc0c89e18d11e89e01005056986f0b");
		checkOk(roleResource);
	}

}
