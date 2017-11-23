package com.share.golden.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysDepartmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysDepartmentExample() {
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

        public Criteria andDepartmentIdIsNull() {
            addCriterion("\"DEPARTMENT_ID\" is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("\"DEPARTMENT_ID\" is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(String value) {
            addCriterion("\"DEPARTMENT_ID\" =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(String value) {
            addCriterion("\"DEPARTMENT_ID\" <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(String value) {
            addCriterion("\"DEPARTMENT_ID\" >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("\"DEPARTMENT_ID\" >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(String value) {
            addCriterion("\"DEPARTMENT_ID\" <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(String value) {
            addCriterion("\"DEPARTMENT_ID\" <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLike(String value) {
            addCriterion("\"DEPARTMENT_ID\" like", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotLike(String value) {
            addCriterion("\"DEPARTMENT_ID\" not like", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<String> values) {
            addCriterion("\"DEPARTMENT_ID\" in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<String> values) {
            addCriterion("\"DEPARTMENT_ID\" not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(String value1, String value2) {
            addCriterion("\"DEPARTMENT_ID\" between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(String value1, String value2) {
            addCriterion("\"DEPARTMENT_ID\" not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andParentDepartmentIdIsNull() {
            addCriterion("\"PARENT_DEPARTMENT_ID\" is null");
            return (Criteria) this;
        }

        public Criteria andParentDepartmentIdIsNotNull() {
            addCriterion("\"PARENT_DEPARTMENT_ID\" is not null");
            return (Criteria) this;
        }

        public Criteria andParentDepartmentIdEqualTo(String value) {
            addCriterion("\"PARENT_DEPARTMENT_ID\" =", value, "parentDepartmentId");
            return (Criteria) this;
        }

        public Criteria andParentDepartmentIdNotEqualTo(String value) {
            addCriterion("\"PARENT_DEPARTMENT_ID\" <>", value, "parentDepartmentId");
            return (Criteria) this;
        }

        public Criteria andParentDepartmentIdGreaterThan(String value) {
            addCriterion("\"PARENT_DEPARTMENT_ID\" >", value, "parentDepartmentId");
            return (Criteria) this;
        }

        public Criteria andParentDepartmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("\"PARENT_DEPARTMENT_ID\" >=", value, "parentDepartmentId");
            return (Criteria) this;
        }

        public Criteria andParentDepartmentIdLessThan(String value) {
            addCriterion("\"PARENT_DEPARTMENT_ID\" <", value, "parentDepartmentId");
            return (Criteria) this;
        }

        public Criteria andParentDepartmentIdLessThanOrEqualTo(String value) {
            addCriterion("\"PARENT_DEPARTMENT_ID\" <=", value, "parentDepartmentId");
            return (Criteria) this;
        }

        public Criteria andParentDepartmentIdLike(String value) {
            addCriterion("\"PARENT_DEPARTMENT_ID\" like", value, "parentDepartmentId");
            return (Criteria) this;
        }

        public Criteria andParentDepartmentIdNotLike(String value) {
            addCriterion("\"PARENT_DEPARTMENT_ID\" not like", value, "parentDepartmentId");
            return (Criteria) this;
        }

        public Criteria andParentDepartmentIdIn(List<String> values) {
            addCriterion("\"PARENT_DEPARTMENT_ID\" in", values, "parentDepartmentId");
            return (Criteria) this;
        }

        public Criteria andParentDepartmentIdNotIn(List<String> values) {
            addCriterion("\"PARENT_DEPARTMENT_ID\" not in", values, "parentDepartmentId");
            return (Criteria) this;
        }

        public Criteria andParentDepartmentIdBetween(String value1, String value2) {
            addCriterion("\"PARENT_DEPARTMENT_ID\" between", value1, value2, "parentDepartmentId");
            return (Criteria) this;
        }

        public Criteria andParentDepartmentIdNotBetween(String value1, String value2) {
            addCriterion("\"PARENT_DEPARTMENT_ID\" not between", value1, value2, "parentDepartmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNull() {
            addCriterion("\"DEPARTMENT_NAME\" is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNotNull() {
            addCriterion("\"DEPARTMENT_NAME\" is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameEqualTo(String value) {
            addCriterion("\"DEPARTMENT_NAME\" =", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotEqualTo(String value) {
            addCriterion("\"DEPARTMENT_NAME\" <>", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThan(String value) {
            addCriterion("\"DEPARTMENT_NAME\" >", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("\"DEPARTMENT_NAME\" >=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThan(String value) {
            addCriterion("\"DEPARTMENT_NAME\" <", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThanOrEqualTo(String value) {
            addCriterion("\"DEPARTMENT_NAME\" <=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLike(String value) {
            addCriterion("\"DEPARTMENT_NAME\" like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotLike(String value) {
            addCriterion("\"DEPARTMENT_NAME\" not like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIn(List<String> values) {
            addCriterion("\"DEPARTMENT_NAME\" in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotIn(List<String> values) {
            addCriterion("\"DEPARTMENT_NAME\" not in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameBetween(String value1, String value2) {
            addCriterion("\"DEPARTMENT_NAME\" between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotBetween(String value1, String value2) {
            addCriterion("\"DEPARTMENT_NAME\" not between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentTimeIsNull() {
            addCriterion("\"DEPARTMENT_TIME\" is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentTimeIsNotNull() {
            addCriterion("\"DEPARTMENT_TIME\" is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentTimeEqualTo(Date value) {
            addCriterion("\"DEPARTMENT_TIME\" =", value, "departmentTime");
            return (Criteria) this;
        }

        public Criteria andDepartmentTimeNotEqualTo(Date value) {
            addCriterion("\"DEPARTMENT_TIME\" <>", value, "departmentTime");
            return (Criteria) this;
        }

        public Criteria andDepartmentTimeGreaterThan(Date value) {
            addCriterion("\"DEPARTMENT_TIME\" >", value, "departmentTime");
            return (Criteria) this;
        }

        public Criteria andDepartmentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("\"DEPARTMENT_TIME\" >=", value, "departmentTime");
            return (Criteria) this;
        }

        public Criteria andDepartmentTimeLessThan(Date value) {
            addCriterion("\"DEPARTMENT_TIME\" <", value, "departmentTime");
            return (Criteria) this;
        }

        public Criteria andDepartmentTimeLessThanOrEqualTo(Date value) {
            addCriterion("\"DEPARTMENT_TIME\" <=", value, "departmentTime");
            return (Criteria) this;
        }

        public Criteria andDepartmentTimeIn(List<Date> values) {
            addCriterion("\"DEPARTMENT_TIME\" in", values, "departmentTime");
            return (Criteria) this;
        }

        public Criteria andDepartmentTimeNotIn(List<Date> values) {
            addCriterion("\"DEPARTMENT_TIME\" not in", values, "departmentTime");
            return (Criteria) this;
        }

        public Criteria andDepartmentTimeBetween(Date value1, Date value2) {
            addCriterion("\"DEPARTMENT_TIME\" between", value1, value2, "departmentTime");
            return (Criteria) this;
        }

        public Criteria andDepartmentTimeNotBetween(Date value1, Date value2) {
            addCriterion("\"DEPARTMENT_TIME\" not between", value1, value2, "departmentTime");
            return (Criteria) this;
        }

        public Criteria andDepartmentStatusIsNull() {
            addCriterion("\"DEPARTMENT_STATUS\" is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentStatusIsNotNull() {
            addCriterion("\"DEPARTMENT_STATUS\" is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentStatusEqualTo(String value) {
            addCriterion("\"DEPARTMENT_STATUS\" =", value, "departmentStatus");
            return (Criteria) this;
        }

        public Criteria andDepartmentStatusNotEqualTo(String value) {
            addCriterion("\"DEPARTMENT_STATUS\" <>", value, "departmentStatus");
            return (Criteria) this;
        }

        public Criteria andDepartmentStatusGreaterThan(String value) {
            addCriterion("\"DEPARTMENT_STATUS\" >", value, "departmentStatus");
            return (Criteria) this;
        }

        public Criteria andDepartmentStatusGreaterThanOrEqualTo(String value) {
            addCriterion("\"DEPARTMENT_STATUS\" >=", value, "departmentStatus");
            return (Criteria) this;
        }

        public Criteria andDepartmentStatusLessThan(String value) {
            addCriterion("\"DEPARTMENT_STATUS\" <", value, "departmentStatus");
            return (Criteria) this;
        }

        public Criteria andDepartmentStatusLessThanOrEqualTo(String value) {
            addCriterion("\"DEPARTMENT_STATUS\" <=", value, "departmentStatus");
            return (Criteria) this;
        }

        public Criteria andDepartmentStatusLike(String value) {
            addCriterion("\"DEPARTMENT_STATUS\" like", value, "departmentStatus");
            return (Criteria) this;
        }

        public Criteria andDepartmentStatusNotLike(String value) {
            addCriterion("\"DEPARTMENT_STATUS\" not like", value, "departmentStatus");
            return (Criteria) this;
        }

        public Criteria andDepartmentStatusIn(List<String> values) {
            addCriterion("\"DEPARTMENT_STATUS\" in", values, "departmentStatus");
            return (Criteria) this;
        }

        public Criteria andDepartmentStatusNotIn(List<String> values) {
            addCriterion("\"DEPARTMENT_STATUS\" not in", values, "departmentStatus");
            return (Criteria) this;
        }

        public Criteria andDepartmentStatusBetween(String value1, String value2) {
            addCriterion("\"DEPARTMENT_STATUS\" between", value1, value2, "departmentStatus");
            return (Criteria) this;
        }

        public Criteria andDepartmentStatusNotBetween(String value1, String value2) {
            addCriterion("\"DEPARTMENT_STATUS\" not between", value1, value2, "departmentStatus");
            return (Criteria) this;
        }

        public Criteria andDepartmentEscribesIsNull() {
            addCriterion("\"DEPARTMENT_ESCRIBES\" is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEscribesIsNotNull() {
            addCriterion("\"DEPARTMENT_ESCRIBES\" is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEscribesEqualTo(String value) {
            addCriterion("\"DEPARTMENT_ESCRIBES\" =", value, "departmentEscribes");
            return (Criteria) this;
        }

        public Criteria andDepartmentEscribesNotEqualTo(String value) {
            addCriterion("\"DEPARTMENT_ESCRIBES\" <>", value, "departmentEscribes");
            return (Criteria) this;
        }

        public Criteria andDepartmentEscribesGreaterThan(String value) {
            addCriterion("\"DEPARTMENT_ESCRIBES\" >", value, "departmentEscribes");
            return (Criteria) this;
        }

        public Criteria andDepartmentEscribesGreaterThanOrEqualTo(String value) {
            addCriterion("\"DEPARTMENT_ESCRIBES\" >=", value, "departmentEscribes");
            return (Criteria) this;
        }

        public Criteria andDepartmentEscribesLessThan(String value) {
            addCriterion("\"DEPARTMENT_ESCRIBES\" <", value, "departmentEscribes");
            return (Criteria) this;
        }

        public Criteria andDepartmentEscribesLessThanOrEqualTo(String value) {
            addCriterion("\"DEPARTMENT_ESCRIBES\" <=", value, "departmentEscribes");
            return (Criteria) this;
        }

        public Criteria andDepartmentEscribesLike(String value) {
            addCriterion("\"DEPARTMENT_ESCRIBES\" like", value, "departmentEscribes");
            return (Criteria) this;
        }

        public Criteria andDepartmentEscribesNotLike(String value) {
            addCriterion("\"DEPARTMENT_ESCRIBES\" not like", value, "departmentEscribes");
            return (Criteria) this;
        }

        public Criteria andDepartmentEscribesIn(List<String> values) {
            addCriterion("\"DEPARTMENT_ESCRIBES\" in", values, "departmentEscribes");
            return (Criteria) this;
        }

        public Criteria andDepartmentEscribesNotIn(List<String> values) {
            addCriterion("\"DEPARTMENT_ESCRIBES\" not in", values, "departmentEscribes");
            return (Criteria) this;
        }

        public Criteria andDepartmentEscribesBetween(String value1, String value2) {
            addCriterion("\"DEPARTMENT_ESCRIBES\" between", value1, value2, "departmentEscribes");
            return (Criteria) this;
        }

        public Criteria andDepartmentEscribesNotBetween(String value1, String value2) {
            addCriterion("\"DEPARTMENT_ESCRIBES\" not between", value1, value2, "departmentEscribes");
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