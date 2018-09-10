/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.sixliu.credit.rbac.filter;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.util.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 权限字符串过滤器
 * @author ThinkGem
 * @version 2017-03-22
 */
public class PermissionsAuthorizationFilter extends org.apache.shiro.web.filter.authz.PermissionsAuthorizationFilter {

	@Override
	protected void redirectToLogin(ServletRequest request, ServletResponse response) throws IOException {
		PermissionsAuthorizationFilter.redirectToDefaultPath(request, response);
	}
	
	@Override
	protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws IOException {
        return PermissionsAuthorizationFilter.redirectTo403Page(request, response);
    }
	
	/**
	 * 无访问权限时，跳转到403页面
	 * @param request
	 * @param response
	 * @return
	 * @throws IOException
	 * @author ThinkGem
	 */
	public static boolean redirectTo403Page(ServletRequest request, ServletResponse response) throws IOException {
        Subject subject = SecurityUtils.getSubject();
        // If the subject isn't identified, redirect to login URL
        if (subject.getPrincipal() == null) {
        	redirectToDefaultPath(request, response);
        } else {
        	try {
        		// 如果访问的是未授权页面，则直接转到403页面（2016-11-3）
				request.getRequestDispatcher("/error/403").forward(request, response);
			} catch (ServletException e) {
				throw new UnauthorizedException(e);
			}
        }
        return false;
    }
	
	/**
	 * 跳转登录页时，跳转到默认首页
	 */
	public static void redirectToDefaultPath(ServletRequest request, ServletResponse response) throws IOException {
		// AJAX不支持Redirect改用Forward
		String loginUrl = "";//PropertiesUtils.getInstance().getProperty("shiro.defaultPath");
		HttpServletRequest req = ((HttpServletRequest) request);
//		if (StringUtils.equals(req.getContextPath()+loginUrl, req.getRequestURI())){
//			loginUrl = PropertiesUtils.getInstance().getProperty("shiro.loginUrl");
//		}
		if (isAjaxRequest(req)) {
			try {
				request.getRequestDispatcher(loginUrl).forward(request, response);
			} catch (ServletException e) {
				e.printStackTrace();
			}
    	}else{
    		WebUtils.issueRedirect(request, response, loginUrl);
    	}
	}

	public static boolean isAjaxRequest(HttpServletRequest request){

		String accept = request.getHeader("accept");
		if (accept != null && accept.indexOf("application/json") != -1){
			return true;
		}

		String xRequestedWith = request.getHeader("X-Requested-With");
		if (xRequestedWith != null && xRequestedWith.indexOf("XMLHttpRequest") != -1){
			return true;
		}

		String uri = request.getRequestURI();
		if (inStringIgnoreCase(uri, ".json", ".xml")){
			return true;
		}

		String ajax = request.getParameter("__ajax");
		if (inStringIgnoreCase(ajax, "json", "xml")){
			return true;
		}

		return false;
	}

	/**
	 * 是否包含字符串
	 * @param str 验证字符串
	 * @param strs 字符串组
	 * @return 包含返回true
	 */
	public static boolean inStringIgnoreCase(String str, String... strs){
		if (str != null && strs != null){
			for (String s : strs){
				if (str.equalsIgnoreCase(trim(s))){
					return true;
				}
			}
		}
		return false;
	}

	public static String trim(String str) {
		return str == null ? null : str.trim();
	}
}
