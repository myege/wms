 package com.zt.pojo.po;
 
 import java.util.ArrayList;
 import java.util.List;
 public class TExpressExample
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
     protected List<TExpressExample.Criterion> criteria = new ArrayList<TExpressExample.Criterion>();
 
     
     public boolean isValid() {
       return (this.criteria.size() > 0);
     }
     
     public List<TExpressExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
     
     public List<TExpressExample.Criterion> getCriteria() {
       return this.criteria;
     }
     
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new TExpressExample.Criterion(condition));
     }
     
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new TExpressExample.Criterion(condition, value));
     }
     
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if (value1 == null || value2 == null) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new TExpressExample.Criterion(condition, value1, value2));
     }
     
     public TExpressExample.Criteria andIdIsNull() {
       addCriterion("id is null");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andIdIsNotNull() {
       addCriterion("id is not null");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andIdEqualTo(Integer value) {
       addCriterion("id =", value, "id");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andIdNotEqualTo(Integer value) {
       addCriterion("id <>", value, "id");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andIdGreaterThan(Integer value) {
       addCriterion("id >", value, "id");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("id >=", value, "id");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andIdLessThan(Integer value) {
       addCriterion("id <", value, "id");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andIdLessThanOrEqualTo(Integer value) {
       addCriterion("id <=", value, "id");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andIdIn(List<Integer> values) {
       addCriterion("id in", values, "id");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andIdNotIn(List<Integer> values) {
       addCriterion("id not in", values, "id");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andIdBetween(Integer value1, Integer value2) {
       addCriterion("id between", value1, value2, "id");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
       addCriterion("id not between", value1, value2, "id");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andExpressIsNull() {
       addCriterion("express is null");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andExpressIsNotNull() {
       addCriterion("express is not null");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andExpressEqualTo(String value) {
       addCriterion("express =", value, "express");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andExpressNotEqualTo(String value) {
       addCriterion("express <>", value, "express");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andExpressGreaterThan(String value) {
       addCriterion("express >", value, "express");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andExpressGreaterThanOrEqualTo(String value) {
       addCriterion("express >=", value, "express");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andExpressLessThan(String value) {
       addCriterion("express <", value, "express");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andExpressLessThanOrEqualTo(String value) {
       addCriterion("express <=", value, "express");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andExpressLike(String value) {
       addCriterion("express like", value, "express");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andExpressNotLike(String value) {
       addCriterion("express not like", value, "express");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andExpressIn(List<String> values) {
       addCriterion("express in", values, "express");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andExpressNotIn(List<String> values) {
       addCriterion("express not in", values, "express");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andExpressBetween(String value1, String value2) {
       addCriterion("express between", value1, value2, "express");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andExpressNotBetween(String value1, String value2) {
       addCriterion("express not between", value1, value2, "express");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andExpressnameIsNull() {
       addCriterion("expressName is null");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andExpressnameIsNotNull() {
       addCriterion("expressName is not null");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andExpressnameEqualTo(String value) {
       addCriterion("expressName =", value, "expressname");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andExpressnameNotEqualTo(String value) {
       addCriterion("expressName <>", value, "expressname");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andExpressnameGreaterThan(String value) {
       addCriterion("expressName >", value, "expressname");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andExpressnameGreaterThanOrEqualTo(String value) {
       addCriterion("expressName >=", value, "expressname");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andExpressnameLessThan(String value) {
       addCriterion("expressName <", value, "expressname");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andExpressnameLessThanOrEqualTo(String value) {
       addCriterion("expressName <=", value, "expressname");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andExpressnameLike(String value) {
       addCriterion("expressName like", value, "expressname");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andExpressnameNotLike(String value) {
       addCriterion("expressName not like", value, "expressname");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andExpressnameIn(List<String> values) {
       addCriterion("expressName in", values, "expressname");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andExpressnameNotIn(List<String> values) {
       addCriterion("expressName not in", values, "expressname");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andExpressnameBetween(String value1, String value2) {
       addCriterion("expressName between", value1, value2, "expressname");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andExpressnameNotBetween(String value1, String value2) {
       addCriterion("expressName not between", value1, value2, "expressname");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andIsuseIsNull() {
       addCriterion("isUse is null");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andIsuseIsNotNull() {
       addCriterion("isUse is not null");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andIsuseEqualTo(String value) {
       addCriterion("isUse =", value, "isuse");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andIsuseNotEqualTo(String value) {
       addCriterion("isUse <>", value, "isuse");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andIsuseGreaterThan(String value) {
       addCriterion("isUse >", value, "isuse");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andIsuseGreaterThanOrEqualTo(String value) {
       addCriterion("isUse >=", value, "isuse");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andIsuseLessThan(String value) {
       addCriterion("isUse <", value, "isuse");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andIsuseLessThanOrEqualTo(String value) {
       addCriterion("isUse <=", value, "isuse");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andIsuseLike(String value) {
       addCriterion("isUse like", value, "isuse");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andIsuseNotLike(String value) {
       addCriterion("isUse not like", value, "isuse");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andIsuseIn(List<String> values) {
       addCriterion("isUse in", values, "isuse");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andIsuseNotIn(List<String> values) {
       addCriterion("isUse not in", values, "isuse");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andIsuseBetween(String value1, String value2) {
       addCriterion("isUse between", value1, value2, "isuse");
       return (TExpressExample.Criteria)this;
     }
     
     public TExpressExample.Criteria andIsuseNotBetween(String value1, String value2) {
       addCriterion("isUse not between", value1, value2, "isuse");
       return (TExpressExample.Criteria)this;
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


