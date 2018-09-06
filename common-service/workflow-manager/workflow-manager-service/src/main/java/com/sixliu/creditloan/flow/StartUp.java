package com.sixliu.creditloan.flow;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.sixliu.creditloan.flow.dao.BaseDao;


/**
 * @author:MG01867
 * @date:2018年6月15日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 服务启动类
 */
@SpringCloudApplication
@EnableFeignClients
@EnableTransactionManagement 
@MapperScan(basePackageClasses=BaseDao.class)
public class StartUp implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(StartUp.class,args);
	}

	/**
	 * 拦截器配置
	 */
	public void addInterceptors(InterceptorRegistry registry) {

	}
}