package com.sixliu.creditloan.order.config;

import org.springframework.cloud.openfeign.FeignClient;

import com.sixliu.creditloan.product.service.ProductManagerService;

/**
 * @author:MG01867
 * @date:2018年7月9日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
@FeignClient("product-manager")
public interface ProductManagerServiceConfig extends ProductManagerService{
	
}
