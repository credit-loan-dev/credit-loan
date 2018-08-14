package com.sixliu.credit.user.entity;

import java.io.Serializable;

public class SysUserRoleKey implements Serializable {
    private String userCode;

    private String roleCode;

    private static final long serialVersionUID = 1L;

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }
}