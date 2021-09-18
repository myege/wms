 package com.zt.pojo.po;
 
 import java.util.ArrayList;
 import java.util.List;
 public class TFloorExample
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
     protected List<TFloorExample.Criterion> criteria = new ArrayList<TFloorExample.Criterion>();
 
     
     public boolean isValid() {
       return (this.criteria.size() > 0);
     }
     
     public List<TFloorExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
     
     public List<TFloorExample.Criterion> getCriteria() {
       return this.criteria;
     }
     
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new TFloorExample.Criterion(condition));
     }
     
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new TFloorExample.Criterion(condition, value));
     }
     
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if (value1 == null || value2 == null) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new TFloorExample.Criterion(condition, value1, value2));
     }
     
     public TFloorExample.Criteria andIdIsNull() {
       addCriterion("id is null");
       return (TFloorExample.Criteria)this;
     }
     
     public TFloorExample.Criteria andIdIsNotNull() {
       addCriterion("id is not null");
       return (TFloorExample.Criteria)this;
     }
     
     public TFloorExample.Criteria andIdEqualTo(Integer value) {
       addCriterion("id =", value, "id");
       return (TFloorExample.Criteria)this;
     }
     
     public TFloorExample.Criteria andIdNotEqualTo(Integer value) {
       addCriterion("id <>", value, "id");
       return (TFloorExample.Criteria)this;
     }
     
     public TFloorExample.Criteria andIdGreaterThan(Integer value) {
       addCriterion("id >", value, "id");
       return (TFloorExample.Criteria)this;
     }
     
     public TFloorExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("id >=", value, "id");
       return (TFloorExample.Criteria)this;
     }
     
     public TFloorExample.Criteria andIdLessThan(Integer value) {
       addCriterion("id <", value, "id");
       return (TFloorExample.Criteria)this;
     }
     
     public TFloorExample.Criteria andIdLessThanOrEqualTo(Integer value) {
       addCriterion("id <=", value, "id");
       return (TFloorExample.Criteria)this;
     }
     
     public TFloorExample.Criteria andIdIn(List<Integer> values) {
       addCriterion("id in", values, "id");
       return (TFloorExample.Criteria)this;
     }
     
     public TFloorExample.Criteria andIdNotIn(List<Integer> values) {
       addCriterion("id not in", values, "id");
       return (TFloorExample.Criteria)this;
     }
     
     public TFloorExample.Criteria andIdBetween(Integer value1, Integer value2) {
       addCriterion("id between", value1, value2, "id");
       return (TFloorExample.Criteria)this;
     }
     
     public TFloorExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
       addCriterion("id not between", value1, value2, "id");
       return (TFloorExample.Criteria)this;
     }
     
     public TFloorExample.Criteria andFloornumberIsNull() {
       addCriterion("floorNumber is null");
       return (TFloorExample.Criteria)this;
     }
     
     public TFloorExample.Criteria andFloornumberIsNotNull() {
       addCriterion("floorNumber is not null");
       return (TFloorExample.Criteria)this;
     }
     
     public TFloorExample.Criteria andFloornumberEqualTo(String value) {
       addCriterion("floorNumber =", value, "floornumber");
       return (TFloorExample.Criteria)this;
     }
     
     public TFloorExample.Criteria andFloornumberNotEqualTo(String value) {
       addCriterion("floorNumber <>", value, "floornumber");
       return (TFloorExample.Criteria)this;
     }
     
     public TFloorExample.Criteria andFloornumberGreaterThan(String value) {
       addCriterion("floorNumber >", value, "floornumber");
       return (TFloorExample.Criteria)this;
     }
     
     public TFloorExample.Criteria andFloornumberGreaterThanOrEqualTo(String value) {
       addCriterion("floorNumber >=", value, "floornumber");
       return (TFloorExample.Criteria)this;
     }
     
     public TFloorExample.Criteria andFloornumberLessThan(String value) {
       addCriterion("floorNumber <", value, "floornumber");
       return (TFloorExample.Criteria)this;
     }
     
     public TFloorExample.Criteria andFloornumberLessThanOrEqualTo(String value) {
       addCriterion("floorNumber <=", value, "floornumber");
       return (TFloorExample.Criteria)this;
     }
     
     public TFloorExample.Criteria andFloornumberLike(String value) {
       addCriterion("floorNumber like", value, "floornumber");
       return (TFloorExample.Criteria)this;
     }
     
     public TFloorExample.Criteria andFloornumberNotLike(String value) {
       addCriterion("floorNumber not like", value, "floornumber");
       return (TFloorExample.Criteria)this;
     }
     
     public TFloorExample.Criteria andFloornumberIn(List<String> values) {
       addCriterion("floorNumber in", values, "floornumber");
       return (TFloorExample.Criteria)this;
     }
     
     public TFloorExample.Criteria andFloornumberNotIn(List<String> values) {
       addCriterion("floorNumber not in", values, "floornumber");
       return (TFloorExample.Criteria)this;
     }
     
     public TFloorExample.Criteria andFloornumberBetween(String value1, String value2) {
       addCriterion("floorNumber between", value1, value2, "floornumber");
       return (TFloorExample.Criteria)this;
     }
     
     public TFloorExample.Criteria andFloornumberNotBetween(String value1, String value2) {
       addCriterion("floorNumber not between", value1, value2, "floornumber");
       return (TFloorExample.Criteria)this;
     }
     
     public TFloorExample.Criteria andFloornameIsNull() {
       addCriterion("floorName is null");
       return (TFloorExample.Criteria)this;
     }
     
     public TFloorExample.Criteria andFloornameIsNotNull() {
       addCriterion("floorName is not null");
       return (TFloorExample.Criteria)this;
     }
     
     public TFloorExample.Criteria andFloornameEqualTo(String value) {
       addCriterion("floorName =", value, "floorname");
       return (TFloorExample.Criteria)this;
     }
     
     public TFloorExample.Criteria andFloornameNotEqualTo(String value) {
       addCriterion("floorName <>", value, "floorname");
       return (TFloorExample.Criteria)this;
     }
     
     public TFloorExample.Criteria andFloornameGreaterThan(String value) {
       addCriterion("floorName >", value, "floorname");
       return (TFloorExample.Criteria)this;
     }
     
     public TFloorExample.Criteria andFloornameGreaterThanOrEqualTo(String value) {
       addCriterion("floorName >=", value, "floorname");
       return (TFloorExample.Criteria)this;
     }
     
     public TFloorExample.Criteria andFloornameLessThan(String value) {
       addCriterion("floorName <", value, "floorname");
       return (TFloorExample.Criteria)this;
     }
     
     public TFloorExample.Criteria andFloornameLessThanOrEqualTo(String value) {
       addCriterion("floorName <=", value, "floorname");
       return (TFloorExample.Criteria)this;
     }
     
     public TFloorExample.Criteria andFloornameLike(String value) {
       addCriterion("floorName like", value, "floorname");
       return (TFloorExample.Criteria)this;
     }
     
     public TFloorExample.Criteria andFloornameNotLike(String value) {
       addCriterion("floorName not like", value, "floorname");
       return (TFloorExample.Criteria)this;
     }
     
     public TFloorExample.Criteria andFloornameIn(List<String> values) {
       addCriterion("floorName in", values, "floorname");
       return (TFloorExample.Criteria)this;
     }
     
     public TFloorExample.Criteria andFloornameNotIn(List<String> values) {
       addCriterion("floorName not in", values, "floorname");
       return (TFloorExample.Criteria)this;
     }
     
     public TFloorExample.Criteria andFloornameBetween(String value1, String value2) {
       addCriterion("floorName between", value1, value2, "floorname");
       return (TFloorExample.Criteria)this;
     }
     
     public TFloorExample.Criteria andFloornameNotBetween(String value1, String value2) {
       addCriterion("floorName not between", value1, value2, "floorname");
       return (TFloorExample.Criteria)this;
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


