package com.sixliu.creditloan.credit.base.check;

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
public class CreditPreCheckForCustomer implements CreditApplyPreCheck {

	private CustomerManagerService customerManagerService;

	private CreditlimitManagerClient creditlimitManagerClient;

	public CreditPreCheckForCustomer(CustomerManagerService customerManagerService,
			CreditlimitManagerClient creditlimitManagerClient) {
		this.customerManagerService = customerManagerService;
		this.creditlimitManagerClient = creditlimitManagerClient;
	}

	@Override
	public void check(CreditApplyDTO creditApplyDTO) {
		CustomerDTO customer = customerManagerService.get(creditApplyDTO.getCustomerId());
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
