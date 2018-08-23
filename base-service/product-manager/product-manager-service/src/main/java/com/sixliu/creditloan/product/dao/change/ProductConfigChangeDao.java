package com.sixliu.creditloan.product.dao.change;

import com.sixliu.creditloan.product.entity.change.ProductConfigChange;

/**
*@author:MG01867
*@date:2018年8月23日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
public interface ProductConfigChangeDao {

	ProductConfigChange get(String id);
	
	int insert(ProductConfigChange productConfig);
	
	int delete(String id);
}
