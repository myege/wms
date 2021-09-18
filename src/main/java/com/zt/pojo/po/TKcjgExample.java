 package com.zt.pojo.po;
 
 import java.util.ArrayList;
 import java.util.List;
 public class TKcjgExample
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
     protected List<TKcjgExample.Criterion> criteria = new ArrayList<TKcjgExample.Criterion>();
 
     
     public boolean isValid() {
       return (this.criteria.size() > 0);
     }
     
     public List<TKcjgExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
     
     public List<TKcjgExample.Criterion> getCriteria() {
       return this.criteria;
     }
     
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new TKcjgExample.Criterion(condition));
     }
     
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new TKcjgExample.Criterion(condition, value));
     }
     
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if (value1 == null || value2 == null) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new TKcjgExample.Criterion(condition, value1, value2));
     }
     
     public TKcjgExample.Criteria andIdIsNull() {
       addCriterion("id is null");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andIdIsNotNull() {
       addCriterion("id is not null");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andIdEqualTo(Integer value) {
       addCriterion("id =", value, "id");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andIdNotEqualTo(Integer value) {
       addCriterion("id <>", value, "id");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andIdGreaterThan(Integer value) {
       addCriterion("id >", value, "id");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("id >=", value, "id");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andIdLessThan(Integer value) {
       addCriterion("id <", value, "id");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andIdLessThanOrEqualTo(Integer value) {
       addCriterion("id <=", value, "id");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andIdIn(List<Integer> values) {
       addCriterion("id in", values, "id");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andIdNotIn(List<Integer> values) {
       addCriterion("id not in", values, "id");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andIdBetween(Integer value1, Integer value2) {
       addCriterion("id between", value1, value2, "id");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
       addCriterion("id not between", value1, value2, "id");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andNameIsNull() {
       addCriterion("name is null");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andNameIsNotNull() {
       addCriterion("name is not null");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andNameEqualTo(String value) {
       addCriterion("name =", value, "name");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andNameNotEqualTo(String value) {
       addCriterion("name <>", value, "name");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andNameGreaterThan(String value) {
       addCriterion("name >", value, "name");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andNameGreaterThanOrEqualTo(String value) {
       addCriterion("name >=", value, "name");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andNameLessThan(String value) {
       addCriterion("name <", value, "name");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andNameLessThanOrEqualTo(String value) {
       addCriterion("name <=", value, "name");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andNameLike(String value) {
       addCriterion("name like", value, "name");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andNameNotLike(String value) {
       addCriterion("name not like", value, "name");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andNameIn(List<String> values) {
       addCriterion("name in", values, "name");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andNameNotIn(List<String> values) {
       addCriterion("name not in", values, "name");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andNameBetween(String value1, String value2) {
       addCriterion("name between", value1, value2, "name");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andNameNotBetween(String value1, String value2) {
       addCriterion("name not between", value1, value2, "name");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andBmIsNull() {
       addCriterion("bm is null");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andBmIsNotNull() {
       addCriterion("bm is not null");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andBmEqualTo(String value) {
       addCriterion("bm =", value, "bm");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andBmNotEqualTo(String value) {
       addCriterion("bm <>", value, "bm");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andBmGreaterThan(String value) {
       addCriterion("bm >", value, "bm");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andBmGreaterThanOrEqualTo(String value) {
       addCriterion("bm >=", value, "bm");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andBmLessThan(String value) {
       addCriterion("bm <", value, "bm");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andBmLessThanOrEqualTo(String value) {
       addCriterion("bm <=", value, "bm");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andBmLike(String value) {
       addCriterion("bm like", value, "bm");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andBmNotLike(String value) {
       addCriterion("bm not like", value, "bm");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andBmIn(List<String> values) {
       addCriterion("bm in", values, "bm");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andBmNotIn(List<String> values) {
       addCriterion("bm not in", values, "bm");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andBmBetween(String value1, String value2) {
       addCriterion("bm between", value1, value2, "bm");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andBmNotBetween(String value1, String value2) {
       addCriterion("bm not between", value1, value2, "bm");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andSumIsNull() {
       addCriterion("sum is null");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andSumIsNotNull() {
       addCriterion("sum is not null");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andSumEqualTo(Integer value) {
       addCriterion("sum =", value, "sum");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andSumNotEqualTo(Integer value) {
       addCriterion("sum <>", value, "sum");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andSumGreaterThan(Integer value) {
       addCriterion("sum >", value, "sum");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andSumGreaterThanOrEqualTo(Integer value) {
       addCriterion("sum >=", value, "sum");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andSumLessThan(Integer value) {
       addCriterion("sum <", value, "sum");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andSumLessThanOrEqualTo(Integer value) {
       addCriterion("sum <=", value, "sum");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andSumIn(List<Integer> values) {
       addCriterion("sum in", values, "sum");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andSumNotIn(List<Integer> values) {
       addCriterion("sum not in", values, "sum");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andSumBetween(Integer value1, Integer value2) {
       addCriterion("sum between", value1, value2, "sum");
       return (TKcjgExample.Criteria)this;
     }
     
     public TKcjgExample.Criteria andSumNotBetween(Integer value1, Integer value2) {
       addCriterion("sum not between", value1, value2, "sum");
       return (TKcjgExample.Criteria)this;
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


