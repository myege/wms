 package com.zt.pojo.po;
 
 import java.util.ArrayList;
 import java.util.List;
 public class TSuppliesExample
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
     protected List<TSuppliesExample.Criterion> criteria = new ArrayList<TSuppliesExample.Criterion>();
 
     
     public boolean isValid() {
       return (this.criteria.size() > 0);
     }
     
     public List<TSuppliesExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
     
     public List<TSuppliesExample.Criterion> getCriteria() {
       return this.criteria;
     }
     
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new TSuppliesExample.Criterion(condition));
     }
     
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new TSuppliesExample.Criterion(condition, value));
     }
     
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if (value1 == null || value2 == null) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new TSuppliesExample.Criterion(condition, value1, value2));
     }
     
     public TSuppliesExample.Criteria andIdIsNull() {
       addCriterion("id is null");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andIdIsNotNull() {
       addCriterion("id is not null");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andIdEqualTo(Integer value) {
       addCriterion("id =", value, "id");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andIdNotEqualTo(Integer value) {
       addCriterion("id <>", value, "id");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andIdGreaterThan(Integer value) {
       addCriterion("id >", value, "id");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("id >=", value, "id");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andIdLessThan(Integer value) {
       addCriterion("id <", value, "id");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andIdLessThanOrEqualTo(Integer value) {
       addCriterion("id <=", value, "id");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andIdIn(List<Integer> values) {
       addCriterion("id in", values, "id");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andIdNotIn(List<Integer> values) {
       addCriterion("id not in", values, "id");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andIdBetween(Integer value1, Integer value2) {
       addCriterion("id between", value1, value2, "id");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
       addCriterion("id not between", value1, value2, "id");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSuppliesidIsNull() {
       addCriterion("suppliesId is null");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSuppliesidIsNotNull() {
       addCriterion("suppliesId is not null");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSuppliesidEqualTo(String value) {
       addCriterion("suppliesId =", value, "suppliesid");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSuppliesidNotEqualTo(String value) {
       addCriterion("suppliesId <>", value, "suppliesid");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSuppliesidGreaterThan(String value) {
       addCriterion("suppliesId >", value, "suppliesid");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSuppliesidGreaterThanOrEqualTo(String value) {
       addCriterion("suppliesId >=", value, "suppliesid");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSuppliesidLessThan(String value) {
       addCriterion("suppliesId <", value, "suppliesid");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSuppliesidLessThanOrEqualTo(String value) {
       addCriterion("suppliesId <=", value, "suppliesid");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSuppliesidLike(String value) {
       addCriterion("suppliesId like", value, "suppliesid");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSuppliesidNotLike(String value) {
       addCriterion("suppliesId not like", value, "suppliesid");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSuppliesidIn(List<String> values) {
       addCriterion("suppliesId in", values, "suppliesid");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSuppliesidNotIn(List<String> values) {
       addCriterion("suppliesId not in", values, "suppliesid");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSuppliesidBetween(String value1, String value2) {
       addCriterion("suppliesId between", value1, value2, "suppliesid");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSuppliesidNotBetween(String value1, String value2) {
       addCriterion("suppliesId not between", value1, value2, "suppliesid");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSuppliesnameIsNull() {
       addCriterion("suppliesName is null");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSuppliesnameIsNotNull() {
       addCriterion("suppliesName is not null");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSuppliesnameEqualTo(String value) {
       addCriterion("suppliesName =", value, "suppliesname");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSuppliesnameNotEqualTo(String value) {
       addCriterion("suppliesName <>", value, "suppliesname");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSuppliesnameGreaterThan(String value) {
       addCriterion("suppliesName >", value, "suppliesname");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSuppliesnameGreaterThanOrEqualTo(String value) {
       addCriterion("suppliesName >=", value, "suppliesname");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSuppliesnameLessThan(String value) {
       addCriterion("suppliesName <", value, "suppliesname");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSuppliesnameLessThanOrEqualTo(String value) {
       addCriterion("suppliesName <=", value, "suppliesname");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSuppliesnameLike(String value) {
       addCriterion("suppliesName like", value, "suppliesname");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSuppliesnameNotLike(String value) {
       addCriterion("suppliesName not like", value, "suppliesname");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSuppliesnameIn(List<String> values) {
       addCriterion("suppliesName in", values, "suppliesname");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSuppliesnameNotIn(List<String> values) {
       addCriterion("suppliesName not in", values, "suppliesname");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSuppliesnameBetween(String value1, String value2) {
       addCriterion("suppliesName between", value1, value2, "suppliesname");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSuppliesnameNotBetween(String value1, String value2) {
       addCriterion("suppliesName not between", value1, value2, "suppliesname");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andTypeIsNull() {
       addCriterion("type is null");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andTypeIsNotNull() {
       addCriterion("type is not null");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andTypeEqualTo(String value) {
       addCriterion("type =", value, "type");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andTypeNotEqualTo(String value) {
       addCriterion("type <>", value, "type");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andTypeGreaterThan(String value) {
       addCriterion("type >", value, "type");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andTypeGreaterThanOrEqualTo(String value) {
       addCriterion("type >=", value, "type");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andTypeLessThan(String value) {
       addCriterion("type <", value, "type");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andTypeLessThanOrEqualTo(String value) {
       addCriterion("type <=", value, "type");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andTypeLike(String value) {
       addCriterion("type like", value, "type");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andTypeNotLike(String value) {
       addCriterion("type not like", value, "type");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andTypeIn(List<String> values) {
       addCriterion("type in", values, "type");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andTypeNotIn(List<String> values) {
       addCriterion("type not in", values, "type");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andTypeBetween(String value1, String value2) {
       addCriterion("type between", value1, value2, "type");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andTypeNotBetween(String value1, String value2) {
       addCriterion("type not between", value1, value2, "type");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSuppliestypeIsNull() {
       addCriterion("suppliesType is null");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSuppliestypeIsNotNull() {
       addCriterion("suppliesType is not null");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSuppliestypeEqualTo(String value) {
       addCriterion("suppliesType =", value, "suppliestype");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSuppliestypeNotEqualTo(String value) {
       addCriterion("suppliesType <>", value, "suppliestype");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSuppliestypeGreaterThan(String value) {
       addCriterion("suppliesType >", value, "suppliestype");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSuppliestypeGreaterThanOrEqualTo(String value) {
       addCriterion("suppliesType >=", value, "suppliestype");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSuppliestypeLessThan(String value) {
       addCriterion("suppliesType <", value, "suppliestype");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSuppliestypeLessThanOrEqualTo(String value) {
       addCriterion("suppliesType <=", value, "suppliestype");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSuppliestypeLike(String value) {
       addCriterion("suppliesType like", value, "suppliestype");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSuppliestypeNotLike(String value) {
       addCriterion("suppliesType not like", value, "suppliestype");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSuppliestypeIn(List<String> values) {
       addCriterion("suppliesType in", values, "suppliestype");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSuppliestypeNotIn(List<String> values) {
       addCriterion("suppliesType not in", values, "suppliestype");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSuppliestypeBetween(String value1, String value2) {
       addCriterion("suppliesType between", value1, value2, "suppliestype");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSuppliestypeNotBetween(String value1, String value2) {
       addCriterion("suppliesType not between", value1, value2, "suppliestype");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andPriceIsNull() {
       addCriterion("price is null");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andPriceIsNotNull() {
       addCriterion("price is not null");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andPriceEqualTo(String value) {
       addCriterion("price =", value, "price");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andPriceNotEqualTo(String value) {
       addCriterion("price <>", value, "price");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andPriceGreaterThan(String value) {
       addCriterion("price >", value, "price");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andPriceGreaterThanOrEqualTo(String value) {
       addCriterion("price >=", value, "price");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andPriceLessThan(String value) {
       addCriterion("price <", value, "price");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andPriceLessThanOrEqualTo(String value) {
       addCriterion("price <=", value, "price");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andPriceLike(String value) {
       addCriterion("price like", value, "price");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andPriceNotLike(String value) {
       addCriterion("price not like", value, "price");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andPriceIn(List<String> values) {
       addCriterion("price in", values, "price");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andPriceNotIn(List<String> values) {
       addCriterion("price not in", values, "price");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andPriceBetween(String value1, String value2) {
       addCriterion("price between", value1, value2, "price");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andPriceNotBetween(String value1, String value2) {
       addCriterion("price not between", value1, value2, "price");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andNumberIsNull() {
       addCriterion("number is null");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andNumberIsNotNull() {
       addCriterion("number is not null");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andNumberEqualTo(Integer value) {
       addCriterion("number =", value, "number");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andNumberNotEqualTo(Integer value) {
       addCriterion("number <>", value, "number");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andNumberGreaterThan(Integer value) {
       addCriterion("number >", value, "number");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andNumberGreaterThanOrEqualTo(Integer value) {
       addCriterion("number >=", value, "number");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andNumberLessThan(Integer value) {
       addCriterion("number <", value, "number");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andNumberLessThanOrEqualTo(Integer value) {
       addCriterion("number <=", value, "number");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andNumberIn(List<Integer> values) {
       addCriterion("number in", values, "number");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andNumberNotIn(List<Integer> values) {
       addCriterion("number not in", values, "number");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andNumberBetween(Integer value1, Integer value2) {
       addCriterion("number between", value1, value2, "number");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andNumberNotBetween(Integer value1, Integer value2) {
       addCriterion("number not between", value1, value2, "number");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSpecIsNull() {
       addCriterion("spec is null");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSpecIsNotNull() {
       addCriterion("spec is not null");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSpecEqualTo(String value) {
       addCriterion("spec =", value, "spec");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSpecNotEqualTo(String value) {
       addCriterion("spec <>", value, "spec");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSpecGreaterThan(String value) {
       addCriterion("spec >", value, "spec");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSpecGreaterThanOrEqualTo(String value) {
       addCriterion("spec >=", value, "spec");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSpecLessThan(String value) {
       addCriterion("spec <", value, "spec");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSpecLessThanOrEqualTo(String value) {
       addCriterion("spec <=", value, "spec");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSpecLike(String value) {
       addCriterion("spec like", value, "spec");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSpecNotLike(String value) {
       addCriterion("spec not like", value, "spec");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSpecIn(List<String> values) {
       addCriterion("spec in", values, "spec");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSpecNotIn(List<String> values) {
       addCriterion("spec not in", values, "spec");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSpecBetween(String value1, String value2) {
       addCriterion("spec between", value1, value2, "spec");
       return (TSuppliesExample.Criteria)this;
     }
     
     public TSuppliesExample.Criteria andSpecNotBetween(String value1, String value2) {
       addCriterion("spec not between", value1, value2, "spec");
       return (TSuppliesExample.Criteria)this;
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


