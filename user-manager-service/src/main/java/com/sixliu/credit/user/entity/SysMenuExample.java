package com.sixliu.credit.user.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysMenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysMenuExample() {
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

        public Criteria andMenuCodeIsNull() {
            addCriterion("menu_code is null");
            return (Criteria) this;
        }

        public Criteria andMenuCodeIsNotNull() {
            addCriterion("menu_code is not null");
            return (Criteria) this;
        }

        public Criteria andMenuCodeEqualTo(String value) {
            addCriterion("menu_code =", value, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeNotEqualTo(String value) {
            addCriterion("menu_code <>", value, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeGreaterThan(String value) {
            addCriterion("menu_code >", value, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeGreaterThanOrEqualTo(String value) {
            addCriterion("menu_code >=", value, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeLessThan(String value) {
            addCriterion("menu_code <", value, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeLessThanOrEqualTo(String value) {
            addCriterion("menu_code <=", value, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeLike(String value) {
            addCriterion("menu_code like", value, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeNotLike(String value) {
            addCriterion("menu_code not like", value, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeIn(List<String> values) {
            addCriterion("menu_code in", values, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeNotIn(List<String> values) {
            addCriterion("menu_code not in", values, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeBetween(String value1, String value2) {
            addCriterion("menu_code between", value1, value2, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeNotBetween(String value1, String value2) {
            addCriterion("menu_code not between", value1, value2, "menuCode");
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

        public Criteria andMenuNameIsNull() {
            addCriterion("menu_name is null");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNotNull() {
            addCriterion("menu_name is not null");
            return (Criteria) this;
        }

        public Criteria andMenuNameEqualTo(String value) {
            addCriterion("menu_name =", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotEqualTo(String value) {
            addCriterion("menu_name <>", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThan(String value) {
            addCriterion("menu_name >", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThanOrEqualTo(String value) {
            addCriterion("menu_name >=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThan(String value) {
            addCriterion("menu_name <", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThanOrEqualTo(String value) {
            addCriterion("menu_name <=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLike(String value) {
            addCriterion("menu_name like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotLike(String value) {
            addCriterion("menu_name not like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameIn(List<String> values) {
            addCriterion("menu_name in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotIn(List<String> values) {
            addCriterion("menu_name not in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameBetween(String value1, String value2) {
            addCriterion("menu_name between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotBetween(String value1, String value2) {
            addCriterion("menu_name not between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIsNull() {
            addCriterion("menu_type is null");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIsNotNull() {
            addCriterion("menu_type is not null");
            return (Criteria) this;
        }

        public Criteria andMenuTypeEqualTo(String value) {
            addCriterion("menu_type =", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotEqualTo(String value) {
            addCriterion("menu_type <>", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeGreaterThan(String value) {
            addCriterion("menu_type >", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeGreaterThanOrEqualTo(String value) {
            addCriterion("menu_type >=", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLessThan(String value) {
            addCriterion("menu_type <", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLessThanOrEqualTo(String value) {
            addCriterion("menu_type <=", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLike(String value) {
            addCriterion("menu_type like", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotLike(String value) {
            addCriterion("menu_type not like", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIn(List<String> values) {
            addCriterion("menu_type in", values, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotIn(List<String> values) {
            addCriterion("menu_type not in", values, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeBetween(String value1, String value2) {
            addCriterion("menu_type between", value1, value2, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotBetween(String value1, String value2) {
            addCriterion("menu_type not between", value1, value2, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuHrefIsNull() {
            addCriterion("menu_href is null");
            return (Criteria) this;
        }

        public Criteria andMenuHrefIsNotNull() {
            addCriterion("menu_href is not null");
            return (Criteria) this;
        }

        public Criteria andMenuHrefEqualTo(String value) {
            addCriterion("menu_href =", value, "menuHref");
            return (Criteria) this;
        }

        public Criteria andMenuHrefNotEqualTo(String value) {
            addCriterion("menu_href <>", value, "menuHref");
            return (Criteria) this;
        }

        public Criteria andMenuHrefGreaterThan(String value) {
            addCriterion("menu_href >", value, "menuHref");
            return (Criteria) this;
        }

        public Criteria andMenuHrefGreaterThanOrEqualTo(String value) {
            addCriterion("menu_href >=", value, "menuHref");
            return (Criteria) this;
        }

        public Criteria andMenuHrefLessThan(String value) {
            addCriterion("menu_href <", value, "menuHref");
            return (Criteria) this;
        }

        public Criteria andMenuHrefLessThanOrEqualTo(String value) {
            addCriterion("menu_href <=", value, "menuHref");
            return (Criteria) this;
        }

        public Criteria andMenuHrefLike(String value) {
            addCriterion("menu_href like", value, "menuHref");
            return (Criteria) this;
        }

        public Criteria andMenuHrefNotLike(String value) {
            addCriterion("menu_href not like", value, "menuHref");
            return (Criteria) this;
        }

        public Criteria andMenuHrefIn(List<String> values) {
            addCriterion("menu_href in", values, "menuHref");
            return (Criteria) this;
        }

        public Criteria andMenuHrefNotIn(List<String> values) {
            addCriterion("menu_href not in", values, "menuHref");
            return (Criteria) this;
        }

        public Criteria andMenuHrefBetween(String value1, String value2) {
            addCriterion("menu_href between", value1, value2, "menuHref");
            return (Criteria) this;
        }

        public Criteria andMenuHrefNotBetween(String value1, String value2) {
            addCriterion("menu_href not between", value1, value2, "menuHref");
            return (Criteria) this;
        }

        public Criteria andMenuTargetIsNull() {
            addCriterion("menu_target is null");
            return (Criteria) this;
        }

        public Criteria andMenuTargetIsNotNull() {
            addCriterion("menu_target is not null");
            return (Criteria) this;
        }

        public Criteria andMenuTargetEqualTo(String value) {
            addCriterion("menu_target =", value, "menuTarget");
            return (Criteria) this;
        }

        public Criteria andMenuTargetNotEqualTo(String value) {
            addCriterion("menu_target <>", value, "menuTarget");
            return (Criteria) this;
        }

        public Criteria andMenuTargetGreaterThan(String value) {
            addCriterion("menu_target >", value, "menuTarget");
            return (Criteria) this;
        }

        public Criteria andMenuTargetGreaterThanOrEqualTo(String value) {
            addCriterion("menu_target >=", value, "menuTarget");
            return (Criteria) this;
        }

        public Criteria andMenuTargetLessThan(String value) {
            addCriterion("menu_target <", value, "menuTarget");
            return (Criteria) this;
        }

        public Criteria andMenuTargetLessThanOrEqualTo(String value) {
            addCriterion("menu_target <=", value, "menuTarget");
            return (Criteria) this;
        }

        public Criteria andMenuTargetLike(String value) {
            addCriterion("menu_target like", value, "menuTarget");
            return (Criteria) this;
        }

        public Criteria andMenuTargetNotLike(String value) {
            addCriterion("menu_target not like", value, "menuTarget");
            return (Criteria) this;
        }

        public Criteria andMenuTargetIn(List<String> values) {
            addCriterion("menu_target in", values, "menuTarget");
            return (Criteria) this;
        }

        public Criteria andMenuTargetNotIn(List<String> values) {
            addCriterion("menu_target not in", values, "menuTarget");
            return (Criteria) this;
        }

        public Criteria andMenuTargetBetween(String value1, String value2) {
            addCriterion("menu_target between", value1, value2, "menuTarget");
            return (Criteria) this;
        }

        public Criteria andMenuTargetNotBetween(String value1, String value2) {
            addCriterion("menu_target not between", value1, value2, "menuTarget");
            return (Criteria) this;
        }

        public Criteria andMenuIconIsNull() {
            addCriterion("menu_icon is null");
            return (Criteria) this;
        }

        public Criteria andMenuIconIsNotNull() {
            addCriterion("menu_icon is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIconEqualTo(String value) {
            addCriterion("menu_icon =", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconNotEqualTo(String value) {
            addCriterion("menu_icon <>", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconGreaterThan(String value) {
            addCriterion("menu_icon >", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconGreaterThanOrEqualTo(String value) {
            addCriterion("menu_icon >=", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconLessThan(String value) {
            addCriterion("menu_icon <", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconLessThanOrEqualTo(String value) {
            addCriterion("menu_icon <=", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconLike(String value) {
            addCriterion("menu_icon like", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconNotLike(String value) {
            addCriterion("menu_icon not like", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconIn(List<String> values) {
            addCriterion("menu_icon in", values, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconNotIn(List<String> values) {
            addCriterion("menu_icon not in", values, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconBetween(String value1, String value2) {
            addCriterion("menu_icon between", value1, value2, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconNotBetween(String value1, String value2) {
            addCriterion("menu_icon not between", value1, value2, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuColorIsNull() {
            addCriterion("menu_color is null");
            return (Criteria) this;
        }

        public Criteria andMenuColorIsNotNull() {
            addCriterion("menu_color is not null");
            return (Criteria) this;
        }

        public Criteria andMenuColorEqualTo(String value) {
            addCriterion("menu_color =", value, "menuColor");
            return (Criteria) this;
        }

        public Criteria andMenuColorNotEqualTo(String value) {
            addCriterion("menu_color <>", value, "menuColor");
            return (Criteria) this;
        }

        public Criteria andMenuColorGreaterThan(String value) {
            addCriterion("menu_color >", value, "menuColor");
            return (Criteria) this;
        }

        public Criteria andMenuColorGreaterThanOrEqualTo(String value) {
            addCriterion("menu_color >=", value, "menuColor");
            return (Criteria) this;
        }

        public Criteria andMenuColorLessThan(String value) {
            addCriterion("menu_color <", value, "menuColor");
            return (Criteria) this;
        }

        public Criteria andMenuColorLessThanOrEqualTo(String value) {
            addCriterion("menu_color <=", value, "menuColor");
            return (Criteria) this;
        }

        public Criteria andMenuColorLike(String value) {
            addCriterion("menu_color like", value, "menuColor");
            return (Criteria) this;
        }

        public Criteria andMenuColorNotLike(String value) {
            addCriterion("menu_color not like", value, "menuColor");
            return (Criteria) this;
        }

        public Criteria andMenuColorIn(List<String> values) {
            addCriterion("menu_color in", values, "menuColor");
            return (Criteria) this;
        }

        public Criteria andMenuColorNotIn(List<String> values) {
            addCriterion("menu_color not in", values, "menuColor");
            return (Criteria) this;
        }

        public Criteria andMenuColorBetween(String value1, String value2) {
            addCriterion("menu_color between", value1, value2, "menuColor");
            return (Criteria) this;
        }

        public Criteria andMenuColorNotBetween(String value1, String value2) {
            addCriterion("menu_color not between", value1, value2, "menuColor");
            return (Criteria) this;
        }

        public Criteria andPermissionIsNull() {
            addCriterion("permission is null");
            return (Criteria) this;
        }

        public Criteria andPermissionIsNotNull() {
            addCriterion("permission is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionEqualTo(String value) {
            addCriterion("permission =", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionNotEqualTo(String value) {
            addCriterion("permission <>", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionGreaterThan(String value) {
            addCriterion("permission >", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionGreaterThanOrEqualTo(String value) {
            addCriterion("permission >=", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionLessThan(String value) {
            addCriterion("permission <", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionLessThanOrEqualTo(String value) {
            addCriterion("permission <=", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionLike(String value) {
            addCriterion("permission like", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionNotLike(String value) {
            addCriterion("permission not like", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionIn(List<String> values) {
            addCriterion("permission in", values, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionNotIn(List<String> values) {
            addCriterion("permission not in", values, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionBetween(String value1, String value2) {
            addCriterion("permission between", value1, value2, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionNotBetween(String value1, String value2) {
            addCriterion("permission not between", value1, value2, "permission");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Short value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Short value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Short value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Short value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Short value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Short value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Short> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Short> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Short value1, Short value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Short value1, Short value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNull() {
            addCriterion("is_show is null");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNotNull() {
            addCriterion("is_show is not null");
            return (Criteria) this;
        }

        public Criteria andIsShowEqualTo(String value) {
            addCriterion("is_show =", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotEqualTo(String value) {
            addCriterion("is_show <>", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThan(String value) {
            addCriterion("is_show >", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThanOrEqualTo(String value) {
            addCriterion("is_show >=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThan(String value) {
            addCriterion("is_show <", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThanOrEqualTo(String value) {
            addCriterion("is_show <=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLike(String value) {
            addCriterion("is_show like", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotLike(String value) {
            addCriterion("is_show not like", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowIn(List<String> values) {
            addCriterion("is_show in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotIn(List<String> values) {
            addCriterion("is_show not in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowBetween(String value1, String value2) {
            addCriterion("is_show between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotBetween(String value1, String value2) {
            addCriterion("is_show not between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andSysCodeIsNull() {
            addCriterion("sys_code is null");
            return (Criteria) this;
        }

        public Criteria andSysCodeIsNotNull() {
            addCriterion("sys_code is not null");
            return (Criteria) this;
        }

        public Criteria andSysCodeEqualTo(String value) {
            addCriterion("sys_code =", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeNotEqualTo(String value) {
            addCriterion("sys_code <>", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeGreaterThan(String value) {
            addCriterion("sys_code >", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sys_code >=", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeLessThan(String value) {
            addCriterion("sys_code <", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeLessThanOrEqualTo(String value) {
            addCriterion("sys_code <=", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeLike(String value) {
            addCriterion("sys_code like", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeNotLike(String value) {
            addCriterion("sys_code not like", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeIn(List<String> values) {
            addCriterion("sys_code in", values, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeNotIn(List<String> values) {
            addCriterion("sys_code not in", values, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeBetween(String value1, String value2) {
            addCriterion("sys_code between", value1, value2, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeNotBetween(String value1, String value2) {
            addCriterion("sys_code not between", value1, value2, "sysCode");
            return (Criteria) this;
        }

        public Criteria andModuleCodesIsNull() {
            addCriterion("module_codes is null");
            return (Criteria) this;
        }

        public Criteria andModuleCodesIsNotNull() {
            addCriterion("module_codes is not null");
            return (Criteria) this;
        }

        public Criteria andModuleCodesEqualTo(String value) {
            addCriterion("module_codes =", value, "moduleCodes");
            return (Criteria) this;
        }

        public Criteria andModuleCodesNotEqualTo(String value) {
            addCriterion("module_codes <>", value, "moduleCodes");
            return (Criteria) this;
        }

        public Criteria andModuleCodesGreaterThan(String value) {
            addCriterion("module_codes >", value, "moduleCodes");
            return (Criteria) this;
        }

        public Criteria andModuleCodesGreaterThanOrEqualTo(String value) {
            addCriterion("module_codes >=", value, "moduleCodes");
            return (Criteria) this;
        }

        public Criteria andModuleCodesLessThan(String value) {
            addCriterion("module_codes <", value, "moduleCodes");
            return (Criteria) this;
        }

        public Criteria andModuleCodesLessThanOrEqualTo(String value) {
            addCriterion("module_codes <=", value, "moduleCodes");
            return (Criteria) this;
        }

        public Criteria andModuleCodesLike(String value) {
            addCriterion("module_codes like", value, "moduleCodes");
            return (Criteria) this;
        }

        public Criteria andModuleCodesNotLike(String value) {
            addCriterion("module_codes not like", value, "moduleCodes");
            return (Criteria) this;
        }

        public Criteria andModuleCodesIn(List<String> values) {
            addCriterion("module_codes in", values, "moduleCodes");
            return (Criteria) this;
        }

        public Criteria andModuleCodesNotIn(List<String> values) {
            addCriterion("module_codes not in", values, "moduleCodes");
            return (Criteria) this;
        }

        public Criteria andModuleCodesBetween(String value1, String value2) {
            addCriterion("module_codes between", value1, value2, "moduleCodes");
            return (Criteria) this;
        }

        public Criteria andModuleCodesNotBetween(String value1, String value2) {
            addCriterion("module_codes not between", value1, value2, "moduleCodes");
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

        public Criteria andMenuCodeLikeInsensitive(String value) {
            addCriterion("upper(menu_code) like", value.toUpperCase(), "menuCode");
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

        public Criteria andMenuNameLikeInsensitive(String value) {
            addCriterion("upper(menu_name) like", value.toUpperCase(), "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLikeInsensitive(String value) {
            addCriterion("upper(menu_type) like", value.toUpperCase(), "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuHrefLikeInsensitive(String value) {
            addCriterion("upper(menu_href) like", value.toUpperCase(), "menuHref");
            return (Criteria) this;
        }

        public Criteria andMenuTargetLikeInsensitive(String value) {
            addCriterion("upper(menu_target) like", value.toUpperCase(), "menuTarget");
            return (Criteria) this;
        }

        public Criteria andMenuIconLikeInsensitive(String value) {
            addCriterion("upper(menu_icon) like", value.toUpperCase(), "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuColorLikeInsensitive(String value) {
            addCriterion("upper(menu_color) like", value.toUpperCase(), "menuColor");
            return (Criteria) this;
        }

        public Criteria andPermissionLikeInsensitive(String value) {
            addCriterion("upper(permission) like", value.toUpperCase(), "permission");
            return (Criteria) this;
        }

        public Criteria andIsShowLikeInsensitive(String value) {
            addCriterion("upper(is_show) like", value.toUpperCase(), "isShow");
            return (Criteria) this;
        }

        public Criteria andSysCodeLikeInsensitive(String value) {
            addCriterion("upper(sys_code) like", value.toUpperCase(), "sysCode");
            return (Criteria) this;
        }

        public Criteria andModuleCodesLikeInsensitive(String value) {
            addCriterion("upper(module_codes) like", value.toUpperCase(), "moduleCodes");
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