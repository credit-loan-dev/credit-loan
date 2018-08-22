package com.sixliu.creditloan.product;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author:MG01867
 * @date:2018年6月15日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 服务启动类
 */
@SpringCloudApplication
@EnableFeignClients
public class StartUp implements WebMvcConfigurer {

	static {
		/** 设置jetty maxFormContentSize 默认为10M **/
		System.setProperty("org.eclipse.jetty.server.Request.maxFormContentSize", String.valueOf(1024 * 1024 * 10));
	}

	public static void main(String[] args) {
		SpringApplication.run(StartUp.class,args);
	}

	/**
	 * 拦截器配置
	 */
	public void addInterceptors(InterceptorRegistry registry) {

	}
}