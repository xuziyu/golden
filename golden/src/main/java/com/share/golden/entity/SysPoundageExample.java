package com.share.golden.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysPoundageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysPoundageExample() {
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

        public Criteria andPoundageIdIsNull() {
            addCriterion("\"POUNDAGE_ID\" is null");
            return (Criteria) this;
        }

        public Criteria andPoundageIdIsNotNull() {
            addCriterion("\"POUNDAGE_ID\" is not null");
            return (Criteria) this;
        }

        public Criteria andPoundageIdEqualTo(String value) {
            addCriterion("\"POUNDAGE_ID\" =", value, "poundageId");
            return (Criteria) this;
        }

        public Criteria andPoundageIdNotEqualTo(String value) {
            addCriterion("\"POUNDAGE_ID\" <>", value, "poundageId");
            return (Criteria) this;
        }

        public Criteria andPoundageIdGreaterThan(String value) {
            addCriterion("\"POUNDAGE_ID\" >", value, "poundageId");
            return (Criteria) this;
        }

        public Criteria andPoundageIdGreaterThanOrEqualTo(String value) {
            addCriterion("\"POUNDAGE_ID\" >=", value, "poundageId");
            return (Criteria) this;
        }

        public Criteria andPoundageIdLessThan(String value) {
            addCriterion("\"POUNDAGE_ID\" <", value, "poundageId");
            return (Criteria) this;
        }

        public Criteria andPoundageIdLessThanOrEqualTo(String value) {
            addCriterion("\"POUNDAGE_ID\" <=", value, "poundageId");
            return (Criteria) this;
        }

        public Criteria andPoundageIdLike(String value) {
            addCriterion("\"POUNDAGE_ID\" like", value, "poundageId");
            return (Criteria) this;
        }

        public Criteria andPoundageIdNotLike(String value) {
            addCriterion("\"POUNDAGE_ID\" not like", value, "poundageId");
            return (Criteria) this;
        }

        public Criteria andPoundageIdIn(List<String> values) {
            addCriterion("\"POUNDAGE_ID\" in", values, "poundageId");
            return (Criteria) this;
        }

        public Criteria andPoundageIdNotIn(List<String> values) {
            addCriterion("\"POUNDAGE_ID\" not in", values, "poundageId");
            return (Criteria) this;
        }

        public Criteria andPoundageIdBetween(String value1, String value2) {
            addCriterion("\"POUNDAGE_ID\" between", value1, value2, "poundageId");
            return (Criteria) this;
        }

        public Criteria andPoundageIdNotBetween(String value1, String value2) {
            addCriterion("\"POUNDAGE_ID\" not between", value1, value2, "poundageId");
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

        public Criteria andPoundageServiceMoneyIsNull() {
            addCriterion("\"POUNDAGE_SERVICE_MONEY\" is null");
            return (Criteria) this;
        }

        public Criteria andPoundageServiceMoneyIsNotNull() {
            addCriterion("\"POUNDAGE_SERVICE_MONEY\" is not null");
            return (Criteria) this;
        }

        public Criteria andPoundageServiceMoneyEqualTo(BigDecimal value) {
            addCriterion("\"POUNDAGE_SERVICE_MONEY\" =", value, "poundageServiceMoney");
            return (Criteria) this;
        }

        public Criteria andPoundageServiceMoneyNotEqualTo(BigDecimal value) {
            addCriterion("\"POUNDAGE_SERVICE_MONEY\" <>", value, "poundageServiceMoney");
            return (Criteria) this;
        }

        public Criteria andPoundageServiceMoneyGreaterThan(BigDecimal value) {
            addCriterion("\"POUNDAGE_SERVICE_MONEY\" >", value, "poundageServiceMoney");
            return (Criteria) this;
        }

        public Criteria andPoundageServiceMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("\"POUNDAGE_SERVICE_MONEY\" >=", value, "poundageServiceMoney");
            return (Criteria) this;
        }

        public Criteria andPoundageServiceMoneyLessThan(BigDecimal value) {
            addCriterion("\"POUNDAGE_SERVICE_MONEY\" <", value, "poundageServiceMoney");
            return (Criteria) this;
        }

        public Criteria andPoundageServiceMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("\"POUNDAGE_SERVICE_MONEY\" <=", value, "poundageServiceMoney");
            return (Criteria) this;
        }

        public Criteria andPoundageServiceMoneyIn(List<BigDecimal> values) {
            addCriterion("\"POUNDAGE_SERVICE_MONEY\" in", values, "poundageServiceMoney");
            return (Criteria) this;
        }

        public Criteria andPoundageServiceMoneyNotIn(List<BigDecimal> values) {
            addCriterion("\"POUNDAGE_SERVICE_MONEY\" not in", values, "poundageServiceMoney");
            return (Criteria) this;
        }

        public Criteria andPoundageServiceMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("\"POUNDAGE_SERVICE_MONEY\" between", value1, value2, "poundageServiceMoney");
            return (Criteria) this;
        }

        public Criteria andPoundageServiceMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("\"POUNDAGE_SERVICE_MONEY\" not between", value1, value2, "poundageServiceMoney");
            return (Criteria) this;
        }

        public Criteria andPoundageTypeIsNull() {
            addCriterion("\"POUNDAGE_TYPE\" is null");
            return (Criteria) this;
        }

        public Criteria andPoundageTypeIsNotNull() {
            addCriterion("\"POUNDAGE_TYPE\" is not null");
            return (Criteria) this;
        }

        public Criteria andPoundageTypeEqualTo(String value) {
            addCriterion("\"POUNDAGE_TYPE\" =", value, "poundageType");
            return (Criteria) this;
        }

        public Criteria andPoundageTypeNotEqualTo(String value) {
            addCriterion("\"POUNDAGE_TYPE\" <>", value, "poundageType");
            return (Criteria) this;
        }

        public Criteria andPoundageTypeGreaterThan(String value) {
            addCriterion("\"POUNDAGE_TYPE\" >", value, "poundageType");
            return (Criteria) this;
        }

        public Criteria andPoundageTypeGreaterThanOrEqualTo(String value) {
            addCriterion("\"POUNDAGE_TYPE\" >=", value, "poundageType");
            return (Criteria) this;
        }

        public Criteria andPoundageTypeLessThan(String value) {
            addCriterion("\"POUNDAGE_TYPE\" <", value, "poundageType");
            return (Criteria) this;
        }

        public Criteria andPoundageTypeLessThanOrEqualTo(String value) {
            addCriterion("\"POUNDAGE_TYPE\" <=", value, "poundageType");
            return (Criteria) this;
        }

        public Criteria andPoundageTypeLike(String value) {
            addCriterion("\"POUNDAGE_TYPE\" like", value, "poundageType");
            return (Criteria) this;
        }

        public Criteria andPoundageTypeNotLike(String value) {
            addCriterion("\"POUNDAGE_TYPE\" not like", value, "poundageType");
            return (Criteria) this;
        }

        public Criteria andPoundageTypeIn(List<String> values) {
            addCriterion("\"POUNDAGE_TYPE\" in", values, "poundageType");
            return (Criteria) this;
        }

        public Criteria andPoundageTypeNotIn(List<String> values) {
            addCriterion("\"POUNDAGE_TYPE\" not in", values, "poundageType");
            return (Criteria) this;
        }

        public Criteria andPoundageTypeBetween(String value1, String value2) {
            addCriterion("\"POUNDAGE_TYPE\" between", value1, value2, "poundageType");
            return (Criteria) this;
        }

        public Criteria andPoundageTypeNotBetween(String value1, String value2) {
            addCriterion("\"POUNDAGE_TYPE\" not between", value1, value2, "poundageType");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("\"TIME\" is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("\"TIME\" is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("\"TIME\" =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("\"TIME\" <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("\"TIME\" >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("\"TIME\" >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("\"TIME\" <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("\"TIME\" <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("\"TIME\" in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("\"TIME\" not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("\"TIME\" between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("\"TIME\" not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andLocalaccountIsNull() {
            addCriterion("\"LOCALACCOUNT\" is null");
            return (Criteria) this;
        }

        public Criteria andLocalaccountIsNotNull() {
            addCriterion("\"LOCALACCOUNT\" is not null");
            return (Criteria) this;
        }

        public Criteria andLocalaccountEqualTo(String value) {
            addCriterion("\"LOCALACCOUNT\" =", value, "localaccount");
            return (Criteria) this;
        }

        public Criteria andLocalaccountNotEqualTo(String value) {
            addCriterion("\"LOCALACCOUNT\" <>", value, "localaccount");
            return (Criteria) this;
        }

        public Criteria andLocalaccountGreaterThan(String value) {
            addCriterion("\"LOCALACCOUNT\" >", value, "localaccount");
            return (Criteria) this;
        }

        public Criteria andLocalaccountGreaterThanOrEqualTo(String value) {
            addCriterion("\"LOCALACCOUNT\" >=", value, "localaccount");
            return (Criteria) this;
        }

        public Criteria andLocalaccountLessThan(String value) {
            addCriterion("\"LOCALACCOUNT\" <", value, "localaccount");
            return (Criteria) this;
        }

        public Criteria andLocalaccountLessThanOrEqualTo(String value) {
            addCriterion("\"LOCALACCOUNT\" <=", value, "localaccount");
            return (Criteria) this;
        }

        public Criteria andLocalaccountLike(String value) {
            addCriterion("\"LOCALACCOUNT\" like", value, "localaccount");
            return (Criteria) this;
        }

        public Criteria andLocalaccountNotLike(String value) {
            addCriterion("\"LOCALACCOUNT\" not like", value, "localaccount");
            return (Criteria) this;
        }

        public Criteria andLocalaccountIn(List<String> values) {
            addCriterion("\"LOCALACCOUNT\" in", values, "localaccount");
            return (Criteria) this;
        }

        public Criteria andLocalaccountNotIn(List<String> values) {
            addCriterion("\"LOCALACCOUNT\" not in", values, "localaccount");
            return (Criteria) this;
        }

        public Criteria andLocalaccountBetween(String value1, String value2) {
            addCriterion("\"LOCALACCOUNT\" between", value1, value2, "localaccount");
            return (Criteria) this;
        }

        public Criteria andLocalaccountNotBetween(String value1, String value2) {
            addCriterion("\"LOCALACCOUNT\" not between", value1, value2, "localaccount");
            return (Criteria) this;
        }

        public Criteria andBookaccountIsNull() {
            addCriterion("\"BOOKACCOUNT\" is null");
            return (Criteria) this;
        }

        public Criteria andBookaccountIsNotNull() {
            addCriterion("\"BOOKACCOUNT\" is not null");
            return (Criteria) this;
        }

        public Criteria andBookaccountEqualTo(String value) {
            addCriterion("\"BOOKACCOUNT\" =", value, "bookaccount");
            return (Criteria) this;
        }

        public Criteria andBookaccountNotEqualTo(String value) {
            addCriterion("\"BOOKACCOUNT\" <>", value, "bookaccount");
            return (Criteria) this;
        }

        public Criteria andBookaccountGreaterThan(String value) {
            addCriterion("\"BOOKACCOUNT\" >", value, "bookaccount");
            return (Criteria) this;
        }

        public Criteria andBookaccountGreaterThanOrEqualTo(String value) {
            addCriterion("\"BOOKACCOUNT\" >=", value, "bookaccount");
            return (Criteria) this;
        }

        public Criteria andBookaccountLessThan(String value) {
            addCriterion("\"BOOKACCOUNT\" <", value, "bookaccount");
            return (Criteria) this;
        }

        public Criteria andBookaccountLessThanOrEqualTo(String value) {
            addCriterion("\"BOOKACCOUNT\" <=", value, "bookaccount");
            return (Criteria) this;
        }

        public Criteria andBookaccountLike(String value) {
            addCriterion("\"BOOKACCOUNT\" like", value, "bookaccount");
            return (Criteria) this;
        }

        public Criteria andBookaccountNotLike(String value) {
            addCriterion("\"BOOKACCOUNT\" not like", value, "bookaccount");
            return (Criteria) this;
        }

        public Criteria andBookaccountIn(List<String> values) {
            addCriterion("\"BOOKACCOUNT\" in", values, "bookaccount");
            return (Criteria) this;
        }

        public Criteria andBookaccountNotIn(List<String> values) {
            addCriterion("\"BOOKACCOUNT\" not in", values, "bookaccount");
            return (Criteria) this;
        }

        public Criteria andBookaccountBetween(String value1, String value2) {
            addCriterion("\"BOOKACCOUNT\" between", value1, value2, "bookaccount");
            return (Criteria) this;
        }

        public Criteria andBookaccountNotBetween(String value1, String value2) {
            addCriterion("\"BOOKACCOUNT\" not between", value1, value2, "bookaccount");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNull() {
            addCriterion("\"PAYTYPE\" is null");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNotNull() {
            addCriterion("\"PAYTYPE\" is not null");
            return (Criteria) this;
        }

        public Criteria andPaytypeEqualTo(String value) {
            addCriterion("\"PAYTYPE\" =", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotEqualTo(String value) {
            addCriterion("\"PAYTYPE\" <>", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThan(String value) {
            addCriterion("\"PAYTYPE\" >", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThanOrEqualTo(String value) {
            addCriterion("\"PAYTYPE\" >=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThan(String value) {
            addCriterion("\"PAYTYPE\" <", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThanOrEqualTo(String value) {
            addCriterion("\"PAYTYPE\" <=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLike(String value) {
            addCriterion("\"PAYTYPE\" like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotLike(String value) {
            addCriterion("\"PAYTYPE\" not like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeIn(List<String> values) {
            addCriterion("\"PAYTYPE\" in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotIn(List<String> values) {
            addCriterion("\"PAYTYPE\" not in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeBetween(String value1, String value2) {
            addCriterion("\"PAYTYPE\" between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotBetween(String value1, String value2) {
            addCriterion("\"PAYTYPE\" not between", value1, value2, "paytype");
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