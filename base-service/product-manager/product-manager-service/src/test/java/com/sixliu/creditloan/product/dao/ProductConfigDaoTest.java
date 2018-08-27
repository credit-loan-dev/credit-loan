package com.sixliu.creditloan.product.dao;

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
		productConfig.setCreditlimitId(String.valueOf(System.currentTimeMillis()));
		productConfig.setEffective(false);
		productConfig.setEffectiveDate(new Date());
		productConfig.setExpireDate(new Date());
		productConfig.setRemarks("remarks");
		productConfig.setCreateUserId("sixliu");
		productConfig.setUpdateUserId("sixliu");
		int result=productDao.insert(productConfig);
		checkOk(result);
	}

	@Test
	public void testGet() {
		String id="67ea4cf2-a6d4-11e8-8df1-000c29851249";
		ProductConfig productConfig=productDao.get(id);
		checkOk(productConfig);
	}

	@Test
	public void testGetByCode() {
		String code="JLD";
		ProductConfig productConfig=productDao.getByCode(code);
		checkOk(productConfig);
	}
	
	@Test
	public void testDelete() {
		String id="aec8c173-17d9-40c3-aebc-8f8d2b6d014a";
		int result=productDao.delete(id);
		checkOk(result);
	}
	
	@Test
	public void testDeleteByCode() {
		String code="JLD";
		int result=productDao.deleteByCode(code);
		checkOk(result);
	}
}