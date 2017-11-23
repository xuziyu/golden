package com.share.golden.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysRecommendExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public SysRecommendExample() {
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

		public Criteria andRecommendIdIsNull() {
			addCriterion("\"RECOMMEND_ID\" is null");
			return (Criteria) this;
		}

		public Criteria andRecommendIdIsNotNull() {
			addCriterion("\"RECOMMEND_ID\" is not null");
			return (Criteria) this;
		}

		public Criteria andRecommendIdEqualTo(String value) {
			addCriterion("\"RECOMMEND_ID\" =", value, "recommendId");
			return (Criteria) this;
		}

		public Criteria andRecommendIdNotEqualTo(String value) {
			addCriterion("\"RECOMMEND_ID\" <>", value, "recommendId");
			return (Criteria) this;
		}

		public Criteria andRecommendIdGreaterThan(String value) {
			addCriterion("\"RECOMMEND_ID\" >", value, "recommendId");
			return (Criteria) this;
		}

		public Criteria andRecommendIdGreaterThanOrEqualTo(String value) {
			addCriterion("\"RECOMMEND_ID\" >=", value, "recommendId");
			return (Criteria) this;
		}

		public Criteria andRecommendIdLessThan(String value) {
			addCriterion("\"RECOMMEND_ID\" <", value, "recommendId");
			return (Criteria) this;
		}

		public Criteria andRecommendIdLessThanOrEqualTo(String value) {
			addCriterion("\"RECOMMEND_ID\" <=", value, "recommendId");
			return (Criteria) this;
		}

		public Criteria andRecommendIdLike(String value) {
			addCriterion("\"RECOMMEND_ID\" like", value, "recommendId");
			return (Criteria) this;
		}

		public Criteria andRecommendIdNotLike(String value) {
			addCriterion("\"RECOMMEND_ID\" not like", value, "recommendId");
			return (Criteria) this;
		}

		public Criteria andRecommendIdIn(List<String> values) {
			addCriterion("\"RECOMMEND_ID\" in", values, "recommendId");
			return (Criteria) this;
		}

		public Criteria andRecommendIdNotIn(List<String> values) {
			addCriterion("\"RECOMMEND_ID\" not in", values, "recommendId");
			return (Criteria) this;
		}

		public Criteria andRecommendIdBetween(String value1, String value2) {
			addCriterion("\"RECOMMEND_ID\" between", value1, value2, "recommendId");
			return (Criteria) this;
		}

		public Criteria andRecommendIdNotBetween(String value1, String value2) {
			addCriterion("\"RECOMMEND_ID\" not between", value1, value2, "recommendId");
			return (Criteria) this;
		}

		public Criteria andBeRecommendedIdIsNull() {
			addCriterion("\"BE_RECOMMENDED_ID\" is null");
			return (Criteria) this;
		}

		public Criteria andBeRecommendedIdIsNotNull() {
			addCriterion("\"BE_RECOMMENDED_ID\" is not null");
			return (Criteria) this;
		}

		public Criteria andBeRecommendedIdEqualTo(String value) {
			addCriterion("\"BE_RECOMMENDED_ID\" =", value, "beRecommendedId");
			return (Criteria) this;
		}

		public Criteria andBeRecommendedIdNotEqualTo(String value) {
			addCriterion("\"BE_RECOMMENDED_ID\" <>", value, "beRecommendedId");
			return (Criteria) this;
		}

		public Criteria andBeRecommendedIdGreaterThan(String value) {
			addCriterion("\"BE_RECOMMENDED_ID\" >", value, "beRecommendedId");
			return (Criteria) this;
		}

		public Criteria andBeRecommendedIdGreaterThanOrEqualTo(String value) {
			addCriterion("\"BE_RECOMMENDED_ID\" >=", value, "beRecommendedId");
			return (Criteria) this;
		}

		public Criteria andBeRecommendedIdLessThan(String value) {
			addCriterion("\"BE_RECOMMENDED_ID\" <", value, "beRecommendedId");
			return (Criteria) this;
		}

		public Criteria andBeRecommendedIdLessThanOrEqualTo(String value) {
			addCriterion("\"BE_RECOMMENDED_ID\" <=", value, "beRecommendedId");
			return (Criteria) this;
		}

		public Criteria andBeRecommendedIdLike(String value) {
			addCriterion("\"BE_RECOMMENDED_ID\" like", value, "beRecommendedId");
			return (Criteria) this;
		}

		public Criteria andBeRecommendedIdNotLike(String value) {
			addCriterion("\"BE_RECOMMENDED_ID\" not like", value, "beRecommendedId");
			return (Criteria) this;
		}

		public Criteria andBeRecommendedIdIn(List<String> values) {
			addCriterion("\"BE_RECOMMENDED_ID\" in", values, "beRecommendedId");
			return (Criteria) this;
		}

		public Criteria andBeRecommendedIdNotIn(List<String> values) {
			addCriterion("\"BE_RECOMMENDED_ID\" not in", values, "beRecommendedId");
			return (Criteria) this;
		}

		public Criteria andBeRecommendedIdBetween(String value1, String value2) {
			addCriterion("\"BE_RECOMMENDED_ID\" between", value1, value2, "beRecommendedId");
			return (Criteria) this;
		}

		public Criteria andBeRecommendedIdNotBetween(String value1, String value2) {
			addCriterion("\"BE_RECOMMENDED_ID\" not between", value1, value2, "beRecommendedId");
			return (Criteria) this;
		}

		public Criteria andBeRecommendNameIsNull() {
			addCriterion("\"BE_RECOMMEND_NAME\" is null");
			return (Criteria) this;
		}

		public Criteria andBeRecommendNameIsNotNull() {
			addCriterion("\"BE_RECOMMEND_NAME\" is not null");
			return (Criteria) this;
		}

		public Criteria andBeRecommendNameEqualTo(String value) {
			addCriterion("\"BE_RECOMMEND_NAME\" =", value, "beRecommendName");
			return (Criteria) this;
		}

		public Criteria andBeRecommendNameNotEqualTo(String value) {
			addCriterion("\"BE_RECOMMEND_NAME\" <>", value, "beRecommendName");
			return (Criteria) this;
		}

		public Criteria andBeRecommendNameGreaterThan(String value) {
			addCriterion("\"BE_RECOMMEND_NAME\" >", value, "beRecommendName");
			return (Criteria) this;
		}

		public Criteria andBeRecommendNameGreaterThanOrEqualTo(String value) {
			addCriterion("\"BE_RECOMMEND_NAME\" >=", value, "beRecommendName");
			return (Criteria) this;
		}

		public Criteria andBeRecommendNameLessThan(String value) {
			addCriterion("\"BE_RECOMMEND_NAME\" <", value, "beRecommendName");
			return (Criteria) this;
		}

		public Criteria andBeRecommendNameLessThanOrEqualTo(String value) {
			addCriterion("\"BE_RECOMMEND_NAME\" <=", value, "beRecommendName");
			return (Criteria) this;
		}

		public Criteria andBeRecommendNameLike(String value) {
			addCriterion("\"BE_RECOMMEND_NAME\" like", value, "beRecommendName");
			return (Criteria) this;
		}

		public Criteria andBeRecommendNameNotLike(String value) {
			addCriterion("\"BE_RECOMMEND_NAME\" not like", value, "beRecommendName");
			return (Criteria) this;
		}

		public Criteria andBeRecommendNameIn(List<String> values) {
			addCriterion("\"BE_RECOMMEND_NAME\" in", values, "beRecommendName");
			return (Criteria) this;
		}

		public Criteria andBeRecommendNameNotIn(List<String> values) {
			addCriterion("\"BE_RECOMMEND_NAME\" not in", values, "beRecommendName");
			return (Criteria) this;
		}

		public Criteria andBeRecommendNameBetween(String value1, String value2) {
			addCriterion("\"BE_RECOMMEND_NAME\" between", value1, value2, "beRecommendName");
			return (Criteria) this;
		}

		public Criteria andBeRecommendNameNotBetween(String value1, String value2) {
			addCriterion("\"BE_RECOMMEND_NAME\" not between", value1, value2, "beRecommendName");
			return (Criteria) this;
		}

		public Criteria andReferrerIdIsNull() {
			addCriterion("\"REFERRER_ID\" is null");
			return (Criteria) this;
		}

		public Criteria andReferrerIdIsNotNull() {
			addCriterion("\"REFERRER_ID\" is not null");
			return (Criteria) this;
		}

		public Criteria andReferrerIdEqualTo(String value) {
			addCriterion("\"REFERRER_ID\" =", value, "referrerId");
			return (Criteria) this;
		}

		public Criteria andReferrerIdNotEqualTo(String value) {
			addCriterion("\"REFERRER_ID\" <>", value, "referrerId");
			return (Criteria) this;
		}

		public Criteria andReferrerIdGreaterThan(String value) {
			addCriterion("\"REFERRER_ID\" >", value, "referrerId");
			return (Criteria) this;
		}

		public Criteria andReferrerIdGreaterThanOrEqualTo(String value) {
			addCriterion("\"REFERRER_ID\" >=", value, "referrerId");
			return (Criteria) this;
		}

		public Criteria andReferrerIdLessThan(String value) {
			addCriterion("\"REFERRER_ID\" <", value, "referrerId");
			return (Criteria) this;
		}

		public Criteria andReferrerIdLessThanOrEqualTo(String value) {
			addCriterion("\"REFERRER_ID\" <=", value, "referrerId");
			return (Criteria) this;
		}

		public Criteria andReferrerIdLike(String value) {
			addCriterion("\"REFERRER_ID\" like", value, "referrerId");
			return (Criteria) this;
		}

		public Criteria andReferrerIdNotLike(String value) {
			addCriterion("\"REFERRER_ID\" not like", value, "referrerId");
			return (Criteria) this;
		}

		public Criteria andReferrerIdIn(List<String> values) {
			addCriterion("\"REFERRER_ID\" in", values, "referrerId");
			return (Criteria) this;
		}

		public Criteria andReferrerIdNotIn(List<String> values) {
			addCriterion("\"REFERRER_ID\" not in", values, "referrerId");
			return (Criteria) this;
		}

		public Criteria andReferrerIdBetween(String value1, String value2) {
			addCriterion("\"REFERRER_ID\" between", value1, value2, "referrerId");
			return (Criteria) this;
		}

		public Criteria andReferrerIdNotBetween(String value1, String value2) {
			addCriterion("\"REFERRER_ID\" not between", value1, value2, "referrerId");
			return (Criteria) this;
		}

		public Criteria andRecommendBounsIsNull() {
			addCriterion("\"RECOMMEND_BOUNS\" is null");
			return (Criteria) this;
		}

		public Criteria andRecommendBounsIsNotNull() {
			addCriterion("\"RECOMMEND_BOUNS\" is not null");
			return (Criteria) this;
		}

		public Criteria andRecommendBounsEqualTo(Integer value) {
			addCriterion("\"RECOMMEND_BOUNS\" =", value, "recommendBouns");
			return (Criteria) this;
		}

		public Criteria andRecommendBounsNotEqualTo(Integer value) {
			addCriterion("\"RECOMMEND_BOUNS\" <>", value, "recommendBouns");
			return (Criteria) this;
		}

		public Criteria andRecommendBounsGreaterThan(Integer value) {
			addCriterion("\"RECOMMEND_BOUNS\" >", value, "recommendBouns");
			return (Criteria) this;
		}

		public Criteria andRecommendBounsGreaterThanOrEqualTo(Integer value) {
			addCriterion("\"RECOMMEND_BOUNS\" >=", value, "recommendBouns");
			return (Criteria) this;
		}

		public Criteria andRecommendBounsLessThan(Integer value) {
			addCriterion("\"RECOMMEND_BOUNS\" <", value, "recommendBouns");
			return (Criteria) this;
		}

		public Criteria andRecommendBounsLessThanOrEqualTo(Integer value) {
			addCriterion("\"RECOMMEND_BOUNS\" <=", value, "recommendBouns");
			return (Criteria) this;
		}

		public Criteria andRecommendBounsIn(List<Integer> values) {
			addCriterion("\"RECOMMEND_BOUNS\" in", values, "recommendBouns");
			return (Criteria) this;
		}

		public Criteria andRecommendBounsNotIn(List<Integer> values) {
			addCriterion("\"RECOMMEND_BOUNS\" not in", values, "recommendBouns");
			return (Criteria) this;
		}

		public Criteria andRecommendBounsBetween(Integer value1, Integer value2) {
			addCriterion("\"RECOMMEND_BOUNS\" between", value1, value2, "recommendBouns");
			return (Criteria) this;
		}

		public Criteria andRecommendBounsNotBetween(Integer value1, Integer value2) {
			addCriterion("\"RECOMMEND_BOUNS\" not between", value1, value2, "recommendBouns");
			return (Criteria) this;
		}

		public Criteria andRecommendTimeIsNull() {
			addCriterion("\"RECOMMEND_TIME\" is null");
			return (Criteria) this;
		}

		public Criteria andRecommendTimeIsNotNull() {
			addCriterion("\"RECOMMEND_TIME\" is not null");
			return (Criteria) this;
		}

		public Criteria andRecommendTimeEqualTo(Date value) {
			addCriterion("\"RECOMMEND_TIME\" =", value, "recommendTime");
			return (Criteria) this;
		}

		public Criteria andRecommendTimeNotEqualTo(Date value) {
			addCriterion("\"RECOMMEND_TIME\" <>", value, "recommendTime");
			return (Criteria) this;
		}

		public Criteria andRecommendTimeGreaterThan(Date value) {
			addCriterion("\"RECOMMEND_TIME\" >", value, "recommendTime");
			return (Criteria) this;
		}

		public Criteria andRecommendTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("\"RECOMMEND_TIME\" >=", value, "recommendTime");
			return (Criteria) this;
		}

		public Criteria andRecommendTimeLessThan(Date value) {
			addCriterion("\"RECOMMEND_TIME\" <", value, "recommendTime");
			return (Criteria) this;
		}

		public Criteria andRecommendTimeLessThanOrEqualTo(Date value) {
			addCriterion("\"RECOMMEND_TIME\" <=", value, "recommendTime");
			return (Criteria) this;
		}

		public Criteria andRecommendTimeIn(List<Date> values) {
			addCriterion("\"RECOMMEND_TIME\" in", values, "recommendTime");
			return (Criteria) this;
		}

		public Criteria andRecommendTimeNotIn(List<Date> values) {
			addCriterion("\"RECOMMEND_TIME\" not in", values, "recommendTime");
			return (Criteria) this;
		}

		public Criteria andRecommendTimeBetween(Date value1, Date value2) {
			addCriterion("\"RECOMMEND_TIME\" between", value1, value2, "recommendTime");
			return (Criteria) this;
		}

		public Criteria andRecommendTimeNotBetween(Date value1, Date value2) {
			addCriterion("\"RECOMMEND_TIME\" not between", value1, value2, "recommendTime");
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

		public Criteria andAuditTimeIsNull() {
			addCriterion("\"AUDIT_TIME\" is null");
			return (Criteria) this;
		}

		public Criteria andAuditTimeIsNotNull() {
			addCriterion("\"AUDIT_TIME\" is not null");
			return (Criteria) this;
		}

		public Criteria andAuditTimeEqualTo(String value) {
			addCriterion("\"AUDIT_TIME\" =", value, "auditTime");
			return (Criteria) this;
		}

		public Criteria andAuditTimeNotEqualTo(String value) {
			addCriterion("\"AUDIT_TIME\" <>", value, "auditTime");
			return (Criteria) this;
		}

		public Criteria andAuditTimeGreaterThan(String value) {
			addCriterion("\"AUDIT_TIME\" >", value, "auditTime");
			return (Criteria) this;
		}

		public Criteria andAuditTimeGreaterThanOrEqualTo(String value) {
			addCriterion("\"AUDIT_TIME\" >=", value, "auditTime");
			return (Criteria) this;
		}

		public Criteria andAuditTimeLessThan(String value) {
			addCriterion("\"AUDIT_TIME\" <", value, "auditTime");
			return (Criteria) this;
		}

		public Criteria andAuditTimeLessThanOrEqualTo(String value) {
			addCriterion("\"AUDIT_TIME\" <=", value, "auditTime");
			return (Criteria) this;
		}

		public Criteria andAuditTimeLike(String value) {
			addCriterion("\"AUDIT_TIME\" like", value, "auditTime");
			return (Criteria) this;
		}

		public Criteria andAuditTimeNotLike(String value) {
			addCriterion("\"AUDIT_TIME\" not like", value, "auditTime");
			return (Criteria) this;
		}

		public Criteria andAuditTimeIn(List<String> values) {
			addCriterion("\"AUDIT_TIME\" in", values, "auditTime");
			return (Criteria) this;
		}

		public Criteria andAuditTimeNotIn(List<String> values) {
			addCriterion("\"AUDIT_TIME\" not in", values, "auditTime");
			return (Criteria) this;
		}

		public Criteria andAuditTimeBetween(String value1, String value2) {
			addCriterion("\"AUDIT_TIME\" between", value1, value2, "auditTime");
			return (Criteria) this;
		}

		public Criteria andAuditTimeNotBetween(String value1, String value2) {
			addCriterion("\"AUDIT_TIME\" not between", value1, value2, "auditTime");
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