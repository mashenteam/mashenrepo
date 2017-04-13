package com.mashen.customer.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerVOExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public CustomerVOExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria implements Serializable {
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

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Integer value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Integer value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Integer value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Integer value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Integer> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Integer> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andProfessionIsNull() {
            addCriterion("profession is null");
            return (Criteria) this;
        }

        public Criteria andProfessionIsNotNull() {
            addCriterion("profession is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionEqualTo(String value) {
            addCriterion("profession =", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotEqualTo(String value) {
            addCriterion("profession <>", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionGreaterThan(String value) {
            addCriterion("profession >", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionGreaterThanOrEqualTo(String value) {
            addCriterion("profession >=", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLessThan(String value) {
            addCriterion("profession <", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLessThanOrEqualTo(String value) {
            addCriterion("profession <=", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLike(String value) {
            addCriterion("profession like", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotLike(String value) {
            addCriterion("profession not like", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionIn(List<String> values) {
            addCriterion("profession in", values, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotIn(List<String> values) {
            addCriterion("profession not in", values, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionBetween(String value1, String value2) {
            addCriterion("profession between", value1, value2, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotBetween(String value1, String value2) {
            addCriterion("profession not between", value1, value2, "profession");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNull() {
            addCriterion("degree is null");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNotNull() {
            addCriterion("degree is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeEqualTo(String value) {
            addCriterion("degree =", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotEqualTo(String value) {
            addCriterion("degree <>", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThan(String value) {
            addCriterion("degree >", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("degree >=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThan(String value) {
            addCriterion("degree <", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThanOrEqualTo(String value) {
            addCriterion("degree <=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLike(String value) {
            addCriterion("degree like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotLike(String value) {
            addCriterion("degree not like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeIn(List<String> values) {
            addCriterion("degree in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotIn(List<String> values) {
            addCriterion("degree not in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeBetween(String value1, String value2) {
            addCriterion("degree between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotBetween(String value1, String value2) {
            addCriterion("degree not between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andGraduationtimeIsNull() {
            addCriterion("graduationtime is null");
            return (Criteria) this;
        }

        public Criteria andGraduationtimeIsNotNull() {
            addCriterion("graduationtime is not null");
            return (Criteria) this;
        }

        public Criteria andGraduationtimeEqualTo(String value) {
            addCriterion("graduationtime =", value, "graduationtime");
            return (Criteria) this;
        }

        public Criteria andGraduationtimeNotEqualTo(String value) {
            addCriterion("graduationtime <>", value, "graduationtime");
            return (Criteria) this;
        }

        public Criteria andGraduationtimeGreaterThan(String value) {
            addCriterion("graduationtime >", value, "graduationtime");
            return (Criteria) this;
        }

        public Criteria andGraduationtimeGreaterThanOrEqualTo(String value) {
            addCriterion("graduationtime >=", value, "graduationtime");
            return (Criteria) this;
        }

        public Criteria andGraduationtimeLessThan(String value) {
            addCriterion("graduationtime <", value, "graduationtime");
            return (Criteria) this;
        }

        public Criteria andGraduationtimeLessThanOrEqualTo(String value) {
            addCriterion("graduationtime <=", value, "graduationtime");
            return (Criteria) this;
        }

        public Criteria andGraduationtimeLike(String value) {
            addCriterion("graduationtime like", value, "graduationtime");
            return (Criteria) this;
        }

        public Criteria andGraduationtimeNotLike(String value) {
            addCriterion("graduationtime not like", value, "graduationtime");
            return (Criteria) this;
        }

        public Criteria andGraduationtimeIn(List<String> values) {
            addCriterion("graduationtime in", values, "graduationtime");
            return (Criteria) this;
        }

        public Criteria andGraduationtimeNotIn(List<String> values) {
            addCriterion("graduationtime not in", values, "graduationtime");
            return (Criteria) this;
        }

        public Criteria andGraduationtimeBetween(String value1, String value2) {
            addCriterion("graduationtime between", value1, value2, "graduationtime");
            return (Criteria) this;
        }

        public Criteria andGraduationtimeNotBetween(String value1, String value2) {
            addCriterion("graduationtime not between", value1, value2, "graduationtime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andIsopenIsNull() {
            addCriterion("isopen is null");
            return (Criteria) this;
        }

        public Criteria andIsopenIsNotNull() {
            addCriterion("isopen is not null");
            return (Criteria) this;
        }

        public Criteria andIsopenEqualTo(String value) {
            addCriterion("isopen =", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenNotEqualTo(String value) {
            addCriterion("isopen <>", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenGreaterThan(String value) {
            addCriterion("isopen >", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenGreaterThanOrEqualTo(String value) {
            addCriterion("isopen >=", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenLessThan(String value) {
            addCriterion("isopen <", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenLessThanOrEqualTo(String value) {
            addCriterion("isopen <=", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenLike(String value) {
            addCriterion("isopen like", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenNotLike(String value) {
            addCriterion("isopen not like", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenIn(List<String> values) {
            addCriterion("isopen in", values, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenNotIn(List<String> values) {
            addCriterion("isopen not in", values, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenBetween(String value1, String value2) {
            addCriterion("isopen between", value1, value2, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenNotBetween(String value1, String value2) {
            addCriterion("isopen not between", value1, value2, "isopen");
            return (Criteria) this;
        }

        public Criteria andBaseinfoIsNull() {
            addCriterion("baseinfo is null");
            return (Criteria) this;
        }

        public Criteria andBaseinfoIsNotNull() {
            addCriterion("baseinfo is not null");
            return (Criteria) this;
        }

        public Criteria andBaseinfoEqualTo(String value) {
            addCriterion("baseinfo =", value, "baseinfo");
            return (Criteria) this;
        }

        public Criteria andBaseinfoNotEqualTo(String value) {
            addCriterion("baseinfo <>", value, "baseinfo");
            return (Criteria) this;
        }

        public Criteria andBaseinfoGreaterThan(String value) {
            addCriterion("baseinfo >", value, "baseinfo");
            return (Criteria) this;
        }

        public Criteria andBaseinfoGreaterThanOrEqualTo(String value) {
            addCriterion("baseinfo >=", value, "baseinfo");
            return (Criteria) this;
        }

        public Criteria andBaseinfoLessThan(String value) {
            addCriterion("baseinfo <", value, "baseinfo");
            return (Criteria) this;
        }

        public Criteria andBaseinfoLessThanOrEqualTo(String value) {
            addCriterion("baseinfo <=", value, "baseinfo");
            return (Criteria) this;
        }

        public Criteria andBaseinfoLike(String value) {
            addCriterion("baseinfo like", value, "baseinfo");
            return (Criteria) this;
        }

        public Criteria andBaseinfoNotLike(String value) {
            addCriterion("baseinfo not like", value, "baseinfo");
            return (Criteria) this;
        }

        public Criteria andBaseinfoIn(List<String> values) {
            addCriterion("baseinfo in", values, "baseinfo");
            return (Criteria) this;
        }

        public Criteria andBaseinfoNotIn(List<String> values) {
            addCriterion("baseinfo not in", values, "baseinfo");
            return (Criteria) this;
        }

        public Criteria andBaseinfoBetween(String value1, String value2) {
            addCriterion("baseinfo between", value1, value2, "baseinfo");
            return (Criteria) this;
        }

        public Criteria andBaseinfoNotBetween(String value1, String value2) {
            addCriterion("baseinfo not between", value1, value2, "baseinfo");
            return (Criteria) this;
        }

        public Criteria andEconomicinfoIsNull() {
            addCriterion("economicinfo is null");
            return (Criteria) this;
        }

        public Criteria andEconomicinfoIsNotNull() {
            addCriterion("economicinfo is not null");
            return (Criteria) this;
        }

        public Criteria andEconomicinfoEqualTo(String value) {
            addCriterion("economicinfo =", value, "economicinfo");
            return (Criteria) this;
        }

        public Criteria andEconomicinfoNotEqualTo(String value) {
            addCriterion("economicinfo <>", value, "economicinfo");
            return (Criteria) this;
        }

        public Criteria andEconomicinfoGreaterThan(String value) {
            addCriterion("economicinfo >", value, "economicinfo");
            return (Criteria) this;
        }

        public Criteria andEconomicinfoGreaterThanOrEqualTo(String value) {
            addCriterion("economicinfo >=", value, "economicinfo");
            return (Criteria) this;
        }

        public Criteria andEconomicinfoLessThan(String value) {
            addCriterion("economicinfo <", value, "economicinfo");
            return (Criteria) this;
        }

        public Criteria andEconomicinfoLessThanOrEqualTo(String value) {
            addCriterion("economicinfo <=", value, "economicinfo");
            return (Criteria) this;
        }

        public Criteria andEconomicinfoLike(String value) {
            addCriterion("economicinfo like", value, "economicinfo");
            return (Criteria) this;
        }

        public Criteria andEconomicinfoNotLike(String value) {
            addCriterion("economicinfo not like", value, "economicinfo");
            return (Criteria) this;
        }

        public Criteria andEconomicinfoIn(List<String> values) {
            addCriterion("economicinfo in", values, "economicinfo");
            return (Criteria) this;
        }

        public Criteria andEconomicinfoNotIn(List<String> values) {
            addCriterion("economicinfo not in", values, "economicinfo");
            return (Criteria) this;
        }

        public Criteria andEconomicinfoBetween(String value1, String value2) {
            addCriterion("economicinfo between", value1, value2, "economicinfo");
            return (Criteria) this;
        }

        public Criteria andEconomicinfoNotBetween(String value1, String value2) {
            addCriterion("economicinfo not between", value1, value2, "economicinfo");
            return (Criteria) this;
        }

        public Criteria andLoaninfIsNull() {
            addCriterion("loaninf is null");
            return (Criteria) this;
        }

        public Criteria andLoaninfIsNotNull() {
            addCriterion("loaninf is not null");
            return (Criteria) this;
        }

        public Criteria andLoaninfEqualTo(String value) {
            addCriterion("loaninf =", value, "loaninf");
            return (Criteria) this;
        }

        public Criteria andLoaninfNotEqualTo(String value) {
            addCriterion("loaninf <>", value, "loaninf");
            return (Criteria) this;
        }

        public Criteria andLoaninfGreaterThan(String value) {
            addCriterion("loaninf >", value, "loaninf");
            return (Criteria) this;
        }

        public Criteria andLoaninfGreaterThanOrEqualTo(String value) {
            addCriterion("loaninf >=", value, "loaninf");
            return (Criteria) this;
        }

        public Criteria andLoaninfLessThan(String value) {
            addCriterion("loaninf <", value, "loaninf");
            return (Criteria) this;
        }

        public Criteria andLoaninfLessThanOrEqualTo(String value) {
            addCriterion("loaninf <=", value, "loaninf");
            return (Criteria) this;
        }

        public Criteria andLoaninfLike(String value) {
            addCriterion("loaninf like", value, "loaninf");
            return (Criteria) this;
        }

        public Criteria andLoaninfNotLike(String value) {
            addCriterion("loaninf not like", value, "loaninf");
            return (Criteria) this;
        }

        public Criteria andLoaninfIn(List<String> values) {
            addCriterion("loaninf in", values, "loaninf");
            return (Criteria) this;
        }

        public Criteria andLoaninfNotIn(List<String> values) {
            addCriterion("loaninf not in", values, "loaninf");
            return (Criteria) this;
        }

        public Criteria andLoaninfBetween(String value1, String value2) {
            addCriterion("loaninf between", value1, value2, "loaninf");
            return (Criteria) this;
        }

        public Criteria andLoaninfNotBetween(String value1, String value2) {
            addCriterion("loaninf not between", value1, value2, "loaninf");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Date value) {
            addCriterion("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Date value) {
            addCriterion("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Date value) {
            addCriterion("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Date value) {
            addCriterion("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Date value) {
            addCriterion("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Date> values) {
            addCriterion("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Date> values) {
            addCriterion("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Date value1, Date value2) {
            addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Date value1, Date value2) {
            addCriterion("ctime not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andLastmodifytimeIsNull() {
            addCriterion("lastmodifytime is null");
            return (Criteria) this;
        }

        public Criteria andLastmodifytimeIsNotNull() {
            addCriterion("lastmodifytime is not null");
            return (Criteria) this;
        }

        public Criteria andLastmodifytimeEqualTo(Date value) {
            addCriterion("lastmodifytime =", value, "lastmodifytime");
            return (Criteria) this;
        }

        public Criteria andLastmodifytimeNotEqualTo(Date value) {
            addCriterion("lastmodifytime <>", value, "lastmodifytime");
            return (Criteria) this;
        }

        public Criteria andLastmodifytimeGreaterThan(Date value) {
            addCriterion("lastmodifytime >", value, "lastmodifytime");
            return (Criteria) this;
        }

        public Criteria andLastmodifytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastmodifytime >=", value, "lastmodifytime");
            return (Criteria) this;
        }

        public Criteria andLastmodifytimeLessThan(Date value) {
            addCriterion("lastmodifytime <", value, "lastmodifytime");
            return (Criteria) this;
        }

        public Criteria andLastmodifytimeLessThanOrEqualTo(Date value) {
            addCriterion("lastmodifytime <=", value, "lastmodifytime");
            return (Criteria) this;
        }

        public Criteria andLastmodifytimeIn(List<Date> values) {
            addCriterion("lastmodifytime in", values, "lastmodifytime");
            return (Criteria) this;
        }

        public Criteria andLastmodifytimeNotIn(List<Date> values) {
            addCriterion("lastmodifytime not in", values, "lastmodifytime");
            return (Criteria) this;
        }

        public Criteria andLastmodifytimeBetween(Date value1, Date value2) {
            addCriterion("lastmodifytime between", value1, value2, "lastmodifytime");
            return (Criteria) this;
        }

        public Criteria andLastmodifytimeNotBetween(Date value1, Date value2) {
            addCriterion("lastmodifytime not between", value1, value2, "lastmodifytime");
            return (Criteria) this;
        }

        public Criteria andCreatorDepartmentIdIsNull() {
            addCriterion("creator_department_id is null");
            return (Criteria) this;
        }

        public Criteria andCreatorDepartmentIdIsNotNull() {
            addCriterion("creator_department_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorDepartmentIdEqualTo(String value) {
            addCriterion("creator_department_id =", value, "creatorDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCreatorDepartmentIdNotEqualTo(String value) {
            addCriterion("creator_department_id <>", value, "creatorDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCreatorDepartmentIdGreaterThan(String value) {
            addCriterion("creator_department_id >", value, "creatorDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCreatorDepartmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("creator_department_id >=", value, "creatorDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCreatorDepartmentIdLessThan(String value) {
            addCriterion("creator_department_id <", value, "creatorDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCreatorDepartmentIdLessThanOrEqualTo(String value) {
            addCriterion("creator_department_id <=", value, "creatorDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCreatorDepartmentIdLike(String value) {
            addCriterion("creator_department_id like", value, "creatorDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCreatorDepartmentIdNotLike(String value) {
            addCriterion("creator_department_id not like", value, "creatorDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCreatorDepartmentIdIn(List<String> values) {
            addCriterion("creator_department_id in", values, "creatorDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCreatorDepartmentIdNotIn(List<String> values) {
            addCriterion("creator_department_id not in", values, "creatorDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCreatorDepartmentIdBetween(String value1, String value2) {
            addCriterion("creator_department_id between", value1, value2, "creatorDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCreatorDepartmentIdNotBetween(String value1, String value2) {
            addCriterion("creator_department_id not between", value1, value2, "creatorDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdIsNull() {
            addCriterion("creator_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdIsNotNull() {
            addCriterion("creator_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdEqualTo(String value) {
            addCriterion("creator_user_id =", value, "creatorUserId");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdNotEqualTo(String value) {
            addCriterion("creator_user_id <>", value, "creatorUserId");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdGreaterThan(String value) {
            addCriterion("creator_user_id >", value, "creatorUserId");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("creator_user_id >=", value, "creatorUserId");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdLessThan(String value) {
            addCriterion("creator_user_id <", value, "creatorUserId");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdLessThanOrEqualTo(String value) {
            addCriterion("creator_user_id <=", value, "creatorUserId");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdLike(String value) {
            addCriterion("creator_user_id like", value, "creatorUserId");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdNotLike(String value) {
            addCriterion("creator_user_id not like", value, "creatorUserId");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdIn(List<String> values) {
            addCriterion("creator_user_id in", values, "creatorUserId");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdNotIn(List<String> values) {
            addCriterion("creator_user_id not in", values, "creatorUserId");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdBetween(String value1, String value2) {
            addCriterion("creator_user_id between", value1, value2, "creatorUserId");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdNotBetween(String value1, String value2) {
            addCriterion("creator_user_id not between", value1, value2, "creatorUserId");
            return (Criteria) this;
        }

        public Criteria andFirstCreatorUserIdIsNull() {
            addCriterion("first_creator_user_id is null");
            return (Criteria) this;
        }

        public Criteria andFirstCreatorUserIdIsNotNull() {
            addCriterion("first_creator_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andFirstCreatorUserIdEqualTo(String value) {
            addCriterion("first_creator_user_id =", value, "firstCreatorUserId");
            return (Criteria) this;
        }

        public Criteria andFirstCreatorUserIdNotEqualTo(String value) {
            addCriterion("first_creator_user_id <>", value, "firstCreatorUserId");
            return (Criteria) this;
        }

        public Criteria andFirstCreatorUserIdGreaterThan(String value) {
            addCriterion("first_creator_user_id >", value, "firstCreatorUserId");
            return (Criteria) this;
        }

        public Criteria andFirstCreatorUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("first_creator_user_id >=", value, "firstCreatorUserId");
            return (Criteria) this;
        }

        public Criteria andFirstCreatorUserIdLessThan(String value) {
            addCriterion("first_creator_user_id <", value, "firstCreatorUserId");
            return (Criteria) this;
        }

        public Criteria andFirstCreatorUserIdLessThanOrEqualTo(String value) {
            addCriterion("first_creator_user_id <=", value, "firstCreatorUserId");
            return (Criteria) this;
        }

        public Criteria andFirstCreatorUserIdLike(String value) {
            addCriterion("first_creator_user_id like", value, "firstCreatorUserId");
            return (Criteria) this;
        }

        public Criteria andFirstCreatorUserIdNotLike(String value) {
            addCriterion("first_creator_user_id not like", value, "firstCreatorUserId");
            return (Criteria) this;
        }

        public Criteria andFirstCreatorUserIdIn(List<String> values) {
            addCriterion("first_creator_user_id in", values, "firstCreatorUserId");
            return (Criteria) this;
        }

        public Criteria andFirstCreatorUserIdNotIn(List<String> values) {
            addCriterion("first_creator_user_id not in", values, "firstCreatorUserId");
            return (Criteria) this;
        }

        public Criteria andFirstCreatorUserIdBetween(String value1, String value2) {
            addCriterion("first_creator_user_id between", value1, value2, "firstCreatorUserId");
            return (Criteria) this;
        }

        public Criteria andFirstCreatorUserIdNotBetween(String value1, String value2) {
            addCriterion("first_creator_user_id not between", value1, value2, "firstCreatorUserId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
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