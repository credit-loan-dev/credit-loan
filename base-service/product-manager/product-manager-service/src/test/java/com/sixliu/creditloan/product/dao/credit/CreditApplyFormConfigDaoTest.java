package com.sixliu.creditloan.product.dao.credit;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sixliu.creditloan.product.BaseTest;
import com.sixliu.creditloan.product.entity.credit.CreditApplyFormConfig;
import com.sixliu.creditloan.product.entity.credit.ProductCreditConfig;

/**
 * @author:MG01867
 * @date:2018年8月28日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
public class CreditApplyFormConfigDaoTest extends BaseTest {

	@Autowired
	ProductCreditConfigDao productCreditConfigDao;

	@Autowired
	CreditApplyFormConfigDao creditApplyFormConfigDao;

	@Test
	public void testInsert() {
		ProductCreditConfig productCreditConfig = productCreditConfigDao.get("d2af2173-a746-11e8-9e01-005056986f0b");
		if (null != productCreditConfig) {
			CreditApplyFormConfig creditApplyFormConfig = new CreditApplyFormConfig();
			creditApplyFormConfig.setProductId(productCreditConfig.getId());
			creditApplyFormConfig.setGroup("group");
			creditApplyFormConfig.setIndex(0);
			creditApplyFormConfig.setName("name");
			creditApplyFormConfig.setValue("sixliu");
			creditApplyFormConfig.setRemarks("remarks");
			creditApplyFormConfig.setCreateUserId("sixliu");
			creditApplyFormConfig.setUpdateUserId("sixliu");
			creditApplyFormConfigDao.insert(creditApplyFormConfig);
		}
		checkOk(productCreditConfig);
	}

}
