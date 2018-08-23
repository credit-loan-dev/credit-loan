package com.sixliu.creditloan.product.dao;

import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sixliu.creditloan.product.BaseTest;
import com.sixliu.creditloan.product.dao.ProductConfigDao;
import com.sixliu.creditloan.product.entity.ProductConfig;

/**
 * @author:MG01867
 * @date:2018年6月15日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
public class ProductConfigDaoTest extends BaseTest {

	@Autowired
	ProductConfigDao productDao;

	@Test
	public void testInsert() {
		ProductConfig productConfig=new ProductConfig();
		productConfig.setCode("JLD");
		productConfig.setName("居乐贷"+System.currentTimeMillis());
		productConfig.setTypeId("1");
		productConfig.setPriority(1);
		productConfig.setEffective(false);
		productConfig.setEffectiveDate(new Date());
		productConfig.setExpireDate(new Date());
		productConfig.setRemarks("remarks");
		productConfig.setCreateUserId("sixliu");
		productConfig.setUpdateUserId("sixliu");
		int result=productDao.insert(productConfig);
		assertTrue(1==result);
	}

	@Test
	public void testGetById() {
		String id="f7d60464-8011-4c54-8ee1-218aac4bf535";
		ProductConfig productConfig=productDao.get(id);
		assertTrue(null==productConfig||null!=productConfig);
	}

	@Test
	public void testGetByCode() {
		String code="JLD";
		ProductConfig productConfig=productDao.getByCode(code);
		assertTrue(null==productConfig||null!=productConfig);
	}
	
	@Test
	public void testDelete() {
		String id="aec8c173-17d9-40c3-aebc-8f8d2b6d014a";
		int result=productDao.delete(id);
		assertTrue(1==result||1!=result);
	}
	
	@Test
	public void testDeleteByCode() {
		String code="JLD";
		int result=productDao.deleteByCode(code);
		assertTrue(1==result||1!=result);
	}
}