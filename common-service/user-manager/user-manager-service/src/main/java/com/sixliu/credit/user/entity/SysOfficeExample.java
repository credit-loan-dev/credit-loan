package com.sixliu.credit.user.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysOfficeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysOfficeExample() {
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

        public Criteria andOfficeCodeIsNull() {
            addCriterion("office_code is null");
            return (Criteria) this;
        }

        public Criteria andOfficeCodeIsNotNull() {
            addCriterion("office_code is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeCodeEqualTo(String value) {
            addCriterion("office_code =", value, "officeCode");
            return (Criteria) this;
        }

        public Criteria andOfficeCodeNotEqualTo(String value) {
            addCriterion("office_code <>", value, "officeCode");
            return (Criteria) this;
        }

        public Criteria andOfficeCodeGreaterThan(String value) {
            addCriterion("office_code >", value, "officeCode");
            return (Criteria) this;
        }

        public Criteria andOfficeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("office_code >=", value, "officeCode");
            return (Criteria) this;
        }

        public Criteria andOfficeCodeLessThan(String value) {
            addCriterion("office_code <", value, "officeCode");
            return (Criteria) this;
        }

        public Criteria andOfficeCodeLessThanOrEqualTo(String value) {
            addCriterion("office_code <=", value, "officeCode");
            return (Criteria) this;
        }

        public Criteria andOfficeCodeLike(String value) {
            addCriterion("office_code like", value, "officeCode");
            return (Criteria) this;
        }

        public Criteria andOfficeCodeNotLike(String value) {
            addCriterion("office_code not like", value, "officeCode");
            return (Criteria) this;
        }

        public Criteria andOfficeCodeIn(List<String> values) {
            addCriterion("office_code in", values, "officeCode");
            return (Criteria) this;
        }

        public Criteria andOfficeCodeNotIn(List<String> values) {
            addCriterion("office_code not in", values, "officeCode");
            return (Criteria) this;
        }

        public Criteria andOfficeCodeBetween(String value1, String value2) {
            addCriterion("office_code between", value1, value2, "officeCode");
            return (Criteria) this;
        }

        public Criteria andOfficeCodeNotBetween(String value1, String value2) {
            addCriterion("office_code not between", value1, value2, "officeCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeIsNull() {
            addCriterion("parent_code is null");
            return (Criteria) this;
        }

        public Criteria andParentCodeIsNotNull() {
            addCriterion("parent_code is not null");
            return (Criteria) this;
        }

        public Criteria andParentCodeEqualTo(String value) {
            addCriterion("parent_code =", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotEqualTo(String value) {
            addCriterion("parent_code <>", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeGreaterThan(String value) {
            addCriterion("parent_code >", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("parent_code >=", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLessThan(String value) {
            addCriterion("parent_code <", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLessThanOrEqualTo(String value) {
            addCriterion("parent_code <=", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLike(String value) {
            addCriterion("parent_code like", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotLike(String value) {
            addCriterion("parent_code not like", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeIn(List<String> values) {
            addCriterion("parent_code in", values, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotIn(List<String> values) {
            addCriterion("parent_code not in", values, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeBetween(String value1, String value2) {
            addCriterion("parent_code between", value1, value2, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotBetween(String value1, String value2) {
            addCriterion("parent_code not between", value1, value2, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodesIsNull() {
            addCriterion("parent_codes is null");
            return (Criteria) this;
        }

        public Criteria andParentCodesIsNotNull() {
            addCriterion("parent_codes is not null");
            return (Criteria) this;
        }

        public Criteria andParentCodesEqualTo(String value) {
            addCriterion("parent_codes =", value, "parentCodes");
            return (Criteria) this;
        }

        public Criteria andParentCodesNotEqualTo(String value) {
            addCriterion("parent_codes <>", value, "parentCodes");
            return (Criteria) this;
        }

        public Criteria andParentCodesGreaterThan(String value) {
            addCriterion("parent_codes >", value, "parentCodes");
            return (Criteria) this;
        }

        public Criteria andParentCodesGreaterThanOrEqualTo(String value) {
            addCriterion("parent_codes >=", value, "parentCodes");
            return (Criteria) this;
        }

        public Criteria andParentCodesLessThan(String value) {
            addCriterion("parent_codes <", value, "parentCodes");
            return (Criteria) this;
        }

        public Criteria andParentCodesLessThanOrEqualTo(String value) {
            addCriterion("parent_codes <=", value, "parentCodes");
            return (Criteria) this;
        }

        public Criteria andParentCodesLike(String value) {
            addCriterion("parent_codes like", value, "parentCodes");
            return (Criteria) this;
        }

        public Criteria andParentCodesNotLike(String value) {
            addCriterion("parent_codes not like", value, "parentCodes");
            return (Criteria) this;
        }

        public Criteria andParentCodesIn(List<String> values) {
            addCriterion("parent_codes in", values, "parentCodes");
            return (Criteria) this;
        }

        public Criteria andParentCodesNotIn(List<String> values) {
            addCriterion("parent_codes not in", values, "parentCodes");
            return (Criteria) this;
        }

        public Criteria andParentCodesBetween(String value1, String value2) {
            addCriterion("parent_codes between", value1, value2, "parentCodes");
            return (Criteria) this;
        }

        public Criteria andParentCodesNotBetween(String value1, String value2) {
            addCriterion("parent_codes not between", value1, value2, "parentCodes");
            return (Criteria) this;
        }

        public Criteria andTreeSortIsNull() {
            addCriterion("tree_sort is null");
            return (Criteria) this;
        }

        public Criteria andTreeSortIsNotNull() {
            addCriterion("tree_sort is not null");
            return (Criteria) this;
        }

        public Criteria andTreeSortEqualTo(Long value) {
            addCriterion("tree_sort =", value, "treeSort");
            return (Criteria) this;
        }

        public Criteria andTreeSortNotEqualTo(Long value) {
            addCriterion("tree_sort <>", value, "treeSort");
            return (Criteria) this;
        }

        public Criteria andTreeSortGreaterThan(Long value) {
            addCriterion("tree_sort >", value, "treeSort");
            return (Criteria) this;
        }

        public Criteria andTreeSortGreaterThanOrEqualTo(Long value) {
            addCriterion("tree_sort >=", value, "treeSort");
            return (Criteria) this;
        }

        public Criteria andTreeSortLessThan(Long value) {
            addCriterion("tree_sort <", value, "treeSort");
            return (Criteria) this;
        }

        public Criteria andTreeSortLessThanOrEqualTo(Long value) {
            addCriterion("tree_sort <=", value, "treeSort");
            return (Criteria) this;
        }

        public Criteria andTreeSortIn(List<Long> values) {
            addCriterion("tree_sort in", values, "treeSort");
            return (Criteria) this;
        }

        public Criteria andTreeSortNotIn(List<Long> values) {
            addCriterion("tree_sort not in", values, "treeSort");
            return (Criteria) this;
        }

        public Criteria andTreeSortBetween(Long value1, Long value2) {
            addCriterion("tree_sort between", value1, value2, "treeSort");
            return (Criteria) this;
        }

        public Criteria andTreeSortNotBetween(Long value1, Long value2) {
            addCriterion("tree_sort not between", value1, value2, "treeSort");
            return (Criteria) this;
        }

        public Criteria andTreeSortsIsNull() {
            addCriterion("tree_sorts is null");
            return (Criteria) this;
        }

        public Criteria andTreeSortsIsNotNull() {
            addCriterion("tree_sorts is not null");
            return (Criteria) this;
        }

        public Criteria andTreeSortsEqualTo(String value) {
            addCriterion("tree_sorts =", value, "treeSorts");
            return (Criteria) this;
        }

        public Criteria andTreeSortsNotEqualTo(String value) {
            addCriterion("tree_sorts <>", value, "treeSorts");
            return (Criteria) this;
        }

        public Criteria andTreeSortsGreaterThan(String value) {
            addCriterion("tree_sorts >", value, "treeSorts");
            return (Criteria) this;
        }

        public Criteria andTreeSortsGreaterThanOrEqualTo(String value) {
            addCriterion("tree_sorts >=", value, "treeSorts");
            return (Criteria) this;
        }

        public Criteria andTreeSortsLessThan(String value) {
            addCriterion("tree_sorts <", value, "treeSorts");
            return (Criteria) this;
        }

        public Criteria andTreeSortsLessThanOrEqualTo(String value) {
            addCriterion("tree_sorts <=", value, "treeSorts");
            return (Criteria) this;
        }

        public Criteria andTreeSortsLike(String value) {
            addCriterion("tree_sorts like", value, "treeSorts");
            return (Criteria) this;
        }

        public Criteria andTreeSortsNotLike(String value) {
            addCriterion("tree_sorts not like", value, "treeSorts");
            return (Criteria) this;
        }

        public Criteria andTreeSortsIn(List<String> values) {
            addCriterion("tree_sorts in", values, "treeSorts");
            return (Criteria) this;
        }

        public Criteria andTreeSortsNotIn(List<String> values) {
            addCriterion("tree_sorts not in", values, "treeSorts");
            return (Criteria) this;
        }

        public Criteria andTreeSortsBetween(String value1, String value2) {
            addCriterion("tree_sorts between", value1, value2, "treeSorts");
            return (Criteria) this;
        }

        public Criteria andTreeSortsNotBetween(String value1, String value2) {
            addCriterion("tree_sorts not between", value1, value2, "treeSorts");
            return (Criteria) this;
        }

        public Criteria andTreeLeafIsNull() {
            addCriterion("tree_leaf is null");
            return (Criteria) this;
        }

        public Criteria andTreeLeafIsNotNull() {
            addCriterion("tree_leaf is not null");
            return (Criteria) this;
        }

        public Criteria andTreeLeafEqualTo(String value) {
            addCriterion("tree_leaf =", value, "treeLeaf");
            return (Criteria) this;
        }

        public Criteria andTreeLeafNotEqualTo(String value) {
            addCriterion("tree_leaf <>", value, "treeLeaf");
            return (Criteria) this;
        }

        public Criteria andTreeLeafGreaterThan(String value) {
            addCriterion("tree_leaf >", value, "treeLeaf");
            return (Criteria) this;
        }

        public Criteria andTreeLeafGreaterThanOrEqualTo(String value) {
            addCriterion("tree_leaf >=", value, "treeLeaf");
            return (Criteria) this;
        }

        public Criteria andTreeLeafLessThan(String value) {
            addCriterion("tree_leaf <", value, "treeLeaf");
            return (Criteria) this;
        }

        public Criteria andTreeLeafLessThanOrEqualTo(String value) {
            addCriterion("tree_leaf <=", value, "treeLeaf");
            return (Criteria) this;
        }

        public Criteria andTreeLeafLike(String value) {
            addCriterion("tree_leaf like", value, "treeLeaf");
            return (Criteria) this;
        }

        public Criteria andTreeLeafNotLike(String value) {
            addCriterion("tree_leaf not like", value, "treeLeaf");
            return (Criteria) this;
        }

        public Criteria andTreeLeafIn(List<String> values) {
            addCriterion("tree_leaf in", values, "treeLeaf");
            return (Criteria) this;
        }

        public Criteria andTreeLeafNotIn(List<String> values) {
            addCriterion("tree_leaf not in", values, "treeLeaf");
            return (Criteria) this;
        }

        public Criteria andTreeLeafBetween(String value1, String value2) {
            addCriterion("tree_leaf between", value1, value2, "treeLeaf");
            return (Criteria) this;
        }

        public Criteria andTreeLeafNotBetween(String value1, String value2) {
            addCriterion("tree_leaf not between", value1, value2, "treeLeaf");
            return (Criteria) this;
        }

        public Criteria andTreeLevelIsNull() {
            addCriterion("tree_level is null");
            return (Criteria) this;
        }

        public Criteria andTreeLevelIsNotNull() {
            addCriterion("tree_level is not null");
            return (Criteria) this;
        }

        public Criteria andTreeLevelEqualTo(Short value) {
            addCriterion("tree_level =", value, "treeLevel");
            return (Criteria) this;
        }

        public Criteria andTreeLevelNotEqualTo(Short value) {
            addCriterion("tree_level <>", value, "treeLevel");
            return (Criteria) this;
        }

        public Criteria andTreeLevelGreaterThan(Short value) {
            addCriterion("tree_level >", value, "treeLevel");
            return (Criteria) this;
        }

        public Criteria andTreeLevelGreaterThanOrEqualTo(Short value) {
            addCriterion("tree_level >=", value, "treeLevel");
            return (Criteria) this;
        }

        public Criteria andTreeLevelLessThan(Short value) {
            addCriterion("tree_level <", value, "treeLevel");
            return (Criteria) this;
        }

        public Criteria andTreeLevelLessThanOrEqualTo(Short value) {
            addCriterion("tree_level <=", value, "treeLevel");
            return (Criteria) this;
        }

        public Criteria andTreeLevelIn(List<Short> values) {
            addCriterion("tree_level in", values, "treeLevel");
            return (Criteria) this;
        }

        public Criteria andTreeLevelNotIn(List<Short> values) {
            addCriterion("tree_level not in", values, "treeLevel");
            return (Criteria) this;
        }

        public Criteria andTreeLevelBetween(Short value1, Short value2) {
            addCriterion("tree_level between", value1, value2, "treeLevel");
            return (Criteria) this;
        }

        public Criteria andTreeLevelNotBetween(Short value1, Short value2) {
            addCriterion("tree_level not between", value1, value2, "treeLevel");
            return (Criteria) this;
        }

        public Criteria andTreeNamesIsNull() {
            addCriterion("tree_names is null");
            return (Criteria) this;
        }

        public Criteria andTreeNamesIsNotNull() {
            addCriterion("tree_names is not null");
            return (Criteria) this;
        }

        public Criteria andTreeNamesEqualTo(String value) {
            addCriterion("tree_names =", value, "treeNames");
            return (Criteria) this;
        }

        public Criteria andTreeNamesNotEqualTo(String value) {
            addCriterion("tree_names <>", value, "treeNames");
            return (Criteria) this;
        }

        public Criteria andTreeNamesGreaterThan(String value) {
            addCriterion("tree_names >", value, "treeNames");
            return (Criteria) this;
        }

        public Criteria andTreeNamesGreaterThanOrEqualTo(String value) {
            addCriterion("tree_names >=", value, "treeNames");
            return (Criteria) this;
        }

        public Criteria andTreeNamesLessThan(String value) {
            addCriterion("tree_names <", value, "treeNames");
            return (Criteria) this;
        }

        public Criteria andTreeNamesLessThanOrEqualTo(String value) {
            addCriterion("tree_names <=", value, "treeNames");
            return (Criteria) this;
        }

        public Criteria andTreeNamesLike(String value) {
            addCriterion("tree_names like", value, "treeNames");
            return (Criteria) this;
        }

        public Criteria andTreeNamesNotLike(String value) {
            addCriterion("tree_names not like", value, "treeNames");
            return (Criteria) this;
        }

        public Criteria andTreeNamesIn(List<String> values) {
            addCriterion("tree_names in", values, "treeNames");
            return (Criteria) this;
        }

        public Criteria andTreeNamesNotIn(List<String> values) {
            addCriterion("tree_names not in", values, "treeNames");
            return (Criteria) this;
        }

        public Criteria andTreeNamesBetween(String value1, String value2) {
            addCriterion("tree_names between", value1, value2, "treeNames");
            return (Criteria) this;
        }

        public Criteria andTreeNamesNotBetween(String value1, String value2) {
            addCriterion("tree_names not between", value1, value2, "treeNames");
            return (Criteria) this;
        }

        public Criteria andViewCodeIsNull() {
            addCriterion("view_code is null");
            return (Criteria) this;
        }

        public Criteria andViewCodeIsNotNull() {
            addCriterion("view_code is not null");
            return (Criteria) this;
        }

        public Criteria andViewCodeEqualTo(String value) {
            addCriterion("view_code =", value, "viewCode");
            return (Criteria) this;
        }

        public Criteria andViewCodeNotEqualTo(String value) {
            addCriterion("view_code <>", value, "viewCode");
            return (Criteria) this;
        }

        public Criteria andViewCodeGreaterThan(String value) {
            addCriterion("view_code >", value, "viewCode");
            return (Criteria) this;
        }

        public Criteria andViewCodeGreaterThanOrEqualTo(String value) {
            addCriterion("view_code >=", value, "viewCode");
            return (Criteria) this;
        }

        public Criteria andViewCodeLessThan(String value) {
            addCriterion("view_code <", value, "viewCode");
            return (Criteria) this;
        }

        public Criteria andViewCodeLessThanOrEqualTo(String value) {
            addCriterion("view_code <=", value, "viewCode");
            return (Criteria) this;
        }

        public Criteria andViewCodeLike(String value) {
            addCriterion("view_code like", value, "viewCode");
            return (Criteria) this;
        }

        public Criteria andViewCodeNotLike(String value) {
            addCriterion("view_code not like", value, "viewCode");
            return (Criteria) this;
        }

        public Criteria andViewCodeIn(List<String> values) {
            addCriterion("view_code in", values, "viewCode");
            return (Criteria) this;
        }

        public Criteria andViewCodeNotIn(List<String> values) {
            addCriterion("view_code not in", values, "viewCode");
            return (Criteria) this;
        }

        public Criteria andViewCodeBetween(String value1, String value2) {
            addCriterion("view_code between", value1, value2, "viewCode");
            return (Criteria) this;
        }

        public Criteria andViewCodeNotBetween(String value1, String value2) {
            addCriterion("view_code not between", value1, value2, "viewCode");
            return (Criteria) this;
        }

        public Criteria andOfficeNameIsNull() {
            addCriterion("office_name is null");
            return (Criteria) this;
        }

        public Criteria andOfficeNameIsNotNull() {
            addCriterion("office_name is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeNameEqualTo(String value) {
            addCriterion("office_name =", value, "officeName");
            return (Criteria) this;
        }

        public Criteria andOfficeNameNotEqualTo(String value) {
            addCriterion("office_name <>", value, "officeName");
            return (Criteria) this;
        }

        public Criteria andOfficeNameGreaterThan(String value) {
            addCriterion("office_name >", value, "officeName");
            return (Criteria) this;
        }

        public Criteria andOfficeNameGreaterThanOrEqualTo(String value) {
            addCriterion("office_name >=", value, "officeName");
            return (Criteria) this;
        }

        public Criteria andOfficeNameLessThan(String value) {
            addCriterion("office_name <", value, "officeName");
            return (Criteria) this;
        }

        public Criteria andOfficeNameLessThanOrEqualTo(String value) {
            addCriterion("office_name <=", value, "officeName");
            return (Criteria) this;
        }

        public Criteria andOfficeNameLike(String value) {
            addCriterion("office_name like", value, "officeName");
            return (Criteria) this;
        }

        public Criteria andOfficeNameNotLike(String value) {
            addCriterion("office_name not like", value, "officeName");
            return (Criteria) this;
        }

        public Criteria andOfficeNameIn(List<String> values) {
            addCriterion("office_name in", values, "officeName");
            return (Criteria) this;
        }

        public Criteria andOfficeNameNotIn(List<String> values) {
            addCriterion("office_name not in", values, "officeName");
            return (Criteria) this;
        }

        public Criteria andOfficeNameBetween(String value1, String value2) {
            addCriterion("office_name between", value1, value2, "officeName");
            return (Criteria) this;
        }

        public Criteria andOfficeNameNotBetween(String value1, String value2) {
            addCriterion("office_name not between", value1, value2, "officeName");
            return (Criteria) this;
        }

        public Criteria andFullNameIsNull() {
            addCriterion("full_name is null");
            return (Criteria) this;
        }

        public Criteria andFullNameIsNotNull() {
            addCriterion("full_name is not null");
            return (Criteria) this;
        }

        public Criteria andFullNameEqualTo(String value) {
            addCriterion("full_name =", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotEqualTo(String value) {
            addCriterion("full_name <>", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameGreaterThan(String value) {
            addCriterion("full_name >", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("full_name >=", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLessThan(String value) {
            addCriterion("full_name <", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLessThanOrEqualTo(String value) {
            addCriterion("full_name <=", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLike(String value) {
            addCriterion("full_name like", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotLike(String value) {
            addCriterion("full_name not like", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameIn(List<String> values) {
            addCriterion("full_name in", values, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotIn(List<String> values) {
            addCriterion("full_name not in", values, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameBetween(String value1, String value2) {
            addCriterion("full_name between", value1, value2, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotBetween(String value1, String value2) {
            addCriterion("full_name not between", value1, value2, "fullName");
            return (Criteria) this;
        }

        public Criteria andOfficeTypeIsNull() {
            addCriterion("office_type is null");
            return (Criteria) this;
        }

        public Criteria andOfficeTypeIsNotNull() {
            addCriterion("office_type is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeTypeEqualTo(String value) {
            addCriterion("office_type =", value, "officeType");
            return (Criteria) this;
        }

        public Criteria andOfficeTypeNotEqualTo(String value) {
            addCriterion("office_type <>", value, "officeType");
            return (Criteria) this;
        }

        public Criteria andOfficeTypeGreaterThan(String value) {
            addCriterion("office_type >", value, "officeType");
            return (Criteria) this;
        }

        public Criteria andOfficeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("office_type >=", value, "officeType");
            return (Criteria) this;
        }

        public Criteria andOfficeTypeLessThan(String value) {
            addCriterion("office_type <", value, "officeType");
            return (Criteria) this;
        }

        public Criteria andOfficeTypeLessThanOrEqualTo(String value) {
            addCriterion("office_type <=", value, "officeType");
            return (Criteria) this;
        }

        public Criteria andOfficeTypeLike(String value) {
            addCriterion("office_type like", value, "officeType");
            return (Criteria) this;
        }

        public Criteria andOfficeTypeNotLike(String value) {
            addCriterion("office_type not like", value, "officeType");
            return (Criteria) this;
        }

        public Criteria andOfficeTypeIn(List<String> values) {
            addCriterion("office_type in", values, "officeType");
            return (Criteria) this;
        }

        public Criteria andOfficeTypeNotIn(List<String> values) {
            addCriterion("office_type not in", values, "officeType");
            return (Criteria) this;
        }

        public Criteria andOfficeTypeBetween(String value1, String value2) {
            addCriterion("office_type between", value1, value2, "officeType");
            return (Criteria) this;
        }

        public Criteria andOfficeTypeNotBetween(String value1, String value2) {
            addCriterion("office_type not between", value1, value2, "officeType");
            return (Criteria) this;
        }

        public Criteria andLeaderIsNull() {
            addCriterion("leader is null");
            return (Criteria) this;
        }

        public Criteria andLeaderIsNotNull() {
            addCriterion("leader is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderEqualTo(String value) {
            addCriterion("leader =", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotEqualTo(String value) {
            addCriterion("leader <>", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderGreaterThan(String value) {
            addCriterion("leader >", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("leader >=", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLessThan(String value) {
            addCriterion("leader <", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLessThanOrEqualTo(String value) {
            addCriterion("leader <=", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLike(String value) {
            addCriterion("leader like", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotLike(String value) {
            addCriterion("leader not like", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderIn(List<String> values) {
            addCriterion("leader in", values, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotIn(List<String> values) {
            addCriterion("leader not in", values, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderBetween(String value1, String value2) {
            addCriterion("leader between", value1, value2, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotBetween(String value1, String value2) {
            addCriterion("leader not between", value1, value2, "leader");
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

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNull() {
            addCriterion("zip_code is null");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNotNull() {
            addCriterion("zip_code is not null");
            return (Criteria) this;
        }

        public Criteria andZipCodeEqualTo(String value) {
            addCriterion("zip_code =", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotEqualTo(String value) {
            addCriterion("zip_code <>", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThan(String value) {
            addCriterion("zip_code >", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("zip_code >=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThan(String value) {
            addCriterion("zip_code <", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThanOrEqualTo(String value) {
            addCriterion("zip_code <=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLike(String value) {
            addCriterion("zip_code like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotLike(String value) {
            addCriterion("zip_code not like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeIn(List<String> values) {
            addCriterion("zip_code in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotIn(List<String> values) {
            addCriterion("zip_code not in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeBetween(String value1, String value2) {
            addCriterion("zip_code between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotBetween(String value1, String value2) {
            addCriterion("zip_code not between", value1, value2, "zipCode");
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

        public Criteria andOfficeCodeLikeInsensitive(String value) {
            addCriterion("upper(office_code) like", value.toUpperCase(), "officeCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLikeInsensitive(String value) {
            addCriterion("upper(parent_code) like", value.toUpperCase(), "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodesLikeInsensitive(String value) {
            addCriterion("upper(parent_codes) like", value.toUpperCase(), "parentCodes");
            return (Criteria) this;
        }

        public Criteria andTreeSortsLikeInsensitive(String value) {
            addCriterion("upper(tree_sorts) like", value.toUpperCase(), "treeSorts");
            return (Criteria) this;
        }

        public Criteria andTreeLeafLikeInsensitive(String value) {
            addCriterion("upper(tree_leaf) like", value.toUpperCase(), "treeLeaf");
            return (Criteria) this;
        }

        public Criteria andTreeNamesLikeInsensitive(String value) {
            addCriterion("upper(tree_names) like", value.toUpperCase(), "treeNames");
            return (Criteria) this;
        }

        public Criteria andViewCodeLikeInsensitive(String value) {
            addCriterion("upper(view_code) like", value.toUpperCase(), "viewCode");
            return (Criteria) this;
        }

        public Criteria andOfficeNameLikeInsensitive(String value) {
            addCriterion("upper(office_name) like", value.toUpperCase(), "officeName");
            return (Criteria) this;
        }

        public Criteria andFullNameLikeInsensitive(String value) {
            addCriterion("upper(full_name) like", value.toUpperCase(), "fullName");
            return (Criteria) this;
        }

        public Criteria andOfficeTypeLikeInsensitive(String value) {
            addCriterion("upper(office_type) like", value.toUpperCase(), "officeType");
            return (Criteria) this;
        }

        public Criteria andLeaderLikeInsensitive(String value) {
            addCriterion("upper(leader) like", value.toUpperCase(), "leader");
            return (Criteria) this;
        }

        public Criteria andPhoneLikeInsensitive(String value) {
            addCriterion("upper(phone) like", value.toUpperCase(), "phone");
            return (Criteria) this;
        }

        public Criteria andAddressLikeInsensitive(String value) {
            addCriterion("upper(address) like", value.toUpperCase(), "address");
            return (Criteria) this;
        }

        public Criteria andZipCodeLikeInsensitive(String value) {
            addCriterion("upper(zip_code) like", value.toUpperCase(), "zipCode");
            return (Criteria) this;
        }

        public Criteria andEmailLikeInsensitive(String value) {
            addCriterion("upper(email) like", value.toUpperCase(), "email");
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