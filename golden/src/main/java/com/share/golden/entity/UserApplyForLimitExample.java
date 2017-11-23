package com.share.golden.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserApplyForLimitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserApplyForLimitExample() {
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

        public Criteria andApplyCodeIsNull() {
            addCriterion("\"APPLY_CODE\" is null");
            return (Criteria) this;
        }

        public Criteria andApplyCodeIsNotNull() {
            addCriterion("\"APPLY_CODE\" is not null");
            return (Criteria) this;
        }

        public Criteria andApplyCodeEqualTo(String value) {
            addCriterion("\"APPLY_CODE\" =", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeNotEqualTo(String value) {
            addCriterion("\"APPLY_CODE\" <>", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeGreaterThan(String value) {
            addCriterion("\"APPLY_CODE\" >", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("\"APPLY_CODE\" >=", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeLessThan(String value) {
            addCriterion("\"APPLY_CODE\" <", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeLessThanOrEqualTo(String value) {
            addCriterion("\"APPLY_CODE\" <=", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeLike(String value) {
            addCriterion("\"APPLY_CODE\" like", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeNotLike(String value) {
            addCriterion("\"APPLY_CODE\" not like", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeIn(List<String> values) {
            addCriterion("\"APPLY_CODE\" in", values, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeNotIn(List<String> values) {
            addCriterion("\"APPLY_CODE\" not in", values, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeBetween(String value1, String value2) {
            addCriterion("\"APPLY_CODE\" between", value1, value2, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeNotBetween(String value1, String value2) {
            addCriterion("\"APPLY_CODE\" not between", value1, value2, "applyCode");
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

        public Criteria andOriginalCreditIsNull() {
            addCriterion("\"ORIGINAL_CREDIT\" is null");
            return (Criteria) this;
        }

        public Criteria andOriginalCreditIsNotNull() {
            addCriterion("\"ORIGINAL_CREDIT\" is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalCreditEqualTo(BigDecimal value) {
            addCriterion("\"ORIGINAL_CREDIT\" =", value, "originalCredit");
            return (Criteria) this;
        }

        public Criteria andOriginalCreditNotEqualTo(BigDecimal value) {
            addCriterion("\"ORIGINAL_CREDIT\" <>", value, "originalCredit");
            return (Criteria) this;
        }

        public Criteria andOriginalCreditGreaterThan(BigDecimal value) {
            addCriterion("\"ORIGINAL_CREDIT\" >", value, "originalCredit");
            return (Criteria) this;
        }

        public Criteria andOriginalCreditGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("\"ORIGINAL_CREDIT\" >=", value, "originalCredit");
            return (Criteria) this;
        }

        public Criteria andOriginalCreditLessThan(BigDecimal value) {
            addCriterion("\"ORIGINAL_CREDIT\" <", value, "originalCredit");
            return (Criteria) this;
        }

        public Criteria andOriginalCreditLessThanOrEqualTo(BigDecimal value) {
            addCriterion("\"ORIGINAL_CREDIT\" <=", value, "originalCredit");
            return (Criteria) this;
        }

        public Criteria andOriginalCreditIn(List<BigDecimal> values) {
            addCriterion("\"ORIGINAL_CREDIT\" in", values, "originalCredit");
            return (Criteria) this;
        }

        public Criteria andOriginalCreditNotIn(List<BigDecimal> values) {
            addCriterion("\"ORIGINAL_CREDIT\" not in", values, "originalCredit");
            return (Criteria) this;
        }

        public Criteria andOriginalCreditBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("\"ORIGINAL_CREDIT\" between", value1, value2, "originalCredit");
            return (Criteria) this;
        }

        public Criteria andOriginalCreditNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("\"ORIGINAL_CREDIT\" not between", value1, value2, "originalCredit");
            return (Criteria) this;
        }

        public Criteria andHouseOfPropertyIsNull() {
            addCriterion("\"HOUSE_OF_PROPERTY\" is null");
            return (Criteria) this;
        }

        public Criteria andHouseOfPropertyIsNotNull() {
            addCriterion("\"HOUSE_OF_PROPERTY\" is not null");
            return (Criteria) this;
        }

        public Criteria andHouseOfPropertyEqualTo(String value) {
            addCriterion("\"HOUSE_OF_PROPERTY\" =", value, "houseOfProperty");
            return (Criteria) this;
        }

        public Criteria andHouseOfPropertyNotEqualTo(String value) {
            addCriterion("\"HOUSE_OF_PROPERTY\" <>", value, "houseOfProperty");
            return (Criteria) this;
        }

        public Criteria andHouseOfPropertyGreaterThan(String value) {
            addCriterion("\"HOUSE_OF_PROPERTY\" >", value, "houseOfProperty");
            return (Criteria) this;
        }

        public Criteria andHouseOfPropertyGreaterThanOrEqualTo(String value) {
            addCriterion("\"HOUSE_OF_PROPERTY\" >=", value, "houseOfProperty");
            return (Criteria) this;
        }

        public Criteria andHouseOfPropertyLessThan(String value) {
            addCriterion("\"HOUSE_OF_PROPERTY\" <", value, "houseOfProperty");
            return (Criteria) this;
        }

        public Criteria andHouseOfPropertyLessThanOrEqualTo(String value) {
            addCriterion("\"HOUSE_OF_PROPERTY\" <=", value, "houseOfProperty");
            return (Criteria) this;
        }

        public Criteria andHouseOfPropertyLike(String value) {
            addCriterion("\"HOUSE_OF_PROPERTY\" like", value, "houseOfProperty");
            return (Criteria) this;
        }

        public Criteria andHouseOfPropertyNotLike(String value) {
            addCriterion("\"HOUSE_OF_PROPERTY\" not like", value, "houseOfProperty");
            return (Criteria) this;
        }

        public Criteria andHouseOfPropertyIn(List<String> values) {
            addCriterion("\"HOUSE_OF_PROPERTY\" in", values, "houseOfProperty");
            return (Criteria) this;
        }

        public Criteria andHouseOfPropertyNotIn(List<String> values) {
            addCriterion("\"HOUSE_OF_PROPERTY\" not in", values, "houseOfProperty");
            return (Criteria) this;
        }

        public Criteria andHouseOfPropertyBetween(String value1, String value2) {
            addCriterion("\"HOUSE_OF_PROPERTY\" between", value1, value2, "houseOfProperty");
            return (Criteria) this;
        }

        public Criteria andHouseOfPropertyNotBetween(String value1, String value2) {
            addCriterion("\"HOUSE_OF_PROPERTY\" not between", value1, value2, "houseOfProperty");
            return (Criteria) this;
        }

        public Criteria andApplyLimitIsNull() {
            addCriterion("\"APPLY_LIMIT\" is null");
            return (Criteria) this;
        }

        public Criteria andApplyLimitIsNotNull() {
            addCriterion("\"APPLY_LIMIT\" is not null");
            return (Criteria) this;
        }

        public Criteria andApplyLimitEqualTo(BigDecimal value) {
            addCriterion("\"APPLY_LIMIT\" =", value, "applyLimit");
            return (Criteria) this;
        }

        public Criteria andApplyLimitNotEqualTo(BigDecimal value) {
            addCriterion("\"APPLY_LIMIT\" <>", value, "applyLimit");
            return (Criteria) this;
        }

        public Criteria andApplyLimitGreaterThan(BigDecimal value) {
            addCriterion("\"APPLY_LIMIT\" >", value, "applyLimit");
            return (Criteria) this;
        }

        public Criteria andApplyLimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("\"APPLY_LIMIT\" >=", value, "applyLimit");
            return (Criteria) this;
        }

        public Criteria andApplyLimitLessThan(BigDecimal value) {
            addCriterion("\"APPLY_LIMIT\" <", value, "applyLimit");
            return (Criteria) this;
        }

        public Criteria andApplyLimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("\"APPLY_LIMIT\" <=", value, "applyLimit");
            return (Criteria) this;
        }

        public Criteria andApplyLimitIn(List<BigDecimal> values) {
            addCriterion("\"APPLY_LIMIT\" in", values, "applyLimit");
            return (Criteria) this;
        }

        public Criteria andApplyLimitNotIn(List<BigDecimal> values) {
            addCriterion("\"APPLY_LIMIT\" not in", values, "applyLimit");
            return (Criteria) this;
        }

        public Criteria andApplyLimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("\"APPLY_LIMIT\" between", value1, value2, "applyLimit");
            return (Criteria) this;
        }

        public Criteria andApplyLimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("\"APPLY_LIMIT\" not between", value1, value2, "applyLimit");
            return (Criteria) this;
        }

        public Criteria andApplyDateIsNull() {
            addCriterion("\"APPLY_DATE\" is null");
            return (Criteria) this;
        }

        public Criteria andApplyDateIsNotNull() {
            addCriterion("\"APPLY_DATE\" is not null");
            return (Criteria) this;
        }

        public Criteria andApplyDateEqualTo(Date value) {
            addCriterion("\"APPLY_DATE\" =", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotEqualTo(Date value) {
            addCriterion("\"APPLY_DATE\" <>", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThan(Date value) {
            addCriterion("\"APPLY_DATE\" >", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("\"APPLY_DATE\" >=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThan(Date value) {
            addCriterion("\"APPLY_DATE\" <", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThanOrEqualTo(Date value) {
            addCriterion("\"APPLY_DATE\" <=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateIn(List<Date> values) {
            addCriterion("\"APPLY_DATE\" in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotIn(List<Date> values) {
            addCriterion("\"APPLY_DATE\" not in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateBetween(Date value1, Date value2) {
            addCriterion("\"APPLY_DATE\" between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotBetween(Date value1, Date value2) {
            addCriterion("\"APPLY_DATE\" not between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyStateIsNull() {
            addCriterion("\"APPLY_STATE\" is null");
            return (Criteria) this;
        }

        public Criteria andApplyStateIsNotNull() {
            addCriterion("\"APPLY_STATE\" is not null");
            return (Criteria) this;
        }

        public Criteria andApplyStateEqualTo(String value) {
            addCriterion("\"APPLY_STATE\" =", value, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateNotEqualTo(String value) {
            addCriterion("\"APPLY_STATE\" <>", value, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateGreaterThan(String value) {
            addCriterion("\"APPLY_STATE\" >", value, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateGreaterThanOrEqualTo(String value) {
            addCriterion("\"APPLY_STATE\" >=", value, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateLessThan(String value) {
            addCriterion("\"APPLY_STATE\" <", value, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateLessThanOrEqualTo(String value) {
            addCriterion("\"APPLY_STATE\" <=", value, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateLike(String value) {
            addCriterion("\"APPLY_STATE\" like", value, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateNotLike(String value) {
            addCriterion("\"APPLY_STATE\" not like", value, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateIn(List<String> values) {
            addCriterion("\"APPLY_STATE\" in", values, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateNotIn(List<String> values) {
            addCriterion("\"APPLY_STATE\" not in", values, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateBetween(String value1, String value2) {
            addCriterion("\"APPLY_STATE\" between", value1, value2, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateNotBetween(String value1, String value2) {
            addCriterion("\"APPLY_STATE\" not between", value1, value2, "applyState");
            return (Criteria) this;
        }

        public Criteria andCheckIdIsNull() {
            addCriterion("\"CHECK_ID\" is null");
            return (Criteria) this;
        }

        public Criteria andCheckIdIsNotNull() {
            addCriterion("\"CHECK_ID\" is not null");
            return (Criteria) this;
        }

        public Criteria andCheckIdEqualTo(String value) {
            addCriterion("\"CHECK_ID\" =", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdNotEqualTo(String value) {
            addCriterion("\"CHECK_ID\" <>", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdGreaterThan(String value) {
            addCriterion("\"CHECK_ID\" >", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdGreaterThanOrEqualTo(String value) {
            addCriterion("\"CHECK_ID\" >=", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdLessThan(String value) {
            addCriterion("\"CHECK_ID\" <", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdLessThanOrEqualTo(String value) {
            addCriterion("\"CHECK_ID\" <=", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdLike(String value) {
            addCriterion("\"CHECK_ID\" like", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdNotLike(String value) {
            addCriterion("\"CHECK_ID\" not like", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdIn(List<String> values) {
            addCriterion("\"CHECK_ID\" in", values, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdNotIn(List<String> values) {
            addCriterion("\"CHECK_ID\" not in", values, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdBetween(String value1, String value2) {
            addCriterion("\"CHECK_ID\" between", value1, value2, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdNotBetween(String value1, String value2) {
            addCriterion("\"CHECK_ID\" not between", value1, value2, "checkId");
            return (Criteria) this;
        }

        public Criteria andVaildIsNull() {
            addCriterion("\"VAILD\" is null");
            return (Criteria) this;
        }

        public Criteria andVaildIsNotNull() {
            addCriterion("\"VAILD\" is not null");
            return (Criteria) this;
        }

        public Criteria andVaildEqualTo(String value) {
            addCriterion("\"VAILD\" =", value, "vaild");
            return (Criteria) this;
        }

        public Criteria andVaildNotEqualTo(String value) {
            addCriterion("\"VAILD\" <>", value, "vaild");
            return (Criteria) this;
        }

        public Criteria andVaildGreaterThan(String value) {
            addCriterion("\"VAILD\" >", value, "vaild");
            return (Criteria) this;
        }

        public Criteria andVaildGreaterThanOrEqualTo(String value) {
            addCriterion("\"VAILD\" >=", value, "vaild");
            return (Criteria) this;
        }

        public Criteria andVaildLessThan(String value) {
            addCriterion("\"VAILD\" <", value, "vaild");
            return (Criteria) this;
        }

        public Criteria andVaildLessThanOrEqualTo(String value) {
            addCriterion("\"VAILD\" <=", value, "vaild");
            return (Criteria) this;
        }

        public Criteria andVaildLike(String value) {
            addCriterion("\"VAILD\" like", value, "vaild");
            return (Criteria) this;
        }

        public Criteria andVaildNotLike(String value) {
            addCriterion("\"VAILD\" not like", value, "vaild");
            return (Criteria) this;
        }

        public Criteria andVaildIn(List<String> values) {
            addCriterion("\"VAILD\" in", values, "vaild");
            return (Criteria) this;
        }

        public Criteria andVaildNotIn(List<String> values) {
            addCriterion("\"VAILD\" not in", values, "vaild");
            return (Criteria) this;
        }

        public Criteria andVaildBetween(String value1, String value2) {
            addCriterion("\"VAILD\" between", value1, value2, "vaild");
            return (Criteria) this;
        }

        public Criteria andVaildNotBetween(String value1, String value2) {
            addCriterion("\"VAILD\" not between", value1, value2, "vaild");
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