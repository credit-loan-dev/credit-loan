package com.sixliu.creditloan.credit.config;


import org.springframework.cloud.openfeign.FeignClient;

import com.sixliu.credit.product.api.ProductManagerClient;

/**
 * @author:MG01867
 * @date:2018年7月9日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
@FeignClient("product-manager")
public interface ProductManagerClientConfig extends ProductManagerClient{
	
}
