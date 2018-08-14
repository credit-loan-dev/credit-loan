package com.sixliu.credit.user.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysRoleExample() {
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

        public Criteria andRoleCodeIsNull() {
            addCriterion("role_code is null");
            return (Criteria) this;
        }

        public Criteria andRoleCodeIsNotNull() {
            addCriterion("role_code is not null");
            return (Criteria) this;
        }

        public Criteria andRoleCodeEqualTo(String value) {
            addCriterion("role_code =", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeNotEqualTo(String value) {
            addCriterion("role_code <>", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeGreaterThan(String value) {
            addCriterion("role_code >", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeGreaterThanOrEqualTo(String value) {
            addCriterion("role_code >=", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeLessThan(String value) {
            addCriterion("role_code <", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeLessThanOrEqualTo(String value) {
            addCriterion("role_code <=", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeLike(String value) {
            addCriterion("role_code like", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeNotLike(String value) {
            addCriterion("role_code not like", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeIn(List<String> values) {
            addCriterion("role_code in", values, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeNotIn(List<String> values) {
            addCriterion("role_code not in", values, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeBetween(String value1, String value2) {
            addCriterion("role_code between", value1, value2, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeNotBetween(String value1, String value2) {
            addCriterion("role_code not between", value1, value2, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNull() {
            addCriterion("role_name is null");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNotNull() {
            addCriterion("role_name is not null");
            return (Criteria) this;
        }

        public Criteria andRoleNameEqualTo(String value) {
            addCriterion("role_name =", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotEqualTo(String value) {
            addCriterion("role_name <>", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThan(String value) {
            addCriterion("role_name >", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("role_name >=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThan(String value) {
            addCriterion("role_name <", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThanOrEqualTo(String value) {
            addCriterion("role_name <=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLike(String value) {
            addCriterion("role_name like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotLike(String value) {
            addCriterion("role_name not like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameIn(List<String> values) {
            addCriterion("role_name in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotIn(List<String> values) {
            addCriterion("role_name not in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameBetween(String value1, String value2) {
            addCriterion("role_name between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotBetween(String value1, String value2) {
            addCriterion("role_name not between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIsNull() {
            addCriterion("role_type is null");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIsNotNull() {
            addCriterion("role_type is not null");
            return (Criteria) this;
        }

        public Criteria andRoleTypeEqualTo(String value) {
            addCriterion("role_type =", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNotEqualTo(String value) {
            addCriterion("role_type <>", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeGreaterThan(String value) {
            addCriterion("role_type >", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("role_type >=", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeLessThan(String value) {
            addCriterion("role_type <", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeLessThanOrEqualTo(String value) {
            addCriterion("role_type <=", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeLike(String value) {
            addCriterion("role_type like", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNotLike(String value) {
            addCriterion("role_type not like", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIn(List<String> values) {
            addCriterion("role_type in", values, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNotIn(List<String> values) {
            addCriterion("role_type not in", values, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeBetween(String value1, String value2) {
            addCriterion("role_type between", value1, value2, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNotBetween(String value1, String value2) {
            addCriterion("role_type not between", value1, value2, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleSortIsNull() {
            addCriterion("role_sort is null");
            return (Criteria) this;
        }

        public Criteria andRoleSortIsNotNull() {
            addCriterion("role_sort is not null");
            return (Criteria) this;
        }

        public Criteria andRoleSortEqualTo(Long value) {
            addCriterion("role_sort =", value, "roleSort");
            return (Criteria) this;
        }

        public Criteria andRoleSortNotEqualTo(Long value) {
            addCriterion("role_sort <>", value, "roleSort");
            return (Criteria) this;
        }

        public Criteria andRoleSortGreaterThan(Long value) {
            addCriterion("role_sort >", value, "roleSort");
            return (Criteria) this;
        }

        public Criteria andRoleSortGreaterThanOrEqualTo(Long value) {
            addCriterion("role_sort >=", value, "roleSort");
            return (Criteria) this;
        }

        public Criteria andRoleSortLessThan(Long value) {
            addCriterion("role_sort <", value, "roleSort");
            return (Criteria) this;
        }

        public Criteria andRoleSortLessThanOrEqualTo(Long value) {
            addCriterion("role_sort <=", value, "roleSort");
            return (Criteria) this;
        }

        public Criteria andRoleSortIn(List<Long> values) {
            addCriterion("role_sort in", values, "roleSort");
            return (Criteria) this;
        }

        public Criteria andRoleSortNotIn(List<Long> values) {
            addCriterion("role_sort not in", values, "roleSort");
            return (Criteria) this;
        }

        public Criteria andRoleSortBetween(Long value1, Long value2) {
            addCriterion("role_sort between", value1, value2, "roleSort");
            return (Criteria) this;
        }

        public Criteria andRoleSortNotBetween(Long value1, Long value2) {
            addCriterion("role_sort not between", value1, value2, "roleSort");
            return (Criteria) this;
        }

        public Criteria andIsSysIsNull() {
            addCriterion("is_sys is null");
            return (Criteria) this;
        }

        public Criteria andIsSysIsNotNull() {
            addCriterion("is_sys is not null");
            return (Criteria) this;
        }

        public Criteria andIsSysEqualTo(String value) {
            addCriterion("is_sys =", value, "isSys");
            return (Criteria) this;
        }

        public Criteria andIsSysNotEqualTo(String value) {
            addCriterion("is_sys <>", value, "isSys");
            return (Criteria) this;
        }

        public Criteria andIsSysGreaterThan(String value) {
            addCriterion("is_sys >", value, "isSys");
            return (Criteria) this;
        }

        public Criteria andIsSysGreaterThanOrEqualTo(String value) {
            addCriterion("is_sys >=", value, "isSys");
            return (Criteria) this;
        }

        public Criteria andIsSysLessThan(String value) {
            addCriterion("is_sys <", value, "isSys");
            return (Criteria) this;
        }

        public Criteria andIsSysLessThanOrEqualTo(String value) {
            addCriterion("is_sys <=", value, "isSys");
            return (Criteria) this;
        }

        public Criteria andIsSysLike(String value) {
            addCriterion("is_sys like", value, "isSys");
            return (Criteria) this;
        }

        public Criteria andIsSysNotLike(String value) {
            addCriterion("is_sys not like", value, "isSys");
            return (Criteria) this;
        }

        public Criteria andIsSysIn(List<String> values) {
            addCriterion("is_sys in", values, "isSys");
            return (Criteria) this;
        }

        public Criteria andIsSysNotIn(List<String> values) {
            addCriterion("is_sys not in", values, "isSys");
            return (Criteria) this;
        }

        public Criteria andIsSysBetween(String value1, String value2) {
            addCriterion("is_sys between", value1, value2, "isSys");
            return (Criteria) this;
        }

        public Criteria andIsSysNotBetween(String value1, String value2) {
            addCriterion("is_sys not between", value1, value2, "isSys");
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

        public Criteria andDataScopeIsNull() {
            addCriterion("data_scope is null");
            return (Criteria) this;
        }

        public Criteria andDataScopeIsNotNull() {
            addCriterion("data_scope is not null");
            return (Criteria) this;
        }

        public Criteria andDataScopeEqualTo(String value) {
            addCriterion("data_scope =", value, "dataScope");
            return (Criteria) this;
        }

        public Criteria andDataScopeNotEqualTo(String value) {
            addCriterion("data_scope <>", value, "dataScope");
            return (Criteria) this;
        }

        public Criteria andDataScopeGreaterThan(String value) {
            addCriterion("data_scope >", value, "dataScope");
            return (Criteria) this;
        }

        public Criteria andDataScopeGreaterThanOrEqualTo(String value) {
            addCriterion("data_scope >=", value, "dataScope");
            return (Criteria) this;
        }

        public Criteria andDataScopeLessThan(String value) {
            addCriterion("data_scope <", value, "dataScope");
            return (Criteria) this;
        }

        public Criteria andDataScopeLessThanOrEqualTo(String value) {
            addCriterion("data_scope <=", value, "dataScope");
            return (Criteria) this;
        }

        public Criteria andDataScopeLike(String value) {
            addCriterion("data_scope like", value, "dataScope");
            return (Criteria) this;
        }

        public Criteria andDataScopeNotLike(String value) {
            addCriterion("data_scope not like", value, "dataScope");
            return (Criteria) this;
        }

        public Criteria andDataScopeIn(List<String> values) {
            addCriterion("data_scope in", values, "dataScope");
            return (Criteria) this;
        }

        public Criteria andDataScopeNotIn(List<String> values) {
            addCriterion("data_scope not in", values, "dataScope");
            return (Criteria) this;
        }

        public Criteria andDataScopeBetween(String value1, String value2) {
            addCriterion("data_scope between", value1, value2, "dataScope");
            return (Criteria) this;
        }

        public Criteria andDataScopeNotBetween(String value1, String value2) {
            addCriterion("data_scope not between", value1, value2, "dataScope");
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

        public Criteria andRoleCodeLikeInsensitive(String value) {
            addCriterion("upper(role_code) like", value.toUpperCase(), "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleNameLikeInsensitive(String value) {
            addCriterion("upper(role_name) like", value.toUpperCase(), "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleTypeLikeInsensitive(String value) {
            addCriterion("upper(role_type) like", value.toUpperCase(), "roleType");
            return (Criteria) this;
        }

        public Criteria andIsSysLikeInsensitive(String value) {
            addCriterion("upper(is_sys) like", value.toUpperCase(), "isSys");
            return (Criteria) this;
        }

        public Criteria andUserTypeLikeInsensitive(String value) {
            addCriterion("upper(user_type) like", value.toUpperCase(), "userType");
            return (Criteria) this;
        }

        public Criteria andDataScopeLikeInsensitive(String value) {
            addCriterion("upper(data_scope) like", value.toUpperCase(), "dataScope");
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