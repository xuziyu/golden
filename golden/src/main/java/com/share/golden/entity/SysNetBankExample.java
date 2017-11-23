package com.share.golden.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SysNetBankExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public SysNetBankExample() {
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

		public Criteria andTradeIdIsNull() {
			addCriterion("\"TRADE_ID\" is null");
			return (Criteria) this;
		}

		public Criteria andTradeIdIsNotNull() {
			addCriterion("\"TRADE_ID\" is not null");
			return (Criteria) this;
		}

		public Criteria andTradeIdEqualTo(String value) {
			addCriterion("\"TRADE_ID\" =", value, "tradeId");
			return (Criteria) this;
		}

		public Criteria andTradeIdNotEqualTo(String value) {
			addCriterion("\"TRADE_ID\" <>", value, "tradeId");
			return (Criteria) this;
		}

		public Criteria andTradeIdGreaterThan(String value) {
			addCriterion("\"TRADE_ID\" >", value, "tradeId");
			return (Criteria) this;
		}

		public Criteria andTradeIdGreaterThanOrEqualTo(String value) {
			addCriterion("\"TRADE_ID\" >=", value, "tradeId");
			return (Criteria) this;
		}

		public Criteria andTradeIdLessThan(String value) {
			addCriterion("\"TRADE_ID\" <", value, "tradeId");
			return (Criteria) this;
		}

		public Criteria andTradeIdLessThanOrEqualTo(String value) {
			addCriterion("\"TRADE_ID\" <=", value, "tradeId");
			return (Criteria) this;
		}

		public Criteria andTradeIdLike(String value) {
			addCriterion("\"TRADE_ID\" like", value, "tradeId");
			return (Criteria) this;
		}

		public Criteria andTradeIdNotLike(String value) {
			addCriterion("\"TRADE_ID\" not like", value, "tradeId");
			return (Criteria) this;
		}

		public Criteria andTradeIdIn(List<String> values) {
			addCriterion("\"TRADE_ID\" in", values, "tradeId");
			return (Criteria) this;
		}

		public Criteria andTradeIdNotIn(List<String> values) {
			addCriterion("\"TRADE_ID\" not in", values, "tradeId");
			return (Criteria) this;
		}

		public Criteria andTradeIdBetween(String value1, String value2) {
			addCriterion("\"TRADE_ID\" between", value1, value2, "tradeId");
			return (Criteria) this;
		}

		public Criteria andTradeIdNotBetween(String value1, String value2) {
			addCriterion("\"TRADE_ID\" not between", value1, value2, "tradeId");
			return (Criteria) this;
		}

		public Criteria andCardIdIsNull() {
			addCriterion("\"CARD_ID\" is null");
			return (Criteria) this;
		}

		public Criteria andCardIdIsNotNull() {
			addCriterion("\"CARD_ID\" is not null");
			return (Criteria) this;
		}

		public Criteria andCardIdEqualTo(String value) {
			addCriterion("\"CARD_ID\" =", value, "cardId");
			return (Criteria) this;
		}

		public Criteria andCardIdNotEqualTo(String value) {
			addCriterion("\"CARD_ID\" <>", value, "cardId");
			return (Criteria) this;
		}

		public Criteria andCardIdGreaterThan(String value) {
			addCriterion("\"CARD_ID\" >", value, "cardId");
			return (Criteria) this;
		}

		public Criteria andCardIdGreaterThanOrEqualTo(String value) {
			addCriterion("\"CARD_ID\" >=", value, "cardId");
			return (Criteria) this;
		}

		public Criteria andCardIdLessThan(String value) {
			addCriterion("\"CARD_ID\" <", value, "cardId");
			return (Criteria) this;
		}

		public Criteria andCardIdLessThanOrEqualTo(String value) {
			addCriterion("\"CARD_ID\" <=", value, "cardId");
			return (Criteria) this;
		}

		public Criteria andCardIdLike(String value) {
			addCriterion("\"CARD_ID\" like", value, "cardId");
			return (Criteria) this;
		}

		public Criteria andCardIdNotLike(String value) {
			addCriterion("\"CARD_ID\" not like", value, "cardId");
			return (Criteria) this;
		}

		public Criteria andCardIdIn(List<String> values) {
			addCriterion("\"CARD_ID\" in", values, "cardId");
			return (Criteria) this;
		}

		public Criteria andCardIdNotIn(List<String> values) {
			addCriterion("\"CARD_ID\" not in", values, "cardId");
			return (Criteria) this;
		}

		public Criteria andCardIdBetween(String value1, String value2) {
			addCriterion("\"CARD_ID\" between", value1, value2, "cardId");
			return (Criteria) this;
		}

		public Criteria andCardIdNotBetween(String value1, String value2) {
			addCriterion("\"CARD_ID\" not between", value1, value2, "cardId");
			return (Criteria) this;
		}

		public Criteria andTradeTypeIsNull() {
			addCriterion("\"TRADE_TYPE\" is null");
			return (Criteria) this;
		}

		public Criteria andTradeTypeIsNotNull() {
			addCriterion("\"TRADE_TYPE\" is not null");
			return (Criteria) this;
		}

		public Criteria andTradeTypeEqualTo(String value) {
			addCriterion("\"TRADE_TYPE\" =", value, "tradeType");
			return (Criteria) this;
		}

		public Criteria andTradeTypeNotEqualTo(String value) {
			addCriterion("\"TRADE_TYPE\" <>", value, "tradeType");
			return (Criteria) this;
		}

		public Criteria andTradeTypeGreaterThan(String value) {
			addCriterion("\"TRADE_TYPE\" >", value, "tradeType");
			return (Criteria) this;
		}

		public Criteria andTradeTypeGreaterThanOrEqualTo(String value) {
			addCriterion("\"TRADE_TYPE\" >=", value, "tradeType");
			return (Criteria) this;
		}

		public Criteria andTradeTypeLessThan(String value) {
			addCriterion("\"TRADE_TYPE\" <", value, "tradeType");
			return (Criteria) this;
		}

		public Criteria andTradeTypeLessThanOrEqualTo(String value) {
			addCriterion("\"TRADE_TYPE\" <=", value, "tradeType");
			return (Criteria) this;
		}

		public Criteria andTradeTypeLike(String value) {
			addCriterion("\"TRADE_TYPE\" like", value, "tradeType");
			return (Criteria) this;
		}

		public Criteria andTradeTypeNotLike(String value) {
			addCriterion("\"TRADE_TYPE\" not like", value, "tradeType");
			return (Criteria) this;
		}

		public Criteria andTradeTypeIn(List<String> values) {
			addCriterion("\"TRADE_TYPE\" in", values, "tradeType");
			return (Criteria) this;
		}

		public Criteria andTradeTypeNotIn(List<String> values) {
			addCriterion("\"TRADE_TYPE\" not in", values, "tradeType");
			return (Criteria) this;
		}

		public Criteria andTradeTypeBetween(String value1, String value2) {
			addCriterion("\"TRADE_TYPE\" between", value1, value2, "tradeType");
			return (Criteria) this;
		}

		public Criteria andTradeTypeNotBetween(String value1, String value2) {
			addCriterion("\"TRADE_TYPE\" not between", value1, value2, "tradeType");
			return (Criteria) this;
		}

		public Criteria andTradeMoneyIsNull() {
			addCriterion("\"TRADE_MONEY\" is null");
			return (Criteria) this;
		}

		public Criteria andTradeMoneyIsNotNull() {
			addCriterion("\"TRADE_MONEY\" is not null");
			return (Criteria) this;
		}

		public Criteria andTradeMoneyEqualTo(BigDecimal value) {
			addCriterion("\"TRADE_MONEY\" =", value, "tradeMoney");
			return (Criteria) this;
		}

		public Criteria andTradeMoneyNotEqualTo(BigDecimal value) {
			addCriterion("\"TRADE_MONEY\" <>", value, "tradeMoney");
			return (Criteria) this;
		}

		public Criteria andTradeMoneyGreaterThan(BigDecimal value) {
			addCriterion("\"TRADE_MONEY\" >", value, "tradeMoney");
			return (Criteria) this;
		}

		public Criteria andTradeMoneyGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("\"TRADE_MONEY\" >=", value, "tradeMoney");
			return (Criteria) this;
		}

		public Criteria andTradeMoneyLessThan(BigDecimal value) {
			addCriterion("\"TRADE_MONEY\" <", value, "tradeMoney");
			return (Criteria) this;
		}

		public Criteria andTradeMoneyLessThanOrEqualTo(BigDecimal value) {
			addCriterion("\"TRADE_MONEY\" <=", value, "tradeMoney");
			return (Criteria) this;
		}

		public Criteria andTradeMoneyIn(List<BigDecimal> values) {
			addCriterion("\"TRADE_MONEY\" in", values, "tradeMoney");
			return (Criteria) this;
		}

		public Criteria andTradeMoneyNotIn(List<BigDecimal> values) {
			addCriterion("\"TRADE_MONEY\" not in", values, "tradeMoney");
			return (Criteria) this;
		}

		public Criteria andTradeMoneyBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("\"TRADE_MONEY\" between", value1, value2, "tradeMoney");
			return (Criteria) this;
		}

		public Criteria andTradeMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("\"TRADE_MONEY\" not between", value1, value2, "tradeMoney");
			return (Criteria) this;
		}

		public Criteria andCardPasswordIsNull() {
			addCriterion("\"CARD_PASSWORD\" is null");
			return (Criteria) this;
		}

		public Criteria andCardPasswordIsNotNull() {
			addCriterion("\"CARD_PASSWORD\" is not null");
			return (Criteria) this;
		}

		public Criteria andCardPasswordEqualTo(String value) {
			addCriterion("\"CARD_PASSWORD\" =", value, "cardPassword");
			return (Criteria) this;
		}

		public Criteria andCardPasswordNotEqualTo(String value) {
			addCriterion("\"CARD_PASSWORD\" <>", value, "cardPassword");
			return (Criteria) this;
		}

		public Criteria andCardPasswordGreaterThan(String value) {
			addCriterion("\"CARD_PASSWORD\" >", value, "cardPassword");
			return (Criteria) this;
		}

		public Criteria andCardPasswordGreaterThanOrEqualTo(String value) {
			addCriterion("\"CARD_PASSWORD\" >=", value, "cardPassword");
			return (Criteria) this;
		}

		public Criteria andCardPasswordLessThan(String value) {
			addCriterion("\"CARD_PASSWORD\" <", value, "cardPassword");
			return (Criteria) this;
		}

		public Criteria andCardPasswordLessThanOrEqualTo(String value) {
			addCriterion("\"CARD_PASSWORD\" <=", value, "cardPassword");
			return (Criteria) this;
		}

		public Criteria andCardPasswordLike(String value) {
			addCriterion("\"CARD_PASSWORD\" like", value, "cardPassword");
			return (Criteria) this;
		}

		public Criteria andCardPasswordNotLike(String value) {
			addCriterion("\"CARD_PASSWORD\" not like", value, "cardPassword");
			return (Criteria) this;
		}

		public Criteria andCardPasswordIn(List<String> values) {
			addCriterion("\"CARD_PASSWORD\" in", values, "cardPassword");
			return (Criteria) this;
		}

		public Criteria andCardPasswordNotIn(List<String> values) {
			addCriterion("\"CARD_PASSWORD\" not in", values, "cardPassword");
			return (Criteria) this;
		}

		public Criteria andCardPasswordBetween(String value1, String value2) {
			addCriterion("\"CARD_PASSWORD\" between", value1, value2, "cardPassword");
			return (Criteria) this;
		}

		public Criteria andCardPasswordNotBetween(String value1, String value2) {
			addCriterion("\"CARD_PASSWORD\" not between", value1, value2, "cardPassword");
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