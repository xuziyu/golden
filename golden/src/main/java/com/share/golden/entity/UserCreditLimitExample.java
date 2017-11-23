package com.share.golden.entity;

import java.util.ArrayList;
import java.util.List;

public class UserCreditLimitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserCreditLimitExample() {
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

        public Criteria andLimitCodeIsNull() {
            addCriterion("\"LIMIT_CODE\" is null");
            return (Criteria) this;
        }

        public Criteria andLimitCodeIsNotNull() {
            addCriterion("\"LIMIT_CODE\" is not null");
            return (Criteria) this;
        }

        public Criteria andLimitCodeEqualTo(String value) {
            addCriterion("\"LIMIT_CODE\" =", value, "limitCode");
            return (Criteria) this;
        }

        public Criteria andLimitCodeNotEqualTo(String value) {
            addCriterion("\"LIMIT_CODE\" <>", value, "limitCode");
            return (Criteria) this;
        }

        public Criteria andLimitCodeGreaterThan(String value) {
            addCriterion("\"LIMIT_CODE\" >", value, "limitCode");
            return (Criteria) this;
        }

        public Criteria andLimitCodeGreaterThanOrEqualTo(String value) {
            addCriterion("\"LIMIT_CODE\" >=", value, "limitCode");
            return (Criteria) this;
        }

        public Criteria andLimitCodeLessThan(String value) {
            addCriterion("\"LIMIT_CODE\" <", value, "limitCode");
            return (Criteria) this;
        }

        public Criteria andLimitCodeLessThanOrEqualTo(String value) {
            addCriterion("\"LIMIT_CODE\" <=", value, "limitCode");
            return (Criteria) this;
        }

        public Criteria andLimitCodeLike(String value) {
            addCriterion("\"LIMIT_CODE\" like", value, "limitCode");
            return (Criteria) this;
        }

        public Criteria andLimitCodeNotLike(String value) {
            addCriterion("\"LIMIT_CODE\" not like", value, "limitCode");
            return (Criteria) this;
        }

        public Criteria andLimitCodeIn(List<String> values) {
            addCriterion("\"LIMIT_CODE\" in", values, "limitCode");
            return (Criteria) this;
        }

        public Criteria andLimitCodeNotIn(List<String> values) {
            addCriterion("\"LIMIT_CODE\" not in", values, "limitCode");
            return (Criteria) this;
        }

        public Criteria andLimitCodeBetween(String value1, String value2) {
            addCriterion("\"LIMIT_CODE\" between", value1, value2, "limitCode");
            return (Criteria) this;
        }

        public Criteria andLimitCodeNotBetween(String value1, String value2) {
            addCriterion("\"LIMIT_CODE\" not between", value1, value2, "limitCode");
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

        public Criteria andCreditLimitIsNull() {
            addCriterion("\"CREDIT_LIMIT\" is null");
            return (Criteria) this;
        }

        public Criteria andCreditLimitIsNotNull() {
            addCriterion("\"CREDIT_LIMIT\" is not null");
            return (Criteria) this;
        }

        public Criteria andCreditLimitEqualTo(String value) {
            addCriterion("\"CREDIT_LIMIT\" =", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitNotEqualTo(String value) {
            addCriterion("\"CREDIT_LIMIT\" <>", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitGreaterThan(String value) {
            addCriterion("\"CREDIT_LIMIT\" >", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitGreaterThanOrEqualTo(String value) {
            addCriterion("\"CREDIT_LIMIT\" >=", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitLessThan(String value) {
            addCriterion("\"CREDIT_LIMIT\" <", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitLessThanOrEqualTo(String value) {
            addCriterion("\"CREDIT_LIMIT\" <=", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitLike(String value) {
            addCriterion("\"CREDIT_LIMIT\" like", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitNotLike(String value) {
            addCriterion("\"CREDIT_LIMIT\" not like", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitIn(List<String> values) {
            addCriterion("\"CREDIT_LIMIT\" in", values, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitNotIn(List<String> values) {
            addCriterion("\"CREDIT_LIMIT\" not in", values, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitBetween(String value1, String value2) {
            addCriterion("\"CREDIT_LIMIT\" between", value1, value2, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitNotBetween(String value1, String value2) {
            addCriterion("\"CREDIT_LIMIT\" not between", value1, value2, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditGradeIsNull() {
            addCriterion("\"CREDIT_GRADE\" is null");
            return (Criteria) this;
        }

        public Criteria andCreditGradeIsNotNull() {
            addCriterion("\"CREDIT_GRADE\" is not null");
            return (Criteria) this;
        }

        public Criteria andCreditGradeEqualTo(String value) {
            addCriterion("\"CREDIT_GRADE\" =", value, "creditGrade");
            return (Criteria) this;
        }

        public Criteria andCreditGradeNotEqualTo(String value) {
            addCriterion("\"CREDIT_GRADE\" <>", value, "creditGrade");
            return (Criteria) this;
        }

        public Criteria andCreditGradeGreaterThan(String value) {
            addCriterion("\"CREDIT_GRADE\" >", value, "creditGrade");
            return (Criteria) this;
        }

        public Criteria andCreditGradeGreaterThanOrEqualTo(String value) {
            addCriterion("\"CREDIT_GRADE\" >=", value, "creditGrade");
            return (Criteria) this;
        }

        public Criteria andCreditGradeLessThan(String value) {
            addCriterion("\"CREDIT_GRADE\" <", value, "creditGrade");
            return (Criteria) this;
        }

        public Criteria andCreditGradeLessThanOrEqualTo(String value) {
            addCriterion("\"CREDIT_GRADE\" <=", value, "creditGrade");
            return (Criteria) this;
        }

        public Criteria andCreditGradeLike(String value) {
            addCriterion("\"CREDIT_GRADE\" like", value, "creditGrade");
            return (Criteria) this;
        }

        public Criteria andCreditGradeNotLike(String value) {
            addCriterion("\"CREDIT_GRADE\" not like", value, "creditGrade");
            return (Criteria) this;
        }

        public Criteria andCreditGradeIn(List<String> values) {
            addCriterion("\"CREDIT_GRADE\" in", values, "creditGrade");
            return (Criteria) this;
        }

        public Criteria andCreditGradeNotIn(List<String> values) {
            addCriterion("\"CREDIT_GRADE\" not in", values, "creditGrade");
            return (Criteria) this;
        }

        public Criteria andCreditGradeBetween(String value1, String value2) {
            addCriterion("\"CREDIT_GRADE\" between", value1, value2, "creditGrade");
            return (Criteria) this;
        }

        public Criteria andCreditGradeNotBetween(String value1, String value2) {
            addCriterion("\"CREDIT_GRADE\" not between", value1, value2, "creditGrade");
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