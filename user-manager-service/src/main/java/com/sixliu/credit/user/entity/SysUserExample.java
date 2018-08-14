package com.sixliu.credit.user.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUserCodeIsNull() {
            addCriterion("user_code is null");
            return (Criteria) this;
        }

        public Criteria andUserCodeIsNotNull() {
            addCriterion("user_code is not null");
            return (Criteria) this;
        }

        public Criteria andUserCodeEqualTo(String value) {
            addCriterion("user_code =", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotEqualTo(String value) {
            addCriterion("user_code <>", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThan(String value) {
            addCriterion("user_code >", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThanOrEqualTo(String value) {
            addCriterion("user_code >=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThan(String value) {
            addCriterion("user_code <", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThanOrEqualTo(String value) {
            addCriterion("user_code <=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLike(String value) {
            addCriterion("user_code like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotLike(String value) {
            addCriterion("user_code not like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeIn(List<String> values) {
            addCriterion("user_code in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotIn(List<String> values) {
            addCriterion("user_code not in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeBetween(String value1, String value2) {
            addCriterion("user_code between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotBetween(String value1, String value2) {
            addCriterion("user_code not between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andLoginCodeIsNull() {
            addCriterion("login_code is null");
            return (Criteria) this;
        }

        public Criteria andLoginCodeIsNotNull() {
            addCriterion("login_code is not null");
            return (Criteria) this;
        }

        public Criteria andLoginCodeEqualTo(String value) {
            addCriterion("login_code =", value, "loginCode");
            return (Criteria) this;
        }

        public Criteria andLoginCodeNotEqualTo(String value) {
            addCriterion("login_code <>", value, "loginCode");
            return (Criteria) this;
        }

        public Criteria andLoginCodeGreaterThan(String value) {
            addCriterion("login_code >", value, "loginCode");
            return (Criteria) this;
        }

        public Criteria andLoginCodeGreaterThanOrEqualTo(String value) {
            addCriterion("login_code >=", value, "loginCode");
            return (Criteria) this;
        }

        public Criteria andLoginCodeLessThan(String value) {
            addCriterion("login_code <", value, "loginCode");
            return (Criteria) this;
        }

        public Criteria andLoginCodeLessThanOrEqualTo(String value) {
            addCriterion("login_code <=", value, "loginCode");
            return (Criteria) this;
        }

        public Criteria andLoginCodeLike(String value) {
            addCriterion("login_code like", value, "loginCode");
            return (Criteria) this;
        }

        public Criteria andLoginCodeNotLike(String value) {
            addCriterion("login_code not like", value, "loginCode");
            return (Criteria) this;
        }

        public Criteria andLoginCodeIn(List<String> values) {
            addCriterion("login_code in", values, "loginCode");
            return (Criteria) this;
        }

        public Criteria andLoginCodeNotIn(List<String> values) {
            addCriterion("login_code not in", values, "loginCode");
            return (Criteria) this;
        }

        public Criteria andLoginCodeBetween(String value1, String value2) {
            addCriterion("login_code between", value1, value2, "loginCode");
            return (Criteria) this;
        }

        public Criteria andLoginCodeNotBetween(String value1, String value2) {
            addCriterion("login_code not between", value1, value2, "loginCode");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNull() {
            addCriterion("avatar is null");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNotNull() {
            addCriterion("avatar is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarEqualTo(String value) {
            addCriterion("avatar =", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotEqualTo(String value) {
            addCriterion("avatar <>", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThan(String value) {
            addCriterion("avatar >", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("avatar >=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThan(String value) {
            addCriterion("avatar <", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThanOrEqualTo(String value) {
            addCriterion("avatar <=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLike(String value) {
            addCriterion("avatar like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotLike(String value) {
            addCriterion("avatar not like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarIn(List<String> values) {
            addCriterion("avatar in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotIn(List<String> values) {
            addCriterion("avatar not in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarBetween(String value1, String value2) {
            addCriterion("avatar between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotBetween(String value1, String value2) {
            addCriterion("avatar not between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andSignIsNull() {
            addCriterion("sign is null");
            return (Criteria) this;
        }

        public Criteria andSignIsNotNull() {
            addCriterion("sign is not null");
            return (Criteria) this;
        }

        public Criteria andSignEqualTo(String value) {
            addCriterion("sign =", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotEqualTo(String value) {
            addCriterion("sign <>", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignGreaterThan(String value) {
            addCriterion("sign >", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignGreaterThanOrEqualTo(String value) {
            addCriterion("sign >=", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLessThan(String value) {
            addCriterion("sign <", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLessThanOrEqualTo(String value) {
            addCriterion("sign <=", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLike(String value) {
            addCriterion("sign like", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotLike(String value) {
            addCriterion("sign not like", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignIn(List<String> values) {
            addCriterion("sign in", values, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotIn(List<String> values) {
            addCriterion("sign not in", values, "sign");
            return (Criteria) this;
        }

        public Criteria andSignBetween(String value1, String value2) {
            addCriterion("sign between", value1, value2, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotBetween(String value1, String value2) {
            addCriterion("sign not between", value1, value2, "sign");
            return (Criteria) this;
        }

        public Criteria andWxOpenidIsNull() {
            addCriterion("wx_openid is null");
            return (Criteria) this;
        }

        public Criteria andWxOpenidIsNotNull() {
            addCriterion("wx_openid is not null");
            return (Criteria) this;
        }

        public Criteria andWxOpenidEqualTo(String value) {
            addCriterion("wx_openid =", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidNotEqualTo(String value) {
            addCriterion("wx_openid <>", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidGreaterThan(String value) {
            addCriterion("wx_openid >", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("wx_openid >=", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidLessThan(String value) {
            addCriterion("wx_openid <", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidLessThanOrEqualTo(String value) {
            addCriterion("wx_openid <=", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidLike(String value) {
            addCriterion("wx_openid like", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidNotLike(String value) {
            addCriterion("wx_openid not like", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidIn(List<String> values) {
            addCriterion("wx_openid in", values, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidNotIn(List<String> values) {
            addCriterion("wx_openid not in", values, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidBetween(String value1, String value2) {
            addCriterion("wx_openid between", value1, value2, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidNotBetween(String value1, String value2) {
            addCriterion("wx_openid not between", value1, value2, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andMobileImeiIsNull() {
            addCriterion("mobile_imei is null");
            return (Criteria) this;
        }

        public Criteria andMobileImeiIsNotNull() {
            addCriterion("mobile_imei is not null");
            return (Criteria) this;
        }

        public Criteria andMobileImeiEqualTo(String value) {
            addCriterion("mobile_imei =", value, "mobileImei");
            return (Criteria) this;
        }

        public Criteria andMobileImeiNotEqualTo(String value) {
            addCriterion("mobile_imei <>", value, "mobileImei");
            return (Criteria) this;
        }

        public Criteria andMobileImeiGreaterThan(String value) {
            addCriterion("mobile_imei >", value, "mobileImei");
            return (Criteria) this;
        }

        public Criteria andMobileImeiGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_imei >=", value, "mobileImei");
            return (Criteria) this;
        }

        public Criteria andMobileImeiLessThan(String value) {
            addCriterion("mobile_imei <", value, "mobileImei");
            return (Criteria) this;
        }

        public Criteria andMobileImeiLessThanOrEqualTo(String value) {
            addCriterion("mobile_imei <=", value, "mobileImei");
            return (Criteria) this;
        }

        public Criteria andMobileImeiLike(String value) {
            addCriterion("mobile_imei like", value, "mobileImei");
            return (Criteria) this;
        }

        public Criteria andMobileImeiNotLike(String value) {
            addCriterion("mobile_imei not like", value, "mobileImei");
            return (Criteria) this;
        }

        public Criteria andMobileImeiIn(List<String> values) {
            addCriterion("mobile_imei in", values, "mobileImei");
            return (Criteria) this;
        }

        public Criteria andMobileImeiNotIn(List<String> values) {
            addCriterion("mobile_imei not in", values, "mobileImei");
            return (Criteria) this;
        }

        public Criteria andMobileImeiBetween(String value1, String value2) {
            addCriterion("mobile_imei between", value1, value2, "mobileImei");
            return (Criteria) this;
        }

        public Criteria andMobileImeiNotBetween(String value1, String value2) {
            addCriterion("mobile_imei not between", value1, value2, "mobileImei");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("user_type like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("user_type not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andRefCodeIsNull() {
            addCriterion("ref_code is null");
            return (Criteria) this;
        }

        public Criteria andRefCodeIsNotNull() {
            addCriterion("ref_code is not null");
            return (Criteria) this;
        }

        public Criteria andRefCodeEqualTo(String value) {
            addCriterion("ref_code =", value, "refCode");
            return (Criteria) this;
        }

        public Criteria andRefCodeNotEqualTo(String value) {
            addCriterion("ref_code <>", value, "refCode");
            return (Criteria) this;
        }

        public Criteria andRefCodeGreaterThan(String value) {
            addCriterion("ref_code >", value, "refCode");
            return (Criteria) this;
        }

        public Criteria andRefCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ref_code >=", value, "refCode");
            return (Criteria) this;
        }

        public Criteria andRefCodeLessThan(String value) {
            addCriterion("ref_code <", value, "refCode");
            return (Criteria) this;
        }

        public Criteria andRefCodeLessThanOrEqualTo(String value) {
            addCriterion("ref_code <=", value, "refCode");
            return (Criteria) this;
        }

        public Criteria andRefCodeLike(String value) {
            addCriterion("ref_code like", value, "refCode");
            return (Criteria) this;
        }

        public Criteria andRefCodeNotLike(String value) {
            addCriterion("ref_code not like", value, "refCode");
            return (Criteria) this;
        }

        public Criteria andRefCodeIn(List<String> values) {
            addCriterion("ref_code in", values, "refCode");
            return (Criteria) this;
        }

        public Criteria andRefCodeNotIn(List<String> values) {
            addCriterion("ref_code not in", values, "refCode");
            return (Criteria) this;
        }

        public Criteria andRefCodeBetween(String value1, String value2) {
            addCriterion("ref_code between", value1, value2, "refCode");
            return (Criteria) this;
        }

        public Criteria andRefCodeNotBetween(String value1, String value2) {
            addCriterion("ref_code not between", value1, value2, "refCode");
            return (Criteria) this;
        }

        public Criteria andRefNameIsNull() {
            addCriterion("ref_name is null");
            return (Criteria) this;
        }

        public Criteria andRefNameIsNotNull() {
            addCriterion("ref_name is not null");
            return (Criteria) this;
        }

        public Criteria andRefNameEqualTo(String value) {
            addCriterion("ref_name =", value, "refName");
            return (Criteria) this;
        }

        public Criteria andRefNameNotEqualTo(String value) {
            addCriterion("ref_name <>", value, "refName");
            return (Criteria) this;
        }

        public Criteria andRefNameGreaterThan(String value) {
            addCriterion("ref_name >", value, "refName");
            return (Criteria) this;
        }

        public Criteria andRefNameGreaterThanOrEqualTo(String value) {
            addCriterion("ref_name >=", value, "refName");
            return (Criteria) this;
        }

        public Criteria andRefNameLessThan(String value) {
            addCriterion("ref_name <", value, "refName");
            return (Criteria) this;
        }

        public Criteria andRefNameLessThanOrEqualTo(String value) {
            addCriterion("ref_name <=", value, "refName");
            return (Criteria) this;
        }

        public Criteria andRefNameLike(String value) {
            addCriterion("ref_name like", value, "refName");
            return (Criteria) this;
        }

        public Criteria andRefNameNotLike(String value) {
            addCriterion("ref_name not like", value, "refName");
            return (Criteria) this;
        }

        public Criteria andRefNameIn(List<String> values) {
            addCriterion("ref_name in", values, "refName");
            return (Criteria) this;
        }

        public Criteria andRefNameNotIn(List<String> values) {
            addCriterion("ref_name not in", values, "refName");
            return (Criteria) this;
        }

        public Criteria andRefNameBetween(String value1, String value2) {
            addCriterion("ref_name between", value1, value2, "refName");
            return (Criteria) this;
        }

        public Criteria andRefNameNotBetween(String value1, String value2) {
            addCriterion("ref_name not between", value1, value2, "refName");
            return (Criteria) this;
        }

        public Criteria andMgrTypeIsNull() {
            addCriterion("mgr_type is null");
            return (Criteria) this;
        }

        public Criteria andMgrTypeIsNotNull() {
            addCriterion("mgr_type is not null");
            return (Criteria) this;
        }

        public Criteria andMgrTypeEqualTo(String value) {
            addCriterion("mgr_type =", value, "mgrType");
            return (Criteria) this;
        }

        public Criteria andMgrTypeNotEqualTo(String value) {
            addCriterion("mgr_type <>", value, "mgrType");
            return (Criteria) this;
        }

        public Criteria andMgrTypeGreaterThan(String value) {
            addCriterion("mgr_type >", value, "mgrType");
            return (Criteria) this;
        }

        public Criteria andMgrTypeGreaterThanOrEqualTo(String value) {
            addCriterion("mgr_type >=", value, "mgrType");
            return (Criteria) this;
        }

        public Criteria andMgrTypeLessThan(String value) {
            addCriterion("mgr_type <", value, "mgrType");
            return (Criteria) this;
        }

        public Criteria andMgrTypeLessThanOrEqualTo(String value) {
            addCriterion("mgr_type <=", value, "mgrType");
            return (Criteria) this;
        }

        public Criteria andMgrTypeLike(String value) {
            addCriterion("mgr_type like", value, "mgrType");
            return (Criteria) this;
        }

        public Criteria andMgrTypeNotLike(String value) {
            addCriterion("mgr_type not like", value, "mgrType");
            return (Criteria) this;
        }

        public Criteria andMgrTypeIn(List<String> values) {
            addCriterion("mgr_type in", values, "mgrType");
            return (Criteria) this;
        }

        public Criteria andMgrTypeNotIn(List<String> values) {
            addCriterion("mgr_type not in", values, "mgrType");
            return (Criteria) this;
        }

        public Criteria andMgrTypeBetween(String value1, String value2) {
            addCriterion("mgr_type between", value1, value2, "mgrType");
            return (Criteria) this;
        }

        public Criteria andMgrTypeNotBetween(String value1, String value2) {
            addCriterion("mgr_type not between", value1, value2, "mgrType");
            return (Criteria) this;
        }

        public Criteria andPwdSecurityLevelIsNull() {
            addCriterion("pwd_security_level is null");
            return (Criteria) this;
        }

        public Criteria andPwdSecurityLevelIsNotNull() {
            addCriterion("pwd_security_level is not null");
            return (Criteria) this;
        }

        public Criteria andPwdSecurityLevelEqualTo(Short value) {
            addCriterion("pwd_security_level =", value, "pwdSecurityLevel");
            return (Criteria) this;
        }

        public Criteria andPwdSecurityLevelNotEqualTo(Short value) {
            addCriterion("pwd_security_level <>", value, "pwdSecurityLevel");
            return (Criteria) this;
        }

        public Criteria andPwdSecurityLevelGreaterThan(Short value) {
            addCriterion("pwd_security_level >", value, "pwdSecurityLevel");
            return (Criteria) this;
        }

        public Criteria andPwdSecurityLevelGreaterThanOrEqualTo(Short value) {
            addCriterion("pwd_security_level >=", value, "pwdSecurityLevel");
            return (Criteria) this;
        }

        public Criteria andPwdSecurityLevelLessThan(Short value) {
            addCriterion("pwd_security_level <", value, "pwdSecurityLevel");
            return (Criteria) this;
        }

        public Criteria andPwdSecurityLevelLessThanOrEqualTo(Short value) {
            addCriterion("pwd_security_level <=", value, "pwdSecurityLevel");
            return (Criteria) this;
        }

        public Criteria andPwdSecurityLevelIn(List<Short> values) {
            addCriterion("pwd_security_level in", values, "pwdSecurityLevel");
            return (Criteria) this;
        }

        public Criteria andPwdSecurityLevelNotIn(List<Short> values) {
            addCriterion("pwd_security_level not in", values, "pwdSecurityLevel");
            return (Criteria) this;
        }

        public Criteria andPwdSecurityLevelBetween(Short value1, Short value2) {
            addCriterion("pwd_security_level between", value1, value2, "pwdSecurityLevel");
            return (Criteria) this;
        }

        public Criteria andPwdSecurityLevelNotBetween(Short value1, Short value2) {
            addCriterion("pwd_security_level not between", value1, value2, "pwdSecurityLevel");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateDateIsNull() {
            addCriterion("pwd_update_date is null");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateDateIsNotNull() {
            addCriterion("pwd_update_date is not null");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateDateEqualTo(Date value) {
            addCriterion("pwd_update_date =", value, "pwdUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateDateNotEqualTo(Date value) {
            addCriterion("pwd_update_date <>", value, "pwdUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateDateGreaterThan(Date value) {
            addCriterion("pwd_update_date >", value, "pwdUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("pwd_update_date >=", value, "pwdUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateDateLessThan(Date value) {
            addCriterion("pwd_update_date <", value, "pwdUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("pwd_update_date <=", value, "pwdUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateDateIn(List<Date> values) {
            addCriterion("pwd_update_date in", values, "pwdUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateDateNotIn(List<Date> values) {
            addCriterion("pwd_update_date not in", values, "pwdUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateDateBetween(Date value1, Date value2) {
            addCriterion("pwd_update_date between", value1, value2, "pwdUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("pwd_update_date not between", value1, value2, "pwdUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateRecordIsNull() {
            addCriterion("pwd_update_record is null");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateRecordIsNotNull() {
            addCriterion("pwd_update_record is not null");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateRecordEqualTo(String value) {
            addCriterion("pwd_update_record =", value, "pwdUpdateRecord");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateRecordNotEqualTo(String value) {
            addCriterion("pwd_update_record <>", value, "pwdUpdateRecord");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateRecordGreaterThan(String value) {
            addCriterion("pwd_update_record >", value, "pwdUpdateRecord");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateRecordGreaterThanOrEqualTo(String value) {
            addCriterion("pwd_update_record >=", value, "pwdUpdateRecord");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateRecordLessThan(String value) {
            addCriterion("pwd_update_record <", value, "pwdUpdateRecord");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateRecordLessThanOrEqualTo(String value) {
            addCriterion("pwd_update_record <=", value, "pwdUpdateRecord");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateRecordLike(String value) {
            addCriterion("pwd_update_record like", value, "pwdUpdateRecord");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateRecordNotLike(String value) {
            addCriterion("pwd_update_record not like", value, "pwdUpdateRecord");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateRecordIn(List<String> values) {
            addCriterion("pwd_update_record in", values, "pwdUpdateRecord");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateRecordNotIn(List<String> values) {
            addCriterion("pwd_update_record not in", values, "pwdUpdateRecord");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateRecordBetween(String value1, String value2) {
            addCriterion("pwd_update_record between", value1, value2, "pwdUpdateRecord");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateRecordNotBetween(String value1, String value2) {
            addCriterion("pwd_update_record not between", value1, value2, "pwdUpdateRecord");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionIsNull() {
            addCriterion("pwd_question is null");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionIsNotNull() {
            addCriterion("pwd_question is not null");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionEqualTo(String value) {
            addCriterion("pwd_question =", value, "pwdQuestion");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionNotEqualTo(String value) {
            addCriterion("pwd_question <>", value, "pwdQuestion");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionGreaterThan(String value) {
            addCriterion("pwd_question >", value, "pwdQuestion");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionGreaterThanOrEqualTo(String value) {
            addCriterion("pwd_question >=", value, "pwdQuestion");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionLessThan(String value) {
            addCriterion("pwd_question <", value, "pwdQuestion");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionLessThanOrEqualTo(String value) {
            addCriterion("pwd_question <=", value, "pwdQuestion");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionLike(String value) {
            addCriterion("pwd_question like", value, "pwdQuestion");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionNotLike(String value) {
            addCriterion("pwd_question not like", value, "pwdQuestion");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionIn(List<String> values) {
            addCriterion("pwd_question in", values, "pwdQuestion");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionNotIn(List<String> values) {
            addCriterion("pwd_question not in", values, "pwdQuestion");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionBetween(String value1, String value2) {
            addCriterion("pwd_question between", value1, value2, "pwdQuestion");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionNotBetween(String value1, String value2) {
            addCriterion("pwd_question not between", value1, value2, "pwdQuestion");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswerIsNull() {
            addCriterion("pwd_question_answer is null");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswerIsNotNull() {
            addCriterion("pwd_question_answer is not null");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswerEqualTo(String value) {
            addCriterion("pwd_question_answer =", value, "pwdQuestionAnswer");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswerNotEqualTo(String value) {
            addCriterion("pwd_question_answer <>", value, "pwdQuestionAnswer");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswerGreaterThan(String value) {
            addCriterion("pwd_question_answer >", value, "pwdQuestionAnswer");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("pwd_question_answer >=", value, "pwdQuestionAnswer");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswerLessThan(String value) {
            addCriterion("pwd_question_answer <", value, "pwdQuestionAnswer");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswerLessThanOrEqualTo(String value) {
            addCriterion("pwd_question_answer <=", value, "pwdQuestionAnswer");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswerLike(String value) {
            addCriterion("pwd_question_answer like", value, "pwdQuestionAnswer");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswerNotLike(String value) {
            addCriterion("pwd_question_answer not like", value, "pwdQuestionAnswer");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswerIn(List<String> values) {
            addCriterion("pwd_question_answer in", values, "pwdQuestionAnswer");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswerNotIn(List<String> values) {
            addCriterion("pwd_question_answer not in", values, "pwdQuestionAnswer");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswerBetween(String value1, String value2) {
            addCriterion("pwd_question_answer between", value1, value2, "pwdQuestionAnswer");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswerNotBetween(String value1, String value2) {
            addCriterion("pwd_question_answer not between", value1, value2, "pwdQuestionAnswer");
            return (Criteria) this;
        }

        public Criteria andPwdQuestion2IsNull() {
            addCriterion("pwd_question_2 is null");
            return (Criteria) this;
        }

        public Criteria andPwdQuestion2IsNotNull() {
            addCriterion("pwd_question_2 is not null");
            return (Criteria) this;
        }

        public Criteria andPwdQuestion2EqualTo(String value) {
            addCriterion("pwd_question_2 =", value, "pwdQuestion2");
            return (Criteria) this;
        }

        public Criteria andPwdQuestion2NotEqualTo(String value) {
            addCriterion("pwd_question_2 <>", value, "pwdQuestion2");
            return (Criteria) this;
        }

        public Criteria andPwdQuestion2GreaterThan(String value) {
            addCriterion("pwd_question_2 >", value, "pwdQuestion2");
            return (Criteria) this;
        }

        public Criteria andPwdQuestion2GreaterThanOrEqualTo(String value) {
            addCriterion("pwd_question_2 >=", value, "pwdQuestion2");
            return (Criteria) this;
        }

        public Criteria andPwdQuestion2LessThan(String value) {
            addCriterion("pwd_question_2 <", value, "pwdQuestion2");
            return (Criteria) this;
        }

        public Criteria andPwdQuestion2LessThanOrEqualTo(String value) {
            addCriterion("pwd_question_2 <=", value, "pwdQuestion2");
            return (Criteria) this;
        }

        public Criteria andPwdQuestion2Like(String value) {
            addCriterion("pwd_question_2 like", value, "pwdQuestion2");
            return (Criteria) this;
        }

        public Criteria andPwdQuestion2NotLike(String value) {
            addCriterion("pwd_question_2 not like", value, "pwdQuestion2");
            return (Criteria) this;
        }

        public Criteria andPwdQuestion2In(List<String> values) {
            addCriterion("pwd_question_2 in", values, "pwdQuestion2");
            return (Criteria) this;
        }

        public Criteria andPwdQuestion2NotIn(List<String> values) {
            addCriterion("pwd_question_2 not in", values, "pwdQuestion2");
            return (Criteria) this;
        }

        public Criteria andPwdQuestion2Between(String value1, String value2) {
            addCriterion("pwd_question_2 between", value1, value2, "pwdQuestion2");
            return (Criteria) this;
        }

        public Criteria andPwdQuestion2NotBetween(String value1, String value2) {
            addCriterion("pwd_question_2 not between", value1, value2, "pwdQuestion2");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswer2IsNull() {
            addCriterion("pwd_question_answer_2 is null");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswer2IsNotNull() {
            addCriterion("pwd_question_answer_2 is not null");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswer2EqualTo(String value) {
            addCriterion("pwd_question_answer_2 =", value, "pwdQuestionAnswer2");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswer2NotEqualTo(String value) {
            addCriterion("pwd_question_answer_2 <>", value, "pwdQuestionAnswer2");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswer2GreaterThan(String value) {
            addCriterion("pwd_question_answer_2 >", value, "pwdQuestionAnswer2");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswer2GreaterThanOrEqualTo(String value) {
            addCriterion("pwd_question_answer_2 >=", value, "pwdQuestionAnswer2");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswer2LessThan(String value) {
            addCriterion("pwd_question_answer_2 <", value, "pwdQuestionAnswer2");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswer2LessThanOrEqualTo(String value) {
            addCriterion("pwd_question_answer_2 <=", value, "pwdQuestionAnswer2");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswer2Like(String value) {
            addCriterion("pwd_question_answer_2 like", value, "pwdQuestionAnswer2");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswer2NotLike(String value) {
            addCriterion("pwd_question_answer_2 not like", value, "pwdQuestionAnswer2");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswer2In(List<String> values) {
            addCriterion("pwd_question_answer_2 in", values, "pwdQuestionAnswer2");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswer2NotIn(List<String> values) {
            addCriterion("pwd_question_answer_2 not in", values, "pwdQuestionAnswer2");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswer2Between(String value1, String value2) {
            addCriterion("pwd_question_answer_2 between", value1, value2, "pwdQuestionAnswer2");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswer2NotBetween(String value1, String value2) {
            addCriterion("pwd_question_answer_2 not between", value1, value2, "pwdQuestionAnswer2");
            return (Criteria) this;
        }

        public Criteria andPwdQuestion3IsNull() {
            addCriterion("pwd_question_3 is null");
            return (Criteria) this;
        }

        public Criteria andPwdQuestion3IsNotNull() {
            addCriterion("pwd_question_3 is not null");
            return (Criteria) this;
        }

        public Criteria andPwdQuestion3EqualTo(String value) {
            addCriterion("pwd_question_3 =", value, "pwdQuestion3");
            return (Criteria) this;
        }

        public Criteria andPwdQuestion3NotEqualTo(String value) {
            addCriterion("pwd_question_3 <>", value, "pwdQuestion3");
            return (Criteria) this;
        }

        public Criteria andPwdQuestion3GreaterThan(String value) {
            addCriterion("pwd_question_3 >", value, "pwdQuestion3");
            return (Criteria) this;
        }

        public Criteria andPwdQuestion3GreaterThanOrEqualTo(String value) {
            addCriterion("pwd_question_3 >=", value, "pwdQuestion3");
            return (Criteria) this;
        }

        public Criteria andPwdQuestion3LessThan(String value) {
            addCriterion("pwd_question_3 <", value, "pwdQuestion3");
            return (Criteria) this;
        }

        public Criteria andPwdQuestion3LessThanOrEqualTo(String value) {
            addCriterion("pwd_question_3 <=", value, "pwdQuestion3");
            return (Criteria) this;
        }

        public Criteria andPwdQuestion3Like(String value) {
            addCriterion("pwd_question_3 like", value, "pwdQuestion3");
            return (Criteria) this;
        }

        public Criteria andPwdQuestion3NotLike(String value) {
            addCriterion("pwd_question_3 not like", value, "pwdQuestion3");
            return (Criteria) this;
        }

        public Criteria andPwdQuestion3In(List<String> values) {
            addCriterion("pwd_question_3 in", values, "pwdQuestion3");
            return (Criteria) this;
        }

        public Criteria andPwdQuestion3NotIn(List<String> values) {
            addCriterion("pwd_question_3 not in", values, "pwdQuestion3");
            return (Criteria) this;
        }

        public Criteria andPwdQuestion3Between(String value1, String value2) {
            addCriterion("pwd_question_3 between", value1, value2, "pwdQuestion3");
            return (Criteria) this;
        }

        public Criteria andPwdQuestion3NotBetween(String value1, String value2) {
            addCriterion("pwd_question_3 not between", value1, value2, "pwdQuestion3");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswer3IsNull() {
            addCriterion("pwd_question_answer_3 is null");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswer3IsNotNull() {
            addCriterion("pwd_question_answer_3 is not null");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswer3EqualTo(String value) {
            addCriterion("pwd_question_answer_3 =", value, "pwdQuestionAnswer3");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswer3NotEqualTo(String value) {
            addCriterion("pwd_question_answer_3 <>", value, "pwdQuestionAnswer3");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswer3GreaterThan(String value) {
            addCriterion("pwd_question_answer_3 >", value, "pwdQuestionAnswer3");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswer3GreaterThanOrEqualTo(String value) {
            addCriterion("pwd_question_answer_3 >=", value, "pwdQuestionAnswer3");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswer3LessThan(String value) {
            addCriterion("pwd_question_answer_3 <", value, "pwdQuestionAnswer3");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswer3LessThanOrEqualTo(String value) {
            addCriterion("pwd_question_answer_3 <=", value, "pwdQuestionAnswer3");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswer3Like(String value) {
            addCriterion("pwd_question_answer_3 like", value, "pwdQuestionAnswer3");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswer3NotLike(String value) {
            addCriterion("pwd_question_answer_3 not like", value, "pwdQuestionAnswer3");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswer3In(List<String> values) {
            addCriterion("pwd_question_answer_3 in", values, "pwdQuestionAnswer3");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswer3NotIn(List<String> values) {
            addCriterion("pwd_question_answer_3 not in", values, "pwdQuestionAnswer3");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswer3Between(String value1, String value2) {
            addCriterion("pwd_question_answer_3 between", value1, value2, "pwdQuestionAnswer3");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswer3NotBetween(String value1, String value2) {
            addCriterion("pwd_question_answer_3 not between", value1, value2, "pwdQuestionAnswer3");
            return (Criteria) this;
        }

        public Criteria andPwdQuestUpdateDateIsNull() {
            addCriterion("pwd_quest_update_date is null");
            return (Criteria) this;
        }

        public Criteria andPwdQuestUpdateDateIsNotNull() {
            addCriterion("pwd_quest_update_date is not null");
            return (Criteria) this;
        }

        public Criteria andPwdQuestUpdateDateEqualTo(Date value) {
            addCriterion("pwd_quest_update_date =", value, "pwdQuestUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPwdQuestUpdateDateNotEqualTo(Date value) {
            addCriterion("pwd_quest_update_date <>", value, "pwdQuestUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPwdQuestUpdateDateGreaterThan(Date value) {
            addCriterion("pwd_quest_update_date >", value, "pwdQuestUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPwdQuestUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("pwd_quest_update_date >=", value, "pwdQuestUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPwdQuestUpdateDateLessThan(Date value) {
            addCriterion("pwd_quest_update_date <", value, "pwdQuestUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPwdQuestUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("pwd_quest_update_date <=", value, "pwdQuestUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPwdQuestUpdateDateIn(List<Date> values) {
            addCriterion("pwd_quest_update_date in", values, "pwdQuestUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPwdQuestUpdateDateNotIn(List<Date> values) {
            addCriterion("pwd_quest_update_date not in", values, "pwdQuestUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPwdQuestUpdateDateBetween(Date value1, Date value2) {
            addCriterion("pwd_quest_update_date between", value1, value2, "pwdQuestUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPwdQuestUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("pwd_quest_update_date not between", value1, value2, "pwdQuestUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIsNull() {
            addCriterion("last_login_ip is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIsNotNull() {
            addCriterion("last_login_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpEqualTo(String value) {
            addCriterion("last_login_ip =", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotEqualTo(String value) {
            addCriterion("last_login_ip <>", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpGreaterThan(String value) {
            addCriterion("last_login_ip >", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("last_login_ip >=", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLessThan(String value) {
            addCriterion("last_login_ip <", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLessThanOrEqualTo(String value) {
            addCriterion("last_login_ip <=", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLike(String value) {
            addCriterion("last_login_ip like", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotLike(String value) {
            addCriterion("last_login_ip not like", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIn(List<String> values) {
            addCriterion("last_login_ip in", values, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotIn(List<String> values) {
            addCriterion("last_login_ip not in", values, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpBetween(String value1, String value2) {
            addCriterion("last_login_ip between", value1, value2, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotBetween(String value1, String value2) {
            addCriterion("last_login_ip not between", value1, value2, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateIsNull() {
            addCriterion("last_login_date is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateIsNotNull() {
            addCriterion("last_login_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateEqualTo(Date value) {
            addCriterion("last_login_date =", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateNotEqualTo(Date value) {
            addCriterion("last_login_date <>", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateGreaterThan(Date value) {
            addCriterion("last_login_date >", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateGreaterThanOrEqualTo(Date value) {
            addCriterion("last_login_date >=", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateLessThan(Date value) {
            addCriterion("last_login_date <", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateLessThanOrEqualTo(Date value) {
            addCriterion("last_login_date <=", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateIn(List<Date> values) {
            addCriterion("last_login_date in", values, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateNotIn(List<Date> values) {
            addCriterion("last_login_date not in", values, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateBetween(Date value1, Date value2) {
            addCriterion("last_login_date between", value1, value2, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateNotBetween(Date value1, Date value2) {
            addCriterion("last_login_date not between", value1, value2, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andFreezeDateIsNull() {
            addCriterion("freeze_date is null");
            return (Criteria) this;
        }

        public Criteria andFreezeDateIsNotNull() {
            addCriterion("freeze_date is not null");
            return (Criteria) this;
        }

        public Criteria andFreezeDateEqualTo(Date value) {
            addCriterion("freeze_date =", value, "freezeDate");
            return (Criteria) this;
        }

        public Criteria andFreezeDateNotEqualTo(Date value) {
            addCriterion("freeze_date <>", value, "freezeDate");
            return (Criteria) this;
        }

        public Criteria andFreezeDateGreaterThan(Date value) {
            addCriterion("freeze_date >", value, "freezeDate");
            return (Criteria) this;
        }

        public Criteria andFreezeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("freeze_date >=", value, "freezeDate");
            return (Criteria) this;
        }

        public Criteria andFreezeDateLessThan(Date value) {
            addCriterion("freeze_date <", value, "freezeDate");
            return (Criteria) this;
        }

        public Criteria andFreezeDateLessThanOrEqualTo(Date value) {
            addCriterion("freeze_date <=", value, "freezeDate");
            return (Criteria) this;
        }

        public Criteria andFreezeDateIn(List<Date> values) {
            addCriterion("freeze_date in", values, "freezeDate");
            return (Criteria) this;
        }

        public Criteria andFreezeDateNotIn(List<Date> values) {
            addCriterion("freeze_date not in", values, "freezeDate");
            return (Criteria) this;
        }

        public Criteria andFreezeDateBetween(Date value1, Date value2) {
            addCriterion("freeze_date between", value1, value2, "freezeDate");
            return (Criteria) this;
        }

        public Criteria andFreezeDateNotBetween(Date value1, Date value2) {
            addCriterion("freeze_date not between", value1, value2, "freezeDate");
            return (Criteria) this;
        }

        public Criteria andFreezeCauseIsNull() {
            addCriterion("freeze_cause is null");
            return (Criteria) this;
        }

        public Criteria andFreezeCauseIsNotNull() {
            addCriterion("freeze_cause is not null");
            return (Criteria) this;
        }

        public Criteria andFreezeCauseEqualTo(String value) {
            addCriterion("freeze_cause =", value, "freezeCause");
            return (Criteria) this;
        }

        public Criteria andFreezeCauseNotEqualTo(String value) {
            addCriterion("freeze_cause <>", value, "freezeCause");
            return (Criteria) this;
        }

        public Criteria andFreezeCauseGreaterThan(String value) {
            addCriterion("freeze_cause >", value, "freezeCause");
            return (Criteria) this;
        }

        public Criteria andFreezeCauseGreaterThanOrEqualTo(String value) {
            addCriterion("freeze_cause >=", value, "freezeCause");
            return (Criteria) this;
        }

        public Criteria andFreezeCauseLessThan(String value) {
            addCriterion("freeze_cause <", value, "freezeCause");
            return (Criteria) this;
        }

        public Criteria andFreezeCauseLessThanOrEqualTo(String value) {
            addCriterion("freeze_cause <=", value, "freezeCause");
            return (Criteria) this;
        }

        public Criteria andFreezeCauseLike(String value) {
            addCriterion("freeze_cause like", value, "freezeCause");
            return (Criteria) this;
        }

        public Criteria andFreezeCauseNotLike(String value) {
            addCriterion("freeze_cause not like", value, "freezeCause");
            return (Criteria) this;
        }

        public Criteria andFreezeCauseIn(List<String> values) {
            addCriterion("freeze_cause in", values, "freezeCause");
            return (Criteria) this;
        }

        public Criteria andFreezeCauseNotIn(List<String> values) {
            addCriterion("freeze_cause not in", values, "freezeCause");
            return (Criteria) this;
        }

        public Criteria andFreezeCauseBetween(String value1, String value2) {
            addCriterion("freeze_cause between", value1, value2, "freezeCause");
            return (Criteria) this;
        }

        public Criteria andFreezeCauseNotBetween(String value1, String value2) {
            addCriterion("freeze_cause not between", value1, value2, "freezeCause");
            return (Criteria) this;
        }

        public Criteria andUserWeightIsNull() {
            addCriterion("user_weight is null");
            return (Criteria) this;
        }

        public Criteria andUserWeightIsNotNull() {
            addCriterion("user_weight is not null");
            return (Criteria) this;
        }

        public Criteria andUserWeightEqualTo(Integer value) {
            addCriterion("user_weight =", value, "userWeight");
            return (Criteria) this;
        }

        public Criteria andUserWeightNotEqualTo(Integer value) {
            addCriterion("user_weight <>", value, "userWeight");
            return (Criteria) this;
        }

        public Criteria andUserWeightGreaterThan(Integer value) {
            addCriterion("user_weight >", value, "userWeight");
            return (Criteria) this;
        }

        public Criteria andUserWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_weight >=", value, "userWeight");
            return (Criteria) this;
        }

        public Criteria andUserWeightLessThan(Integer value) {
            addCriterion("user_weight <", value, "userWeight");
            return (Criteria) this;
        }

        public Criteria andUserWeightLessThanOrEqualTo(Integer value) {
            addCriterion("user_weight <=", value, "userWeight");
            return (Criteria) this;
        }

        public Criteria andUserWeightIn(List<Integer> values) {
            addCriterion("user_weight in", values, "userWeight");
            return (Criteria) this;
        }

        public Criteria andUserWeightNotIn(List<Integer> values) {
            addCriterion("user_weight not in", values, "userWeight");
            return (Criteria) this;
        }

        public Criteria andUserWeightBetween(Integer value1, Integer value2) {
            addCriterion("user_weight between", value1, value2, "userWeight");
            return (Criteria) this;
        }

        public Criteria andUserWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("user_weight not between", value1, value2, "userWeight");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andCorpCodeIsNull() {
            addCriterion("corp_code is null");
            return (Criteria) this;
        }

        public Criteria andCorpCodeIsNotNull() {
            addCriterion("corp_code is not null");
            return (Criteria) this;
        }

        public Criteria andCorpCodeEqualTo(String value) {
            addCriterion("corp_code =", value, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpCodeNotEqualTo(String value) {
            addCriterion("corp_code <>", value, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpCodeGreaterThan(String value) {
            addCriterion("corp_code >", value, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpCodeGreaterThanOrEqualTo(String value) {
            addCriterion("corp_code >=", value, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpCodeLessThan(String value) {
            addCriterion("corp_code <", value, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpCodeLessThanOrEqualTo(String value) {
            addCriterion("corp_code <=", value, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpCodeLike(String value) {
            addCriterion("corp_code like", value, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpCodeNotLike(String value) {
            addCriterion("corp_code not like", value, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpCodeIn(List<String> values) {
            addCriterion("corp_code in", values, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpCodeNotIn(List<String> values) {
            addCriterion("corp_code not in", values, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpCodeBetween(String value1, String value2) {
            addCriterion("corp_code between", value1, value2, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpCodeNotBetween(String value1, String value2) {
            addCriterion("corp_code not between", value1, value2, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpNameIsNull() {
            addCriterion("corp_name is null");
            return (Criteria) this;
        }

        public Criteria andCorpNameIsNotNull() {
            addCriterion("corp_name is not null");
            return (Criteria) this;
        }

        public Criteria andCorpNameEqualTo(String value) {
            addCriterion("corp_name =", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameNotEqualTo(String value) {
            addCriterion("corp_name <>", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameGreaterThan(String value) {
            addCriterion("corp_name >", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameGreaterThanOrEqualTo(String value) {
            addCriterion("corp_name >=", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameLessThan(String value) {
            addCriterion("corp_name <", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameLessThanOrEqualTo(String value) {
            addCriterion("corp_name <=", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameLike(String value) {
            addCriterion("corp_name like", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameNotLike(String value) {
            addCriterion("corp_name not like", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameIn(List<String> values) {
            addCriterion("corp_name in", values, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameNotIn(List<String> values) {
            addCriterion("corp_name not in", values, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameBetween(String value1, String value2) {
            addCriterion("corp_name between", value1, value2, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameNotBetween(String value1, String value2) {
            addCriterion("corp_name not between", value1, value2, "corpName");
            return (Criteria) this;
        }

        public Criteria andExtendS1IsNull() {
            addCriterion("extend_s1 is null");
            return (Criteria) this;
        }

        public Criteria andExtendS1IsNotNull() {
            addCriterion("extend_s1 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendS1EqualTo(String value) {
            addCriterion("extend_s1 =", value, "extendS1");
            return (Criteria) this;
        }

        public Criteria andExtendS1NotEqualTo(String value) {
            addCriterion("extend_s1 <>", value, "extendS1");
            return (Criteria) this;
        }

        public Criteria andExtendS1GreaterThan(String value) {
            addCriterion("extend_s1 >", value, "extendS1");
            return (Criteria) this;
        }

        public Criteria andExtendS1GreaterThanOrEqualTo(String value) {
            addCriterion("extend_s1 >=", value, "extendS1");
            return (Criteria) this;
        }

        public Criteria andExtendS1LessThan(String value) {
            addCriterion("extend_s1 <", value, "extendS1");
            return (Criteria) this;
        }

        public Criteria andExtendS1LessThanOrEqualTo(String value) {
            addCriterion("extend_s1 <=", value, "extendS1");
            return (Criteria) this;
        }

        public Criteria andExtendS1Like(String value) {
            addCriterion("extend_s1 like", value, "extendS1");
            return (Criteria) this;
        }

        public Criteria andExtendS1NotLike(String value) {
            addCriterion("extend_s1 not like", value, "extendS1");
            return (Criteria) this;
        }

        public Criteria andExtendS1In(List<String> values) {
            addCriterion("extend_s1 in", values, "extendS1");
            return (Criteria) this;
        }

        public Criteria andExtendS1NotIn(List<String> values) {
            addCriterion("extend_s1 not in", values, "extendS1");
            return (Criteria) this;
        }

        public Criteria andExtendS1Between(String value1, String value2) {
            addCriterion("extend_s1 between", value1, value2, "extendS1");
            return (Criteria) this;
        }

        public Criteria andExtendS1NotBetween(String value1, String value2) {
            addCriterion("extend_s1 not between", value1, value2, "extendS1");
            return (Criteria) this;
        }

        public Criteria andExtendS2IsNull() {
            addCriterion("extend_s2 is null");
            return (Criteria) this;
        }

        public Criteria andExtendS2IsNotNull() {
            addCriterion("extend_s2 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendS2EqualTo(String value) {
            addCriterion("extend_s2 =", value, "extendS2");
            return (Criteria) this;
        }

        public Criteria andExtendS2NotEqualTo(String value) {
            addCriterion("extend_s2 <>", value, "extendS2");
            return (Criteria) this;
        }

        public Criteria andExtendS2GreaterThan(String value) {
            addCriterion("extend_s2 >", value, "extendS2");
            return (Criteria) this;
        }

        public Criteria andExtendS2GreaterThanOrEqualTo(String value) {
            addCriterion("extend_s2 >=", value, "extendS2");
            return (Criteria) this;
        }

        public Criteria andExtendS2LessThan(String value) {
            addCriterion("extend_s2 <", value, "extendS2");
            return (Criteria) this;
        }

        public Criteria andExtendS2LessThanOrEqualTo(String value) {
            addCriterion("extend_s2 <=", value, "extendS2");
            return (Criteria) this;
        }

        public Criteria andExtendS2Like(String value) {
            addCriterion("extend_s2 like", value, "extendS2");
            return (Criteria) this;
        }

        public Criteria andExtendS2NotLike(String value) {
            addCriterion("extend_s2 not like", value, "extendS2");
            return (Criteria) this;
        }

        public Criteria andExtendS2In(List<String> values) {
            addCriterion("extend_s2 in", values, "extendS2");
            return (Criteria) this;
        }

        public Criteria andExtendS2NotIn(List<String> values) {
            addCriterion("extend_s2 not in", values, "extendS2");
            return (Criteria) this;
        }

        public Criteria andExtendS2Between(String value1, String value2) {
            addCriterion("extend_s2 between", value1, value2, "extendS2");
            return (Criteria) this;
        }

        public Criteria andExtendS2NotBetween(String value1, String value2) {
            addCriterion("extend_s2 not between", value1, value2, "extendS2");
            return (Criteria) this;
        }

        public Criteria andExtendS3IsNull() {
            addCriterion("extend_s3 is null");
            return (Criteria) this;
        }

        public Criteria andExtendS3IsNotNull() {
            addCriterion("extend_s3 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendS3EqualTo(String value) {
            addCriterion("extend_s3 =", value, "extendS3");
            return (Criteria) this;
        }

        public Criteria andExtendS3NotEqualTo(String value) {
            addCriterion("extend_s3 <>", value, "extendS3");
            return (Criteria) this;
        }

        public Criteria andExtendS3GreaterThan(String value) {
            addCriterion("extend_s3 >", value, "extendS3");
            return (Criteria) this;
        }

        public Criteria andExtendS3GreaterThanOrEqualTo(String value) {
            addCriterion("extend_s3 >=", value, "extendS3");
            return (Criteria) this;
        }

        public Criteria andExtendS3LessThan(String value) {
            addCriterion("extend_s3 <", value, "extendS3");
            return (Criteria) this;
        }

        public Criteria andExtendS3LessThanOrEqualTo(String value) {
            addCriterion("extend_s3 <=", value, "extendS3");
            return (Criteria) this;
        }

        public Criteria andExtendS3Like(String value) {
            addCriterion("extend_s3 like", value, "extendS3");
            return (Criteria) this;
        }

        public Criteria andExtendS3NotLike(String value) {
            addCriterion("extend_s3 not like", value, "extendS3");
            return (Criteria) this;
        }

        public Criteria andExtendS3In(List<String> values) {
            addCriterion("extend_s3 in", values, "extendS3");
            return (Criteria) this;
        }

        public Criteria andExtendS3NotIn(List<String> values) {
            addCriterion("extend_s3 not in", values, "extendS3");
            return (Criteria) this;
        }

        public Criteria andExtendS3Between(String value1, String value2) {
            addCriterion("extend_s3 between", value1, value2, "extendS3");
            return (Criteria) this;
        }

        public Criteria andExtendS3NotBetween(String value1, String value2) {
            addCriterion("extend_s3 not between", value1, value2, "extendS3");
            return (Criteria) this;
        }

        public Criteria andExtendS4IsNull() {
            addCriterion("extend_s4 is null");
            return (Criteria) this;
        }

        public Criteria andExtendS4IsNotNull() {
            addCriterion("extend_s4 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendS4EqualTo(String value) {
            addCriterion("extend_s4 =", value, "extendS4");
            return (Criteria) this;
        }

        public Criteria andExtendS4NotEqualTo(String value) {
            addCriterion("extend_s4 <>", value, "extendS4");
            return (Criteria) this;
        }

        public Criteria andExtendS4GreaterThan(String value) {
            addCriterion("extend_s4 >", value, "extendS4");
            return (Criteria) this;
        }

        public Criteria andExtendS4GreaterThanOrEqualTo(String value) {
            addCriterion("extend_s4 >=", value, "extendS4");
            return (Criteria) this;
        }

        public Criteria andExtendS4LessThan(String value) {
            addCriterion("extend_s4 <", value, "extendS4");
            return (Criteria) this;
        }

        public Criteria andExtendS4LessThanOrEqualTo(String value) {
            addCriterion("extend_s4 <=", value, "extendS4");
            return (Criteria) this;
        }

        public Criteria andExtendS4Like(String value) {
            addCriterion("extend_s4 like", value, "extendS4");
            return (Criteria) this;
        }

        public Criteria andExtendS4NotLike(String value) {
            addCriterion("extend_s4 not like", value, "extendS4");
            return (Criteria) this;
        }

        public Criteria andExtendS4In(List<String> values) {
            addCriterion("extend_s4 in", values, "extendS4");
            return (Criteria) this;
        }

        public Criteria andExtendS4NotIn(List<String> values) {
            addCriterion("extend_s4 not in", values, "extendS4");
            return (Criteria) this;
        }

        public Criteria andExtendS4Between(String value1, String value2) {
            addCriterion("extend_s4 between", value1, value2, "extendS4");
            return (Criteria) this;
        }

        public Criteria andExtendS4NotBetween(String value1, String value2) {
            addCriterion("extend_s4 not between", value1, value2, "extendS4");
            return (Criteria) this;
        }

        public Criteria andExtendS5IsNull() {
            addCriterion("extend_s5 is null");
            return (Criteria) this;
        }

        public Criteria andExtendS5IsNotNull() {
            addCriterion("extend_s5 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendS5EqualTo(String value) {
            addCriterion("extend_s5 =", value, "extendS5");
            return (Criteria) this;
        }

        public Criteria andExtendS5NotEqualTo(String value) {
            addCriterion("extend_s5 <>", value, "extendS5");
            return (Criteria) this;
        }

        public Criteria andExtendS5GreaterThan(String value) {
            addCriterion("extend_s5 >", value, "extendS5");
            return (Criteria) this;
        }

        public Criteria andExtendS5GreaterThanOrEqualTo(String value) {
            addCriterion("extend_s5 >=", value, "extendS5");
            return (Criteria) this;
        }

        public Criteria andExtendS5LessThan(String value) {
            addCriterion("extend_s5 <", value, "extendS5");
            return (Criteria) this;
        }

        public Criteria andExtendS5LessThanOrEqualTo(String value) {
            addCriterion("extend_s5 <=", value, "extendS5");
            return (Criteria) this;
        }

        public Criteria andExtendS5Like(String value) {
            addCriterion("extend_s5 like", value, "extendS5");
            return (Criteria) this;
        }

        public Criteria andExtendS5NotLike(String value) {
            addCriterion("extend_s5 not like", value, "extendS5");
            return (Criteria) this;
        }

        public Criteria andExtendS5In(List<String> values) {
            addCriterion("extend_s5 in", values, "extendS5");
            return (Criteria) this;
        }

        public Criteria andExtendS5NotIn(List<String> values) {
            addCriterion("extend_s5 not in", values, "extendS5");
            return (Criteria) this;
        }

        public Criteria andExtendS5Between(String value1, String value2) {
            addCriterion("extend_s5 between", value1, value2, "extendS5");
            return (Criteria) this;
        }

        public Criteria andExtendS5NotBetween(String value1, String value2) {
            addCriterion("extend_s5 not between", value1, value2, "extendS5");
            return (Criteria) this;
        }

        public Criteria andExtendS6IsNull() {
            addCriterion("extend_s6 is null");
            return (Criteria) this;
        }

        public Criteria andExtendS6IsNotNull() {
            addCriterion("extend_s6 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendS6EqualTo(String value) {
            addCriterion("extend_s6 =", value, "extendS6");
            return (Criteria) this;
        }

        public Criteria andExtendS6NotEqualTo(String value) {
            addCriterion("extend_s6 <>", value, "extendS6");
            return (Criteria) this;
        }

        public Criteria andExtendS6GreaterThan(String value) {
            addCriterion("extend_s6 >", value, "extendS6");
            return (Criteria) this;
        }

        public Criteria andExtendS6GreaterThanOrEqualTo(String value) {
            addCriterion("extend_s6 >=", value, "extendS6");
            return (Criteria) this;
        }

        public Criteria andExtendS6LessThan(String value) {
            addCriterion("extend_s6 <", value, "extendS6");
            return (Criteria) this;
        }

        public Criteria andExtendS6LessThanOrEqualTo(String value) {
            addCriterion("extend_s6 <=", value, "extendS6");
            return (Criteria) this;
        }

        public Criteria andExtendS6Like(String value) {
            addCriterion("extend_s6 like", value, "extendS6");
            return (Criteria) this;
        }

        public Criteria andExtendS6NotLike(String value) {
            addCriterion("extend_s6 not like", value, "extendS6");
            return (Criteria) this;
        }

        public Criteria andExtendS6In(List<String> values) {
            addCriterion("extend_s6 in", values, "extendS6");
            return (Criteria) this;
        }

        public Criteria andExtendS6NotIn(List<String> values) {
            addCriterion("extend_s6 not in", values, "extendS6");
            return (Criteria) this;
        }

        public Criteria andExtendS6Between(String value1, String value2) {
            addCriterion("extend_s6 between", value1, value2, "extendS6");
            return (Criteria) this;
        }

        public Criteria andExtendS6NotBetween(String value1, String value2) {
            addCriterion("extend_s6 not between", value1, value2, "extendS6");
            return (Criteria) this;
        }

        public Criteria andExtendS7IsNull() {
            addCriterion("extend_s7 is null");
            return (Criteria) this;
        }

        public Criteria andExtendS7IsNotNull() {
            addCriterion("extend_s7 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendS7EqualTo(String value) {
            addCriterion("extend_s7 =", value, "extendS7");
            return (Criteria) this;
        }

        public Criteria andExtendS7NotEqualTo(String value) {
            addCriterion("extend_s7 <>", value, "extendS7");
            return (Criteria) this;
        }

        public Criteria andExtendS7GreaterThan(String value) {
            addCriterion("extend_s7 >", value, "extendS7");
            return (Criteria) this;
        }

        public Criteria andExtendS7GreaterThanOrEqualTo(String value) {
            addCriterion("extend_s7 >=", value, "extendS7");
            return (Criteria) this;
        }

        public Criteria andExtendS7LessThan(String value) {
            addCriterion("extend_s7 <", value, "extendS7");
            return (Criteria) this;
        }

        public Criteria andExtendS7LessThanOrEqualTo(String value) {
            addCriterion("extend_s7 <=", value, "extendS7");
            return (Criteria) this;
        }

        public Criteria andExtendS7Like(String value) {
            addCriterion("extend_s7 like", value, "extendS7");
            return (Criteria) this;
        }

        public Criteria andExtendS7NotLike(String value) {
            addCriterion("extend_s7 not like", value, "extendS7");
            return (Criteria) this;
        }

        public Criteria andExtendS7In(List<String> values) {
            addCriterion("extend_s7 in", values, "extendS7");
            return (Criteria) this;
        }

        public Criteria andExtendS7NotIn(List<String> values) {
            addCriterion("extend_s7 not in", values, "extendS7");
            return (Criteria) this;
        }

        public Criteria andExtendS7Between(String value1, String value2) {
            addCriterion("extend_s7 between", value1, value2, "extendS7");
            return (Criteria) this;
        }

        public Criteria andExtendS7NotBetween(String value1, String value2) {
            addCriterion("extend_s7 not between", value1, value2, "extendS7");
            return (Criteria) this;
        }

        public Criteria andExtendS8IsNull() {
            addCriterion("extend_s8 is null");
            return (Criteria) this;
        }

        public Criteria andExtendS8IsNotNull() {
            addCriterion("extend_s8 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendS8EqualTo(String value) {
            addCriterion("extend_s8 =", value, "extendS8");
            return (Criteria) this;
        }

        public Criteria andExtendS8NotEqualTo(String value) {
            addCriterion("extend_s8 <>", value, "extendS8");
            return (Criteria) this;
        }

        public Criteria andExtendS8GreaterThan(String value) {
            addCriterion("extend_s8 >", value, "extendS8");
            return (Criteria) this;
        }

        public Criteria andExtendS8GreaterThanOrEqualTo(String value) {
            addCriterion("extend_s8 >=", value, "extendS8");
            return (Criteria) this;
        }

        public Criteria andExtendS8LessThan(String value) {
            addCriterion("extend_s8 <", value, "extendS8");
            return (Criteria) this;
        }

        public Criteria andExtendS8LessThanOrEqualTo(String value) {
            addCriterion("extend_s8 <=", value, "extendS8");
            return (Criteria) this;
        }

        public Criteria andExtendS8Like(String value) {
            addCriterion("extend_s8 like", value, "extendS8");
            return (Criteria) this;
        }

        public Criteria andExtendS8NotLike(String value) {
            addCriterion("extend_s8 not like", value, "extendS8");
            return (Criteria) this;
        }

        public Criteria andExtendS8In(List<String> values) {
            addCriterion("extend_s8 in", values, "extendS8");
            return (Criteria) this;
        }

        public Criteria andExtendS8NotIn(List<String> values) {
            addCriterion("extend_s8 not in", values, "extendS8");
            return (Criteria) this;
        }

        public Criteria andExtendS8Between(String value1, String value2) {
            addCriterion("extend_s8 between", value1, value2, "extendS8");
            return (Criteria) this;
        }

        public Criteria andExtendS8NotBetween(String value1, String value2) {
            addCriterion("extend_s8 not between", value1, value2, "extendS8");
            return (Criteria) this;
        }

        public Criteria andExtendI1IsNull() {
            addCriterion("extend_i1 is null");
            return (Criteria) this;
        }

        public Criteria andExtendI1IsNotNull() {
            addCriterion("extend_i1 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendI1EqualTo(BigDecimal value) {
            addCriterion("extend_i1 =", value, "extendI1");
            return (Criteria) this;
        }

        public Criteria andExtendI1NotEqualTo(BigDecimal value) {
            addCriterion("extend_i1 <>", value, "extendI1");
            return (Criteria) this;
        }

        public Criteria andExtendI1GreaterThan(BigDecimal value) {
            addCriterion("extend_i1 >", value, "extendI1");
            return (Criteria) this;
        }

        public Criteria andExtendI1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("extend_i1 >=", value, "extendI1");
            return (Criteria) this;
        }

        public Criteria andExtendI1LessThan(BigDecimal value) {
            addCriterion("extend_i1 <", value, "extendI1");
            return (Criteria) this;
        }

        public Criteria andExtendI1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("extend_i1 <=", value, "extendI1");
            return (Criteria) this;
        }

        public Criteria andExtendI1In(List<BigDecimal> values) {
            addCriterion("extend_i1 in", values, "extendI1");
            return (Criteria) this;
        }

        public Criteria andExtendI1NotIn(List<BigDecimal> values) {
            addCriterion("extend_i1 not in", values, "extendI1");
            return (Criteria) this;
        }

        public Criteria andExtendI1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("extend_i1 between", value1, value2, "extendI1");
            return (Criteria) this;
        }

        public Criteria andExtendI1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("extend_i1 not between", value1, value2, "extendI1");
            return (Criteria) this;
        }

        public Criteria andExtendI2IsNull() {
            addCriterion("extend_i2 is null");
            return (Criteria) this;
        }

        public Criteria andExtendI2IsNotNull() {
            addCriterion("extend_i2 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendI2EqualTo(BigDecimal value) {
            addCriterion("extend_i2 =", value, "extendI2");
            return (Criteria) this;
        }

        public Criteria andExtendI2NotEqualTo(BigDecimal value) {
            addCriterion("extend_i2 <>", value, "extendI2");
            return (Criteria) this;
        }

        public Criteria andExtendI2GreaterThan(BigDecimal value) {
            addCriterion("extend_i2 >", value, "extendI2");
            return (Criteria) this;
        }

        public Criteria andExtendI2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("extend_i2 >=", value, "extendI2");
            return (Criteria) this;
        }

        public Criteria andExtendI2LessThan(BigDecimal value) {
            addCriterion("extend_i2 <", value, "extendI2");
            return (Criteria) this;
        }

        public Criteria andExtendI2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("extend_i2 <=", value, "extendI2");
            return (Criteria) this;
        }

        public Criteria andExtendI2In(List<BigDecimal> values) {
            addCriterion("extend_i2 in", values, "extendI2");
            return (Criteria) this;
        }

        public Criteria andExtendI2NotIn(List<BigDecimal> values) {
            addCriterion("extend_i2 not in", values, "extendI2");
            return (Criteria) this;
        }

        public Criteria andExtendI2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("extend_i2 between", value1, value2, "extendI2");
            return (Criteria) this;
        }

        public Criteria andExtendI2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("extend_i2 not between", value1, value2, "extendI2");
            return (Criteria) this;
        }

        public Criteria andExtendI3IsNull() {
            addCriterion("extend_i3 is null");
            return (Criteria) this;
        }

        public Criteria andExtendI3IsNotNull() {
            addCriterion("extend_i3 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendI3EqualTo(BigDecimal value) {
            addCriterion("extend_i3 =", value, "extendI3");
            return (Criteria) this;
        }

        public Criteria andExtendI3NotEqualTo(BigDecimal value) {
            addCriterion("extend_i3 <>", value, "extendI3");
            return (Criteria) this;
        }

        public Criteria andExtendI3GreaterThan(BigDecimal value) {
            addCriterion("extend_i3 >", value, "extendI3");
            return (Criteria) this;
        }

        public Criteria andExtendI3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("extend_i3 >=", value, "extendI3");
            return (Criteria) this;
        }

        public Criteria andExtendI3LessThan(BigDecimal value) {
            addCriterion("extend_i3 <", value, "extendI3");
            return (Criteria) this;
        }

        public Criteria andExtendI3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("extend_i3 <=", value, "extendI3");
            return (Criteria) this;
        }

        public Criteria andExtendI3In(List<BigDecimal> values) {
            addCriterion("extend_i3 in", values, "extendI3");
            return (Criteria) this;
        }

        public Criteria andExtendI3NotIn(List<BigDecimal> values) {
            addCriterion("extend_i3 not in", values, "extendI3");
            return (Criteria) this;
        }

        public Criteria andExtendI3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("extend_i3 between", value1, value2, "extendI3");
            return (Criteria) this;
        }

        public Criteria andExtendI3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("extend_i3 not between", value1, value2, "extendI3");
            return (Criteria) this;
        }

        public Criteria andExtendI4IsNull() {
            addCriterion("extend_i4 is null");
            return (Criteria) this;
        }

        public Criteria andExtendI4IsNotNull() {
            addCriterion("extend_i4 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendI4EqualTo(BigDecimal value) {
            addCriterion("extend_i4 =", value, "extendI4");
            return (Criteria) this;
        }

        public Criteria andExtendI4NotEqualTo(BigDecimal value) {
            addCriterion("extend_i4 <>", value, "extendI4");
            return (Criteria) this;
        }

        public Criteria andExtendI4GreaterThan(BigDecimal value) {
            addCriterion("extend_i4 >", value, "extendI4");
            return (Criteria) this;
        }

        public Criteria andExtendI4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("extend_i4 >=", value, "extendI4");
            return (Criteria) this;
        }

        public Criteria andExtendI4LessThan(BigDecimal value) {
            addCriterion("extend_i4 <", value, "extendI4");
            return (Criteria) this;
        }

        public Criteria andExtendI4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("extend_i4 <=", value, "extendI4");
            return (Criteria) this;
        }

        public Criteria andExtendI4In(List<BigDecimal> values) {
            addCriterion("extend_i4 in", values, "extendI4");
            return (Criteria) this;
        }

        public Criteria andExtendI4NotIn(List<BigDecimal> values) {
            addCriterion("extend_i4 not in", values, "extendI4");
            return (Criteria) this;
        }

        public Criteria andExtendI4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("extend_i4 between", value1, value2, "extendI4");
            return (Criteria) this;
        }

        public Criteria andExtendI4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("extend_i4 not between", value1, value2, "extendI4");
            return (Criteria) this;
        }

        public Criteria andExtendF1IsNull() {
            addCriterion("extend_f1 is null");
            return (Criteria) this;
        }

        public Criteria andExtendF1IsNotNull() {
            addCriterion("extend_f1 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendF1EqualTo(BigDecimal value) {
            addCriterion("extend_f1 =", value, "extendF1");
            return (Criteria) this;
        }

        public Criteria andExtendF1NotEqualTo(BigDecimal value) {
            addCriterion("extend_f1 <>", value, "extendF1");
            return (Criteria) this;
        }

        public Criteria andExtendF1GreaterThan(BigDecimal value) {
            addCriterion("extend_f1 >", value, "extendF1");
            return (Criteria) this;
        }

        public Criteria andExtendF1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("extend_f1 >=", value, "extendF1");
            return (Criteria) this;
        }

        public Criteria andExtendF1LessThan(BigDecimal value) {
            addCriterion("extend_f1 <", value, "extendF1");
            return (Criteria) this;
        }

        public Criteria andExtendF1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("extend_f1 <=", value, "extendF1");
            return (Criteria) this;
        }

        public Criteria andExtendF1In(List<BigDecimal> values) {
            addCriterion("extend_f1 in", values, "extendF1");
            return (Criteria) this;
        }

        public Criteria andExtendF1NotIn(List<BigDecimal> values) {
            addCriterion("extend_f1 not in", values, "extendF1");
            return (Criteria) this;
        }

        public Criteria andExtendF1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("extend_f1 between", value1, value2, "extendF1");
            return (Criteria) this;
        }

        public Criteria andExtendF1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("extend_f1 not between", value1, value2, "extendF1");
            return (Criteria) this;
        }

        public Criteria andExtendF2IsNull() {
            addCriterion("extend_f2 is null");
            return (Criteria) this;
        }

        public Criteria andExtendF2IsNotNull() {
            addCriterion("extend_f2 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendF2EqualTo(BigDecimal value) {
            addCriterion("extend_f2 =", value, "extendF2");
            return (Criteria) this;
        }

        public Criteria andExtendF2NotEqualTo(BigDecimal value) {
            addCriterion("extend_f2 <>", value, "extendF2");
            return (Criteria) this;
        }

        public Criteria andExtendF2GreaterThan(BigDecimal value) {
            addCriterion("extend_f2 >", value, "extendF2");
            return (Criteria) this;
        }

        public Criteria andExtendF2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("extend_f2 >=", value, "extendF2");
            return (Criteria) this;
        }

        public Criteria andExtendF2LessThan(BigDecimal value) {
            addCriterion("extend_f2 <", value, "extendF2");
            return (Criteria) this;
        }

        public Criteria andExtendF2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("extend_f2 <=", value, "extendF2");
            return (Criteria) this;
        }

        public Criteria andExtendF2In(List<BigDecimal> values) {
            addCriterion("extend_f2 in", values, "extendF2");
            return (Criteria) this;
        }

        public Criteria andExtendF2NotIn(List<BigDecimal> values) {
            addCriterion("extend_f2 not in", values, "extendF2");
            return (Criteria) this;
        }

        public Criteria andExtendF2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("extend_f2 between", value1, value2, "extendF2");
            return (Criteria) this;
        }

        public Criteria andExtendF2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("extend_f2 not between", value1, value2, "extendF2");
            return (Criteria) this;
        }

        public Criteria andExtendF3IsNull() {
            addCriterion("extend_f3 is null");
            return (Criteria) this;
        }

        public Criteria andExtendF3IsNotNull() {
            addCriterion("extend_f3 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendF3EqualTo(BigDecimal value) {
            addCriterion("extend_f3 =", value, "extendF3");
            return (Criteria) this;
        }

        public Criteria andExtendF3NotEqualTo(BigDecimal value) {
            addCriterion("extend_f3 <>", value, "extendF3");
            return (Criteria) this;
        }

        public Criteria andExtendF3GreaterThan(BigDecimal value) {
            addCriterion("extend_f3 >", value, "extendF3");
            return (Criteria) this;
        }

        public Criteria andExtendF3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("extend_f3 >=", value, "extendF3");
            return (Criteria) this;
        }

        public Criteria andExtendF3LessThan(BigDecimal value) {
            addCriterion("extend_f3 <", value, "extendF3");
            return (Criteria) this;
        }

        public Criteria andExtendF3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("extend_f3 <=", value, "extendF3");
            return (Criteria) this;
        }

        public Criteria andExtendF3In(List<BigDecimal> values) {
            addCriterion("extend_f3 in", values, "extendF3");
            return (Criteria) this;
        }

        public Criteria andExtendF3NotIn(List<BigDecimal> values) {
            addCriterion("extend_f3 not in", values, "extendF3");
            return (Criteria) this;
        }

        public Criteria andExtendF3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("extend_f3 between", value1, value2, "extendF3");
            return (Criteria) this;
        }

        public Criteria andExtendF3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("extend_f3 not between", value1, value2, "extendF3");
            return (Criteria) this;
        }

        public Criteria andExtendF4IsNull() {
            addCriterion("extend_f4 is null");
            return (Criteria) this;
        }

        public Criteria andExtendF4IsNotNull() {
            addCriterion("extend_f4 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendF4EqualTo(BigDecimal value) {
            addCriterion("extend_f4 =", value, "extendF4");
            return (Criteria) this;
        }

        public Criteria andExtendF4NotEqualTo(BigDecimal value) {
            addCriterion("extend_f4 <>", value, "extendF4");
            return (Criteria) this;
        }

        public Criteria andExtendF4GreaterThan(BigDecimal value) {
            addCriterion("extend_f4 >", value, "extendF4");
            return (Criteria) this;
        }

        public Criteria andExtendF4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("extend_f4 >=", value, "extendF4");
            return (Criteria) this;
        }

        public Criteria andExtendF4LessThan(BigDecimal value) {
            addCriterion("extend_f4 <", value, "extendF4");
            return (Criteria) this;
        }

        public Criteria andExtendF4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("extend_f4 <=", value, "extendF4");
            return (Criteria) this;
        }

        public Criteria andExtendF4In(List<BigDecimal> values) {
            addCriterion("extend_f4 in", values, "extendF4");
            return (Criteria) this;
        }

        public Criteria andExtendF4NotIn(List<BigDecimal> values) {
            addCriterion("extend_f4 not in", values, "extendF4");
            return (Criteria) this;
        }

        public Criteria andExtendF4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("extend_f4 between", value1, value2, "extendF4");
            return (Criteria) this;
        }

        public Criteria andExtendF4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("extend_f4 not between", value1, value2, "extendF4");
            return (Criteria) this;
        }

        public Criteria andExtendD1IsNull() {
            addCriterion("extend_d1 is null");
            return (Criteria) this;
        }

        public Criteria andExtendD1IsNotNull() {
            addCriterion("extend_d1 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendD1EqualTo(Date value) {
            addCriterion("extend_d1 =", value, "extendD1");
            return (Criteria) this;
        }

        public Criteria andExtendD1NotEqualTo(Date value) {
            addCriterion("extend_d1 <>", value, "extendD1");
            return (Criteria) this;
        }

        public Criteria andExtendD1GreaterThan(Date value) {
            addCriterion("extend_d1 >", value, "extendD1");
            return (Criteria) this;
        }

        public Criteria andExtendD1GreaterThanOrEqualTo(Date value) {
            addCriterion("extend_d1 >=", value, "extendD1");
            return (Criteria) this;
        }

        public Criteria andExtendD1LessThan(Date value) {
            addCriterion("extend_d1 <", value, "extendD1");
            return (Criteria) this;
        }

        public Criteria andExtendD1LessThanOrEqualTo(Date value) {
            addCriterion("extend_d1 <=", value, "extendD1");
            return (Criteria) this;
        }

        public Criteria andExtendD1In(List<Date> values) {
            addCriterion("extend_d1 in", values, "extendD1");
            return (Criteria) this;
        }

        public Criteria andExtendD1NotIn(List<Date> values) {
            addCriterion("extend_d1 not in", values, "extendD1");
            return (Criteria) this;
        }

        public Criteria andExtendD1Between(Date value1, Date value2) {
            addCriterion("extend_d1 between", value1, value2, "extendD1");
            return (Criteria) this;
        }

        public Criteria andExtendD1NotBetween(Date value1, Date value2) {
            addCriterion("extend_d1 not between", value1, value2, "extendD1");
            return (Criteria) this;
        }

        public Criteria andExtendD2IsNull() {
            addCriterion("extend_d2 is null");
            return (Criteria) this;
        }

        public Criteria andExtendD2IsNotNull() {
            addCriterion("extend_d2 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendD2EqualTo(Date value) {
            addCriterion("extend_d2 =", value, "extendD2");
            return (Criteria) this;
        }

        public Criteria andExtendD2NotEqualTo(Date value) {
            addCriterion("extend_d2 <>", value, "extendD2");
            return (Criteria) this;
        }

        public Criteria andExtendD2GreaterThan(Date value) {
            addCriterion("extend_d2 >", value, "extendD2");
            return (Criteria) this;
        }

        public Criteria andExtendD2GreaterThanOrEqualTo(Date value) {
            addCriterion("extend_d2 >=", value, "extendD2");
            return (Criteria) this;
        }

        public Criteria andExtendD2LessThan(Date value) {
            addCriterion("extend_d2 <", value, "extendD2");
            return (Criteria) this;
        }

        public Criteria andExtendD2LessThanOrEqualTo(Date value) {
            addCriterion("extend_d2 <=", value, "extendD2");
            return (Criteria) this;
        }

        public Criteria andExtendD2In(List<Date> values) {
            addCriterion("extend_d2 in", values, "extendD2");
            return (Criteria) this;
        }

        public Criteria andExtendD2NotIn(List<Date> values) {
            addCriterion("extend_d2 not in", values, "extendD2");
            return (Criteria) this;
        }

        public Criteria andExtendD2Between(Date value1, Date value2) {
            addCriterion("extend_d2 between", value1, value2, "extendD2");
            return (Criteria) this;
        }

        public Criteria andExtendD2NotBetween(Date value1, Date value2) {
            addCriterion("extend_d2 not between", value1, value2, "extendD2");
            return (Criteria) this;
        }

        public Criteria andExtendD3IsNull() {
            addCriterion("extend_d3 is null");
            return (Criteria) this;
        }

        public Criteria andExtendD3IsNotNull() {
            addCriterion("extend_d3 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendD3EqualTo(Date value) {
            addCriterion("extend_d3 =", value, "extendD3");
            return (Criteria) this;
        }

        public Criteria andExtendD3NotEqualTo(Date value) {
            addCriterion("extend_d3 <>", value, "extendD3");
            return (Criteria) this;
        }

        public Criteria andExtendD3GreaterThan(Date value) {
            addCriterion("extend_d3 >", value, "extendD3");
            return (Criteria) this;
        }

        public Criteria andExtendD3GreaterThanOrEqualTo(Date value) {
            addCriterion("extend_d3 >=", value, "extendD3");
            return (Criteria) this;
        }

        public Criteria andExtendD3LessThan(Date value) {
            addCriterion("extend_d3 <", value, "extendD3");
            return (Criteria) this;
        }

        public Criteria andExtendD3LessThanOrEqualTo(Date value) {
            addCriterion("extend_d3 <=", value, "extendD3");
            return (Criteria) this;
        }

        public Criteria andExtendD3In(List<Date> values) {
            addCriterion("extend_d3 in", values, "extendD3");
            return (Criteria) this;
        }

        public Criteria andExtendD3NotIn(List<Date> values) {
            addCriterion("extend_d3 not in", values, "extendD3");
            return (Criteria) this;
        }

        public Criteria andExtendD3Between(Date value1, Date value2) {
            addCriterion("extend_d3 between", value1, value2, "extendD3");
            return (Criteria) this;
        }

        public Criteria andExtendD3NotBetween(Date value1, Date value2) {
            addCriterion("extend_d3 not between", value1, value2, "extendD3");
            return (Criteria) this;
        }

        public Criteria andExtendD4IsNull() {
            addCriterion("extend_d4 is null");
            return (Criteria) this;
        }

        public Criteria andExtendD4IsNotNull() {
            addCriterion("extend_d4 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendD4EqualTo(Date value) {
            addCriterion("extend_d4 =", value, "extendD4");
            return (Criteria) this;
        }

        public Criteria andExtendD4NotEqualTo(Date value) {
            addCriterion("extend_d4 <>", value, "extendD4");
            return (Criteria) this;
        }

        public Criteria andExtendD4GreaterThan(Date value) {
            addCriterion("extend_d4 >", value, "extendD4");
            return (Criteria) this;
        }

        public Criteria andExtendD4GreaterThanOrEqualTo(Date value) {
            addCriterion("extend_d4 >=", value, "extendD4");
            return (Criteria) this;
        }

        public Criteria andExtendD4LessThan(Date value) {
            addCriterion("extend_d4 <", value, "extendD4");
            return (Criteria) this;
        }

        public Criteria andExtendD4LessThanOrEqualTo(Date value) {
            addCriterion("extend_d4 <=", value, "extendD4");
            return (Criteria) this;
        }

        public Criteria andExtendD4In(List<Date> values) {
            addCriterion("extend_d4 in", values, "extendD4");
            return (Criteria) this;
        }

        public Criteria andExtendD4NotIn(List<Date> values) {
            addCriterion("extend_d4 not in", values, "extendD4");
            return (Criteria) this;
        }

        public Criteria andExtendD4Between(Date value1, Date value2) {
            addCriterion("extend_d4 between", value1, value2, "extendD4");
            return (Criteria) this;
        }

        public Criteria andExtendD4NotBetween(Date value1, Date value2) {
            addCriterion("extend_d4 not between", value1, value2, "extendD4");
            return (Criteria) this;
        }

        public Criteria andUserCodeLikeInsensitive(String value) {
            addCriterion("upper(user_code) like", value.toUpperCase(), "userCode");
            return (Criteria) this;
        }

        public Criteria andLoginCodeLikeInsensitive(String value) {
            addCriterion("upper(login_code) like", value.toUpperCase(), "loginCode");
            return (Criteria) this;
        }

        public Criteria andUserNameLikeInsensitive(String value) {
            addCriterion("upper(user_name) like", value.toUpperCase(), "userName");
            return (Criteria) this;
        }

        public Criteria andPasswordLikeInsensitive(String value) {
            addCriterion("upper(password) like", value.toUpperCase(), "password");
            return (Criteria) this;
        }

        public Criteria andEmailLikeInsensitive(String value) {
            addCriterion("upper(email) like", value.toUpperCase(), "email");
            return (Criteria) this;
        }

        public Criteria andMobileLikeInsensitive(String value) {
            addCriterion("upper(mobile) like", value.toUpperCase(), "mobile");
            return (Criteria) this;
        }

        public Criteria andPhoneLikeInsensitive(String value) {
            addCriterion("upper(phone) like", value.toUpperCase(), "phone");
            return (Criteria) this;
        }

        public Criteria andSexLikeInsensitive(String value) {
            addCriterion("upper(sex) like", value.toUpperCase(), "sex");
            return (Criteria) this;
        }

        public Criteria andAvatarLikeInsensitive(String value) {
            addCriterion("upper(avatar) like", value.toUpperCase(), "avatar");
            return (Criteria) this;
        }

        public Criteria andSignLikeInsensitive(String value) {
            addCriterion("upper(sign) like", value.toUpperCase(), "sign");
            return (Criteria) this;
        }

        public Criteria andWxOpenidLikeInsensitive(String value) {
            addCriterion("upper(wx_openid) like", value.toUpperCase(), "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andMobileImeiLikeInsensitive(String value) {
            addCriterion("upper(mobile_imei) like", value.toUpperCase(), "mobileImei");
            return (Criteria) this;
        }

        public Criteria andUserTypeLikeInsensitive(String value) {
            addCriterion("upper(user_type) like", value.toUpperCase(), "userType");
            return (Criteria) this;
        }

        public Criteria andRefCodeLikeInsensitive(String value) {
            addCriterion("upper(ref_code) like", value.toUpperCase(), "refCode");
            return (Criteria) this;
        }

        public Criteria andRefNameLikeInsensitive(String value) {
            addCriterion("upper(ref_name) like", value.toUpperCase(), "refName");
            return (Criteria) this;
        }

        public Criteria andMgrTypeLikeInsensitive(String value) {
            addCriterion("upper(mgr_type) like", value.toUpperCase(), "mgrType");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateRecordLikeInsensitive(String value) {
            addCriterion("upper(pwd_update_record) like", value.toUpperCase(), "pwdUpdateRecord");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionLikeInsensitive(String value) {
            addCriterion("upper(pwd_question) like", value.toUpperCase(), "pwdQuestion");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswerLikeInsensitive(String value) {
            addCriterion("upper(pwd_question_answer) like", value.toUpperCase(), "pwdQuestionAnswer");
            return (Criteria) this;
        }

        public Criteria andPwdQuestion2LikeInsensitive(String value) {
            addCriterion("upper(pwd_question_2) like", value.toUpperCase(), "pwdQuestion2");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswer2LikeInsensitive(String value) {
            addCriterion("upper(pwd_question_answer_2) like", value.toUpperCase(), "pwdQuestionAnswer2");
            return (Criteria) this;
        }

        public Criteria andPwdQuestion3LikeInsensitive(String value) {
            addCriterion("upper(pwd_question_3) like", value.toUpperCase(), "pwdQuestion3");
            return (Criteria) this;
        }

        public Criteria andPwdQuestionAnswer3LikeInsensitive(String value) {
            addCriterion("upper(pwd_question_answer_3) like", value.toUpperCase(), "pwdQuestionAnswer3");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLikeInsensitive(String value) {
            addCriterion("upper(last_login_ip) like", value.toUpperCase(), "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andFreezeCauseLikeInsensitive(String value) {
            addCriterion("upper(freeze_cause) like", value.toUpperCase(), "freezeCause");
            return (Criteria) this;
        }

        public Criteria andStatusLikeInsensitive(String value) {
            addCriterion("upper(status) like", value.toUpperCase(), "status");
            return (Criteria) this;
        }

        public Criteria andCreateByLikeInsensitive(String value) {
            addCriterion("upper(create_by) like", value.toUpperCase(), "createBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLikeInsensitive(String value) {
            addCriterion("upper(update_by) like", value.toUpperCase(), "updateBy");
            return (Criteria) this;
        }

        public Criteria andRemarksLikeInsensitive(String value) {
            addCriterion("upper(remarks) like", value.toUpperCase(), "remarks");
            return (Criteria) this;
        }

        public Criteria andCorpCodeLikeInsensitive(String value) {
            addCriterion("upper(corp_code) like", value.toUpperCase(), "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpNameLikeInsensitive(String value) {
            addCriterion("upper(corp_name) like", value.toUpperCase(), "corpName");
            return (Criteria) this;
        }

        public Criteria andExtendS1LikeInsensitive(String value) {
            addCriterion("upper(extend_s1) like", value.toUpperCase(), "extendS1");
            return (Criteria) this;
        }

        public Criteria andExtendS2LikeInsensitive(String value) {
            addCriterion("upper(extend_s2) like", value.toUpperCase(), "extendS2");
            return (Criteria) this;
        }

        public Criteria andExtendS3LikeInsensitive(String value) {
            addCriterion("upper(extend_s3) like", value.toUpperCase(), "extendS3");
            return (Criteria) this;
        }

        public Criteria andExtendS4LikeInsensitive(String value) {
            addCriterion("upper(extend_s4) like", value.toUpperCase(), "extendS4");
            return (Criteria) this;
        }

        public Criteria andExtendS5LikeInsensitive(String value) {
            addCriterion("upper(extend_s5) like", value.toUpperCase(), "extendS5");
            return (Criteria) this;
        }

        public Criteria andExtendS6LikeInsensitive(String value) {
            addCriterion("upper(extend_s6) like", value.toUpperCase(), "extendS6");
            return (Criteria) this;
        }

        public Criteria andExtendS7LikeInsensitive(String value) {
            addCriterion("upper(extend_s7) like", value.toUpperCase(), "extendS7");
            return (Criteria) this;
        }

        public Criteria andExtendS8LikeInsensitive(String value) {
            addCriterion("upper(extend_s8) like", value.toUpperCase(), "extendS8");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}