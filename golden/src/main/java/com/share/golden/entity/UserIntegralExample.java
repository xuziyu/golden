package com.share.golden.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class UserIntegralExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserIntegralExample() {
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

        public Criteria andCuserIdIsNull() {
            addCriterion("\"CUSER_ID\" is null");
            return (Criteria) this;
        }

        public Criteria andCuserIdIsNotNull() {
            addCriterion("\"CUSER_ID\" is not null");
            return (Criteria) this;
        }

        public Criteria andCuserIdEqualTo(String value) {
            addCriterion("\"CUSER_ID\" =", value, "cuserId");
            return (Criteria) this;
        }

        public Criteria andCuserIdNotEqualTo(String value) {
            addCriterion("\"CUSER_ID\" <>", value, "cuserId");
            return (Criteria) this;
        }

        public Criteria andCuserIdGreaterThan(String value) {
            addCriterion("\"CUSER_ID\" >", value, "cuserId");
            return (Criteria) this;
        }

        public Criteria andCuserIdGreaterThanOrEqualTo(String value) {
            addCriterion("\"CUSER_ID\" >=", value, "cuserId");
            return (Criteria) this;
        }

        public Criteria andCuserIdLessThan(String value) {
            addCriterion("\"CUSER_ID\" <", value, "cuserId");
            return (Criteria) this;
        }

        public Criteria andCuserIdLessThanOrEqualTo(String value) {
            addCriterion("\"CUSER_ID\" <=", value, "cuserId");
            return (Criteria) this;
        }

        public Criteria andCuserIdLike(String value) {
            addCriterion("\"CUSER_ID\" like", value, "cuserId");
            return (Criteria) this;
        }

        public Criteria andCuserIdNotLike(String value) {
            addCriterion("\"CUSER_ID\" not like", value, "cuserId");
            return (Criteria) this;
        }

        public Criteria andCuserIdIn(List<String> values) {
            addCriterion("\"CUSER_ID\" in", values, "cuserId");
            return (Criteria) this;
        }

        public Criteria andCuserIdNotIn(List<String> values) {
            addCriterion("\"CUSER_ID\" not in", values, "cuserId");
            return (Criteria) this;
        }

        public Criteria andCuserIdBetween(String value1, String value2) {
            addCriterion("\"CUSER_ID\" between", value1, value2, "cuserId");
            return (Criteria) this;
        }

        public Criteria andCuserIdNotBetween(String value1, String value2) {
            addCriterion("\"CUSER_ID\" not between", value1, value2, "cuserId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("\"USER_ID\" is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("\"USER_ID\" is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("\"USER_ID\" =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("\"USER_ID\" <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("\"USER_ID\" >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("\"USER_ID\" >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("\"USER_ID\" <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("\"USER_ID\" <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("\"USER_ID\" like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("\"USER_ID\" not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("\"USER_ID\" in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("\"USER_ID\" not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("\"USER_ID\" between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("\"USER_ID\" not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andCreditPointIsNull() {
            addCriterion("\"CREDIT_POINT\" is null");
            return (Criteria) this;
        }

        public Criteria andCreditPointIsNotNull() {
            addCriterion("\"CREDIT_POINT\" is not null");
            return (Criteria) this;
        }

        public Criteria andCreditPointEqualTo(BigDecimal value) {
            addCriterion("\"CREDIT_POINT\" =", value, "creditPoint");
            return (Criteria) this;
        }

        public Criteria andCreditPointNotEqualTo(BigDecimal value) {
            addCriterion("\"CREDIT_POINT\" <>", value, "creditPoint");
            return (Criteria) this;
        }

        public Criteria andCreditPointGreaterThan(BigDecimal value) {
            addCriterion("\"CREDIT_POINT\" >", value, "creditPoint");
            return (Criteria) this;
        }

        public Criteria andCreditPointGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("\"CREDIT_POINT\" >=", value, "creditPoint");
            return (Criteria) this;
        }

        public Criteria andCreditPointLessThan(BigDecimal value) {
            addCriterion("\"CREDIT_POINT\" <", value, "creditPoint");
            return (Criteria) this;
        }

        public Criteria andCreditPointLessThanOrEqualTo(BigDecimal value) {
            addCriterion("\"CREDIT_POINT\" <=", value, "creditPoint");
            return (Criteria) this;
        }

        public Criteria andCreditPointIn(List<BigDecimal> values) {
            addCriterion("\"CREDIT_POINT\" in", values, "creditPoint");
            return (Criteria) this;
        }

        public Criteria andCreditPointNotIn(List<BigDecimal> values) {
            addCriterion("\"CREDIT_POINT\" not in", values, "creditPoint");
            return (Criteria) this;
        }

        public Criteria andCreditPointBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("\"CREDIT_POINT\" between", value1, value2, "creditPoint");
            return (Criteria) this;
        }

        public Criteria andCreditPointNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("\"CREDIT_POINT\" not between", value1, value2, "creditPoint");
            return (Criteria) this;
        }

        public Criteria andMemberPointIsNull() {
            addCriterion("\"MEMBER_POINT\" is null");
            return (Criteria) this;
        }

        public Criteria andMemberPointIsNotNull() {
            addCriterion("\"MEMBER_POINT\" is not null");
            return (Criteria) this;
        }

        public Criteria andMemberPointEqualTo(BigDecimal value) {
            addCriterion("\"MEMBER_POINT\" =", value, "memberPoint");
            return (Criteria) this;
        }

        public Criteria andMemberPointNotEqualTo(BigDecimal value) {
            addCriterion("\"MEMBER_POINT\" <>", value, "memberPoint");
            return (Criteria) this;
        }

        public Criteria andMemberPointGreaterThan(BigDecimal value) {
            addCriterion("\"MEMBER_POINT\" >", value, "memberPoint");
            return (Criteria) this;
        }

        public Criteria andMemberPointGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("\"MEMBER_POINT\" >=", value, "memberPoint");
            return (Criteria) this;
        }

        public Criteria andMemberPointLessThan(BigDecimal value) {
            addCriterion("\"MEMBER_POINT\" <", value, "memberPoint");
            return (Criteria) this;
        }

        public Criteria andMemberPointLessThanOrEqualTo(BigDecimal value) {
            addCriterion("\"MEMBER_POINT\" <=", value, "memberPoint");
            return (Criteria) this;
        }

        public Criteria andMemberPointIn(List<BigDecimal> values) {
            addCriterion("\"MEMBER_POINT\" in", values, "memberPoint");
            return (Criteria) this;
        }

        public Criteria andMemberPointNotIn(List<BigDecimal> values) {
            addCriterion("\"MEMBER_POINT\" not in", values, "memberPoint");
            return (Criteria) this;
        }

        public Criteria andMemberPointBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("\"MEMBER_POINT\" between", value1, value2, "memberPoint");
            return (Criteria) this;
        }

        public Criteria andMemberPointNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("\"MEMBER_POINT\" not between", value1, value2, "memberPoint");
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