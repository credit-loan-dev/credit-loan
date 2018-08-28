package com.sixliu.creditloan.product.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;

/**
*@author:MG01867
*@date:2018年8月28日
*@E-mail:359852326@qq.com
*@version:
*@describe 产品管理服务-基础服务接口
*/
@FeignClient("product-manager")
@Validated
public interface BaseService {

}
