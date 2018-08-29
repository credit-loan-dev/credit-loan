package com.sixliu.creditloan.product.dao.loan;

import java.util.List;

import com.sixliu.creditloan.product.entity.loan.LoanPriceConfig;

/**
*@author:MG01867
*@date:2018年8月29日
*@E-mail:359852326@qq.com
*@version:
*@describe 贷款产品-贷款配置-定价配置数据访问接口
*/
public interface LoanPriceConfigDao {

	LoanPriceConfig get(String id);
	
	List<LoanPriceConfig> listByProductId(String productId);
	
	int insert(LoanPriceConfig loanPriceConfig);
}
