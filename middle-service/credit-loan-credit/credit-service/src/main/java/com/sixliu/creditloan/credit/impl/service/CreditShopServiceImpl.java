package com.sixliu.creditloan.credit.impl.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sixliu.credit.common.dto.Response;
import com.sixliu.credit.customer.CustomerDTO;
import com.sixliu.credit.order.CreateCreditOrderDTO;
import com.sixliu.credit.order.api.OrderManagerClient;
import com.sixliu.credit.product.api.ProductManagerClient;
import com.sixliu.credit.product.dto.ProductInnerDTO;
import com.sixliu.creditloan.credit.base.CreditOrderDTO;
import com.sixliu.creditloan.credit.base.check.Context;
import com.sixliu.creditloan.credit.base.check.CreditPreCheckPiping;
import com.sixliu.creditloan.credit.base.component.CreditOrderIdGenerator;
import com.sixliu.creditloan.dto.CreditApplyDTO;
import com.sixliu.creditloan.service.CreditShopService;

/**
 * @author:MG01867
 * @date:2018年8月6日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
@Service
public class CreditShopServiceImpl implements CreditShopService {

	@Autowired
	private ProductManagerClient productManagerClient;

	@Autowired
	private OrderManagerClient orderManagerClient;

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
		ProductInnerDTO product = context.getProduct();
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
		Response<String> createOrderResult=orderManagerClient.createOrder(createCreditOrder);
		return createOrderResult.getResult();
	}

	@Override
	public List<String> listByCustomerid(String customerId) {
		return null;
	}
}
