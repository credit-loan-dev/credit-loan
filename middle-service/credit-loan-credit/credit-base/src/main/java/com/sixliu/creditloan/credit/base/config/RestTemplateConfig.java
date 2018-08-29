package com.sixliu.creditloan.credit.base.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
*@author:MG01867
*@date:2018年8月29日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
@Configuration
public class RestTemplateConfig {

	@Bean
	public RestTemplate restTemplate() {
	  return new RestTemplate();
	}
}
