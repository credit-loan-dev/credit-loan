package com.sixliu.creditloan.credit.impl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.sixliu.creditloan.credit.base.check.CreditApplyPreCheckManager;
import com.sixliu.creditloan.credit.component.CreditOrderIdGenerator;
import com.sixliu.creditloan.credit.dto.CreditApplyDTO;
import com.sixliu.creditloan.credit.service.CreditShopService;
import com.sixliu.creditloan.order.dto.CreateCreditOrderDTO;
import com.sixliu.creditloan.order.service.OrderManagerService;
import com.sixliu.creditloan.product.service.ProductForCreditLoanService;

/**
 * @author:MG01867
 * @date:2018年8月6日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
@RestController
public class CreditShopServiceImpl implements CreditShopService {

	@Autowired
	private ProductForCreditLoanService productManagerClient;
	
	@Autowired
	private OrderManagerService orderManagerService;

	@Autowired
	private CreditApplyPreCheckManager creditApplyPreCheckManager;

	@Autowired
	private CreditOrderIdGenerator creditOrderIdGenerator;

	@Override
	public String apply(CreditApplyDTO creditApplyDTO) {
		creditApplyPreCheckManager.check(creditApplyDTO);
		String productSnapshotId = productManagerClient.generateProductSnapshot(creditApplyDTO.getProductId());
		String id = creditOrderIdGenerator.generator(creditApplyDTO.getProductId());
		CreateCreditOrderDTO createCreditOrder = new CreateCreditOrderDTO();
		createCreditOrder.setActivityId(id);
		createCreditOrder.setCustomerId(creditApplyDTO.getCustomerId());
		createCreditOrder.setProductId(creditApplyDTO.getProductId());
		createCreditOrder.setProductSnapshotId(productSnapshotId);
		createCreditOrder.setApplyCreditlimit(creditApplyDTO.getApplyCreditlimit());
		createCreditOrder.setApplyLoanTermType(creditApplyDTO.getApplyLoanTermType());
		createCreditOrder.setApplyLoanTerm(creditApplyDTO.getApplyLoanTerm());
		createCreditOrder.setReferenceId(creditApplyDTO.getReferenceId());
		createCreditOrder.setChannelId(creditApplyDTO.getChannelId());
		createCreditOrder.setActivityId(creditApplyDTO.getActivityId());
		createCreditOrder.setExtendForm(creditApplyDTO.getExtendForm());
		createCreditOrder.setInputUserId(creditApplyDTO.getInputUserId());
		String createOrderId = orderManagerService.createOrder(createCreditOrder);
		return createOrderId;
	}

	@Override
	public List<String> listByCustomerid(String customerId) {
		return null;
	}
}
