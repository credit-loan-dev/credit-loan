package com.sixliu.creditloan.product.dao;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.UUID;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sixliu.creditloan.product.BaseTest;
import com.sixliu.creditloan.product.dao.ProductTypeDao;
import com.sixliu.creditloan.product.entity.ProductTypeConfig;

/**
 * @author:MG01867
 * @date:2018年6月15日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
public class ProductTypeDaoTest extends BaseTest {

	@Autowired
	ProductTypeDao productTypeDao;

	@Test
	public void testInsert() {
		ProductTypeConfig productType=new ProductTypeConfig();
		productType.setId(UUID.randomUUID().toString());
		productType.setName("居乐贷"+System.currentTimeMillis());
		productType.setParentId(null);
		productType.setCreateUserId("sixliu");
		productType.setUpdateUserId("sixliu");
		int result=productTypeDao.insert(productType);
		assertFalse(1!=result);
	}
	
	@Test
	public void testListAll() {
		productTypeDao.listAll();
		assertFalse(false);
	}
	
	@Test
	public void testGetById() {
		List<ProductTypeConfig> result=productTypeDao.listAll();
		if(null!=result&&result.size()>0) {
			ProductTypeConfig item=result.get(0);
			ProductTypeConfig getByIdResult=productTypeDao.getById(item.getId());
			assertNotNull(getByIdResult);
		}else {
			assertFalse(false);
		}
	}
}