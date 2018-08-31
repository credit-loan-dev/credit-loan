package com.sixliu.creditloan.customer.entity;

import com.sixliu.creditloan.customer.constant.CustomerType;
import com.sixliu.creditloan.customer.constant.IDCardType;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
*@author:MG01867
*@date:2018年8月31日
*@E-mail:359852326@qq.com
*@version:
*@describe 客户
*/
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Customer extends BaseEntity{

	/**客户名称**/
	private String name;
	
	/**客户类型**/
	private CustomerType type;
	
	/**客户证件类型**/
	private IDCardType idCardType;
	
	/**客户证件号码**/
	private String idCardCode;
	
	/**客户手机号码**/
	private String phoneNumber;
	
	/**客户基础额度id**/
	private String creditlimitId;
}
