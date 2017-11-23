package com.share.golden.entity;

import java.util.ArrayList;
import java.util.List;

public class BasBorrowMoneyExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public BasBorrowMoneyExample() {
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

		public Criteria andBorrowIdIsNull() {
			addCriterion("\"BORROW_ID\" is null");
			return (Criteria) this;
		}

		public Criteria andBorrowIdIsNotNull() {
			addCriterion("\"BORROW_ID\" is not null");
			return (Criteria) this;
		}

		public Criteria andBorrowIdEqualTo(String value) {
			addCriterion("\"BORROW_ID\" =", value, "borrowId");
			return (Criteria) this;
		}

		public Criteria andBorrowIdNotEqualTo(String value) {
			addCriterion("\"BORROW_ID\" <>", value, "borrowId");
			return (Criteria) this;
		}

		public Criteria andBorrowIdGreaterThan(String value) {
			addCriterion("\"BORROW_ID\" >", value, "borrowId");
			return (Criteria) this;
		}

		public Criteria andBorrowIdGreaterThanOrEqualTo(String value) {
			addCriterion("\"BORROW_ID\" >=", value, "borrowId");
			return (Criteria) this;
		}

		public Criteria andBorrowIdLessThan(String value) {
			addCriterion("\"BORROW_ID\" <", value, "borrowId");
			return (Criteria) this;
		}

		public Criteria andBorrowIdLessThanOrEqualTo(String value) {
			addCriterion("\"BORROW_ID\" <=", value, "borrowId");
			return (Criteria) this;
		}

		public Criteria andBorrowIdLike(String value) {
			addCriterion("\"BORROW_ID\" like", value, "borrowId");
			return (Criteria) this;
		}

		public Criteria andBorrowIdNotLike(String value) {
			addCriterion("\"BORROW_ID\" not like", value, "borrowId");
			return (Criteria) this;
		}

		public Criteria andBorrowIdIn(List<String> values) {
			addCriterion("\"BORROW_ID\" in", values, "borrowId");
			return (Criteria) this;
		}

		public Criteria andBorrowIdNotIn(List<String> values) {
			addCriterion("\"BORROW_ID\" not in", values, "borrowId");
			return (Criteria) this;
		}

		public Criteria andBorrowIdBetween(String value1, String value2) {
			addCriterion("\"BORROW_ID\" between", value1, value2, "borrowId");
			return (Criteria) this;
		}

		public Criteria andBorrowIdNotBetween(String value1, String value2) {
			addCriterion("\"BORROW_ID\" not between", value1, value2, "borrowId");
			return (Criteria) this;
		}

		public Criteria andBorrowSerialIsNull() {
			addCriterion("\"BORROW_SERIAL\" is null");
			return (Criteria) this;
		}

		public Criteria andBorrowSerialIsNotNull() {
			addCriterion("\"BORROW_SERIAL\" is not null");
			return (Criteria) this;
		}

		public Criteria andBorrowSerialEqualTo(String value) {
			addCriterion("\"BORROW_SERIAL\" =", value, "borrowSerial");
			return (Criteria) this;
		}

		public Criteria andBorrowSerialNotEqualTo(String value) {
			addCriterion("\"BORROW_SERIAL\" <>", value, "borrowSerial");
			return (Criteria) this;
		}

		public Criteria andBorrowSerialGreaterThan(String value) {
			addCriterion("\"BORROW_SERIAL\" >", value, "borrowSerial");
			return (Criteria) this;
		}

		public Criteria andBorrowSerialGreaterThanOrEqualTo(String value) {
			addCriterion("\"BORROW_SERIAL\" >=", value, "borrowSerial");
			return (Criteria) this;
		}

		public Criteria andBorrowSerialLessThan(String value) {
			addCriterion("\"BORROW_SERIAL\" <", value, "borrowSerial");
			return (Criteria) this;
		}

