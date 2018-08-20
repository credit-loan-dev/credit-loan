package com.sixliu.credit.user.web.realm;

import com.sixliu.credit.common.collect.MapUtils;
import com.sixliu.credit.common.lang.StringUtils;
import com.sixliu.credit.user.entity.SysUser;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

public class LoginInfo implements Serializable {
    private Map<String, Object> params;
    private static final long serialVersionUID = 1L;
    private String name;
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public LoginInfo(SysUser user, Map<String, Object> var2) {
        this.id = user.getUserCode();
        this.name = user.getUserName();
        this.params = var2;
    }

    public String getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }

    public void setParam(String key, String value) {
        if (this.params == null) {
            this.params = MapUtils.newHashMap();
        }

        this.params.put(key, value);
    }

    public String getParam(String key, String defaultValue) {
        String a;
        return StringUtils.isNotBlank(a = this.getParam(key)) ? a : defaultValue;
    }

    public String getParam(String key) {
        Object a;
        return this.params != null && (a = this.params.get(key)) != null ? a.toString() : null;
    }

    public String toString() {
        return this.id;
    }

    public LoginInfo() {
    }

    public int hashCode() {
        return Objects.hashCode(this.id);
    }

    public Map<String, Object> getParams() {
        return this.params;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            LoginInfo a = (LoginInfo)obj;
            if (this.getId() == null) {
                if (a.getId() != null) {
                    return false;
                }
            } else if (!this.getId().equals(a.getId())) {
                return false;
            }

            return true;
        }
    }
}
