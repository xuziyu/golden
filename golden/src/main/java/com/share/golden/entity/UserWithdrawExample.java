package com.share.golden.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserWithdrawExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserWithdrawExample() {
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

        public Criteria andWithdrawIdIsNull() {
            addCriterion("\"WITHDRAW_ID\" is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdIsNotNull() {
            addCriterion("\"WITHDRAW_ID\" is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdEqualTo(String value) {
            addCriterion("\"WITHDRAW_ID\" =", value, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdNotEqualTo(String value) {
            addCriterion("\"WITHDRAW_ID\" <>", value, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdGreaterThan(String value) {
            addCriterion("\"WITHDRAW_ID\" >", value, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdGreaterThanOrEqualTo(String value) {
            addCriterion("\"WITHDRAW_ID\" >=", value, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdLessThan(String value) {
            addCriterion("\"WITHDRAW_ID\" <", value, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdLessThanOrEqualTo(String value) {
            addCriterion("\"WITHDRAW_ID\" <=", value, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdLike(String value) {
            addCriterion("\"WITHDRAW_ID\" like", value, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdNotLike(String value) {
            addCriterion("\"WITHDRAW_ID\" not like", value, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdIn(List<String> values) {
            addCriterion("\"WITHDRAW_ID\" in", values, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdNotIn(List<String> values) {
            addCriterion("\"WITHDRAW_ID\" not in", values, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdBetween(String value1, String value2) {
            addCriterion("\"WITHDRAW_ID\" between", value1, value2, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdNotBetween(String value1, String value2) {
            addCriterion("\"WITHDRAW_ID\" not between", value1, value2, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawAccountIsNull() {
            addCriterion("\"WITHDRAW_ACCOUNT\" is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawAccountIsNotNull() {
            addCriterion("\"WITHDRAW_ACCOUNT\" is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawAccountEqualTo(String value) {
            addCriterion("\"WITHDRAW_ACCOUNT\" =", value, "withdrawAccount");
            return (Criteria) this;
        }

        public Criteria andWithdrawAccountNotEqualTo(String value) {
            addCriterion("\"WITHDRAW_ACCOUNT\" <>", value, "withdrawAccount");
            return (Criteria) this;
        }

        public Criteria andWithdrawAccountGreaterThan(String value) {
            addCriterion("\"WITHDRAW_ACCOUNT\" >", value, "withdrawAccount");
            return (Criteria) this;
        }

        public Criteria andWithdrawAccountGreaterThanOrEqualTo(String value) {
            addCriterion("\"WITHDRAW_ACCOUNT\" >=", value, "withdrawAccount");
            return (Criteria) this;
        }

        public Criteria andWithdrawAccountLessThan(String value) {
            addCriterion("\"WITHDRAW_ACCOUNT\" <", value, "withdrawAccount");
            return (Criteria) this;
        }

        public Criteria andWithdrawAccountLessThanOrEqualTo(String value) {
            addCriterion("\"WITHDRAW_ACCOUNT\" <=", value, "withdrawAccount");
            return (Criteria) this;
        }

        public Criteria andWithdrawAccountLike(String value) {
            addCriterion("\"WITHDRAW_ACCOUNT\" like", value, "withdrawAccount");
            return (Criteria) this;
        }

        public Criteria andWithdrawAccountNotLike(String value) {
            addCriterion("\"WITHDRAW_ACCOUNT\" not like", value, "withdrawAccount");
            return (Criteria) this;
        }

        public Criteria andWithdrawAccountIn(List<String> values) {
            addCriterion("\"WITHDRAW_ACCOUNT\" in", values, "withdrawAccount");
            return (Criteria) this;
        }

        public Criteria andWithdrawAccountNotIn(List<String> values) {
            addCriterion("\"WITHDRAW_ACCOUNT\" not in", values, "withdrawAccount");
            return (Criteria) this;
        }

        public Criteria andWithdrawAccountBetween(String value1, String value2) {
            addCriterion("\"WITHDRAW_ACCOUNT\" between", value1, value2, "withdrawAccount");
            return (Criteria) this;
        }

        public Criteria andWithdrawAccountNotBetween(String value1, String value2) {
            addCriterion("\"WITHDRAW_ACCOUNT\" not between", value1, value2, "withdrawAccount");
            return (Criteria) this;
        }

        public Criteria andWithdrawBankIsNull() {
            addCriterion("\"WITHDRAW_BANK\" is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawBankIsNotNull() {
            addCriterion("\"WITHDRAW_BANK\" is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawBankEqualTo(String value) {
            addCriterion("\"WITHDRAW_BANK\" =", value, "withdrawBank");
            return (Criteria) this;
        }

        public Criteria andWithdrawBankNotEqualTo(String value) {
            addCriterion("\"WITHDRAW_BANK\" <>", value, "withdrawBank");
            return (Criteria) this;
        }

        public Criteria andWithdrawBankGreaterThan(String value) {
            addCriterion("\"WITHDRAW_BANK\" >", value, "withdrawBank");
            return (Criteria) this;
        }

        public Criteria andWithdrawBankGreaterThanOrEqualTo(String value) {
            addCriterion("\"WITHDRAW_BANK\" >=", value, "withdrawBank");
            return (Criteria) this;
        }

        public Criteria andWithdrawBankLessThan(String value) {
            addCriterion("\"WITHDRAW_BANK\" <", value, "withdrawBank");
            return (Criteria) this;
        }

        public Criteria andWithdrawBankLessThanOrEqualTo(String value) {
            addCriterion("\"WITHDRAW_BANK\" <=", value, "withdrawBank");
            return (Criteria) this;
        }

        public Criteria andWithdrawBankLike(String value) {
            addCriterion("\"WITHDRAW_BANK\" like", value, "withdrawBank");
            return (Criteria) this;
        }

        public Criteria andWithdrawBankNotLike(String value) {
            addCriterion("\"WITHDRAW_BANK\" not like", value, "withdrawBank");
            return (Criteria) this;
        }

        public Criteria andWithdrawBankIn(List<String> values) {
            addCriterion("\"WITHDRAW_BANK\" in", values, "withdrawBank");
            return (Criteria) this;
        }

        public Criteria andWithdrawBankNotIn(List<String> values) {
            addCriterion("\"WITHDRAW_BANK\" not in", values, "withdrawBank");
            return (Criteria) this;
        }

        public Criteria andWithdrawBankBetween(String value1, String value2) {
            addCriterion("\"WITHDRAW_BANK\" between", value1, value2, "withdrawBank");
            return (Criteria) this;
        }

        public Criteria andWithdrawBankNotBetween(String value1, String value2) {
            addCriterion("\"WITHDRAW_BANK\" not between", value1, value2, "withdrawBank");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyIsNull() {
            addCriterion("\"WITHDRAW_MONEY\" is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyIsNotNull() {
            addCriterion("\"WITHDRAW_MONEY\" is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyEqualTo(BigDecimal value) {
            addCriterion("\"WITHDRAW_MONEY\" =", value, "withdrawMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyNotEqualTo(BigDecimal value) {
            addCriterion("\"WITHDRAW_MONEY\" <>", value, "withdrawMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyGreaterThan(BigDecimal value) {
            addCriterion("\"WITHDRAW_MONEY\" >", value, "withdrawMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("\"WITHDRAW_MONEY\" >=", value, "withdrawMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyLessThan(BigDecimal value) {
            addCriterion("\"WITHDRAW_MONEY\" <", value, "withdrawMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("\"WITHDRAW_MONEY\" <=", value, "withdrawMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyIn(List<BigDecimal> values) {
            addCriterion("\"WITHDRAW_MONEY\" in", values, "withdrawMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyNotIn(List<BigDecimal> values) {
            addCriterion("\"WITHDRAW_MONEY\" not in", values, "withdrawMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("\"WITHDRAW_MONEY\" between", value1, value2, "withdrawMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("\"WITHDRAW_MONEY\" not between", value1, value2, "withdrawMoney");
            return (Criteria) this;
        }

        public Criteria andRealMoneyIsNull() {
            addCriterion("\"REAL_MONEY\" is null");
            return (Criteria) this;
        }

        public Criteria andRealMoneyIsNotNull() {
            addCriterion("\"REAL_MONEY\" is not null");
            return (Criteria) this;
        }

        public Criteria andRealMoneyEqualTo(BigDecimal value) {
            addCriterion("\"REAL_MONEY\" =", value, "realMoney");
            return (Criteria) this;
        }

        public Criteria andRealMoneyNotEqualTo(BigDecimal value) {
            addCriterion("\"REAL_MONEY\" <>", value, "realMoney");
            return (Criteria) this;
        }

        public Criteria andRealMoneyGreaterThan(BigDecimal value) {
            addCriterion("\"REAL_MONEY\" >", value, "realMoney");
            return (Criteria) this;
        }

        public Criteria andRealMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("\"REAL_MONEY\" >=", value, "realMoney");
            return (Criteria) this;
        }

        public Criteria andRealMoneyLessThan(BigDecimal value) {
            addCriterion("\"REAL_MONEY\" <", value, "realMoney");
            return (Criteria) this;
        }

        public Criteria andRealMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("\"REAL_MONEY\" <=", value, "realMoney");
            return (Criteria) this;
        }

        public Criteria andRealMoneyIn(List<BigDecimal> values) {
            addCriterion("\"REAL_MONEY\" in", values, "realMoney");
            return (Criteria) this;
        }

        public Criteria andRealMoneyNotIn(List<BigDecimal> values) {
            addCriterion("\"REAL_MONEY\" not in", values, "realMoney");
            return (Criteria) this;
        }

        public Criteria andRealMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("\"REAL_MONEY\" between", value1, value2, "realMoney");
            return (Criteria) this;
        }

        public Criteria andRealMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("\"REAL_MONEY\" not between", value1, value2, "realMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawServiceChargeIsNull() {
            addCriterion("\"WITHDRAW_SERVICE_CHARGE\" is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawServiceChargeIsNotNull() {
            addCriterion("\"WITHDRAW_SERVICE_CHARGE\" is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawServiceChargeEqualTo(BigDecimal value) {
            addCriterion("\"WITHDRAW_SERVICE_CHARGE\" =", value, "withdrawServiceCharge");
            return (Criteria) this;
        }

        public Criteria andWithdrawServiceChargeNotEqualTo(BigDecimal value) {
            addCriterion("\"WITHDRAW_SERVICE_CHARGE\" <>", value, "withdrawServiceCharge");
            return (Criteria) this;
        }

        public Criteria andWithdrawServiceChargeGreaterThan(BigDecimal value) {
            addCriterion("\"WITHDRAW_SERVICE_CHARGE\" >", value, "withdrawServiceCharge");
            return (Criteria) this;
        }

        public Criteria andWithdrawServiceChargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("\"WITHDRAW_SERVICE_CHARGE\" >=", value, "withdrawServiceCharge");
            return (Criteria) this;
        }

        public Criteria andWithdrawServiceChargeLessThan(BigDecimal value) {
            addCriterion("\"WITHDRAW_SERVICE_CHARGE\" <", value, "withdrawServiceCharge");
            return (Criteria) this;
        }

        public Criteria andWithdrawServiceChargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("\"WITHDRAW_SERVICE_CHARGE\" <=", value, "withdrawServiceCharge");
            return (Criteria) this;
        }

        public Criteria andWithdrawServiceChargeIn(List<BigDecimal> values) {
            addCriterion("\"WITHDRAW_SERVICE_CHARGE\" in", values, "withdrawServiceCharge");
            return (Criteria) this;
        }

        public Criteria andWithdrawServiceChargeNotIn(List<BigDecimal> values) {
            addCriterion("\"WITHDRAW_SERVICE_CHARGE\" not in", values, "withdrawServiceCharge");
            return (Criteria) this;
        }

        public Criteria andWithdrawServiceChargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("\"WITHDRAW_SERVICE_CHARGE\" between", value1, value2, "withdrawServiceCharge");
            return (Criteria) this;
        }

        public Criteria andWithdrawServiceChargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("\"WITHDRAW_SERVICE_CHARGE\" not between", value1, value2, "withdrawServiceCharge");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimeIsNull() {
            addCriterion("\"WITHDRAW_TIME\" is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimeIsNotNull() {
            addCriterion("\"WITHDRAW_TIME\" is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimeEqualTo(Date value) {
            addCriterion("\"WITHDRAW_TIME\" =", value, "withdrawTime");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimeNotEqualTo(Date value) {
            addCriterion("\"WITHDRAW_TIME\" <>", value, "withdrawTime");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimeGreaterThan(Date value) {
            addCriterion("\"WITHDRAW_TIME\" >", value, "withdrawTime");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("\"WITHDRAW_TIME\" >=", value, "withdrawTime");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimeLessThan(Date value) {
            addCriterion("\"WITHDRAW_TIME\" <", value, "withdrawTime");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimeLessThanOrEqualTo(Date value) {
            addCriterion("\"WITHDRAW_TIME\" <=", value, "withdrawTime");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimeIn(List<Date> values) {
            addCriterion("\"WITHDRAW_TIME\" in", values, "withdrawTime");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimeNotIn(List<Date> values) {
            addCriterion("\"WITHDRAW_TIME\" not in", values, "withdrawTime");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimeBetween(Date value1, Date value2) {
            addCriterion("\"WITHDRAW_TIME\" between", value1, value2, "withdrawTime");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimeNotBetween(Date value1, Date value2) {
            addCriterion("\"WITHDRAW_TIME\" not between", value1, value2, "withdrawTime");
            return (Criteria) this;
        }

        public Criteria andIntoTimeIsNull() {
            addCriterion("\"INTO_TIME\" is null");
            return (Criteria) this;
        }

        public Criteria andIntoTimeIsNotNull() {
            addCriterion("\"INTO_TIME\" is not null");
            return (Criteria) this;
        }

        public Criteria andIntoTimeEqualTo(Date value) {
            addCriterion("\"INTO_TIME\" =", value, "intoTime");
            return (Criteria) this;
        }

        public Criteria andIntoTimeNotEqualTo(Date value) {
            addCriterion("\"INTO_TIME\" <>", value, "intoTime");
            return (Criteria) this;
        }

        public Criteria andIntoTimeGreaterThan(Date value) {
            addCriterion("\"INTO_TIME\" >", value, "intoTime");
            return (Criteria) this;
        }

        public Criteria andIntoTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("\"INTO_TIME\" >=", value, "intoTime");
            return (Criteria) this;
        }

        public Criteria andIntoTimeLessThan(Date value) {
            addCriterion("\"INTO_TIME\" <", value, "intoTime");
            return (Criteria) this;
        }

        public Criteria andIntoTimeLessThanOrEqualTo(Date value) {
            addCriterion("\"INTO_TIME\" <=", value, "intoTime");
            return (Criteria) this;
        }

        public Criteria andIntoTimeIn(List<Date> values) {
            addCriterion("\"INTO_TIME\" in", values, "intoTime");
            return (Criteria) this;
        }

        public Criteria andIntoTimeNotIn(List<Date> values) {
            addCriterion("\"INTO_TIME\" not in", values, "intoTime");
            return (Criteria) this;
        }

        public Criteria andIntoTimeBetween(Date value1, Date value2) {
            addCriterion("\"INTO_TIME\" between", value1, value2, "intoTime");
            return (Criteria) this;
        }

        public Criteria andIntoTimeNotBetween(Date value1, Date value2) {
            addCriterion("\"INTO_TIME\" not between", value1, value2, "intoTime");
            return (Criteria) this;
        }

        public Criteria andWithdrawStateIsNull() {
            addCriterion("\"WITHDRAW_STATE\" is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawStateIsNotNull() {
            addCriterion("\"WITHDRAW_STATE\" is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawStateEqualTo(String value) {
            addCriterion("\"WITHDRAW_STATE\" =", value, "withdrawState");
            return (Criteria) this;
        }

        public Criteria andWithdrawStateNotEqualTo(String value) {
            addCriterion("\"WITHDRAW_STATE\" <>", value, "withdrawState");
            return (Criteria) this;
        }

        public Criteria andWithdrawStateGreaterThan(String value) {
            addCriterion("\"WITHDRAW_STATE\" >", value, "withdrawState");
            return (Criteria) this;
        }

        public Criteria andWithdrawStateGreaterThanOrEqualTo(String value) {
            addCriterion("\"WITHDRAW_STATE\" >=", value, "withdrawState");
            return (Criteria) this;
        }

        public Criteria andWithdrawStateLessThan(String value) {
            addCriterion("\"WITHDRAW_STATE\" <", value, "withdrawState");
            return (Criteria) this;
        }

        public Criteria andWithdrawStateLessThanOrEqualTo(String value) {
            addCriterion("\"WITHDRAW_STATE\" <=", value, "withdrawState");
            return (Criteria) this;
        }

        public Criteria andWithdrawStateLike(String value) {
            addCriterion("\"WITHDRAW_STATE\" like", value, "withdrawState");
            return (Criteria) this;
        }

        public Criteria andWithdrawStateNotLike(String value) {
            addCriterion("\"WITHDRAW_STATE\" not like", value, "withdrawState");
            return (Criteria) this;
        }

        public Criteria andWithdrawStateIn(List<String> values) {
            addCriterion("\"WITHDRAW_STATE\" in", values, "withdrawState");
            return (Criteria) this;
        }

        public Criteria andWithdrawStateNotIn(List<String> values) {
            addCriterion("\"WITHDRAW_STATE\" not in", values, "withdrawState");
            return (Criteria) this;
        }

        public Criteria andWithdrawStateBetween(String value1, String value2) {
            addCriterion("\"WITHDRAW_STATE\" between", value1, value2, "withdrawState");
            return (Criteria) this;
        }

        public Criteria andWithdrawStateNotBetween(String value1, String value2) {
            addCriterion("\"WITHDRAW_STATE\" not between", value1, value2, "withdrawState");
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

        public Criteria andAuditTimeIsNull() {
            addCriterion("\"AUDIT_TIME\" is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("\"AUDIT_TIME\" is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterion("\"AUDIT_TIME\" =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterion("\"AUDIT_TIME\" <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterion("\"AUDIT_TIME\" >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("\"AUDIT_TIME\" >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterion("\"AUDIT_TIME\" <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("\"AUDIT_TIME\" <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterion("\"AUDIT_TIME\" in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterion("\"AUDIT_TIME\" not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterion("\"AUDIT_TIME\" between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("\"AUDIT_TIME\" not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("\"REMARK\" is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("\"REMARK\" is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("\"REMARK\" =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("\"REMARK\" <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("\"REMARK\" >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("\"REMARK\" >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("\"REMARK\" <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("\"REMARK\" <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("\"REMARK\" like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("\"REMARK\" not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("\"REMARK\" in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("\"REMARK\" not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("\"REMARK\" between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("\"REMARK\" not between", value1, value2, "remark");
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