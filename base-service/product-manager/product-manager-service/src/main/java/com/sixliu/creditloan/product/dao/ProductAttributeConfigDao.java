package com.sixliu.creditloan.product.dao;

import java.util.List;

import com.sixliu.creditloan.product.entity.ProductAttributeConfig;

/**
*@author:MG01867
*@date:2018年6月21日
*@E-mail:359852326@qq.com
*@version:
*@describe 产品扩展属性配置数据访问接口
*/
public interface ProductAttributeConfigDao {

	ProductAttributeConfig get(String id);
	
	List<ProductAttributeConfig> listByOwnerId(String ownerId);
	
	int insert(ProductAttributeConfig productAttributeConfig);
	
	int delete(String id);
	
	int deleteByProductId(String productId);
}
