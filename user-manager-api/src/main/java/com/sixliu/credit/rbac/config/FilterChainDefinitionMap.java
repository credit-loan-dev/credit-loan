package com.sixliu.credit.rbac.config;

import org.apache.shiro.config.Ini;
import org.apache.shiro.config.Ini.Section;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.FactoryBean;

public class FilterChainDefinitionMap implements FactoryBean<Section> {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());
    private String defaultFilterChainDefinitions;
    private String filterChainDefinitions;
    private Section section;

    public boolean isSingleton() {
        return false;
    }

    public void setFilterChainDefinitions(String filterChainDefinitions) {
        this.filterChainDefinitions = filterChainDefinitions;
    }

    public void setDefaultFilterChainDefinitions(String defaultFilterChainDefinitions) {
        this.defaultFilterChainDefinitions = defaultFilterChainDefinitions;
    }

    public FilterChainDefinitionMap() {
    }

    public Class<?> getObjectType() {
        return this.getClass();
    }

    public Section getObject() throws BeansException {
        if (this.section == null) {
            Ini ini = new Ini();
            ini.load(this.defaultFilterChainDefinitions);
            this.section = ini.getSection("");
            ini.load(this.filterChainDefinitions);
            this.section.putAll(ini.getSection(""));
            if (this.logger.isDebugEnabled()) {
                this.logger.debug("Shiro的URL过滤定义：{}", this.section.entrySet());
            }
        }
        return this.section;
    }


}