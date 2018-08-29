package com.sixliu.creditloan.credit.impl.check;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sixliu.creditloan.credit.base.check.CreditApplyPreCheck;
import com.sixliu.creditloan.credit.dto.CreditApplyDTO;
import com.sixliu.creditloan.creditlimit.dto.CreditlimitDTO;
import com.sixliu.creditloan.creditlimit.service.CreditlimitManagerClient;
import com.sixliu.creditloan.order.dto.OrderMutexDTO;
import com.sixliu.creditloan.order.service.OrderManagerService;
import com.sixliu.creditloan.product.constant.CreditApplyMutexType;
import com.sixliu.creditloan.product.dto.ProductDTO;
import com.sixliu.creditloan.product.service.ProductConfigService;

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
	private ProductConfigService productManagerClient;

	@Autowired
	private CreditlimitManagerClient quotaManagerClient;
	
	@Autowired
	private OrderManagerService orderManagerService;


	@Override
	public void check(CreditApplyDTO creditApplyDTO) {
		ProductDTO productDTO = productManagerClient.get(creditApplyDTO.getProductId());
		if (null == productDTO) {
			throw new IllegalArgumentException(
					String.format("The product[%s] is non-existent", creditApplyDTO.getProductId()));
		}
		if (!productDTO.getEffective()) {
			throw new IllegalArgumentException(
					String.format("The product[%s] is not effective", creditApplyDTO.getProductId()));
		}
		checkBlanklist(creditApplyDTO, productDTO);
		CreditlimitDTO prductCreditlimit = quotaManagerClient.get(productDTO.getCreditlimitId());
		if (null == prductCreditlimit) {
			throw new IllegalArgumentException(
					String.format("The product[%s] is Illegal admittance", productDTO.getCreditlimitId()));
		}
		if (!prductCreditlimit.getEffective()) {
			throw new IllegalArgumentException(String.format("The creditlimit[%s] of product[%s] is not effective",
					productDTO.getCreditlimitId(), productDTO.getId()));
		}
		if (creditApplyDTO.getApplyCreditlimit() > prductCreditlimit.getSurplusAmount()) {
			throw new IllegalArgumentException(String.format("The creditlimit[%s] of product[%s] is not enough",
					productDTO.getCreditlimitId(), productDTO.getId()));
		}
		boolean pass = true;
		if (CreditApplyMutexType.NONE !=CreditApplyMutexType.FOR_ALL) {
			OrderMutexDTO orderMutex = new OrderMutexDTO();
			orderMutex.setCustomerId(creditApplyDTO.getCustomerId());
			orderMutex.setProductTypeId(productDTO.getTypeId());
			orderMutex.setProductId(productDTO.getId());
			pass = orderManagerService.hasMutexOrder(orderMutex);
		}
		if (!pass) {
			throw new IllegalArgumentException(String.format("The customer[%s] has already credit order of product[%s]",
					creditApplyDTO.getCustomerId(), productDTO.getId()));
		}
	}

	
	private void checkBlanklist(CreditApplyDTO creditApplyDTO,ProductDTO productDTO){
		
	}
}
