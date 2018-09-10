package com.sixliu.credit.rbac.filter;


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
import java.util.NoSuchElementException;

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
//        if (ServletUtils.isStaticFile(httpServletRequest.getRequestURI())) {
//            filterChain.doFilter(servletRequest, servletResponse);
//        } else {
            //String var6 = Global.getProperty("shiro.allowRequestMethods", "GET,POST");
            String allowRequestMethods = "GET,POST";
            if (!inStringIgnoreCase(httpServletRequest.getMethod(), allowRequestMethods.split(","))) {
                httpServletRequest.setAttribute("exception", new AuthorizationException("msg:访问安全过滤，限制只能"+allowRequestMethods+"请求方法！"));
                httpServletRequest.getRequestDispatcher("/error/403").forward(httpServletRequest, httpServletResponse);
            } else {
                //Global.getProperty("shiro.isAllowExternalSiteIframe", "true")
//                String isAllowExternalSiteIframe = "true";
//                if (!ObjectUtils.toBoolean(isAllowExternalSiteIframe)) {
//                    httpServletResponse.setHeader("X-Frame-Options", "SAMEORIGIN");
//                }

//                if (StringUtils.isNotBlank(allowRequestMethods = Global.getProperty("shiro.accessControlAllowOrigin"))) {
//                    httpServletResponse.setHeader("Access-Control-Allow-Origin", allowRequestMethods);
//                    httpServletResponse.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS");
//                    httpServletResponse.addHeader("Access-Control-Allow-Headers", "Origin, No-Cache, X-Requested-With, If-Modified-Since, Pragma, Last-Modified, Cache-Control, Expires, Content-Type, X-E4M-With");
//                }
                super.doFilterInternal(httpServletRequest, httpServletResponse, filterChain);
            }
        //}
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

    /**
     * 判断访问URI是否是静态文件请求
     * @throws Exception
     */
//    public static boolean isStaticFile(String uri){
//        if (staticFiles == null){
//            PropertiesUtils pl = PropertiesUtils.getInstance();
//            try{
//                staticFiles = StringUtils.split(pl.getProperty("web.staticFile"), ",");
//                staticFileExcludeUri = StringUtils.split(pl.getProperty("web.staticFileExcludeUri"), ",");
//            }catch(NoSuchElementException nsee){
//                ; // 什么也不做
//            }
//            if (staticFiles == null){
//                try {
//                    throw new Exception("检测到“jeesite.yml”中没有配置“web.staticFile”属性。"
//                            + "配置示例：\n#静态文件后缀\nweb.staticFile=.css,.js,.png,.jpg,.gif,"
//                            + ".jpeg,.bmp,.ico,.swf,.psd,.htc,.crx,.xpi,.exe,.ipa,.apk");
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        if (staticFileExcludeUri != null){
//            for (String s : staticFileExcludeUri){
//                if (StringUtils.contains(uri, s)){
//                    return false;
//                }
//            }
//        }
//        if (StringUtils.endsWithAny(uri, staticFiles)){
//            return true;
//        }
//        return false;
//    }
}
