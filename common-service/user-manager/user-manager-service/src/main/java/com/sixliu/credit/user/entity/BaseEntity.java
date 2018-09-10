package com.sixliu.credit.user.entity;


import com.sixliu.credit.user.utils.lang.ObjectUtils;

public class BaseEntity {


    public Object clone() {
        return ObjectUtils.cloneBean(this);
    }

    public String alias(){
        return null;
    }
}
