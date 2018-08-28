package com.sixliu.creditloan.product.dao.creditlimit;

import com.sixliu.creditloan.product.entity.creditlimit.CreditlimitConfig;

/**
*@author:MG01867
*@date:2018年8月28日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
public interface CreditlimitConfigDao {

	CreditlimitConfig get(String id);
	
	CreditlimitConfig getByProductId(String productId);
	
	int insert(CreditlimitConfig creditlimitConfig);
}
