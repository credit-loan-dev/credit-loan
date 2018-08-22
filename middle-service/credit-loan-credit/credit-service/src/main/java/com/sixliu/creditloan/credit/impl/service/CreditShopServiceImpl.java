package com.sixliu.creditloan.credit.impl.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.sixliu.creditloan.credit.CreditApplyDTO;
import com.sixliu.creditloan.credit.base.CreditOrderDTO;
import com.sixliu.creditloan.credit.base.check.Context;
import com.sixliu.creditloan.credit.base.check.CreditPreCheckPiping;
import com.sixliu.creditloan.credit.base.component.CreditOrderIdGenerator;
import com.sixliu.creditloan.credit.service.CreditShopService;
import com.sixliu.creditloan.customer.dto.CustomerDTO;
import com.sixliu.creditloan.order.dto.CreateCreditOrderDTO;
import com.sixliu.creditloan.order.service.OrderManagerService;
import com.sixliu.creditloan.product.dto.ProductDTO;
import com.sixliu.creditloan.product.service.ProductManagerService;

/**
 * @author:MG01867
 * @date:2018年8月6日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
@RestController
public class CreditShopServiceImpl implements CreditShopService{

	@Autowired
	private ProductManagerService productManagerClient;

	@Autowired
	private OrderManagerService orderManagerService;

	private CreditPreCheckPiping creditPreCheckPiping;
	
	private CreditOrderIdGenerator creditOrderIdGenerator;
	
	public void init() {
		creditPreCheckPiping=new CreditPreCheckPiping();
	}

	@Override
	public String apply(CreditApplyDTO creditApply) {
		CreditOrderDTO creditOrder=new CreditOrderDTO();
		BeanUtils.copyProperties(creditApply, creditOrder);
		Context context =creditPreCheckPiping.check(creditOrder);
		ProductDTO product = context.getProduct();
		CustomerDTO customer = context.getCustomer();
		String productSnapshotId = productManagerClient.generateProductSnapshot(product.getId());
		String id=creditOrderIdGenerator.generator(product.getId());
		CreateCreditOrderDTO createCreditOrder = new CreateCreditOrderDTO();
		createCreditOrder.setActivityId(id);
		createCreditOrder.setCustomerId(customer.getId());
		createCreditOrder.setProductId(product.getId());
		createCreditOrder.setProductSnapshotId(productSnapshotId);
		createCreditOrder.setApplyCreditlimit(creditApply.getApplyCreditlimit());
		createCreditOrder.setApplyLoanTermType(creditApply.getApplyLoanTermType());
		createCreditOrder.setApplyLoanTerm(creditApply.getApplyLoanTerm());
		createCreditOrder.setReferenceId(creditApply.getReferenceId());
		createCreditOrder.setChannelId(creditApply.getChannelId());
		createCreditOrder.setActivityId(creditApply.getActivityId());
		createCreditOrder.setExtendForm(creditApply.getExtendForm());
		createCreditOrder.setInputUserId(creditApply.getInputUserId());
		String createOrderId=orderManagerService.createOrder(createCreditOrder);
		return createOrderId;
	}

	@Override
	public List<String> listByCustomerid(String customerId) {
		return null;
	}
}
