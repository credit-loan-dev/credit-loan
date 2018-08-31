package com.sixliu.creditloan.customer.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sixliu.creditloan.customer.BaseTest;
import com.sixliu.creditloan.customer.constant.CustomerType;
import com.sixliu.creditloan.customer.constant.IDCardType;
import com.sixliu.creditloan.customer.entity.Customer;

/**
*@author:MG01867
*@date:2018年8月31日
*@E-mail:359852326@qq.com
*@version:
*@describe 客户数据访问接口单元测试
*/
public class CustomerDaoTest extends BaseTest{

	@Autowired
	CustomerDao customerDao;
	
	@Test
	public void testInsert() {
		Customer customer=new Customer();
		customer.setName("sixliu");
		customer.setType(CustomerType.PERSONAL);
		customer.setIdCardType(IDCardType.CN_IDCARD);
		customer.setIdCardCode("431225199005225433");
		customer.setPhoneNumber("18655566235");
		customer.setRemarks("remarks");
		customer.setCreateUserId("sixliu");
		customer.setUpdateUserId("sixliu");
		customerDao.insert(customer);
	}
}
