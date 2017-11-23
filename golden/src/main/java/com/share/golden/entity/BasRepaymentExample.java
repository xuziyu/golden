package com.share.golden.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BasRepaymentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BasRepaymentExample() {
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

        public Criteria andRepayIdIsNull() {
            addCriterion("\"REPAY_ID\" is null");
            return (Criteria) this;
        }

        public Criteria andRepayIdIsNotNull() {
            addCriterion("\"REPAY_ID\" is not null");
            return (Criteria) this;
        }

        public Criteria andRepayIdEqualTo(String value) {
            addCriterion("\"REPAY_ID\" =", value, "repayId");
            return (Criteria) this;
        }

        public Criteria andRepayIdNotEqualTo(String value) {
            addCriterion("\"REPAY_ID\" <>", value, "repayId");
            return (Criteria) this;
        }

        public Criteria andRepayIdGreaterThan(String value) {
            addCriterion("\"REPAY_ID\" >", value, "repayId");
            return (Criteria) this;
        }

        public Criteria andRepayIdGreaterThanOrEqualTo(String value) {
            addCriterion("\"REPAY_ID\" >=", value, "repayId");
            return (Criteria) this;
        }

        public Criteria andRepayIdLessThan(String value) {
            addCriterion("\"REPAY_ID\" <", value, "repayId");
            return (Criteria) this;
        }

        public Criteria andRepayIdLessThanOrEqualTo(String value) {
            addCriterion("\"REPAY_ID\" <=", value, "repayId");
            return (Criteria) this;
        }

        public Criteria andRepayIdLike(String value) {
            addCriterion("\"REPAY_ID\" like", value, "repayId");
            return (Criteria) this;
        }

        public Criteria andRepayIdNotLike(String value) {
            addCriterion("\"REPAY_ID\" not like", value, "repayId");
            return (Criteria) this;
        }

        public Criteria andRepayIdIn(List<String> values) {
            addCriterion("\"REPAY_ID\" in", values, "repayId");
            return (Criteria) this;
        }

        public Criteria andRepayIdNotIn(List<String> values) {
            addCriterion("\"REPAY_ID\" not in", values, "repayId");
            return (Criteria) this;
        }

        public Criteria andRepayIdBetween(String value1, String value2) {
            addCriterion("\"REPAY_ID\" between", value1, value2, "repayId");
            return (Criteria) this;
        }

        public Criteria andRepayIdNotBetween(String value1, String value2) {
            addCriterion("\"REPAY_ID\" not between", value1, value2, "repayId");
            return (Criteria) this;
        }

        public Criteria andRepayCodeIsNull() {
            addCriterion("\"REPAY_CODE\" is null");
            return (Criteria) this;
        }

        public Criteria andRepayCodeIsNotNull() {
            addCriterion("\"REPAY_CODE\" is not null");
            return (Criteria) this;
        }

        public Criteria andRepayCodeEqualTo(String value) {
            addCriterion("\"REPAY_CODE\" =", value, "repayCode");
            return (Criteria) this;
        }

        public Criteria andRepayCodeNotEqualTo(String value) {
            addCriterion("\"REPAY_CODE\" <>", value, "repayCode");
            return (Criteria) this;
        }

        public Criteria andRepayCodeGreaterThan(String value) {
            addCriterion("\"REPAY_CODE\" >", value, "repayCode");
            return (Criteria) this;
        }

        public Criteria andRepayCodeGreaterThanOrEqualTo(String value) {
            addCriterion("\"REPAY_CODE\" >=", value, "repayCode");
            return (Criteria) this;
        }

        public Criteria andRepayCodeLessThan(String value) {
            addCriterion("\"REPAY_CODE\" <", value, "repayCode");
            return (Criteria) this;
        }

        public Criteria andRepayCodeLessThanOrEqualTo(String value) {
            addCriterion("\"REPAY_CODE\" <=", value, "repayCode");
            return (Criteria) this;
        }

        public Criteria andRepayCodeLike(String value) {
            addCriterion("\"REPAY_CODE\" like", value, "repayCode");
            return (Criteria) this;
        }

        public Criteria andRepayCodeNotLike(String value) {
            addCriterion("\"REPAY_CODE\" not like", value, "repayCode");
            return (Criteria) this;
        }

        public Criteria andRepayCodeIn(List<String> values) {
            addCriterion("\"REPAY_CODE\" in", values, "repayCode");
            return (Criteria) this;
        }

        public Criteria andRepayCodeNotIn(List<String> values) {
            addCriterion("\"REPAY_CODE\" not in", values, "repayCode");
            return (Criteria) this;
        }

        public Criteria andRepayCodeBetween(String value1, String value2) {
            addCriterion("\"REPAY_CODE\" between", value1, value2, "repayCode");
            return (Criteria) this;
        }

        public Criteria andRepayCodeNotBetween(String value1, String value2) {
            addCriterion("\"REPAY_CODE\" not between", value1, value2, "repayCode");
            return (Criteria) this;
        }

        public Criteria andRepayDateIsNull() {
            addCriterion("\"REPAY_DATE\" is null");
            return (Criteria) this;
        }

        public Criteria andRepayDateIsNotNull() {
            addCriterion("\"REPAY_DATE\" is not null");
            return (Criteria) this;
        }

        public Criteria andRepayDateEqualTo(Date value) {
            addCriterion("\"REPAY_DATE\" =", value, "repayDate");
            return (Criteria) this;
        }

        public Criteria andRepayDateNotEqualTo(Date value) {
            addCriterion("\"REPAY_DATE\" <>", value, "repayDate");
            return (Criteria) this;
        }

        public Criteria andRepayDateGreaterThan(Date value) {
            addCriterion("\"REPAY_DATE\" >", value, "repayDate");
            return (Criteria) this;
        }

        public Criteria andRepayDateGreaterThanOrEqualTo(Date value) {
            addCriterion("\"REPAY_DATE\" >=", value, "repayDate");
            return (Criteria) this;
        }

        public Criteria andRepayDateLessThan(Date value) {
            addCriterion("\"REPAY_DATE\" <", value, "repayDate");
            return (Criteria) this;
        }

        public Criteria andRepayDateLessThanOrEqualTo(Date value) {
            addCriterion("\"REPAY_DATE\" <=", value, "repayDate");
            return (Criteria) this;
        }

        public Criteria andRepayDateIn(List<Date> values) {
            addCriterion("\"REPAY_DATE\" in", values, "repayDate");
            return (Criteria) this;
        }

        public Criteria andRepayDateNotIn(List<Date> values) {
            addCriterion("\"REPAY_DATE\" not in", values, "repayDate");
            return (Criteria) this;
        }

        public Criteria andRepayDateBetween(Date value1, Date value2) {
            addCriterion("\"REPAY_DATE\" between", value1, value2, "repayDate");
            return (Criteria) this;
        }

        public Criteria andRepayDateNotBetween(Date value1, Date value2) {
            addCriterion("\"REPAY_DATE\" not between", value1, value2, "repayDate");
            return (Criteria) this;
        }

        public Criteria andRepayStateIsNull() {
            addCriterion("\"REPAY_STATE\" is null");
            return (Criteria) this;
        }

        public Criteria andRepayStateIsNotNull() {
            addCriterion("\"REPAY_STATE\" is not null");
            return (Criteria) this;
        }

        public Criteria andRepayStateEqualTo(String value) {
            addCriterion("\"REPAY_STATE\" =", value, "repayState");
            return (Criteria) this;
        }

        public Criteria andRepayStateNotEqualTo(String value) {
            addCriterion("\"REPAY_STATE\" <>", value, "repayState");
            return (Criteria) this;
        }

        public Criteria andRepayStateGreaterThan(String value) {
            addCriterion("\"REPAY_STATE\" >", value, "repayState");
            return (Criteria) this;
        }

        public Criteria andRepayStateGreaterThanOrEqualTo(String value) {
            addCriterion("\"REPAY_STATE\" >=", value, "repayState");
            return (Criteria) this;
        }

        public Criteria andRepayStateLessThan(String value) {
            addCriterion("\"REPAY_STATE\" <", value, "repayState");
            return (Criteria) this;
        }

        public Criteria andRepayStateLessThanOrEqualTo(String value) {
            addCriterion("\"REPAY_STATE\" <=", value, "repayState");
            return (Criteria) this;
        }

        public Criteria andRepayStateLike(String value) {
            addCriterion("\"REPAY_STATE\" like", value, "repayState");
            return (Criteria) this;
        }

        public Criteria andRepayStateNotLike(String value) {
            addCriterion("\"REPAY_STATE\" not like", value, "repayState");
            return (Criteria) this;
        }

        public Criteria andRepayStateIn(List<String> values) {
            addCriterion("\"REPAY_STATE\" in", values, "repayState");
            return (Criteria) this;
        }

        public Criteria andRepayStateNotIn(List<String> values) {
            addCriterion("\"REPAY_STATE\" not in", values, "repayState");
            return (Criteria) this;
        }

        public Criteria andRepayStateBetween(String value1, String value2) {
            addCriterion("\"REPAY_STATE\" between", value1, value2, "repayState");
            return (Criteria) this;
        }

        public Criteria andRepayStateNotBetween(String value1, String value2) {
            addCriterion("\"REPAY_STATE\" not between", value1, value2, "repayState");
            return (Criteria) this;
        }

        public Criteria andRepayTimeIsNull() {
            addCriterion("\"REPAY_TIME\" is null");
            return (Criteria) this;
        }

        public Criteria andRepayTimeIsNotNull() {
            addCriterion("\"REPAY_TIME\" is not null");
            return (Criteria) this;
        }

        public Criteria andRepayTimeEqualTo(String value) {
            addCriterion("\"REPAY_TIME\" =", value, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeNotEqualTo(String value) {
            addCriterion("\"REPAY_TIME\" <>", value, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeGreaterThan(String value) {
            addCriterion("\"REPAY_TIME\" >", value, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeGreaterThanOrEqualTo(String value) {
            addCriterion("\"REPAY_TIME\" >=", value, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeLessThan(String value) {
            addCriterion("\"REPAY_TIME\" <", value, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeLessThanOrEqualTo(String value) {
            addCriterion("\"REPAY_TIME\" <=", value, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeLike(String value) {
            addCriterion("\"REPAY_TIME\" like", value, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeNotLike(String value) {
            addCriterion("\"REPAY_TIME\" not like", value, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeIn(List<String> values) {
            addCriterion("\"REPAY_TIME\" in", values, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeNotIn(List<String> values) {
            addCriterion("\"REPAY_TIME\" not in", values, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeBetween(String value1, String value2) {
            addCriterion("\"REPAY_TIME\" between", value1, value2, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeNotBetween(String value1, String value2) {
            addCriterion("\"REPAY_TIME\" not between", value1, value2, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayRemark1IsNull() {
            addCriterion("\"REPAY_REMARK1\" is null");
            return (Criteria) this;
        }

        public Criteria andRepayRemark1IsNotNull() {
            addCriterion("\"REPAY_REMARK1\" is not null");
            return (Criteria) this;
        }

        public Criteria andRepayRemark1EqualTo(String value) {
            addCriterion("\"REPAY_REMARK1\" =", value, "repayRemark1");
            return (Criteria) this;
        }

        public Criteria andRepayRemark1NotEqualTo(String value) {
            addCriterion("\"REPAY_REMARK1\" <>", value, "repayRemark1");
            return (Criteria) this;
        }

        public Criteria andRepayRemark1GreaterThan(String value) {
            addCriterion("\"REPAY_REMARK1\" >", value, "repayRemark1");
            return (Criteria) this;
        }

        public Criteria andRepayRemark1GreaterThanOrEqualTo(String value) {
            addCriterion("\"REPAY_REMARK1\" >=", value, "repayRemark1");
            return (Criteria) this;
        }

        public Criteria andRepayRemark1LessThan(String value) {
            addCriterion("\"REPAY_REMARK1\" <", value, "repayRemark1");
            return (Criteria) this;
        }

        public Criteria andRepayRemark1LessThanOrEqualTo(String value) {
            addCriterion("\"REPAY_REMARK1\" <=", value, "repayRemark1");
            return (Criteria) this;
        }

        public Criteria andRepayRemark1Like(String value) {
            addCriterion("\"REPAY_REMARK1\" like", value, "repayRemark1");
            return (Criteria) this;
        }

        public Criteria andRepayRemark1NotLike(String value) {
            addCriterion("\"REPAY_REMARK1\" not like", value, "repayRemark1");
            return (Criteria) this;
        }

        public Criteria andRepayRemark1In(List<String> values) {
            addCriterion("\"REPAY_REMARK1\" in", values, "repayRemark1");
            return (Criteria) this;
        }

        public Criteria andRepayRemark1NotIn(List<String> values) {
            addCriterion("\"REPAY_REMARK1\" not in", values, "repayRemark1");
            return (Criteria) this;
        }

        public Criteria andRepayRemark1Between(String value1, String value2) {
            addCriterion("\"REPAY_REMARK1\" between", value1, value2, "repayRemark1");
            return (Criteria) this;
        }

        public Criteria andRepayRemark1NotBetween(String value1, String value2) {
            addCriterion("\"REPAY_REMARK1\" not between", value1, value2, "repayRemark1");
            return (Criteria) this;
        }

        public Criteria andRepayRemark2IsNull() {
            addCriterion("\"REPAY_REMARK2\" is null");
            return (Criteria) this;
        }

        public Criteria andRepayRemark2IsNotNull() {
            addCriterion("\"REPAY_REMARK2\" is not null");
            return (Criteria) this;
        }

        public Criteria andRepayRemark2EqualTo(String value) {
            addCriterion("\"REPAY_REMARK2\" =", value, "repayRemark2");
            return (Criteria) this;
        }

        public Criteria andRepayRemark2NotEqualTo(String value) {
            addCriterion("\"REPAY_REMARK2\" <>", value, "repayRemark2");
            return (Criteria) this;
        }

        public Criteria andRepayRemark2GreaterThan(String value) {
            addCriterion("\"REPAY_REMARK2\" >", value, "repayRemark2");
            return (Criteria) this;
        }

        public Criteria andRepayRemark2GreaterThanOrEqualTo(String value) {
            addCriterion("\"REPAY_REMARK2\" >=", value, "repayRemark2");
            return (Criteria) this;
        }

        public Criteria andRepayRemark2LessThan(String value) {
            addCriterion("\"REPAY_REMARK2\" <", value, "repayRemark2");
            return (Criteria) this;
        }

        public Criteria andRepayRemark2LessThanOrEqualTo(String value) {
            addCriterion("\"REPAY_REMARK2\" <=", value, "repayRemark2");
            return (Criteria) this;
        }

        public Criteria andRepayRemark2Like(String value) {
            addCriterion("\"REPAY_REMARK2\" like", value, "repayRemark2");
            return (Criteria) this;
        }

        public Criteria andRepayRemark2NotLike(String value) {
            addCriterion("\"REPAY_REMARK2\" not like", value, "repayRemark2");
            return (Criteria) this;
        }

        public Criteria andRepayRemark2In(List<String> values) {
            addCriterion("\"REPAY_REMARK2\" in", values, "repayRemark2");
            return (Criteria) this;
        }

        public Criteria andRepayRemark2NotIn(List<String> values) {
            addCriterion("\"REPAY_REMARK2\" not in", values, "repayRemark2");
            return (Criteria) this;
        }

        public Criteria andRepayRemark2Between(String value1, String value2) {
            addCriterion("\"REPAY_REMARK2\" between", value1, value2, "repayRemark2");
            return (Criteria) this;
        }

        public Criteria andRepayRemark2NotBetween(String value1, String value2) {
            addCriterion("\"REPAY_REMARK2\" not between", value1, value2, "repayRemark2");
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