package com.sixliu.creditloan.order.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sixliu.creditloan.order.dao.OrderDao;
import com.sixliu.creditloan.order.dto.CreateCreditOrderDTO;
import com.sixliu.creditloan.order.dto.OrderMutexDTO;
import com.sixliu.creditloan.order.entity.CreditOrder;
import com.sixliu.creditloan.order.service.OrderManagerService;
import com.sixliu.creditloan.product.dto.ProductCreditDTO;
import com.sixliu.creditloan.product.service.ProductForCreditLoanService;
import com.sixliu.creditloan.workflow.service.WorkflowRuntimeService;

/**
 * @author:MG01867
 * @date:2018年7月10日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 授信订单服务
 */
@Service
public class OrderManagerServiceImpl implements OrderManagerService {

	private OrderDao orderDao;

	@Autowired
	private ProductForCreditLoanService productManagerClient;

	private WorkflowRuntimeService workflowRuntimeService;

	@Override
	public String createOrder(CreateCreditOrderDTO createCreditOrder) {
		ProductCreditDTO product = productManagerClient.getProductCreditConfig(createCreditOrder.getProductId());
		String flowJobId = workflowRuntimeService.createJob(product.getId(),createCreditOrder.getInputUserId());
		CreditOrder creditOrder = new CreditOrder();
		creditOrder.setId(createCreditOrder.getId());
		creditOrder.setCustomerId(createCreditOrder.getCustomerId());
		creditOrder.setProductId(createCreditOrder.getProductId());
		creditOrder.setProductSnapshotId(createCreditOrder.getProductSnapshotId());
		creditOrder.setFlowJobId(flowJobId);
		creditOrder.setApplyCreditlimit(createCreditOrder.getApplyCreditlimit());
		creditOrder.setApplyLoanAmount(createCreditOrder.getApplyLoanAmount());
		creditOrder.setApplyLoanTermType(createCreditOrder.getApplyLoanTermType());
		creditOrder.setApplyLoanTerm(createCreditOrder.getApplyLoanTerm());
		creditOrder.setActivityId(createCreditOrder.getActivityId());
		creditOrder.setChannelId(createCreditOrder.getChannelId());
		creditOrder.setReferenceId(createCreditOrder.getReferenceId());
		creditOrder.setCreateUserId(createCreditOrder.getInputUserId());
		creditOrder.setCreateDate(new Date());
		orderDao.insert(creditOrder);
		return creditOrder.getId();
	}

	@Override
	public CreateCreditOrderDTO getOrder(String orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean hasMutexOrder(OrderMutexDTO orderMutex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean cancelOrder(String customerId, String orderId) {
		// TODO Auto-generated method stub
		return null;
	}

}
