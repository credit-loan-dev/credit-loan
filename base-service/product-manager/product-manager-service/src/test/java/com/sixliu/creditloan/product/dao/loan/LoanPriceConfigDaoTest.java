package com.sixliu.creditloan.product.dao.loan;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sixliu.creditloan.product.BaseTest;
import com.sixliu.creditloan.product.constant.LoanTermType;
import com.sixliu.creditloan.product.constant.RepaymentStrategy;
import com.sixliu.creditloan.product.dao.ProductConfigDao;
import com.sixliu.creditloan.product.entity.ProductConfig;
import com.sixliu.creditloan.product.entity.loan.LoanPriceConfig;

/**
*@author:MG01867
*@date:2018年8月30日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
public class LoanPriceConfigDaoTest extends BaseTest {

	@Autowired
	ProductConfigDao productConfigDao;
	
	@Autowired
	LoanPriceConfigDao loanPriceConfigDao;

	@Test
	public void testInsert() {
		ProductConfig productConfig=productConfigDao.get("c43d00de-9d29-11e8-9e01-005056986f0b");
		if(null!=productConfig) {
			LoanPriceConfig loanPriceConfig=new LoanPriceConfig();
			loanPriceConfig.setName("测试定价");
			loanPriceConfig.setProductId(productConfig.getId());
			loanPriceConfig.setRepaymentStrategy(RepaymentStrategy.ECEI);
			loanPriceConfig.setMinSingleLoanAmount(100d);
			loanPriceConfig.setMaxSingleLoanAmount(100000d);
			loanPriceConfig.setLoanTermType(LoanTermType.MONTH);
			loanPriceConfig.setMinSingleLoanTerm(3);
			loanPriceConfig.setMaxSingleLoanTerm(36);
			loanPriceConfig.setPoundageRate(0.003);
			loanPriceConfig.setInterestRate(0.0005);
			loanPriceConfig.setPartnerEnable(true);
			loanPriceConfig.setPartnerId("partnerId");
			loanPriceConfig.setPartnerDiscountChargesRate(0.0003);
			loanPriceConfig.setLoanExtensionEnable(true);
			loanPriceConfig.setLoanExtensionMaxCount(3);
			loanPriceConfig.setLoanExtensionMaxTerm(1);
			loanPriceConfig.setLoanExtensionMaxTotalTerm(3);	
			loanPriceConfig.setLoanExtensionInterestRate(0.0005);			
			loanPriceConfig.setLoanOverdueEnable(true);
			loanPriceConfig.setLoanOverdueMaxCount(3);
			loanPriceConfig.setLoanOverdueMaxTerm(1);
			loanPriceConfig.setLoanOverdueMaxTotalTerm(3);
			loanPriceConfig.setLoanOverdueInterestRate(0.001);			
			loanPriceConfig.setEarlyRepaymentEnable(true);
			loanPriceConfig.setEarlyRepaymentInterestRate(0.001);
			loanPriceConfig.setRemarks("remarks");
			loanPriceConfig.setCreateUserId("sixliu");
			loanPriceConfig.setUpdateUserId("sixliu");
			loanPriceConfigDao.insert(loanPriceConfig);
		}
		checkOk(productConfig);
	}
	
	@Test
	public void testGet() {
		LoanPriceConfig loanPriceConfig=loanPriceConfigDao.get("04d5e691-ac2e-11e8-9e01-005056986f0b");
		checkOk(loanPriceConfig);
	}

}
