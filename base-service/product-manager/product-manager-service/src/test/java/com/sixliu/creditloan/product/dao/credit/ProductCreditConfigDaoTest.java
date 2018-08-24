package com.sixliu.creditloan.product.dao.credit;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sixliu.creditloan.product.BaseTest;
import com.sixliu.creditloan.product.CreditApplyMutexType;
import com.sixliu.creditloan.product.dao.ProductConfigDao;
import com.sixliu.creditloan.product.entity.ProductConfig;
import com.sixliu.creditloan.product.entity.credit.ProductCreditConfig;

/**
*@author:MG01867
*@date:2018年8月24日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
public class ProductCreditConfigDaoTest extends BaseTest {

	@Autowired
	ProductConfigDao productConfigDao;
	
	@Autowired
	ProductCreditConfigDao productCreditConfigDao;

	@Test
	public void testInsert() {
		ProductConfig productConfig=productConfigDao.get("f7d60464-8011-4c54-8ee1-218aac4bf535");
		if(null!=productConfig) {
			ProductCreditConfig productCreditConfig=new ProductCreditConfig();
			productCreditConfig.setProductId(productConfig.getId());
			productCreditConfig.setCreditApplyMutexType(CreditApplyMutexType.FOR_ALL);
			productCreditConfig.setUseBlacklistGroupId("blacklistGroup");
			productCreditConfig.setLoopCreditlimit(true);
			productCreditConfig.setIncreaseCreditlimit(false);
			productCreditConfig.setDecreaseCreditlimit(false);
			productCreditConfig.setLinkCustomerBaseCreditlimit(true);
			productCreditConfig.setCreditApplyMaxMonths(4);
			productCreditConfig.setCreditApplyFlowModleId("flowJobMod");
			productCreditConfig.setCreditApplyRejectInfluenceDays(15);
			productCreditConfig.setMinCreditlimit(10000);
			productCreditConfig.setMaxCreditlimit(2000000);
			productCreditConfig.setCreditlimitEffectiveMonths(36);
			productCreditConfig.setRemarks("remarks");
			productCreditConfig.setCreateUserId("sixliu");
			productCreditConfig.setUpdateUserId("sixliu");
			productCreditConfigDao.insert(productCreditConfig);
		}
		checkOk(productConfig);
	}
	
	@Test
	public void testGet() {
		ProductCreditConfig productCreditConfig=productCreditConfigDao.get("d2af2173-a746-11e8-9e01-005056986f0b");
		checkOk(productCreditConfig);
	}
	
	@Test
	public void testGetByProductId() {
		ProductCreditConfig productCreditConfig=productCreditConfigDao.getByProductId("f7d60464-8011-4c54-8ee1-218aac4bf535");
		checkOk(productCreditConfig);
	}

}
