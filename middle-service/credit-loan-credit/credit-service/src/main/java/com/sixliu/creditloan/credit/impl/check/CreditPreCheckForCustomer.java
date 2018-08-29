package com.sixliu.creditloan.credit.impl.check;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sixliu.creditloan.credit.base.check.CreditApplyPreCheck;
import com.sixliu.creditloan.credit.dto.CreditApplyDTO;
import com.sixliu.creditloan.creditlimit.dto.CreditlimitDTO;
import com.sixliu.creditloan.creditlimit.service.CreditlimitManagerClient;
import com.sixliu.creditloan.customer.dto.CustomerDTO;
import com.sixliu.creditloan.customer.service.CustomerManagerService;

/**
 * @author:MG01867
 * @date:2018年8月7日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 授信申请前置检查:检查客户
 */
@Component
public class CreditPreCheckForCustomer implements CreditApplyPreCheck {

	@Autowired
	private CustomerManagerService customerManagerClient;

	@Autowired
	private CreditlimitManagerClient creditlimitManagerClient;

	@Override
	public void check(CreditApplyDTO creditApplyDTO) {
		CustomerDTO customer = customerManagerClient.get(creditApplyDTO.getCustomerId());
		if (null == customer) {
			throw new IllegalArgumentException(
					String.format("The customer[%s] is non-existent", creditApplyDTO.getCustomerId()));
		}
		CreditlimitDTO customerCreditlimit = creditlimitManagerClient.get(customer.getCreditlimitId());
		if (null == customerCreditlimit) {
			throw new IllegalArgumentException(
					String.format("The customer[%s] is Illegal registered", customer.getId()));
		}
		if (!customerCreditlimit.getEffective()) {
			throw new IllegalArgumentException(String.format("The creditlimit[%s] of customer[%s] is not effective",
					customer.getCreditlimitId(), customer.getId()));
		}
	}

}
