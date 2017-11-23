package com.share.golden.entity;

import java.util.ArrayList;
import java.util.List;

public class SysPhoneDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysPhoneDataExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("\"ID\" is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("\"ID\" is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("\"ID\" =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("\"ID\" <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("\"ID\" >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("\"ID\" >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("\"ID\" <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("\"ID\" <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("\"ID\" like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("\"ID\" not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("\"ID\" in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("\"ID\" not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("\"ID\" between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("\"ID\" not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTeleNumIsNull() {
            addCriterion("\"TELE_NUM\" is null");
            return (Criteria) this;
        }

        public Criteria andTeleNumIsNotNull() {
            addCriterion("\"TELE_NUM\" is not null");
            return (Criteria) this;
        }

        public Criteria andTeleNumEqualTo(String value) {
            addCriterion("\"TELE_NUM\" =", value, "teleNum");
            return (Criteria) this;
        }

        public Criteria andTeleNumNotEqualTo(String value) {
            addCriterion("\"TELE_NUM\" <>", value, "teleNum");
            return (Criteria) this;
        }

        public Criteria andTeleNumGreaterThan(String value) {
            addCriterion("\"TELE_NUM\" >", value, "teleNum");
            return (Criteria) this;
        }

        public Criteria andTeleNumGreaterThanOrEqualTo(String value) {
            addCriterion("\"TELE_NUM\" >=", value, "teleNum");
            return (Criteria) this;
        }

        public Criteria andTeleNumLessThan(String value) {
            addCriterion("\"TELE_NUM\" <", value, "teleNum");
            return (Criteria) this;
        }

        public Criteria andTeleNumLessThanOrEqualTo(String value) {
            addCriterion("\"TELE_NUM\" <=", value, "teleNum");
            return (Criteria) this;
        }

        public Criteria andTeleNumLike(String value) {
            addCriterion("\"TELE_NUM\" like", value, "teleNum");
            return (Criteria) this;
        }

        public Criteria andTeleNumNotLike(String value) {
            addCriterion("\"TELE_NUM\" not like", value, "teleNum");
            return (Criteria) this;
        }

        public Criteria andTeleNumIn(List<String> values) {
            addCriterion("\"TELE_NUM\" in", values, "teleNum");
            return (Criteria) this;
        }

        public Criteria andTeleNumNotIn(List<String> values) {
            addCriterion("\"TELE_NUM\" not in", values, "teleNum");
            return (Criteria) this;
        }

        public Criteria andTeleNumBetween(String value1, String value2) {
            addCriterion("\"TELE_NUM\" between", value1, value2, "teleNum");
            return (Criteria) this;
        }

        public Criteria andTeleNumNotBetween(String value1, String value2) {
            addCriterion("\"TELE_NUM\" not between", value1, value2, "teleNum");
            return (Criteria) this;
        }

        public Criteria andTrueNameIsNull() {
            addCriterion("\"TRUE_NAME\" is null");
            return (Criteria) this;
        }

        public Criteria andTrueNameIsNotNull() {
            addCriterion("\"TRUE_NAME\" is not null");
            return (Criteria) this;
        }

        public Criteria andTrueNameEqualTo(String value) {
            addCriterion("\"TRUE_NAME\" =", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameNotEqualTo(String value) {
            addCriterion("\"TRUE_NAME\" <>", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameGreaterThan(String value) {
            addCriterion("\"TRUE_NAME\" >", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameGreaterThanOrEqualTo(String value) {
            addCriterion("\"TRUE_NAME\" >=", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameLessThan(String value) {
            addCriterion("\"TRUE_NAME\" <", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameLessThanOrEqualTo(String value) {
            addCriterion("\"TRUE_NAME\" <=", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameLike(String value) {
            addCriterion("\"TRUE_NAME\" like", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameNotLike(String value) {
            addCriterion("\"TRUE_NAME\" not like", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameIn(List<String> values) {
            addCriterion("\"TRUE_NAME\" in", values, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameNotIn(List<String> values) {
            addCriterion("\"TRUE_NAME\" not in", values, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameBetween(String value1, String value2) {
            addCriterion("\"TRUE_NAME\" between", value1, value2, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameNotBetween(String value1, String value2) {
            addCriterion("\"TRUE_NAME\" not between", value1, value2, "trueName");
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