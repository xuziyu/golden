package com.share.golden.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BasTenderInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BasTenderInformationExample() {
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

        public Criteria andTenderIdIsNull() {
            addCriterion("\"TENDER_ID\" is null");
            return (Criteria) this;
        }

        public Criteria andTenderIdIsNotNull() {
            addCriterion("\"TENDER_ID\" is not null");
            return (Criteria) this;
        }

        public Criteria andTenderIdEqualTo(String value) {
            addCriterion("\"TENDER_ID\" =", value, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdNotEqualTo(String value) {
            addCriterion("\"TENDER_ID\" <>", value, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdGreaterThan(String value) {
            addCriterion("\"TENDER_ID\" >", value, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdGreaterThanOrEqualTo(String value) {
            addCriterion("\"TENDER_ID\" >=", value, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdLessThan(String value) {
            addCriterion("\"TENDER_ID\" <", value, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdLessThanOrEqualTo(String value) {
            addCriterion("\"TENDER_ID\" <=", value, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdLike(String value) {
            addCriterion("\"TENDER_ID\" like", value, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdNotLike(String value) {
            addCriterion("\"TENDER_ID\" not like", value, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdIn(List<String> values) {
            addCriterion("\"TENDER_ID\" in", values, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdNotIn(List<String> values) {
            addCriterion("\"TENDER_ID\" not in", values, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdBetween(String value1, String value2) {
            addCriterion("\"TENDER_ID\" between", value1, value2, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdNotBetween(String value1, String value2) {
            addCriterion("\"TENDER_ID\" not between", value1, value2, "tenderId");
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

        public Criteria andMarkcountIsNull() {
            addCriterion("\"MARKCOUNT\" is null");
            return (Criteria) this;
        }

        public Criteria andMarkcountIsNotNull() {
            addCriterion("\"MARKCOUNT\" is not null");
            return (Criteria) this;
        }

        public Criteria andMarkcountEqualTo(String value) {
            addCriterion("\"MARKCOUNT\" =", value, "markcount");
            return (Criteria) this;
        }

        public Criteria andMarkcountNotEqualTo(String value) {
            addCriterion("\"MARKCOUNT\" <>", value, "markcount");
            return (Criteria) this;
        }

        public Criteria andMarkcountGreaterThan(String value) {
            addCriterion("\"MARKCOUNT\" >", value, "markcount");
            return (Criteria) this;
        }

        public Criteria andMarkcountGreaterThanOrEqualTo(String value) {
            addCriterion("\"MARKCOUNT\" >=", value, "markcount");
            return (Criteria) this;
        }

        public Criteria andMarkcountLessThan(String value) {
            addCriterion("\"MARKCOUNT\" <", value, "markcount");
            return (Criteria) this;
        }

        public Criteria andMarkcountLessThanOrEqualTo(String value) {
            addCriterion("\"MARKCOUNT\" <=", value, "markcount");
            return (Criteria) this;
        }

        public Criteria andMarkcountLike(String value) {
            addCriterion("\"MARKCOUNT\" like", value, "markcount");
            return (Criteria) this;
        }

        public Criteria andMarkcountNotLike(String value) {
            addCriterion("\"MARKCOUNT\" not like", value, "markcount");
            return (Criteria) this;
        }

        public Criteria andMarkcountIn(List<String> values) {
            addCriterion("\"MARKCOUNT\" in", values, "markcount");
            return (Criteria) this;
        }

        public Criteria andMarkcountNotIn(List<String> values) {
            addCriterion("\"MARKCOUNT\" not in", values, "markcount");
            return (Criteria) this;
        }

        public Criteria andMarkcountBetween(String value1, String value2) {
            addCriterion("\"MARKCOUNT\" between", value1, value2, "markcount");
            return (Criteria) this;
        }

        public Criteria andMarkcountNotBetween(String value1, String value2) {
            addCriterion("\"MARKCOUNT\" not between", value1, value2, "markcount");
            return (Criteria) this;
        }

        public Criteria andLmcountIsNull() {
            addCriterion("\"LMCOUNT\" is null");
            return (Criteria) this;
        }

        public Criteria andLmcountIsNotNull() {
            addCriterion("\"LMCOUNT\" is not null");
            return (Criteria) this;
        }

        public Criteria andLmcountEqualTo(String value) {
            addCriterion("\"LMCOUNT\" =", value, "lmcount");
            return (Criteria) this;
        }

        public Criteria andLmcountNotEqualTo(String value) {
            addCriterion("\"LMCOUNT\" <>", value, "lmcount");
            return (Criteria) this;
        }

        public Criteria andLmcountGreaterThan(String value) {
            addCriterion("\"LMCOUNT\" >", value, "lmcount");
            return (Criteria) this;
        }

        public Criteria andLmcountGreaterThanOrEqualTo(String value) {
            addCriterion("\"LMCOUNT\" >=", value, "lmcount");
            return (Criteria) this;
        }

        public Criteria andLmcountLessThan(String value) {
            addCriterion("\"LMCOUNT\" <", value, "lmcount");
            return (Criteria) this;
        }

        public Criteria andLmcountLessThanOrEqualTo(String value) {
            addCriterion("\"LMCOUNT\" <=", value, "lmcount");
            return (Criteria) this;
        }

        public Criteria andLmcountLike(String value) {
            addCriterion("\"LMCOUNT\" like", value, "lmcount");
            return (Criteria) this;
        }

        public Criteria andLmcountNotLike(String value) {
            addCriterion("\"LMCOUNT\" not like", value, "lmcount");
            return (Criteria) this;
        }

        public Criteria andLmcountIn(List<String> values) {
            addCriterion("\"LMCOUNT\" in", values, "lmcount");
            return (Criteria) this;
        }

        public Criteria andLmcountNotIn(List<String> values) {
            addCriterion("\"LMCOUNT\" not in", values, "lmcount");
            return (Criteria) this;
        }

        public Criteria andLmcountBetween(String value1, String value2) {
            addCriterion("\"LMCOUNT\" between", value1, value2, "lmcount");
            return (Criteria) this;
        }

        public Criteria andLmcountNotBetween(String value1, String value2) {
            addCriterion("\"LMCOUNT\" not between", value1, value2, "lmcount");
            return (Criteria) this;
        }

        public Criteria andGmcountIsNull() {
            addCriterion("\"GMCOUNT\" is null");
            return (Criteria) this;
        }

        public Criteria andGmcountIsNotNull() {
            addCriterion("\"GMCOUNT\" is not null");
            return (Criteria) this;
        }

        public Criteria andGmcountEqualTo(String value) {
            addCriterion("\"GMCOUNT\" =", value, "gmcount");
            return (Criteria) this;
        }

        public Criteria andGmcountNotEqualTo(String value) {
            addCriterion("\"GMCOUNT\" <>", value, "gmcount");
            return (Criteria) this;
        }

        public Criteria andGmcountGreaterThan(String value) {
            addCriterion("\"GMCOUNT\" >", value, "gmcount");
            return (Criteria) this;
        }

        public Criteria andGmcountGreaterThanOrEqualTo(String value) {
            addCriterion("\"GMCOUNT\" >=", value, "gmcount");
            return (Criteria) this;
        }

        public Criteria andGmcountLessThan(String value) {
            addCriterion("\"GMCOUNT\" <", value, "gmcount");
            return (Criteria) this;
        }

        public Criteria andGmcountLessThanOrEqualTo(String value) {
            addCriterion("\"GMCOUNT\" <=", value, "gmcount");
            return (Criteria) this;
        }

        public Criteria andGmcountLike(String value) {
            addCriterion("\"GMCOUNT\" like", value, "gmcount");
            return (Criteria) this;
        }

        public Criteria andGmcountNotLike(String value) {
            addCriterion("\"GMCOUNT\" not like", value, "gmcount");
            return (Criteria) this;
        }

        public Criteria andGmcountIn(List<String> values) {
            addCriterion("\"GMCOUNT\" in", values, "gmcount");
            return (Criteria) this;
        }

        public Criteria andGmcountNotIn(List<String> values) {
            addCriterion("\"GMCOUNT\" not in", values, "gmcount");
            return (Criteria) this;
        }

        public Criteria andGmcountBetween(String value1, String value2) {
            addCriterion("\"GMCOUNT\" between", value1, value2, "gmcount");
            return (Criteria) this;
        }

        public Criteria andGmcountNotBetween(String value1, String value2) {
            addCriterion("\"GMCOUNT\" not between", value1, value2, "gmcount");
            return (Criteria) this;
        }

        public Criteria andMarkmoneyIsNull() {
            addCriterion("\"MARKMONEY\" is null");
            return (Criteria) this;
        }

        public Criteria andMarkmoneyIsNotNull() {
            addCriterion("\"MARKMONEY\" is not null");
            return (Criteria) this;
        }

        public Criteria andMarkmoneyEqualTo(BigDecimal value) {
            addCriterion("\"MARKMONEY\" =", value, "markmoney");
            return (Criteria) this;
        }

        public Criteria andMarkmoneyNotEqualTo(BigDecimal value) {
            addCriterion("\"MARKMONEY\" <>", value, "markmoney");
            return (Criteria) this;
        }

        public Criteria andMarkmoneyGreaterThan(BigDecimal value) {
            addCriterion("\"MARKMONEY\" >", value, "markmoney");
            return (Criteria) this;
        }

        public Criteria andMarkmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("\"MARKMONEY\" >=", value, "markmoney");
            return (Criteria) this;
        }

        public Criteria andMarkmoneyLessThan(BigDecimal value) {
            addCriterion("\"MARKMONEY\" <", value, "markmoney");
            return (Criteria) this;
        }

        public Criteria andMarkmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("\"MARKMONEY\" <=", value, "markmoney");
            return (Criteria) this;
        }

        public Criteria andMarkmoneyIn(List<BigDecimal> values) {
            addCriterion("\"MARKMONEY\" in", values, "markmoney");
            return (Criteria) this;
        }

        public Criteria andMarkmoneyNotIn(List<BigDecimal> values) {
            addCriterion("\"MARKMONEY\" not in", values, "markmoney");
            return (Criteria) this;
        }

        public Criteria andMarkmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("\"MARKMONEY\" between", value1, value2, "markmoney");
            return (Criteria) this;
        }

        public Criteria andMarkmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("\"MARKMONEY\" not between", value1, value2, "markmoney");
            return (Criteria) this;
        }

        public Criteria andMarkgainIsNull() {
            addCriterion("\"MARKGAIN\" is null");
            return (Criteria) this;
        }

        public Criteria andMarkgainIsNotNull() {
            addCriterion("\"MARKGAIN\" is not null");
            return (Criteria) this;
        }

        public Criteria andMarkgainEqualTo(BigDecimal value) {
            addCriterion("\"MARKGAIN\" =", value, "markgain");
            return (Criteria) this;
        }

        public Criteria andMarkgainNotEqualTo(BigDecimal value) {
            addCriterion("\"MARKGAIN\" <>", value, "markgain");
            return (Criteria) this;
        }

        public Criteria andMarkgainGreaterThan(BigDecimal value) {
            addCriterion("\"MARKGAIN\" >", value, "markgain");
            return (Criteria) this;
        }

        public Criteria andMarkgainGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("\"MARKGAIN\" >=", value, "markgain");
            return (Criteria) this;
        }

        public Criteria andMarkgainLessThan(BigDecimal value) {
            addCriterion("\"MARKGAIN\" <", value, "markgain");
            return (Criteria) this;
        }

        public Criteria andMarkgainLessThanOrEqualTo(BigDecimal value) {
            addCriterion("\"MARKGAIN\" <=", value, "markgain");
            return (Criteria) this;
        }

        public Criteria andMarkgainIn(List<BigDecimal> values) {
            addCriterion("\"MARKGAIN\" in", values, "markgain");
            return (Criteria) this;
        }

        public Criteria andMarkgainNotIn(List<BigDecimal> values) {
            addCriterion("\"MARKGAIN\" not in", values, "markgain");
            return (Criteria) this;
        }

        public Criteria andMarkgainBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("\"MARKGAIN\" between", value1, value2, "markgain");
            return (Criteria) this;
        }

        public Criteria andMarkgainNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("\"MARKGAIN\" not between", value1, value2, "markgain");
            return (Criteria) this;
        }

        public Criteria andMarkbegindateIsNull() {
            addCriterion("\"MARKBEGINDATE\" is null");
            return (Criteria) this;
        }

        public Criteria andMarkbegindateIsNotNull() {
            addCriterion("\"MARKBEGINDATE\" is not null");
            return (Criteria) this;
        }

        public Criteria andMarkbegindateEqualTo(Date value) {
            addCriterion("\"MARKBEGINDATE\" =", value, "markbegindate");
            return (Criteria) this;
        }

        public Criteria andMarkbegindateNotEqualTo(Date value) {
            addCriterion("\"MARKBEGINDATE\" <>", value, "markbegindate");
            return (Criteria) this;
        }

        public Criteria andMarkbegindateGreaterThan(Date value) {
            addCriterion("\"MARKBEGINDATE\" >", value, "markbegindate");
            return (Criteria) this;
        }

        public Criteria andMarkbegindateGreaterThanOrEqualTo(Date value) {
            addCriterion("\"MARKBEGINDATE\" >=", value, "markbegindate");
            return (Criteria) this;
        }

        public Criteria andMarkbegindateLessThan(Date value) {
            addCriterion("\"MARKBEGINDATE\" <", value, "markbegindate");
            return (Criteria) this;
        }

        public Criteria andMarkbegindateLessThanOrEqualTo(Date value) {
            addCriterion("\"MARKBEGINDATE\" <=", value, "markbegindate");
            return (Criteria) this;
        }

        public Criteria andMarkbegindateIn(List<Date> values) {
            addCriterion("\"MARKBEGINDATE\" in", values, "markbegindate");
            return (Criteria) this;
        }

        public Criteria andMarkbegindateNotIn(List<Date> values) {
            addCriterion("\"MARKBEGINDATE\" not in", values, "markbegindate");
            return (Criteria) this;
        }

        public Criteria andMarkbegindateBetween(Date value1, Date value2) {
            addCriterion("\"MARKBEGINDATE\" between", value1, value2, "markbegindate");
            return (Criteria) this;
        }

        public Criteria andMarkbegindateNotBetween(Date value1, Date value2) {
            addCriterion("\"MARKBEGINDATE\" not between", value1, value2, "markbegindate");
            return (Criteria) this;
        }

        public Criteria andMarkenddateIsNull() {
            addCriterion("\"MARKENDDATE\" is null");
            return (Criteria) this;
        }

        public Criteria andMarkenddateIsNotNull() {
            addCriterion("\"MARKENDDATE\" is not null");
            return (Criteria) this;
        }

        public Criteria andMarkenddateEqualTo(Date value) {
            addCriterion("\"MARKENDDATE\" =", value, "markenddate");
            return (Criteria) this;
        }

        public Criteria andMarkenddateNotEqualTo(Date value) {
            addCriterion("\"MARKENDDATE\" <>", value, "markenddate");
            return (Criteria) this;
        }

        public Criteria andMarkenddateGreaterThan(Date value) {
            addCriterion("\"MARKENDDATE\" >", value, "markenddate");
            return (Criteria) this;
        }

        public Criteria andMarkenddateGreaterThanOrEqualTo(Date value) {
            addCriterion("\"MARKENDDATE\" >=", value, "markenddate");
            return (Criteria) this;
        }

        public Criteria andMarkenddateLessThan(Date value) {
            addCriterion("\"MARKENDDATE\" <", value, "markenddate");
            return (Criteria) this;
        }

        public Criteria andMarkenddateLessThanOrEqualTo(Date value) {
            addCriterion("\"MARKENDDATE\" <=", value, "markenddate");
            return (Criteria) this;
        }

        public Criteria andMarkenddateIn(List<Date> values) {
            addCriterion("\"MARKENDDATE\" in", values, "markenddate");
            return (Criteria) this;
        }

        public Criteria andMarkenddateNotIn(List<Date> values) {
            addCriterion("\"MARKENDDATE\" not in", values, "markenddate");
            return (Criteria) this;
        }

        public Criteria andMarkenddateBetween(Date value1, Date value2) {
            addCriterion("\"MARKENDDATE\" between", value1, value2, "markenddate");
            return (Criteria) this;
        }

        public Criteria andMarkenddateNotBetween(Date value1, Date value2) {
            addCriterion("\"MARKENDDATE\" not between", value1, value2, "markenddate");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("\"DATE\" is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("\"DATE\" is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("\"DATE\" =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("\"DATE\" <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("\"DATE\" >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("\"DATE\" >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("\"DATE\" <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("\"DATE\" <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("\"DATE\" in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("\"DATE\" not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("\"DATE\" between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("\"DATE\" not between", value1, value2, "date");
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