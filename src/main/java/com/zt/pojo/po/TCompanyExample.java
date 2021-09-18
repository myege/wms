 package com.zt.pojo.po;
 
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 public class TCompanyExample
 {
   protected String orderByClause;
   protected boolean distinct;
   protected List<Criteria> oredCriteria = new ArrayList<Criteria>();
 
   
   public void setOrderByClause(String orderByClause) {
     this.orderByClause = orderByClause;
   }
   
   public String getOrderByClause() {
     return this.orderByClause;
   }
   
   public void setDistinct(boolean distinct) {
     this.distinct = distinct;
   }
   
   public boolean isDistinct() {
     return this.distinct;
   }
   
   public List<Criteria> getOredCriteria() {
     return this.oredCriteria;
   }
   
   public void or(Criteria criteria) {
     this.oredCriteria.add(criteria);
   }
   
   public Criteria or() {
     Criteria criteria = createCriteriaInternal();
     this.oredCriteria.add(criteria);
     return criteria;
   }
   
   public Criteria createCriteria() {
     Criteria criteria = createCriteriaInternal();
     if (this.oredCriteria.size() == 0) {
       this.oredCriteria.add(criteria);
     }
     return criteria;
   }
   
   protected Criteria createCriteriaInternal() {
     Criteria criteria = new Criteria();
     return criteria;
   }
   
   public void clear() {
     this.oredCriteria.clear();
     this.orderByClause = null;
     this.distinct = false;
   }
 
 
 
   
   protected static abstract class GeneratedCriteria
   {
     protected List<TCompanyExample.Criterion> criteria = new ArrayList<TCompanyExample.Criterion>();
 
     
     public boolean isValid() {
       return (this.criteria.size() > 0);
     }
     
     public List<TCompanyExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
     
     public List<TCompanyExample.Criterion> getCriteria() {
       return this.criteria;
     }
     
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new TCompanyExample.Criterion(condition));
     }
     
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new TCompanyExample.Criterion(condition, value));
     }
     
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if (value1 == null || value2 == null) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new TCompanyExample.Criterion(condition, value1, value2));
     }
     
     public TCompanyExample.Criteria andIdIsNull() {
       addCriterion("id is null");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andIdIsNotNull() {
       addCriterion("id is not null");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andIdEqualTo(Integer value) {
       addCriterion("id =", value, "id");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andIdNotEqualTo(Integer value) {
       addCriterion("id <>", value, "id");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andIdGreaterThan(Integer value) {
       addCriterion("id >", value, "id");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("id >=", value, "id");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andIdLessThan(Integer value) {
       addCriterion("id <", value, "id");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andIdLessThanOrEqualTo(Integer value) {
       addCriterion("id <=", value, "id");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andIdIn(List<Integer> values) {
       addCriterion("id in", values, "id");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andIdNotIn(List<Integer> values) {
       addCriterion("id not in", values, "id");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andIdBetween(Integer value1, Integer value2) {
       addCriterion("id between", value1, value2, "id");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
       addCriterion("id not between", value1, value2, "id");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andCompanynameIsNull() {
       addCriterion("companyName is null");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andCompanynameIsNotNull() {
       addCriterion("companyName is not null");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andCompanynameEqualTo(String value) {
       addCriterion("companyName =", value, "companyname");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andCompanynameNotEqualTo(String value) {
       addCriterion("companyName <>", value, "companyname");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andCompanynameGreaterThan(String value) {
       addCriterion("companyName >", value, "companyname");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andCompanynameGreaterThanOrEqualTo(String value) {
       addCriterion("companyName >=", value, "companyname");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andCompanynameLessThan(String value) {
       addCriterion("companyName <", value, "companyname");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andCompanynameLessThanOrEqualTo(String value) {
       addCriterion("companyName <=", value, "companyname");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andCompanynameLike(String value) {
       addCriterion("companyName like", value, "companyname");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andCompanynameNotLike(String value) {
       addCriterion("companyName not like", value, "companyname");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andCompanynameIn(List<String> values) {
       addCriterion("companyName in", values, "companyname");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andCompanynameNotIn(List<String> values) {
       addCriterion("companyName not in", values, "companyname");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andCompanynameBetween(String value1, String value2) {
       addCriterion("companyName between", value1, value2, "companyname");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andCompanynameNotBetween(String value1, String value2) {
       addCriterion("companyName not between", value1, value2, "companyname");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andCompanycodeIsNull() {
       addCriterion("companyCode is null");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andCompanycodeIsNotNull() {
       addCriterion("companyCode is not null");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andCompanycodeEqualTo(String value) {
       addCriterion("companyCode =", value, "companycode");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andCompanycodeNotEqualTo(String value) {
       addCriterion("companyCode <>", value, "companycode");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andCompanycodeGreaterThan(String value) {
       addCriterion("companyCode >", value, "companycode");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andCompanycodeGreaterThanOrEqualTo(String value) {
       addCriterion("companyCode >=", value, "companycode");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andCompanycodeLessThan(String value) {
       addCriterion("companyCode <", value, "companycode");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andCompanycodeLessThanOrEqualTo(String value) {
       addCriterion("companyCode <=", value, "companycode");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andCompanycodeLike(String value) {
       addCriterion("companyCode like", value, "companycode");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andCompanycodeNotLike(String value) {
       addCriterion("companyCode not like", value, "companycode");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andCompanycodeIn(List<String> values) {
       addCriterion("companyCode in", values, "companycode");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andCompanycodeNotIn(List<String> values) {
       addCriterion("companyCode not in", values, "companycode");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andCompanycodeBetween(String value1, String value2) {
       addCriterion("companyCode between", value1, value2, "companycode");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andCompanycodeNotBetween(String value1, String value2) {
       addCriterion("companyCode not between", value1, value2, "companycode");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andSendnameIsNull() {
       addCriterion("sendName is null");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andSendnameIsNotNull() {
       addCriterion("sendName is not null");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andSendnameEqualTo(String value) {
       addCriterion("sendName =", value, "sendname");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andSendnameNotEqualTo(String value) {
       addCriterion("sendName <>", value, "sendname");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andSendnameGreaterThan(String value) {
       addCriterion("sendName >", value, "sendname");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andSendnameGreaterThanOrEqualTo(String value) {
       addCriterion("sendName >=", value, "sendname");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andSendnameLessThan(String value) {
       addCriterion("sendName <", value, "sendname");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andSendnameLessThanOrEqualTo(String value) {
       addCriterion("sendName <=", value, "sendname");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andSendnameLike(String value) {
       addCriterion("sendName like", value, "sendname");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andSendnameNotLike(String value) {
       addCriterion("sendName not like", value, "sendname");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andSendnameIn(List<String> values) {
       addCriterion("sendName in", values, "sendname");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andSendnameNotIn(List<String> values) {
       addCriterion("sendName not in", values, "sendname");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andSendnameBetween(String value1, String value2) {
       addCriterion("sendName between", value1, value2, "sendname");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andSendnameNotBetween(String value1, String value2) {
       addCriterion("sendName not between", value1, value2, "sendname");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andSendphoneIsNull() {
       addCriterion("sendPhone is null");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andSendphoneIsNotNull() {
       addCriterion("sendPhone is not null");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andSendphoneEqualTo(String value) {
       addCriterion("sendPhone =", value, "sendphone");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andSendphoneNotEqualTo(String value) {
       addCriterion("sendPhone <>", value, "sendphone");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andSendphoneGreaterThan(String value) {
       addCriterion("sendPhone >", value, "sendphone");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andSendphoneGreaterThanOrEqualTo(String value) {
       addCriterion("sendPhone >=", value, "sendphone");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andSendphoneLessThan(String value) {
       addCriterion("sendPhone <", value, "sendphone");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andSendphoneLessThanOrEqualTo(String value) {
       addCriterion("sendPhone <=", value, "sendphone");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andSendphoneLike(String value) {
       addCriterion("sendPhone like", value, "sendphone");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andSendphoneNotLike(String value) {
       addCriterion("sendPhone not like", value, "sendphone");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andSendphoneIn(List<String> values) {
       addCriterion("sendPhone in", values, "sendphone");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andSendphoneNotIn(List<String> values) {
       addCriterion("sendPhone not in", values, "sendphone");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andSendphoneBetween(String value1, String value2) {
       addCriterion("sendPhone between", value1, value2, "sendphone");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andSendphoneNotBetween(String value1, String value2) {
       addCriterion("sendPhone not between", value1, value2, "sendphone");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andSendaddressIsNull() {
       addCriterion("sendAddress is null");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andSendaddressIsNotNull() {
       addCriterion("sendAddress is not null");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andSendaddressEqualTo(String value) {
       addCriterion("sendAddress =", value, "sendaddress");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andSendaddressNotEqualTo(String value) {
       addCriterion("sendAddress <>", value, "sendaddress");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andSendaddressGreaterThan(String value) {
       addCriterion("sendAddress >", value, "sendaddress");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andSendaddressGreaterThanOrEqualTo(String value) {
       addCriterion("sendAddress >=", value, "sendaddress");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andSendaddressLessThan(String value) {
       addCriterion("sendAddress <", value, "sendaddress");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andSendaddressLessThanOrEqualTo(String value) {
       addCriterion("sendAddress <=", value, "sendaddress");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andSendaddressLike(String value) {
       addCriterion("sendAddress like", value, "sendaddress");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andSendaddressNotLike(String value) {
       addCriterion("sendAddress not like", value, "sendaddress");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andSendaddressIn(List<String> values) {
       addCriterion("sendAddress in", values, "sendaddress");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andSendaddressNotIn(List<String> values) {
       addCriterion("sendAddress not in", values, "sendaddress");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andSendaddressBetween(String value1, String value2) {
       addCriterion("sendAddress between", value1, value2, "sendaddress");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andSendaddressNotBetween(String value1, String value2) {
       addCriterion("sendAddress not between", value1, value2, "sendaddress");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andCreatetimeIsNull() {
       addCriterion("createTime is null");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andCreatetimeIsNotNull() {
       addCriterion("createTime is not null");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andCreatetimeEqualTo(Date value) {
       addCriterion("createTime =", value, "createtime");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andCreatetimeNotEqualTo(Date value) {
       addCriterion("createTime <>", value, "createtime");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andCreatetimeGreaterThan(Date value) {
       addCriterion("createTime >", value, "createtime");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
       addCriterion("createTime >=", value, "createtime");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andCreatetimeLessThan(Date value) {
       addCriterion("createTime <", value, "createtime");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andCreatetimeLessThanOrEqualTo(Date value) {
       addCriterion("createTime <=", value, "createtime");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andCreatetimeIn(List<Date> values) {
       addCriterion("createTime in", values, "createtime");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andCreatetimeNotIn(List<Date> values) {
       addCriterion("createTime not in", values, "createtime");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andCreatetimeBetween(Date value1, Date value2) {
       addCriterion("createTime between", value1, value2, "createtime");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andCreatetimeNotBetween(Date value1, Date value2) {
       addCriterion("createTime not between", value1, value2, "createtime");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andIsdeleteIsNull() {
       addCriterion("isDelete is null");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andIsdeleteIsNotNull() {
       addCriterion("isDelete is not null");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andIsdeleteEqualTo(Integer value) {
       addCriterion("isDelete =", value, "isdelete");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andIsdeleteNotEqualTo(Integer value) {
       addCriterion("isDelete <>", value, "isdelete");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andIsdeleteGreaterThan(Integer value) {
       addCriterion("isDelete >", value, "isdelete");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andIsdeleteGreaterThanOrEqualTo(Integer value) {
       addCriterion("isDelete >=", value, "isdelete");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andIsdeleteLessThan(Integer value) {
       addCriterion("isDelete <", value, "isdelete");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andIsdeleteLessThanOrEqualTo(Integer value) {
       addCriterion("isDelete <=", value, "isdelete");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andIsdeleteIn(List<Integer> values) {
       addCriterion("isDelete in", values, "isdelete");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andIsdeleteNotIn(List<Integer> values) {
       addCriterion("isDelete not in", values, "isdelete");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andIsdeleteBetween(Integer value1, Integer value2) {
       addCriterion("isDelete between", value1, value2, "isdelete");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andIsdeleteNotBetween(Integer value1, Integer value2) {
       addCriterion("isDelete not between", value1, value2, "isdelete");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andDelivercompanyIsNull() {
       addCriterion("delivercompany is null");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andDelivercompanyIsNotNull() {
       addCriterion("delivercompany is not null");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andDelivercompanyEqualTo(String value) {
       addCriterion("delivercompany =", value, "delivercompany");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andDelivercompanyNotEqualTo(String value) {
       addCriterion("delivercompany <>", value, "delivercompany");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andDelivercompanyGreaterThan(String value) {
       addCriterion("delivercompany >", value, "delivercompany");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andDelivercompanyGreaterThanOrEqualTo(String value) {
       addCriterion("delivercompany >=", value, "delivercompany");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andDelivercompanyLessThan(String value) {
       addCriterion("delivercompany <", value, "delivercompany");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andDelivercompanyLessThanOrEqualTo(String value) {
       addCriterion("delivercompany <=", value, "delivercompany");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andDelivercompanyLike(String value) {
       addCriterion("delivercompany like", value, "delivercompany");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andDelivercompanyNotLike(String value) {
       addCriterion("delivercompany not like", value, "delivercompany");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andDelivercompanyIn(List<String> values) {
       addCriterion("delivercompany in", values, "delivercompany");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andDelivercompanyNotIn(List<String> values) {
       addCriterion("delivercompany not in", values, "delivercompany");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andDelivercompanyBetween(String value1, String value2) {
       addCriterion("delivercompany between", value1, value2, "delivercompany");
       return (TCompanyExample.Criteria)this;
     }
     
     public TCompanyExample.Criteria andDelivercompanyNotBetween(String value1, String value2) {
       addCriterion("delivercompany not between", value1, value2, "delivercompany");
       return (TCompanyExample.Criteria)this;
     }
   }
 
   
   public static class Criteria
     extends GeneratedCriteria {}
 
   
   public static class Criterion
   {
     private String condition;
     
     private Object value;
     
     private Object secondValue;
     
     private boolean noValue;
     
     private boolean singleValue;
     
     private boolean betweenValue;
     
     private boolean listValue;
     
     private String typeHandler;
 
     
     public String getCondition() {
       return this.condition;
     }
     
     public Object getValue() {
       return this.value;
     }
     
     public Object getSecondValue() {
       return this.secondValue;
     }
     
     public boolean isNoValue() {
       return this.noValue;
     }
     
     public boolean isSingleValue() {
       return this.singleValue;
     }
     
     public boolean isBetweenValue() {
       return this.betweenValue;
     }
     
     public boolean isListValue() {
       return this.listValue;
     }
     
     public String getTypeHandler() {
       return this.typeHandler;
     }
 
     
     protected Criterion(String condition) {
       this.condition = condition;
       this.typeHandler = null;
       this.noValue = true;
     }
 
     
     protected Criterion(String condition, Object value, String typeHandler) {
       this.condition = condition;
       this.value = value;
       this.typeHandler = typeHandler;
       if (value instanceof List) {
         this.listValue = true;
       } else {
         this.singleValue = true;
       } 
     }
     
     protected Criterion(String condition, Object value) {
       this(condition, value, (String)null);
     }
 
     
     protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
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