		public Criteria andBorrowSerialLessThanOrEqualTo(String value) {
			addCriterion("\"BORROW_SERIAL\" <=", value, "borrowSerial");
			return (Criteria) this;
		}

		public Criteria andBorrowSerialLike(String value) {
			addCriterion("\"BORROW_SERIAL\" like", value, "borrowSerial");
			return (Criteria) this;
		}

		public Criteria andBorrowSerialNotLike(String value) {
			addCriterion("\"BORROW_SERIAL\" not like", value, "borrowSerial");
			return (Criteria) this;
		}

		public Criteria andBorrowSerialIn(List<String> values) {
			addCriterion("\"BORROW_SERIAL\" in", values, "borrowSerial");
			return (Criteria) this;
		}

		public Criteria andBorrowSerialNotIn(List<String> values) {
			addCriterion("\"BORROW_SERIAL\" not in", values, "borrowSerial");
			return (Criteria) this;
		}

		public Criteria andBorrowSerialBetween(String value1, String value2) {
			addCriterion("\"BORROW_SERIAL\" between", value1, value2, "borrowSerial");
			return (Criteria) this;
		}

		public Criteria andBorrowSerialNotBetween(String value1, String value2) {
			addCriterion("\"BORROW_SERIAL\" not between", value1, value2, "borrowSerial");
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

		public Criteria andBorrowCompanyIsNull() {
			addCriterion("\"BORROW_COMPANY\" is null");
			return (Criteria) this;
		}

		public Criteria andBorrowCompanyIsNotNull() {
			addCriterion("\"BORROW_COMPANY\" is not null");
			return (Criteria) this;
		}

		public Criteria andBorrowCompanyEqualTo(String value) {
			addCriterion("\"BORROW_COMPANY\" =", value, "borrowCompany");
			return (Criteria) this;
		}

		public Criteria andBorrowCompanyNotEqualTo(String value) {
			addCriterion("\"BORROW_COMPANY\" <>", value, "borrowCompany");
			return (Criteria) this;
		}

		public Criteria andBorrowCompanyGreaterThan(String value) {
			addCriterion("\"BORROW_COMPANY\" >", value, "borrowCompany");
			return (Criteria) this;
		}

		public Criteria andBorrowCompanyGreaterThanOrEqualTo(String value) {
			addCriterion("\"BORROW_COMPANY\" >=", value, "borrowCompany");
			return (Criteria) this;
		}

		public Criteria andBorrowCompanyLessThan(String value) {
			addCriterion("\"BORROW_COMPANY\" <", value, "borrowCompany");
			return (Criteria) this;
		}

		public Criteria andBorrowCompanyLessThanOrEqualTo(String value) {
			addCriterion("\"BORROW_COMPANY\" <=", value, "borrowCompany");
			return (Criteria) this;
		}

		public Criteria andBorrowCompanyLike(String value) {
			addCriterion("\"BORROW_COMPANY\" like", value, "borrowCompany");
			return (Criteria) this;
		}

		public Criteria andBorrowCompanyNotLike(String value) {
			addCriterion("\"BORROW_COMPANY\" not like", value, "borrowCompany");
			return (Criteria) this;
		}

		public Criteria andBorrowCompanyIn(List<String> values) {
			addCriterion("\"BORROW_COMPANY\" in", values, "borrowCompany");
			return (Criteria) this;
		}

		public Criteria andBorrowCompanyNotIn(List<String> values) {
			addCriterion("\"BORROW_COMPANY\" not in", values, "borrowCompany");
			return (Criteria) this;
		}

		public Criteria andBorrowCompanyBetween(String value1, String value2) {
			addCriterion("\"BORROW_COMPANY\" between", value1, value2, "borrowCompany");
			return (Criteria) this;
		}

		public Criteria andBorrowCompanyNotBetween(String value1, String value2) {
			addCriterion("\"BORROW_COMPANY\" not between", value1, value2, "borrowCompany");
			return (Criteria) this;
		}

		public Criteria andBorrowMoneyIsNull() {
			addCriterion("\"BORROW_MONEY\" is null");
			return (Criteria) this;
		}

		public Criteria andBorrowMoneyIsNotNull() {
			addCriterion("\"BORROW_MONEY\" is not null");
			return (Criteria) this;
		}

		public Criteria andBorrowMoneyEqualTo(String value) {
			addCriterion("\"BORROW_MONEY\" =", value, "borrowMoney");
			return (Criteria) this;
		}

		public Criteria andBorrowMoneyNotEqualTo(String value) {
			addCriterion("\"BORROW_MONEY\" <>", value, "borrowMoney");
			return (Criteria) this;
		}

		public Criteria andBorrowMoneyGreaterThan(String value) {
			addCriterion("\"BORROW_MONEY\" >", value, "borrowMoney");
			return (Criteria) this;
		}

		public Criteria andBorrowMoneyGreaterThanOrEqualTo(String value) {
			addCriterion("\"BORROW_MONEY\" >=", value, "borrowMoney");
			return (Criteria) this;
		}

		public Criteria andBorrowMoneyLessThan(String value) {
			addCriterion("\"BORROW_MONEY\" <", value, "borrowMoney");
			return (Criteria) this;
		}

		public Criteria andBorrowMoneyLessThanOrEqualTo(String value) {
			addCriterion("\"BORROW_MONEY\" <=", value, "borrowMoney");
			return (Criteria) this;
		}

		public Criteria andBorrowMoneyLike(String value) {
			addCriterion("\"BORROW_MONEY\" like", value, "borrowMoney");
			return (Criteria) this;
		}

		public Criteria andBorrowMoneyNotLike(String value) {
			addCriterion("\"BORROW_MONEY\" not like", value, "borrowMoney");
			return (Criteria) this;
		}

		public Criteria andBorrowMoneyIn(List<String> values) {
			addCriterion("\"BORROW_MONEY\" in", values, "borrowMoney");
			return (Criteria) this;
		}

		public Criteria andBorrowMoneyNotIn(List<String> values) {
			addCriterion("\"BORROW_MONEY\" not in", values, "borrowMoney");
			return (Criteria) this;
		}

		public Criteria andBorrowMoneyBetween(String value1, String value2) {
			addCriterion("\"BORROW_MONEY\" between", value1, value2, "borrowMoney");
			return (Criteria) this;
		}

		public Criteria andBorrowMoneyNotBetween(String value1, String value2) {
			addCriterion("\"BORROW_MONEY\" not between", value1, value2, "borrowMoney");
			return (Criteria) this;
		}

		public Criteria andBorrowRateIsNull() {
			addCriterion("\"BORROW_RATE\" is null");
			return (Criteria) this;
		}

		public Criteria andBorrowRateIsNotNull() {
			addCriterion("\"BORROW_RATE\" is not null");
			return (Criteria) this;
		}

		public Criteria andBorrowRateEqualTo(String value) {
			addCriterion("\"BORROW_RATE\" =", value, "borrowRate");
			return (Criteria) this;
		}

		public Criteria andBorrowRateNotEqualTo(String value) {
			addCriterion("\"BORROW_RATE\" <>", value, "borrowRate");
			return (Criteria) this;
		}

		public Criteria andBorrowRateGreaterThan(String value) {
			addCriterion("\"BORROW_RATE\" >", value, "borrowRate");
			return (Criteria) this;
		}

		public Criteria andBorrowRateGreaterThanOrEqualTo(String value) {
			addCriterion("\"BORROW_RATE\" >=", value, "borrowRate");
			return (Criteria) this;
		}

		public Criteria andBorrowRateLessThan(String value) {
			addCriterion("\"BORROW_RATE\" <", value, "borrowRate");
			return (Criteria) this;
		}

		public Criteria andBorrowRateLessThanOrEqualTo(String value) {
			addCriterion("\"BORROW_RATE\" <=", value, "borrowRate");
			return (Criteria) this;
		}

		public Criteria andBorrowRateLike(String value) {
			addCriterion("\"BORROW_RATE\" like", value, "borrowRate");
			return (Criteria) this;
		}

		public Criteria andBorrowRateNotLike(String value) {
			addCriterion("\"BORROW_RATE\" not like", value, "borrowRate");
			return (Criteria) this;
		}

		public Criteria andBorrowRateIn(List<String> values) {
			addCriterion("\"BORROW_RATE\" in", values, "borrowRate");
			return (Criteria) this;
		}

		public Criteria andBorrowRateNotIn(List<String> values) {
			addCriterion("\"BORROW_RATE\" not in", values, "borrowRate");
			return (Criteria) this;
		}

		public Criteria andBorrowRateBetween(String value1, String value2) {
			addCriterion("\"BORROW_RATE\" between", value1, value2, "borrowRate");
			return (Criteria) this;
		}

		public Criteria andBorrowRateNotBetween(String value1, String value2) {
			addCriterion("\"BORROW_RATE\" not between", value1, value2, "borrowRate");
			return (Criteria) this;
		}

		public Criteria andTimeLimitIsNull() {
			addCriterion("\"TIME_LIMIT\" is null");
			return (Criteria) this;
		}

		public Criteria andTimeLimitIsNotNull() {
			addCriterion("\"TIME_LIMIT\" is not null");
			return (Criteria) this;
		}

		public Criteria andTimeLimitEqualTo(String value) {
			addCriterion("\"TIME_LIMIT\" =", value, "timeLimit");
			return (Criteria) this;
		}

		public Criteria andTimeLimitNotEqualTo(String value) {
			addCriterion("\"TIME_LIMIT\" <>", value, "timeLimit");
			return (Criteria) this;
		}

		public Criteria andTimeLimitGreaterThan(String value) {
			addCriterion("\"TIME_LIMIT\" >", value, "timeLimit");
			return (Criteria) this;
		}

		public Criteria andTimeLimitGreaterThanOrEqualTo(String value) {
			addCriterion("\"TIME_LIMIT\" >=", value, "timeLimit");
			return (Criteria) this;
		}

		public Criteria andTimeLimitLessThan(String value) {
			addCriterion("\"TIME_LIMIT\" <", value, "timeLimit");
			return (Criteria) this;
		}

		public Criteria andTimeLimitLessThanOrEqualTo(String value) {
			addCriterion("\"TIME_LIMIT\" <=", value, "timeLimit");
			return (Criteria) this;
		}

		public Criteria andTimeLimitLike(String value) {
			addCriterion("\"TIME_LIMIT\" like", value, "timeLimit");
			return (Criteria) this;
		}

		public Criteria andTimeLimitNotLike(String value) {
			addCriterion("\"TIME_LIMIT\" not like", value, "timeLimit");
			return (Criteria) this;
		}

		public Criteria andTimeLimitIn(List<String> values) {
			addCriterion("\"TIME_LIMIT\" in", values, "timeLimit");
			return (Criteria) this;
		}

		public Criteria andTimeLimitNotIn(List<String> values) {
			addCriterion("\"TIME_LIMIT\" not in", values, "timeLimit");
			return (Criteria) this;
		}

		public Criteria andTimeLimitBetween(String value1, String value2) {
			addCriterion("\"TIME_LIMIT\" between", value1, value2, "timeLimit");
			return (Criteria) this;
		}

		public Criteria andTimeLimitNotBetween(String value1, String value2) {
			addCriterion("\"TIME_LIMIT\" not between", value1, value2, "timeLimit");
			return (Criteria) this;
		}

		public Criteria andBorrowLimitIsNull() {
			addCriterion("\"BORROW_LIMIT\" is null");
			return (Criteria) this;
		}

		public Criteria andBorrowLimitIsNotNull() {
			addCriterion("\"BORROW_LIMIT\" is not null");
			return (Criteria) this;
		}

		public Criteria andBorrowLimitEqualTo(String value) {
			addCriterion("\"BORROW_LIMIT\" =", value, "borrowLimit");
			return (Criteria) this;
		}

		public Criteria andBorrowLimitNotEqualTo(String value) {
			addCriterion("\"BORROW_LIMIT\" <>", value, "borrowLimit");
			return (Criteria) this;
		}

		public Criteria andBorrowLimitGreaterThan(String value) {
			addCriterion("\"BORROW_LIMIT\" >", value, "borrowLimit");
			return (Criteria) this;
		}

		public Criteria andBorrowLimitGreaterThanOrEqualTo(String value) {
			addCriterion("\"BORROW_LIMIT\" >=", value, "borrowLimit");
			return (Criteria) this;
		}

		public Criteria andBorrowLimitLessThan(String value) {
			addCriterion("\"BORROW_LIMIT\" <", value, "borrowLimit");
			return (Criteria) this;
		}

		public Criteria andBorrowLimitLessThanOrEqualTo(String value) {
			addCriterion("\"BORROW_LIMIT\" <=", value, "borrowLimit");
			return (Criteria) this;
		}

		public Criteria andBorrowLimitLike(String value) {
			addCriterion("\"BORROW_LIMIT\" like", value, "borrowLimit");
			return (Criteria) this;
		}

		public Criteria andBorrowLimitNotLike(String value) {
			addCriterion("\"BORROW_LIMIT\" not like", value, "borrowLimit");
			return (Criteria) this;
		}

		public Criteria andBorrowLimitIn(List<String> values) {
			addCriterion("\"BORROW_LIMIT\" in", values, "borrowLimit");
			return (Criteria) this;
		}

		public Criteria andBorrowLimitNotIn(List<String> values) {
			addCriterion("\"BORROW_LIMIT\" not in", values, "borrowLimit");
			return (Criteria) this;
		}

		public Criteria andBorrowLimitBetween(String value1, String value2) {
			addCriterion("\"BORROW_LIMIT\" between", value1, value2, "borrowLimit");
			return (Criteria) this;
		}

		public Criteria andBorrowLimitNotBetween(String value1, String value2) {
			addCriterion("\"BORROW_LIMIT\" not between", value1, value2, "borrowLimit");
			return (Criteria) this;
		}

		public Criteria andBorrowStateIsNull() {
			addCriterion("\"BORROW_STATE\" is null");
			return (Criteria) this;
		}

		public Criteria andBorrowStateIsNotNull() {
			addCriterion("\"BORROW_STATE\" is not null");
			return (Criteria) this;
		}

		public Criteria andBorrowStateEqualTo(String value) {
			addCriterion("\"BORROW_STATE\" =", value, "borrowState");
			return (Criteria) this;
		}

		public Criteria andBorrowStateNotEqualTo(String value) {
			addCriterion("\"BORROW_STATE\" <>", value, "borrowState");
			return (Criteria) this;
		}

		public Criteria andBorrowStateGreaterThan(String value) {
			addCriterion("\"BORROW_STATE\" >", value, "borrowState");
			return (Criteria) this;
		}

		public Criteria andBorrowStateGreaterThanOrEqualTo(String value) {
			addCriterion("\"BORROW_STATE\" >=", value, "borrowState");
			return (Criteria) this;
		}

		public Criteria andBorrowStateLessThan(String value) {
			addCriterion("\"BORROW_STATE\" <", value, "borrowState");
			return (Criteria) this;
		}

		public Criteria andBorrowStateLessThanOrEqualTo(String value) {
			addCriterion("\"BORROW_STATE\" <=", value, "borrowState");
			return (Criteria) this;
		}

		public Criteria andBorrowStateLike(String value) {
			addCriterion("\"BORROW_STATE\" like", value, "borrowState");
			return (Criteria) this;
		}

		public Criteria andBorrowStateNotLike(String value) {
			addCriterion("\"BORROW_STATE\" not like", value, "borrowState");
			return (Criteria) this;
		}

		public Criteria andBorrowStateIn(List<String> values) {
			addCriterion("\"BORROW_STATE\" in", values, "borrowState");
			return (Criteria) this;
		}

		public Criteria andBorrowStateNotIn(List<String> values) {
			addCriterion("\"BORROW_STATE\" not in", values, "borrowState");
			return (Criteria) this;
		}

		public Criteria andBorrowStateBetween(String value1, String value2) {
			addCriterion("\"BORROW_STATE\" between", value1, value2, "borrowState");
			return (Criteria) this;
		}

		public Criteria andBorrowStateNotBetween(String value1, String value2) {
			addCriterion("\"BORROW_STATE\" not between", value1, value2, "borrowState");
			return (Criteria) this;
		}

		public Criteria andBorrowRecommendIsNull() {
			addCriterion("\"BORROW_RECOMMEND\" is null");
			return (Criteria) this;
		}

		public Criteria andBorrowRecommendIsNotNull() {
			addCriterion("\"BORROW_RECOMMEND\" is not null");
			return (Criteria) this;
		}

		public Criteria andBorrowRecommendEqualTo(String value) {
			addCriterion("\"BORROW_RECOMMEND\" =", value, "borrowRecommend");
			return (Criteria) this;
		}

		public Criteria andBorrowRecommendNotEqualTo(String value) {
			addCriterion("\"BORROW_RECOMMEND\" <>", value, "borrowRecommend");
			return (Criteria) this;
		}

		public Criteria andBorrowRecommendGreaterThan(String value) {
			addCriterion("\"BORROW_RECOMMEND\" >", value, "borrowRecommend");
			return (Criteria) this;
		}

		public Criteria andBorrowRecommendGreaterThanOrEqualTo(String value) {
			addCriterion("\"BORROW_RECOMMEND\" >=", value, "borrowRecommend");
			return (Criteria) this;
		}

		public Criteria andBorrowRecommendLessThan(String value) {
			addCriterion("\"BORROW_RECOMMEND\" <", value, "borrowRecommend");
			return (Criteria) this;
		}

		public Criteria andBorrowRecommendLessThanOrEqualTo(String value) {
			addCriterion("\"BORROW_RECOMMEND\" <=", value, "borrowRecommend");
			return (Criteria) this;
		}

		public Criteria andBorrowRecommendLike(String value) {
			addCriterion("\"BORROW_RECOMMEND\" like", value, "borrowRecommend");
			return (Criteria) this;
		}

		public Criteria andBorrowRecommendNotLike(String value) {
			addCriterion("\"BORROW_RECOMMEND\" not like", value, "borrowRecommend");
			return (Criteria) this;
		}

		public Criteria andBorrowRecommendIn(List<String> values) {
			addCriterion("\"BORROW_RECOMMEND\" in", values, "borrowRecommend");
			return (Criteria) this;
		}

		public Criteria andBorrowRecommendNotIn(List<String> values) {
			addCriterion("\"BORROW_RECOMMEND\" not in", values, "borrowRecommend");
			return (Criteria) this;
		}

		public Criteria andBorrowRecommendBetween(String value1, String value2) {
			addCriterion("\"BORROW_RECOMMEND\" between", value1, value2, "borrowRecommend");
			return (Criteria) this;
		}

		public Criteria andBorrowRecommendNotBetween(String value1, String value2) {
			addCriterion("\"BORROW_RECOMMEND\" not between", value1, value2, "borrowRecommend");
			return (Criteria) this;
		}

		public Criteria andBorrowTypeIsNull() {
			addCriterion("\"BORROW_TYPE\" is null");
			return (Criteria) this;
		}

		public Criteria andBorrowTypeIsNotNull() {
			addCriterion("\"BORROW_TYPE\" is not null");
			return (Criteria) this;
		}

		public Criteria andBorrowTypeEqualTo(String value) {
			addCriterion("\"BORROW_TYPE\" =", value, "borrowType");
			return (Criteria) this;
		}

		public Criteria andBorrowTypeNotEqualTo(String value) {
			addCriterion("\"BORROW_TYPE\" <>", value, "borrowType");
			return (Criteria) this;
		}

		public Criteria andBorrowTypeGreaterThan(String value) {
			addCriterion("\"BORROW_TYPE\" >", value, "borrowType");
			return (Criteria) this;
		}

		public Criteria andBorrowTypeGreaterThanOrEqualTo(String value) {
			addCriterion("\"BORROW_TYPE\" >=", value, "borrowType");
			return (Criteria) this;
		}

		public Criteria andBorrowTypeLessThan(String value) {
			addCriterion("\"BORROW_TYPE\" <", value, "borrowType");
			return (Criteria) this;
		}

		public Criteria andBorrowTypeLessThanOrEqualTo(String value) {
			addCriterion("\"BORROW_TYPE\" <=", value, "borrowType");
			return (Criteria) this;
		}

		public Criteria andBorrowTypeLike(String value) {
			addCriterion("\"BORROW_TYPE\" like", value, "borrowType");
			return (Criteria) this;
		}

		public Criteria andBorrowTypeNotLike(String value) {
			addCriterion("\"BORROW_TYPE\" not like", value, "borrowType");
			return (Criteria) this;
		}

		public Criteria andBorrowTypeIn(List<String> values) {
			addCriterion("\"BORROW_TYPE\" in", values, "borrowType");
			return (Criteria) this;
		}

		public Criteria andBorrowTypeNotIn(List<String> values) {
			addCriterion("\"BORROW_TYPE\" not in", values, "borrowType");
			return (Criteria) this;
		}

		public Criteria andBorrowTypeBetween(String value1, String value2) {
			addCriterion("\"BORROW_TYPE\" between", value1, value2, "borrowType");
			return (Criteria) this;
		}

		public Criteria andBorrowTypeNotBetween(String value1, String value2) {
			addCriterion("\"BORROW_TYPE\" not between", value1, value2, "borrowType");
			return (Criteria) this;
		}

		public Criteria andBorrowRemark1IsNull() {
			addCriterion("\"BORROW_REMARK1\" is null");
			return (Criteria) this;
		}

		public Criteria andBorrowRemark1IsNotNull() {
			addCriterion("\"BORROW_REMARK1\" is not null");
			return (Criteria) this;
		}

		public Criteria andBorrowRemark1EqualTo(String value) {
			addCriterion("\"BORROW_REMARK1\" =", value, "borrowRemark1");
			return (Criteria) this;
		}

		public Criteria andBorrowRemark1NotEqualTo(String value) {
			addCriterion("\"BORROW_REMARK1\" <>", value, "borrowRemark1");
			return (Criteria) this;
		}

		public Criteria andBorrowRemark1GreaterThan(String value) {
			addCriterion("\"BORROW_REMARK1\" >", value, "borrowRemark1");
			return (Criteria) this;
		}

		public Criteria andBorrowRemark1GreaterThanOrEqualTo(String value) {
			addCriterion("\"BORROW_REMARK1\" >=", value, "borrowRemark1");
			return (Criteria) this;
		}

		public Criteria andBorrowRemark1LessThan(String value) {
			addCriterion("\"BORROW_REMARK1\" <", value, "borrowRemark1");
			return (Criteria) this;
		}

		public Criteria andBorrowRemark1LessThanOrEqualTo(String value) {
			addCriterion("\"BORROW_REMARK1\" <=", value, "borrowRemark1");
			return (Criteria) this;
		}

		public Criteria andBorrowRemark1Like(String value) {
			addCriterion("\"BORROW_REMARK1\" like", value, "borrowRemark1");
			return (Criteria) this;
		}

		public Criteria andBorrowRemark1NotLike(String value) {
			addCriterion("\"BORROW_REMARK1\" not like", value, "borrowRemark1");
			return (Criteria) this;
		}

		public Criteria andBorrowRemark1In(List<String> values) {
			addCriterion("\"BORROW_REMARK1\" in", values, "borrowRemark1");
			return (Criteria) this;
		}

		public Criteria andBorrowRemark1NotIn(List<String> values) {
			addCriterion("\"BORROW_REMARK1\" not in", values, "borrowRemark1");
			return (Criteria) this;
		}

		public Criteria andBorrowRemark1Between(String value1, String value2) {
			addCriterion("\"BORROW_REMARK1\" between", value1, value2, "borrowRemark1");
			return (Criteria) this;
		}

		public Criteria andBorrowRemark1NotBetween(String value1, String value2) {
			addCriterion("\"BORROW_REMARK1\" not between", value1, value2, "borrowRemark1");
			return (Criteria) this;
		}

		public Criteria andBorrowRemark2IsNull() {
			addCriterion("\"BORROW_REMARK2\" is null");
			return (Criteria) this;
		}

		public Criteria andBorrowRemark2IsNotNull() {
			addCriterion("\"BORROW_REMARK2\" is not null");
			return (Criteria) this;
		}

		public Criteria andBorrowRemark2EqualTo(String value) {
			addCriterion("\"BORROW_REMARK2\" =", value, "borrowRemark2");
			return (Criteria) this;
		}

		public Criteria andBorrowRemark2NotEqualTo(String value) {
			addCriterion("\"BORROW_REMARK2\" <>", value, "borrowRemark2");
			return (Criteria) this;
		}

		public Criteria andBorrowRemark2GreaterThan(String value) {
			addCriterion("\"BORROW_REMARK2\" >", value, "borrowRemark2");
			return (Criteria) this;
		}

		public Criteria andBorrowRemark2GreaterThanOrEqualTo(String value) {
			addCriterion("\"BORROW_REMARK2\" >=", value, "borrowRemark2");
			return (Criteria) this;
		}

		public Criteria andBorrowRemark2LessThan(String value) {
			addCriterion("\"BORROW_REMARK2\" <", value, "borrowRemark2");
			return (Criteria) this;
		}

		public Criteria andBorrowRemark2LessThanOrEqualTo(String value) {
			addCriterion("\"BORROW_REMARK2\" <=", value, "borrowRemark2");
			return (Criteria) this;
		}

		public Criteria andBorrowRemark2Like(String value) {
			addCriterion("\"BORROW_REMARK2\" like", value, "borrowRemark2");
			return (Criteria) this;
		}

		public Criteria andBorrowRemark2NotLike(String value) {
			addCriterion("\"BORROW_REMARK2\" not like", value, "borrowRemark2");
			return (Criteria) this;
		}

		public Criteria andBorrowRemark2In(List<String> values) {
			addCriterion("\"BORROW_REMARK2\" in", values, "borrowRemark2");
			return (Criteria) this;
		}

		public Criteria andBorrowRemark2NotIn(List<String> values) {
			addCriterion("\"BORROW_REMARK2\" not in", values, "borrowRemark2");
			return (Criteria) this;
		}

		public Criteria andBorrowRemark2Between(String value1, String value2) {
			addCriterion("\"BORROW_REMARK2\" between", value1, value2, "borrowRemark2");
			return (Criteria) this;
		}

		public Criteria andBorrowRemark2NotBetween(String value1, String value2) {
			addCriterion("\"BORROW_REMARK2\" not between", value1, value2, "borrowRemark2");
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