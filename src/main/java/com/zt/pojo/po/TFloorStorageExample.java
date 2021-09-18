 package com.zt.pojo.po;
 
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 public class TFloorStorageExample
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
     protected List<TFloorStorageExample.Criterion> criteria = new ArrayList<TFloorStorageExample.Criterion>();
 
     
     public boolean isValid() {
       return (this.criteria.size() > 0);
     }
     
     public List<TFloorStorageExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
     
     public List<TFloorStorageExample.Criterion> getCriteria() {
       return this.criteria;
     }
     
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new TFloorStorageExample.Criterion(condition));
     }
     
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new TFloorStorageExample.Criterion(condition, value));
     }
     
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if (value1 == null || value2 == null) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new TFloorStorageExample.Criterion(condition, value1, value2));
     }
     
     public TFloorStorageExample.Criteria andIdIsNull() {
       addCriterion("id is null");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andIdIsNotNull() {
       addCriterion("id is not null");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andIdEqualTo(Integer value) {
       addCriterion("id =", value, "id");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andIdNotEqualTo(Integer value) {
       addCriterion("id <>", value, "id");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andIdGreaterThan(Integer value) {
       addCriterion("id >", value, "id");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("id >=", value, "id");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andIdLessThan(Integer value) {
       addCriterion("id <", value, "id");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andIdLessThanOrEqualTo(Integer value) {
       addCriterion("id <=", value, "id");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andIdIn(List<Integer> values) {
       addCriterion("id in", values, "id");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andIdNotIn(List<Integer> values) {
       addCriterion("id not in", values, "id");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andIdBetween(Integer value1, Integer value2) {
       addCriterion("id between", value1, value2, "id");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
       addCriterion("id not between", value1, value2, "id");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andFloornumberIsNull() {
       addCriterion("floorNumber is null");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andFloornumberIsNotNull() {
       addCriterion("floorNumber is not null");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andFloornumberEqualTo(String value) {
       addCriterion("floorNumber =", value, "floornumber");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andFloornumberNotEqualTo(String value) {
       addCriterion("floorNumber <>", value, "floornumber");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andFloornumberGreaterThan(String value) {
       addCriterion("floorNumber >", value, "floornumber");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andFloornumberGreaterThanOrEqualTo(String value) {
       addCriterion("floorNumber >=", value, "floornumber");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andFloornumberLessThan(String value) {
       addCriterion("floorNumber <", value, "floornumber");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andFloornumberLessThanOrEqualTo(String value) {
       addCriterion("floorNumber <=", value, "floornumber");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andFloornumberLike(String value) {
       addCriterion("floorNumber like", value, "floornumber");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andFloornumberNotLike(String value) {
       addCriterion("floorNumber not like", value, "floornumber");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andFloornumberIn(List<String> values) {
       addCriterion("floorNumber in", values, "floornumber");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andFloornumberNotIn(List<String> values) {
       addCriterion("floorNumber not in", values, "floornumber");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andFloornumberBetween(String value1, String value2) {
       addCriterion("floorNumber between", value1, value2, "floornumber");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andFloornumberNotBetween(String value1, String value2) {
       addCriterion("floorNumber not between", value1, value2, "floornumber");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andStorageIsNull() {
       addCriterion("storage is null");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andStorageIsNotNull() {
       addCriterion("storage is not null");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andStorageEqualTo(String value) {
       addCriterion("storage =", value, "storage");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andStorageNotEqualTo(String value) {
       addCriterion("storage <>", value, "storage");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andStorageGreaterThan(String value) {
       addCriterion("storage >", value, "storage");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andStorageGreaterThanOrEqualTo(String value) {
       addCriterion("storage >=", value, "storage");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andStorageLessThan(String value) {
       addCriterion("storage <", value, "storage");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andStorageLessThanOrEqualTo(String value) {
       addCriterion("storage <=", value, "storage");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andStorageLike(String value) {
       addCriterion("storage like", value, "storage");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andStorageNotLike(String value) {
       addCriterion("storage not like", value, "storage");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andStorageIn(List<String> values) {
       addCriterion("storage in", values, "storage");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andStorageNotIn(List<String> values) {
       addCriterion("storage not in", values, "storage");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andStorageBetween(String value1, String value2) {
       addCriterion("storage between", value1, value2, "storage");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andStorageNotBetween(String value1, String value2) {
       addCriterion("storage not between", value1, value2, "storage");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andCreatetimeIsNull() {
       addCriterion("createTime is null");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andCreatetimeIsNotNull() {
       addCriterion("createTime is not null");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andCreatetimeEqualTo(Date value) {
       addCriterion("createTime =", value, "createtime");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andCreatetimeNotEqualTo(Date value) {
       addCriterion("createTime <>", value, "createtime");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andCreatetimeGreaterThan(Date value) {
       addCriterion("createTime >", value, "createtime");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
       addCriterion("createTime >=", value, "createtime");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andCreatetimeLessThan(Date value) {
       addCriterion("createTime <", value, "createtime");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andCreatetimeLessThanOrEqualTo(Date value) {
       addCriterion("createTime <=", value, "createtime");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andCreatetimeIn(List<Date> values) {
       addCriterion("createTime in", values, "createtime");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andCreatetimeNotIn(List<Date> values) {
       addCriterion("createTime not in", values, "createtime");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andCreatetimeBetween(Date value1, Date value2) {
       addCriterion("createTime between", value1, value2, "createtime");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andCreatetimeNotBetween(Date value1, Date value2) {
       addCriterion("createTime not between", value1, value2, "createtime");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andTypeIsNull() {
       addCriterion("type is null");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andTypeIsNotNull() {
       addCriterion("type is not null");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andTypeEqualTo(String value) {
       addCriterion("type =", value, "type");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andTypeNotEqualTo(String value) {
       addCriterion("type <>", value, "type");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andTypeGreaterThan(String value) {
       addCriterion("type >", value, "type");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andTypeGreaterThanOrEqualTo(String value) {
       addCriterion("type >=", value, "type");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andTypeLessThan(String value) {
       addCriterion("type <", value, "type");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andTypeLessThanOrEqualTo(String value) {
       addCriterion("type <=", value, "type");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andTypeLike(String value) {
       addCriterion("type like", value, "type");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andTypeNotLike(String value) {
       addCriterion("type not like", value, "type");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andTypeIn(List<String> values) {
       addCriterion("type in", values, "type");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andTypeNotIn(List<String> values) {
       addCriterion("type not in", values, "type");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andTypeBetween(String value1, String value2) {
       addCriterion("type between", value1, value2, "type");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andTypeNotBetween(String value1, String value2) {
       addCriterion("type not between", value1, value2, "type");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andSprtIsNull() {
       addCriterion("sprt is null");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andSprtIsNotNull() {
       addCriterion("sprt is not null");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andSprtEqualTo(Integer value) {
       addCriterion("sprt =", value, "sprt");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andSprtNotEqualTo(Integer value) {
       addCriterion("sprt <>", value, "sprt");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andSprtGreaterThan(Integer value) {
       addCriterion("sprt >", value, "sprt");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andSprtGreaterThanOrEqualTo(Integer value) {
       addCriterion("sprt >=", value, "sprt");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andSprtLessThan(Integer value) {
       addCriterion("sprt <", value, "sprt");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andSprtLessThanOrEqualTo(Integer value) {
       addCriterion("sprt <=", value, "sprt");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andSprtIn(List<Integer> values) {
       addCriterion("sprt in", values, "sprt");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andSprtNotIn(List<Integer> values) {
       addCriterion("sprt not in", values, "sprt");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andSprtBetween(Integer value1, Integer value2) {
       addCriterion("sprt between", value1, value2, "sprt");
       return (TFloorStorageExample.Criteria)this;
     }
     
     public TFloorStorageExample.Criteria andSprtNotBetween(Integer value1, Integer value2) {
       addCriterion("sprt not between", value1, value2, "sprt");
       return (TFloorStorageExample.Criteria)this;
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


