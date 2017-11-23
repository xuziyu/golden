package com.share.golden.entity;

import java.util.ArrayList;
import java.util.List;

public class SysVipExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysVipExample() {
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

        public Criteria andVipIdIsNull() {
            addCriterion("\"VIP_ID\" is null");
            return (Criteria) this;
        }

        public Criteria andVipIdIsNotNull() {
            addCriterion("\"VIP_ID\" is not null");
            return (Criteria) this;
        }

        public Criteria andVipIdEqualTo(String value) {
            addCriterion("\"VIP_ID\" =", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdNotEqualTo(String value) {
            addCriterion("\"VIP_ID\" <>", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdGreaterThan(String value) {
            addCriterion("\"VIP_ID\" >", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdGreaterThanOrEqualTo(String value) {
            addCriterion("\"VIP_ID\" >=", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdLessThan(String value) {
            addCriterion("\"VIP_ID\" <", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdLessThanOrEqualTo(String value) {
            addCriterion("\"VIP_ID\" <=", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdLike(String value) {
            addCriterion("\"VIP_ID\" like", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdNotLike(String value) {
            addCriterion("\"VIP_ID\" not like", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdIn(List<String> values) {
            addCriterion("\"VIP_ID\" in", values, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdNotIn(List<String> values) {
            addCriterion("\"VIP_ID\" not in", values, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdBetween(String value1, String value2) {
            addCriterion("\"VIP_ID\" between", value1, value2, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdNotBetween(String value1, String value2) {
            addCriterion("\"VIP_ID\" not between", value1, value2, "vipId");
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

        public Criteria andVipStateIsNull() {
            addCriterion("\"VIP_STATE\" is null");
            return (Criteria) this;
        }

        public Criteria andVipStateIsNotNull() {
            addCriterion("\"VIP_STATE\" is not null");
            return (Criteria) this;
        }

        public Criteria andVipStateEqualTo(String value) {
            addCriterion("\"VIP_STATE\" =", value, "vipState");
            return (Criteria) this;
        }

        public Criteria andVipStateNotEqualTo(String value) {
            addCriterion("\"VIP_STATE\" <>", value, "vipState");
            return (Criteria) this;
        }

        public Criteria andVipStateGreaterThan(String value) {
            addCriterion("\"VIP_STATE\" >", value, "vipState");
            return (Criteria) this;
        }

        public Criteria andVipStateGreaterThanOrEqualTo(String value) {
            addCriterion("\"VIP_STATE\" >=", value, "vipState");
            return (Criteria) this;
        }

        public Criteria andVipStateLessThan(String value) {
            addCriterion("\"VIP_STATE\" <", value, "vipState");
            return (Criteria) this;
        }

        public Criteria andVipStateLessThanOrEqualTo(String value) {
            addCriterion("\"VIP_STATE\" <=", value, "vipState");
            return (Criteria) this;
        }

        public Criteria andVipStateLike(String value) {
            addCriterion("\"VIP_STATE\" like", value, "vipState");
            return (Criteria) this;
        }

        public Criteria andVipStateNotLike(String value) {
            addCriterion("\"VIP_STATE\" not like", value, "vipState");
            return (Criteria) this;
        }

        public Criteria andVipStateIn(List<String> values) {
            addCriterion("\"VIP_STATE\" in", values, "vipState");
            return (Criteria) this;
        }

        public Criteria andVipStateNotIn(List<String> values) {
            addCriterion("\"VIP_STATE\" not in", values, "vipState");
            return (Criteria) this;
        }

        public Criteria andVipStateBetween(String value1, String value2) {
            addCriterion("\"VIP_STATE\" between", value1, value2, "vipState");
            return (Criteria) this;
        }

        public Criteria andVipStateNotBetween(String value1, String value2) {
            addCriterion("\"VIP_STATE\" not between", value1, value2, "vipState");
            return (Criteria) this;
        }

        public Criteria andUserCreditIsNull() {
            addCriterion("\"USER_CREDIT\" is null");
            return (Criteria) this;
        }

        public Criteria andUserCreditIsNotNull() {
            addCriterion("\"USER_CREDIT\" is not null");
            return (Criteria) this;
        }

        public Criteria andUserCreditEqualTo(String value) {
            addCriterion("\"USER_CREDIT\" =", value, "userCredit");
            return (Criteria) this;
        }

        public Criteria andUserCreditNotEqualTo(String value) {
            addCriterion("\"USER_CREDIT\" <>", value, "userCredit");
            return (Criteria) this;
        }

        public Criteria andUserCreditGreaterThan(String value) {
            addCriterion("\"USER_CREDIT\" >", value, "userCredit");
            return (Criteria) this;
        }

        public Criteria andUserCreditGreaterThanOrEqualTo(String value) {
            addCriterion("\"USER_CREDIT\" >=", value, "userCredit");
            return (Criteria) this;
        }

        public Criteria andUserCreditLessThan(String value) {
            addCriterion("\"USER_CREDIT\" <", value, "userCredit");
            return (Criteria) this;
        }

        public Criteria andUserCreditLessThanOrEqualTo(String value) {
            addCriterion("\"USER_CREDIT\" <=", value, "userCredit");
            return (Criteria) this;
        }

        public Criteria andUserCreditLike(String value) {
            addCriterion("\"USER_CREDIT\" like", value, "userCredit");
            return (Criteria) this;
        }

        public Criteria andUserCreditNotLike(String value) {
            addCriterion("\"USER_CREDIT\" not like", value, "userCredit");
            return (Criteria) this;
        }

        public Criteria andUserCreditIn(List<String> values) {
            addCriterion("\"USER_CREDIT\" in", values, "userCredit");
            return (Criteria) this;
        }

        public Criteria andUserCreditNotIn(List<String> values) {
            addCriterion("\"USER_CREDIT\" not in", values, "userCredit");
            return (Criteria) this;
        }

        public Criteria andUserCreditBetween(String value1, String value2) {
            addCriterion("\"USER_CREDIT\" between", value1, value2, "userCredit");
            return (Criteria) this;
        }

        public Criteria andUserCreditNotBetween(String value1, String value2) {
            addCriterion("\"USER_CREDIT\" not between", value1, value2, "userCredit");
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