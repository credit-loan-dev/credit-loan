package com.sixliu.creditloan.product.dao.creditlimit;

import java.util.List;

import com.sixliu.creditloan.product.entity.creditlimit.CreditlimitClassConfig;

/**
 * @author:MG01867
 * @date:2018年8月28日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 
 */
public interface CreditlimitClassConfigDao {

	CreditlimitClassConfig get(String id);

	List<CreditlimitClassConfig> getByProductId(String productId);

	int insert(CreditlimitClassConfig creditlimitClassConfig);
}
