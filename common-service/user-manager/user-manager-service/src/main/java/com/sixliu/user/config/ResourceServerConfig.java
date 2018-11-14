package com.sixliu.user.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

/**
 * @author:MG01867
 * @date:2018年11月12日
 * @email:359852326@qq.com
 * @version:
 * @describe TODO
 */
@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

	@Autowired
	private SavedRequestAwareAuthenticationSuccessHandler authenticationSuccessHandler;

	@Autowired
	private SimpleUrlAuthenticationFailureHandler authenticationFailHandler;

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		// 表单登录 方式
		http.formLogin().loginPage("/html/login.html")
				// 登录需要经过的url请求
				.loginProcessingUrl("/authentication/form").successHandler(authenticationSuccessHandler)
				.failureHandler(authenticationFailHandler);
		http.authorizeRequests().antMatchers("/*").authenticated().antMatchers("/oauth/*").permitAll().anyRequest()
				.permitAll().and()
				// 关闭跨站请求防护
				.csrf().disable();
	}
}
