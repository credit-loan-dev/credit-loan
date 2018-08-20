/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.sixliu.credit.rbac.filter;

import com.sixliu.credit.common.config.Global;
import com.sixliu.credit.common.http.ServletUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.session.SessionException;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登出过滤器
 * @author ThinkGem
 * @version 2017-03-22
 */
public class LogoutFilter extends org.apache.shiro.web.filter.authc.LogoutFilter {
	
	private static final Logger log = LoggerFactory.getLogger(LogoutFilter.class);
	
	@Override
	protected boolean preHandle(ServletRequest request, ServletResponse response) throws Exception {
		try{
			Subject subject = getSubject(request, response);
	        String redirectUrl = getRedirectUrl(request, response, subject);
	        try {
	    		// 退出登录	
	    		subject.logout();
	        } catch (SessionException ise) {
	            log.debug("Encountered session exception during logout.  This can generally safely be ignored.", ise);
	        }
	        
	        // 如果是Ajax请求，返回Json字符串。
	 		if (ServletUtils.isAjaxRequest((HttpServletRequest)request)){
	 			ServletUtils.renderResult((HttpServletResponse)response, Global.TRUE, "logout success.");
	 			return false;
	 		}
	     	
	        issueRedirect(request, response, redirectUrl);
		}catch(Exception e){
			log.debug("Encountered session exception during logout.  This can generally safely be ignored.", e);
		}
		return false;
	}
	
	/**
	 * 登出跳转URL
	 */
	@Override
	protected String getRedirectUrl(ServletRequest request, ServletResponse response, Subject subject) {
		String url = Global.getProperty("shiro.logoutUrl");
		// 如果配置了登出之后跳转的url，并且url不能为 ${adminPath}/logout 否则会造成死循环。
		if (StringUtils.isNoneBlank(url) && !url.equals((Global.getAdminPath()+"/logout"))){
			return url;
		}
		return super.getRedirectUrl(request, response, subject);
	}
	
}
