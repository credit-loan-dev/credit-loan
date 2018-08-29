package com.sixliu.creditloan.product.dao.loan;

import com.sixliu.creditloan.product.entity.loan.ProductLoanConfig;

/**
*@author:MG01867
*@date:2018年8月29日
*@E-mail:359852326@qq.com
*@version:
*@describe 贷款产品-贷款配置数据访问接口
*/
public interface ProductLoanConfigDao {

	ProductLoanConfig get(String id);
	
	ProductLoanConfig getByProductId(String productId);
	
	int insert(ProductLoanConfig productLoanConfig);
}
