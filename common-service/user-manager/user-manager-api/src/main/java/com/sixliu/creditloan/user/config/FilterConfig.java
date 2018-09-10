package com.sixliu.creditloan.user.config;


import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.web.filter.CharacterEncodingFilter;


/**
 * Filter 配置
 */
@Configuration
public class FilterConfig {


    /**
     * Encoding Filter
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
	@Bean
    @Order(1000)
    public FilterRegistrationBean characterEncodingFilter() {
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new CharacterEncodingFilter());
        bean.addInitParameter("encoding", "UTF-8");
        bean.addInitParameter("forceEncoding", "true");
        bean.addUrlPatterns("/*");
        return bean;
    }

    /**
     * Apache Shiro Filter
     * @throws Exception
     */
    @Bean
    @Order(3000)
    public FilterRegistrationBean shiroFilterProxy(ShiroFilterFactoryBean shiroFilter) throws Exception {
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(shiroFilter.getInstance());
        bean.addUrlPatterns("/*");
        return bean;
    }
}
