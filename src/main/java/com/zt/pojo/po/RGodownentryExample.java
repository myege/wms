 package com.zt.pojo.po;
 
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 public class RGodownentryExample
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
     protected List<RGodownentryExample.Criterion> criteria = new ArrayList<RGodownentryExample.Criterion>();
 
     
     public boolean isValid() {
       return (this.criteria.size() > 0);
     }
     
     public List<RGodownentryExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
     
     public List<RGodownentryExample.Criterion> getCriteria() {
       return this.criteria;
     }
     
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new RGodownentryExample.Criterion(condition));
     }
     
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new RGodownentryExample.Criterion(condition, value));
     }
     
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if (value1 == null || value2 == null) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new RGodownentryExample.Criterion(condition, value1, value2));
     }
     
     public RGodownentryExample.Criteria andIdIsNull() {
       addCriterion("id is null");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andIdIsNotNull() {
       addCriterion("id is not null");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andIdEqualTo(Integer value) {
       addCriterion("id =", value, "id");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andIdNotEqualTo(Integer value) {
       addCriterion("id <>", value, "id");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andIdGreaterThan(Integer value) {
       addCriterion("id >", value, "id");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("id >=", value, "id");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andIdLessThan(Integer value) {
       addCriterion("id <", value, "id");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andIdLessThanOrEqualTo(Integer value) {
       addCriterion("id <=", value, "id");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andIdIn(List<Integer> values) {
       addCriterion("id in", values, "id");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andIdNotIn(List<Integer> values) {
       addCriterion("id not in", values, "id");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andIdBetween(Integer value1, Integer value2) {
       addCriterion("id between", value1, value2, "id");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
       addCriterion("id not between", value1, value2, "id");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andGodowndhIsNull() {
       addCriterion("godownDh is null");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andGodowndhIsNotNull() {
       addCriterion("godownDh is not null");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andGodowndhEqualTo(String value) {
       addCriterion("godownDh =", value, "godowndh");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andGodowndhNotEqualTo(String value) {
       addCriterion("godownDh <>", value, "godowndh");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andGodowndhGreaterThan(String value) {
       addCriterion("godownDh >", value, "godowndh");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andGodowndhGreaterThanOrEqualTo(String value) {
       addCriterion("godownDh >=", value, "godowndh");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andGodowndhLessThan(String value) {
       addCriterion("godownDh <", value, "godowndh");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andGodowndhLessThanOrEqualTo(String value) {
       addCriterion("godownDh <=", value, "godowndh");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andGodowndhLike(String value) {
       addCriterion("godownDh like", value, "godowndh");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andGodowndhNotLike(String value) {
       addCriterion("godownDh not like", value, "godowndh");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andGodowndhIn(List<String> values) {
       addCriterion("godownDh in", values, "godowndh");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andGodowndhNotIn(List<String> values) {
       addCriterion("godownDh not in", values, "godowndh");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andGodowndhBetween(String value1, String value2) {
       addCriterion("godownDh between", value1, value2, "godowndh");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andGodowndhNotBetween(String value1, String value2) {
       addCriterion("godownDh not between", value1, value2, "godowndh");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andDeliverydhIsNull() {
       addCriterion("deliveryDh is null");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andDeliverydhIsNotNull() {
       addCriterion("deliveryDh is not null");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andDeliverydhEqualTo(String value) {
       addCriterion("deliveryDh =", value, "deliverydh");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andDeliverydhNotEqualTo(String value) {
       addCriterion("deliveryDh <>", value, "deliverydh");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andDeliverydhGreaterThan(String value) {
       addCriterion("deliveryDh >", value, "deliverydh");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andDeliverydhGreaterThanOrEqualTo(String value) {
       addCriterion("deliveryDh >=", value, "deliverydh");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andDeliverydhLessThan(String value) {
       addCriterion("deliveryDh <", value, "deliverydh");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andDeliverydhLessThanOrEqualTo(String value) {
       addCriterion("deliveryDh <=", value, "deliverydh");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andDeliverydhLike(String value) {
       addCriterion("deliveryDh like", value, "deliverydh");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andDeliverydhNotLike(String value) {
       addCriterion("deliveryDh not like", value, "deliverydh");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andDeliverydhIn(List<String> values) {
       addCriterion("deliveryDh in", values, "deliverydh");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andDeliverydhNotIn(List<String> values) {
       addCriterion("deliveryDh not in", values, "deliverydh");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andDeliverydhBetween(String value1, String value2) {
       addCriterion("deliveryDh between", value1, value2, "deliverydh");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andDeliverydhNotBetween(String value1, String value2) {
       addCriterion("deliveryDh not between", value1, value2, "deliverydh");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCompanycodeIsNull() {
       addCriterion("companyCode is null");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCompanycodeIsNotNull() {
       addCriterion("companyCode is not null");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCompanycodeEqualTo(String value) {
       addCriterion("companyCode =", value, "companycode");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCompanycodeNotEqualTo(String value) {
       addCriterion("companyCode <>", value, "companycode");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCompanycodeGreaterThan(String value) {
       addCriterion("companyCode >", value, "companycode");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCompanycodeGreaterThanOrEqualTo(String value) {
       addCriterion("companyCode >=", value, "companycode");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCompanycodeLessThan(String value) {
       addCriterion("companyCode <", value, "companycode");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCompanycodeLessThanOrEqualTo(String value) {
       addCriterion("companyCode <=", value, "companycode");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCompanycodeLike(String value) {
       addCriterion("companyCode like", value, "companycode");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCompanycodeNotLike(String value) {
       addCriterion("companyCode not like", value, "companycode");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCompanycodeIn(List<String> values) {
       addCriterion("companyCode in", values, "companycode");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCompanycodeNotIn(List<String> values) {
       addCriterion("companyCode not in", values, "companycode");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCompanycodeBetween(String value1, String value2) {
       addCriterion("companyCode between", value1, value2, "companycode");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCompanycodeNotBetween(String value1, String value2) {
       addCriterion("companyCode not between", value1, value2, "companycode");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCompanynameIsNull() {
       addCriterion("companyName is null");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCompanynameIsNotNull() {
       addCriterion("companyName is not null");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCompanynameEqualTo(String value) {
       addCriterion("companyName =", value, "companyname");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCompanynameNotEqualTo(String value) {
       addCriterion("companyName <>", value, "companyname");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCompanynameGreaterThan(String value) {
       addCriterion("companyName >", value, "companyname");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCompanynameGreaterThanOrEqualTo(String value) {
       addCriterion("companyName >=", value, "companyname");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCompanynameLessThan(String value) {
       addCriterion("companyName <", value, "companyname");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCompanynameLessThanOrEqualTo(String value) {
       addCriterion("companyName <=", value, "companyname");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCompanynameLike(String value) {
       addCriterion("companyName like", value, "companyname");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCompanynameNotLike(String value) {
       addCriterion("companyName not like", value, "companyname");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCompanynameIn(List<String> values) {
       addCriterion("companyName in", values, "companyname");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCompanynameNotIn(List<String> values) {
       addCriterion("companyName not in", values, "companyname");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCompanynameBetween(String value1, String value2) {
       addCriterion("companyName between", value1, value2, "companyname");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCompanynameNotBetween(String value1, String value2) {
       addCriterion("companyName not between", value1, value2, "companyname");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCasesIsNull() {
       addCriterion("cases is null");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCasesIsNotNull() {
       addCriterion("cases is not null");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCasesEqualTo(Integer value) {
       addCriterion("cases =", value, "cases");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCasesNotEqualTo(Integer value) {
       addCriterion("cases <>", value, "cases");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCasesGreaterThan(Integer value) {
       addCriterion("cases >", value, "cases");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCasesGreaterThanOrEqualTo(Integer value) {
       addCriterion("cases >=", value, "cases");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCasesLessThan(Integer value) {
       addCriterion("cases <", value, "cases");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCasesLessThanOrEqualTo(Integer value) {
       addCriterion("cases <=", value, "cases");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCasesIn(List<Integer> values) {
       addCriterion("cases in", values, "cases");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCasesNotIn(List<Integer> values) {
       addCriterion("cases not in", values, "cases");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCasesBetween(Integer value1, Integer value2) {
       addCriterion("cases between", value1, value2, "cases");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCasesNotBetween(Integer value1, Integer value2) {
       addCriterion("cases not between", value1, value2, "cases");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andNumIsNull() {
       addCriterion("num is null");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andNumIsNotNull() {
       addCriterion("num is not null");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andNumEqualTo(Integer value) {
       addCriterion("num =", value, "num");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andNumNotEqualTo(Integer value) {
       addCriterion("num <>", value, "num");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andNumGreaterThan(Integer value) {
       addCriterion("num >", value, "num");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andNumGreaterThanOrEqualTo(Integer value) {
       addCriterion("num >=", value, "num");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andNumLessThan(Integer value) {
       addCriterion("num <", value, "num");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andNumLessThanOrEqualTo(Integer value) {
       addCriterion("num <=", value, "num");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andNumIn(List<Integer> values) {
       addCriterion("num in", values, "num");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andNumNotIn(List<Integer> values) {
       addCriterion("num not in", values, "num");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andNumBetween(Integer value1, Integer value2) {
       addCriterion("num between", value1, value2, "num");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andNumNotBetween(Integer value1, Integer value2) {
       addCriterion("num not between", value1, value2, "num");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andArrivaltimeIsNull() {
       addCriterion("arrivalTime is null");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andArrivaltimeIsNotNull() {
       addCriterion("arrivalTime is not null");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andArrivaltimeEqualTo(Date value) {
       addCriterion("arrivalTime =", value, "arrivaltime");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andArrivaltimeNotEqualTo(Date value) {
       addCriterion("arrivalTime <>", value, "arrivaltime");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andArrivaltimeGreaterThan(Date value) {
       addCriterion("arrivalTime >", value, "arrivaltime");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andArrivaltimeGreaterThanOrEqualTo(Date value) {
       addCriterion("arrivalTime >=", value, "arrivaltime");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andArrivaltimeLessThan(Date value) {
       addCriterion("arrivalTime <", value, "arrivaltime");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andArrivaltimeLessThanOrEqualTo(Date value) {
       addCriterion("arrivalTime <=", value, "arrivaltime");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andArrivaltimeIn(List<Date> values) {
       addCriterion("arrivalTime in", values, "arrivaltime");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andArrivaltimeNotIn(List<Date> values) {
       addCriterion("arrivalTime not in", values, "arrivaltime");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andArrivaltimeBetween(Date value1, Date value2) {
       addCriterion("arrivalTime between", value1, value2, "arrivaltime");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andArrivaltimeNotBetween(Date value1, Date value2) {
       addCriterion("arrivalTime not between", value1, value2, "arrivaltime");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCreatetimeIsNull() {
       addCriterion("createTime is null");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCreatetimeIsNotNull() {
       addCriterion("createTime is not null");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCreatetimeEqualTo(Date value) {
       addCriterion("createTime =", value, "createtime");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCreatetimeNotEqualTo(Date value) {
       addCriterion("createTime <>", value, "createtime");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCreatetimeGreaterThan(Date value) {
       addCriterion("createTime >", value, "createtime");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
       addCriterion("createTime >=", value, "createtime");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCreatetimeLessThan(Date value) {
       addCriterion("createTime <", value, "createtime");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCreatetimeLessThanOrEqualTo(Date value) {
       addCriterion("createTime <=", value, "createtime");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCreatetimeIn(List<Date> values) {
       addCriterion("createTime in", values, "createtime");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCreatetimeNotIn(List<Date> values) {
       addCriterion("createTime not in", values, "createtime");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCreatetimeBetween(Date value1, Date value2) {
       addCriterion("createTime between", value1, value2, "createtime");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andCreatetimeNotBetween(Date value1, Date value2) {
       addCriterion("createTime not between", value1, value2, "createtime");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andNameIsNull() {
       addCriterion("name is null");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andNameIsNotNull() {
       addCriterion("name is not null");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andNameEqualTo(String value) {
       addCriterion("name =", value, "name");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andNameNotEqualTo(String value) {
       addCriterion("name <>", value, "name");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andNameGreaterThan(String value) {
       addCriterion("name >", value, "name");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andNameGreaterThanOrEqualTo(String value) {
       addCriterion("name >=", value, "name");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andNameLessThan(String value) {
       addCriterion("name <", value, "name");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andNameLessThanOrEqualTo(String value) {
       addCriterion("name <=", value, "name");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andNameLike(String value) {
       addCriterion("name like", value, "name");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andNameNotLike(String value) {
       addCriterion("name not like", value, "name");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andNameIn(List<String> values) {
       addCriterion("name in", values, "name");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andNameNotIn(List<String> values) {
       addCriterion("name not in", values, "name");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andNameBetween(String value1, String value2) {
       addCriterion("name between", value1, value2, "name");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andNameNotBetween(String value1, String value2) {
       addCriterion("name not between", value1, value2, "name");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andReceiptnameIsNull() {
       addCriterion("receiptName is null");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andReceiptnameIsNotNull() {
       addCriterion("receiptName is not null");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andReceiptnameEqualTo(String value) {
       addCriterion("receiptName =", value, "receiptname");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andReceiptnameNotEqualTo(String value) {
       addCriterion("receiptName <>", value, "receiptname");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andReceiptnameGreaterThan(String value) {
       addCriterion("receiptName >", value, "receiptname");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andReceiptnameGreaterThanOrEqualTo(String value) {
       addCriterion("receiptName >=", value, "receiptname");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andReceiptnameLessThan(String value) {
       addCriterion("receiptName <", value, "receiptname");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andReceiptnameLessThanOrEqualTo(String value) {
       addCriterion("receiptName <=", value, "receiptname");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andReceiptnameLike(String value) {
       addCriterion("receiptName like", value, "receiptname");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andReceiptnameNotLike(String value) {
       addCriterion("receiptName not like", value, "receiptname");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andReceiptnameIn(List<String> values) {
       addCriterion("receiptName in", values, "receiptname");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andReceiptnameNotIn(List<String> values) {
       addCriterion("receiptName not in", values, "receiptname");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andReceiptnameBetween(String value1, String value2) {
       addCriterion("receiptName between", value1, value2, "receiptname");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andReceiptnameNotBetween(String value1, String value2) {
       addCriterion("receiptName not between", value1, value2, "receiptname");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andReceipttimeIsNull() {
       addCriterion("receiptTime is null");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andReceipttimeIsNotNull() {
       addCriterion("receiptTime is not null");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andReceipttimeEqualTo(Date value) {
       addCriterion("receiptTime =", value, "receipttime");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andReceipttimeNotEqualTo(Date value) {
       addCriterion("receiptTime <>", value, "receipttime");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andReceipttimeGreaterThan(Date value) {
       addCriterion("receiptTime >", value, "receipttime");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andReceipttimeGreaterThanOrEqualTo(Date value) {
       addCriterion("receiptTime >=", value, "receipttime");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andReceipttimeLessThan(Date value) {
       addCriterion("receiptTime <", value, "receipttime");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andReceipttimeLessThanOrEqualTo(Date value) {
       addCriterion("receiptTime <=", value, "receipttime");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andReceipttimeIn(List<Date> values) {
       addCriterion("receiptTime in", values, "receipttime");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andReceipttimeNotIn(List<Date> values) {
       addCriterion("receiptTime not in", values, "receipttime");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andReceipttimeBetween(Date value1, Date value2) {
       addCriterion("receiptTime between", value1, value2, "receipttime");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andReceipttimeNotBetween(Date value1, Date value2) {
       addCriterion("receiptTime not between", value1, value2, "receipttime");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andTypeIsNull() {
       addCriterion("type is null");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andTypeIsNotNull() {
       addCriterion("type is not null");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andTypeEqualTo(String value) {
       addCriterion("type =", value, "type");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andTypeNotEqualTo(String value) {
       addCriterion("type <>", value, "type");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andTypeGreaterThan(String value) {
       addCriterion("type >", value, "type");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andTypeGreaterThanOrEqualTo(String value) {
       addCriterion("type >=", value, "type");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andTypeLessThan(String value) {
       addCriterion("type <", value, "type");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andTypeLessThanOrEqualTo(String value) {
       addCriterion("type <=", value, "type");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andTypeLike(String value) {
       addCriterion("type like", value, "type");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andTypeNotLike(String value) {
       addCriterion("type not like", value, "type");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andTypeIn(List<String> values) {
       addCriterion("type in", values, "type");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andTypeNotIn(List<String> values) {
       addCriterion("type not in", values, "type");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andTypeBetween(String value1, String value2) {
       addCriterion("type between", value1, value2, "type");
       return (RGodownentryExample.Criteria)this;
     }
     
     public RGodownentryExample.Criteria andTypeNotBetween(String value1, String value2) {
       addCriterion("type not between", value1, value2, "type");
       return (RGodownentryExample.Criteria)this;
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


