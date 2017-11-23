package com.share.golden.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysEmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysEmployeeExample() {
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

        public Criteria andEmployeeIdIsNull() {
            addCriterion("\"EMPLOYEE_ID\" is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNotNull() {
            addCriterion("\"EMPLOYEE_ID\" is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdEqualTo(String value) {
            addCriterion("\"EMPLOYEE_ID\" =", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotEqualTo(String value) {
            addCriterion("\"EMPLOYEE_ID\" <>", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThan(String value) {
            addCriterion("\"EMPLOYEE_ID\" >", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThanOrEqualTo(String value) {
            addCriterion("\"EMPLOYEE_ID\" >=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThan(String value) {
            addCriterion("\"EMPLOYEE_ID\" <", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThanOrEqualTo(String value) {
            addCriterion("\"EMPLOYEE_ID\" <=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLike(String value) {
            addCriterion("\"EMPLOYEE_ID\" like", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotLike(String value) {
            addCriterion("\"EMPLOYEE_ID\" not like", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIn(List<String> values) {
            addCriterion("\"EMPLOYEE_ID\" in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotIn(List<String> values) {
            addCriterion("\"EMPLOYEE_ID\" not in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdBetween(String value1, String value2) {
            addCriterion("\"EMPLOYEE_ID\" between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotBetween(String value1, String value2) {
            addCriterion("\"EMPLOYEE_ID\" not between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("\"DEPARTMENT_ID\" is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("\"DEPARTMENT_ID\" is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(String value) {
            addCriterion("\"DEPARTMENT_ID\" =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(String value) {
            addCriterion("\"DEPARTMENT_ID\" <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(String value) {
            addCriterion("\"DEPARTMENT_ID\" >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("\"DEPARTMENT_ID\" >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(String value) {
            addCriterion("\"DEPARTMENT_ID\" <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(String value) {
            addCriterion("\"DEPARTMENT_ID\" <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLike(String value) {
            addCriterion("\"DEPARTMENT_ID\" like", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotLike(String value) {
            addCriterion("\"DEPARTMENT_ID\" not like", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<String> values) {
            addCriterion("\"DEPARTMENT_ID\" in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<String> values) {
            addCriterion("\"DEPARTMENT_ID\" not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(String value1, String value2) {
            addCriterion("\"DEPARTMENT_ID\" between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(String value1, String value2) {
            addCriterion("\"DEPARTMENT_ID\" not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIsNull() {
            addCriterion("\"EMPLOYEE_NAME\" is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIsNotNull() {
            addCriterion("\"EMPLOYEE_NAME\" is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameEqualTo(String value) {
            addCriterion("\"EMPLOYEE_NAME\" =", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotEqualTo(String value) {
            addCriterion("\"EMPLOYEE_NAME\" <>", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThan(String value) {
            addCriterion("\"EMPLOYEE_NAME\" >", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThanOrEqualTo(String value) {
            addCriterion("\"EMPLOYEE_NAME\" >=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThan(String value) {
            addCriterion("\"EMPLOYEE_NAME\" <", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThanOrEqualTo(String value) {
            addCriterion("\"EMPLOYEE_NAME\" <=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLike(String value) {
            addCriterion("\"EMPLOYEE_NAME\" like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotLike(String value) {
            addCriterion("\"EMPLOYEE_NAME\" not like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIn(List<String> values) {
            addCriterion("\"EMPLOYEE_NAME\" in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotIn(List<String> values) {
            addCriterion("\"EMPLOYEE_NAME\" not in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameBetween(String value1, String value2) {
            addCriterion("\"EMPLOYEE_NAME\" between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotBetween(String value1, String value2) {
            addCriterion("\"EMPLOYEE_NAME\" not between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderIsNull() {
            addCriterion("\"EMPLOYEE_GENDER\" is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderIsNotNull() {
            addCriterion("\"EMPLOYEE_GENDER\" is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderEqualTo(String value) {
            addCriterion("\"EMPLOYEE_GENDER\" =", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderNotEqualTo(String value) {
            addCriterion("\"EMPLOYEE_GENDER\" <>", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderGreaterThan(String value) {
            addCriterion("\"EMPLOYEE_GENDER\" >", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderGreaterThanOrEqualTo(String value) {
            addCriterion("\"EMPLOYEE_GENDER\" >=", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderLessThan(String value) {
            addCriterion("\"EMPLOYEE_GENDER\" <", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderLessThanOrEqualTo(String value) {
            addCriterion("\"EMPLOYEE_GENDER\" <=", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderLike(String value) {
            addCriterion("\"EMPLOYEE_GENDER\" like", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderNotLike(String value) {
            addCriterion("\"EMPLOYEE_GENDER\" not like", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderIn(List<String> values) {
            addCriterion("\"EMPLOYEE_GENDER\" in", values, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderNotIn(List<String> values) {
            addCriterion("\"EMPLOYEE_GENDER\" not in", values, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderBetween(String value1, String value2) {
            addCriterion("\"EMPLOYEE_GENDER\" between", value1, value2, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderNotBetween(String value1, String value2) {
            addCriterion("\"EMPLOYEE_GENDER\" not between", value1, value2, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthIsNull() {
            addCriterion("\"EMPLOYEE_BIRTH\" is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthIsNotNull() {
            addCriterion("\"EMPLOYEE_BIRTH\" is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthEqualTo(Date value) {
            addCriterion("\"EMPLOYEE_BIRTH\" =", value, "employeeBirth");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthNotEqualTo(Date value) {
            addCriterion("\"EMPLOYEE_BIRTH\" <>", value, "employeeBirth");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthGreaterThan(Date value) {
            addCriterion("\"EMPLOYEE_BIRTH\" >", value, "employeeBirth");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthGreaterThanOrEqualTo(Date value) {
            addCriterion("\"EMPLOYEE_BIRTH\" >=", value, "employeeBirth");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthLessThan(Date value) {
            addCriterion("\"EMPLOYEE_BIRTH\" <", value, "employeeBirth");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthLessThanOrEqualTo(Date value) {
            addCriterion("\"EMPLOYEE_BIRTH\" <=", value, "employeeBirth");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthIn(List<Date> values) {
            addCriterion("\"EMPLOYEE_BIRTH\" in", values, "employeeBirth");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthNotIn(List<Date> values) {
            addCriterion("\"EMPLOYEE_BIRTH\" not in", values, "employeeBirth");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthBetween(Date value1, Date value2) {
            addCriterion("\"EMPLOYEE_BIRTH\" between", value1, value2, "employeeBirth");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthNotBetween(Date value1, Date value2) {
            addCriterion("\"EMPLOYEE_BIRTH\" not between", value1, value2, "employeeBirth");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdcardIsNull() {
            addCriterion("\"EMPLOYEE_IDCARD\" is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdcardIsNotNull() {
            addCriterion("\"EMPLOYEE_IDCARD\" is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdcardEqualTo(String value) {
            addCriterion("\"EMPLOYEE_IDCARD\" =", value, "employeeIdcard");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdcardNotEqualTo(String value) {
            addCriterion("\"EMPLOYEE_IDCARD\" <>", value, "employeeIdcard");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdcardGreaterThan(String value) {
            addCriterion("\"EMPLOYEE_IDCARD\" >", value, "employeeIdcard");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("\"EMPLOYEE_IDCARD\" >=", value, "employeeIdcard");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdcardLessThan(String value) {
            addCriterion("\"EMPLOYEE_IDCARD\" <", value, "employeeIdcard");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdcardLessThanOrEqualTo(String value) {
            addCriterion("\"EMPLOYEE_IDCARD\" <=", value, "employeeIdcard");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdcardLike(String value) {
            addCriterion("\"EMPLOYEE_IDCARD\" like", value, "employeeIdcard");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdcardNotLike(String value) {
            addCriterion("\"EMPLOYEE_IDCARD\" not like", value, "employeeIdcard");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdcardIn(List<String> values) {
            addCriterion("\"EMPLOYEE_IDCARD\" in", values, "employeeIdcard");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdcardNotIn(List<String> values) {
            addCriterion("\"EMPLOYEE_IDCARD\" not in", values, "employeeIdcard");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdcardBetween(String value1, String value2) {
            addCriterion("\"EMPLOYEE_IDCARD\" between", value1, value2, "employeeIdcard");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdcardNotBetween(String value1, String value2) {
            addCriterion("\"EMPLOYEE_IDCARD\" not between", value1, value2, "employeeIdcard");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneIsNull() {
            addCriterion("\"EMPLOYEE_PHONE\" is null");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneIsNotNull() {
            addCriterion("\"EMPLOYEE_PHONE\" is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneEqualTo(String value) {
            addCriterion("\"EMPLOYEE_PHONE\" =", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneNotEqualTo(String value) {
            addCriterion("\"EMPLOYEE_PHONE\" <>", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneGreaterThan(String value) {
            addCriterion("\"EMPLOYEE_PHONE\" >", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("\"EMPLOYEE_PHONE\" >=", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneLessThan(String value) {
            addCriterion("\"EMPLOYEE_PHONE\" <", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneLessThanOrEqualTo(String value) {
            addCriterion("\"EMPLOYEE_PHONE\" <=", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneLike(String value) {
            addCriterion("\"EMPLOYEE_PHONE\" like", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneNotLike(String value) {
            addCriterion("\"EMPLOYEE_PHONE\" not like", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneIn(List<String> values) {
            addCriterion("\"EMPLOYEE_PHONE\" in", values, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneNotIn(List<String> values) {
            addCriterion("\"EMPLOYEE_PHONE\" not in", values, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneBetween(String value1, String value2) {
            addCriterion("\"EMPLOYEE_PHONE\" between", value1, value2, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneNotBetween(String value1, String value2) {
            addCriterion("\"EMPLOYEE_PHONE\" not between", value1, value2, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailIsNull() {
            addCriterion("\"EMPLOYEE_EMAIL\" is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailIsNotNull() {
            addCriterion("\"EMPLOYEE_EMAIL\" is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailEqualTo(String value) {
            addCriterion("\"EMPLOYEE_EMAIL\" =", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailNotEqualTo(String value) {
            addCriterion("\"EMPLOYEE_EMAIL\" <>", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailGreaterThan(String value) {
            addCriterion("\"EMPLOYEE_EMAIL\" >", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailGreaterThanOrEqualTo(String value) {
            addCriterion("\"EMPLOYEE_EMAIL\" >=", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailLessThan(String value) {
            addCriterion("\"EMPLOYEE_EMAIL\" <", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailLessThanOrEqualTo(String value) {
            addCriterion("\"EMPLOYEE_EMAIL\" <=", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailLike(String value) {
            addCriterion("\"EMPLOYEE_EMAIL\" like", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailNotLike(String value) {
            addCriterion("\"EMPLOYEE_EMAIL\" not like", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailIn(List<String> values) {
            addCriterion("\"EMPLOYEE_EMAIL\" in", values, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailNotIn(List<String> values) {
            addCriterion("\"EMPLOYEE_EMAIL\" not in", values, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailBetween(String value1, String value2) {
            addCriterion("\"EMPLOYEE_EMAIL\" between", value1, value2, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailNotBetween(String value1, String value2) {
            addCriterion("\"EMPLOYEE_EMAIL\" not between", value1, value2, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andJobNumIsNull() {
            addCriterion("\"JOB_NUM\" is null");
            return (Criteria) this;
        }

        public Criteria andJobNumIsNotNull() {
            addCriterion("\"JOB_NUM\" is not null");
            return (Criteria) this;
        }

        public Criteria andJobNumEqualTo(String value) {
            addCriterion("\"JOB_NUM\" =", value, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumNotEqualTo(String value) {
            addCriterion("\"JOB_NUM\" <>", value, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumGreaterThan(String value) {
            addCriterion("\"JOB_NUM\" >", value, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumGreaterThanOrEqualTo(String value) {
            addCriterion("\"JOB_NUM\" >=", value, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumLessThan(String value) {
            addCriterion("\"JOB_NUM\" <", value, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumLessThanOrEqualTo(String value) {
            addCriterion("\"JOB_NUM\" <=", value, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumLike(String value) {
            addCriterion("\"JOB_NUM\" like", value, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumNotLike(String value) {
            addCriterion("\"JOB_NUM\" not like", value, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumIn(List<String> values) {
            addCriterion("\"JOB_NUM\" in", values, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumNotIn(List<String> values) {
            addCriterion("\"JOB_NUM\" not in", values, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumBetween(String value1, String value2) {
            addCriterion("\"JOB_NUM\" between", value1, value2, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumNotBetween(String value1, String value2) {
            addCriterion("\"JOB_NUM\" not between", value1, value2, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNull() {
            addCriterion("\"JOB_NAME\" is null");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNotNull() {
            addCriterion("\"JOB_NAME\" is not null");
            return (Criteria) this;
        }

        public Criteria andJobNameEqualTo(String value) {
            addCriterion("\"JOB_NAME\" =", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotEqualTo(String value) {
            addCriterion("\"JOB_NAME\" <>", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThan(String value) {
            addCriterion("\"JOB_NAME\" >", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThanOrEqualTo(String value) {
            addCriterion("\"JOB_NAME\" >=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThan(String value) {
            addCriterion("\"JOB_NAME\" <", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThanOrEqualTo(String value) {
            addCriterion("\"JOB_NAME\" <=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLike(String value) {
            addCriterion("\"JOB_NAME\" like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotLike(String value) {
            addCriterion("\"JOB_NAME\" not like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameIn(List<String> values) {
            addCriterion("\"JOB_NAME\" in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotIn(List<String> values) {
            addCriterion("\"JOB_NAME\" not in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameBetween(String value1, String value2) {
            addCriterion("\"JOB_NAME\" between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotBetween(String value1, String value2) {
            addCriterion("\"JOB_NAME\" not between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andEntryTimeIsNull() {
            addCriterion("\"ENTRY_TIME\" is null");
            return (Criteria) this;
        }

        public Criteria andEntryTimeIsNotNull() {
            addCriterion("\"ENTRY_TIME\" is not null");
            return (Criteria) this;
        }

        public Criteria andEntryTimeEqualTo(Date value) {
            addCriterion("\"ENTRY_TIME\" =", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotEqualTo(Date value) {
            addCriterion("\"ENTRY_TIME\" <>", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeGreaterThan(Date value) {
            addCriterion("\"ENTRY_TIME\" >", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("\"ENTRY_TIME\" >=", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeLessThan(Date value) {
            addCriterion("\"ENTRY_TIME\" <", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeLessThanOrEqualTo(Date value) {
            addCriterion("\"ENTRY_TIME\" <=", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeIn(List<Date> values) {
            addCriterion("\"ENTRY_TIME\" in", values, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotIn(List<Date> values) {
            addCriterion("\"ENTRY_TIME\" not in", values, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeBetween(Date value1, Date value2) {
            addCriterion("\"ENTRY_TIME\" between", value1, value2, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotBetween(Date value1, Date value2) {
            addCriterion("\"ENTRY_TIME\" not between", value1, value2, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusIsNull() {
            addCriterion("\"EMPLOYEE_STATUS\" is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusIsNotNull() {
            addCriterion("\"EMPLOYEE_STATUS\" is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusEqualTo(String value) {
            addCriterion("\"EMPLOYEE_STATUS\" =", value, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusNotEqualTo(String value) {
            addCriterion("\"EMPLOYEE_STATUS\" <>", value, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusGreaterThan(String value) {
            addCriterion("\"EMPLOYEE_STATUS\" >", value, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("\"EMPLOYEE_STATUS\" >=", value, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusLessThan(String value) {
            addCriterion("\"EMPLOYEE_STATUS\" <", value, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusLessThanOrEqualTo(String value) {
            addCriterion("\"EMPLOYEE_STATUS\" <=", value, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusLike(String value) {
            addCriterion("\"EMPLOYEE_STATUS\" like", value, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusNotLike(String value) {
            addCriterion("\"EMPLOYEE_STATUS\" not like", value, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusIn(List<String> values) {
            addCriterion("\"EMPLOYEE_STATUS\" in", values, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusNotIn(List<String> values) {
            addCriterion("\"EMPLOYEE_STATUS\" not in", values, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusBetween(String value1, String value2) {
            addCriterion("\"EMPLOYEE_STATUS\" between", value1, value2, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusNotBetween(String value1, String value2) {
            addCriterion("\"EMPLOYEE_STATUS\" not between", value1, value2, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordIsNull() {
            addCriterion("\"EMPLOYEE_PASSWORD\" is null");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordIsNotNull() {
            addCriterion("\"EMPLOYEE_PASSWORD\" is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordEqualTo(String value) {
            addCriterion("\"EMPLOYEE_PASSWORD\" =", value, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordNotEqualTo(String value) {
            addCriterion("\"EMPLOYEE_PASSWORD\" <>", value, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordGreaterThan(String value) {
            addCriterion("\"EMPLOYEE_PASSWORD\" >", value, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordGreaterThanOrEqualTo(String value) {
            addCriterion("\"EMPLOYEE_PASSWORD\" >=", value, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordLessThan(String value) {
            addCriterion("\"EMPLOYEE_PASSWORD\" <", value, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordLessThanOrEqualTo(String value) {
            addCriterion("\"EMPLOYEE_PASSWORD\" <=", value, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordLike(String value) {
            addCriterion("\"EMPLOYEE_PASSWORD\" like", value, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordNotLike(String value) {
            addCriterion("\"EMPLOYEE_PASSWORD\" not like", value, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordIn(List<String> values) {
            addCriterion("\"EMPLOYEE_PASSWORD\" in", values, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordNotIn(List<String> values) {
            addCriterion("\"EMPLOYEE_PASSWORD\" not in", values, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordBetween(String value1, String value2) {
            addCriterion("\"EMPLOYEE_PASSWORD\" between", value1, value2, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordNotBetween(String value1, String value2) {
            addCriterion("\"EMPLOYEE_PASSWORD\" not between", value1, value2, "employeePassword");
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