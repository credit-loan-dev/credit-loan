package com.sixliu.creditloan.product.dao.credit;

import com.sixliu.creditloan.product.entity.credit.ProductCreditConfig;

/**
*@author:MG01867
*@date:2018年8月24日
*@E-mail:359852326@qq.com
*@version:
*@describe 产品授信配置 数据访问接口
*/
public interface ProductCreditConfigDao {

	ProductCreditConfig get(String id);
	
	ProductCreditConfig getByProductId(String productId);
	
	int insert(ProductCreditConfig productCreditConfig);
}
