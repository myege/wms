 package com.zt.pojo.po;
 
 import java.util.ArrayList;
 import java.util.List;
 public class TAnalysExample
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
     protected List<TAnalysExample.Criterion> criteria = new ArrayList<TAnalysExample.Criterion>();
 
     
     public boolean isValid() {
       return (this.criteria.size() > 0);
     }
     
     public List<TAnalysExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
     
     public List<TAnalysExample.Criterion> getCriteria() {
       return this.criteria;
     }
     
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new TAnalysExample.Criterion(condition));
     }
     
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new TAnalysExample.Criterion(condition, value));
     }
     
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if (value1 == null || value2 == null) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new TAnalysExample.Criterion(condition, value1, value2));
     }
     
     public TAnalysExample.Criteria andIdIsNull() {
       addCriterion("id is null");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andIdIsNotNull() {
       addCriterion("id is not null");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andIdEqualTo(Integer value) {
       addCriterion("id =", value, "id");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andIdNotEqualTo(Integer value) {
       addCriterion("id <>", value, "id");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andIdGreaterThan(Integer value) {
       addCriterion("id >", value, "id");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("id >=", value, "id");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andIdLessThan(Integer value) {
       addCriterion("id <", value, "id");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andIdLessThanOrEqualTo(Integer value) {
       addCriterion("id <=", value, "id");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andIdIn(List<Integer> values) {
       addCriterion("id in", values, "id");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andIdNotIn(List<Integer> values) {
       addCriterion("id not in", values, "id");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andIdBetween(Integer value1, Integer value2) {
       addCriterion("id between", value1, value2, "id");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
       addCriterion("id not between", value1, value2, "id");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andOrdernumIsNull() {
       addCriterion("ordernum is null");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andOrdernumIsNotNull() {
       addCriterion("ordernum is not null");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andOrdernumEqualTo(String value) {
       addCriterion("ordernum =", value, "ordernum");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andOrdernumNotEqualTo(String value) {
       addCriterion("ordernum <>", value, "ordernum");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andOrdernumGreaterThan(String value) {
       addCriterion("ordernum >", value, "ordernum");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andOrdernumGreaterThanOrEqualTo(String value) {
       addCriterion("ordernum >=", value, "ordernum");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andOrdernumLessThan(String value) {
       addCriterion("ordernum <", value, "ordernum");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andOrdernumLessThanOrEqualTo(String value) {
       addCriterion("ordernum <=", value, "ordernum");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andOrdernumLike(String value) {
       addCriterion("ordernum like", value, "ordernum");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andOrdernumNotLike(String value) {
       addCriterion("ordernum not like", value, "ordernum");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andOrdernumIn(List<String> values) {
       addCriterion("ordernum in", values, "ordernum");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andOrdernumNotIn(List<String> values) {
       addCriterion("ordernum not in", values, "ordernum");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andOrdernumBetween(String value1, String value2) {
       addCriterion("ordernum between", value1, value2, "ordernum");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andOrdernumNotBetween(String value1, String value2) {
       addCriterion("ordernum not between", value1, value2, "ordernum");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andTypeIsNull() {
       addCriterion("type is null");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andTypeIsNotNull() {
       addCriterion("type is not null");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andTypeEqualTo(String value) {
       addCriterion("type =", value, "type");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andTypeNotEqualTo(String value) {
       addCriterion("type <>", value, "type");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andTypeGreaterThan(String value) {
       addCriterion("type >", value, "type");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andTypeGreaterThanOrEqualTo(String value) {
       addCriterion("type >=", value, "type");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andTypeLessThan(String value) {
       addCriterion("type <", value, "type");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andTypeLessThanOrEqualTo(String value) {
       addCriterion("type <=", value, "type");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andTypeLike(String value) {
       addCriterion("type like", value, "type");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andTypeNotLike(String value) {
       addCriterion("type not like", value, "type");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andTypeIn(List<String> values) {
       addCriterion("type in", values, "type");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andTypeNotIn(List<String> values) {
       addCriterion("type not in", values, "type");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andTypeBetween(String value1, String value2) {
       addCriterion("type between", value1, value2, "type");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andTypeNotBetween(String value1, String value2) {
       addCriterion("type not between", value1, value2, "type");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andExprecodeIsNull() {
       addCriterion("expreCode is null");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andExprecodeIsNotNull() {
       addCriterion("expreCode is not null");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andExprecodeEqualTo(String value) {
       addCriterion("expreCode =", value, "exprecode");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andExprecodeNotEqualTo(String value) {
       addCriterion("expreCode <>", value, "exprecode");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andExprecodeGreaterThan(String value) {
       addCriterion("expreCode >", value, "exprecode");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andExprecodeGreaterThanOrEqualTo(String value) {
       addCriterion("expreCode >=", value, "exprecode");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andExprecodeLessThan(String value) {
       addCriterion("expreCode <", value, "exprecode");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andExprecodeLessThanOrEqualTo(String value) {
       addCriterion("expreCode <=", value, "exprecode");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andExprecodeLike(String value) {
       addCriterion("expreCode like", value, "exprecode");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andExprecodeNotLike(String value) {
       addCriterion("expreCode not like", value, "exprecode");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andExprecodeIn(List<String> values) {
       addCriterion("expreCode in", values, "exprecode");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andExprecodeNotIn(List<String> values) {
       addCriterion("expreCode not in", values, "exprecode");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andExprecodeBetween(String value1, String value2) {
       addCriterion("expreCode between", value1, value2, "exprecode");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andExprecodeNotBetween(String value1, String value2) {
       addCriterion("expreCode not between", value1, value2, "exprecode");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andSkunumIsNull() {
       addCriterion("skuNum is null");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andSkunumIsNotNull() {
       addCriterion("skuNum is not null");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andSkunumEqualTo(Integer value) {
       addCriterion("skuNum =", value, "skunum");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andSkunumNotEqualTo(Integer value) {
       addCriterion("skuNum <>", value, "skunum");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andSkunumGreaterThan(Integer value) {
       addCriterion("skuNum >", value, "skunum");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andSkunumGreaterThanOrEqualTo(Integer value) {
       addCriterion("skuNum >=", value, "skunum");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andSkunumLessThan(Integer value) {
       addCriterion("skuNum <", value, "skunum");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andSkunumLessThanOrEqualTo(Integer value) {
       addCriterion("skuNum <=", value, "skunum");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andSkunumIn(List<Integer> values) {
       addCriterion("skuNum in", values, "skunum");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andSkunumNotIn(List<Integer> values) {
       addCriterion("skuNum not in", values, "skunum");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andSkunumBetween(Integer value1, Integer value2) {
       addCriterion("skuNum between", value1, value2, "skunum");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andSkunumNotBetween(Integer value1, Integer value2) {
       addCriterion("skuNum not between", value1, value2, "skunum");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andAnalyscodeIsNull() {
       addCriterion("analysCode is null");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andAnalyscodeIsNotNull() {
       addCriterion("analysCode is not null");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andAnalyscodeEqualTo(String value) {
       addCriterion("analysCode =", value, "analyscode");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andAnalyscodeNotEqualTo(String value) {
       addCriterion("analysCode <>", value, "analyscode");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andAnalyscodeGreaterThan(String value) {
       addCriterion("analysCode >", value, "analyscode");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andAnalyscodeGreaterThanOrEqualTo(String value) {
       addCriterion("analysCode >=", value, "analyscode");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andAnalyscodeLessThan(String value) {
       addCriterion("analysCode <", value, "analyscode");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andAnalyscodeLessThanOrEqualTo(String value) {
       addCriterion("analysCode <=", value, "analyscode");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andAnalyscodeLike(String value) {
       addCriterion("analysCode like", value, "analyscode");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andAnalyscodeNotLike(String value) {
       addCriterion("analysCode not like", value, "analyscode");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andAnalyscodeIn(List<String> values) {
       addCriterion("analysCode in", values, "analyscode");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andAnalyscodeNotIn(List<String> values) {
       addCriterion("analysCode not in", values, "analyscode");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andAnalyscodeBetween(String value1, String value2) {
       addCriterion("analysCode between", value1, value2, "analyscode");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andAnalyscodeNotBetween(String value1, String value2) {
       addCriterion("analysCode not between", value1, value2, "analyscode");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andUseridIsNull() {
       addCriterion("userId is null");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andUseridIsNotNull() {
       addCriterion("userId is not null");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andUseridEqualTo(String value) {
       addCriterion("userId =", value, "userid");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andUseridNotEqualTo(String value) {
       addCriterion("userId <>", value, "userid");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andUseridGreaterThan(String value) {
       addCriterion("userId >", value, "userid");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andUseridGreaterThanOrEqualTo(String value) {
       addCriterion("userId >=", value, "userid");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andUseridLessThan(String value) {
       addCriterion("userId <", value, "userid");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andUseridLessThanOrEqualTo(String value) {
       addCriterion("userId <=", value, "userid");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andUseridLike(String value) {
       addCriterion("userId like", value, "userid");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andUseridNotLike(String value) {
       addCriterion("userId not like", value, "userid");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andUseridIn(List<String> values) {
       addCriterion("userId in", values, "userid");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andUseridNotIn(List<String> values) {
       addCriterion("userId not in", values, "userid");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andUseridBetween(String value1, String value2) {
       addCriterion("userId between", value1, value2, "userid");
       return (TAnalysExample.Criteria)this;
     }
     
     public TAnalysExample.Criteria andUseridNotBetween(String value1, String value2) {
       addCriterion("userId not between", value1, value2, "userid");
       return (TAnalysExample.Criteria)this;
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


