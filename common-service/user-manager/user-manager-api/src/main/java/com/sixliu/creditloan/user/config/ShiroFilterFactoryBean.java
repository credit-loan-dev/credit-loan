package com.sixliu.creditloan.user.config;

import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.web.filter.mgt.FilterChainManager;
import org.apache.shiro.web.filter.mgt.PathMatchingFilterChainResolver;
import org.apache.shiro.web.mgt.WebSecurityManager;
import org.apache.shiro.web.servlet.AbstractShiroFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanInitializationException;

import com.sixliu.creditloan.user.filter.WebShiroFilter;

public class ShiroFilterFactoryBean extends org.apache.shiro.spring.web.ShiroFilterFactoryBean {
    private static final transient Logger log = LoggerFactory.getLogger(org.apache.shiro.spring.web.ShiroFilterFactoryBean.class);

    public Class<?> getObjectType() {
        return ShiroFilterFactoryBean.class;
    }

    public AbstractShiroFilter getInstance() throws Exception {
        return (AbstractShiroFilter)super.getObject();
    }

    protected AbstractShiroFilter createInstance() throws Exception {
        log.debug("Creating Shiro Filter instance.");
        SecurityManager securityManager = this.getSecurityManager();
        if (securityManager == null) {
            throw new BeanInitializationException("SecurityManager property must be set.");
        } else if (!(securityManager instanceof WebSecurityManager)) {
            throw new BeanInitializationException("The security manager does not implement the WebSecurityManager interface.");
        } else {
            FilterChainManager filterChainManager = this.createFilterChainManager();
            PathMatchingFilterChainResolver pathMatchingFilterChainResolver = new PathMatchingFilterChainResolver();
            pathMatchingFilterChainResolver.setFilterChainManager(filterChainManager);
            return new WebShiroFilter((WebSecurityManager)securityManager, pathMatchingFilterChainResolver);
        }
    }

    public Object getObject() throws Exception {
        return this;
    }

}