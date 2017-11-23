package com.share.golden.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysIdentityDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysIdentityDataExample() {
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

        public Criteria andIdentityNumIsNull() {
            addCriterion("\"IDENTITY_NUM\" is null");
            return (Criteria) this;
        }

        public Criteria andIdentityNumIsNotNull() {
            addCriterion("\"IDENTITY_NUM\" is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityNumEqualTo(String value) {
            addCriterion("\"IDENTITY_NUM\" =", value, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumNotEqualTo(String value) {
            addCriterion("\"IDENTITY_NUM\" <>", value, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumGreaterThan(String value) {
            addCriterion("\"IDENTITY_NUM\" >", value, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumGreaterThanOrEqualTo(String value) {
            addCriterion("\"IDENTITY_NUM\" >=", value, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumLessThan(String value) {
            addCriterion("\"IDENTITY_NUM\" <", value, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumLessThanOrEqualTo(String value) {
            addCriterion("\"IDENTITY_NUM\" <=", value, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumLike(String value) {
            addCriterion("\"IDENTITY_NUM\" like", value, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumNotLike(String value) {
            addCriterion("\"IDENTITY_NUM\" not like", value, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumIn(List<String> values) {
            addCriterion("\"IDENTITY_NUM\" in", values, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumNotIn(List<String> values) {
            addCriterion("\"IDENTITY_NUM\" not in", values, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumBetween(String value1, String value2) {
            addCriterion("\"IDENTITY_NUM\" between", value1, value2, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumNotBetween(String value1, String value2) {
            addCriterion("\"IDENTITY_NUM\" not between", value1, value2, "identityNum");
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

        public Criteria andPlaceOfDomicileIsNull() {
            addCriterion("\"PLACE_OF_DOMICILE\" is null");
            return (Criteria) this;
        }

        public Criteria andPlaceOfDomicileIsNotNull() {
            addCriterion("\"PLACE_OF_DOMICILE\" is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceOfDomicileEqualTo(String value) {
            addCriterion("\"PLACE_OF_DOMICILE\" =", value, "placeOfDomicile");
            return (Criteria) this;
        }

        public Criteria andPlaceOfDomicileNotEqualTo(String value) {
            addCriterion("\"PLACE_OF_DOMICILE\" <>", value, "placeOfDomicile");
            return (Criteria) this;
        }

        public Criteria andPlaceOfDomicileGreaterThan(String value) {
            addCriterion("\"PLACE_OF_DOMICILE\" >", value, "placeOfDomicile");
            return (Criteria) this;
        }

        public Criteria andPlaceOfDomicileGreaterThanOrEqualTo(String value) {
            addCriterion("\"PLACE_OF_DOMICILE\" >=", value, "placeOfDomicile");
            return (Criteria) this;
        }

        public Criteria andPlaceOfDomicileLessThan(String value) {
            addCriterion("\"PLACE_OF_DOMICILE\" <", value, "placeOfDomicile");
            return (Criteria) this;
        }

        public Criteria andPlaceOfDomicileLessThanOrEqualTo(String value) {
            addCriterion("\"PLACE_OF_DOMICILE\" <=", value, "placeOfDomicile");
            return (Criteria) this;
        }

        public Criteria andPlaceOfDomicileLike(String value) {
            addCriterion("\"PLACE_OF_DOMICILE\" like", value, "placeOfDomicile");
            return (Criteria) this;
        }

        public Criteria andPlaceOfDomicileNotLike(String value) {
            addCriterion("\"PLACE_OF_DOMICILE\" not like", value, "placeOfDomicile");
            return (Criteria) this;
        }

        public Criteria andPlaceOfDomicileIn(List<String> values) {
            addCriterion("\"PLACE_OF_DOMICILE\" in", values, "placeOfDomicile");
            return (Criteria) this;
        }

        public Criteria andPlaceOfDomicileNotIn(List<String> values) {
            addCriterion("\"PLACE_OF_DOMICILE\" not in", values, "placeOfDomicile");
            return (Criteria) this;
        }

        public Criteria andPlaceOfDomicileBetween(String value1, String value2) {
            addCriterion("\"PLACE_OF_DOMICILE\" between", value1, value2, "placeOfDomicile");
            return (Criteria) this;
        }

        public Criteria andPlaceOfDomicileNotBetween(String value1, String value2) {
            addCriterion("\"PLACE_OF_DOMICILE\" not between", value1, value2, "placeOfDomicile");
            return (Criteria) this;
        }

        public Criteria andBrithDateIsNull() {
            addCriterion("\"BRITH_DATE\" is null");
            return (Criteria) this;
        }

        public Criteria andBrithDateIsNotNull() {
            addCriterion("\"BRITH_DATE\" is not null");
            return (Criteria) this;
        }

        public Criteria andBrithDateEqualTo(Date value) {
            addCriterion("\"BRITH_DATE\" =", value, "brithDate");
            return (Criteria) this;
        }

        public Criteria andBrithDateNotEqualTo(Date value) {
            addCriterion("\"BRITH_DATE\" <>", value, "brithDate");
            return (Criteria) this;
        }

        public Criteria andBrithDateGreaterThan(Date value) {
            addCriterion("\"BRITH_DATE\" >", value, "brithDate");
            return (Criteria) this;
        }

        public Criteria andBrithDateGreaterThanOrEqualTo(Date value) {
            addCriterion("\"BRITH_DATE\" >=", value, "brithDate");
            return (Criteria) this;
        }

        public Criteria andBrithDateLessThan(Date value) {
            addCriterion("\"BRITH_DATE\" <", value, "brithDate");
            return (Criteria) this;
        }

        public Criteria andBrithDateLessThanOrEqualTo(Date value) {
            addCriterion("\"BRITH_DATE\" <=", value, "brithDate");
            return (Criteria) this;
        }

        public Criteria andBrithDateIn(List<Date> values) {
            addCriterion("\"BRITH_DATE\" in", values, "brithDate");
            return (Criteria) this;
        }

        public Criteria andBrithDateNotIn(List<Date> values) {
            addCriterion("\"BRITH_DATE\" not in", values, "brithDate");
            return (Criteria) this;
        }

        public Criteria andBrithDateBetween(Date value1, Date value2) {
            addCriterion("\"BRITH_DATE\" between", value1, value2, "brithDate");
            return (Criteria) this;
        }

        public Criteria andBrithDateNotBetween(Date value1, Date value2) {
            addCriterion("\"BRITH_DATE\" not between", value1, value2, "brithDate");
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