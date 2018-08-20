package com.sixliu.credit.user.entity;

import java.io.Serializable;

public class SysUserDataScopeKey implements Serializable {
    private String userCode;

    private String ctrlType;

    private String ctrlData;

    private String ctrlPermi;

    private static final long serialVersionUID = 1L;

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public String getCtrlType() {
        return ctrlType;
    }

    public void setCtrlType(String ctrlType) {
        this.ctrlType = ctrlType == null ? null : ctrlType.trim();
    }

    public String getCtrlData() {
        return ctrlData;
    }

    public void setCtrlData(String ctrlData) {
        this.ctrlData = ctrlData == null ? null : ctrlData.trim();
    }

    public String getCtrlPermi() {
        return ctrlPermi;
    }

    public void setCtrlPermi(String ctrlPermi) {
        this.ctrlPermi = ctrlPermi == null ? null : ctrlPermi.trim();
    }
}