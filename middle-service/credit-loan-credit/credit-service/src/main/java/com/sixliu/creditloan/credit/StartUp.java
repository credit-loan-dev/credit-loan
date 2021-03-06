package com.sixliu.creditloan.credit;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.sixliu.creditloan.credit.base.CreditBase;
import com.sixliu.creditloan.creditlimit.CreditlimitManagerApi;
import com.sixliu.creditloan.customer.CustomerManagerApi;
import com.sixliu.creditloan.product.ProductManagerApi;

/**
 * @author:MG01867
 * @date:2018年6月15日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 启动类
 */
@SpringCloudApplication
@ComponentScan(basePackageClasses = { StartUp.class, CreditBase.class })
@EnableFeignClients(basePackageClasses = { CreditlimitManagerApi.class, CustomerManagerApi.class,
		ProductManagerApi.class})
public class StartUp implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(StartUp.class);
	}

	/**
	 * 拦截器配置
	 */
	public void addInterceptors(InterceptorRegistry registry) {

	}
}