 package com.zt.pojo.po;
 
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 public class TModularButtonExample
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
     protected List<TModularButtonExample.Criterion> criteria = new ArrayList<TModularButtonExample.Criterion>();
 
     
     public boolean isValid() {
       return (this.criteria.size() > 0);
     }
     
     public List<TModularButtonExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
     
     public List<TModularButtonExample.Criterion> getCriteria() {
       return this.criteria;
     }
     
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new TModularButtonExample.Criterion(condition));
     }
     
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new TModularButtonExample.Criterion(condition, value));
     }
     
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if (value1 == null || value2 == null) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new TModularButtonExample.Criterion(condition, value1, value2));
     }
     
     public TModularButtonExample.Criteria andIdIsNull() {
       addCriterion("id is null");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andIdIsNotNull() {
       addCriterion("id is not null");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andIdEqualTo(Integer value) {
       addCriterion("id =", value, "id");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andIdNotEqualTo(Integer value) {
       addCriterion("id <>", value, "id");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andIdGreaterThan(Integer value) {
       addCriterion("id >", value, "id");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("id >=", value, "id");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andIdLessThan(Integer value) {
       addCriterion("id <", value, "id");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andIdLessThanOrEqualTo(Integer value) {
       addCriterion("id <=", value, "id");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andIdIn(List<Integer> values) {
       addCriterion("id in", values, "id");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andIdNotIn(List<Integer> values) {
       addCriterion("id not in", values, "id");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andIdBetween(Integer value1, Integer value2) {
       addCriterion("id between", value1, value2, "id");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
       addCriterion("id not between", value1, value2, "id");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andModularidIsNull() {
       addCriterion("modularId is null");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andModularidIsNotNull() {
       addCriterion("modularId is not null");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andModularidEqualTo(String value) {
       addCriterion("modularId =", value, "modularid");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andModularidNotEqualTo(String value) {
       addCriterion("modularId <>", value, "modularid");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andModularidGreaterThan(String value) {
       addCriterion("modularId >", value, "modularid");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andModularidGreaterThanOrEqualTo(String value) {
       addCriterion("modularId >=", value, "modularid");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andModularidLessThan(String value) {
       addCriterion("modularId <", value, "modularid");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andModularidLessThanOrEqualTo(String value) {
       addCriterion("modularId <=", value, "modularid");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andModularidLike(String value) {
       addCriterion("modularId like", value, "modularid");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andModularidNotLike(String value) {
       addCriterion("modularId not like", value, "modularid");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andModularidIn(List<String> values) {
       addCriterion("modularId in", values, "modularid");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andModularidNotIn(List<String> values) {
       addCriterion("modularId not in", values, "modularid");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andModularidBetween(String value1, String value2) {
       addCriterion("modularId between", value1, value2, "modularid");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andModularidNotBetween(String value1, String value2) {
       addCriterion("modularId not between", value1, value2, "modularid");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andButtonidIsNull() {
       addCriterion("buttonId is null");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andButtonidIsNotNull() {
       addCriterion("buttonId is not null");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andButtonidEqualTo(String value) {
       addCriterion("buttonId =", value, "buttonid");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andButtonidNotEqualTo(String value) {
       addCriterion("buttonId <>", value, "buttonid");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andButtonidGreaterThan(String value) {
       addCriterion("buttonId >", value, "buttonid");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andButtonidGreaterThanOrEqualTo(String value) {
       addCriterion("buttonId >=", value, "buttonid");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andButtonidLessThan(String value) {
       addCriterion("buttonId <", value, "buttonid");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andButtonidLessThanOrEqualTo(String value) {
       addCriterion("buttonId <=", value, "buttonid");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andButtonidLike(String value) {
       addCriterion("buttonId like", value, "buttonid");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andButtonidNotLike(String value) {
       addCriterion("buttonId not like", value, "buttonid");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andButtonidIn(List<String> values) {
       addCriterion("buttonId in", values, "buttonid");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andButtonidNotIn(List<String> values) {
       addCriterion("buttonId not in", values, "buttonid");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andButtonidBetween(String value1, String value2) {
       addCriterion("buttonId between", value1, value2, "buttonid");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andButtonidNotBetween(String value1, String value2) {
       addCriterion("buttonId not between", value1, value2, "buttonid");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andButtonnameIsNull() {
       addCriterion("buttonName is null");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andButtonnameIsNotNull() {
       addCriterion("buttonName is not null");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andButtonnameEqualTo(String value) {
       addCriterion("buttonName =", value, "buttonname");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andButtonnameNotEqualTo(String value) {
       addCriterion("buttonName <>", value, "buttonname");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andButtonnameGreaterThan(String value) {
       addCriterion("buttonName >", value, "buttonname");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andButtonnameGreaterThanOrEqualTo(String value) {
       addCriterion("buttonName >=", value, "buttonname");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andButtonnameLessThan(String value) {
       addCriterion("buttonName <", value, "buttonname");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andButtonnameLessThanOrEqualTo(String value) {
       addCriterion("buttonName <=", value, "buttonname");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andButtonnameLike(String value) {
       addCriterion("buttonName like", value, "buttonname");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andButtonnameNotLike(String value) {
       addCriterion("buttonName not like", value, "buttonname");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andButtonnameIn(List<String> values) {
       addCriterion("buttonName in", values, "buttonname");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andButtonnameNotIn(List<String> values) {
       addCriterion("buttonName not in", values, "buttonname");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andButtonnameBetween(String value1, String value2) {
       addCriterion("buttonName between", value1, value2, "buttonname");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andButtonnameNotBetween(String value1, String value2) {
       addCriterion("buttonName not between", value1, value2, "buttonname");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andCreatetimeIsNull() {
       addCriterion("createTime is null");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andCreatetimeIsNotNull() {
       addCriterion("createTime is not null");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andCreatetimeEqualTo(Date value) {
       addCriterion("createTime =", value, "createtime");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andCreatetimeNotEqualTo(Date value) {
       addCriterion("createTime <>", value, "createtime");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andCreatetimeGreaterThan(Date value) {
       addCriterion("createTime >", value, "createtime");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
       addCriterion("createTime >=", value, "createtime");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andCreatetimeLessThan(Date value) {
       addCriterion("createTime <", value, "createtime");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andCreatetimeLessThanOrEqualTo(Date value) {
       addCriterion("createTime <=", value, "createtime");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andCreatetimeIn(List<Date> values) {
       addCriterion("createTime in", values, "createtime");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andCreatetimeNotIn(List<Date> values) {
       addCriterion("createTime not in", values, "createtime");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andCreatetimeBetween(Date value1, Date value2) {
       addCriterion("createTime between", value1, value2, "createtime");
       return (TModularButtonExample.Criteria)this;
     }
     
     public TModularButtonExample.Criteria andCreatetimeNotBetween(Date value1, Date value2) {
       addCriterion("createTime not between", value1, value2, "createtime");
       return (TModularButtonExample.Criteria)this;
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


