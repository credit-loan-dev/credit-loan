package com.sixliu.user.authority;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.web.AuthenticationEntryPoint;

/**
 * @author:MG01867
 * @date:2018年11月12日
 * @email:359852326@qq.com
 * @version:
 * @describe //TODO
 */
@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {
	
	@Override
	public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
		
	}
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().exceptionHandling()
				.authenticationEntryPoint(new Http401AuthenticationEntryPoint("Bearer realm=\"webrealm\"")).and()
				.authorizeRequests().anyRequest().authenticated().and().httpBasic();
	}

	public static class Http401AuthenticationEntryPoint implements AuthenticationEntryPoint {

		private final String headerValue;

		public Http401AuthenticationEntryPoint(String headerValue) {
			this.headerValue = headerValue;
		}

		@Override
		public void commence(HttpServletRequest request, HttpServletResponse response,
				AuthenticationException authException) throws IOException, ServletException {
			response.setHeader("WWW-Authenticate", this.headerValue);
			response.sendError(HttpServletResponse.SC_UNAUTHORIZED, authException.getMessage());
		}

	}
}
