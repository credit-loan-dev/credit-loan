package com.sixliu.credit.user.config;


import com.sixliu.credit.rbac.config.FilterChainDefinitionMap;
import com.sixliu.credit.rbac.filter.LogoutFilter;
import com.sixliu.credit.rbac.filter.PermissionsAuthorizationFilter;
import com.sixliu.credit.rbac.filter.RolesAuthorizationFilter;
import com.sixliu.credit.rbac.filter.UserFilter;
import com.sixliu.credit.user.web.filter.FormAuthenticationFilter;
import com.sixliu.credit.user.web.realm.AuthorizingRealm;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;

import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import javax.servlet.Filter;
import java.util.Map;


/**
 * Shiro配置
 * @author ThinkGem
 * @version 2017年11月30日
 */
@SuppressWarnings("deprecation")
@Configuration
public class ShiroConfig {


	 /**
	 * Form登录过滤器
	 */
	private FormAuthenticationFilter shiroAuthcFilter(AuthorizingRealm authorizingRealm) {
		FormAuthenticationFilter bean = new FormAuthenticationFilter();
		bean.setAuthorizingRealm(authorizingRealm);
		return bean;
	}

	/**
	 * 登出过滤器
	 */
	private LogoutFilter shiroLogoutFilter() {
		return new LogoutFilter();
	}

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
	public AuthorizingRealm authorizingRealm() {

		HashedCredentialsMatcher hashedCredentialsMatcher = new HashedCredentialsMatcher();
		hashedCredentialsMatcher.setHashAlgorithmName("MD5");
		hashedCredentialsMatcher.setHashIterations(1024);
		hashedCredentialsMatcher.setStoredCredentialsHexEncoded(true);
		AuthorizingRealm bean = new AuthorizingRealm();
		bean.setCachingEnabled(false);
		bean.setCredentialsMatcher(hashedCredentialsMatcher);

		return bean;
	}

	/**
	 * Shiro认证过滤器
	 */
	@Bean
	public ShiroFilterFactoryBean shiroFilter(DefaultWebSecurityManager securityManager, AuthorizingRealm authorizingRealm) {
		ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();
		bean.setSecurityManager(securityManager);
		bean.setLoginUrl(Global.getProperty("shiro.loginUrl"));
		bean.setSuccessUrl(Global.getProperty("shiro.successUrl"));
		bean.setUnauthorizedUrl(Global.getProperty("shiro.unauthorizedUrl"));
		Map<String, Filter> filters = bean.getFilters();
		filters.put("authc", shiroAuthcFilter(authorizingRealm));
		filters.put("logout", shiroLogoutFilter());
		filters.put("perms", shiroPermsFilter());
		filters.put("roles", shiroRolesFilter());
		filters.put("user", shiroUserFilter());
		FilterChainDefinitionMap chains = new FilterChainDefinitionMap();
		chains.setFilterChainDefinitions(Global.getProperty("shiro.filterChainDefinitions"));
		chains.setDefaultFilterChainDefinitions(Global.getProperty("shiro.defaultFilterChainDefinitions"));
		bean.setFilterChainDefinitionMap(chains.getObject());
		return bean;
	}

	/**
	 * 定义Shiro安全管理配置
	 */
	@Bean
	public DefaultWebSecurityManager securityManager(AuthorizingRealm authorizingRealm) {
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
	
//	/**
//	 * 在方法中 注入 securityManager 进行代理控制
//	 */
//	@Bean
//	public MethodInvokingFactoryBean methodInvokingFactoryBean(DefaultWebSecurityManager securityManager) {
//		MethodInvokingFactoryBean bean = new MethodInvokingFactoryBean();
//		bean.setStaticMethod("org.apache.shiro.SecurityUtils.setSecurityManager");
//		bean.setArguments(new Object[] { securityManager });
//		return bean;
//	}
	
}
