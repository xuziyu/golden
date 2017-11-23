package com.share.golden.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class UserAccountAssetsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserAccountAssetsExample() {
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

        public Criteria andAccountIdIsNull() {
            addCriterion("\"ACCOUNT_ID\" is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("\"ACCOUNT_ID\" is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(BigDecimal value) {
            addCriterion("\"ACCOUNT_ID\" =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(BigDecimal value) {
            addCriterion("\"ACCOUNT_ID\" <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(BigDecimal value) {
            addCriterion("\"ACCOUNT_ID\" >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("\"ACCOUNT_ID\" >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(BigDecimal value) {
            addCriterion("\"ACCOUNT_ID\" <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("\"ACCOUNT_ID\" <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<BigDecimal> values) {
            addCriterion("\"ACCOUNT_ID\" in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<BigDecimal> values) {
            addCriterion("\"ACCOUNT_ID\" not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("\"ACCOUNT_ID\" between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("\"ACCOUNT_ID\" not between", value1, value2, "accountId");
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

        public Criteria andAccountBalanceIsNull() {
            addCriterion("\"ACCOUNT_BALANCE\" is null");
            return (Criteria) this;
        }

        public Criteria andAccountBalanceIsNotNull() {
            addCriterion("\"ACCOUNT_BALANCE\" is not null");
            return (Criteria) this;
        }

        public Criteria andAccountBalanceEqualTo(String value) {
            addCriterion("\"ACCOUNT_BALANCE\" =", value, "accountBalance");
            return (Criteria) this;
        }

        public Criteria andAccountBalanceNotEqualTo(String value) {
            addCriterion("\"ACCOUNT_BALANCE\" <>", value, "accountBalance");
            return (Criteria) this;
        }

        public Criteria andAccountBalanceGreaterThan(String value) {
            addCriterion("\"ACCOUNT_BALANCE\" >", value, "accountBalance");
            return (Criteria) this;
        }

        public Criteria andAccountBalanceGreaterThanOrEqualTo(String value) {
            addCriterion("\"ACCOUNT_BALANCE\" >=", value, "accountBalance");
            return (Criteria) this;
        }

        public Criteria andAccountBalanceLessThan(String value) {
            addCriterion("\"ACCOUNT_BALANCE\" <", value, "accountBalance");
            return (Criteria) this;
        }

        public Criteria andAccountBalanceLessThanOrEqualTo(String value) {
            addCriterion("\"ACCOUNT_BALANCE\" <=", value, "accountBalance");
            return (Criteria) this;
        }

        public Criteria andAccountBalanceLike(String value) {
            addCriterion("\"ACCOUNT_BALANCE\" like", value, "accountBalance");
            return (Criteria) this;
        }

        public Criteria andAccountBalanceNotLike(String value) {
            addCriterion("\"ACCOUNT_BALANCE\" not like", value, "accountBalance");
            return (Criteria) this;
        }

        public Criteria andAccountBalanceIn(List<String> values) {
            addCriterion("\"ACCOUNT_BALANCE\" in", values, "accountBalance");
            return (Criteria) this;
        }

        public Criteria andAccountBalanceNotIn(List<String> values) {
            addCriterion("\"ACCOUNT_BALANCE\" not in", values, "accountBalance");
            return (Criteria) this;
        }

        public Criteria andAccountBalanceBetween(String value1, String value2) {
            addCriterion("\"ACCOUNT_BALANCE\" between", value1, value2, "accountBalance");
            return (Criteria) this;
        }

        public Criteria andAccountBalanceNotBetween(String value1, String value2) {
            addCriterion("\"ACCOUNT_BALANCE\" not between", value1, value2, "accountBalance");
            return (Criteria) this;
        }

        public Criteria andAccountFreezeIsNull() {
            addCriterion("\"ACCOUNT_FREEZE\" is null");
            return (Criteria) this;
        }

        public Criteria andAccountFreezeIsNotNull() {
            addCriterion("\"ACCOUNT_FREEZE\" is not null");
            return (Criteria) this;
        }

        public Criteria andAccountFreezeEqualTo(String value) {
            addCriterion("\"ACCOUNT_FREEZE\" =", value, "accountFreeze");
            return (Criteria) this;
        }

        public Criteria andAccountFreezeNotEqualTo(String value) {
            addCriterion("\"ACCOUNT_FREEZE\" <>", value, "accountFreeze");
            return (Criteria) this;
        }

        public Criteria andAccountFreezeGreaterThan(String value) {
            addCriterion("\"ACCOUNT_FREEZE\" >", value, "accountFreeze");
            return (Criteria) this;
        }

        public Criteria andAccountFreezeGreaterThanOrEqualTo(String value) {
            addCriterion("\"ACCOUNT_FREEZE\" >=", value, "accountFreeze");
            return (Criteria) this;
        }

        public Criteria andAccountFreezeLessThan(String value) {
            addCriterion("\"ACCOUNT_FREEZE\" <", value, "accountFreeze");
            return (Criteria) this;
        }

        public Criteria andAccountFreezeLessThanOrEqualTo(String value) {
            addCriterion("\"ACCOUNT_FREEZE\" <=", value, "accountFreeze");
            return (Criteria) this;
        }

        public Criteria andAccountFreezeLike(String value) {
            addCriterion("\"ACCOUNT_FREEZE\" like", value, "accountFreeze");
            return (Criteria) this;
        }

        public Criteria andAccountFreezeNotLike(String value) {
            addCriterion("\"ACCOUNT_FREEZE\" not like", value, "accountFreeze");
            return (Criteria) this;
        }

        public Criteria andAccountFreezeIn(List<String> values) {
            addCriterion("\"ACCOUNT_FREEZE\" in", values, "accountFreeze");
            return (Criteria) this;
        }

        public Criteria andAccountFreezeNotIn(List<String> values) {
            addCriterion("\"ACCOUNT_FREEZE\" not in", values, "accountFreeze");
            return (Criteria) this;
        }

        public Criteria andAccountFreezeBetween(String value1, String value2) {
            addCriterion("\"ACCOUNT_FREEZE\" between", value1, value2, "accountFreeze");
            return (Criteria) this;
        }

        public Criteria andAccountFreezeNotBetween(String value1, String value2) {
            addCriterion("\"ACCOUNT_FREEZE\" not between", value1, value2, "accountFreeze");
            return (Criteria) this;
        }

        public Criteria andAccountDueIsNull() {
            addCriterion("\"ACCOUNT_DUE\" is null");
            return (Criteria) this;
        }

        public Criteria andAccountDueIsNotNull() {
            addCriterion("\"ACCOUNT_DUE\" is not null");
            return (Criteria) this;
        }

        public Criteria andAccountDueEqualTo(String value) {
            addCriterion("\"ACCOUNT_DUE\" =", value, "accountDue");
            return (Criteria) this;
        }

        public Criteria andAccountDueNotEqualTo(String value) {
            addCriterion("\"ACCOUNT_DUE\" <>", value, "accountDue");
            return (Criteria) this;
        }

        public Criteria andAccountDueGreaterThan(String value) {
            addCriterion("\"ACCOUNT_DUE\" >", value, "accountDue");
            return (Criteria) this;
        }

        public Criteria andAccountDueGreaterThanOrEqualTo(String value) {
            addCriterion("\"ACCOUNT_DUE\" >=", value, "accountDue");
            return (Criteria) this;
        }

        public Criteria andAccountDueLessThan(String value) {
            addCriterion("\"ACCOUNT_DUE\" <", value, "accountDue");
            return (Criteria) this;
        }

        public Criteria andAccountDueLessThanOrEqualTo(String value) {
            addCriterion("\"ACCOUNT_DUE\" <=", value, "accountDue");
            return (Criteria) this;
        }

        public Criteria andAccountDueLike(String value) {
            addCriterion("\"ACCOUNT_DUE\" like", value, "accountDue");
            return (Criteria) this;
        }

        public Criteria andAccountDueNotLike(String value) {
            addCriterion("\"ACCOUNT_DUE\" not like", value, "accountDue");
            return (Criteria) this;
        }

        public Criteria andAccountDueIn(List<String> values) {
            addCriterion("\"ACCOUNT_DUE\" in", values, "accountDue");
            return (Criteria) this;
        }

        public Criteria andAccountDueNotIn(List<String> values) {
            addCriterion("\"ACCOUNT_DUE\" not in", values, "accountDue");
            return (Criteria) this;
        }

        public Criteria andAccountDueBetween(String value1, String value2) {
            addCriterion("\"ACCOUNT_DUE\" between", value1, value2, "accountDue");
            return (Criteria) this;
        }

        public Criteria andAccountDueNotBetween(String value1, String value2) {
            addCriterion("\"ACCOUNT_DUE\" not between", value1, value2, "accountDue");
            return (Criteria) this;
        }

        public Criteria andAccountPaidIsNull() {
            addCriterion("\"ACCOUNT_PAID\" is null");
            return (Criteria) this;
        }

        public Criteria andAccountPaidIsNotNull() {
            addCriterion("\"ACCOUNT_PAID\" is not null");
            return (Criteria) this;
        }

        public Criteria andAccountPaidEqualTo(String value) {
            addCriterion("\"ACCOUNT_PAID\" =", value, "accountPaid");
            return (Criteria) this;
        }

        public Criteria andAccountPaidNotEqualTo(String value) {
            addCriterion("\"ACCOUNT_PAID\" <>", value, "accountPaid");
            return (Criteria) this;
        }

        public Criteria andAccountPaidGreaterThan(String value) {
            addCriterion("\"ACCOUNT_PAID\" >", value, "accountPaid");
            return (Criteria) this;
        }

        public Criteria andAccountPaidGreaterThanOrEqualTo(String value) {
            addCriterion("\"ACCOUNT_PAID\" >=", value, "accountPaid");
            return (Criteria) this;
        }

        public Criteria andAccountPaidLessThan(String value) {
            addCriterion("\"ACCOUNT_PAID\" <", value, "accountPaid");
            return (Criteria) this;
        }

        public Criteria andAccountPaidLessThanOrEqualTo(String value) {
            addCriterion("\"ACCOUNT_PAID\" <=", value, "accountPaid");
            return (Criteria) this;
        }

        public Criteria andAccountPaidLike(String value) {
            addCriterion("\"ACCOUNT_PAID\" like", value, "accountPaid");
            return (Criteria) this;
        }

        public Criteria andAccountPaidNotLike(String value) {
            addCriterion("\"ACCOUNT_PAID\" not like", value, "accountPaid");
            return (Criteria) this;
        }

        public Criteria andAccountPaidIn(List<String> values) {
            addCriterion("\"ACCOUNT_PAID\" in", values, "accountPaid");
            return (Criteria) this;
        }

        public Criteria andAccountPaidNotIn(List<String> values) {
            addCriterion("\"ACCOUNT_PAID\" not in", values, "accountPaid");
            return (Criteria) this;
        }

        public Criteria andAccountPaidBetween(String value1, String value2) {
            addCriterion("\"ACCOUNT_PAID\" between", value1, value2, "accountPaid");
            return (Criteria) this;
        }

        public Criteria andAccountPaidNotBetween(String value1, String value2) {
            addCriterion("\"ACCOUNT_PAID\" not between", value1, value2, "accountPaid");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyIsNull() {
            addCriterion("\"TOTAL_MONEY\" is null");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyIsNotNull() {
            addCriterion("\"TOTAL_MONEY\" is not null");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyEqualTo(String value) {
            addCriterion("\"TOTAL_MONEY\" =", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotEqualTo(String value) {
            addCriterion("\"TOTAL_MONEY\" <>", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyGreaterThan(String value) {
            addCriterion("\"TOTAL_MONEY\" >", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("\"TOTAL_MONEY\" >=", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyLessThan(String value) {
            addCriterion("\"TOTAL_MONEY\" <", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyLessThanOrEqualTo(String value) {
            addCriterion("\"TOTAL_MONEY\" <=", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyLike(String value) {
            addCriterion("\"TOTAL_MONEY\" like", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotLike(String value) {
            addCriterion("\"TOTAL_MONEY\" not like", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyIn(List<String> values) {
            addCriterion("\"TOTAL_MONEY\" in", values, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotIn(List<String> values) {
            addCriterion("\"TOTAL_MONEY\" not in", values, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyBetween(String value1, String value2) {
            addCriterion("\"TOTAL_MONEY\" between", value1, value2, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotBetween(String value1, String value2) {
            addCriterion("\"TOTAL_MONEY\" not between", value1, value2, "totalMoney");
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