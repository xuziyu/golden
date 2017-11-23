package com.share.golden.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserRealNameExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserRealNameExample() {
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

        public Criteria andRealIdIsNull() {
            addCriterion("\"REAL_ID\" is null");
            return (Criteria) this;
        }

        public Criteria andRealIdIsNotNull() {
            addCriterion("\"REAL_ID\" is not null");
            return (Criteria) this;
        }

        public Criteria andRealIdEqualTo(String value) {
            addCriterion("\"REAL_ID\" =", value, "realId");
            return (Criteria) this;
        }

        public Criteria andRealIdNotEqualTo(String value) {
            addCriterion("\"REAL_ID\" <>", value, "realId");
            return (Criteria) this;
        }

        public Criteria andRealIdGreaterThan(String value) {
            addCriterion("\"REAL_ID\" >", value, "realId");
            return (Criteria) this;
        }

        public Criteria andRealIdGreaterThanOrEqualTo(String value) {
            addCriterion("\"REAL_ID\" >=", value, "realId");
            return (Criteria) this;
        }

        public Criteria andRealIdLessThan(String value) {
            addCriterion("\"REAL_ID\" <", value, "realId");
            return (Criteria) this;
        }

        public Criteria andRealIdLessThanOrEqualTo(String value) {
            addCriterion("\"REAL_ID\" <=", value, "realId");
            return (Criteria) this;
        }

        public Criteria andRealIdLike(String value) {
            addCriterion("\"REAL_ID\" like", value, "realId");
            return (Criteria) this;
        }

        public Criteria andRealIdNotLike(String value) {
            addCriterion("\"REAL_ID\" not like", value, "realId");
            return (Criteria) this;
        }

        public Criteria andRealIdIn(List<String> values) {
            addCriterion("\"REAL_ID\" in", values, "realId");
            return (Criteria) this;
        }

        public Criteria andRealIdNotIn(List<String> values) {
            addCriterion("\"REAL_ID\" not in", values, "realId");
            return (Criteria) this;
        }

        public Criteria andRealIdBetween(String value1, String value2) {
            addCriterion("\"REAL_ID\" between", value1, value2, "realId");
            return (Criteria) this;
        }

        public Criteria andRealIdNotBetween(String value1, String value2) {
            addCriterion("\"REAL_ID\" not between", value1, value2, "realId");
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

        public Criteria andRealNameIsNull() {
            addCriterion("\"REAL_NAME\" is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("\"REAL_NAME\" is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("\"REAL_NAME\" =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("\"REAL_NAME\" <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("\"REAL_NAME\" >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("\"REAL_NAME\" >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("\"REAL_NAME\" <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("\"REAL_NAME\" <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("\"REAL_NAME\" like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("\"REAL_NAME\" not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("\"REAL_NAME\" in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("\"REAL_NAME\" not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("\"REAL_NAME\" between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("\"REAL_NAME\" not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("\"GENDER\" is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("\"GENDER\" is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("\"GENDER\" =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("\"GENDER\" <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("\"GENDER\" >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("\"GENDER\" >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("\"GENDER\" <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("\"GENDER\" <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("\"GENDER\" like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("\"GENDER\" not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("\"GENDER\" in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("\"GENDER\" not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("\"GENDER\" between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("\"GENDER\" not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andIdentityNumIsNull() {
            addCriterion("\"IDENTITY_NUM\" is null");
            return (Criteria) this;
        }

        public Criteria andIdentityNumIsNotNull() {
            addCriterion("\"IDENTITY_NUM\" is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityNumEqualTo(String value) {
            addCriterion("\"IDENTITY_NUM\" =", value, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumNotEqualTo(String value) {
            addCriterion("\"IDENTITY_NUM\" <>", value, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumGreaterThan(String value) {
            addCriterion("\"IDENTITY_NUM\" >", value, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumGreaterThanOrEqualTo(String value) {
            addCriterion("\"IDENTITY_NUM\" >=", value, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumLessThan(String value) {
            addCriterion("\"IDENTITY_NUM\" <", value, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumLessThanOrEqualTo(String value) {
            addCriterion("\"IDENTITY_NUM\" <=", value, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumLike(String value) {
            addCriterion("\"IDENTITY_NUM\" like", value, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumNotLike(String value) {
            addCriterion("\"IDENTITY_NUM\" not like", value, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumIn(List<String> values) {
            addCriterion("\"IDENTITY_NUM\" in", values, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumNotIn(List<String> values) {
            addCriterion("\"IDENTITY_NUM\" not in", values, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumBetween(String value1, String value2) {
            addCriterion("\"IDENTITY_NUM\" between", value1, value2, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumNotBetween(String value1, String value2) {
            addCriterion("\"IDENTITY_NUM\" not between", value1, value2, "identityNum");
            return (Criteria) this;
        }

        public Criteria andAttestationDateIsNull() {
            addCriterion("\"ATTESTATION_DATE\" is null");
            return (Criteria) this;
        }

        public Criteria andAttestationDateIsNotNull() {
            addCriterion("\"ATTESTATION_DATE\" is not null");
            return (Criteria) this;
        }

        public Criteria andAttestationDateEqualTo(Date value) {
            addCriterion("\"ATTESTATION_DATE\" =", value, "attestationDate");
            return (Criteria) this;
        }

        public Criteria andAttestationDateNotEqualTo(Date value) {
            addCriterion("\"ATTESTATION_DATE\" <>", value, "attestationDate");
            return (Criteria) this;
        }

        public Criteria andAttestationDateGreaterThan(Date value) {
            addCriterion("\"ATTESTATION_DATE\" >", value, "attestationDate");
            return (Criteria) this;
        }

        public Criteria andAttestationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("\"ATTESTATION_DATE\" >=", value, "attestationDate");
            return (Criteria) this;
        }

        public Criteria andAttestationDateLessThan(Date value) {
            addCriterion("\"ATTESTATION_DATE\" <", value, "attestationDate");
            return (Criteria) this;
        }

        public Criteria andAttestationDateLessThanOrEqualTo(Date value) {
            addCriterion("\"ATTESTATION_DATE\" <=", value, "attestationDate");
            return (Criteria) this;
        }

        public Criteria andAttestationDateIn(List<Date> values) {
            addCriterion("\"ATTESTATION_DATE\" in", values, "attestationDate");
            return (Criteria) this;
        }

        public Criteria andAttestationDateNotIn(List<Date> values) {
            addCriterion("\"ATTESTATION_DATE\" not in", values, "attestationDate");
            return (Criteria) this;
        }

        public Criteria andAttestationDateBetween(Date value1, Date value2) {
            addCriterion("\"ATTESTATION_DATE\" between", value1, value2, "attestationDate");
            return (Criteria) this;
        }

        public Criteria andAttestationDateNotBetween(Date value1, Date value2) {
            addCriterion("\"ATTESTATION_DATE\" not between", value1, value2, "attestationDate");
            return (Criteria) this;
        }

        public Criteria andCheckIsNull() {
            addCriterion("\"CHECK\" is null");
            return (Criteria) this;
        }

        public Criteria andCheckIsNotNull() {
            addCriterion("\"CHECK\" is not null");
            return (Criteria) this;
        }

        public Criteria andCheckEqualTo(BigDecimal value) {
            addCriterion("\"CHECK\" =", value, "check");
            return (Criteria) this;
        }

        public Criteria andCheckNotEqualTo(BigDecimal value) {
            addCriterion("\"CHECK\" <>", value, "check");
            return (Criteria) this;
        }

        public Criteria andCheckGreaterThan(BigDecimal value) {
            addCriterion("\"CHECK\" >", value, "check");
            return (Criteria) this;
        }

        public Criteria andCheckGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("\"CHECK\" >=", value, "check");
            return (Criteria) this;
        }

        public Criteria andCheckLessThan(BigDecimal value) {
            addCriterion("\"CHECK\" <", value, "check");
            return (Criteria) this;
        }

        public Criteria andCheckLessThanOrEqualTo(BigDecimal value) {
            addCriterion("\"CHECK\" <=", value, "check");
            return (Criteria) this;
        }

        public Criteria andCheckIn(List<BigDecimal> values) {
            addCriterion("\"CHECK\" in", values, "check");
            return (Criteria) this;
        }

        public Criteria andCheckNotIn(List<BigDecimal> values) {
            addCriterion("\"CHECK\" not in", values, "check");
            return (Criteria) this;
        }

        public Criteria andCheckBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("\"CHECK\" between", value1, value2, "check");
            return (Criteria) this;
        }

        public Criteria andCheckNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("\"CHECK\" not between", value1, value2, "check");
            return (Criteria) this;
        }

        public Criteria andBrithDateIsNull() {
            addCriterion("\"BRITH_DATE\" is null");
            return (Criteria) this;
        }

        public Criteria andBrithDateIsNotNull() {
            addCriterion("\"BRITH_DATE\" is not null");
            return (Criteria) this;
        }

        public Criteria andBrithDateEqualTo(Date value) {
            addCriterion("\"BRITH_DATE\" =", value, "brithDate");
            return (Criteria) this;
        }

        public Criteria andBrithDateNotEqualTo(Date value) {
            addCriterion("\"BRITH_DATE\" <>", value, "brithDate");
            return (Criteria) this;
        }

        public Criteria andBrithDateGreaterThan(Date value) {
            addCriterion("\"BRITH_DATE\" >", value, "brithDate");
            return (Criteria) this;
        }

        public Criteria andBrithDateGreaterThanOrEqualTo(Date value) {
            addCriterion("\"BRITH_DATE\" >=", value, "brithDate");
            return (Criteria) this;
        }

        public Criteria andBrithDateLessThan(Date value) {
            addCriterion("\"BRITH_DATE\" <", value, "brithDate");
            return (Criteria) this;
        }

        public Criteria andBrithDateLessThanOrEqualTo(Date value) {
            addCriterion("\"BRITH_DATE\" <=", value, "brithDate");
            return (Criteria) this;
        }

        public Criteria andBrithDateIn(List<Date> values) {
            addCriterion("\"BRITH_DATE\" in", values, "brithDate");
            return (Criteria) this;
        }

        public Criteria andBrithDateNotIn(List<Date> values) {
            addCriterion("\"BRITH_DATE\" not in", values, "brithDate");
            return (Criteria) this;
        }

        public Criteria andBrithDateBetween(Date value1, Date value2) {
            addCriterion("\"BRITH_DATE\" between", value1, value2, "brithDate");
            return (Criteria) this;
        }

        public Criteria andBrithDateNotBetween(Date value1, Date value2) {
            addCriterion("\"BRITH_DATE\" not between", value1, value2, "brithDate");
            return (Criteria) this;
        }

        public Criteria andPlaceOfDomicileIsNull() {
            addCriterion("\"PLACE_OF_DOMICILE\" is null");
            return (Criteria) this;
        }

        public Criteria andPlaceOfDomicileIsNotNull() {
            addCriterion("\"PLACE_OF_DOMICILE\" is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceOfDomicileEqualTo(String value) {
            addCriterion("\"PLACE_OF_DOMICILE\" =", value, "placeOfDomicile");
            return (Criteria) this;
        }

        public Criteria andPlaceOfDomicileNotEqualTo(String value) {
            addCriterion("\"PLACE_OF_DOMICILE\" <>", value, "placeOfDomicile");
            return (Criteria) this;
        }

        public Criteria andPlaceOfDomicileGreaterThan(String value) {
            addCriterion("\"PLACE_OF_DOMICILE\" >", value, "placeOfDomicile");
            return (Criteria) this;
        }

        public Criteria andPlaceOfDomicileGreaterThanOrEqualTo(String value) {
            addCriterion("\"PLACE_OF_DOMICILE\" >=", value, "placeOfDomicile");
            return (Criteria) this;
        }

        public Criteria andPlaceOfDomicileLessThan(String value) {
            addCriterion("\"PLACE_OF_DOMICILE\" <", value, "placeOfDomicile");
            return (Criteria) this;
        }

        public Criteria andPlaceOfDomicileLessThanOrEqualTo(String value) {
            addCriterion("\"PLACE_OF_DOMICILE\" <=", value, "placeOfDomicile");
            return (Criteria) this;
        }

        public Criteria andPlaceOfDomicileLike(String value) {
            addCriterion("\"PLACE_OF_DOMICILE\" like", value, "placeOfDomicile");
            return (Criteria) this;
        }

        public Criteria andPlaceOfDomicileNotLike(String value) {
            addCriterion("\"PLACE_OF_DOMICILE\" not like", value, "placeOfDomicile");
            return (Criteria) this;
        }

        public Criteria andPlaceOfDomicileIn(List<String> values) {
            addCriterion("\"PLACE_OF_DOMICILE\" in", values, "placeOfDomicile");
            return (Criteria) this;
        }

        public Criteria andPlaceOfDomicileNotIn(List<String> values) {
            addCriterion("\"PLACE_OF_DOMICILE\" not in", values, "placeOfDomicile");
            return (Criteria) this;
        }

        public Criteria andPlaceOfDomicileBetween(String value1, String value2) {
            addCriterion("\"PLACE_OF_DOMICILE\" between", value1, value2, "placeOfDomicile");
            return (Criteria) this;
        }

        public Criteria andPlaceOfDomicileNotBetween(String value1, String value2) {
            addCriterion("\"PLACE_OF_DOMICILE\" not between", value1, value2, "placeOfDomicile");
            return (Criteria) this;
        }

        public Criteria andTheFrontOfIdCardIsNull() {
            addCriterion("\"THE _FRONT_OF_ID_CARD\" is null");
            return (Criteria) this;
        }

        public Criteria andTheFrontOfIdCardIsNotNull() {
            addCriterion("\"THE _FRONT_OF_ID_CARD\" is not null");
            return (Criteria) this;
        }

        public Criteria andTheFrontOfIdCardEqualTo(String value) {
            addCriterion("\"THE _FRONT_OF_ID_CARD\" =", value, "theFrontOfIdCard");
            return (Criteria) this;
        }

        public Criteria andTheFrontOfIdCardNotEqualTo(String value) {
            addCriterion("\"THE _FRONT_OF_ID_CARD\" <>", value, "theFrontOfIdCard");
            return (Criteria) this;
        }

        public Criteria andTheFrontOfIdCardGreaterThan(String value) {
            addCriterion("\"THE _FRONT_OF_ID_CARD\" >", value, "theFrontOfIdCard");
            return (Criteria) this;
        }

        public Criteria andTheFrontOfIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("\"THE _FRONT_OF_ID_CARD\" >=", value, "theFrontOfIdCard");
            return (Criteria) this;
        }

        public Criteria andTheFrontOfIdCardLessThan(String value) {
            addCriterion("\"THE _FRONT_OF_ID_CARD\" <", value, "theFrontOfIdCard");
            return (Criteria) this;
        }

        public Criteria andTheFrontOfIdCardLessThanOrEqualTo(String value) {
            addCriterion("\"THE _FRONT_OF_ID_CARD\" <=", value, "theFrontOfIdCard");
            return (Criteria) this;
        }

        public Criteria andTheFrontOfIdCardLike(String value) {
            addCriterion("\"THE _FRONT_OF_ID_CARD\" like", value, "theFrontOfIdCard");
            return (Criteria) this;
        }

        public Criteria andTheFrontOfIdCardNotLike(String value) {
            addCriterion("\"THE _FRONT_OF_ID_CARD\" not like", value, "theFrontOfIdCard");
            return (Criteria) this;
        }

        public Criteria andTheFrontOfIdCardIn(List<String> values) {
            addCriterion("\"THE _FRONT_OF_ID_CARD\" in", values, "theFrontOfIdCard");
            return (Criteria) this;
        }

        public Criteria andTheFrontOfIdCardNotIn(List<String> values) {
            addCriterion("\"THE _FRONT_OF_ID_CARD\" not in", values, "theFrontOfIdCard");
            return (Criteria) this;
        }

        public Criteria andTheFrontOfIdCardBetween(String value1, String value2) {
            addCriterion("\"THE _FRONT_OF_ID_CARD\" between", value1, value2, "theFrontOfIdCard");
            return (Criteria) this;
        }

        public Criteria andTheFrontOfIdCardNotBetween(String value1, String value2) {
            addCriterion("\"THE _FRONT_OF_ID_CARD\" not between", value1, value2, "theFrontOfIdCard");
            return (Criteria) this;
        }

        public Criteria andTheBackOfIdCardIsNull() {
            addCriterion("\"THE _BACK_OF_ID_CARD\" is null");
            return (Criteria) this;
        }

        public Criteria andTheBackOfIdCardIsNotNull() {
            addCriterion("\"THE _BACK_OF_ID_CARD\" is not null");
            return (Criteria) this;
        }

        public Criteria andTheBackOfIdCardEqualTo(String value) {
            addCriterion("\"THE _BACK_OF_ID_CARD\" =", value, "theBackOfIdCard");
            return (Criteria) this;
        }

        public Criteria andTheBackOfIdCardNotEqualTo(String value) {
            addCriterion("\"THE _BACK_OF_ID_CARD\" <>", value, "theBackOfIdCard");
            return (Criteria) this;
        }

        public Criteria andTheBackOfIdCardGreaterThan(String value) {
            addCriterion("\"THE _BACK_OF_ID_CARD\" >", value, "theBackOfIdCard");
            return (Criteria) this;
        }

        public Criteria andTheBackOfIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("\"THE _BACK_OF_ID_CARD\" >=", value, "theBackOfIdCard");
            return (Criteria) this;
        }

        public Criteria andTheBackOfIdCardLessThan(String value) {
            addCriterion("\"THE _BACK_OF_ID_CARD\" <", value, "theBackOfIdCard");
            return (Criteria) this;
        }

        public Criteria andTheBackOfIdCardLessThanOrEqualTo(String value) {
            addCriterion("\"THE _BACK_OF_ID_CARD\" <=", value, "theBackOfIdCard");
            return (Criteria) this;
        }

        public Criteria andTheBackOfIdCardLike(String value) {
            addCriterion("\"THE _BACK_OF_ID_CARD\" like", value, "theBackOfIdCard");
            return (Criteria) this;
        }

        public Criteria andTheBackOfIdCardNotLike(String value) {
            addCriterion("\"THE _BACK_OF_ID_CARD\" not like", value, "theBackOfIdCard");
            return (Criteria) this;
        }

        public Criteria andTheBackOfIdCardIn(List<String> values) {
            addCriterion("\"THE _BACK_OF_ID_CARD\" in", values, "theBackOfIdCard");
            return (Criteria) this;
        }

        public Criteria andTheBackOfIdCardNotIn(List<String> values) {
            addCriterion("\"THE _BACK_OF_ID_CARD\" not in", values, "theBackOfIdCard");
            return (Criteria) this;
        }

        public Criteria andTheBackOfIdCardBetween(String value1, String value2) {
            addCriterion("\"THE _BACK_OF_ID_CARD\" between", value1, value2, "theBackOfIdCard");
            return (Criteria) this;
        }

        public Criteria andTheBackOfIdCardNotBetween(String value1, String value2) {
            addCriterion("\"THE _BACK_OF_ID_CARD\" not between", value1, value2, "theBackOfIdCard");
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