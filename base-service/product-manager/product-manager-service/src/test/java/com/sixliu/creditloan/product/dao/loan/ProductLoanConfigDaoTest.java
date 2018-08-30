package com.sixliu.creditloan.product.dao.loan;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sixliu.creditloan.product.BaseTest;
import com.sixliu.creditloan.product.constant.LoanTermType;
import com.sixliu.creditloan.product.dao.ProductConfigDao;
import com.sixliu.creditloan.product.entity.ProductConfig;
import com.sixliu.creditloan.product.entity.loan.ProductLoanConfig;

/**
*@author:MG01867
*@date:2018年8月30日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
public class ProductLoanConfigDaoTest extends BaseTest {

	@Autowired
	ProductConfigDao productConfigDao;
	
	@Autowired
	ProductLoanConfigDao productLoanConfigDao;

	@Test
	public void testInsert() {
		ProductConfig productConfig=productConfigDao.get("c43d00de-9d29-11e8-9e01-005056986f0b");
		if(null!=productConfig) {
			ProductLoanConfig productLoanConfig=new ProductLoanConfig();
			productLoanConfig.setProductId(productConfig.getId());
			productLoanConfig.setFlowJobModleId("FlowJobModleId");
			productLoanConfig.setMinSingleLoanAmount(100d);
			productLoanConfig.setMaxSingleLoanAmount(100000d);
			productLoanConfig.setLoanTermType(LoanTermType.MONTH);
			productLoanConfig.setMinSingleLoanTerm(3);
			productLoanConfig.setMaxSingleLoanTerm(36);
			productLoanConfig.setRemarks("remarks");
			productLoanConfig.setCreateUserId("sixliu");
			productLoanConfig.setUpdateUserId("sixliu");
			productLoanConfigDao.insert(productLoanConfig);
		}
		checkOk(productConfig);
	}
	
	@Test
	public void testGet() {
		ProductLoanConfig productLoanConfig=productLoanConfigDao.get("50687c74-ac28-11e8-9e01-005056986f0b");
		checkOk(productLoanConfig);
	}

}
