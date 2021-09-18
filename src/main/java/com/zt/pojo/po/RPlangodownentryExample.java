 package com.zt.pojo.po;
 
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 public class RPlangodownentryExample
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
     protected List<RPlangodownentryExample.Criterion> criteria = new ArrayList<RPlangodownentryExample.Criterion>();
 
     
     public boolean isValid() {
       return (this.criteria.size() > 0);
     }
     
     public List<RPlangodownentryExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
     
     public List<RPlangodownentryExample.Criterion> getCriteria() {
       return this.criteria;
     }
     
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new RPlangodownentryExample.Criterion(condition));
     }
     
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new RPlangodownentryExample.Criterion(condition, value));
     }
     
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if (value1 == null || value2 == null) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new RPlangodownentryExample.Criterion(condition, value1, value2));
     }
     
     public RPlangodownentryExample.Criteria andIdIsNull() {
       addCriterion("id is null");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andIdIsNotNull() {
       addCriterion("id is not null");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andIdEqualTo(Integer value) {
       addCriterion("id =", value, "id");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andIdNotEqualTo(Integer value) {
       addCriterion("id <>", value, "id");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andIdGreaterThan(Integer value) {
       addCriterion("id >", value, "id");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("id >=", value, "id");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andIdLessThan(Integer value) {
       addCriterion("id <", value, "id");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andIdLessThanOrEqualTo(Integer value) {
       addCriterion("id <=", value, "id");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andIdIn(List<Integer> values) {
       addCriterion("id in", values, "id");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andIdNotIn(List<Integer> values) {
       addCriterion("id not in", values, "id");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andIdBetween(Integer value1, Integer value2) {
       addCriterion("id between", value1, value2, "id");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
       addCriterion("id not between", value1, value2, "id");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andGodowndhIsNull() {
       addCriterion("godownDh is null");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andGodowndhIsNotNull() {
       addCriterion("godownDh is not null");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andGodowndhEqualTo(String value) {
       addCriterion("godownDh =", value, "godowndh");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andGodowndhNotEqualTo(String value) {
       addCriterion("godownDh <>", value, "godowndh");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andGodowndhGreaterThan(String value) {
       addCriterion("godownDh >", value, "godowndh");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andGodowndhGreaterThanOrEqualTo(String value) {
       addCriterion("godownDh >=", value, "godowndh");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andGodowndhLessThan(String value) {
       addCriterion("godownDh <", value, "godowndh");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andGodowndhLessThanOrEqualTo(String value) {
       addCriterion("godownDh <=", value, "godowndh");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andGodowndhLike(String value) {
       addCriterion("godownDh like", value, "godowndh");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andGodowndhNotLike(String value) {
       addCriterion("godownDh not like", value, "godowndh");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andGodowndhIn(List<String> values) {
       addCriterion("godownDh in", values, "godowndh");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andGodowndhNotIn(List<String> values) {
       addCriterion("godownDh not in", values, "godowndh");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andGodowndhBetween(String value1, String value2) {
       addCriterion("godownDh between", value1, value2, "godowndh");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andGodowndhNotBetween(String value1, String value2) {
       addCriterion("godownDh not between", value1, value2, "godowndh");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andDeliverydhIsNull() {
       addCriterion("deliveryDh is null");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andDeliverydhIsNotNull() {
       addCriterion("deliveryDh is not null");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andDeliverydhEqualTo(String value) {
       addCriterion("deliveryDh =", value, "deliverydh");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andDeliverydhNotEqualTo(String value) {
       addCriterion("deliveryDh <>", value, "deliverydh");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andDeliverydhGreaterThan(String value) {
       addCriterion("deliveryDh >", value, "deliverydh");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andDeliverydhGreaterThanOrEqualTo(String value) {
       addCriterion("deliveryDh >=", value, "deliverydh");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andDeliverydhLessThan(String value) {
       addCriterion("deliveryDh <", value, "deliverydh");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andDeliverydhLessThanOrEqualTo(String value) {
       addCriterion("deliveryDh <=", value, "deliverydh");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andDeliverydhLike(String value) {
       addCriterion("deliveryDh like", value, "deliverydh");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andDeliverydhNotLike(String value) {
       addCriterion("deliveryDh not like", value, "deliverydh");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andDeliverydhIn(List<String> values) {
       addCriterion("deliveryDh in", values, "deliverydh");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andDeliverydhNotIn(List<String> values) {
       addCriterion("deliveryDh not in", values, "deliverydh");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andDeliverydhBetween(String value1, String value2) {
       addCriterion("deliveryDh between", value1, value2, "deliverydh");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andDeliverydhNotBetween(String value1, String value2) {
       addCriterion("deliveryDh not between", value1, value2, "deliverydh");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCompanycodeIsNull() {
       addCriterion("companyCode is null");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCompanycodeIsNotNull() {
       addCriterion("companyCode is not null");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCompanycodeEqualTo(String value) {
       addCriterion("companyCode =", value, "companycode");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCompanycodeNotEqualTo(String value) {
       addCriterion("companyCode <>", value, "companycode");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCompanycodeGreaterThan(String value) {
       addCriterion("companyCode >", value, "companycode");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCompanycodeGreaterThanOrEqualTo(String value) {
       addCriterion("companyCode >=", value, "companycode");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCompanycodeLessThan(String value) {
       addCriterion("companyCode <", value, "companycode");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCompanycodeLessThanOrEqualTo(String value) {
       addCriterion("companyCode <=", value, "companycode");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCompanycodeLike(String value) {
       addCriterion("companyCode like", value, "companycode");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCompanycodeNotLike(String value) {
       addCriterion("companyCode not like", value, "companycode");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCompanycodeIn(List<String> values) {
       addCriterion("companyCode in", values, "companycode");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCompanycodeNotIn(List<String> values) {
       addCriterion("companyCode not in", values, "companycode");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCompanycodeBetween(String value1, String value2) {
       addCriterion("companyCode between", value1, value2, "companycode");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCompanycodeNotBetween(String value1, String value2) {
       addCriterion("companyCode not between", value1, value2, "companycode");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCompanynameIsNull() {
       addCriterion("companyName is null");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCompanynameIsNotNull() {
       addCriterion("companyName is not null");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCompanynameEqualTo(String value) {
       addCriterion("companyName =", value, "companyname");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCompanynameNotEqualTo(String value) {
       addCriterion("companyName <>", value, "companyname");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCompanynameGreaterThan(String value) {
       addCriterion("companyName >", value, "companyname");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCompanynameGreaterThanOrEqualTo(String value) {
       addCriterion("companyName >=", value, "companyname");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCompanynameLessThan(String value) {
       addCriterion("companyName <", value, "companyname");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCompanynameLessThanOrEqualTo(String value) {
       addCriterion("companyName <=", value, "companyname");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCompanynameLike(String value) {
       addCriterion("companyName like", value, "companyname");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCompanynameNotLike(String value) {
       addCriterion("companyName not like", value, "companyname");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCompanynameIn(List<String> values) {
       addCriterion("companyName in", values, "companyname");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCompanynameNotIn(List<String> values) {
       addCriterion("companyName not in", values, "companyname");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCompanynameBetween(String value1, String value2) {
       addCriterion("companyName between", value1, value2, "companyname");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCompanynameNotBetween(String value1, String value2) {
       addCriterion("companyName not between", value1, value2, "companyname");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCasesIsNull() {
       addCriterion("cases is null");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCasesIsNotNull() {
       addCriterion("cases is not null");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCasesEqualTo(Integer value) {
       addCriterion("cases =", value, "cases");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCasesNotEqualTo(Integer value) {
       addCriterion("cases <>", value, "cases");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCasesGreaterThan(Integer value) {
       addCriterion("cases >", value, "cases");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCasesGreaterThanOrEqualTo(Integer value) {
       addCriterion("cases >=", value, "cases");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCasesLessThan(Integer value) {
       addCriterion("cases <", value, "cases");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCasesLessThanOrEqualTo(Integer value) {
       addCriterion("cases <=", value, "cases");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCasesIn(List<Integer> values) {
       addCriterion("cases in", values, "cases");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCasesNotIn(List<Integer> values) {
       addCriterion("cases not in", values, "cases");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCasesBetween(Integer value1, Integer value2) {
       addCriterion("cases between", value1, value2, "cases");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCasesNotBetween(Integer value1, Integer value2) {
       addCriterion("cases not between", value1, value2, "cases");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andNumIsNull() {
       addCriterion("num is null");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andNumIsNotNull() {
       addCriterion("num is not null");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andNumEqualTo(Integer value) {
       addCriterion("num =", value, "num");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andNumNotEqualTo(Integer value) {
       addCriterion("num <>", value, "num");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andNumGreaterThan(Integer value) {
       addCriterion("num >", value, "num");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andNumGreaterThanOrEqualTo(Integer value) {
       addCriterion("num >=", value, "num");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andNumLessThan(Integer value) {
       addCriterion("num <", value, "num");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andNumLessThanOrEqualTo(Integer value) {
       addCriterion("num <=", value, "num");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andNumIn(List<Integer> values) {
       addCriterion("num in", values, "num");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andNumNotIn(List<Integer> values) {
       addCriterion("num not in", values, "num");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andNumBetween(Integer value1, Integer value2) {
       addCriterion("num between", value1, value2, "num");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andNumNotBetween(Integer value1, Integer value2) {
       addCriterion("num not between", value1, value2, "num");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andArrivaltimeIsNull() {
       addCriterion("arrivalTime is null");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andArrivaltimeIsNotNull() {
       addCriterion("arrivalTime is not null");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andArrivaltimeEqualTo(Date value) {
       addCriterion("arrivalTime =", value, "arrivaltime");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andArrivaltimeNotEqualTo(Date value) {
       addCriterion("arrivalTime <>", value, "arrivaltime");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andArrivaltimeGreaterThan(Date value) {
       addCriterion("arrivalTime >", value, "arrivaltime");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andArrivaltimeGreaterThanOrEqualTo(Date value) {
       addCriterion("arrivalTime >=", value, "arrivaltime");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andArrivaltimeLessThan(Date value) {
       addCriterion("arrivalTime <", value, "arrivaltime");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andArrivaltimeLessThanOrEqualTo(Date value) {
       addCriterion("arrivalTime <=", value, "arrivaltime");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andArrivaltimeIn(List<Date> values) {
       addCriterion("arrivalTime in", values, "arrivaltime");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andArrivaltimeNotIn(List<Date> values) {
       addCriterion("arrivalTime not in", values, "arrivaltime");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andArrivaltimeBetween(Date value1, Date value2) {
       addCriterion("arrivalTime between", value1, value2, "arrivaltime");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andArrivaltimeNotBetween(Date value1, Date value2) {
       addCriterion("arrivalTime not between", value1, value2, "arrivaltime");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCreatetimeIsNull() {
       addCriterion("createTime is null");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCreatetimeIsNotNull() {
       addCriterion("createTime is not null");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCreatetimeEqualTo(Date value) {
       addCriterion("createTime =", value, "createtime");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCreatetimeNotEqualTo(Date value) {
       addCriterion("createTime <>", value, "createtime");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCreatetimeGreaterThan(Date value) {
       addCriterion("createTime >", value, "createtime");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
       addCriterion("createTime >=", value, "createtime");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCreatetimeLessThan(Date value) {
       addCriterion("createTime <", value, "createtime");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCreatetimeLessThanOrEqualTo(Date value) {
       addCriterion("createTime <=", value, "createtime");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCreatetimeIn(List<Date> values) {
       addCriterion("createTime in", values, "createtime");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCreatetimeNotIn(List<Date> values) {
       addCriterion("createTime not in", values, "createtime");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCreatetimeBetween(Date value1, Date value2) {
       addCriterion("createTime between", value1, value2, "createtime");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andCreatetimeNotBetween(Date value1, Date value2) {
       addCriterion("createTime not between", value1, value2, "createtime");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andNameIsNull() {
       addCriterion("name is null");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andNameIsNotNull() {
       addCriterion("name is not null");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andNameEqualTo(String value) {
       addCriterion("name =", value, "name");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andNameNotEqualTo(String value) {
       addCriterion("name <>", value, "name");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andNameGreaterThan(String value) {
       addCriterion("name >", value, "name");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andNameGreaterThanOrEqualTo(String value) {
       addCriterion("name >=", value, "name");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andNameLessThan(String value) {
       addCriterion("name <", value, "name");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andNameLessThanOrEqualTo(String value) {
       addCriterion("name <=", value, "name");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andNameLike(String value) {
       addCriterion("name like", value, "name");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andNameNotLike(String value) {
       addCriterion("name not like", value, "name");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andNameIn(List<String> values) {
       addCriterion("name in", values, "name");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andNameNotIn(List<String> values) {
       addCriterion("name not in", values, "name");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andNameBetween(String value1, String value2) {
       addCriterion("name between", value1, value2, "name");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andNameNotBetween(String value1, String value2) {
       addCriterion("name not between", value1, value2, "name");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andReceiptnameIsNull() {
       addCriterion("receiptName is null");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andReceiptnameIsNotNull() {
       addCriterion("receiptName is not null");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andReceiptnameEqualTo(String value) {
       addCriterion("receiptName =", value, "receiptname");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andReceiptnameNotEqualTo(String value) {
       addCriterion("receiptName <>", value, "receiptname");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andReceiptnameGreaterThan(String value) {
       addCriterion("receiptName >", value, "receiptname");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andReceiptnameGreaterThanOrEqualTo(String value) {
       addCriterion("receiptName >=", value, "receiptname");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andReceiptnameLessThan(String value) {
       addCriterion("receiptName <", value, "receiptname");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andReceiptnameLessThanOrEqualTo(String value) {
       addCriterion("receiptName <=", value, "receiptname");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andReceiptnameLike(String value) {
       addCriterion("receiptName like", value, "receiptname");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andReceiptnameNotLike(String value) {
       addCriterion("receiptName not like", value, "receiptname");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andReceiptnameIn(List<String> values) {
       addCriterion("receiptName in", values, "receiptname");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andReceiptnameNotIn(List<String> values) {
       addCriterion("receiptName not in", values, "receiptname");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andReceiptnameBetween(String value1, String value2) {
       addCriterion("receiptName between", value1, value2, "receiptname");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andReceiptnameNotBetween(String value1, String value2) {
       addCriterion("receiptName not between", value1, value2, "receiptname");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andReceipttimeIsNull() {
       addCriterion("receiptTime is null");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andReceipttimeIsNotNull() {
       addCriterion("receiptTime is not null");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andReceipttimeEqualTo(Date value) {
       addCriterion("receiptTime =", value, "receipttime");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andReceipttimeNotEqualTo(Date value) {
       addCriterion("receiptTime <>", value, "receipttime");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andReceipttimeGreaterThan(Date value) {
       addCriterion("receiptTime >", value, "receipttime");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andReceipttimeGreaterThanOrEqualTo(Date value) {
       addCriterion("receiptTime >=", value, "receipttime");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andReceipttimeLessThan(Date value) {
       addCriterion("receiptTime <", value, "receipttime");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andReceipttimeLessThanOrEqualTo(Date value) {
       addCriterion("receiptTime <=", value, "receipttime");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andReceipttimeIn(List<Date> values) {
       addCriterion("receiptTime in", values, "receipttime");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andReceipttimeNotIn(List<Date> values) {
       addCriterion("receiptTime not in", values, "receipttime");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andReceipttimeBetween(Date value1, Date value2) {
       addCriterion("receiptTime between", value1, value2, "receipttime");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andReceipttimeNotBetween(Date value1, Date value2) {
       addCriterion("receiptTime not between", value1, value2, "receipttime");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andTypeIsNull() {
       addCriterion("type is null");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andTypeIsNotNull() {
       addCriterion("type is not null");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andTypeEqualTo(String value) {
       addCriterion("type =", value, "type");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andTypeNotEqualTo(String value) {
       addCriterion("type <>", value, "type");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andTypeGreaterThan(String value) {
       addCriterion("type >", value, "type");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andTypeGreaterThanOrEqualTo(String value) {
       addCriterion("type >=", value, "type");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andTypeLessThan(String value) {
       addCriterion("type <", value, "type");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andTypeLessThanOrEqualTo(String value) {
       addCriterion("type <=", value, "type");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andTypeLike(String value) {
       addCriterion("type like", value, "type");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andTypeNotLike(String value) {
       addCriterion("type not like", value, "type");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andTypeIn(List<String> values) {
       addCriterion("type in", values, "type");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andTypeNotIn(List<String> values) {
       addCriterion("type not in", values, "type");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andTypeBetween(String value1, String value2) {
       addCriterion("type between", value1, value2, "type");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andTypeNotBetween(String value1, String value2) {
       addCriterion("type not between", value1, value2, "type");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andReturntypeIsNull() {
       addCriterion("returnType is null");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andReturntypeIsNotNull() {
       addCriterion("returnType is not null");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andReturntypeEqualTo(String value) {
       addCriterion("returnType =", value, "returntype");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andReturntypeNotEqualTo(String value) {
       addCriterion("returnType <>", value, "returntype");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andReturntypeGreaterThan(String value) {
       addCriterion("returnType >", value, "returntype");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andReturntypeGreaterThanOrEqualTo(String value) {
       addCriterion("returnType >=", value, "returntype");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andReturntypeLessThan(String value) {
       addCriterion("returnType <", value, "returntype");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andReturntypeLessThanOrEqualTo(String value) {
       addCriterion("returnType <=", value, "returntype");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andReturntypeLike(String value) {
       addCriterion("returnType like", value, "returntype");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andReturntypeNotLike(String value) {
       addCriterion("returnType not like", value, "returntype");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andReturntypeIn(List<String> values) {
       addCriterion("returnType in", values, "returntype");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andReturntypeNotIn(List<String> values) {
       addCriterion("returnType not in", values, "returntype");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andReturntypeBetween(String value1, String value2) {
       addCriterion("returnType between", value1, value2, "returntype");
       return (RPlangodownentryExample.Criteria)this;
     }
     
     public RPlangodownentryExample.Criteria andReturntypeNotBetween(String value1, String value2) {
       addCriterion("returnType not between", value1, value2, "returntype");
       return (RPlangodownentryExample.Criteria)this;
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


