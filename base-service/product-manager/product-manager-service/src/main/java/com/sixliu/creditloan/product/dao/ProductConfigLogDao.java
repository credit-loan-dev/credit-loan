package com.sixliu.creditloan.product.dao;

import java.util.List;

import com.sixliu.creditloan.product.entity.ProductConfig;
import com.sixliu.creditloan.product.entity.change.ProductConfigChange;

/**
*@author:MG01867
*@date:2018年6月28日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
public interface ProductConfigLogDao {


	ProductConfigChange getById(String id);
	
	List<ProductConfig> listByCode(String code);
	
	List<ProductConfig> listByOriginalId(String typeId);
	
	int insert(ProductConfigChange productConfigLog);
	
}
