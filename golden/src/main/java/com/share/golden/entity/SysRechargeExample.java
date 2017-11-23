package com.share.golden.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysRechargeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysRechargeExample() {
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

        public Criteria andRechargeIdIsNull() {
            addCriterion("\"RECHARGE_ID\" is null");
            return (Criteria) this;
        }

        public Criteria andRechargeIdIsNotNull() {
            addCriterion("\"RECHARGE_ID\" is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeIdEqualTo(String value) {
            addCriterion("\"RECHARGE_ID\" =", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdNotEqualTo(String value) {
            addCriterion("\"RECHARGE_ID\" <>", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdGreaterThan(String value) {
            addCriterion("\"RECHARGE_ID\" >", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdGreaterThanOrEqualTo(String value) {
            addCriterion("\"RECHARGE_ID\" >=", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdLessThan(String value) {
            addCriterion("\"RECHARGE_ID\" <", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdLessThanOrEqualTo(String value) {
            addCriterion("\"RECHARGE_ID\" <=", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdLike(String value) {
            addCriterion("\"RECHARGE_ID\" like", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdNotLike(String value) {
            addCriterion("\"RECHARGE_ID\" not like", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdIn(List<String> values) {
            addCriterion("\"RECHARGE_ID\" in", values, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdNotIn(List<String> values) {
            addCriterion("\"RECHARGE_ID\" not in", values, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdBetween(String value1, String value2) {
            addCriterion("\"RECHARGE_ID\" between", value1, value2, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdNotBetween(String value1, String value2) {
            addCriterion("\"RECHARGE_ID\" not between", value1, value2, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeCodeIsNull() {
            addCriterion("\"RECHARGE_CODE\" is null");
            return (Criteria) this;
        }

        public Criteria andRechargeCodeIsNotNull() {
            addCriterion("\"RECHARGE_CODE\" is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeCodeEqualTo(String value) {
            addCriterion("\"RECHARGE_CODE\" =", value, "rechargeCode");
            return (Criteria) this;
        }

        public Criteria andRechargeCodeNotEqualTo(String value) {
            addCriterion("\"RECHARGE_CODE\" <>", value, "rechargeCode");
            return (Criteria) this;
        }

        public Criteria andRechargeCodeGreaterThan(String value) {
            addCriterion("\"RECHARGE_CODE\" >", value, "rechargeCode");
            return (Criteria) this;
        }

        public Criteria andRechargeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("\"RECHARGE_CODE\" >=", value, "rechargeCode");
            return (Criteria) this;
        }

        public Criteria andRechargeCodeLessThan(String value) {
            addCriterion("\"RECHARGE_CODE\" <", value, "rechargeCode");
            return (Criteria) this;
        }

        public Criteria andRechargeCodeLessThanOrEqualTo(String value) {
            addCriterion("\"RECHARGE_CODE\" <=", value, "rechargeCode");
            return (Criteria) this;
        }

        public Criteria andRechargeCodeLike(String value) {
            addCriterion("\"RECHARGE_CODE\" like", value, "rechargeCode");
            return (Criteria) this;
        }

        public Criteria andRechargeCodeNotLike(String value) {
            addCriterion("\"RECHARGE_CODE\" not like", value, "rechargeCode");
            return (Criteria) this;
        }

        public Criteria andRechargeCodeIn(List<String> values) {
            addCriterion("\"RECHARGE_CODE\" in", values, "rechargeCode");
            return (Criteria) this;
        }

        public Criteria andRechargeCodeNotIn(List<String> values) {
            addCriterion("\"RECHARGE_CODE\" not in", values, "rechargeCode");
            return (Criteria) this;
        }

        public Criteria andRechargeCodeBetween(String value1, String value2) {
            addCriterion("\"RECHARGE_CODE\" between", value1, value2, "rechargeCode");
            return (Criteria) this;
        }

        public Criteria andRechargeCodeNotBetween(String value1, String value2) {
            addCriterion("\"RECHARGE_CODE\" not between", value1, value2, "rechargeCode");
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

        public Criteria andRechargeTypeIsNull() {
            addCriterion("\"RECHARGE_TYPE\" is null");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeIsNotNull() {
            addCriterion("\"RECHARGE_TYPE\" is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeEqualTo(String value) {
            addCriterion("\"RECHARGE_TYPE\" =", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeNotEqualTo(String value) {
            addCriterion("\"RECHARGE_TYPE\" <>", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeGreaterThan(String value) {
            addCriterion("\"RECHARGE_TYPE\" >", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("\"RECHARGE_TYPE\" >=", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeLessThan(String value) {
            addCriterion("\"RECHARGE_TYPE\" <", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeLessThanOrEqualTo(String value) {
            addCriterion("\"RECHARGE_TYPE\" <=", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeLike(String value) {
            addCriterion("\"RECHARGE_TYPE\" like", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeNotLike(String value) {
            addCriterion("\"RECHARGE_TYPE\" not like", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeIn(List<String> values) {
            addCriterion("\"RECHARGE_TYPE\" in", values, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeNotIn(List<String> values) {
            addCriterion("\"RECHARGE_TYPE\" not in", values, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeBetween(String value1, String value2) {
            addCriterion("\"RECHARGE_TYPE\" between", value1, value2, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeNotBetween(String value1, String value2) {
            addCriterion("\"RECHARGE_TYPE\" not between", value1, value2, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyIsNull() {
            addCriterion("\"RECHARGE_MONEY\" is null");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyIsNotNull() {
            addCriterion("\"RECHARGE_MONEY\" is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyEqualTo(String value) {
            addCriterion("\"RECHARGE_MONEY\" =", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotEqualTo(String value) {
            addCriterion("\"RECHARGE_MONEY\" <>", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyGreaterThan(String value) {
            addCriterion("\"RECHARGE_MONEY\" >", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("\"RECHARGE_MONEY\" >=", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyLessThan(String value) {
            addCriterion("\"RECHARGE_MONEY\" <", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyLessThanOrEqualTo(String value) {
            addCriterion("\"RECHARGE_MONEY\" <=", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyLike(String value) {
            addCriterion("\"RECHARGE_MONEY\" like", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotLike(String value) {
            addCriterion("\"RECHARGE_MONEY\" not like", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyIn(List<String> values) {
            addCriterion("\"RECHARGE_MONEY\" in", values, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotIn(List<String> values) {
            addCriterion("\"RECHARGE_MONEY\" not in", values, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyBetween(String value1, String value2) {
            addCriterion("\"RECHARGE_MONEY\" between", value1, value2, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotBetween(String value1, String value2) {
            addCriterion("\"RECHARGE_MONEY\" not between", value1, value2, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeIsNull() {
            addCriterion("\"RECHARGE_TIME\" is null");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeIsNotNull() {
            addCriterion("\"RECHARGE_TIME\" is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeEqualTo(Date value) {
            addCriterion("\"RECHARGE_TIME\" =", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeNotEqualTo(Date value) {
            addCriterion("\"RECHARGE_TIME\" <>", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeGreaterThan(Date value) {
            addCriterion("\"RECHARGE_TIME\" >", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("\"RECHARGE_TIME\" >=", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeLessThan(Date value) {
            addCriterion("\"RECHARGE_TIME\" <", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeLessThanOrEqualTo(Date value) {
            addCriterion("\"RECHARGE_TIME\" <=", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeIn(List<Date> values) {
            addCriterion("\"RECHARGE_TIME\" in", values, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeNotIn(List<Date> values) {
            addCriterion("\"RECHARGE_TIME\" not in", values, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeBetween(Date value1, Date value2) {
            addCriterion("\"RECHARGE_TIME\" between", value1, value2, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeNotBetween(Date value1, Date value2) {
            addCriterion("\"RECHARGE_TIME\" not between", value1, value2, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeStatuIsNull() {
            addCriterion("\"RECHARGE_STATU\" is null");
            return (Criteria) this;
        }

        public Criteria andRechargeStatuIsNotNull() {
            addCriterion("\"RECHARGE_STATU\" is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeStatuEqualTo(String value) {
            addCriterion("\"RECHARGE_STATU\" =", value, "rechargeStatu");
            return (Criteria) this;
        }

        public Criteria andRechargeStatuNotEqualTo(String value) {
            addCriterion("\"RECHARGE_STATU\" <>", value, "rechargeStatu");
            return (Criteria) this;
        }

        public Criteria andRechargeStatuGreaterThan(String value) {
            addCriterion("\"RECHARGE_STATU\" >", value, "rechargeStatu");
            return (Criteria) this;
        }

        public Criteria andRechargeStatuGreaterThanOrEqualTo(String value) {
            addCriterion("\"RECHARGE_STATU\" >=", value, "rechargeStatu");
            return (Criteria) this;
        }

        public Criteria andRechargeStatuLessThan(String value) {
            addCriterion("\"RECHARGE_STATU\" <", value, "rechargeStatu");
            return (Criteria) this;
        }

        public Criteria andRechargeStatuLessThanOrEqualTo(String value) {
            addCriterion("\"RECHARGE_STATU\" <=", value, "rechargeStatu");
            return (Criteria) this;
        }

        public Criteria andRechargeStatuLike(String value) {
            addCriterion("\"RECHARGE_STATU\" like", value, "rechargeStatu");
            return (Criteria) this;
        }

        public Criteria andRechargeStatuNotLike(String value) {
            addCriterion("\"RECHARGE_STATU\" not like", value, "rechargeStatu");
            return (Criteria) this;
        }

        public Criteria andRechargeStatuIn(List<String> values) {
            addCriterion("\"RECHARGE_STATU\" in", values, "rechargeStatu");
            return (Criteria) this;
        }

        public Criteria andRechargeStatuNotIn(List<String> values) {
            addCriterion("\"RECHARGE_STATU\" not in", values, "rechargeStatu");
            return (Criteria) this;
        }

        public Criteria andRechargeStatuBetween(String value1, String value2) {
            addCriterion("\"RECHARGE_STATU\" between", value1, value2, "rechargeStatu");
            return (Criteria) this;
        }

        public Criteria andRechargeStatuNotBetween(String value1, String value2) {
            addCriterion("\"RECHARGE_STATU\" not between", value1, value2, "rechargeStatu");
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