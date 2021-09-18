 package com.zt.pojo.po;
 
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 public class TItemExample
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
     protected List<TItemExample.Criterion> criteria = new ArrayList<TItemExample.Criterion>();
 
     
     public boolean isValid() {
       return (this.criteria.size() > 0);
     }
     
     public List<TItemExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
     
     public List<TItemExample.Criterion> getCriteria() {
       return this.criteria;
     }
     
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new TItemExample.Criterion(condition));
     }
     
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new TItemExample.Criterion(condition, value));
     }
     
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if (value1 == null || value2 == null) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new TItemExample.Criterion(condition, value1, value2));
     }
     
     public TItemExample.Criteria andIdIsNull() {
       addCriterion("id is null");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andIdIsNotNull() {
       addCriterion("id is not null");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andIdEqualTo(Integer value) {
       addCriterion("id =", value, "id");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andIdNotEqualTo(Integer value) {
       addCriterion("id <>", value, "id");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andIdGreaterThan(Integer value) {
       addCriterion("id >", value, "id");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("id >=", value, "id");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andIdLessThan(Integer value) {
       addCriterion("id <", value, "id");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andIdLessThanOrEqualTo(Integer value) {
       addCriterion("id <=", value, "id");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andIdIn(List<Integer> values) {
       addCriterion("id in", values, "id");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andIdNotIn(List<Integer> values) {
       addCriterion("id not in", values, "id");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andIdBetween(Integer value1, Integer value2) {
       addCriterion("id between", value1, value2, "id");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
       addCriterion("id not between", value1, value2, "id");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andCompanycodeIsNull() {
       addCriterion("companyCode is null");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andCompanycodeIsNotNull() {
       addCriterion("companyCode is not null");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andCompanycodeEqualTo(String value) {
       addCriterion("companyCode =", value, "companycode");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andCompanycodeNotEqualTo(String value) {
       addCriterion("companyCode <>", value, "companycode");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andCompanycodeGreaterThan(String value) {
       addCriterion("companyCode >", value, "companycode");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andCompanycodeGreaterThanOrEqualTo(String value) {
       addCriterion("companyCode >=", value, "companycode");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andCompanycodeLessThan(String value) {
       addCriterion("companyCode <", value, "companycode");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andCompanycodeLessThanOrEqualTo(String value) {
       addCriterion("companyCode <=", value, "companycode");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andCompanycodeLike(String value) {
       addCriterion("companyCode like", value, "companycode");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andCompanycodeNotLike(String value) {
       addCriterion("companyCode not like", value, "companycode");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andCompanycodeIn(List<String> values) {
       addCriterion("companyCode in", values, "companycode");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andCompanycodeNotIn(List<String> values) {
       addCriterion("companyCode not in", values, "companycode");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andCompanycodeBetween(String value1, String value2) {
       addCriterion("companyCode between", value1, value2, "companycode");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andCompanycodeNotBetween(String value1, String value2) {
       addCriterion("companyCode not between", value1, value2, "companycode");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andCompanynameIsNull() {
       addCriterion("companyName is null");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andCompanynameIsNotNull() {
       addCriterion("companyName is not null");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andCompanynameEqualTo(String value) {
       addCriterion("companyName =", value, "companyname");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andCompanynameNotEqualTo(String value) {
       addCriterion("companyName <>", value, "companyname");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andCompanynameGreaterThan(String value) {
       addCriterion("companyName >", value, "companyname");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andCompanynameGreaterThanOrEqualTo(String value) {
       addCriterion("companyName >=", value, "companyname");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andCompanynameLessThan(String value) {
       addCriterion("companyName <", value, "companyname");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andCompanynameLessThanOrEqualTo(String value) {
       addCriterion("companyName <=", value, "companyname");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andCompanynameLike(String value) {
       addCriterion("companyName like", value, "companyname");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andCompanynameNotLike(String value) {
       addCriterion("companyName not like", value, "companyname");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andCompanynameIn(List<String> values) {
       addCriterion("companyName in", values, "companyname");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andCompanynameNotIn(List<String> values) {
       addCriterion("companyName not in", values, "companyname");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andCompanynameBetween(String value1, String value2) {
       addCriterion("companyName between", value1, value2, "companyname");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andCompanynameNotBetween(String value1, String value2) {
       addCriterion("companyName not between", value1, value2, "companyname");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andItemnameIsNull() {
       addCriterion("itemName is null");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andItemnameIsNotNull() {
       addCriterion("itemName is not null");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andItemnameEqualTo(String value) {
       addCriterion("itemName =", value, "itemname");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andItemnameNotEqualTo(String value) {
       addCriterion("itemName <>", value, "itemname");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andItemnameGreaterThan(String value) {
       addCriterion("itemName >", value, "itemname");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andItemnameGreaterThanOrEqualTo(String value) {
       addCriterion("itemName >=", value, "itemname");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andItemnameLessThan(String value) {
       addCriterion("itemName <", value, "itemname");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andItemnameLessThanOrEqualTo(String value) {
       addCriterion("itemName <=", value, "itemname");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andItemnameLike(String value) {
       addCriterion("itemName like", value, "itemname");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andItemnameNotLike(String value) {
       addCriterion("itemName not like", value, "itemname");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andItemnameIn(List<String> values) {
       addCriterion("itemName in", values, "itemname");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andItemnameNotIn(List<String> values) {
       addCriterion("itemName not in", values, "itemname");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andItemnameBetween(String value1, String value2) {
       addCriterion("itemName between", value1, value2, "itemname");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andItemnameNotBetween(String value1, String value2) {
       addCriterion("itemName not between", value1, value2, "itemname");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andItemcodeIsNull() {
       addCriterion("itemCode is null");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andItemcodeIsNotNull() {
       addCriterion("itemCode is not null");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andItemcodeEqualTo(String value) {
       addCriterion("itemCode =", value, "itemcode");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andItemcodeNotEqualTo(String value) {
       addCriterion("itemCode <>", value, "itemcode");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andItemcodeGreaterThan(String value) {
       addCriterion("itemCode >", value, "itemcode");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andItemcodeGreaterThanOrEqualTo(String value) {
       addCriterion("itemCode >=", value, "itemcode");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andItemcodeLessThan(String value) {
       addCriterion("itemCode <", value, "itemcode");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andItemcodeLessThanOrEqualTo(String value) {
       addCriterion("itemCode <=", value, "itemcode");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andItemcodeLike(String value) {
       addCriterion("itemCode like", value, "itemcode");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andItemcodeNotLike(String value) {
       addCriterion("itemCode not like", value, "itemcode");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andItemcodeIn(List<String> values) {
       addCriterion("itemCode in", values, "itemcode");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andItemcodeNotIn(List<String> values) {
       addCriterion("itemCode not in", values, "itemcode");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andItemcodeBetween(String value1, String value2) {
       addCriterion("itemCode between", value1, value2, "itemcode");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andItemcodeNotBetween(String value1, String value2) {
       addCriterion("itemCode not between", value1, value2, "itemcode");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andSpecificationsIsNull() {
       addCriterion("specifications is null");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andSpecificationsIsNotNull() {
       addCriterion("specifications is not null");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andSpecificationsEqualTo(String value) {
       addCriterion("specifications =", value, "specifications");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andSpecificationsNotEqualTo(String value) {
       addCriterion("specifications <>", value, "specifications");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andSpecificationsGreaterThan(String value) {
       addCriterion("specifications >", value, "specifications");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andSpecificationsGreaterThanOrEqualTo(String value) {
       addCriterion("specifications >=", value, "specifications");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andSpecificationsLessThan(String value) {
       addCriterion("specifications <", value, "specifications");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andSpecificationsLessThanOrEqualTo(String value) {
       addCriterion("specifications <=", value, "specifications");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andSpecificationsLike(String value) {
       addCriterion("specifications like", value, "specifications");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andSpecificationsNotLike(String value) {
       addCriterion("specifications not like", value, "specifications");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andSpecificationsIn(List<String> values) {
       addCriterion("specifications in", values, "specifications");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andSpecificationsNotIn(List<String> values) {
       addCriterion("specifications not in", values, "specifications");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andSpecificationsBetween(String value1, String value2) {
       addCriterion("specifications between", value1, value2, "specifications");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andSpecificationsNotBetween(String value1, String value2) {
       addCriterion("specifications not between", value1, value2, "specifications");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andUnitIsNull() {
       addCriterion("unit is null");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andUnitIsNotNull() {
       addCriterion("unit is not null");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andUnitEqualTo(String value) {
       addCriterion("unit =", value, "unit");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andUnitNotEqualTo(String value) {
       addCriterion("unit <>", value, "unit");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andUnitGreaterThan(String value) {
       addCriterion("unit >", value, "unit");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andUnitGreaterThanOrEqualTo(String value) {
       addCriterion("unit >=", value, "unit");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andUnitLessThan(String value) {
       addCriterion("unit <", value, "unit");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andUnitLessThanOrEqualTo(String value) {
       addCriterion("unit <=", value, "unit");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andUnitLike(String value) {
       addCriterion("unit like", value, "unit");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andUnitNotLike(String value) {
       addCriterion("unit not like", value, "unit");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andUnitIn(List<String> values) {
       addCriterion("unit in", values, "unit");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andUnitNotIn(List<String> values) {
       addCriterion("unit not in", values, "unit");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andUnitBetween(String value1, String value2) {
       addCriterion("unit between", value1, value2, "unit");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andUnitNotBetween(String value1, String value2) {
       addCriterion("unit not between", value1, value2, "unit");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andSkuIsNull() {
       addCriterion("sku is null");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andSkuIsNotNull() {
       addCriterion("sku is not null");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andSkuEqualTo(String value) {
       addCriterion("sku =", value, "sku");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andSkuNotEqualTo(String value) {
       addCriterion("sku <>", value, "sku");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andSkuGreaterThan(String value) {
       addCriterion("sku >", value, "sku");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andSkuGreaterThanOrEqualTo(String value) {
       addCriterion("sku >=", value, "sku");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andSkuLessThan(String value) {
       addCriterion("sku <", value, "sku");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andSkuLessThanOrEqualTo(String value) {
       addCriterion("sku <=", value, "sku");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andSkuLike(String value) {
       addCriterion("sku like", value, "sku");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andSkuNotLike(String value) {
       addCriterion("sku not like", value, "sku");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andSkuIn(List<String> values) {
       addCriterion("sku in", values, "sku");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andSkuNotIn(List<String> values) {
       addCriterion("sku not in", values, "sku");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andSkuBetween(String value1, String value2) {
       addCriterion("sku between", value1, value2, "sku");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andSkuNotBetween(String value1, String value2) {
       addCriterion("sku not between", value1, value2, "sku");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andWeightIsNull() {
       addCriterion("weight is null");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andWeightIsNotNull() {
       addCriterion("weight is not null");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andWeightEqualTo(String value) {
       addCriterion("weight =", value, "weight");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andWeightNotEqualTo(String value) {
       addCriterion("weight <>", value, "weight");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andWeightGreaterThan(String value) {
       addCriterion("weight >", value, "weight");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andWeightGreaterThanOrEqualTo(String value) {
       addCriterion("weight >=", value, "weight");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andWeightLessThan(String value) {
       addCriterion("weight <", value, "weight");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andWeightLessThanOrEqualTo(String value) {
       addCriterion("weight <=", value, "weight");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andWeightLike(String value) {
       addCriterion("weight like", value, "weight");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andWeightNotLike(String value) {
       addCriterion("weight not like", value, "weight");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andWeightIn(List<String> values) {
       addCriterion("weight in", values, "weight");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andWeightNotIn(List<String> values) {
       addCriterion("weight not in", values, "weight");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andWeightBetween(String value1, String value2) {
       addCriterion("weight between", value1, value2, "weight");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andWeightNotBetween(String value1, String value2) {
       addCriterion("weight not between", value1, value2, "weight");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andCreatetimeIsNull() {
       addCriterion("createTime is null");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andCreatetimeIsNotNull() {
       addCriterion("createTime is not null");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andCreatetimeEqualTo(Date value) {
       addCriterion("createTime =", value, "createtime");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andCreatetimeNotEqualTo(Date value) {
       addCriterion("createTime <>", value, "createtime");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andCreatetimeGreaterThan(Date value) {
       addCriterion("createTime >", value, "createtime");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
       addCriterion("createTime >=", value, "createtime");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andCreatetimeLessThan(Date value) {
       addCriterion("createTime <", value, "createtime");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andCreatetimeLessThanOrEqualTo(Date value) {
       addCriterion("createTime <=", value, "createtime");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andCreatetimeIn(List<Date> values) {
       addCriterion("createTime in", values, "createtime");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andCreatetimeNotIn(List<Date> values) {
       addCriterion("createTime not in", values, "createtime");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andCreatetimeBetween(Date value1, Date value2) {
       addCriterion("createTime between", value1, value2, "createtime");
       return (TItemExample.Criteria)this;
     }
     
     public TItemExample.Criteria andCreatetimeNotBetween(Date value1, Date value2) {
       addCriterion("createTime not between", value1, value2, "createtime");
       return (TItemExample.Criteria)this;
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


