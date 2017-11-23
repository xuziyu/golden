package com.share.golden.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BasProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BasProductExample() {
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

        public Criteria andProductIdIsNull() {
            addCriterion("\"PRODUCT_ID\" is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("\"PRODUCT_ID\" is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("\"PRODUCT_ID\" =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("\"PRODUCT_ID\" <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("\"PRODUCT_ID\" >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("\"PRODUCT_ID\" >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("\"PRODUCT_ID\" <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("\"PRODUCT_ID\" <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("\"PRODUCT_ID\" like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("\"PRODUCT_ID\" not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("\"PRODUCT_ID\" in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("\"PRODUCT_ID\" not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("\"PRODUCT_ID\" between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("\"PRODUCT_ID\" not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductMoneyIsNull() {
            addCriterion("\"PRODUCT_MONEY\" is null");
            return (Criteria) this;
        }

        public Criteria andProductMoneyIsNotNull() {
            addCriterion("\"PRODUCT_MONEY\" is not null");
            return (Criteria) this;
        }

        public Criteria andProductMoneyEqualTo(BigDecimal value) {
            addCriterion("\"PRODUCT_MONEY\" =", value, "productMoney");
            return (Criteria) this;
        }

        public Criteria andProductMoneyNotEqualTo(BigDecimal value) {
            addCriterion("\"PRODUCT_MONEY\" <>", value, "productMoney");
            return (Criteria) this;
        }

        public Criteria andProductMoneyGreaterThan(BigDecimal value) {
            addCriterion("\"PRODUCT_MONEY\" >", value, "productMoney");
            return (Criteria) this;
        }

        public Criteria andProductMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("\"PRODUCT_MONEY\" >=", value, "productMoney");
            return (Criteria) this;
        }

        public Criteria andProductMoneyLessThan(BigDecimal value) {
            addCriterion("\"PRODUCT_MONEY\" <", value, "productMoney");
            return (Criteria) this;
        }

        public Criteria andProductMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("\"PRODUCT_MONEY\" <=", value, "productMoney");
            return (Criteria) this;
        }

        public Criteria andProductMoneyIn(List<BigDecimal> values) {
            addCriterion("\"PRODUCT_MONEY\" in", values, "productMoney");
            return (Criteria) this;
        }

        public Criteria andProductMoneyNotIn(List<BigDecimal> values) {
            addCriterion("\"PRODUCT_MONEY\" not in", values, "productMoney");
            return (Criteria) this;
        }

        public Criteria andProductMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("\"PRODUCT_MONEY\" between", value1, value2, "productMoney");
            return (Criteria) this;
        }

        public Criteria andProductMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("\"PRODUCT_MONEY\" not between", value1, value2, "productMoney");
            return (Criteria) this;
        }

        public Criteria andProductIncomeIsNull() {
            addCriterion("\"PRODUCT_INCOME\" is null");
            return (Criteria) this;
        }

        public Criteria andProductIncomeIsNotNull() {
            addCriterion("\"PRODUCT_INCOME\" is not null");
            return (Criteria) this;
        }

        public Criteria andProductIncomeEqualTo(String value) {
            addCriterion("\"PRODUCT_INCOME\" =", value, "productIncome");
            return (Criteria) this;
        }

        public Criteria andProductIncomeNotEqualTo(String value) {
            addCriterion("\"PRODUCT_INCOME\" <>", value, "productIncome");
            return (Criteria) this;
        }

        public Criteria andProductIncomeGreaterThan(String value) {
            addCriterion("\"PRODUCT_INCOME\" >", value, "productIncome");
            return (Criteria) this;
        }

        public Criteria andProductIncomeGreaterThanOrEqualTo(String value) {
            addCriterion("\"PRODUCT_INCOME\" >=", value, "productIncome");
            return (Criteria) this;
        }

        public Criteria andProductIncomeLessThan(String value) {
            addCriterion("\"PRODUCT_INCOME\" <", value, "productIncome");
            return (Criteria) this;
        }

        public Criteria andProductIncomeLessThanOrEqualTo(String value) {
            addCriterion("\"PRODUCT_INCOME\" <=", value, "productIncome");
            return (Criteria) this;
        }

        public Criteria andProductIncomeLike(String value) {
            addCriterion("\"PRODUCT_INCOME\" like", value, "productIncome");
            return (Criteria) this;
        }

        public Criteria andProductIncomeNotLike(String value) {
            addCriterion("\"PRODUCT_INCOME\" not like", value, "productIncome");
            return (Criteria) this;
        }

        public Criteria andProductIncomeIn(List<String> values) {
            addCriterion("\"PRODUCT_INCOME\" in", values, "productIncome");
            return (Criteria) this;
        }

        public Criteria andProductIncomeNotIn(List<String> values) {
            addCriterion("\"PRODUCT_INCOME\" not in", values, "productIncome");
            return (Criteria) this;
        }

        public Criteria andProductIncomeBetween(String value1, String value2) {
            addCriterion("\"PRODUCT_INCOME\" between", value1, value2, "productIncome");
            return (Criteria) this;
        }

        public Criteria andProductIncomeNotBetween(String value1, String value2) {
            addCriterion("\"PRODUCT_INCOME\" not between", value1, value2, "productIncome");
            return (Criteria) this;
        }

        public Criteria andProductTimeIsNull() {
            addCriterion("\"PRODUCT_TIME\" is null");
            return (Criteria) this;
        }

        public Criteria andProductTimeIsNotNull() {
            addCriterion("\"PRODUCT_TIME\" is not null");
            return (Criteria) this;
        }

        public Criteria andProductTimeEqualTo(Date value) {
            addCriterion("\"PRODUCT_TIME\" =", value, "productTime");
            return (Criteria) this;
        }

        public Criteria andProductTimeNotEqualTo(Date value) {
            addCriterion("\"PRODUCT_TIME\" <>", value, "productTime");
            return (Criteria) this;
        }

        public Criteria andProductTimeGreaterThan(Date value) {
            addCriterion("\"PRODUCT_TIME\" >", value, "productTime");
            return (Criteria) this;
        }

        public Criteria andProductTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("\"PRODUCT_TIME\" >=", value, "productTime");
            return (Criteria) this;
        }

        public Criteria andProductTimeLessThan(Date value) {
            addCriterion("\"PRODUCT_TIME\" <", value, "productTime");
            return (Criteria) this;
        }

        public Criteria andProductTimeLessThanOrEqualTo(Date value) {
            addCriterion("\"PRODUCT_TIME\" <=", value, "productTime");
            return (Criteria) this;
        }

        public Criteria andProductTimeIn(List<Date> values) {
            addCriterion("\"PRODUCT_TIME\" in", values, "productTime");
            return (Criteria) this;
        }

        public Criteria andProductTimeNotIn(List<Date> values) {
            addCriterion("\"PRODUCT_TIME\" not in", values, "productTime");
            return (Criteria) this;
        }

        public Criteria andProductTimeBetween(Date value1, Date value2) {
            addCriterion("\"PRODUCT_TIME\" between", value1, value2, "productTime");
            return (Criteria) this;
        }

        public Criteria andProductTimeNotBetween(Date value1, Date value2) {
            addCriterion("\"PRODUCT_TIME\" not between", value1, value2, "productTime");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNull() {
            addCriterion("\"PRODUCT_TYPE\" is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNotNull() {
            addCriterion("\"PRODUCT_TYPE\" is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeEqualTo(String value) {
            addCriterion("\"PRODUCT_TYPE\" =", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotEqualTo(String value) {
            addCriterion("\"PRODUCT_TYPE\" <>", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThan(String value) {
            addCriterion("\"PRODUCT_TYPE\" >", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThanOrEqualTo(String value) {
            addCriterion("\"PRODUCT_TYPE\" >=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThan(String value) {
            addCriterion("\"PRODUCT_TYPE\" <", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThanOrEqualTo(String value) {
            addCriterion("\"PRODUCT_TYPE\" <=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLike(String value) {
            addCriterion("\"PRODUCT_TYPE\" like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotLike(String value) {
            addCriterion("\"PRODUCT_TYPE\" not like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeIn(List<String> values) {
            addCriterion("\"PRODUCT_TYPE\" in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotIn(List<String> values) {
            addCriterion("\"PRODUCT_TYPE\" not in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeBetween(String value1, String value2) {
            addCriterion("\"PRODUCT_TYPE\" between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotBetween(String value1, String value2) {
            addCriterion("\"PRODUCT_TYPE\" not between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductWayIsNull() {
            addCriterion("\"PRODUCT_WAY\" is null");
            return (Criteria) this;
        }

        public Criteria andProductWayIsNotNull() {
            addCriterion("\"PRODUCT_WAY\" is not null");
            return (Criteria) this;
        }

        public Criteria andProductWayEqualTo(String value) {
            addCriterion("\"PRODUCT_WAY\" =", value, "productWay");
            return (Criteria) this;
        }

        public Criteria andProductWayNotEqualTo(String value) {
            addCriterion("\"PRODUCT_WAY\" <>", value, "productWay");
            return (Criteria) this;
        }

        public Criteria andProductWayGreaterThan(String value) {
            addCriterion("\"PRODUCT_WAY\" >", value, "productWay");
            return (Criteria) this;
        }

        public Criteria andProductWayGreaterThanOrEqualTo(String value) {
            addCriterion("\"PRODUCT_WAY\" >=", value, "productWay");
            return (Criteria) this;
        }

        public Criteria andProductWayLessThan(String value) {
            addCriterion("\"PRODUCT_WAY\" <", value, "productWay");
            return (Criteria) this;
        }

        public Criteria andProductWayLessThanOrEqualTo(String value) {
            addCriterion("\"PRODUCT_WAY\" <=", value, "productWay");
            return (Criteria) this;
        }

        public Criteria andProductWayLike(String value) {
            addCriterion("\"PRODUCT_WAY\" like", value, "productWay");
            return (Criteria) this;
        }

        public Criteria andProductWayNotLike(String value) {
            addCriterion("\"PRODUCT_WAY\" not like", value, "productWay");
            return (Criteria) this;
        }

        public Criteria andProductWayIn(List<String> values) {
            addCriterion("\"PRODUCT_WAY\" in", values, "productWay");
            return (Criteria) this;
        }

        public Criteria andProductWayNotIn(List<String> values) {
            addCriterion("\"PRODUCT_WAY\" not in", values, "productWay");
            return (Criteria) this;
        }

        public Criteria andProductWayBetween(String value1, String value2) {
            addCriterion("\"PRODUCT_WAY\" between", value1, value2, "productWay");
            return (Criteria) this;
        }

        public Criteria andProductWayNotBetween(String value1, String value2) {
            addCriterion("\"PRODUCT_WAY\" not between", value1, value2, "productWay");
            return (Criteria) this;
        }

        public Criteria andPcountIsNull() {
            addCriterion("\"PCOUNT\" is null");
            return (Criteria) this;
        }

        public Criteria andPcountIsNotNull() {
            addCriterion("\"PCOUNT\" is not null");
            return (Criteria) this;
        }

        public Criteria andPcountEqualTo(Date value) {
            addCriterion("\"PCOUNT\" =", value, "pcount");
            return (Criteria) this;
        }

        public Criteria andPcountNotEqualTo(Date value) {
            addCriterion("\"PCOUNT\" <>", value, "pcount");
            return (Criteria) this;
        }

        public Criteria andPcountGreaterThan(Date value) {
            addCriterion("\"PCOUNT\" >", value, "pcount");
            return (Criteria) this;
        }

        public Criteria andPcountGreaterThanOrEqualTo(Date value) {
            addCriterion("\"PCOUNT\" >=", value, "pcount");
            return (Criteria) this;
        }

        public Criteria andPcountLessThan(Date value) {
            addCriterion("\"PCOUNT\" <", value, "pcount");
            return (Criteria) this;
        }

        public Criteria andPcountLessThanOrEqualTo(Date value) {
            addCriterion("\"PCOUNT\" <=", value, "pcount");
            return (Criteria) this;
        }

        public Criteria andPcountIn(List<Date> values) {
            addCriterion("\"PCOUNT\" in", values, "pcount");
            return (Criteria) this;
        }

        public Criteria andPcountNotIn(List<Date> values) {
            addCriterion("\"PCOUNT\" not in", values, "pcount");
            return (Criteria) this;
        }

        public Criteria andPcountBetween(Date value1, Date value2) {
            addCriterion("\"PCOUNT\" between", value1, value2, "pcount");
            return (Criteria) this;
        }

        public Criteria andPcountNotBetween(Date value1, Date value2) {
            addCriterion("\"PCOUNT\" not between", value1, value2, "pcount");
            return (Criteria) this;
        }

        public Criteria andProductProgressIsNull() {
            addCriterion("\"PRODUCT_PROGRESS\" is null");
            return (Criteria) this;
        }

        public Criteria andProductProgressIsNotNull() {
            addCriterion("\"PRODUCT_PROGRESS\" is not null");
            return (Criteria) this;
        }

        public Criteria andProductProgressEqualTo(String value) {
            addCriterion("\"PRODUCT_PROGRESS\" =", value, "productProgress");
            return (Criteria) this;
        }

        public Criteria andProductProgressNotEqualTo(String value) {
            addCriterion("\"PRODUCT_PROGRESS\" <>", value, "productProgress");
            return (Criteria) this;
        }

        public Criteria andProductProgressGreaterThan(String value) {
            addCriterion("\"PRODUCT_PROGRESS\" >", value, "productProgress");
            return (Criteria) this;
        }

        public Criteria andProductProgressGreaterThanOrEqualTo(String value) {
            addCriterion("\"PRODUCT_PROGRESS\" >=", value, "productProgress");
            return (Criteria) this;
        }

        public Criteria andProductProgressLessThan(String value) {
            addCriterion("\"PRODUCT_PROGRESS\" <", value, "productProgress");
            return (Criteria) this;
        }

        public Criteria andProductProgressLessThanOrEqualTo(String value) {
            addCriterion("\"PRODUCT_PROGRESS\" <=", value, "productProgress");
            return (Criteria) this;
        }

        public Criteria andProductProgressLike(String value) {
            addCriterion("\"PRODUCT_PROGRESS\" like", value, "productProgress");
            return (Criteria) this;
        }

        public Criteria andProductProgressNotLike(String value) {
            addCriterion("\"PRODUCT_PROGRESS\" not like", value, "productProgress");
            return (Criteria) this;
        }

        public Criteria andProductProgressIn(List<String> values) {
            addCriterion("\"PRODUCT_PROGRESS\" in", values, "productProgress");
            return (Criteria) this;
        }

        public Criteria andProductProgressNotIn(List<String> values) {
            addCriterion("\"PRODUCT_PROGRESS\" not in", values, "productProgress");
            return (Criteria) this;
        }

        public Criteria andProductProgressBetween(String value1, String value2) {
            addCriterion("\"PRODUCT_PROGRESS\" between", value1, value2, "productProgress");
            return (Criteria) this;
        }

        public Criteria andProductProgressNotBetween(String value1, String value2) {
            addCriterion("\"PRODUCT_PROGRESS\" not between", value1, value2, "productProgress");
            return (Criteria) this;
        }

        public Criteria andProductSavewayIsNull() {
            addCriterion("\"PRODUCT_SAVEWAY\" is null");
            return (Criteria) this;
        }

        public Criteria andProductSavewayIsNotNull() {
            addCriterion("\"PRODUCT_SAVEWAY\" is not null");
            return (Criteria) this;
        }

        public Criteria andProductSavewayEqualTo(String value) {
            addCriterion("\"PRODUCT_SAVEWAY\" =", value, "productSaveway");
            return (Criteria) this;
        }

        public Criteria andProductSavewayNotEqualTo(String value) {
            addCriterion("\"PRODUCT_SAVEWAY\" <>", value, "productSaveway");
            return (Criteria) this;
        }

        public Criteria andProductSavewayGreaterThan(String value) {
            addCriterion("\"PRODUCT_SAVEWAY\" >", value, "productSaveway");
            return (Criteria) this;
        }

        public Criteria andProductSavewayGreaterThanOrEqualTo(String value) {
            addCriterion("\"PRODUCT_SAVEWAY\" >=", value, "productSaveway");
            return (Criteria) this;
        }

        public Criteria andProductSavewayLessThan(String value) {
            addCriterion("\"PRODUCT_SAVEWAY\" <", value, "productSaveway");
            return (Criteria) this;
        }

        public Criteria andProductSavewayLessThanOrEqualTo(String value) {
            addCriterion("\"PRODUCT_SAVEWAY\" <=", value, "productSaveway");
            return (Criteria) this;
        }

        public Criteria andProductSavewayLike(String value) {
            addCriterion("\"PRODUCT_SAVEWAY\" like", value, "productSaveway");
            return (Criteria) this;
        }

        public Criteria andProductSavewayNotLike(String value) {
            addCriterion("\"PRODUCT_SAVEWAY\" not like", value, "productSaveway");
            return (Criteria) this;
        }

        public Criteria andProductSavewayIn(List<String> values) {
            addCriterion("\"PRODUCT_SAVEWAY\" in", values, "productSaveway");
            return (Criteria) this;
        }

        public Criteria andProductSavewayNotIn(List<String> values) {
            addCriterion("\"PRODUCT_SAVEWAY\" not in", values, "productSaveway");
            return (Criteria) this;
        }

        public Criteria andProductSavewayBetween(String value1, String value2) {
            addCriterion("\"PRODUCT_SAVEWAY\" between", value1, value2, "productSaveway");
            return (Criteria) this;
        }

        public Criteria andProductSavewayNotBetween(String value1, String value2) {
            addCriterion("\"PRODUCT_SAVEWAY\" not between", value1, value2, "productSaveway");
            return (Criteria) this;
        }

        public Criteria andProductRatebenIsNull() {
            addCriterion("\"PRODUCT_RATEBEN\" is null");
            return (Criteria) this;
        }

        public Criteria andProductRatebenIsNotNull() {
            addCriterion("\"PRODUCT_RATEBEN\" is not null");
            return (Criteria) this;
        }

        public Criteria andProductRatebenEqualTo(String value) {
            addCriterion("\"PRODUCT_RATEBEN\" =", value, "productRateben");
            return (Criteria) this;
        }

        public Criteria andProductRatebenNotEqualTo(String value) {
            addCriterion("\"PRODUCT_RATEBEN\" <>", value, "productRateben");
            return (Criteria) this;
        }

        public Criteria andProductRatebenGreaterThan(String value) {
            addCriterion("\"PRODUCT_RATEBEN\" >", value, "productRateben");
            return (Criteria) this;
        }

        public Criteria andProductRatebenGreaterThanOrEqualTo(String value) {
            addCriterion("\"PRODUCT_RATEBEN\" >=", value, "productRateben");
            return (Criteria) this;
        }

        public Criteria andProductRatebenLessThan(String value) {
            addCriterion("\"PRODUCT_RATEBEN\" <", value, "productRateben");
            return (Criteria) this;
        }

        public Criteria andProductRatebenLessThanOrEqualTo(String value) {
            addCriterion("\"PRODUCT_RATEBEN\" <=", value, "productRateben");
            return (Criteria) this;
        }

        public Criteria andProductRatebenLike(String value) {
            addCriterion("\"PRODUCT_RATEBEN\" like", value, "productRateben");
            return (Criteria) this;
        }

        public Criteria andProductRatebenNotLike(String value) {
            addCriterion("\"PRODUCT_RATEBEN\" not like", value, "productRateben");
            return (Criteria) this;
        }

        public Criteria andProductRatebenIn(List<String> values) {
            addCriterion("\"PRODUCT_RATEBEN\" in", values, "productRateben");
            return (Criteria) this;
        }

        public Criteria andProductRatebenNotIn(List<String> values) {
            addCriterion("\"PRODUCT_RATEBEN\" not in", values, "productRateben");
            return (Criteria) this;
        }

        public Criteria andProductRatebenBetween(String value1, String value2) {
            addCriterion("\"PRODUCT_RATEBEN\" between", value1, value2, "productRateben");
            return (Criteria) this;
        }

        public Criteria andProductRatebenNotBetween(String value1, String value2) {
            addCriterion("\"PRODUCT_RATEBEN\" not between", value1, value2, "productRateben");
            return (Criteria) this;
        }

        public Criteria andProductPublishTimeIsNull() {
            addCriterion("\"PRODUCT_PUBLISH_TIME\" is null");
            return (Criteria) this;
        }

        public Criteria andProductPublishTimeIsNotNull() {
            addCriterion("\"PRODUCT_PUBLISH_TIME\" is not null");
            return (Criteria) this;
        }

        public Criteria andProductPublishTimeEqualTo(Date value) {
            addCriterion("\"PRODUCT_PUBLISH_TIME\" =", value, "productPublishTime");
            return (Criteria) this;
        }

        public Criteria andProductPublishTimeNotEqualTo(Date value) {
            addCriterion("\"PRODUCT_PUBLISH_TIME\" <>", value, "productPublishTime");
            return (Criteria) this;
        }

        public Criteria andProductPublishTimeGreaterThan(Date value) {
            addCriterion("\"PRODUCT_PUBLISH_TIME\" >", value, "productPublishTime");
            return (Criteria) this;
        }

        public Criteria andProductPublishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("\"PRODUCT_PUBLISH_TIME\" >=", value, "productPublishTime");
            return (Criteria) this;
        }

        public Criteria andProductPublishTimeLessThan(Date value) {
            addCriterion("\"PRODUCT_PUBLISH_TIME\" <", value, "productPublishTime");
            return (Criteria) this;
        }

        public Criteria andProductPublishTimeLessThanOrEqualTo(Date value) {
            addCriterion("\"PRODUCT_PUBLISH_TIME\" <=", value, "productPublishTime");
            return (Criteria) this;
        }

        public Criteria andProductPublishTimeIn(List<Date> values) {
            addCriterion("\"PRODUCT_PUBLISH_TIME\" in", values, "productPublishTime");
            return (Criteria) this;
        }

        public Criteria andProductPublishTimeNotIn(List<Date> values) {
            addCriterion("\"PRODUCT_PUBLISH_TIME\" not in", values, "productPublishTime");
            return (Criteria) this;
        }

        public Criteria andProductPublishTimeBetween(Date value1, Date value2) {
            addCriterion("\"PRODUCT_PUBLISH_TIME\" between", value1, value2, "productPublishTime");
            return (Criteria) this;
        }

        public Criteria andProductPublishTimeNotBetween(Date value1, Date value2) {
            addCriterion("\"PRODUCT_PUBLISH_TIME\" not between", value1, value2, "productPublishTime");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("\"PRODUCT_NAME\" is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("\"PRODUCT_NAME\" is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("\"PRODUCT_NAME\" =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("\"PRODUCT_NAME\" <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("\"PRODUCT_NAME\" >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("\"PRODUCT_NAME\" >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("\"PRODUCT_NAME\" <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("\"PRODUCT_NAME\" <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("\"PRODUCT_NAME\" like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("\"PRODUCT_NAME\" not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("\"PRODUCT_NAME\" in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("\"PRODUCT_NAME\" not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("\"PRODUCT_NAME\" between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("\"PRODUCT_NAME\" not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductTotalMoneyIsNull() {
            addCriterion("\"PRODUCT_TOTAL_MONEY\" is null");
            return (Criteria) this;
        }

        public Criteria andProductTotalMoneyIsNotNull() {
            addCriterion("\"PRODUCT_TOTAL_MONEY\" is not null");
            return (Criteria) this;
        }

        public Criteria andProductTotalMoneyEqualTo(BigDecimal value) {
            addCriterion("\"PRODUCT_TOTAL_MONEY\" =", value, "productTotalMoney");
            return (Criteria) this;
        }

        public Criteria andProductTotalMoneyNotEqualTo(BigDecimal value) {
            addCriterion("\"PRODUCT_TOTAL_MONEY\" <>", value, "productTotalMoney");
            return (Criteria) this;
        }

        public Criteria andProductTotalMoneyGreaterThan(BigDecimal value) {
            addCriterion("\"PRODUCT_TOTAL_MONEY\" >", value, "productTotalMoney");
            return (Criteria) this;
        }

        public Criteria andProductTotalMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("\"PRODUCT_TOTAL_MONEY\" >=", value, "productTotalMoney");
            return (Criteria) this;
        }

        public Criteria andProductTotalMoneyLessThan(BigDecimal value) {
            addCriterion("\"PRODUCT_TOTAL_MONEY\" <", value, "productTotalMoney");
            return (Criteria) this;
        }

        public Criteria andProductTotalMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("\"PRODUCT_TOTAL_MONEY\" <=", value, "productTotalMoney");
            return (Criteria) this;
        }

        public Criteria andProductTotalMoneyIn(List<BigDecimal> values) {
            addCriterion("\"PRODUCT_TOTAL_MONEY\" in", values, "productTotalMoney");
            return (Criteria) this;
        }

        public Criteria andProductTotalMoneyNotIn(List<BigDecimal> values) {
            addCriterion("\"PRODUCT_TOTAL_MONEY\" not in", values, "productTotalMoney");
            return (Criteria) this;
        }

        public Criteria andProductTotalMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("\"PRODUCT_TOTAL_MONEY\" between", value1, value2, "productTotalMoney");
            return (Criteria) this;
        }

        public Criteria andProductTotalMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("\"PRODUCT_TOTAL_MONEY\" not between", value1, value2, "productTotalMoney");
            return (Criteria) this;
        }

        public Criteria andInvestmentScopeIsNull() {
            addCriterion("\"INVESTMENT_SCOPE\" is null");
            return (Criteria) this;
        }

        public Criteria andInvestmentScopeIsNotNull() {
            addCriterion("\"INVESTMENT_SCOPE\" is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmentScopeEqualTo(String value) {
            addCriterion("\"INVESTMENT_SCOPE\" =", value, "investmentScope");
            return (Criteria) this;
        }

        public Criteria andInvestmentScopeNotEqualTo(String value) {
            addCriterion("\"INVESTMENT_SCOPE\" <>", value, "investmentScope");
            return (Criteria) this;
        }

        public Criteria andInvestmentScopeGreaterThan(String value) {
            addCriterion("\"INVESTMENT_SCOPE\" >", value, "investmentScope");
            return (Criteria) this;
        }

        public Criteria andInvestmentScopeGreaterThanOrEqualTo(String value) {
            addCriterion("\"INVESTMENT_SCOPE\" >=", value, "investmentScope");
            return (Criteria) this;
        }

        public Criteria andInvestmentScopeLessThan(String value) {
            addCriterion("\"INVESTMENT_SCOPE\" <", value, "investmentScope");
            return (Criteria) this;
        }

        public Criteria andInvestmentScopeLessThanOrEqualTo(String value) {
            addCriterion("\"INVESTMENT_SCOPE\" <=", value, "investmentScope");
            return (Criteria) this;
        }

        public Criteria andInvestmentScopeLike(String value) {
            addCriterion("\"INVESTMENT_SCOPE\" like", value, "investmentScope");
            return (Criteria) this;
        }

        public Criteria andInvestmentScopeNotLike(String value) {
            addCriterion("\"INVESTMENT_SCOPE\" not like", value, "investmentScope");
            return (Criteria) this;
        }

        public Criteria andInvestmentScopeIn(List<String> values) {
            addCriterion("\"INVESTMENT_SCOPE\" in", values, "investmentScope");
            return (Criteria) this;
        }

        public Criteria andInvestmentScopeNotIn(List<String> values) {
            addCriterion("\"INVESTMENT_SCOPE\" not in", values, "investmentScope");
            return (Criteria) this;
        }

        public Criteria andInvestmentScopeBetween(String value1, String value2) {
            addCriterion("\"INVESTMENT_SCOPE\" between", value1, value2, "investmentScope");
            return (Criteria) this;
        }

        public Criteria andInvestmentScopeNotBetween(String value1, String value2) {
            addCriterion("\"INVESTMENT_SCOPE\" not between", value1, value2, "investmentScope");
            return (Criteria) this;
        }

        public Criteria andUseOfProceedsIsNull() {
            addCriterion("\"USE_OF_PROCEEDS\" is null");
            return (Criteria) this;
        }

        public Criteria andUseOfProceedsIsNotNull() {
            addCriterion("\"USE_OF_PROCEEDS\" is not null");
            return (Criteria) this;
        }

        public Criteria andUseOfProceedsEqualTo(String value) {
            addCriterion("\"USE_OF_PROCEEDS\" =", value, "useOfProceeds");
            return (Criteria) this;
        }

        public Criteria andUseOfProceedsNotEqualTo(String value) {
            addCriterion("\"USE_OF_PROCEEDS\" <>", value, "useOfProceeds");
            return (Criteria) this;
        }

        public Criteria andUseOfProceedsGreaterThan(String value) {
            addCriterion("\"USE_OF_PROCEEDS\" >", value, "useOfProceeds");
            return (Criteria) this;
        }

        public Criteria andUseOfProceedsGreaterThanOrEqualTo(String value) {
            addCriterion("\"USE_OF_PROCEEDS\" >=", value, "useOfProceeds");
            return (Criteria) this;
        }

        public Criteria andUseOfProceedsLessThan(String value) {
            addCriterion("\"USE_OF_PROCEEDS\" <", value, "useOfProceeds");
            return (Criteria) this;
        }

        public Criteria andUseOfProceedsLessThanOrEqualTo(String value) {
            addCriterion("\"USE_OF_PROCEEDS\" <=", value, "useOfProceeds");
            return (Criteria) this;
        }

        public Criteria andUseOfProceedsLike(String value) {
            addCriterion("\"USE_OF_PROCEEDS\" like", value, "useOfProceeds");
            return (Criteria) this;
        }

        public Criteria andUseOfProceedsNotLike(String value) {
            addCriterion("\"USE_OF_PROCEEDS\" not like", value, "useOfProceeds");
            return (Criteria) this;
        }

        public Criteria andUseOfProceedsIn(List<String> values) {
            addCriterion("\"USE_OF_PROCEEDS\" in", values, "useOfProceeds");
            return (Criteria) this;
        }

        public Criteria andUseOfProceedsNotIn(List<String> values) {
            addCriterion("\"USE_OF_PROCEEDS\" not in", values, "useOfProceeds");
            return (Criteria) this;
        }

        public Criteria andUseOfProceedsBetween(String value1, String value2) {
            addCriterion("\"USE_OF_PROCEEDS\" between", value1, value2, "useOfProceeds");
            return (Criteria) this;
        }

        public Criteria andUseOfProceedsNotBetween(String value1, String value2) {
            addCriterion("\"USE_OF_PROCEEDS\" not between", value1, value2, "useOfProceeds");
            return (Criteria) this;
        }

        public Criteria andProductStateIsNull() {
            addCriterion("\"PRODUCT_STATE\" is null");
            return (Criteria) this;
        }

        public Criteria andProductStateIsNotNull() {
            addCriterion("\"PRODUCT_STATE\" is not null");
            return (Criteria) this;
        }

        public Criteria andProductStateEqualTo(String value) {
            addCriterion("\"PRODUCT_STATE\" =", value, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateNotEqualTo(String value) {
            addCriterion("\"PRODUCT_STATE\" <>", value, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateGreaterThan(String value) {
            addCriterion("\"PRODUCT_STATE\" >", value, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateGreaterThanOrEqualTo(String value) {
            addCriterion("\"PRODUCT_STATE\" >=", value, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateLessThan(String value) {
            addCriterion("\"PRODUCT_STATE\" <", value, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateLessThanOrEqualTo(String value) {
            addCriterion("\"PRODUCT_STATE\" <=", value, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateLike(String value) {
            addCriterion("\"PRODUCT_STATE\" like", value, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateNotLike(String value) {
            addCriterion("\"PRODUCT_STATE\" not like", value, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateIn(List<String> values) {
            addCriterion("\"PRODUCT_STATE\" in", values, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateNotIn(List<String> values) {
            addCriterion("\"PRODUCT_STATE\" not in", values, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateBetween(String value1, String value2) {
            addCriterion("\"PRODUCT_STATE\" between", value1, value2, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateNotBetween(String value1, String value2) {
            addCriterion("\"PRODUCT_STATE\" not between", value1, value2, "productState");
            return (Criteria) this;
        }

        public Criteria andProductPictureIsNull() {
            addCriterion("\"PRODUCT_PICTURE\" is null");
            return (Criteria) this;
        }

        public Criteria andProductPictureIsNotNull() {
            addCriterion("\"PRODUCT_PICTURE\" is not null");
            return (Criteria) this;
        }

        public Criteria andProductPictureEqualTo(String value) {
            addCriterion("\"PRODUCT_PICTURE\" =", value, "productPicture");
            return (Criteria) this;
        }

        public Criteria andProductPictureNotEqualTo(String value) {
            addCriterion("\"PRODUCT_PICTURE\" <>", value, "productPicture");
            return (Criteria) this;
        }

        public Criteria andProductPictureGreaterThan(String value) {
            addCriterion("\"PRODUCT_PICTURE\" >", value, "productPicture");
            return (Criteria) this;
        }

        public Criteria andProductPictureGreaterThanOrEqualTo(String value) {
            addCriterion("\"PRODUCT_PICTURE\" >=", value, "productPicture");
            return (Criteria) this;
        }

        public Criteria andProductPictureLessThan(String value) {
            addCriterion("\"PRODUCT_PICTURE\" <", value, "productPicture");
            return (Criteria) this;
        }

        public Criteria andProductPictureLessThanOrEqualTo(String value) {
            addCriterion("\"PRODUCT_PICTURE\" <=", value, "productPicture");
            return (Criteria) this;
        }

        public Criteria andProductPictureLike(String value) {
            addCriterion("\"PRODUCT_PICTURE\" like", value, "productPicture");
            return (Criteria) this;
        }

        public Criteria andProductPictureNotLike(String value) {
            addCriterion("\"PRODUCT_PICTURE\" not like", value, "productPicture");
            return (Criteria) this;
        }

        public Criteria andProductPictureIn(List<String> values) {
            addCriterion("\"PRODUCT_PICTURE\" in", values, "productPicture");
            return (Criteria) this;
        }

        public Criteria andProductPictureNotIn(List<String> values) {
            addCriterion("\"PRODUCT_PICTURE\" not in", values, "productPicture");
            return (Criteria) this;
        }

        public Criteria andProductPictureBetween(String value1, String value2) {
            addCriterion("\"PRODUCT_PICTURE\" between", value1, value2, "productPicture");
            return (Criteria) this;
        }

        public Criteria andProductPictureNotBetween(String value1, String value2) {
            addCriterion("\"PRODUCT_PICTURE\" not between", value1, value2, "productPicture");
            return (Criteria) this;
        }

        public Criteria andProduceIdIsNull() {
            addCriterion("\"PRODUCE_ID\" is null");
            return (Criteria) this;
        }

        public Criteria andProduceIdIsNotNull() {
            addCriterion("\"PRODUCE_ID\" is not null");
            return (Criteria) this;
        }

        public Criteria andProduceIdEqualTo(String value) {
            addCriterion("\"PRODUCE_ID\" =", value, "produceId");
            return (Criteria) this;
        }

        public Criteria andProduceIdNotEqualTo(String value) {
            addCriterion("\"PRODUCE_ID\" <>", value, "produceId");
            return (Criteria) this;
        }

        public Criteria andProduceIdGreaterThan(String value) {
            addCriterion("\"PRODUCE_ID\" >", value, "produceId");
            return (Criteria) this;
        }

        public Criteria andProduceIdGreaterThanOrEqualTo(String value) {
            addCriterion("\"PRODUCE_ID\" >=", value, "produceId");
            return (Criteria) this;
        }

        public Criteria andProduceIdLessThan(String value) {
            addCriterion("\"PRODUCE_ID\" <", value, "produceId");
            return (Criteria) this;
        }

        public Criteria andProduceIdLessThanOrEqualTo(String value) {
            addCriterion("\"PRODUCE_ID\" <=", value, "produceId");
            return (Criteria) this;
        }

        public Criteria andProduceIdLike(String value) {
            addCriterion("\"PRODUCE_ID\" like", value, "produceId");
            return (Criteria) this;
        }

        public Criteria andProduceIdNotLike(String value) {
            addCriterion("\"PRODUCE_ID\" not like", value, "produceId");
            return (Criteria) this;
        }

        public Criteria andProduceIdIn(List<String> values) {
            addCriterion("\"PRODUCE_ID\" in", values, "produceId");
            return (Criteria) this;
        }

        public Criteria andProduceIdNotIn(List<String> values) {
            addCriterion("\"PRODUCE_ID\" not in", values, "produceId");
            return (Criteria) this;
        }

        public Criteria andProduceIdBetween(String value1, String value2) {
            addCriterion("\"PRODUCE_ID\" between", value1, value2, "produceId");
            return (Criteria) this;
        }

        public Criteria andProduceIdNotBetween(String value1, String value2) {
            addCriterion("\"PRODUCE_ID\" not between", value1, value2, "produceId");
            return (Criteria) this;
        }

        public Criteria andProductDescIsNull() {
            addCriterion("\"PRODUCT_DESC\" is null");
            return (Criteria) this;
        }

        public Criteria andProductDescIsNotNull() {
            addCriterion("\"PRODUCT_DESC\" is not null");
            return (Criteria) this;
        }

        public Criteria andProductDescEqualTo(String value) {
            addCriterion("\"PRODUCT_DESC\" =", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotEqualTo(String value) {
            addCriterion("\"PRODUCT_DESC\" <>", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescGreaterThan(String value) {
            addCriterion("\"PRODUCT_DESC\" >", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescGreaterThanOrEqualTo(String value) {
            addCriterion("\"PRODUCT_DESC\" >=", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescLessThan(String value) {
            addCriterion("\"PRODUCT_DESC\" <", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescLessThanOrEqualTo(String value) {
            addCriterion("\"PRODUCT_DESC\" <=", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescLike(String value) {
            addCriterion("\"PRODUCT_DESC\" like", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotLike(String value) {
            addCriterion("\"PRODUCT_DESC\" not like", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescIn(List<String> values) {
            addCriterion("\"PRODUCT_DESC\" in", values, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotIn(List<String> values) {
            addCriterion("\"PRODUCT_DESC\" not in", values, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescBetween(String value1, String value2) {
            addCriterion("\"PRODUCT_DESC\" between", value1, value2, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotBetween(String value1, String value2) {
            addCriterion("\"PRODUCT_DESC\" not between", value1, value2, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductSafeIsNull() {
            addCriterion("\"PRODUCT_SAFE\" is null");
            return (Criteria) this;
        }

        public Criteria andProductSafeIsNotNull() {
            addCriterion("\"PRODUCT_SAFE\" is not null");
            return (Criteria) this;
        }

        public Criteria andProductSafeEqualTo(String value) {
            addCriterion("\"PRODUCT_SAFE\" =", value, "productSafe");
            return (Criteria) this;
        }

        public Criteria andProductSafeNotEqualTo(String value) {
            addCriterion("\"PRODUCT_SAFE\" <>", value, "productSafe");
            return (Criteria) this;
        }

        public Criteria andProductSafeGreaterThan(String value) {
            addCriterion("\"PRODUCT_SAFE\" >", value, "productSafe");
            return (Criteria) this;
        }

        public Criteria andProductSafeGreaterThanOrEqualTo(String value) {
            addCriterion("\"PRODUCT_SAFE\" >=", value, "productSafe");
            return (Criteria) this;
        }

        public Criteria andProductSafeLessThan(String value) {
            addCriterion("\"PRODUCT_SAFE\" <", value, "productSafe");
            return (Criteria) this;
        }

        public Criteria andProductSafeLessThanOrEqualTo(String value) {
            addCriterion("\"PRODUCT_SAFE\" <=", value, "productSafe");
            return (Criteria) this;
        }

        public Criteria andProductSafeLike(String value) {
            addCriterion("\"PRODUCT_SAFE\" like", value, "productSafe");
            return (Criteria) this;
        }

        public Criteria andProductSafeNotLike(String value) {
            addCriterion("\"PRODUCT_SAFE\" not like", value, "productSafe");
            return (Criteria) this;
        }

        public Criteria andProductSafeIn(List<String> values) {
            addCriterion("\"PRODUCT_SAFE\" in", values, "productSafe");
            return (Criteria) this;
        }

        public Criteria andProductSafeNotIn(List<String> values) {
            addCriterion("\"PRODUCT_SAFE\" not in", values, "productSafe");
            return (Criteria) this;
        }

        public Criteria andProductSafeBetween(String value1, String value2) {
            addCriterion("\"PRODUCT_SAFE\" between", value1, value2, "productSafe");
            return (Criteria) this;
        }

        public Criteria andProductSafeNotBetween(String value1, String value2) {
            addCriterion("\"PRODUCT_SAFE\" not between", value1, value2, "productSafe");
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