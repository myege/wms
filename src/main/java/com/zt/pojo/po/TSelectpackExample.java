 package com.zt.pojo.po;
 
 import java.util.ArrayList;
 import java.util.List;
 public class TSelectpackExample
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
     protected List<TSelectpackExample.Criterion> criteria = new ArrayList<TSelectpackExample.Criterion>();
 
     
     public boolean isValid() {
       return (this.criteria.size() > 0);
     }
     
     public List<TSelectpackExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
     
     public List<TSelectpackExample.Criterion> getCriteria() {
       return this.criteria;
     }
     
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new TSelectpackExample.Criterion(condition));
     }
     
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new TSelectpackExample.Criterion(condition, value));
     }
     
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if (value1 == null || value2 == null) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new TSelectpackExample.Criterion(condition, value1, value2));
     }
     
     public TSelectpackExample.Criteria andIdIsNull() {
       addCriterion("id is null");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andIdIsNotNull() {
       addCriterion("id is not null");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andIdEqualTo(Integer value) {
       addCriterion("id =", value, "id");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andIdNotEqualTo(Integer value) {
       addCriterion("id <>", value, "id");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andIdGreaterThan(Integer value) {
       addCriterion("id >", value, "id");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("id >=", value, "id");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andIdLessThan(Integer value) {
       addCriterion("id <", value, "id");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andIdLessThanOrEqualTo(Integer value) {
       addCriterion("id <=", value, "id");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andIdIn(List<Integer> values) {
       addCriterion("id in", values, "id");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andIdNotIn(List<Integer> values) {
       addCriterion("id not in", values, "id");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andIdBetween(Integer value1, Integer value2) {
       addCriterion("id between", value1, value2, "id");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
       addCriterion("id not between", value1, value2, "id");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andNameIsNull() {
       addCriterion("name is null");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andNameIsNotNull() {
       addCriterion("name is not null");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andNameEqualTo(String value) {
       addCriterion("name =", value, "name");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andNameNotEqualTo(String value) {
       addCriterion("name <>", value, "name");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andNameGreaterThan(String value) {
       addCriterion("name >", value, "name");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andNameGreaterThanOrEqualTo(String value) {
       addCriterion("name >=", value, "name");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andNameLessThan(String value) {
       addCriterion("name <", value, "name");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andNameLessThanOrEqualTo(String value) {
       addCriterion("name <=", value, "name");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andNameLike(String value) {
       addCriterion("name like", value, "name");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andNameNotLike(String value) {
       addCriterion("name not like", value, "name");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andNameIn(List<String> values) {
       addCriterion("name in", values, "name");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andNameNotIn(List<String> values) {
       addCriterion("name not in", values, "name");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andNameBetween(String value1, String value2) {
       addCriterion("name between", value1, value2, "name");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andNameNotBetween(String value1, String value2) {
       addCriterion("name not between", value1, value2, "name");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andStatusIsNull() {
       addCriterion("status is null");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andStatusIsNotNull() {
       addCriterion("status is not null");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andStatusEqualTo(Integer value) {
       addCriterion("status =", value, "status");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andStatusNotEqualTo(Integer value) {
       addCriterion("status <>", value, "status");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andStatusGreaterThan(Integer value) {
       addCriterion("status >", value, "status");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andStatusGreaterThanOrEqualTo(Integer value) {
       addCriterion("status >=", value, "status");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andStatusLessThan(Integer value) {
       addCriterion("status <", value, "status");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andStatusLessThanOrEqualTo(Integer value) {
       addCriterion("status <=", value, "status");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andStatusIn(List<Integer> values) {
       addCriterion("status in", values, "status");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andStatusNotIn(List<Integer> values) {
       addCriterion("status not in", values, "status");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andStatusBetween(Integer value1, Integer value2) {
       addCriterion("status between", value1, value2, "status");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andStatusNotBetween(Integer value1, Integer value2) {
       addCriterion("status not between", value1, value2, "status");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andBmIsNull() {
       addCriterion("bm is null");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andBmIsNotNull() {
       addCriterion("bm is not null");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andBmEqualTo(String value) {
       addCriterion("bm =", value, "bm");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andBmNotEqualTo(String value) {
       addCriterion("bm <>", value, "bm");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andBmGreaterThan(String value) {
       addCriterion("bm >", value, "bm");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andBmGreaterThanOrEqualTo(String value) {
       addCriterion("bm >=", value, "bm");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andBmLessThan(String value) {
       addCriterion("bm <", value, "bm");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andBmLessThanOrEqualTo(String value) {
       addCriterion("bm <=", value, "bm");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andBmLike(String value) {
       addCriterion("bm like", value, "bm");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andBmNotLike(String value) {
       addCriterion("bm not like", value, "bm");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andBmIn(List<String> values) {
       addCriterion("bm in", values, "bm");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andBmNotIn(List<String> values) {
       addCriterion("bm not in", values, "bm");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andBmBetween(String value1, String value2) {
       addCriterion("bm between", value1, value2, "bm");
       return (TSelectpackExample.Criteria)this;
     }
     
     public TSelectpackExample.Criteria andBmNotBetween(String value1, String value2) {
       addCriterion("bm not between", value1, value2, "bm");
       return (TSelectpackExample.Criteria)this;
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


