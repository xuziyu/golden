package com.share.golden.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserBankCardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserBankCardExample() {
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

        public Criteria andCardIdIsNull() {
            addCriterion("\"CARD_ID\" is null");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNotNull() {
            addCriterion("\"CARD_ID\" is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdEqualTo(String value) {
            addCriterion("\"CARD_ID\" =", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotEqualTo(String value) {
            addCriterion("\"CARD_ID\" <>", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThan(String value) {
            addCriterion("\"CARD_ID\" >", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("\"CARD_ID\" >=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThan(String value) {
            addCriterion("\"CARD_ID\" <", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThanOrEqualTo(String value) {
            addCriterion("\"CARD_ID\" <=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLike(String value) {
            addCriterion("\"CARD_ID\" like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotLike(String value) {
            addCriterion("\"CARD_ID\" not like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdIn(List<String> values) {
            addCriterion("\"CARD_ID\" in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotIn(List<String> values) {
            addCriterion("\"CARD_ID\" not in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdBetween(String value1, String value2) {
            addCriterion("\"CARD_ID\" between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotBetween(String value1, String value2) {
            addCriterion("\"CARD_ID\" not between", value1, value2, "cardId");
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

        public Criteria andTradeCodeIsNull() {
            addCriterion("\"TRADE_CODE\" is null");
            return (Criteria) this;
        }

        public Criteria andTradeCodeIsNotNull() {
            addCriterion("\"TRADE_CODE\" is not null");
            return (Criteria) this;
        }

        public Criteria andTradeCodeEqualTo(String value) {
            addCriterion("\"TRADE_CODE\" =", value, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeCodeNotEqualTo(String value) {
            addCriterion("\"TRADE_CODE\" <>", value, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeCodeGreaterThan(String value) {
            addCriterion("\"TRADE_CODE\" >", value, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("\"TRADE_CODE\" >=", value, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeCodeLessThan(String value) {
            addCriterion("\"TRADE_CODE\" <", value, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeCodeLessThanOrEqualTo(String value) {
            addCriterion("\"TRADE_CODE\" <=", value, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeCodeLike(String value) {
            addCriterion("\"TRADE_CODE\" like", value, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeCodeNotLike(String value) {
            addCriterion("\"TRADE_CODE\" not like", value, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeCodeIn(List<String> values) {
            addCriterion("\"TRADE_CODE\" in", values, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeCodeNotIn(List<String> values) {
            addCriterion("\"TRADE_CODE\" not in", values, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeCodeBetween(String value1, String value2) {
            addCriterion("\"TRADE_CODE\" between", value1, value2, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeCodeNotBetween(String value1, String value2) {
            addCriterion("\"TRADE_CODE\" not between", value1, value2, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andIdentityNumberIsNull() {
            addCriterion("\"IDENTITY_NUMBER\" is null");
            return (Criteria) this;
        }

        public Criteria andIdentityNumberIsNotNull() {
            addCriterion("\"IDENTITY_NUMBER\" is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityNumberEqualTo(String value) {
            addCriterion("\"IDENTITY_NUMBER\" =", value, "identityNumber");
            return (Criteria) this;
        }

        public Criteria andIdentityNumberNotEqualTo(String value) {
            addCriterion("\"IDENTITY_NUMBER\" <>", value, "identityNumber");
            return (Criteria) this;
        }

        public Criteria andIdentityNumberGreaterThan(String value) {
            addCriterion("\"IDENTITY_NUMBER\" >", value, "identityNumber");
            return (Criteria) this;
        }

        public Criteria andIdentityNumberGreaterThanOrEqualTo(String value) {
            addCriterion("\"IDENTITY_NUMBER\" >=", value, "identityNumber");
            return (Criteria) this;
        }

        public Criteria andIdentityNumberLessThan(String value) {
            addCriterion("\"IDENTITY_NUMBER\" <", value, "identityNumber");
            return (Criteria) this;
        }

        public Criteria andIdentityNumberLessThanOrEqualTo(String value) {
            addCriterion("\"IDENTITY_NUMBER\" <=", value, "identityNumber");
            return (Criteria) this;
        }

        public Criteria andIdentityNumberLike(String value) {
            addCriterion("\"IDENTITY_NUMBER\" like", value, "identityNumber");
            return (Criteria) this;
        }

        public Criteria andIdentityNumberNotLike(String value) {
            addCriterion("\"IDENTITY_NUMBER\" not like", value, "identityNumber");
            return (Criteria) this;
        }

        public Criteria andIdentityNumberIn(List<String> values) {
            addCriterion("\"IDENTITY_NUMBER\" in", values, "identityNumber");
            return (Criteria) this;
        }

        public Criteria andIdentityNumberNotIn(List<String> values) {
            addCriterion("\"IDENTITY_NUMBER\" not in", values, "identityNumber");
            return (Criteria) this;
        }

        public Criteria andIdentityNumberBetween(String value1, String value2) {
            addCriterion("\"IDENTITY_NUMBER\" between", value1, value2, "identityNumber");
            return (Criteria) this;
        }

        public Criteria andIdentityNumberNotBetween(String value1, String value2) {
            addCriterion("\"IDENTITY_NUMBER\" not between", value1, value2, "identityNumber");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("\"BANK_NAME\" is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("\"BANK_NAME\" is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("\"BANK_NAME\" =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("\"BANK_NAME\" <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("\"BANK_NAME\" >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("\"BANK_NAME\" >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("\"BANK_NAME\" <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("\"BANK_NAME\" <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("\"BANK_NAME\" like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("\"BANK_NAME\" not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("\"BANK_NAME\" in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("\"BANK_NAME\" not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("\"BANK_NAME\" between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("\"BANK_NAME\" not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIsNull() {
            addCriterion("\"SUBMIT_TIME\" is null");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIsNotNull() {
            addCriterion("\"SUBMIT_TIME\" is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeEqualTo(Date value) {
            addCriterion("\"SUBMIT_TIME\" =", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotEqualTo(Date value) {
            addCriterion("\"SUBMIT_TIME\" <>", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeGreaterThan(Date value) {
            addCriterion("\"SUBMIT_TIME\" >", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("\"SUBMIT_TIME\" >=", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeLessThan(Date value) {
            addCriterion("\"SUBMIT_TIME\" <", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeLessThanOrEqualTo(Date value) {
            addCriterion("\"SUBMIT_TIME\" <=", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIn(List<Date> values) {
            addCriterion("\"SUBMIT_TIME\" in", values, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotIn(List<Date> values) {
            addCriterion("\"SUBMIT_TIME\" not in", values, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeBetween(Date value1, Date value2) {
            addCriterion("\"SUBMIT_TIME\" between", value1, value2, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotBetween(Date value1, Date value2) {
            addCriterion("\"SUBMIT_TIME\" not between", value1, value2, "submitTime");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("\"STATE\" is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("\"STATE\" is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("\"STATE\" =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("\"STATE\" <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("\"STATE\" >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("\"STATE\" >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("\"STATE\" <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("\"STATE\" <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("\"STATE\" like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("\"STATE\" not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("\"STATE\" in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("\"STATE\" not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("\"STATE\" between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("\"STATE\" not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andBlanceIsNull() {
            addCriterion("\"BLANCE\" is null");
            return (Criteria) this;
        }

        public Criteria andBlanceIsNotNull() {
            addCriterion("\"BLANCE\" is not null");
            return (Criteria) this;
        }

        public Criteria andBlanceEqualTo(Integer value) {
            addCriterion("\"BLANCE\" =", value, "blance");
            return (Criteria) this;
        }

        public Criteria andBlanceNotEqualTo(Integer value) {
            addCriterion("\"BLANCE\" <>", value, "blance");
            return (Criteria) this;
        }

        public Criteria andBlanceGreaterThan(Integer value) {
            addCriterion("\"BLANCE\" >", value, "blance");
            return (Criteria) this;
        }

        public Criteria andBlanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"BLANCE\" >=", value, "blance");
            return (Criteria) this;
        }

        public Criteria andBlanceLessThan(Integer value) {
            addCriterion("\"BLANCE\" <", value, "blance");
            return (Criteria) this;
        }

        public Criteria andBlanceLessThanOrEqualTo(Integer value) {
            addCriterion("\"BLANCE\" <=", value, "blance");
            return (Criteria) this;
        }

        public Criteria andBlanceIn(List<Integer> values) {
            addCriterion("\"BLANCE\" in", values, "blance");
            return (Criteria) this;
        }

        public Criteria andBlanceNotIn(List<Integer> values) {
            addCriterion("\"BLANCE\" not in", values, "blance");
            return (Criteria) this;
        }

        public Criteria andBlanceBetween(Integer value1, Integer value2) {
            addCriterion("\"BLANCE\" between", value1, value2, "blance");
            return (Criteria) this;
        }

        public Criteria andBlanceNotBetween(Integer value1, Integer value2) {
            addCriterion("\"BLANCE\" not between", value1, value2, "blance");
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