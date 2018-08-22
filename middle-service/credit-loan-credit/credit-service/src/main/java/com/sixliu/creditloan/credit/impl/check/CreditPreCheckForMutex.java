package com.sixliu.creditloan.credit.impl.check;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sixliu.creditloan.credit.base.check.Context;
import com.sixliu.creditloan.credit.base.check.CreditPreCheck;
import com.sixliu.creditloan.credit.base.check.CreditPreCheckException;
import com.sixliu.creditloan.customer.dto.CustomerDTO;
import com.sixliu.creditloan.order.dto.OrderMutexDTO;
import com.sixliu.creditloan.order.service.OrderManagerService;
import com.sixliu.creditloan.product.CreditApplyMutexType;
import com.sixliu.creditloan.product.dto.ProductDTO;

/**
 * @author:MG01867
 * @date:2018年8月7日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 产品授信申请互斥检查
 */
@Component
public class CreditPreCheckForMutex implements CreditPreCheck {

	@Autowired
	private OrderManagerService orderManagerService;

	@Override
	public void check(Context context) {
		ProductDTO product = context.getProduct();
		CustomerDTO customer = context.getCustomer();
		boolean pass = true;
		if (CreditApplyMutexType.NONE != product.getCreditApplyMutexType()) {
			OrderMutexDTO orderMutex = new OrderMutexDTO();
			orderMutex.setCustomerId(customer.getId());
			orderMutex.setProductTypeId(product.getTypeId());
			orderMutex.setProductId(product.getId());
			pass = orderManagerService.hasMutexOrder(orderMutex);
		}
		if (!pass) {
			throw new CreditPreCheckException(String.format("The customer[%s] has already credit order of product[%s]",
					customer.getId(), product.getId()));
		}
	}

}
