package com.sixliu.credit.rbac.filter;


import com.sixliu.credit.common.config.Global;
import com.sixliu.credit.common.http.ServletUtils;
import com.sixliu.credit.common.lang.ObjectUtils;
import com.sixliu.credit.common.lang.StringUtils;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.web.filter.mgt.FilterChainResolver;
import org.apache.shiro.web.mgt.WebSecurityManager;
import org.apache.shiro.web.servlet.AbstractShiroFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class WebShiroFilter extends AbstractShiroFilter {


    public WebShiroFilter(WebSecurityManager webSecurityManager, FilterChainResolver filterChainResolver) {
        if (webSecurityManager == null) {
            throw new IllegalArgumentException("WebSecurityManager property cannot be null.");
        } else {
            setSecurityManager(webSecurityManager);
            if (filterChainResolver != null) {
                setFilterChainResolver(filterChainResolver);
            }
        }
    }

    public void doFilterInternal(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws ServletException, IOException {
        HttpServletRequest httpServletRequest = (HttpServletRequest)servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse)servletResponse;
        if (ServletUtils.isStaticFile(httpServletRequest.getRequestURI())) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            //String var6 = Global.getProperty("shiro.allowRequestMethods", "GET,POST");
            String allowRequestMethods = "GET,POST";
            if (!StringUtils.inStringIgnoreCase(httpServletRequest.getMethod(), allowRequestMethods.split(","))) {
                httpServletRequest.setAttribute("exception", new AuthorizationException("msg:访问安全过滤，限制只能"+allowRequestMethods+"请求方法！"));
                httpServletRequest.getRequestDispatcher("/error/403").forward(httpServletRequest, httpServletResponse);
            } else {
                //Global.getProperty("shiro.isAllowExternalSiteIframe", "true")
                String isAllowExternalSiteIframe = "true";
                if (!ObjectUtils.toBoolean(isAllowExternalSiteIframe)) {
                    httpServletResponse.setHeader("X-Frame-Options", "SAMEORIGIN");
                }

                if (StringUtils.isNotBlank(allowRequestMethods = Global.getProperty("shiro.accessControlAllowOrigin"))) {
                    httpServletResponse.setHeader("Access-Control-Allow-Origin", allowRequestMethods);
                    httpServletResponse.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS");
                    httpServletResponse.addHeader("Access-Control-Allow-Headers", "Origin, No-Cache, X-Requested-With, If-Modified-Since, Pragma, Last-Modified, Cache-Control, Expires, Content-Type, X-E4M-With");
                }
                super.doFilterInternal(httpServletRequest, httpServletResponse, filterChain);
            }
        }
    }
}
