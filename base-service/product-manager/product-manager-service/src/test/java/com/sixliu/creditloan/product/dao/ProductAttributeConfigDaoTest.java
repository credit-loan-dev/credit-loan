package com.sixliu.creditloan.product.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sixliu.creditloan.product.BaseTest;
import com.sixliu.creditloan.product.entity.ProductAttributeConfig;
import com.sixliu.creditloan.product.entity.ProductConfig;

/**
*@author:MG01867
*@date:2018年6月28日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
public class ProductAttributeConfigDaoTest extends BaseTest {

	@Autowired
	ProductConfigDao productConfigDao;
	
	@Autowired
	ProductAttributeConfigDao productAttributeConfigDao;

	@Test
	public void testInsert() {
		List<ProductConfig> result=productConfigDao.listAll();
		if(null!=result&&!result.isEmpty()) {
			ProductConfig productConfig=result.get(0);
			ProductAttributeConfig productAttributeConfig=new ProductAttributeConfig();
			productAttributeConfig.setProductId(productConfig.getId());
			productAttributeConfig.setGroup("group");
			productAttributeConfig.setIndex(0);
			productAttributeConfig.setName("name");
			productAttributeConfig.setValue("value");
			productAttributeConfig.setRemarks("remarks");
			productAttributeConfig.setCreateUserId("sixliu");
			productAttributeConfig.setUpdateUserId("sixliu");
			productAttributeConfigDao.insert(productAttributeConfig);
		}
		checkOk(null);
	}
	
	@Test
	public void testGet() {
		ProductAttributeConfig productAttributeConfig=productAttributeConfigDao.get("1acb7a0f-a6dd-11e8-8df1-000c29851249");
		checkOk(productAttributeConfig);
	}
	
	@Test
	public void testListByProductId() {
		List<ProductAttributeConfig> productAttributeConfigs=productAttributeConfigDao.listByOwnerId("67ea4cf2-a6d4-11e8-8df1-000c29851249");
		checkOk(productAttributeConfigs);
	}
	
	@Test
	public void testDelete() {
		int result=productAttributeConfigDao.delete("1acb7a0f-a6dd-11e8-8df1-000c29851249");
		checkOk(result);
	}
	
	@Test
	public void testDeleteByProductId() {
		int result=productAttributeConfigDao.deleteByProductId("67ea4cf2-a6d4-11e8-8df1-000c29851249");
		checkOk(result);
	}

}
