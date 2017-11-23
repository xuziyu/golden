package com.share.golden.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserMaterialCertificationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserMaterialCertificationExample() {
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

        public Criteria andMateriaIdIsNull() {
            addCriterion("\"MATERIA_ID\" is null");
            return (Criteria) this;
        }

        public Criteria andMateriaIdIsNotNull() {
            addCriterion("\"MATERIA_ID\" is not null");
            return (Criteria) this;
        }

        public Criteria andMateriaIdEqualTo(String value) {
            addCriterion("\"MATERIA_ID\" =", value, "materiaId");
            return (Criteria) this;
        }

        public Criteria andMateriaIdNotEqualTo(String value) {
            addCriterion("\"MATERIA_ID\" <>", value, "materiaId");
            return (Criteria) this;
        }

        public Criteria andMateriaIdGreaterThan(String value) {
            addCriterion("\"MATERIA_ID\" >", value, "materiaId");
            return (Criteria) this;
        }

        public Criteria andMateriaIdGreaterThanOrEqualTo(String value) {
            addCriterion("\"MATERIA_ID\" >=", value, "materiaId");
            return (Criteria) this;
        }

        public Criteria andMateriaIdLessThan(String value) {
            addCriterion("\"MATERIA_ID\" <", value, "materiaId");
            return (Criteria) this;
        }

        public Criteria andMateriaIdLessThanOrEqualTo(String value) {
            addCriterion("\"MATERIA_ID\" <=", value, "materiaId");
            return (Criteria) this;
        }

        public Criteria andMateriaIdLike(String value) {
            addCriterion("\"MATERIA_ID\" like", value, "materiaId");
            return (Criteria) this;
        }

        public Criteria andMateriaIdNotLike(String value) {
            addCriterion("\"MATERIA_ID\" not like", value, "materiaId");
            return (Criteria) this;
        }

        public Criteria andMateriaIdIn(List<String> values) {
            addCriterion("\"MATERIA_ID\" in", values, "materiaId");
            return (Criteria) this;
        }

        public Criteria andMateriaIdNotIn(List<String> values) {
            addCriterion("\"MATERIA_ID\" not in", values, "materiaId");
            return (Criteria) this;
        }

        public Criteria andMateriaIdBetween(String value1, String value2) {
            addCriterion("\"MATERIA_ID\" between", value1, value2, "materiaId");
            return (Criteria) this;
        }

        public Criteria andMateriaIdNotBetween(String value1, String value2) {
            addCriterion("\"MATERIA_ID\" not between", value1, value2, "materiaId");
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

        public Criteria andMateriaTypeIsNull() {
            addCriterion("\"MATERIA_TYPE\" is null");
            return (Criteria) this;
        }

        public Criteria andMateriaTypeIsNotNull() {
            addCriterion("\"MATERIA_TYPE\" is not null");
            return (Criteria) this;
        }

        public Criteria andMateriaTypeEqualTo(String value) {
            addCriterion("\"MATERIA_TYPE\" =", value, "materiaType");
            return (Criteria) this;
        }

        public Criteria andMateriaTypeNotEqualTo(String value) {
            addCriterion("\"MATERIA_TYPE\" <>", value, "materiaType");
            return (Criteria) this;
        }

        public Criteria andMateriaTypeGreaterThan(String value) {
            addCriterion("\"MATERIA_TYPE\" >", value, "materiaType");
            return (Criteria) this;
        }

        public Criteria andMateriaTypeGreaterThanOrEqualTo(String value) {
            addCriterion("\"MATERIA_TYPE\" >=", value, "materiaType");
            return (Criteria) this;
        }

        public Criteria andMateriaTypeLessThan(String value) {
            addCriterion("\"MATERIA_TYPE\" <", value, "materiaType");
            return (Criteria) this;
        }

        public Criteria andMateriaTypeLessThanOrEqualTo(String value) {
            addCriterion("\"MATERIA_TYPE\" <=", value, "materiaType");
            return (Criteria) this;
        }

        public Criteria andMateriaTypeLike(String value) {
            addCriterion("\"MATERIA_TYPE\" like", value, "materiaType");
            return (Criteria) this;
        }

        public Criteria andMateriaTypeNotLike(String value) {
            addCriterion("\"MATERIA_TYPE\" not like", value, "materiaType");
            return (Criteria) this;
        }

        public Criteria andMateriaTypeIn(List<String> values) {
            addCriterion("\"MATERIA_TYPE\" in", values, "materiaType");
            return (Criteria) this;
        }

        public Criteria andMateriaTypeNotIn(List<String> values) {
            addCriterion("\"MATERIA_TYPE\" not in", values, "materiaType");
            return (Criteria) this;
        }

        public Criteria andMateriaTypeBetween(String value1, String value2) {
            addCriterion("\"MATERIA_TYPE\" between", value1, value2, "materiaType");
            return (Criteria) this;
        }

        public Criteria andMateriaTypeNotBetween(String value1, String value2) {
            addCriterion("\"MATERIA_TYPE\" not between", value1, value2, "materiaType");
            return (Criteria) this;
        }

        public Criteria andMateriaIsNull() {
            addCriterion("\"MATERIA\" is null");
            return (Criteria) this;
        }

        public Criteria andMateriaIsNotNull() {
            addCriterion("\"MATERIA\" is not null");
            return (Criteria) this;
        }

        public Criteria andMateriaEqualTo(String value) {
            addCriterion("\"MATERIA\" =", value, "materia");
            return (Criteria) this;
        }

        public Criteria andMateriaNotEqualTo(String value) {
            addCriterion("\"MATERIA\" <>", value, "materia");
            return (Criteria) this;
        }

        public Criteria andMateriaGreaterThan(String value) {
            addCriterion("\"MATERIA\" >", value, "materia");
            return (Criteria) this;
        }

        public Criteria andMateriaGreaterThanOrEqualTo(String value) {
            addCriterion("\"MATERIA\" >=", value, "materia");
            return (Criteria) this;
        }

        public Criteria andMateriaLessThan(String value) {
            addCriterion("\"MATERIA\" <", value, "materia");
            return (Criteria) this;
        }

        public Criteria andMateriaLessThanOrEqualTo(String value) {
            addCriterion("\"MATERIA\" <=", value, "materia");
            return (Criteria) this;
        }

        public Criteria andMateriaLike(String value) {
            addCriterion("\"MATERIA\" like", value, "materia");
            return (Criteria) this;
        }

        public Criteria andMateriaNotLike(String value) {
            addCriterion("\"MATERIA\" not like", value, "materia");
            return (Criteria) this;
        }

        public Criteria andMateriaIn(List<String> values) {
            addCriterion("\"MATERIA\" in", values, "materia");
            return (Criteria) this;
        }

        public Criteria andMateriaNotIn(List<String> values) {
            addCriterion("\"MATERIA\" not in", values, "materia");
            return (Criteria) this;
        }

        public Criteria andMateriaBetween(String value1, String value2) {
            addCriterion("\"MATERIA\" between", value1, value2, "materia");
            return (Criteria) this;
        }

        public Criteria andMateriaNotBetween(String value1, String value2) {
            addCriterion("\"MATERIA\" not between", value1, value2, "materia");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("\"CREATE_DATE\" is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("\"CREATE_DATE\" is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("\"CREATE_DATE\" =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("\"CREATE_DATE\" <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("\"CREATE_DATE\" >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("\"CREATE_DATE\" >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("\"CREATE_DATE\" <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("\"CREATE_DATE\" <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("\"CREATE_DATE\" in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("\"CREATE_DATE\" not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("\"CREATE_DATE\" between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("\"CREATE_DATE\" not between", value1, value2, "createDate");
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