package com.sixliu.user.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sixliu.user.BaseTest;
import com.sixliu.user.constant.ResourceType;
import com.sixliu.user.repository.dao.ResourceDao;
import com.sixliu.user.repository.entity.ResourceEntity;

/**
*@author:MG01867
*@date:2018年11月6日
*@email:359852326@qq.com
*@version:
*@describe //TODO
*/
public class ResourceDaoTest extends BaseTest{

	@Autowired
	ResourceDao resourceDao;
	
	@Test
	public void testAdd() {
		ResourceEntity resource=new ResourceEntity();
		resource.setName("产品管理");
		resource.setType(ResourceType.MENU);
		resource.setPath("/product/manager");
		resource.setParentId(null);
		resource.setCreateUserId("02460d0de0e811e89e01005056986f0b");
		resource.setUpdateUserId("02460d0de0e811e89e01005056986f0b");
		int count=resourceDao.add(resource);
		checkOk(count);
	}
	
	@Test
	public void testGet() {
		ResourceEntity resource=resourceDao.get("b85e7251e18a11e89e01005056986f0b");
		checkOk(resource);
	}
	
	@Test
	public void testListByAppId() {
		List<ResourceEntity> resources=resourceDao.listByAppId("18ded2a1e65311e89e01005056986f0b");
		checkOk(resources);
	}

}
