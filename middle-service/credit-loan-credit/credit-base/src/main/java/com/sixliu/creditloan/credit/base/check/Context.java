package com.sixliu.creditloan.credit.base.check;

import com.sixliu.credit.customer.CustomerDTO;
import com.sixliu.credit.product.dto.ProductInnerDTO;
import com.sixliu.credit.quota.CreditlimitDTO;
import com.sixliu.creditloan.credit.base.CreditOrderDTO;

import lombok.Data;

/**
 * @author:MG01867
 * @date:2018年8月7日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
@Data
public class Context {

	private CreditOrderDTO creditOrder;
	
	private ProductInnerDTO product;
	
	private CreditlimitDTO productCreditlimit;
	
	private CustomerDTO customer;
	
	private CreditlimitDTO customerCreditlimit;
}
