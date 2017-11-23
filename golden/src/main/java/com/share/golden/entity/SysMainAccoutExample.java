package com.share.golden.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysMainAccoutExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysMainAccoutExample() {
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

        public Criteria andDealIdIsNull() {
            addCriterion("\"DEAL_ID\" is null");
            return (Criteria) this;
        }

        public Criteria andDealIdIsNotNull() {
            addCriterion("\"DEAL_ID\" is not null");
            return (Criteria) this;
        }

        public Criteria andDealIdEqualTo(String value) {
            addCriterion("\"DEAL_ID\" =", value, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdNotEqualTo(String value) {
            addCriterion("\"DEAL_ID\" <>", value, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdGreaterThan(String value) {
            addCriterion("\"DEAL_ID\" >", value, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdGreaterThanOrEqualTo(String value) {
            addCriterion("\"DEAL_ID\" >=", value, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdLessThan(String value) {
            addCriterion("\"DEAL_ID\" <", value, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdLessThanOrEqualTo(String value) {
            addCriterion("\"DEAL_ID\" <=", value, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdLike(String value) {
            addCriterion("\"DEAL_ID\" like", value, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdNotLike(String value) {
            addCriterion("\"DEAL_ID\" not like", value, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdIn(List<String> values) {
            addCriterion("\"DEAL_ID\" in", values, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdNotIn(List<String> values) {
            addCriterion("\"DEAL_ID\" not in", values, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdBetween(String value1, String value2) {
            addCriterion("\"DEAL_ID\" between", value1, value2, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdNotBetween(String value1, String value2) {
            addCriterion("\"DEAL_ID\" not between", value1, value2, "dealId");
            return (Criteria) this;
        }

        public Criteria andBankcardIdIsNull() {
            addCriterion("\"BANKCARD_ID\" is null");
            return (Criteria) this;
        }

        public Criteria andBankcardIdIsNotNull() {
            addCriterion("\"BANKCARD_ID\" is not null");
            return (Criteria) this;
        }

        public Criteria andBankcardIdEqualTo(String value) {
            addCriterion("\"BANKCARD_ID\" =", value, "bankcardId");
            return (Criteria) this;
        }

        public Criteria andBankcardIdNotEqualTo(String value) {
            addCriterion("\"BANKCARD_ID\" <>", value, "bankcardId");
            return (Criteria) this;
        }

        public Criteria andBankcardIdGreaterThan(String value) {
            addCriterion("\"BANKCARD_ID\" >", value, "bankcardId");
            return (Criteria) this;
        }

        public Criteria andBankcardIdGreaterThanOrEqualTo(String value) {
            addCriterion("\"BANKCARD_ID\" >=", value, "bankcardId");
            return (Criteria) this;
        }

        public Criteria andBankcardIdLessThan(String value) {
            addCriterion("\"BANKCARD_ID\" <", value, "bankcardId");
            return (Criteria) this;
        }

        public Criteria andBankcardIdLessThanOrEqualTo(String value) {
            addCriterion("\"BANKCARD_ID\" <=", value, "bankcardId");
            return (Criteria) this;
        }

        public Criteria andBankcardIdLike(String value) {
            addCriterion("\"BANKCARD_ID\" like", value, "bankcardId");
            return (Criteria) this;
        }

        public Criteria andBankcardIdNotLike(String value) {
            addCriterion("\"BANKCARD_ID\" not like", value, "bankcardId");
            return (Criteria) this;
        }

        public Criteria andBankcardIdIn(List<String> values) {
            addCriterion("\"BANKCARD_ID\" in", values, "bankcardId");
            return (Criteria) this;
        }

        public Criteria andBankcardIdNotIn(List<String> values) {
            addCriterion("\"BANKCARD_ID\" not in", values, "bankcardId");
            return (Criteria) this;
        }

        public Criteria andBankcardIdBetween(String value1, String value2) {
            addCriterion("\"BANKCARD_ID\" between", value1, value2, "bankcardId");
            return (Criteria) this;
        }

        public Criteria andBankcardIdNotBetween(String value1, String value2) {
            addCriterion("\"BANKCARD_ID\" not between", value1, value2, "bankcardId");
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

        public Criteria andBalanceIsNull() {
            addCriterion("\"BALANCE\" is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("\"BALANCE\" is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(BigDecimal value) {
            addCriterion("\"BALANCE\" =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(BigDecimal value) {
            addCriterion("\"BALANCE\" <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(BigDecimal value) {
            addCriterion("\"BALANCE\" >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("\"BALANCE\" >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(BigDecimal value) {
            addCriterion("\"BALANCE\" <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("\"BALANCE\" <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<BigDecimal> values) {
            addCriterion("\"BALANCE\" in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<BigDecimal> values) {
            addCriterion("\"BALANCE\" not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("\"BALANCE\" between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("\"BALANCE\" not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andDealTypeIsNull() {
            addCriterion("\"DEAL_TYPE\" is null");
            return (Criteria) this;
        }

        public Criteria andDealTypeIsNotNull() {
            addCriterion("\"DEAL_TYPE\" is not null");
            return (Criteria) this;
        }

        public Criteria andDealTypeEqualTo(String value) {
            addCriterion("\"DEAL_TYPE\" =", value, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeNotEqualTo(String value) {
            addCriterion("\"DEAL_TYPE\" <>", value, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeGreaterThan(String value) {
            addCriterion("\"DEAL_TYPE\" >", value, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeGreaterThanOrEqualTo(String value) {
            addCriterion("\"DEAL_TYPE\" >=", value, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeLessThan(String value) {
            addCriterion("\"DEAL_TYPE\" <", value, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeLessThanOrEqualTo(String value) {
            addCriterion("\"DEAL_TYPE\" <=", value, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeLike(String value) {
            addCriterion("\"DEAL_TYPE\" like", value, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeNotLike(String value) {
            addCriterion("\"DEAL_TYPE\" not like", value, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeIn(List<String> values) {
            addCriterion("\"DEAL_TYPE\" in", values, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeNotIn(List<String> values) {
            addCriterion("\"DEAL_TYPE\" not in", values, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeBetween(String value1, String value2) {
            addCriterion("\"DEAL_TYPE\" between", value1, value2, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeNotBetween(String value1, String value2) {
            addCriterion("\"DEAL_TYPE\" not between", value1, value2, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealDateIsNull() {
            addCriterion("\"DEAL_DATE\" is null");
            return (Criteria) this;
        }

        public Criteria andDealDateIsNotNull() {
            addCriterion("\"DEAL_DATE\" is not null");
            return (Criteria) this;
        }

        public Criteria andDealDateEqualTo(Date value) {
            addCriterion("\"DEAL_DATE\" =", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateNotEqualTo(Date value) {
            addCriterion("\"DEAL_DATE\" <>", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateGreaterThan(Date value) {
            addCriterion("\"DEAL_DATE\" >", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateGreaterThanOrEqualTo(Date value) {
            addCriterion("\"DEAL_DATE\" >=", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateLessThan(Date value) {
            addCriterion("\"DEAL_DATE\" <", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateLessThanOrEqualTo(Date value) {
            addCriterion("\"DEAL_DATE\" <=", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateIn(List<Date> values) {
            addCriterion("\"DEAL_DATE\" in", values, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateNotIn(List<Date> values) {
            addCriterion("\"DEAL_DATE\" not in", values, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateBetween(Date value1, Date value2) {
            addCriterion("\"DEAL_DATE\" between", value1, value2, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateNotBetween(Date value1, Date value2) {
            addCriterion("\"DEAL_DATE\" not between", value1, value2, "dealDate");
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