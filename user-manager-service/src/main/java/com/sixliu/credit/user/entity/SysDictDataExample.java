package com.sixliu.credit.user.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysDictDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysDictDataExample() {
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

        public Criteria andDictCodeIsNull() {
            addCriterion("dict_code is null");
            return (Criteria) this;
        }

        public Criteria andDictCodeIsNotNull() {
            addCriterion("dict_code is not null");
            return (Criteria) this;
        }

        public Criteria andDictCodeEqualTo(String value) {
            addCriterion("dict_code =", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeNotEqualTo(String value) {
            addCriterion("dict_code <>", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeGreaterThan(String value) {
            addCriterion("dict_code >", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dict_code >=", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeLessThan(String value) {
            addCriterion("dict_code <", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeLessThanOrEqualTo(String value) {
            addCriterion("dict_code <=", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeLike(String value) {
            addCriterion("dict_code like", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeNotLike(String value) {
            addCriterion("dict_code not like", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeIn(List<String> values) {
            addCriterion("dict_code in", values, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeNotIn(List<String> values) {
            addCriterion("dict_code not in", values, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeBetween(String value1, String value2) {
            addCriterion("dict_code between", value1, value2, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeNotBetween(String value1, String value2) {
            addCriterion("dict_code not between", value1, value2, "dictCode");
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

        public Criteria andDictLabelIsNull() {
            addCriterion("dict_label is null");
            return (Criteria) this;
        }

        public Criteria andDictLabelIsNotNull() {
            addCriterion("dict_label is not null");
            return (Criteria) this;
        }

        public Criteria andDictLabelEqualTo(String value) {
            addCriterion("dict_label =", value, "dictLabel");
            return (Criteria) this;
        }

        public Criteria andDictLabelNotEqualTo(String value) {
            addCriterion("dict_label <>", value, "dictLabel");
            return (Criteria) this;
        }

        public Criteria andDictLabelGreaterThan(String value) {
            addCriterion("dict_label >", value, "dictLabel");
            return (Criteria) this;
        }

        public Criteria andDictLabelGreaterThanOrEqualTo(String value) {
            addCriterion("dict_label >=", value, "dictLabel");
            return (Criteria) this;
        }

        public Criteria andDictLabelLessThan(String value) {
            addCriterion("dict_label <", value, "dictLabel");
            return (Criteria) this;
        }

        public Criteria andDictLabelLessThanOrEqualTo(String value) {
            addCriterion("dict_label <=", value, "dictLabel");
            return (Criteria) this;
        }

        public Criteria andDictLabelLike(String value) {
            addCriterion("dict_label like", value, "dictLabel");
            return (Criteria) this;
        }

        public Criteria andDictLabelNotLike(String value) {
            addCriterion("dict_label not like", value, "dictLabel");
            return (Criteria) this;
        }

        public Criteria andDictLabelIn(List<String> values) {
            addCriterion("dict_label in", values, "dictLabel");
            return (Criteria) this;
        }

        public Criteria andDictLabelNotIn(List<String> values) {
            addCriterion("dict_label not in", values, "dictLabel");
            return (Criteria) this;
        }

        public Criteria andDictLabelBetween(String value1, String value2) {
            addCriterion("dict_label between", value1, value2, "dictLabel");
            return (Criteria) this;
        }

        public Criteria andDictLabelNotBetween(String value1, String value2) {
            addCriterion("dict_label not between", value1, value2, "dictLabel");
            return (Criteria) this;
        }

        public Criteria andDictValueIsNull() {
            addCriterion("dict_value is null");
            return (Criteria) this;
        }

        public Criteria andDictValueIsNotNull() {
            addCriterion("dict_value is not null");
            return (Criteria) this;
        }

        public Criteria andDictValueEqualTo(String value) {
            addCriterion("dict_value =", value, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueNotEqualTo(String value) {
            addCriterion("dict_value <>", value, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueGreaterThan(String value) {
            addCriterion("dict_value >", value, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueGreaterThanOrEqualTo(String value) {
            addCriterion("dict_value >=", value, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueLessThan(String value) {
            addCriterion("dict_value <", value, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueLessThanOrEqualTo(String value) {
            addCriterion("dict_value <=", value, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueLike(String value) {
            addCriterion("dict_value like", value, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueNotLike(String value) {
            addCriterion("dict_value not like", value, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueIn(List<String> values) {
            addCriterion("dict_value in", values, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueNotIn(List<String> values) {
            addCriterion("dict_value not in", values, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueBetween(String value1, String value2) {
            addCriterion("dict_value between", value1, value2, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictValueNotBetween(String value1, String value2) {
            addCriterion("dict_value not between", value1, value2, "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictTypeIsNull() {
            addCriterion("dict_type is null");
            return (Criteria) this;
        }

        public Criteria andDictTypeIsNotNull() {
            addCriterion("dict_type is not null");
            return (Criteria) this;
        }

        public Criteria andDictTypeEqualTo(String value) {
            addCriterion("dict_type =", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeNotEqualTo(String value) {
            addCriterion("dict_type <>", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeGreaterThan(String value) {
            addCriterion("dict_type >", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeGreaterThanOrEqualTo(String value) {
            addCriterion("dict_type >=", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeLessThan(String value) {
            addCriterion("dict_type <", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeLessThanOrEqualTo(String value) {
            addCriterion("dict_type <=", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeLike(String value) {
            addCriterion("dict_type like", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeNotLike(String value) {
            addCriterion("dict_type not like", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeIn(List<String> values) {
            addCriterion("dict_type in", values, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeNotIn(List<String> values) {
            addCriterion("dict_type not in", values, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeBetween(String value1, String value2) {
            addCriterion("dict_type between", value1, value2, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeNotBetween(String value1, String value2) {
            addCriterion("dict_type not between", value1, value2, "dictType");
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

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andCssStyleIsNull() {
            addCriterion("css_style is null");
            return (Criteria) this;
        }

        public Criteria andCssStyleIsNotNull() {
            addCriterion("css_style is not null");
            return (Criteria) this;
        }

        public Criteria andCssStyleEqualTo(String value) {
            addCriterion("css_style =", value, "cssStyle");
            return (Criteria) this;
        }

        public Criteria andCssStyleNotEqualTo(String value) {
            addCriterion("css_style <>", value, "cssStyle");
            return (Criteria) this;
        }

        public Criteria andCssStyleGreaterThan(String value) {
            addCriterion("css_style >", value, "cssStyle");
            return (Criteria) this;
        }

        public Criteria andCssStyleGreaterThanOrEqualTo(String value) {
            addCriterion("css_style >=", value, "cssStyle");
            return (Criteria) this;
        }

        public Criteria andCssStyleLessThan(String value) {
            addCriterion("css_style <", value, "cssStyle");
            return (Criteria) this;
        }

        public Criteria andCssStyleLessThanOrEqualTo(String value) {
            addCriterion("css_style <=", value, "cssStyle");
            return (Criteria) this;
        }

        public Criteria andCssStyleLike(String value) {
            addCriterion("css_style like", value, "cssStyle");
            return (Criteria) this;
        }

        public Criteria andCssStyleNotLike(String value) {
            addCriterion("css_style not like", value, "cssStyle");
            return (Criteria) this;
        }

        public Criteria andCssStyleIn(List<String> values) {
            addCriterion("css_style in", values, "cssStyle");
            return (Criteria) this;
        }

        public Criteria andCssStyleNotIn(List<String> values) {
            addCriterion("css_style not in", values, "cssStyle");
            return (Criteria) this;
        }

        public Criteria andCssStyleBetween(String value1, String value2) {
            addCriterion("css_style between", value1, value2, "cssStyle");
            return (Criteria) this;
        }

        public Criteria andCssStyleNotBetween(String value1, String value2) {
            addCriterion("css_style not between", value1, value2, "cssStyle");
            return (Criteria) this;
        }

        public Criteria andCssClassIsNull() {
            addCriterion("css_class is null");
            return (Criteria) this;
        }

        public Criteria andCssClassIsNotNull() {
            addCriterion("css_class is not null");
            return (Criteria) this;
        }

        public Criteria andCssClassEqualTo(String value) {
            addCriterion("css_class =", value, "cssClass");
            return (Criteria) this;
        }

        public Criteria andCssClassNotEqualTo(String value) {
            addCriterion("css_class <>", value, "cssClass");
            return (Criteria) this;
        }

        public Criteria andCssClassGreaterThan(String value) {
            addCriterion("css_class >", value, "cssClass");
            return (Criteria) this;
        }

        public Criteria andCssClassGreaterThanOrEqualTo(String value) {
            addCriterion("css_class >=", value, "cssClass");
            return (Criteria) this;
        }

        public Criteria andCssClassLessThan(String value) {
            addCriterion("css_class <", value, "cssClass");
            return (Criteria) this;
        }

        public Criteria andCssClassLessThanOrEqualTo(String value) {
            addCriterion("css_class <=", value, "cssClass");
            return (Criteria) this;
        }

        public Criteria andCssClassLike(String value) {
            addCriterion("css_class like", value, "cssClass");
            return (Criteria) this;
        }

        public Criteria andCssClassNotLike(String value) {
            addCriterion("css_class not like", value, "cssClass");
            return (Criteria) this;
        }

        public Criteria andCssClassIn(List<String> values) {
            addCriterion("css_class in", values, "cssClass");
            return (Criteria) this;
        }

        public Criteria andCssClassNotIn(List<String> values) {
            addCriterion("css_class not in", values, "cssClass");
            return (Criteria) this;
        }

        public Criteria andCssClassBetween(String value1, String value2) {
            addCriterion("css_class between", value1, value2, "cssClass");
            return (Criteria) this;
        }

        public Criteria andCssClassNotBetween(String value1, String value2) {
            addCriterion("css_class not between", value1, value2, "cssClass");
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

        public Criteria andDictCodeLikeInsensitive(String value) {
            addCriterion("upper(dict_code) like", value.toUpperCase(), "dictCode");
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

        public Criteria andDictLabelLikeInsensitive(String value) {
            addCriterion("upper(dict_label) like", value.toUpperCase(), "dictLabel");
            return (Criteria) this;
        }

        public Criteria andDictValueLikeInsensitive(String value) {
            addCriterion("upper(dict_value) like", value.toUpperCase(), "dictValue");
            return (Criteria) this;
        }

        public Criteria andDictTypeLikeInsensitive(String value) {
            addCriterion("upper(dict_type) like", value.toUpperCase(), "dictType");
            return (Criteria) this;
        }

        public Criteria andIsSysLikeInsensitive(String value) {
            addCriterion("upper(is_sys) like", value.toUpperCase(), "isSys");
            return (Criteria) this;
        }

        public Criteria andDescriptionLikeInsensitive(String value) {
            addCriterion("upper(description) like", value.toUpperCase(), "description");
            return (Criteria) this;
        }

        public Criteria andCssStyleLikeInsensitive(String value) {
            addCriterion("upper(css_style) like", value.toUpperCase(), "cssStyle");
            return (Criteria) this;
        }

        public Criteria andCssClassLikeInsensitive(String value) {
            addCriterion("upper(css_class) like", value.toUpperCase(), "cssClass");
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