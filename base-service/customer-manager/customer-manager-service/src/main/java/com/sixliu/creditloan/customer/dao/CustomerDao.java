package com.sixliu.creditloan.customer.dao;

import com.sixliu.creditloan.customer.entity.Customer;

/**
*@author:MG01867
*@date:2018年8月31日
*@E-mail:359852326@qq.com
*@version:
*@describe 客户数据访问接口
*/
public interface CustomerDao{

	 Customer get();
	 
	 int insert(Customer  customer);
}
