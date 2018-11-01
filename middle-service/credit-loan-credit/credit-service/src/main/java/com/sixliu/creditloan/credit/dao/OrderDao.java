package com.sixliu.creditloan.credit.dao;


import com.sixliu.creditloan.credit.entity.CreditOrder;

import java.util.List;

/**
*@author:MG01867
*@date: 2018年7月10日
*@email:359852326@qq.com
*@version:
*@describe //TODO
*/
public interface OrderDao {

	int insert(CreditOrder creditOrder);
	
	CreditOrder getOrderById(String orderId);
	
	List<CreditOrder> listOrderByCustomerId(String customerId);
	
	int delById(String orderId);
}
