package com.share.golden.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BasInvestmentInformationExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public BasInvestmentInformationExample() {
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

		public Criteria andInvestorIdIsNull() {
			addCriterion("\"INVESTOR_ID\" is null");
			return (Criteria) this;
		}

		public Criteria andInvestorIdIsNotNull() {
			addCriterion("\"INVESTOR_ID\" is not null");
			return (Criteria) this;
		}

		public Criteria andInvestorIdEqualTo(String value) {
			addCriterion("\"INVESTOR_ID\" =", value, "investorId");
			return (Criteria) this;
		}

		public Criteria andInvestorIdNotEqualTo(String value) {
			addCriterion("\"INVESTOR_ID\" <>", value, "investorId");
			return (Criteria) this;
		}

		public Criteria andInvestorIdGreaterThan(String value) {
			addCriterion("\"INVESTOR_ID\" >", value, "investorId");
			return (Criteria) this;
		}

		public Criteria andInvestorIdGreaterThanOrEqualTo(String value) {
			addCriterion("\"INVESTOR_ID\" >=", value, "investorId");
			return (Criteria) this;
		}

		public Criteria andInvestorIdLessThan(String value) {
			addCriterion("\"INVESTOR_ID\" <", value, "investorId");
			return (Criteria) this;
		}

		public Criteria andInvestorIdLessThanOrEqualTo(String value) {
			addCriterion("\"INVESTOR_ID\" <=", value, "investorId");
			return (Criteria) this;
		}

		public Criteria andInvestorIdLike(String value) {
			addCriterion("\"INVESTOR_ID\" like", value, "investorId");
			return (Criteria) this;
		}

		public Criteria andInvestorIdNotLike(String value) {
			addCriterion("\"INVESTOR_ID\" not like", value, "investorId");
			return (Criteria) this;
		}

		public Criteria andInvestorIdIn(List<String> values) {
			addCriterion("\"INVESTOR_ID\" in", values, "investorId");
			return (Criteria) this;
		}

		public Criteria andInvestorIdNotIn(List<String> values) {
			addCriterion("\"INVESTOR_ID\" not in", values, "investorId");
			return (Criteria) this;
		}

		public Criteria andInvestorIdBetween(String value1, String value2) {
			addCriterion("\"INVESTOR_ID\" between", value1, value2, "investorId");
			return (Criteria) this;
		}

		public Criteria andInvestorIdNotBetween(String value1, String value2) {
			addCriterion("\"INVESTOR_ID\" not between", value1, value2, "investorId");
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

		public Criteria andTenderIdIsNull() {
			addCriterion("\"TENDER _ID\" is null");
			return (Criteria) this;
		}

		public Criteria andTenderIdIsNotNull() {
			addCriterion("\"TENDER _ID\" is not null");
			return (Criteria) this;
		}

		public Criteria andTenderIdEqualTo(String value) {
			addCriterion("\"TENDER _ID\" =", value, "tenderId");
			return (Criteria) this;
		}

		public Criteria andTenderIdNotEqualTo(String value) {
			addCriterion("\"TENDER _ID\" <>", value, "tenderId");
			return (Criteria) this;
		}

		public Criteria andTenderIdGreaterThan(String value) {
			addCriterion("\"TENDER _ID\" >", value, "tenderId");
			return (Criteria) this;
		}

		public Criteria andTenderIdGreaterThanOrEqualTo(String value) {
			addCriterion("\"TENDER _ID\" >=", value, "tenderId");
			return (Criteria) this;
		}

		public Criteria andTenderIdLessThan(String value) {
			addCriterion("\"TENDER _ID\" <", value, "tenderId");
			return (Criteria) this;
		}

		public Criteria andTenderIdLessThanOrEqualTo(String value) {
			addCriterion("\"TENDER _ID\" <=", value, "tenderId");
			return (Criteria) this;
		}

		public Criteria andTenderIdLike(String value) {
			addCriterion("\"TENDER _ID\" like", value, "tenderId");
			return (Criteria) this;
		}

		public Criteria andTenderIdNotLike(String value) {
			addCriterion("\"TENDER _ID\" not like", value, "tenderId");
			return (Criteria) this;
		}

		public Criteria andTenderIdIn(List<String> values) {
			addCriterion("\"TENDER _ID\" in", values, "tenderId");
			return (Criteria) this;
		}

		public Criteria andTenderIdNotIn(List<String> values) {
			addCriterion("\"TENDER _ID\" not in", values, "tenderId");
			return (Criteria) this;
		}

		public Criteria andTenderIdBetween(String value1, String value2) {
			addCriterion("\"TENDER _ID\" between", value1, value2, "tenderId");
			return (Criteria) this;
		}

		public Criteria andTenderIdNotBetween(String value1, String value2) {
			addCriterion("\"TENDER _ID\" not between", value1, value2, "tenderId");
			return (Criteria) this;
		}

		public Criteria andInvestorMoneyIsNull() {
			addCriterion("\"INVESTOR_MONEY\" is null");
			return (Criteria) this;
		}

		public Criteria andInvestorMoneyIsNotNull() {
			addCriterion("\"INVESTOR_MONEY\" is not null");
			return (Criteria) this;
		}

		public Criteria andInvestorMoneyEqualTo(BigDecimal value) {
			addCriterion("\"INVESTOR_MONEY\" =", value, "investorMoney");
			return (Criteria) this;
		}

		public Criteria andInvestorMoneyNotEqualTo(BigDecimal value) {
			addCriterion("\"INVESTOR_MONEY\" <>", value, "investorMoney");
			return (Criteria) this;
		}

		public Criteria andInvestorMoneyGreaterThan(BigDecimal value) {
			addCriterion("\"INVESTOR_MONEY\" >", value, "investorMoney");
			return (Criteria) this;
		}

		public Criteria andInvestorMoneyGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("\"INVESTOR_MONEY\" >=", value, "investorMoney");
			return (Criteria) this;
		}

		public Criteria andInvestorMoneyLessThan(BigDecimal value) {
			addCriterion("\"INVESTOR_MONEY\" <", value, "investorMoney");
			return (Criteria) this;
		}

		public Criteria andInvestorMoneyLessThanOrEqualTo(BigDecimal value) {
			addCriterion("\"INVESTOR_MONEY\" <=", value, "investorMoney");
			return (Criteria) this;
		}

		public Criteria andInvestorMoneyIn(List<BigDecimal> values) {
			addCriterion("\"INVESTOR_MONEY\" in", values, "investorMoney");
			return (Criteria) this;
		}

		public Criteria andInvestorMoneyNotIn(List<BigDecimal> values) {
			addCriterion("\"INVESTOR_MONEY\" not in", values, "investorMoney");
			return (Criteria) this;
		}

		public Criteria andInvestorMoneyBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("\"INVESTOR_MONEY\" between", value1, value2, "investorMoney");
			return (Criteria) this;
		}

		public Criteria andInvestorMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("\"INVESTOR_MONEY\" not between", value1, value2, "investorMoney");
			return (Criteria) this;
		}

		public Criteria andInvestorStatusIsNull() {
			addCriterion("\"INVESTOR_STATUS\" is null");
			return (Criteria) this;
		}

		public Criteria andInvestorStatusIsNotNull() {
			addCriterion("\"INVESTOR_STATUS\" is not null");
			return (Criteria) this;
		}

		public Criteria andInvestorStatusEqualTo(String value) {
			addCriterion("\"INVESTOR_STATUS\" =", value, "investorStatus");
			return (Criteria) this;
		}

		public Criteria andInvestorStatusNotEqualTo(String value) {
			addCriterion("\"INVESTOR_STATUS\" <>", value, "investorStatus");
			return (Criteria) this;
		}

		public Criteria andInvestorStatusGreaterThan(String value) {
			addCriterion("\"INVESTOR_STATUS\" >", value, "investorStatus");
			return (Criteria) this;
		}

		public Criteria andInvestorStatusGreaterThanOrEqualTo(String value) {
			addCriterion("\"INVESTOR_STATUS\" >=", value, "investorStatus");
			return (Criteria) this;
		}

		public Criteria andInvestorStatusLessThan(String value) {
			addCriterion("\"INVESTOR_STATUS\" <", value, "investorStatus");
			return (Criteria) this;
		}

		public Criteria andInvestorStatusLessThanOrEqualTo(String value) {
			addCriterion("\"INVESTOR_STATUS\" <=", value, "investorStatus");
			return (Criteria) this;
		}

		public Criteria andInvestorStatusLike(String value) {
			addCriterion("\"INVESTOR_STATUS\" like", value, "investorStatus");
			return (Criteria) this;
		}

		public Criteria andInvestorStatusNotLike(String value) {
			addCriterion("\"INVESTOR_STATUS\" not like", value, "investorStatus");
			return (Criteria) this;
		}

		public Criteria andInvestorStatusIn(List<String> values) {
			addCriterion("\"INVESTOR_STATUS\" in", values, "investorStatus");
			return (Criteria) this;
		}

		public Criteria andInvestorStatusNotIn(List<String> values) {
			addCriterion("\"INVESTOR_STATUS\" not in", values, "investorStatus");
			return (Criteria) this;
		}

		public Criteria andInvestorStatusBetween(String value1, String value2) {
			addCriterion("\"INVESTOR_STATUS\" between", value1, value2, "investorStatus");
			return (Criteria) this;
		}

		public Criteria andInvestorStatusNotBetween(String value1, String value2) {
			addCriterion("\"INVESTOR_STATUS\" not between", value1, value2, "investorStatus");
			return (Criteria) this;
		}

		public Criteria andInvestorStyleIsNull() {
			addCriterion("\"INVESTOR_STYLE\" is null");
			return (Criteria) this;
		}

		public Criteria andInvestorStyleIsNotNull() {
			addCriterion("\"INVESTOR_STYLE\" is not null");
			return (Criteria) this;
		}

		public Criteria andInvestorStyleEqualTo(String value) {
			addCriterion("\"INVESTOR_STYLE\" =", value, "investorStyle");
			return (Criteria) this;
		}

		public Criteria andInvestorStyleNotEqualTo(String value) {
			addCriterion("\"INVESTOR_STYLE\" <>", value, "investorStyle");
			return (Criteria) this;
		}

		public Criteria andInvestorStyleGreaterThan(String value) {
			addCriterion("\"INVESTOR_STYLE\" >", value, "investorStyle");
			return (Criteria) this;
		}

		public Criteria andInvestorStyleGreaterThanOrEqualTo(String value) {
			addCriterion("\"INVESTOR_STYLE\" >=", value, "investorStyle");
			return (Criteria) this;
		}

		public Criteria andInvestorStyleLessThan(String value) {
			addCriterion("\"INVESTOR_STYLE\" <", value, "investorStyle");
			return (Criteria) this;
		}

		public Criteria andInvestorStyleLessThanOrEqualTo(String value) {
			addCriterion("\"INVESTOR_STYLE\" <=", value, "investorStyle");
			return (Criteria) this;
		}

		public Criteria andInvestorStyleLike(String value) {
			addCriterion("\"INVESTOR_STYLE\" like", value, "investorStyle");
			return (Criteria) this;
		}

		public Criteria andInvestorStyleNotLike(String value) {
			addCriterion("\"INVESTOR_STYLE\" not like", value, "investorStyle");
			return (Criteria) this;
		}

		public Criteria andInvestorStyleIn(List<String> values) {
			addCriterion("\"INVESTOR_STYLE\" in", values, "investorStyle");
			return (Criteria) this;
		}

		public Criteria andInvestorStyleNotIn(List<String> values) {
			addCriterion("\"INVESTOR_STYLE\" not in", values, "investorStyle");
			return (Criteria) this;
		}

		public Criteria andInvestorStyleBetween(String value1, String value2) {
			addCriterion("\"INVESTOR_STYLE\" between", value1, value2, "investorStyle");
			return (Criteria) this;
		}

		public Criteria andInvestorStyleNotBetween(String value1, String value2) {
			addCriterion("\"INVESTOR_STYLE\" not between", value1, value2, "investorStyle");
			return (Criteria) this;
		}

		public Criteria andBrrowStatusIsNull() {
			addCriterion("\"BRROW_STATUS\" is null");
			return (Criteria) this;
		}

		public Criteria andBrrowStatusIsNotNull() {
			addCriterion("\"BRROW_STATUS\" is not null");
			return (Criteria) this;
		}

		public Criteria andBrrowStatusEqualTo(String value) {
			addCriterion("\"BRROW_STATUS\" =", value, "brrowStatus");
			return (Criteria) this;
		}

		public Criteria andBrrowStatusNotEqualTo(String value) {
			addCriterion("\"BRROW_STATUS\" <>", value, "brrowStatus");
			return (Criteria) this;
		}

		public Criteria andBrrowStatusGreaterThan(String value) {
			addCriterion("\"BRROW_STATUS\" >", value, "brrowStatus");
			return (Criteria) this;
		}

		public Criteria andBrrowStatusGreaterThanOrEqualTo(String value) {
			addCriterion("\"BRROW_STATUS\" >=", value, "brrowStatus");
			return (Criteria) this;
		}

		public Criteria andBrrowStatusLessThan(String value) {
			addCriterion("\"BRROW_STATUS\" <", value, "brrowStatus");
			return (Criteria) this;
		}

		public Criteria andBrrowStatusLessThanOrEqualTo(String value) {
			addCriterion("\"BRROW_STATUS\" <=", value, "brrowStatus");
			return (Criteria) this;
		}

		public Criteria andBrrowStatusLike(String value) {
			addCriterion("\"BRROW_STATUS\" like", value, "brrowStatus");
			return (Criteria) this;
		}

		public Criteria andBrrowStatusNotLike(String value) {
			addCriterion("\"BRROW_STATUS\" not like", value, "brrowStatus");
			return (Criteria) this;
		}

		public Criteria andBrrowStatusIn(List<String> values) {
			addCriterion("\"BRROW_STATUS\" in", values, "brrowStatus");
			return (Criteria) this;
		}

		public Criteria andBrrowStatusNotIn(List<String> values) {
			addCriterion("\"BRROW_STATUS\" not in", values, "brrowStatus");
			return (Criteria) this;
		}

		public Criteria andBrrowStatusBetween(String value1, String value2) {
			addCriterion("\"BRROW_STATUS\" between", value1, value2, "brrowStatus");
			return (Criteria) this;
		}

		public Criteria andBrrowStatusNotBetween(String value1, String value2) {
			addCriterion("\"BRROW_STATUS\" not between", value1, value2, "brrowStatus");
			return (Criteria) this;
		}

		public Criteria andInvestorRestIsNull() {
			addCriterion("\"INVESTOR_REST\" is null");
			return (Criteria) this;
		}

		public Criteria andInvestorRestIsNotNull() {
			addCriterion("\"INVESTOR_REST\" is not null");
			return (Criteria) this;
		}

		public Criteria andInvestorRestEqualTo(String value) {
			addCriterion("\"INVESTOR_REST\" =", value, "investorRest");
			return (Criteria) this;
		}

		public Criteria andInvestorRestNotEqualTo(String value) {
			addCriterion("\"INVESTOR_REST\" <>", value, "investorRest");
			return (Criteria) this;
		}

		public Criteria andInvestorRestGreaterThan(String value) {
			addCriterion("\"INVESTOR_REST\" >", value, "investorRest");
			return (Criteria) this;
		}

		public Criteria andInvestorRestGreaterThanOrEqualTo(String value) {
			addCriterion("\"INVESTOR_REST\" >=", value, "investorRest");
			return (Criteria) this;
		}

		public Criteria andInvestorRestLessThan(String value) {
			addCriterion("\"INVESTOR_REST\" <", value, "investorRest");
			return (Criteria) this;
		}

		public Criteria andInvestorRestLessThanOrEqualTo(String value) {
			addCriterion("\"INVESTOR_REST\" <=", value, "investorRest");
			return (Criteria) this;
		}

		public Criteria andInvestorRestLike(String value) {
			addCriterion("\"INVESTOR_REST\" like", value, "investorRest");
			return (Criteria) this;
		}

		public Criteria andInvestorRestNotLike(String value) {
			addCriterion("\"INVESTOR_REST\" not like", value, "investorRest");
			return (Criteria) this;
		}

		public Criteria andInvestorRestIn(List<String> values) {
			addCriterion("\"INVESTOR_REST\" in", values, "investorRest");
			return (Criteria) this;
		}

		public Criteria andInvestorRestNotIn(List<String> values) {
			addCriterion("\"INVESTOR_REST\" not in", values, "investorRest");
			return (Criteria) this;
		}

		public Criteria andInvestorRestBetween(String value1, String value2) {
			addCriterion("\"INVESTOR_REST\" between", value1, value2, "investorRest");
			return (Criteria) this;
		}

		public Criteria andInvestorRestNotBetween(String value1, String value2) {
			addCriterion("\"INVESTOR_REST\" not between", value1, value2, "investorRest");
			return (Criteria) this;
		}

		public Criteria andProfitModelIsNull() {
			addCriterion("\"PROFIT_MODEL\" is null");
			return (Criteria) this;
		}

		public Criteria andProfitModelIsNotNull() {
			addCriterion("\"PROFIT_MODEL\" is not null");
			return (Criteria) this;
		}

		public Criteria andProfitModelEqualTo(String value) {
			addCriterion("\"PROFIT_MODEL\" =", value, "profitModel");
			return (Criteria) this;
		}

		public Criteria andProfitModelNotEqualTo(String value) {
			addCriterion("\"PROFIT_MODEL\" <>", value, "profitModel");
			return (Criteria) this;
		}

		public Criteria andProfitModelGreaterThan(String value) {
			addCriterion("\"PROFIT_MODEL\" >", value, "profitModel");
			return (Criteria) this;
		}

		public Criteria andProfitModelGreaterThanOrEqualTo(String value) {
			addCriterion("\"PROFIT_MODEL\" >=", value, "profitModel");
			return (Criteria) this;
		}

		public Criteria andProfitModelLessThan(String value) {
			addCriterion("\"PROFIT_MODEL\" <", value, "profitModel");
			return (Criteria) this;
		}

		public Criteria andProfitModelLessThanOrEqualTo(String value) {
			addCriterion("\"PROFIT_MODEL\" <=", value, "profitModel");
			return (Criteria) this;
		}

		public Criteria andProfitModelLike(String value) {
			addCriterion("\"PROFIT_MODEL\" like", value, "profitModel");
			return (Criteria) this;
		}

		public Criteria andProfitModelNotLike(String value) {
			addCriterion("\"PROFIT_MODEL\" not like", value, "profitModel");
			return (Criteria) this;
		}

		public Criteria andProfitModelIn(List<String> values) {
			addCriterion("\"PROFIT_MODEL\" in", values, "profitModel");
			return (Criteria) this;
		}

		public Criteria andProfitModelNotIn(List<String> values) {
			addCriterion("\"PROFIT_MODEL\" not in", values, "profitModel");
			return (Criteria) this;
		}

		public Criteria andProfitModelBetween(String value1, String value2) {
			addCriterion("\"PROFIT_MODEL\" between", value1, value2, "profitModel");
			return (Criteria) this;
		}

		public Criteria andProfitModelNotBetween(String value1, String value2) {
			addCriterion("\"PROFIT_MODEL\" not between", value1, value2, "profitModel");
			return (Criteria) this;
		}

		public Criteria andProfitMoneyIsNull() {
			addCriterion("\"PROFIT_MONEY\" is null");
			return (Criteria) this;
		}

		public Criteria andProfitMoneyIsNotNull() {
			addCriterion("\"PROFIT_MONEY\" is not null");
			return (Criteria) this;
		}

		public Criteria andProfitMoneyEqualTo(BigDecimal value) {
			addCriterion("\"PROFIT_MONEY\" =", value, "profitMoney");
			return (Criteria) this;
		}

		public Criteria andProfitMoneyNotEqualTo(BigDecimal value) {
			addCriterion("\"PROFIT_MONEY\" <>", value, "profitMoney");
			return (Criteria) this;
		}

		public Criteria andProfitMoneyGreaterThan(BigDecimal value) {
			addCriterion("\"PROFIT_MONEY\" >", value, "profitMoney");
			return (Criteria) this;
		}

		public Criteria andProfitMoneyGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("\"PROFIT_MONEY\" >=", value, "profitMoney");
			return (Criteria) this;
		}

		public Criteria andProfitMoneyLessThan(BigDecimal value) {
			addCriterion("\"PROFIT_MONEY\" <", value, "profitMoney");
			return (Criteria) this;
		}

		public Criteria andProfitMoneyLessThanOrEqualTo(BigDecimal value) {
			addCriterion("\"PROFIT_MONEY\" <=", value, "profitMoney");
			return (Criteria) this;
		}

		public Criteria andProfitMoneyIn(List<BigDecimal> values) {
			addCriterion("\"PROFIT_MONEY\" in", values, "profitMoney");
			return (Criteria) this;
		}

		public Criteria andProfitMoneyNotIn(List<BigDecimal> values) {
			addCriterion("\"PROFIT_MONEY\" not in", values, "profitMoney");
			return (Criteria) this;
		}

		public Criteria andProfitMoneyBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("\"PROFIT_MONEY\" between", value1, value2, "profitMoney");
			return (Criteria) this;
		}

		public Criteria andProfitMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("\"PROFIT_MONEY\" not between", value1, value2, "profitMoney");
			return (Criteria) this;
		}

		public Criteria andInvestorDateIsNull() {
			addCriterion("\"INVESTOR_DATE\" is null");
			return (Criteria) this;
		}

		public Criteria andInvestorDateIsNotNull() {
			addCriterion("\"INVESTOR_DATE\" is not null");
			return (Criteria) this;
		}

		public Criteria andInvestorDateEqualTo(Date value) {
			addCriterion("\"INVESTOR_DATE\" =", value, "investorDate");
			return (Criteria) this;
		}

		public Criteria andInvestorDateNotEqualTo(Date value) {
			addCriterion("\"INVESTOR_DATE\" <>", value, "investorDate");
			return (Criteria) this;
		}

		public Criteria andInvestorDateGreaterThan(Date value) {
			addCriterion("\"INVESTOR_DATE\" >", value, "investorDate");
			return (Criteria) this;
		}

		public Criteria andInvestorDateGreaterThanOrEqualTo(Date value) {
			addCriterion("\"INVESTOR_DATE\" >=", value, "investorDate");
			return (Criteria) this;
		}

		public Criteria andInvestorDateLessThan(Date value) {
			addCriterion("\"INVESTOR_DATE\" <", value, "investorDate");
			return (Criteria) this;
		}

		public Criteria andInvestorDateLessThanOrEqualTo(Date value) {
			addCriterion("\"INVESTOR_DATE\" <=", value, "investorDate");
			return (Criteria) this;
		}

		public Criteria andInvestorDateIn(List<Date> values) {
			addCriterion("\"INVESTOR_DATE\" in", values, "investorDate");
			return (Criteria) this;
		}

		public Criteria andInvestorDateNotIn(List<Date> values) {
			addCriterion("\"INVESTOR_DATE\" not in", values, "investorDate");
			return (Criteria) this;
		}

		public Criteria andInvestorDateBetween(Date value1, Date value2) {
			addCriterion("\"INVESTOR_DATE\" between", value1, value2, "investorDate");
			return (Criteria) this;
		}

		public Criteria andInvestorDateNotBetween(Date value1, Date value2) {
			addCriterion("\"INVESTOR_DATE\" not between", value1, value2, "investorDate");
			return (Criteria) this;
		}

		public Criteria andReplayDateIsNull() {
			addCriterion("\"REPLAY_DATE\" is null");
			return (Criteria) this;
		}

		public Criteria andReplayDateIsNotNull() {
			addCriterion("\"REPLAY_DATE\" is not null");
			return (Criteria) this;
		}

		public Criteria andReplayDateEqualTo(String value) {
			addCriterion("\"REPLAY_DATE\" =", value, "replayDate");
			return (Criteria) this;
		}

		public Criteria andReplayDateNotEqualTo(String value) {
			addCriterion("\"REPLAY_DATE\" <>", value, "replayDate");
			return (Criteria) this;
		}

		public Criteria andReplayDateGreaterThan(String value) {
			addCriterion("\"REPLAY_DATE\" >", value, "replayDate");
			return (Criteria) this;
		}

		public Criteria andReplayDateGreaterThanOrEqualTo(String value) {
			addCriterion("\"REPLAY_DATE\" >=", value, "replayDate");
			return (Criteria) this;
		}

		public Criteria andReplayDateLessThan(String value) {
			addCriterion("\"REPLAY_DATE\" <", value, "replayDate");
			return (Criteria) this;
		}

		public Criteria andReplayDateLessThanOrEqualTo(String value) {
			addCriterion("\"REPLAY_DATE\" <=", value, "replayDate");
			return (Criteria) this;
		}

		public Criteria andReplayDateLike(String value) {
			addCriterion("\"REPLAY_DATE\" like", value, "replayDate");
			return (Criteria) this;
		}

		public Criteria andReplayDateNotLike(String value) {
			addCriterion("\"REPLAY_DATE\" not like", value, "replayDate");
			return (Criteria) this;
		}

		public Criteria andReplayDateIn(List<String> values) {
			addCriterion("\"REPLAY_DATE\" in", values, "replayDate");
			return (Criteria) this;
		}

		public Criteria andReplayDateNotIn(List<String> values) {
			addCriterion("\"REPLAY_DATE\" not in", values, "replayDate");
			return (Criteria) this;
		}

		public Criteria andReplayDateBetween(String value1, String value2) {
			addCriterion("\"REPLAY_DATE\" between", value1, value2, "replayDate");
			return (Criteria) this;
		}

		public Criteria andReplayDateNotBetween(String value1, String value2) {
			addCriterion("\"REPLAY_DATE\" not between", value1, value2, "replayDate");
			return (Criteria) this;
		}

		public Criteria andInvestorTypeIsNull() {
			addCriterion("\"INVESTOR_TYPE\" is null");
			return (Criteria) this;
		}

		public Criteria andInvestorTypeIsNotNull() {
			addCriterion("\"INVESTOR_TYPE\" is not null");
			return (Criteria) this;
		}

		public Criteria andInvestorTypeEqualTo(String value) {
			addCriterion("\"INVESTOR_TYPE\" =", value, "investorType");
			return (Criteria) this;
		}

		public Criteria andInvestorTypeNotEqualTo(String value) {
			addCriterion("\"INVESTOR_TYPE\" <>", value, "investorType");
			return (Criteria) this;
		}

		public Criteria andInvestorTypeGreaterThan(String value) {
			addCriterion("\"INVESTOR_TYPE\" >", value, "investorType");
			return (Criteria) this;
		}

		public Criteria andInvestorTypeGreaterThanOrEqualTo(String value) {
			addCriterion("\"INVESTOR_TYPE\" >=", value, "investorType");
			return (Criteria) this;
		}

		public Criteria andInvestorTypeLessThan(String value) {
			addCriterion("\"INVESTOR_TYPE\" <", value, "investorType");
			return (Criteria) this;
		}

		public Criteria andInvestorTypeLessThanOrEqualTo(String value) {
			addCriterion("\"INVESTOR_TYPE\" <=", value, "investorType");
			return (Criteria) this;
		}

		public Criteria andInvestorTypeLike(String value) {
			addCriterion("\"INVESTOR_TYPE\" like", value, "investorType");
			return (Criteria) this;
		}

		public Criteria andInvestorTypeNotLike(String value) {
			addCriterion("\"INVESTOR_TYPE\" not like", value, "investorType");
			return (Criteria) this;
		}

		public Criteria andInvestorTypeIn(List<String> values) {
			addCriterion("\"INVESTOR_TYPE\" in", values, "investorType");
			return (Criteria) this;
		}

		public Criteria andInvestorTypeNotIn(List<String> values) {
			addCriterion("\"INVESTOR_TYPE\" not in", values, "investorType");
			return (Criteria) this;
		}

		public Criteria andInvestorTypeBetween(String value1, String value2) {
			addCriterion("\"INVESTOR_TYPE\" between", value1, value2, "investorType");
			return (Criteria) this;
		}

		public Criteria andInvestorTypeNotBetween(String value1, String value2) {
			addCriterion("\"INVESTOR_TYPE\" not between", value1, value2, "investorType");
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