package com.share.golden.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserTelephoneExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserTelephoneExample() {
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

        public Criteria andTidIsNull() {
            addCriterion("\"TID\" is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("\"TID\" is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(String value) {
            addCriterion("\"TID\" =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(String value) {
            addCriterion("\"TID\" <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(String value) {
            addCriterion("\"TID\" >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(String value) {
            addCriterion("\"TID\" >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(String value) {
            addCriterion("\"TID\" <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(String value) {
            addCriterion("\"TID\" <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLike(String value) {
            addCriterion("\"TID\" like", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotLike(String value) {
            addCriterion("\"TID\" not like", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<String> values) {
            addCriterion("\"TID\" in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<String> values) {
            addCriterion("\"TID\" not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(String value1, String value2) {
            addCriterion("\"TID\" between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(String value1, String value2) {
            addCriterion("\"TID\" not between", value1, value2, "tid");
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

        public Criteria andTelephoneNumIsNull() {
            addCriterion("\"TELEPHONE_NUM\" is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumIsNotNull() {
            addCriterion("\"TELEPHONE_NUM\" is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumEqualTo(String value) {
            addCriterion("\"TELEPHONE_NUM\" =", value, "telephoneNum");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumNotEqualTo(String value) {
            addCriterion("\"TELEPHONE_NUM\" <>", value, "telephoneNum");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumGreaterThan(String value) {
            addCriterion("\"TELEPHONE_NUM\" >", value, "telephoneNum");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumGreaterThanOrEqualTo(String value) {
            addCriterion("\"TELEPHONE_NUM\" >=", value, "telephoneNum");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumLessThan(String value) {
            addCriterion("\"TELEPHONE_NUM\" <", value, "telephoneNum");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumLessThanOrEqualTo(String value) {
            addCriterion("\"TELEPHONE_NUM\" <=", value, "telephoneNum");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumLike(String value) {
            addCriterion("\"TELEPHONE_NUM\" like", value, "telephoneNum");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumNotLike(String value) {
            addCriterion("\"TELEPHONE_NUM\" not like", value, "telephoneNum");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumIn(List<String> values) {
            addCriterion("\"TELEPHONE_NUM\" in", values, "telephoneNum");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumNotIn(List<String> values) {
            addCriterion("\"TELEPHONE_NUM\" not in", values, "telephoneNum");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumBetween(String value1, String value2) {
            addCriterion("\"TELEPHONE_NUM\" between", value1, value2, "telephoneNum");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumNotBetween(String value1, String value2) {
            addCriterion("\"TELEPHONE_NUM\" not between", value1, value2, "telephoneNum");
            return (Criteria) this;
        }

        public Criteria andApproveDateIsNull() {
            addCriterion("\"APPROVE_DATE\" is null");
            return (Criteria) this;
        }

        public Criteria andApproveDateIsNotNull() {
            addCriterion("\"APPROVE_DATE\" is not null");
            return (Criteria) this;
        }

        public Criteria andApproveDateEqualTo(Date value) {
            addCriterion("\"APPROVE_DATE\" =", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateNotEqualTo(Date value) {
            addCriterion("\"APPROVE_DATE\" <>", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateGreaterThan(Date value) {
            addCriterion("\"APPROVE_DATE\" >", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateGreaterThanOrEqualTo(Date value) {
            addCriterion("\"APPROVE_DATE\" >=", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateLessThan(Date value) {
            addCriterion("\"APPROVE_DATE\" <", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateLessThanOrEqualTo(Date value) {
            addCriterion("\"APPROVE_DATE\" <=", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateIn(List<Date> values) {
            addCriterion("\"APPROVE_DATE\" in", values, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateNotIn(List<Date> values) {
            addCriterion("\"APPROVE_DATE\" not in", values, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateBetween(Date value1, Date value2) {
            addCriterion("\"APPROVE_DATE\" between", value1, value2, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateNotBetween(Date value1, Date value2) {
            addCriterion("\"APPROVE_DATE\" not between", value1, value2, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveStateIsNull() {
            addCriterion("\"APPROVE_STATE\" is null");
            return (Criteria) this;
        }

        public Criteria andApproveStateIsNotNull() {
            addCriterion("\"APPROVE_STATE\" is not null");
            return (Criteria) this;
        }

        public Criteria andApproveStateEqualTo(String value) {
            addCriterion("\"APPROVE_STATE\" =", value, "approveState");
            return (Criteria) this;
        }

        public Criteria andApproveStateNotEqualTo(String value) {
            addCriterion("\"APPROVE_STATE\" <>", value, "approveState");
            return (Criteria) this;
        }

        public Criteria andApproveStateGreaterThan(String value) {
            addCriterion("\"APPROVE_STATE\" >", value, "approveState");
            return (Criteria) this;
        }

        public Criteria andApproveStateGreaterThanOrEqualTo(String value) {
            addCriterion("\"APPROVE_STATE\" >=", value, "approveState");
            return (Criteria) this;
        }

        public Criteria andApproveStateLessThan(String value) {
            addCriterion("\"APPROVE_STATE\" <", value, "approveState");
            return (Criteria) this;
        }

        public Criteria andApproveStateLessThanOrEqualTo(String value) {
            addCriterion("\"APPROVE_STATE\" <=", value, "approveState");
            return (Criteria) this;
        }

        public Criteria andApproveStateLike(String value) {
            addCriterion("\"APPROVE_STATE\" like", value, "approveState");
            return (Criteria) this;
        }

        public Criteria andApproveStateNotLike(String value) {
            addCriterion("\"APPROVE_STATE\" not like", value, "approveState");
            return (Criteria) this;
        }

        public Criteria andApproveStateIn(List<String> values) {
            addCriterion("\"APPROVE_STATE\" in", values, "approveState");
            return (Criteria) this;
        }

        public Criteria andApproveStateNotIn(List<String> values) {
            addCriterion("\"APPROVE_STATE\" not in", values, "approveState");
            return (Criteria) this;
        }

        public Criteria andApproveStateBetween(String value1, String value2) {
            addCriterion("\"APPROVE_STATE\" between", value1, value2, "approveState");
            return (Criteria) this;
        }

        public Criteria andApproveStateNotBetween(String value1, String value2) {
            addCriterion("\"APPROVE_STATE\" not between", value1, value2, "approveState");
            return (Criteria) this;
        }

        public Criteria andValidIsNull() {
            addCriterion("\"VALID\" is null");
            return (Criteria) this;
        }

        public Criteria andValidIsNotNull() {
            addCriterion("\"VALID\" is not null");
            return (Criteria) this;
        }

        public Criteria andValidEqualTo(String value) {
            addCriterion("\"VALID\" =", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotEqualTo(String value) {
            addCriterion("\"VALID\" <>", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThan(String value) {
            addCriterion("\"VALID\" >", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThanOrEqualTo(String value) {
            addCriterion("\"VALID\" >=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThan(String value) {
            addCriterion("\"VALID\" <", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThanOrEqualTo(String value) {
            addCriterion("\"VALID\" <=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLike(String value) {
            addCriterion("\"VALID\" like", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotLike(String value) {
            addCriterion("\"VALID\" not like", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidIn(List<String> values) {
            addCriterion("\"VALID\" in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotIn(List<String> values) {
            addCriterion("\"VALID\" not in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidBetween(String value1, String value2) {
            addCriterion("\"VALID\" between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotBetween(String value1, String value2) {
            addCriterion("\"VALID\" not between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNull() {
            addCriterion("\"AUDITOR\" is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNotNull() {
            addCriterion("\"AUDITOR\" is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorEqualTo(String value) {
            addCriterion("\"AUDITOR\" =", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotEqualTo(String value) {
            addCriterion("\"AUDITOR\" <>", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThan(String value) {
            addCriterion("\"AUDITOR\" >", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("\"AUDITOR\" >=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThan(String value) {
            addCriterion("\"AUDITOR\" <", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThanOrEqualTo(String value) {
            addCriterion("\"AUDITOR\" <=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLike(String value) {
            addCriterion("\"AUDITOR\" like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotLike(String value) {
            addCriterion("\"AUDITOR\" not like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIn(List<String> values) {
            addCriterion("\"AUDITOR\" in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotIn(List<String> values) {
            addCriterion("\"AUDITOR\" not in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorBetween(String value1, String value2) {
            addCriterion("\"AUDITOR\" between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotBetween(String value1, String value2) {
            addCriterion("\"AUDITOR\" not between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIdIsNull() {
            addCriterion("\"AUDITOR_ID\" is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIdIsNotNull() {
            addCriterion("\"AUDITOR_ID\" is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorIdEqualTo(String value) {
            addCriterion("\"AUDITOR_ID\" =", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdNotEqualTo(String value) {
            addCriterion("\"AUDITOR_ID\" <>", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdGreaterThan(String value) {
            addCriterion("\"AUDITOR_ID\" >", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdGreaterThanOrEqualTo(String value) {
            addCriterion("\"AUDITOR_ID\" >=", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdLessThan(String value) {
            addCriterion("\"AUDITOR_ID\" <", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdLessThanOrEqualTo(String value) {
            addCriterion("\"AUDITOR_ID\" <=", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdLike(String value) {
            addCriterion("\"AUDITOR_ID\" like", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdNotLike(String value) {
            addCriterion("\"AUDITOR_ID\" not like", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdIn(List<String> values) {
            addCriterion("\"AUDITOR_ID\" in", values, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdNotIn(List<String> values) {
            addCriterion("\"AUDITOR_ID\" not in", values, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdBetween(String value1, String value2) {
            addCriterion("\"AUDITOR_ID\" between", value1, value2, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdNotBetween(String value1, String value2) {
            addCriterion("\"AUDITOR_ID\" not between", value1, value2, "auditorId");
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