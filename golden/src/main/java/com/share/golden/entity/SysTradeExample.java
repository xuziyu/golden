package com.share.golden.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysTradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysTradeExample() {
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

        public Criteria andTradeIdIsNull() {
            addCriterion("\"TRADE_ID\" is null");
            return (Criteria) this;
        }

        public Criteria andTradeIdIsNotNull() {
            addCriterion("\"TRADE_ID\" is not null");
            return (Criteria) this;
        }

        public Criteria andTradeIdEqualTo(String value) {
            addCriterion("\"TRADE_ID\" =", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdNotEqualTo(String value) {
            addCriterion("\"TRADE_ID\" <>", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdGreaterThan(String value) {
            addCriterion("\"TRADE_ID\" >", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdGreaterThanOrEqualTo(String value) {
            addCriterion("\"TRADE_ID\" >=", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdLessThan(String value) {
            addCriterion("\"TRADE_ID\" <", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdLessThanOrEqualTo(String value) {
            addCriterion("\"TRADE_ID\" <=", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdLike(String value) {
            addCriterion("\"TRADE_ID\" like", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdNotLike(String value) {
            addCriterion("\"TRADE_ID\" not like", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdIn(List<String> values) {
            addCriterion("\"TRADE_ID\" in", values, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdNotIn(List<String> values) {
            addCriterion("\"TRADE_ID\" not in", values, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdBetween(String value1, String value2) {
            addCriterion("\"TRADE_ID\" between", value1, value2, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdNotBetween(String value1, String value2) {
            addCriterion("\"TRADE_ID\" not between", value1, value2, "tradeId");
            return (Criteria) this;
        }

        public Criteria andUserIIsNull() {
            addCriterion("\"USER_I\" is null");
            return (Criteria) this;
        }

        public Criteria andUserIIsNotNull() {
            addCriterion("\"USER_I\" is not null");
            return (Criteria) this;
        }

        public Criteria andUserIEqualTo(String value) {
            addCriterion("\"USER_I\" =", value, "userI");
            return (Criteria) this;
        }

        public Criteria andUserINotEqualTo(String value) {
            addCriterion("\"USER_I\" <>", value, "userI");
            return (Criteria) this;
        }

        public Criteria andUserIGreaterThan(String value) {
            addCriterion("\"USER_I\" >", value, "userI");
            return (Criteria) this;
        }

        public Criteria andUserIGreaterThanOrEqualTo(String value) {
            addCriterion("\"USER_I\" >=", value, "userI");
            return (Criteria) this;
        }

        public Criteria andUserILessThan(String value) {
            addCriterion("\"USER_I\" <", value, "userI");
            return (Criteria) this;
        }

        public Criteria andUserILessThanOrEqualTo(String value) {
            addCriterion("\"USER_I\" <=", value, "userI");
            return (Criteria) this;
        }

        public Criteria andUserILike(String value) {
            addCriterion("\"USER_I\" like", value, "userI");
            return (Criteria) this;
        }

        public Criteria andUserINotLike(String value) {
            addCriterion("\"USER_I\" not like", value, "userI");
            return (Criteria) this;
        }

        public Criteria andUserIIn(List<String> values) {
            addCriterion("\"USER_I\" in", values, "userI");
            return (Criteria) this;
        }

        public Criteria andUserINotIn(List<String> values) {
            addCriterion("\"USER_I\" not in", values, "userI");
            return (Criteria) this;
        }

        public Criteria andUserIBetween(String value1, String value2) {
            addCriterion("\"USER_I\" between", value1, value2, "userI");
            return (Criteria) this;
        }

        public Criteria andUserINotBetween(String value1, String value2) {
            addCriterion("\"USER_I\" not between", value1, value2, "userI");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyIsNull() {
            addCriterion("\"TRADE_MONEY\" is null");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyIsNotNull() {
            addCriterion("\"TRADE_MONEY\" is not null");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyEqualTo(String value) {
            addCriterion("\"TRADE_MONEY\" =", value, "tradeMoney");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyNotEqualTo(String value) {
            addCriterion("\"TRADE_MONEY\" <>", value, "tradeMoney");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyGreaterThan(String value) {
            addCriterion("\"TRADE_MONEY\" >", value, "tradeMoney");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("\"TRADE_MONEY\" >=", value, "tradeMoney");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyLessThan(String value) {
            addCriterion("\"TRADE_MONEY\" <", value, "tradeMoney");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyLessThanOrEqualTo(String value) {
            addCriterion("\"TRADE_MONEY\" <=", value, "tradeMoney");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyLike(String value) {
            addCriterion("\"TRADE_MONEY\" like", value, "tradeMoney");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyNotLike(String value) {
            addCriterion("\"TRADE_MONEY\" not like", value, "tradeMoney");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyIn(List<String> values) {
            addCriterion("\"TRADE_MONEY\" in", values, "tradeMoney");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyNotIn(List<String> values) {
            addCriterion("\"TRADE_MONEY\" not in", values, "tradeMoney");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyBetween(String value1, String value2) {
            addCriterion("\"TRADE_MONEY\" between", value1, value2, "tradeMoney");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyNotBetween(String value1, String value2) {
            addCriterion("\"TRADE_MONEY\" not between", value1, value2, "tradeMoney");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNull() {
            addCriterion("\"TRADE_TYPE\" is null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNotNull() {
            addCriterion("\"TRADE_TYPE\" is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeEqualTo(String value) {
            addCriterion("\"TRADE_TYPE\" =", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotEqualTo(String value) {
            addCriterion("\"TRADE_TYPE\" <>", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThan(String value) {
            addCriterion("\"TRADE_TYPE\" >", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("\"TRADE_TYPE\" >=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThan(String value) {
            addCriterion("\"TRADE_TYPE\" <", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThanOrEqualTo(String value) {
            addCriterion("\"TRADE_TYPE\" <=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLike(String value) {
            addCriterion("\"TRADE_TYPE\" like", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotLike(String value) {
            addCriterion("\"TRADE_TYPE\" not like", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIn(List<String> values) {
            addCriterion("\"TRADE_TYPE\" in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotIn(List<String> values) {
            addCriterion("\"TRADE_TYPE\" not in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeBetween(String value1, String value2) {
            addCriterion("\"TRADE_TYPE\" between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotBetween(String value1, String value2) {
            addCriterion("\"TRADE_TYPE\" not between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTimeIsNull() {
            addCriterion("\"TRADE_TIME\" is null");
            return (Criteria) this;
        }

        public Criteria andTradeTimeIsNotNull() {
            addCriterion("\"TRADE_TIME\" is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTimeEqualTo(Date value) {
            addCriterion("\"TRADE_TIME\" =", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeNotEqualTo(Date value) {
            addCriterion("\"TRADE_TIME\" <>", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeGreaterThan(Date value) {
            addCriterion("\"TRADE_TIME\" >", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("\"TRADE_TIME\" >=", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeLessThan(Date value) {
            addCriterion("\"TRADE_TIME\" <", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeLessThanOrEqualTo(Date value) {
            addCriterion("\"TRADE_TIME\" <=", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeIn(List<Date> values) {
            addCriterion("\"TRADE_TIME\" in", values, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeNotIn(List<Date> values) {
            addCriterion("\"TRADE_TIME\" not in", values, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeBetween(Date value1, Date value2) {
            addCriterion("\"TRADE_TIME\" between", value1, value2, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeNotBetween(Date value1, Date value2) {
            addCriterion("\"TRADE_TIME\" not between", value1, value2, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeRemarkIsNull() {
            addCriterion("\"TRADE_REMARK\" is null");
            return (Criteria) this;
        }

        public Criteria andTradeRemarkIsNotNull() {
            addCriterion("\"TRADE_REMARK\" is not null");
            return (Criteria) this;
        }

        public Criteria andTradeRemarkEqualTo(String value) {
            addCriterion("\"TRADE_REMARK\" =", value, "tradeRemark");
            return (Criteria) this;
        }

        public Criteria andTradeRemarkNotEqualTo(String value) {
            addCriterion("\"TRADE_REMARK\" <>", value, "tradeRemark");
            return (Criteria) this;
        }

        public Criteria andTradeRemarkGreaterThan(String value) {
            addCriterion("\"TRADE_REMARK\" >", value, "tradeRemark");
            return (Criteria) this;
        }

        public Criteria andTradeRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("\"TRADE_REMARK\" >=", value, "tradeRemark");
            return (Criteria) this;
        }

        public Criteria andTradeRemarkLessThan(String value) {
            addCriterion("\"TRADE_REMARK\" <", value, "tradeRemark");
            return (Criteria) this;
        }

        public Criteria andTradeRemarkLessThanOrEqualTo(String value) {
            addCriterion("\"TRADE_REMARK\" <=", value, "tradeRemark");
            return (Criteria) this;
        }

        public Criteria andTradeRemarkLike(String value) {
            addCriterion("\"TRADE_REMARK\" like", value, "tradeRemark");
            return (Criteria) this;
        }

        public Criteria andTradeRemarkNotLike(String value) {
            addCriterion("\"TRADE_REMARK\" not like", value, "tradeRemark");
            return (Criteria) this;
        }

        public Criteria andTradeRemarkIn(List<String> values) {
            addCriterion("\"TRADE_REMARK\" in", values, "tradeRemark");
            return (Criteria) this;
        }

        public Criteria andTradeRemarkNotIn(List<String> values) {
            addCriterion("\"TRADE_REMARK\" not in", values, "tradeRemark");
            return (Criteria) this;
        }

        public Criteria andTradeRemarkBetween(String value1, String value2) {
            addCriterion("\"TRADE_REMARK\" between", value1, value2, "tradeRemark");
            return (Criteria) this;
        }

        public Criteria andTradeRemarkNotBetween(String value1, String value2) {
            addCriterion("\"TRADE_REMARK\" not between", value1, value2, "tradeRemark");
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