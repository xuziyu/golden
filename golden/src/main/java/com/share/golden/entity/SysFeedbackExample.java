package com.share.golden.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysFeedbackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysFeedbackExample() {
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

        public Criteria andFeedbackIdIsNull() {
            addCriterion("\"FEEDBACK_ID\" is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdIsNotNull() {
            addCriterion("\"FEEDBACK_ID\" is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdEqualTo(String value) {
            addCriterion("\"FEEDBACK_ID\" =", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdNotEqualTo(String value) {
            addCriterion("\"FEEDBACK_ID\" <>", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdGreaterThan(String value) {
            addCriterion("\"FEEDBACK_ID\" >", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdGreaterThanOrEqualTo(String value) {
            addCriterion("\"FEEDBACK_ID\" >=", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdLessThan(String value) {
            addCriterion("\"FEEDBACK_ID\" <", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdLessThanOrEqualTo(String value) {
            addCriterion("\"FEEDBACK_ID\" <=", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdLike(String value) {
            addCriterion("\"FEEDBACK_ID\" like", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdNotLike(String value) {
            addCriterion("\"FEEDBACK_ID\" not like", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdIn(List<String> values) {
            addCriterion("\"FEEDBACK_ID\" in", values, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdNotIn(List<String> values) {
            addCriterion("\"FEEDBACK_ID\" not in", values, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdBetween(String value1, String value2) {
            addCriterion("\"FEEDBACK_ID\" between", value1, value2, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdNotBetween(String value1, String value2) {
            addCriterion("\"FEEDBACK_ID\" not between", value1, value2, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackNameIsNull() {
            addCriterion("\"FEEDBACK_NAME\" is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackNameIsNotNull() {
            addCriterion("\"FEEDBACK_NAME\" is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackNameEqualTo(String value) {
            addCriterion("\"FEEDBACK_NAME\" =", value, "feedbackName");
            return (Criteria) this;
        }

        public Criteria andFeedbackNameNotEqualTo(String value) {
            addCriterion("\"FEEDBACK_NAME\" <>", value, "feedbackName");
            return (Criteria) this;
        }

        public Criteria andFeedbackNameGreaterThan(String value) {
            addCriterion("\"FEEDBACK_NAME\" >", value, "feedbackName");
            return (Criteria) this;
        }

        public Criteria andFeedbackNameGreaterThanOrEqualTo(String value) {
            addCriterion("\"FEEDBACK_NAME\" >=", value, "feedbackName");
            return (Criteria) this;
        }

        public Criteria andFeedbackNameLessThan(String value) {
            addCriterion("\"FEEDBACK_NAME\" <", value, "feedbackName");
            return (Criteria) this;
        }

        public Criteria andFeedbackNameLessThanOrEqualTo(String value) {
            addCriterion("\"FEEDBACK_NAME\" <=", value, "feedbackName");
            return (Criteria) this;
        }

        public Criteria andFeedbackNameLike(String value) {
            addCriterion("\"FEEDBACK_NAME\" like", value, "feedbackName");
            return (Criteria) this;
        }

        public Criteria andFeedbackNameNotLike(String value) {
            addCriterion("\"FEEDBACK_NAME\" not like", value, "feedbackName");
            return (Criteria) this;
        }

        public Criteria andFeedbackNameIn(List<String> values) {
            addCriterion("\"FEEDBACK_NAME\" in", values, "feedbackName");
            return (Criteria) this;
        }

        public Criteria andFeedbackNameNotIn(List<String> values) {
            addCriterion("\"FEEDBACK_NAME\" not in", values, "feedbackName");
            return (Criteria) this;
        }

        public Criteria andFeedbackNameBetween(String value1, String value2) {
            addCriterion("\"FEEDBACK_NAME\" between", value1, value2, "feedbackName");
            return (Criteria) this;
        }

        public Criteria andFeedbackNameNotBetween(String value1, String value2) {
            addCriterion("\"FEEDBACK_NAME\" not between", value1, value2, "feedbackName");
            return (Criteria) this;
        }

        public Criteria andFeedbackConentIsNull() {
            addCriterion("\"FEEDBACK_CONENT\" is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackConentIsNotNull() {
            addCriterion("\"FEEDBACK_CONENT\" is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackConentEqualTo(String value) {
            addCriterion("\"FEEDBACK_CONENT\" =", value, "feedbackConent");
            return (Criteria) this;
        }

        public Criteria andFeedbackConentNotEqualTo(String value) {
            addCriterion("\"FEEDBACK_CONENT\" <>", value, "feedbackConent");
            return (Criteria) this;
        }

        public Criteria andFeedbackConentGreaterThan(String value) {
            addCriterion("\"FEEDBACK_CONENT\" >", value, "feedbackConent");
            return (Criteria) this;
        }

        public Criteria andFeedbackConentGreaterThanOrEqualTo(String value) {
            addCriterion("\"FEEDBACK_CONENT\" >=", value, "feedbackConent");
            return (Criteria) this;
        }

        public Criteria andFeedbackConentLessThan(String value) {
            addCriterion("\"FEEDBACK_CONENT\" <", value, "feedbackConent");
            return (Criteria) this;
        }

        public Criteria andFeedbackConentLessThanOrEqualTo(String value) {
            addCriterion("\"FEEDBACK_CONENT\" <=", value, "feedbackConent");
            return (Criteria) this;
        }

        public Criteria andFeedbackConentLike(String value) {
            addCriterion("\"FEEDBACK_CONENT\" like", value, "feedbackConent");
            return (Criteria) this;
        }

        public Criteria andFeedbackConentNotLike(String value) {
            addCriterion("\"FEEDBACK_CONENT\" not like", value, "feedbackConent");
            return (Criteria) this;
        }

        public Criteria andFeedbackConentIn(List<String> values) {
            addCriterion("\"FEEDBACK_CONENT\" in", values, "feedbackConent");
            return (Criteria) this;
        }

        public Criteria andFeedbackConentNotIn(List<String> values) {
            addCriterion("\"FEEDBACK_CONENT\" not in", values, "feedbackConent");
            return (Criteria) this;
        }

        public Criteria andFeedbackConentBetween(String value1, String value2) {
            addCriterion("\"FEEDBACK_CONENT\" between", value1, value2, "feedbackConent");
            return (Criteria) this;
        }

        public Criteria andFeedbackConentNotBetween(String value1, String value2) {
            addCriterion("\"FEEDBACK_CONENT\" not between", value1, value2, "feedbackConent");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeIsNull() {
            addCriterion("\"FEEDBACK_TIME\" is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeIsNotNull() {
            addCriterion("\"FEEDBACK_TIME\" is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeEqualTo(Date value) {
            addCriterion("\"FEEDBACK_TIME\" =", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeNotEqualTo(Date value) {
            addCriterion("\"FEEDBACK_TIME\" <>", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeGreaterThan(Date value) {
            addCriterion("\"FEEDBACK_TIME\" >", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("\"FEEDBACK_TIME\" >=", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeLessThan(Date value) {
            addCriterion("\"FEEDBACK_TIME\" <", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeLessThanOrEqualTo(Date value) {
            addCriterion("\"FEEDBACK_TIME\" <=", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeIn(List<Date> values) {
            addCriterion("\"FEEDBACK_TIME\" in", values, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeNotIn(List<Date> values) {
            addCriterion("\"FEEDBACK_TIME\" not in", values, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeBetween(Date value1, Date value2) {
            addCriterion("\"FEEDBACK_TIME\" between", value1, value2, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeNotBetween(Date value1, Date value2) {
            addCriterion("\"FEEDBACK_TIME\" not between", value1, value2, "feedbackTime");
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