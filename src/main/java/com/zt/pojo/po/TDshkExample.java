 package com.zt.pojo.po;
 
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 public class TDshkExample
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
     protected List<TDshkExample.Criterion> criteria = new ArrayList<TDshkExample.Criterion>();
 
     
     public boolean isValid() {
       return (this.criteria.size() > 0);
     }
     
     public List<TDshkExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
     
     public List<TDshkExample.Criterion> getCriteria() {
       return this.criteria;
     }
     
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new TDshkExample.Criterion(condition));
     }
     
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new TDshkExample.Criterion(condition, value));
     }
     
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if (value1 == null || value2 == null) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new TDshkExample.Criterion(condition, value1, value2));
     }
     
     public TDshkExample.Criteria andIdIsNull() {
       addCriterion("id is null");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andIdIsNotNull() {
       addCriterion("id is not null");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andIdEqualTo(Integer value) {
       addCriterion("id =", value, "id");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andIdNotEqualTo(Integer value) {
       addCriterion("id <>", value, "id");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andIdGreaterThan(Integer value) {
       addCriterion("id >", value, "id");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("id >=", value, "id");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andIdLessThan(Integer value) {
       addCriterion("id <", value, "id");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andIdLessThanOrEqualTo(Integer value) {
       addCriterion("id <=", value, "id");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andIdIn(List<Integer> values) {
       addCriterion("id in", values, "id");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andIdNotIn(List<Integer> values) {
       addCriterion("id not in", values, "id");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andIdBetween(Integer value1, Integer value2) {
       addCriterion("id between", value1, value2, "id");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
       addCriterion("id not between", value1, value2, "id");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andCompanycodeIsNull() {
       addCriterion("companyCode is null");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andCompanycodeIsNotNull() {
       addCriterion("companyCode is not null");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andCompanycodeEqualTo(String value) {
       addCriterion("companyCode =", value, "companycode");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andCompanycodeNotEqualTo(String value) {
       addCriterion("companyCode <>", value, "companycode");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andCompanycodeGreaterThan(String value) {
       addCriterion("companyCode >", value, "companycode");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andCompanycodeGreaterThanOrEqualTo(String value) {
       addCriterion("companyCode >=", value, "companycode");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andCompanycodeLessThan(String value) {
       addCriterion("companyCode <", value, "companycode");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andCompanycodeLessThanOrEqualTo(String value) {
       addCriterion("companyCode <=", value, "companycode");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andCompanycodeLike(String value) {
       addCriterion("companyCode like", value, "companycode");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andCompanycodeNotLike(String value) {
       addCriterion("companyCode not like", value, "companycode");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andCompanycodeIn(List<String> values) {
       addCriterion("companyCode in", values, "companycode");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andCompanycodeNotIn(List<String> values) {
       addCriterion("companyCode not in", values, "companycode");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andCompanycodeBetween(String value1, String value2) {
       addCriterion("companyCode between", value1, value2, "companycode");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andCompanycodeNotBetween(String value1, String value2) {
       addCriterion("companyCode not between", value1, value2, "companycode");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andOrdernoIsNull() {
       addCriterion("orderNo is null");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andOrdernoIsNotNull() {
       addCriterion("orderNo is not null");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andOrdernoEqualTo(String value) {
       addCriterion("orderNo =", value, "orderno");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andOrdernoNotEqualTo(String value) {
       addCriterion("orderNo <>", value, "orderno");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andOrdernoGreaterThan(String value) {
       addCriterion("orderNo >", value, "orderno");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andOrdernoGreaterThanOrEqualTo(String value) {
       addCriterion("orderNo >=", value, "orderno");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andOrdernoLessThan(String value) {
       addCriterion("orderNo <", value, "orderno");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andOrdernoLessThanOrEqualTo(String value) {
       addCriterion("orderNo <=", value, "orderno");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andOrdernoLike(String value) {
       addCriterion("orderNo like", value, "orderno");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andOrdernoNotLike(String value) {
       addCriterion("orderNo not like", value, "orderno");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andOrdernoIn(List<String> values) {
       addCriterion("orderNo in", values, "orderno");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andOrdernoNotIn(List<String> values) {
       addCriterion("orderNo not in", values, "orderno");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andOrdernoBetween(String value1, String value2) {
       addCriterion("orderNo between", value1, value2, "orderno");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andOrdernoNotBetween(String value1, String value2) {
       addCriterion("orderNo not between", value1, value2, "orderno");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andWorthIsNull() {
       addCriterion("worth is null");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andWorthIsNotNull() {
       addCriterion("worth is not null");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andWorthEqualTo(String value) {
       addCriterion("worth =", value, "worth");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andWorthNotEqualTo(String value) {
       addCriterion("worth <>", value, "worth");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andWorthGreaterThan(String value) {
       addCriterion("worth >", value, "worth");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andWorthGreaterThanOrEqualTo(String value) {
       addCriterion("worth >=", value, "worth");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andWorthLessThan(String value) {
       addCriterion("worth <", value, "worth");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andWorthLessThanOrEqualTo(String value) {
       addCriterion("worth <=", value, "worth");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andWorthLike(String value) {
       addCriterion("worth like", value, "worth");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andWorthNotLike(String value) {
       addCriterion("worth not like", value, "worth");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andWorthIn(List<String> values) {
       addCriterion("worth in", values, "worth");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andWorthNotIn(List<String> values) {
       addCriterion("worth not in", values, "worth");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andWorthBetween(String value1, String value2) {
       addCriterion("worth between", value1, value2, "worth");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andWorthNotBetween(String value1, String value2) {
       addCriterion("worth not between", value1, value2, "worth");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andSendnameIsNull() {
       addCriterion("sendName is null");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andSendnameIsNotNull() {
       addCriterion("sendName is not null");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andSendnameEqualTo(String value) {
       addCriterion("sendName =", value, "sendname");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andSendnameNotEqualTo(String value) {
       addCriterion("sendName <>", value, "sendname");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andSendnameGreaterThan(String value) {
       addCriterion("sendName >", value, "sendname");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andSendnameGreaterThanOrEqualTo(String value) {
       addCriterion("sendName >=", value, "sendname");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andSendnameLessThan(String value) {
       addCriterion("sendName <", value, "sendname");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andSendnameLessThanOrEqualTo(String value) {
       addCriterion("sendName <=", value, "sendname");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andSendnameLike(String value) {
       addCriterion("sendName like", value, "sendname");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andSendnameNotLike(String value) {
       addCriterion("sendName not like", value, "sendname");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andSendnameIn(List<String> values) {
       addCriterion("sendName in", values, "sendname");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andSendnameNotIn(List<String> values) {
       addCriterion("sendName not in", values, "sendname");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andSendnameBetween(String value1, String value2) {
       addCriterion("sendName between", value1, value2, "sendname");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andSendnameNotBetween(String value1, String value2) {
       addCriterion("sendName not between", value1, value2, "sendname");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andSendtelIsNull() {
       addCriterion("sendTel is null");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andSendtelIsNotNull() {
       addCriterion("sendTel is not null");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andSendtelEqualTo(String value) {
       addCriterion("sendTel =", value, "sendtel");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andSendtelNotEqualTo(String value) {
       addCriterion("sendTel <>", value, "sendtel");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andSendtelGreaterThan(String value) {
       addCriterion("sendTel >", value, "sendtel");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andSendtelGreaterThanOrEqualTo(String value) {
       addCriterion("sendTel >=", value, "sendtel");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andSendtelLessThan(String value) {
       addCriterion("sendTel <", value, "sendtel");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andSendtelLessThanOrEqualTo(String value) {
       addCriterion("sendTel <=", value, "sendtel");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andSendtelLike(String value) {
       addCriterion("sendTel like", value, "sendtel");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andSendtelNotLike(String value) {
       addCriterion("sendTel not like", value, "sendtel");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andSendtelIn(List<String> values) {
       addCriterion("sendTel in", values, "sendtel");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andSendtelNotIn(List<String> values) {
       addCriterion("sendTel not in", values, "sendtel");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andSendtelBetween(String value1, String value2) {
       addCriterion("sendTel between", value1, value2, "sendtel");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andSendtelNotBetween(String value1, String value2) {
       addCriterion("sendTel not between", value1, value2, "sendtel");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andSendaddressIsNull() {
       addCriterion("sendAddress is null");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andSendaddressIsNotNull() {
       addCriterion("sendAddress is not null");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andSendaddressEqualTo(String value) {
       addCriterion("sendAddress =", value, "sendaddress");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andSendaddressNotEqualTo(String value) {
       addCriterion("sendAddress <>", value, "sendaddress");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andSendaddressGreaterThan(String value) {
       addCriterion("sendAddress >", value, "sendaddress");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andSendaddressGreaterThanOrEqualTo(String value) {
       addCriterion("sendAddress >=", value, "sendaddress");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andSendaddressLessThan(String value) {
       addCriterion("sendAddress <", value, "sendaddress");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andSendaddressLessThanOrEqualTo(String value) {
       addCriterion("sendAddress <=", value, "sendaddress");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andSendaddressLike(String value) {
       addCriterion("sendAddress like", value, "sendaddress");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andSendaddressNotLike(String value) {
       addCriterion("sendAddress not like", value, "sendaddress");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andSendaddressIn(List<String> values) {
       addCriterion("sendAddress in", values, "sendaddress");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andSendaddressNotIn(List<String> values) {
       addCriterion("sendAddress not in", values, "sendaddress");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andSendaddressBetween(String value1, String value2) {
       addCriterion("sendAddress between", value1, value2, "sendaddress");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andSendaddressNotBetween(String value1, String value2) {
       addCriterion("sendAddress not between", value1, value2, "sendaddress");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andCreatetimeIsNull() {
       addCriterion("createTime is null");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andCreatetimeIsNotNull() {
       addCriterion("createTime is not null");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andCreatetimeEqualTo(Date value) {
       addCriterion("createTime =", value, "createtime");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andCreatetimeNotEqualTo(Date value) {
       addCriterion("createTime <>", value, "createtime");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andCreatetimeGreaterThan(Date value) {
       addCriterion("createTime >", value, "createtime");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
       addCriterion("createTime >=", value, "createtime");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andCreatetimeLessThan(Date value) {
       addCriterion("createTime <", value, "createtime");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andCreatetimeLessThanOrEqualTo(Date value) {
       addCriterion("createTime <=", value, "createtime");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andCreatetimeIn(List<Date> values) {
       addCriterion("createTime in", values, "createtime");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andCreatetimeNotIn(List<Date> values) {
       addCriterion("createTime not in", values, "createtime");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andCreatetimeBetween(Date value1, Date value2) {
       addCriterion("createTime between", value1, value2, "createtime");
       return (TDshkExample.Criteria)this;
     }
     
     public TDshkExample.Criteria andCreatetimeNotBetween(Date value1, Date value2) {
       addCriterion("createTime not between", value1, value2, "createtime");
       return (TDshkExample.Criteria)this;
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


