package com.sixliu.creditloan.order.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sixliu.creditloan.order.dto.CreateCreditOrderDTO;
import com.sixliu.creditloan.order.dto.OrderMutexDTO;

/**
*@author:MG01867
*@date:2018年8月7日
*@E-mail:359852326@qq.com
*@version:
*@describe 订单管理客户端
*/
@FeignClient("order-manager")
public interface OrderManagerService {

	/**
	 * 创建授信申请订单
	 * @param order
	 * @return	返回订单id
	 */
	@RequestMapping(value = "/order/getOrder", method = RequestMethod.POST)
	CreateCreditOrderDTO getOrder(String orderId);
	
	/**
	 * 创建授信申请订单
	 * @param order
	 * @return	返回订单id
	 */
	@RequestMapping(value = "/order/createOrder", method = RequestMethod.POST)
	String createOrder(CreateCreditOrderDTO createCreditOrder);
	
	/**
	 * 是否有互斥的订单
	 * @param orderMutex
	 * @return
	 */
	@RequestMapping(value = "/order/hasMutexOrder", method = RequestMethod.POST)
	Boolean hasMutexOrder(OrderMutexDTO orderMutex);
	
	/**
	 * 创建授信申请订单
	 * @param order
	 * @return	返回订单id
	 */
	@RequestMapping(value = "/order/cancelOrder", method = RequestMethod.POST)
	Boolean cancelOrder(@RequestParam(name="customerId")String customerId,@RequestParam(name="orderId")String orderId);
}
