package com.sixliu.zipkin.service;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import zipkin2.server.internal.EnableZipkinServer;

/**
 * @author:MG01867
 * @date:2018年6月15日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
@SpringCloudApplication
@EnableFeignClients
@EnableZipkinServer
public class StartUp implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(StartUp.class,args);
	}
}