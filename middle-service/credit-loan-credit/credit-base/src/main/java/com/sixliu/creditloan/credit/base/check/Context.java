package com.sixliu.creditloan.credit.base.check;

import com.sixliu.creditloan.credit.base.CreditOrderDTO;
import com.sixliu.creditloan.creditlimit.dto.CreditlimitDTO;
import com.sixliu.creditloan.customer.dto.CustomerDTO;
import com.sixliu.creditloan.product.dto.ProductDTO;

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
	
	private ProductDTO product;
	
	private CreditlimitDTO productCreditlimit;
	
	private CustomerDTO customer;
	
	private CreditlimitDTO customerCreditlimit;
}
