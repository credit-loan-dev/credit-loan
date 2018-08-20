package com.sixliu.credit.rbac.config;


import com.sixliu.credit.rbac.filter.*;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;

import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;

import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;



/**
 * Shiro配置
 * @author ThinkGem
 * @version 2017年11月30日
 */
@SuppressWarnings("deprecation")
@Configuration
public class ShiroConfig {


	/**
	 * 权限字符串过滤器
	 */
	private PermissionsAuthorizationFilter shiroPermsFilter() {
		return new PermissionsAuthorizationFilter();
	}

	/**
	 * 角色权限过滤器
	 */
	private RolesAuthorizationFilter shiroRolesFilter() {
		return new RolesAuthorizationFilter();
	}

	/**
	 * 用户权限过滤器
	 */
	private UserFilter shiroUserFilter() {
		return new UserFilter();
	}

	/**
	 * 系统安全认证实现类
	 */
	@Bean
	public AuthorizingUserRealm authorizingRealm() {

		HashedCredentialsMatcher hashedCredentialsMatcher = new HashedCredentialsMatcher();
		hashedCredentialsMatcher.setHashAlgorithmName("MD5");
		hashedCredentialsMatcher.setHashIterations(1024);
		hashedCredentialsMatcher.setStoredCredentialsHexEncoded(true);
		AuthorizingUserRealm bean = new AuthorizingUserRealm();
		bean.setCachingEnabled(false);
		bean.setCredentialsMatcher(hashedCredentialsMatcher);

		return bean;
	}


	/**
	 * 定义Shiro安全管理配置
	 */
	@Bean
	public DefaultWebSecurityManager securityManager(AuthorizingUserRealm authorizingRealm) {
		DefaultWebSecurityManager bean = new DefaultWebSecurityManager();
		bean.setRealm(authorizingRealm);

		return bean;
	}

	/**
	 * Shiro 生命周期处理器，实现初始化和销毁回调
	 */
	@Bean(name="lifecycleBeanPostProcessor")
	public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
		return new LifecycleBeanPostProcessor();
	}

	/**
	 * Shiro 过滤器代理配置
	 */
	@Bean
	@DependsOn({ "lifecycleBeanPostProcessor" })
	public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator() {
		DefaultAdvisorAutoProxyCreator bean = new DefaultAdvisorAutoProxyCreator();
		bean.setProxyTargetClass(true);
		return bean;
	}

	/**
	 * 启用Shrio授权注解拦截方式，AOP式方法级权限检查
	 */
	@Bean
	public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(DefaultWebSecurityManager securityManager) {
		AuthorizationAttributeSourceAdvisor bean = new AuthorizationAttributeSourceAdvisor();
		bean.setSecurityManager(securityManager);
		return bean;
	}
	

	
}
