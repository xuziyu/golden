package com.share.golden.entity;

import java.util.ArrayList;
import java.util.List;

public class UserContactExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserContactExample() {
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

        public Criteria andContactIdIsNull() {
            addCriterion("\"CONTACT_ID\" is null");
            return (Criteria) this;
        }

        public Criteria andContactIdIsNotNull() {
            addCriterion("\"CONTACT_ID\" is not null");
            return (Criteria) this;
        }

        public Criteria andContactIdEqualTo(String value) {
            addCriterion("\"CONTACT_ID\" =", value, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdNotEqualTo(String value) {
            addCriterion("\"CONTACT_ID\" <>", value, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdGreaterThan(String value) {
            addCriterion("\"CONTACT_ID\" >", value, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdGreaterThanOrEqualTo(String value) {
            addCriterion("\"CONTACT_ID\" >=", value, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdLessThan(String value) {
            addCriterion("\"CONTACT_ID\" <", value, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdLessThanOrEqualTo(String value) {
            addCriterion("\"CONTACT_ID\" <=", value, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdLike(String value) {
            addCriterion("\"CONTACT_ID\" like", value, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdNotLike(String value) {
            addCriterion("\"CONTACT_ID\" not like", value, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdIn(List<String> values) {
            addCriterion("\"CONTACT_ID\" in", values, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdNotIn(List<String> values) {
            addCriterion("\"CONTACT_ID\" not in", values, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdBetween(String value1, String value2) {
            addCriterion("\"CONTACT_ID\" between", value1, value2, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdNotBetween(String value1, String value2) {
            addCriterion("\"CONTACT_ID\" not between", value1, value2, "contactId");
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

        public Criteria andContactTypeIsNull() {
            addCriterion("\"CONTACT_TYPE\" is null");
            return (Criteria) this;
        }

        public Criteria andContactTypeIsNotNull() {
            addCriterion("\"CONTACT_TYPE\" is not null");
            return (Criteria) this;
        }

        public Criteria andContactTypeEqualTo(String value) {
            addCriterion("\"CONTACT_TYPE\" =", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeNotEqualTo(String value) {
            addCriterion("\"CONTACT_TYPE\" <>", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeGreaterThan(String value) {
            addCriterion("\"CONTACT_TYPE\" >", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeGreaterThanOrEqualTo(String value) {
            addCriterion("\"CONTACT_TYPE\" >=", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeLessThan(String value) {
            addCriterion("\"CONTACT_TYPE\" <", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeLessThanOrEqualTo(String value) {
            addCriterion("\"CONTACT_TYPE\" <=", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeLike(String value) {
            addCriterion("\"CONTACT_TYPE\" like", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeNotLike(String value) {
            addCriterion("\"CONTACT_TYPE\" not like", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeIn(List<String> values) {
            addCriterion("\"CONTACT_TYPE\" in", values, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeNotIn(List<String> values) {
            addCriterion("\"CONTACT_TYPE\" not in", values, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeBetween(String value1, String value2) {
            addCriterion("\"CONTACT_TYPE\" between", value1, value2, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeNotBetween(String value1, String value2) {
            addCriterion("\"CONTACT_TYPE\" not between", value1, value2, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactPeopleIsNull() {
            addCriterion("\"CONTACT_PEOPLE\" is null");
            return (Criteria) this;
        }

        public Criteria andContactPeopleIsNotNull() {
            addCriterion("\"CONTACT_PEOPLE\" is not null");
            return (Criteria) this;
        }

        public Criteria andContactPeopleEqualTo(String value) {
            addCriterion("\"CONTACT_PEOPLE\" =", value, "contactPeople");
            return (Criteria) this;
        }

        public Criteria andContactPeopleNotEqualTo(String value) {
            addCriterion("\"CONTACT_PEOPLE\" <>", value, "contactPeople");
            return (Criteria) this;
        }

        public Criteria andContactPeopleGreaterThan(String value) {
            addCriterion("\"CONTACT_PEOPLE\" >", value, "contactPeople");
            return (Criteria) this;
        }

        public Criteria andContactPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("\"CONTACT_PEOPLE\" >=", value, "contactPeople");
            return (Criteria) this;
        }

        public Criteria andContactPeopleLessThan(String value) {
            addCriterion("\"CONTACT_PEOPLE\" <", value, "contactPeople");
            return (Criteria) this;
        }

        public Criteria andContactPeopleLessThanOrEqualTo(String value) {
            addCriterion("\"CONTACT_PEOPLE\" <=", value, "contactPeople");
            return (Criteria) this;
        }

        public Criteria andContactPeopleLike(String value) {
            addCriterion("\"CONTACT_PEOPLE\" like", value, "contactPeople");
            return (Criteria) this;
        }

        public Criteria andContactPeopleNotLike(String value) {
            addCriterion("\"CONTACT_PEOPLE\" not like", value, "contactPeople");
            return (Criteria) this;
        }

        public Criteria andContactPeopleIn(List<String> values) {
            addCriterion("\"CONTACT_PEOPLE\" in", values, "contactPeople");
            return (Criteria) this;
        }

        public Criteria andContactPeopleNotIn(List<String> values) {
            addCriterion("\"CONTACT_PEOPLE\" not in", values, "contactPeople");
            return (Criteria) this;
        }

        public Criteria andContactPeopleBetween(String value1, String value2) {
            addCriterion("\"CONTACT_PEOPLE\" between", value1, value2, "contactPeople");
            return (Criteria) this;
        }

        public Criteria andContactPeopleNotBetween(String value1, String value2) {
            addCriterion("\"CONTACT_PEOPLE\" not between", value1, value2, "contactPeople");
            return (Criteria) this;
        }

        public Criteria andTelphoneNumberIsNull() {
            addCriterion("\"TELPHONE_NUMBER\" is null");
            return (Criteria) this;
        }

        public Criteria andTelphoneNumberIsNotNull() {
            addCriterion("\"TELPHONE_NUMBER\" is not null");
            return (Criteria) this;
        }

        public Criteria andTelphoneNumberEqualTo(String value) {
            addCriterion("\"TELPHONE_NUMBER\" =", value, "telphoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelphoneNumberNotEqualTo(String value) {
            addCriterion("\"TELPHONE_NUMBER\" <>", value, "telphoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelphoneNumberGreaterThan(String value) {
            addCriterion("\"TELPHONE_NUMBER\" >", value, "telphoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelphoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("\"TELPHONE_NUMBER\" >=", value, "telphoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelphoneNumberLessThan(String value) {
            addCriterion("\"TELPHONE_NUMBER\" <", value, "telphoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelphoneNumberLessThanOrEqualTo(String value) {
            addCriterion("\"TELPHONE_NUMBER\" <=", value, "telphoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelphoneNumberLike(String value) {
            addCriterion("\"TELPHONE_NUMBER\" like", value, "telphoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelphoneNumberNotLike(String value) {
            addCriterion("\"TELPHONE_NUMBER\" not like", value, "telphoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelphoneNumberIn(List<String> values) {
            addCriterion("\"TELPHONE_NUMBER\" in", values, "telphoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelphoneNumberNotIn(List<String> values) {
            addCriterion("\"TELPHONE_NUMBER\" not in", values, "telphoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelphoneNumberBetween(String value1, String value2) {
            addCriterion("\"TELPHONE_NUMBER\" between", value1, value2, "telphoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelphoneNumberNotBetween(String value1, String value2) {
            addCriterion("\"TELPHONE_NUMBER\" not between", value1, value2, "telphoneNumber");
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