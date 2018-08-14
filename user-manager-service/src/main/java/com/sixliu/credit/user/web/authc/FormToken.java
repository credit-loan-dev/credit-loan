package com.sixliu.credit.user.web.authc;


import org.apache.shiro.authc.UsernamePasswordToken;

import java.util.Map;

public class FormToken extends UsernamePasswordToken {
    private String captcha;
    private String ssoToken;
    private Map<String, Object> params;
    private static final long serialVersionUID = 1L;

    public String getCaptcha() {
        return this.captcha;
    }

    public String getSsoToken() {
        return this.ssoToken;
    }

    public void setPassword(String password) {
        this.setPassword(password != null ? password.toCharArray() : null);
    }

    public FormToken(String username, String password, boolean rememberMe, String host, String captcha, Map<String, Object> var6) {
        super(username, password, rememberMe, host);
        this.captcha = captcha;
        this.params = var6;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public FormToken() {
    }

    public Map<String, Object> getParams() {
        return this.params;
    }

    public void setSsoToken(String ssoToken) {
        this.ssoToken = ssoToken;
    }

    public FormToken(String username, char[] password, boolean rememberMe, String host, String captcha, Map<String, Object> var6) {
        super(username, password, rememberMe, host);
        this.captcha = captcha;
        this.params = var6;
    }
}
