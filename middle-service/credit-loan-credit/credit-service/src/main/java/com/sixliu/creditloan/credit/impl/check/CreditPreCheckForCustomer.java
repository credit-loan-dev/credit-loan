package com.sixliu.creditloan.credit.impl.check;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sixliu.creditloan.credit.base.CreditOrderDTO;
import com.sixliu.creditloan.credit.base.check.Context;
import com.sixliu.creditloan.credit.base.check.CreditPreCheck;
import com.sixliu.creditloan.credit.base.check.CreditPreCheckException;
import com.sixliu.creditloan.creditlimit.dto.CreditlimitDTO;
import com.sixliu.creditloan.creditlimit.service.CreditlimitManagerClient;
import com.sixliu.creditloan.customer.dto.CustomerDTO;
import com.sixliu.creditloan.customer.service.CustomerManagerService;
import com.sixliu.creditloan.product.dto.ProductDTO;

/**
 * @author:MG01867
 * @date:2018年8月7日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
@Component
public class CreditPreCheckForCustomer implements CreditPreCheck {

	@Autowired
	private CustomerManagerService customerManagerClient;

	@Autowired
	private CreditlimitManagerClient quotaManagerClient;

	@Override
	public void check(Context context) {
		CreditOrderDTO creditOrder= context.getCreditOrder();
		ProductDTO product = context.getProduct();
		CustomerDTO customer = customerManagerClient.getAndHitBlacklist(creditOrder.getCustomerId(),
				product.getCode());
		if (null == customer) {
			throw new CreditPreCheckException(
					String.format("The customer[%s] is non-existent", creditOrder.getCustomerId()));
		}
		if (customer.isHitBlacklist()) {
			throw new CreditPreCheckException(String.format("The customer[%s] is hit blacklist[%s]",
					customer.getId(), product.getCode()));
		}
		context.setCustomer(customer);
		if(null!=product.getCreditlimitId()) {
			CreditlimitDTO customerCreditlimit = quotaManagerClient.get(customer.getCreditlimitId());
			if (null == customerCreditlimit) {
				throw new CreditPreCheckException(
						String.format("The customer[%s] is Illegal registered", customer.getId()));
			}
			if (!customerCreditlimit.getEffective()) {
				throw new CreditPreCheckException(String.format("The creditlimit[%s] of customer[%s] is not effective",
						customer.getCreditlimitId(), customer.getId()));
			}
			context.setCustomerCreditlimit(customerCreditlimit);
		}
	}

}
