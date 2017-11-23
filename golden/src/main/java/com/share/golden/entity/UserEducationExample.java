package com.share.golden.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserEducationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserEducationExample() {
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

        public Criteria andEducationIdIsNull() {
            addCriterion("\"EDUCATION_ID\" is null");
            return (Criteria) this;
        }

        public Criteria andEducationIdIsNotNull() {
            addCriterion("\"EDUCATION_ID\" is not null");
            return (Criteria) this;
        }

        public Criteria andEducationIdEqualTo(String value) {
            addCriterion("\"EDUCATION_ID\" =", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdNotEqualTo(String value) {
            addCriterion("\"EDUCATION_ID\" <>", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdGreaterThan(String value) {
            addCriterion("\"EDUCATION_ID\" >", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdGreaterThanOrEqualTo(String value) {
            addCriterion("\"EDUCATION_ID\" >=", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdLessThan(String value) {
            addCriterion("\"EDUCATION_ID\" <", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdLessThanOrEqualTo(String value) {
            addCriterion("\"EDUCATION_ID\" <=", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdLike(String value) {
            addCriterion("\"EDUCATION_ID\" like", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdNotLike(String value) {
            addCriterion("\"EDUCATION_ID\" not like", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdIn(List<String> values) {
            addCriterion("\"EDUCATION_ID\" in", values, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdNotIn(List<String> values) {
            addCriterion("\"EDUCATION_ID\" not in", values, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdBetween(String value1, String value2) {
            addCriterion("\"EDUCATION_ID\" between", value1, value2, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdNotBetween(String value1, String value2) {
            addCriterion("\"EDUCATION_ID\" not between", value1, value2, "educationId");
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

        public Criteria andSchoolIsNull() {
            addCriterion("\"SCHOOL\" is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("\"SCHOOL\" is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("\"SCHOOL\" =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("\"SCHOOL\" <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("\"SCHOOL\" >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("\"SCHOOL\" >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("\"SCHOOL\" <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("\"SCHOOL\" <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("\"SCHOOL\" like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("\"SCHOOL\" not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("\"SCHOOL\" in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("\"SCHOOL\" not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("\"SCHOOL\" between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("\"SCHOOL\" not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("\"MAJOR\" is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("\"MAJOR\" is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("\"MAJOR\" =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("\"MAJOR\" <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("\"MAJOR\" >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("\"MAJOR\" >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("\"MAJOR\" <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("\"MAJOR\" <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("\"MAJOR\" like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("\"MAJOR\" not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("\"MAJOR\" in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("\"MAJOR\" not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("\"MAJOR\" between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("\"MAJOR\" not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("\"EDUCATION\" is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("\"EDUCATION\" is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("\"EDUCATION\" =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("\"EDUCATION\" <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("\"EDUCATION\" >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("\"EDUCATION\" >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("\"EDUCATION\" <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("\"EDUCATION\" <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("\"EDUCATION\" like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("\"EDUCATION\" not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("\"EDUCATION\" in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("\"EDUCATION\" not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("\"EDUCATION\" between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("\"EDUCATION\" not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateIsNull() {
            addCriterion("\"ADMISSION_DATE\" is null");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateIsNotNull() {
            addCriterion("\"ADMISSION_DATE\" is not null");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateEqualTo(Date value) {
            addCriterion("\"ADMISSION_DATE\" =", value, "admissionDate");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateNotEqualTo(Date value) {
            addCriterion("\"ADMISSION_DATE\" <>", value, "admissionDate");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateGreaterThan(Date value) {
            addCriterion("\"ADMISSION_DATE\" >", value, "admissionDate");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateGreaterThanOrEqualTo(Date value) {
            addCriterion("\"ADMISSION_DATE\" >=", value, "admissionDate");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateLessThan(Date value) {
            addCriterion("\"ADMISSION_DATE\" <", value, "admissionDate");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateLessThanOrEqualTo(Date value) {
            addCriterion("\"ADMISSION_DATE\" <=", value, "admissionDate");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateIn(List<Date> values) {
            addCriterion("\"ADMISSION_DATE\" in", values, "admissionDate");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateNotIn(List<Date> values) {
            addCriterion("\"ADMISSION_DATE\" not in", values, "admissionDate");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateBetween(Date value1, Date value2) {
            addCriterion("\"ADMISSION_DATE\" between", value1, value2, "admissionDate");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateNotBetween(Date value1, Date value2) {
            addCriterion("\"ADMISSION_DATE\" not between", value1, value2, "admissionDate");
            return (Criteria) this;
        }

        public Criteria andGraduationYearIsNull() {
            addCriterion("\"GRADUATION_YEAR\" is null");
            return (Criteria) this;
        }

        public Criteria andGraduationYearIsNotNull() {
            addCriterion("\"GRADUATION_YEAR\" is not null");
            return (Criteria) this;
        }

        public Criteria andGraduationYearEqualTo(Date value) {
            addCriterion("\"GRADUATION_YEAR\" =", value, "graduationYear");
            return (Criteria) this;
        }

        public Criteria andGraduationYearNotEqualTo(Date value) {
            addCriterion("\"GRADUATION_YEAR\" <>", value, "graduationYear");
            return (Criteria) this;
        }

        public Criteria andGraduationYearGreaterThan(Date value) {
            addCriterion("\"GRADUATION_YEAR\" >", value, "graduationYear");
            return (Criteria) this;
        }

        public Criteria andGraduationYearGreaterThanOrEqualTo(Date value) {
            addCriterion("\"GRADUATION_YEAR\" >=", value, "graduationYear");
            return (Criteria) this;
        }

        public Criteria andGraduationYearLessThan(Date value) {
            addCriterion("\"GRADUATION_YEAR\" <", value, "graduationYear");
            return (Criteria) this;
        }

        public Criteria andGraduationYearLessThanOrEqualTo(Date value) {
            addCriterion("\"GRADUATION_YEAR\" <=", value, "graduationYear");
            return (Criteria) this;
        }

        public Criteria andGraduationYearIn(List<Date> values) {
            addCriterion("\"GRADUATION_YEAR\" in", values, "graduationYear");
            return (Criteria) this;
        }

        public Criteria andGraduationYearNotIn(List<Date> values) {
            addCriterion("\"GRADUATION_YEAR\" not in", values, "graduationYear");
            return (Criteria) this;
        }

        public Criteria andGraduationYearBetween(Date value1, Date value2) {
            addCriterion("\"GRADUATION_YEAR\" between", value1, value2, "graduationYear");
            return (Criteria) this;
        }

        public Criteria andGraduationYearNotBetween(Date value1, Date value2) {
            addCriterion("\"GRADUATION_YEAR\" not between", value1, value2, "graduationYear");
            return (Criteria) this;
        }

        public Criteria andCertificateIsNull() {
            addCriterion("\"CERTIFICATE\" is null");
            return (Criteria) this;
        }

        public Criteria andCertificateIsNotNull() {
            addCriterion("\"CERTIFICATE\" is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateEqualTo(String value) {
            addCriterion("\"CERTIFICATE\" =", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotEqualTo(String value) {
            addCriterion("\"CERTIFICATE\" <>", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateGreaterThan(String value) {
            addCriterion("\"CERTIFICATE\" >", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateGreaterThanOrEqualTo(String value) {
            addCriterion("\"CERTIFICATE\" >=", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateLessThan(String value) {
            addCriterion("\"CERTIFICATE\" <", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateLessThanOrEqualTo(String value) {
            addCriterion("\"CERTIFICATE\" <=", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateLike(String value) {
            addCriterion("\"CERTIFICATE\" like", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotLike(String value) {
            addCriterion("\"CERTIFICATE\" not like", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateIn(List<String> values) {
            addCriterion("\"CERTIFICATE\" in", values, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotIn(List<String> values) {
            addCriterion("\"CERTIFICATE\" not in", values, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateBetween(String value1, String value2) {
            addCriterion("\"CERTIFICATE\" between", value1, value2, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotBetween(String value1, String value2) {
            addCriterion("\"CERTIFICATE\" not between", value1, value2, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificationDateIsNull() {
            addCriterion("\"CERTIFICATION_DATE\" is null");
            return (Criteria) this;
        }

        public Criteria andCertificationDateIsNotNull() {
            addCriterion("\"CERTIFICATION_DATE\" is not null");
            return (Criteria) this;
        }

        public Criteria andCertificationDateEqualTo(Date value) {
            addCriterion("\"CERTIFICATION_DATE\" =", value, "certificationDate");
            return (Criteria) this;
        }

        public Criteria andCertificationDateNotEqualTo(Date value) {
            addCriterion("\"CERTIFICATION_DATE\" <>", value, "certificationDate");
            return (Criteria) this;
        }

        public Criteria andCertificationDateGreaterThan(Date value) {
            addCriterion("\"CERTIFICATION_DATE\" >", value, "certificationDate");
            return (Criteria) this;
        }

        public Criteria andCertificationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("\"CERTIFICATION_DATE\" >=", value, "certificationDate");
            return (Criteria) this;
        }

        public Criteria andCertificationDateLessThan(Date value) {
            addCriterion("\"CERTIFICATION_DATE\" <", value, "certificationDate");
            return (Criteria) this;
        }

        public Criteria andCertificationDateLessThanOrEqualTo(Date value) {
            addCriterion("\"CERTIFICATION_DATE\" <=", value, "certificationDate");
            return (Criteria) this;
        }

        public Criteria andCertificationDateIn(List<Date> values) {
            addCriterion("\"CERTIFICATION_DATE\" in", values, "certificationDate");
            return (Criteria) this;
        }

        public Criteria andCertificationDateNotIn(List<Date> values) {
            addCriterion("\"CERTIFICATION_DATE\" not in", values, "certificationDate");
            return (Criteria) this;
        }

        public Criteria andCertificationDateBetween(Date value1, Date value2) {
            addCriterion("\"CERTIFICATION_DATE\" between", value1, value2, "certificationDate");
            return (Criteria) this;
        }

        public Criteria andCertificationDateNotBetween(Date value1, Date value2) {
            addCriterion("\"CERTIFICATION_DATE\" not between", value1, value2, "certificationDate");
            return (Criteria) this;
        }

        public Criteria andCheckTypeIsNull() {
            addCriterion("\"CHECK_TYPE\" is null");
            return (Criteria) this;
        }

        public Criteria andCheckTypeIsNotNull() {
            addCriterion("\"CHECK_TYPE\" is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTypeEqualTo(String value) {
            addCriterion("\"CHECK_TYPE\" =", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeNotEqualTo(String value) {
            addCriterion("\"CHECK_TYPE\" <>", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeGreaterThan(String value) {
            addCriterion("\"CHECK_TYPE\" >", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeGreaterThanOrEqualTo(String value) {
            addCriterion("\"CHECK_TYPE\" >=", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeLessThan(String value) {
            addCriterion("\"CHECK_TYPE\" <", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeLessThanOrEqualTo(String value) {
            addCriterion("\"CHECK_TYPE\" <=", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeLike(String value) {
            addCriterion("\"CHECK_TYPE\" like", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeNotLike(String value) {
            addCriterion("\"CHECK_TYPE\" not like", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeIn(List<String> values) {
            addCriterion("\"CHECK_TYPE\" in", values, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeNotIn(List<String> values) {
            addCriterion("\"CHECK_TYPE\" not in", values, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeBetween(String value1, String value2) {
            addCriterion("\"CHECK_TYPE\" between", value1, value2, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeNotBetween(String value1, String value2) {
            addCriterion("\"CHECK_TYPE\" not between", value1, value2, "checkType");
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