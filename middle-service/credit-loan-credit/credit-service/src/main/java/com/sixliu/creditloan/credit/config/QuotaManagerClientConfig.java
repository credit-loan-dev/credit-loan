package com.sixliu.creditloan.credit.config;

import org.springframework.cloud.openfeign.FeignClient;

import com.sixliu.credit.quota.api.QuotaManagerClient;

/**
*@author:MG01867
*@date:2018年8月21日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
@FeignClient("creditlimit-manager")
public interface QuotaManagerClientConfig extends QuotaManagerClient{

}
