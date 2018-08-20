package com.sixliu.credit.user.entity;

import java.io.Serializable;

public class SysEmployeePostKey implements Serializable {
    private String empCode;

    private String postCode;

    private static final long serialVersionUID = 1L;

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode == null ? null : empCode.trim();
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode == null ? null : postCode.trim();
    }
}