 package com.zt.pojo.po;
 
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 public class TModularExample
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
     protected List<TModularExample.Criterion> criteria = new ArrayList<TModularExample.Criterion>();
 
     
     public boolean isValid() {
       return (this.criteria.size() > 0);
     }
     
     public List<TModularExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
     
     public List<TModularExample.Criterion> getCriteria() {
       return this.criteria;
     }
     
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new TModularExample.Criterion(condition));
     }
     
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new TModularExample.Criterion(condition, value));
     }
     
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if (value1 == null || value2 == null) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new TModularExample.Criterion(condition, value1, value2));
     }
     
     public TModularExample.Criteria andIdIsNull() {
       addCriterion("id is null");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andIdIsNotNull() {
       addCriterion("id is not null");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andIdEqualTo(Integer value) {
       addCriterion("id =", value, "id");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andIdNotEqualTo(Integer value) {
       addCriterion("id <>", value, "id");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andIdGreaterThan(Integer value) {
       addCriterion("id >", value, "id");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("id >=", value, "id");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andIdLessThan(Integer value) {
       addCriterion("id <", value, "id");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andIdLessThanOrEqualTo(Integer value) {
       addCriterion("id <=", value, "id");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andIdIn(List<Integer> values) {
       addCriterion("id in", values, "id");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andIdNotIn(List<Integer> values) {
       addCriterion("id not in", values, "id");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andIdBetween(Integer value1, Integer value2) {
       addCriterion("id between", value1, value2, "id");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
       addCriterion("id not between", value1, value2, "id");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andModularidIsNull() {
       addCriterion("modularId is null");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andModularidIsNotNull() {
       addCriterion("modularId is not null");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andModularidEqualTo(String value) {
       addCriterion("modularId =", value, "modularid");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andModularidNotEqualTo(String value) {
       addCriterion("modularId <>", value, "modularid");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andModularidGreaterThan(String value) {
       addCriterion("modularId >", value, "modularid");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andModularidGreaterThanOrEqualTo(String value) {
       addCriterion("modularId >=", value, "modularid");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andModularidLessThan(String value) {
       addCriterion("modularId <", value, "modularid");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andModularidLessThanOrEqualTo(String value) {
       addCriterion("modularId <=", value, "modularid");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andModularidLike(String value) {
       addCriterion("modularId like", value, "modularid");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andModularidNotLike(String value) {
       addCriterion("modularId not like", value, "modularid");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andModularidIn(List<String> values) {
       addCriterion("modularId in", values, "modularid");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andModularidNotIn(List<String> values) {
       addCriterion("modularId not in", values, "modularid");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andModularidBetween(String value1, String value2) {
       addCriterion("modularId between", value1, value2, "modularid");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andModularidNotBetween(String value1, String value2) {
       addCriterion("modularId not between", value1, value2, "modularid");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andModularnameIsNull() {
       addCriterion("modularName is null");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andModularnameIsNotNull() {
       addCriterion("modularName is not null");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andModularnameEqualTo(String value) {
       addCriterion("modularName =", value, "modularname");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andModularnameNotEqualTo(String value) {
       addCriterion("modularName <>", value, "modularname");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andModularnameGreaterThan(String value) {
       addCriterion("modularName >", value, "modularname");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andModularnameGreaterThanOrEqualTo(String value) {
       addCriterion("modularName >=", value, "modularname");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andModularnameLessThan(String value) {
       addCriterion("modularName <", value, "modularname");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andModularnameLessThanOrEqualTo(String value) {
       addCriterion("modularName <=", value, "modularname");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andModularnameLike(String value) {
       addCriterion("modularName like", value, "modularname");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andModularnameNotLike(String value) {
       addCriterion("modularName not like", value, "modularname");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andModularnameIn(List<String> values) {
       addCriterion("modularName in", values, "modularname");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andModularnameNotIn(List<String> values) {
       addCriterion("modularName not in", values, "modularname");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andModularnameBetween(String value1, String value2) {
       addCriterion("modularName between", value1, value2, "modularname");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andModularnameNotBetween(String value1, String value2) {
       addCriterion("modularName not between", value1, value2, "modularname");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andCreatetimeIsNull() {
       addCriterion("createTime is null");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andCreatetimeIsNotNull() {
       addCriterion("createTime is not null");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andCreatetimeEqualTo(Date value) {
       addCriterion("createTime =", value, "createtime");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andCreatetimeNotEqualTo(Date value) {
       addCriterion("createTime <>", value, "createtime");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andCreatetimeGreaterThan(Date value) {
       addCriterion("createTime >", value, "createtime");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
       addCriterion("createTime >=", value, "createtime");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andCreatetimeLessThan(Date value) {
       addCriterion("createTime <", value, "createtime");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andCreatetimeLessThanOrEqualTo(Date value) {
       addCriterion("createTime <=", value, "createtime");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andCreatetimeIn(List<Date> values) {
       addCriterion("createTime in", values, "createtime");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andCreatetimeNotIn(List<Date> values) {
       addCriterion("createTime not in", values, "createtime");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andCreatetimeBetween(Date value1, Date value2) {
       addCriterion("createTime between", value1, value2, "createtime");
       return (TModularExample.Criteria)this;
     }
     
     public TModularExample.Criteria andCreatetimeNotBetween(Date value1, Date value2) {
       addCriterion("createTime not between", value1, value2, "createtime");
       return (TModularExample.Criteria)this;
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


