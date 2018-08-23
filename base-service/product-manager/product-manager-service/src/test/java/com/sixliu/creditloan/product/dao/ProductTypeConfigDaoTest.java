package com.sixliu.creditloan.product.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sixliu.creditloan.product.BaseTest;
import com.sixliu.creditloan.product.dao.ProductTypeConfigDao;
import com.sixliu.creditloan.product.entity.ProductTypeConfig;

/**
 * @author:MG01867
 * @date:2018年6月15日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
public class ProductTypeConfigDaoTest extends BaseTest {

	@Autowired
	ProductTypeConfigDao productTypeDao;

	@Test
	public void testInsert() {
		ProductTypeConfig productType=new ProductTypeConfig();
		productType.setName("信用类"+System.currentTimeMillis());
		productType.setParentId(null);
		productType.setCreateUserId("sixliu");
		productType.setUpdateUserId("sixliu");
		int result=productTypeDao.insert(productType);
		checkOk(result);
	}
	
	@Test
	public void testListAll() {
		List<ProductTypeConfig> result=productTypeDao.listAll();
		checkOk(result);
	}
	
	@Test
	public void testGetById() {
		List<ProductTypeConfig> result=productTypeDao.listAll();
		ProductTypeConfig getByIdResult=null;
		if(null!=result&&result.size()>0) {
			ProductTypeConfig item=result.get(0);
			getByIdResult=productTypeDao.get(item.getId());
		}
		checkOk(getByIdResult);
	}
}