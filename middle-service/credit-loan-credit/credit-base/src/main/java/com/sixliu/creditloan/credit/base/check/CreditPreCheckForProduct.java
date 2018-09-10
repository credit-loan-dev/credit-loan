package com.sixliu.creditloan.credit.base.check;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sixliu.creditloan.credit.base.check.CreditApplyPreCheck;
import com.sixliu.creditloan.credit.dto.CreditApplyDTO;
import com.sixliu.creditloan.creditlimit.dto.CreditlimitDTO;
import com.sixliu.creditloan.creditlimit.service.CreditlimitManagerClient;
import com.sixliu.creditloan.order.dto.OrderMutexDTO;
import com.sixliu.creditloan.order.service.OrderManagerService;
import com.sixliu.creditloan.product.constant.CreditApplyMutexType;
import com.sixliu.creditloan.product.dto.ProductCreditDTO;
import com.sixliu.creditloan.product.service.ProductForCreditLoanService;

/**
 * @author:MG01867
 * @date:2018年8月7日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 授信申请前置检查:检查产品
 */
@Component
public class CreditPreCheckForProduct implements CreditApplyPreCheck {

	@Autowired
	private ProductForCreditLoanService productConfigService;

	@Autowired
	private CreditlimitManagerClient creditlimitManagerClient;

	@Autowired
	private OrderManagerService orderManagerService;

	public CreditPreCheckForProduct(ProductForCreditLoanService productConfigService,CreditlimitManagerClient creditlimitManagerClient,OrderManagerService orderManagerService) {
		this.productConfigService=productConfigService;
		this.creditlimitManagerClient=creditlimitManagerClient;
		this.orderManagerService=orderManagerService;
	}
	
	@Override
	public void check(CreditApplyDTO creditApplyDTO) {
		ProductCreditDTO productForCreditDTO = productConfigService.getProductCreditConfig(creditApplyDTO.getProductId());
		if (null == productForCreditDTO) {
			throw new IllegalArgumentException(
					String.format("The product[%s] is non-existent", creditApplyDTO.getProductId()));
		}
		if (!productForCreditDTO.getEffective()) {
			throw new IllegalArgumentException(
					String.format("The product[%s] is not effective", creditApplyDTO.getProductId()));
		}
		checkBlanklist(creditApplyDTO, productForCreditDTO);
		CreditlimitDTO prductCreditlimit = creditlimitManagerClient.get(productForCreditDTO.getCreditlimitId());
		if (null == prductCreditlimit) {
			throw new IllegalArgumentException(
					String.format("The product[%s] is Illegal admittance", productForCreditDTO.getCreditlimitId()));
		}
		if (!prductCreditlimit.getEffective()) {
			throw new IllegalArgumentException(String.format("The creditlimit[%s] of product[%s] is not effective",
					productForCreditDTO.getCreditlimitId(), productForCreditDTO.getId()));
		}
		if (creditApplyDTO.getApplyCreditlimit() > prductCreditlimit.getSurplusAmount()) {
			throw new IllegalArgumentException(String.format("The creditlimit[%s] of product[%s] is not enough",
					productForCreditDTO.getCreditlimitId(), creditApplyDTO.getProductId()));
		}
		boolean pass = true;
		if (CreditApplyMutexType.NONE != CreditApplyMutexType.FOR_ALL) {
			OrderMutexDTO orderMutex = new OrderMutexDTO();
			orderMutex.setCustomerId(creditApplyDTO.getCustomerId());
			orderMutex.setProductTypeId(productForCreditDTO.getTypeId());
			orderMutex.setProductId(productForCreditDTO.getId());
			pass = orderManagerService.hasMutexOrder(orderMutex);
		}
		if (!pass) {
			throw new IllegalArgumentException(String.format("The customer[%s] has already credit order of product[%s]",
					creditApplyDTO.getCustomerId(), productForCreditDTO.getId()));
		}
	}

	private void checkBlanklist(CreditApplyDTO creditApplyDTO, ProductCreditDTO productForCreditDTO) {

	}
}
