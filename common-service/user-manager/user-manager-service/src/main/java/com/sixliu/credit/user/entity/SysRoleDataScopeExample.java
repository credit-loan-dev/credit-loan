package com.sixliu.credit.user.entity;

import java.util.ArrayList;
import java.util.List;

public class SysRoleDataScopeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysRoleDataScopeExample() {
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

        public Criteria andCtrlTypeIsNull() {
            addCriterion("ctrl_type is null");
            return (Criteria) this;
        }

        public Criteria andCtrlTypeIsNotNull() {
            addCriterion("ctrl_type is not null");
            return (Criteria) this;
        }

        public Criteria andCtrlTypeEqualTo(String value) {
            addCriterion("ctrl_type =", value, "ctrlType");
            return (Criteria) this;
        }

        public Criteria andCtrlTypeNotEqualTo(String value) {
            addCriterion("ctrl_type <>", value, "ctrlType");
            return (Criteria) this;
        }

        public Criteria andCtrlTypeGreaterThan(String value) {
            addCriterion("ctrl_type >", value, "ctrlType");
            return (Criteria) this;
        }

        public Criteria andCtrlTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ctrl_type >=", value, "ctrlType");
            return (Criteria) this;
        }

        public Criteria andCtrlTypeLessThan(String value) {
            addCriterion("ctrl_type <", value, "ctrlType");
            return (Criteria) this;
        }

        public Criteria andCtrlTypeLessThanOrEqualTo(String value) {
            addCriterion("ctrl_type <=", value, "ctrlType");
            return (Criteria) this;
        }

        public Criteria andCtrlTypeLike(String value) {
            addCriterion("ctrl_type like", value, "ctrlType");
            return (Criteria) this;
        }

        public Criteria andCtrlTypeNotLike(String value) {
            addCriterion("ctrl_type not like", value, "ctrlType");
            return (Criteria) this;
        }

        public Criteria andCtrlTypeIn(List<String> values) {
            addCriterion("ctrl_type in", values, "ctrlType");
            return (Criteria) this;
        }

        public Criteria andCtrlTypeNotIn(List<String> values) {
            addCriterion("ctrl_type not in", values, "ctrlType");
            return (Criteria) this;
        }

        public Criteria andCtrlTypeBetween(String value1, String value2) {
            addCriterion("ctrl_type between", value1, value2, "ctrlType");
            return (Criteria) this;
        }

        public Criteria andCtrlTypeNotBetween(String value1, String value2) {
            addCriterion("ctrl_type not between", value1, value2, "ctrlType");
            return (Criteria) this;
        }

        public Criteria andCtrlDataIsNull() {
            addCriterion("ctrl_data is null");
            return (Criteria) this;
        }

        public Criteria andCtrlDataIsNotNull() {
            addCriterion("ctrl_data is not null");
            return (Criteria) this;
        }

        public Criteria andCtrlDataEqualTo(String value) {
            addCriterion("ctrl_data =", value, "ctrlData");
            return (Criteria) this;
        }

        public Criteria andCtrlDataNotEqualTo(String value) {
            addCriterion("ctrl_data <>", value, "ctrlData");
            return (Criteria) this;
        }

        public Criteria andCtrlDataGreaterThan(String value) {
            addCriterion("ctrl_data >", value, "ctrlData");
            return (Criteria) this;
        }

        public Criteria andCtrlDataGreaterThanOrEqualTo(String value) {
            addCriterion("ctrl_data >=", value, "ctrlData");
            return (Criteria) this;
        }

        public Criteria andCtrlDataLessThan(String value) {
            addCriterion("ctrl_data <", value, "ctrlData");
            return (Criteria) this;
        }

        public Criteria andCtrlDataLessThanOrEqualTo(String value) {
            addCriterion("ctrl_data <=", value, "ctrlData");
            return (Criteria) this;
        }

        public Criteria andCtrlDataLike(String value) {
            addCriterion("ctrl_data like", value, "ctrlData");
            return (Criteria) this;
        }

        public Criteria andCtrlDataNotLike(String value) {
            addCriterion("ctrl_data not like", value, "ctrlData");
            return (Criteria) this;
        }

        public Criteria andCtrlDataIn(List<String> values) {
            addCriterion("ctrl_data in", values, "ctrlData");
            return (Criteria) this;
        }

        public Criteria andCtrlDataNotIn(List<String> values) {
            addCriterion("ctrl_data not in", values, "ctrlData");
            return (Criteria) this;
        }

        public Criteria andCtrlDataBetween(String value1, String value2) {
            addCriterion("ctrl_data between", value1, value2, "ctrlData");
            return (Criteria) this;
        }

        public Criteria andCtrlDataNotBetween(String value1, String value2) {
            addCriterion("ctrl_data not between", value1, value2, "ctrlData");
            return (Criteria) this;
        }

        public Criteria andCtrlPermiIsNull() {
            addCriterion("ctrl_permi is null");
            return (Criteria) this;
        }

        public Criteria andCtrlPermiIsNotNull() {
            addCriterion("ctrl_permi is not null");
            return (Criteria) this;
        }

        public Criteria andCtrlPermiEqualTo(String value) {
            addCriterion("ctrl_permi =", value, "ctrlPermi");
            return (Criteria) this;
        }

        public Criteria andCtrlPermiNotEqualTo(String value) {
            addCriterion("ctrl_permi <>", value, "ctrlPermi");
            return (Criteria) this;
        }

        public Criteria andCtrlPermiGreaterThan(String value) {
            addCriterion("ctrl_permi >", value, "ctrlPermi");
            return (Criteria) this;
        }

        public Criteria andCtrlPermiGreaterThanOrEqualTo(String value) {
            addCriterion("ctrl_permi >=", value, "ctrlPermi");
            return (Criteria) this;
        }

        public Criteria andCtrlPermiLessThan(String value) {
            addCriterion("ctrl_permi <", value, "ctrlPermi");
            return (Criteria) this;
        }

        public Criteria andCtrlPermiLessThanOrEqualTo(String value) {
            addCriterion("ctrl_permi <=", value, "ctrlPermi");
            return (Criteria) this;
        }

        public Criteria andCtrlPermiLike(String value) {
            addCriterion("ctrl_permi like", value, "ctrlPermi");
            return (Criteria) this;
        }

        public Criteria andCtrlPermiNotLike(String value) {
            addCriterion("ctrl_permi not like", value, "ctrlPermi");
            return (Criteria) this;
        }

        public Criteria andCtrlPermiIn(List<String> values) {
            addCriterion("ctrl_permi in", values, "ctrlPermi");
            return (Criteria) this;
        }

        public Criteria andCtrlPermiNotIn(List<String> values) {
            addCriterion("ctrl_permi not in", values, "ctrlPermi");
            return (Criteria) this;
        }

        public Criteria andCtrlPermiBetween(String value1, String value2) {
            addCriterion("ctrl_permi between", value1, value2, "ctrlPermi");
            return (Criteria) this;
        }

        public Criteria andCtrlPermiNotBetween(String value1, String value2) {
            addCriterion("ctrl_permi not between", value1, value2, "ctrlPermi");
            return (Criteria) this;
        }

        public Criteria andRoleCodeLikeInsensitive(String value) {
            addCriterion("upper(role_code) like", value.toUpperCase(), "roleCode");
            return (Criteria) this;
        }

        public Criteria andCtrlTypeLikeInsensitive(String value) {
            addCriterion("upper(ctrl_type) like", value.toUpperCase(), "ctrlType");
            return (Criteria) this;
        }

        public Criteria andCtrlDataLikeInsensitive(String value) {
            addCriterion("upper(ctrl_data) like", value.toUpperCase(), "ctrlData");
            return (Criteria) this;
        }

        public Criteria andCtrlPermiLikeInsensitive(String value) {
            addCriterion("upper(ctrl_permi) like", value.toUpperCase(), "ctrlPermi");
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