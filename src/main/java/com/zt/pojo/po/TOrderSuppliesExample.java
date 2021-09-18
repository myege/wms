 package com.zt.pojo.po;
 
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 public class TOrderSuppliesExample
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
     protected List<TOrderSuppliesExample.Criterion> criteria = new ArrayList<TOrderSuppliesExample.Criterion>();
 
     
     public boolean isValid() {
       return (this.criteria.size() > 0);
     }
     
     public List<TOrderSuppliesExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
     
     public List<TOrderSuppliesExample.Criterion> getCriteria() {
       return this.criteria;
     }
     
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new TOrderSuppliesExample.Criterion(condition));
     }
     
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new TOrderSuppliesExample.Criterion(condition, value));
     }
     
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if (value1 == null || value2 == null) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new TOrderSuppliesExample.Criterion(condition, value1, value2));
     }
     
     public TOrderSuppliesExample.Criteria andIdIsNull() {
       addCriterion("id is null");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andIdIsNotNull() {
       addCriterion("id is not null");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andIdEqualTo(Integer value) {
       addCriterion("id =", value, "id");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andIdNotEqualTo(Integer value) {
       addCriterion("id <>", value, "id");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andIdGreaterThan(Integer value) {
       addCriterion("id >", value, "id");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("id >=", value, "id");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andIdLessThan(Integer value) {
       addCriterion("id <", value, "id");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andIdLessThanOrEqualTo(Integer value) {
       addCriterion("id <=", value, "id");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andIdIn(List<Integer> values) {
       addCriterion("id in", values, "id");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andIdNotIn(List<Integer> values) {
       addCriterion("id not in", values, "id");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andIdBetween(Integer value1, Integer value2) {
       addCriterion("id between", value1, value2, "id");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
       addCriterion("id not between", value1, value2, "id");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andCompanycodeIsNull() {
       addCriterion("companyCode is null");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andCompanycodeIsNotNull() {
       addCriterion("companyCode is not null");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andCompanycodeEqualTo(String value) {
       addCriterion("companyCode =", value, "companycode");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andCompanycodeNotEqualTo(String value) {
       addCriterion("companyCode <>", value, "companycode");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andCompanycodeGreaterThan(String value) {
       addCriterion("companyCode >", value, "companycode");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andCompanycodeGreaterThanOrEqualTo(String value) {
       addCriterion("companyCode >=", value, "companycode");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andCompanycodeLessThan(String value) {
       addCriterion("companyCode <", value, "companycode");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andCompanycodeLessThanOrEqualTo(String value) {
       addCriterion("companyCode <=", value, "companycode");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andCompanycodeLike(String value) {
       addCriterion("companyCode like", value, "companycode");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andCompanycodeNotLike(String value) {
       addCriterion("companyCode not like", value, "companycode");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andCompanycodeIn(List<String> values) {
       addCriterion("companyCode in", values, "companycode");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andCompanycodeNotIn(List<String> values) {
       addCriterion("companyCode not in", values, "companycode");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andCompanycodeBetween(String value1, String value2) {
       addCriterion("companyCode between", value1, value2, "companycode");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andCompanycodeNotBetween(String value1, String value2) {
       addCriterion("companyCode not between", value1, value2, "companycode");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andMailnoIsNull() {
       addCriterion("mailNo is null");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andMailnoIsNotNull() {
       addCriterion("mailNo is not null");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andMailnoEqualTo(String value) {
       addCriterion("mailNo =", value, "mailno");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andMailnoNotEqualTo(String value) {
       addCriterion("mailNo <>", value, "mailno");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andMailnoGreaterThan(String value) {
       addCriterion("mailNo >", value, "mailno");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andMailnoGreaterThanOrEqualTo(String value) {
       addCriterion("mailNo >=", value, "mailno");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andMailnoLessThan(String value) {
       addCriterion("mailNo <", value, "mailno");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andMailnoLessThanOrEqualTo(String value) {
       addCriterion("mailNo <=", value, "mailno");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andMailnoLike(String value) {
       addCriterion("mailNo like", value, "mailno");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andMailnoNotLike(String value) {
       addCriterion("mailNo not like", value, "mailno");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andMailnoIn(List<String> values) {
       addCriterion("mailNo in", values, "mailno");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andMailnoNotIn(List<String> values) {
       addCriterion("mailNo not in", values, "mailno");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andMailnoBetween(String value1, String value2) {
       addCriterion("mailNo between", value1, value2, "mailno");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andMailnoNotBetween(String value1, String value2) {
       addCriterion("mailNo not between", value1, value2, "mailno");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andSuppliesidIsNull() {
       addCriterion("suppliesId is null");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andSuppliesidIsNotNull() {
       addCriterion("suppliesId is not null");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andSuppliesidEqualTo(String value) {
       addCriterion("suppliesId =", value, "suppliesid");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andSuppliesidNotEqualTo(String value) {
       addCriterion("suppliesId <>", value, "suppliesid");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andSuppliesidGreaterThan(String value) {
       addCriterion("suppliesId >", value, "suppliesid");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andSuppliesidGreaterThanOrEqualTo(String value) {
       addCriterion("suppliesId >=", value, "suppliesid");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andSuppliesidLessThan(String value) {
       addCriterion("suppliesId <", value, "suppliesid");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andSuppliesidLessThanOrEqualTo(String value) {
       addCriterion("suppliesId <=", value, "suppliesid");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andSuppliesidLike(String value) {
       addCriterion("suppliesId like", value, "suppliesid");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andSuppliesidNotLike(String value) {
       addCriterion("suppliesId not like", value, "suppliesid");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andSuppliesidIn(List<String> values) {
       addCriterion("suppliesId in", values, "suppliesid");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andSuppliesidNotIn(List<String> values) {
       addCriterion("suppliesId not in", values, "suppliesid");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andSuppliesidBetween(String value1, String value2) {
       addCriterion("suppliesId between", value1, value2, "suppliesid");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andSuppliesidNotBetween(String value1, String value2) {
       addCriterion("suppliesId not between", value1, value2, "suppliesid");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andSuppliesnameIsNull() {
       addCriterion("suppliesName is null");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andSuppliesnameIsNotNull() {
       addCriterion("suppliesName is not null");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andSuppliesnameEqualTo(String value) {
       addCriterion("suppliesName =", value, "suppliesname");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andSuppliesnameNotEqualTo(String value) {
       addCriterion("suppliesName <>", value, "suppliesname");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andSuppliesnameGreaterThan(String value) {
       addCriterion("suppliesName >", value, "suppliesname");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andSuppliesnameGreaterThanOrEqualTo(String value) {
       addCriterion("suppliesName >=", value, "suppliesname");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andSuppliesnameLessThan(String value) {
       addCriterion("suppliesName <", value, "suppliesname");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andSuppliesnameLessThanOrEqualTo(String value) {
       addCriterion("suppliesName <=", value, "suppliesname");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andSuppliesnameLike(String value) {
       addCriterion("suppliesName like", value, "suppliesname");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andSuppliesnameNotLike(String value) {
       addCriterion("suppliesName not like", value, "suppliesname");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andSuppliesnameIn(List<String> values) {
       addCriterion("suppliesName in", values, "suppliesname");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andSuppliesnameNotIn(List<String> values) {
       addCriterion("suppliesName not in", values, "suppliesname");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andSuppliesnameBetween(String value1, String value2) {
       addCriterion("suppliesName between", value1, value2, "suppliesname");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andSuppliesnameNotBetween(String value1, String value2) {
       addCriterion("suppliesName not between", value1, value2, "suppliesname");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andPriceIsNull() {
       addCriterion("price is null");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andPriceIsNotNull() {
       addCriterion("price is not null");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andPriceEqualTo(String value) {
       addCriterion("price =", value, "price");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andPriceNotEqualTo(String value) {
       addCriterion("price <>", value, "price");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andPriceGreaterThan(String value) {
       addCriterion("price >", value, "price");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andPriceGreaterThanOrEqualTo(String value) {
       addCriterion("price >=", value, "price");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andPriceLessThan(String value) {
       addCriterion("price <", value, "price");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andPriceLessThanOrEqualTo(String value) {
       addCriterion("price <=", value, "price");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andPriceLike(String value) {
       addCriterion("price like", value, "price");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andPriceNotLike(String value) {
       addCriterion("price not like", value, "price");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andPriceIn(List<String> values) {
       addCriterion("price in", values, "price");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andPriceNotIn(List<String> values) {
       addCriterion("price not in", values, "price");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andPriceBetween(String value1, String value2) {
       addCriterion("price between", value1, value2, "price");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andPriceNotBetween(String value1, String value2) {
       addCriterion("price not between", value1, value2, "price");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andSuppliesnumIsNull() {
       addCriterion("suppliesNum is null");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andSuppliesnumIsNotNull() {
       addCriterion("suppliesNum is not null");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andSuppliesnumEqualTo(Integer value) {
       addCriterion("suppliesNum =", value, "suppliesnum");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andSuppliesnumNotEqualTo(Integer value) {
       addCriterion("suppliesNum <>", value, "suppliesnum");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andSuppliesnumGreaterThan(Integer value) {
       addCriterion("suppliesNum >", value, "suppliesnum");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andSuppliesnumGreaterThanOrEqualTo(Integer value) {
       addCriterion("suppliesNum >=", value, "suppliesnum");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andSuppliesnumLessThan(Integer value) {
       addCriterion("suppliesNum <", value, "suppliesnum");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andSuppliesnumLessThanOrEqualTo(Integer value) {
       addCriterion("suppliesNum <=", value, "suppliesnum");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andSuppliesnumIn(List<Integer> values) {
       addCriterion("suppliesNum in", values, "suppliesnum");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andSuppliesnumNotIn(List<Integer> values) {
       addCriterion("suppliesNum not in", values, "suppliesnum");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andSuppliesnumBetween(Integer value1, Integer value2) {
       addCriterion("suppliesNum between", value1, value2, "suppliesnum");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andSuppliesnumNotBetween(Integer value1, Integer value2) {
       addCriterion("suppliesNum not between", value1, value2, "suppliesnum");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andIstoztzIsNull() {
       addCriterion("isToZtz is null");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andIstoztzIsNotNull() {
       addCriterion("isToZtz is not null");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andIstoztzEqualTo(Integer value) {
       addCriterion("isToZtz =", value, "istoztz");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andIstoztzNotEqualTo(Integer value) {
       addCriterion("isToZtz <>", value, "istoztz");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andIstoztzGreaterThan(Integer value) {
       addCriterion("isToZtz >", value, "istoztz");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andIstoztzGreaterThanOrEqualTo(Integer value) {
       addCriterion("isToZtz >=", value, "istoztz");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andIstoztzLessThan(Integer value) {
       addCriterion("isToZtz <", value, "istoztz");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andIstoztzLessThanOrEqualTo(Integer value) {
       addCriterion("isToZtz <=", value, "istoztz");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andIstoztzIn(List<Integer> values) {
       addCriterion("isToZtz in", values, "istoztz");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andIstoztzNotIn(List<Integer> values) {
       addCriterion("isToZtz not in", values, "istoztz");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andIstoztzBetween(Integer value1, Integer value2) {
       addCriterion("isToZtz between", value1, value2, "istoztz");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andIstoztzNotBetween(Integer value1, Integer value2) {
       addCriterion("isToZtz not between", value1, value2, "istoztz");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andCreatetimeIsNull() {
       addCriterion("createTime is null");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andCreatetimeIsNotNull() {
       addCriterion("createTime is not null");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andCreatetimeEqualTo(Date value) {
       addCriterion("createTime =", value, "createtime");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andCreatetimeNotEqualTo(Date value) {
       addCriterion("createTime <>", value, "createtime");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andCreatetimeGreaterThan(Date value) {
       addCriterion("createTime >", value, "createtime");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
       addCriterion("createTime >=", value, "createtime");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andCreatetimeLessThan(Date value) {
       addCriterion("createTime <", value, "createtime");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andCreatetimeLessThanOrEqualTo(Date value) {
       addCriterion("createTime <=", value, "createtime");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andCreatetimeIn(List<Date> values) {
       addCriterion("createTime in", values, "createtime");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andCreatetimeNotIn(List<Date> values) {
       addCriterion("createTime not in", values, "createtime");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andCreatetimeBetween(Date value1, Date value2) {
       addCriterion("createTime between", value1, value2, "createtime");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andCreatetimeNotBetween(Date value1, Date value2) {
       addCriterion("createTime not between", value1, value2, "createtime");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andIsdeletedIsNull() {
       addCriterion("isDeleted is null");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andIsdeletedIsNotNull() {
       addCriterion("isDeleted is not null");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andIsdeletedEqualTo(Integer value) {
       addCriterion("isDeleted =", value, "isdeleted");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andIsdeletedNotEqualTo(Integer value) {
       addCriterion("isDeleted <>", value, "isdeleted");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andIsdeletedGreaterThan(Integer value) {
       addCriterion("isDeleted >", value, "isdeleted");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andIsdeletedGreaterThanOrEqualTo(Integer value) {
       addCriterion("isDeleted >=", value, "isdeleted");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andIsdeletedLessThan(Integer value) {
       addCriterion("isDeleted <", value, "isdeleted");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andIsdeletedLessThanOrEqualTo(Integer value) {
       addCriterion("isDeleted <=", value, "isdeleted");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andIsdeletedIn(List<Integer> values) {
       addCriterion("isDeleted in", values, "isdeleted");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andIsdeletedNotIn(List<Integer> values) {
       addCriterion("isDeleted not in", values, "isdeleted");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andIsdeletedBetween(Integer value1, Integer value2) {
       addCriterion("isDeleted between", value1, value2, "isdeleted");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andIsdeletedNotBetween(Integer value1, Integer value2) {
       addCriterion("isDeleted not between", value1, value2, "isdeleted");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andTypeIsNull() {
       addCriterion("type is null");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andTypeIsNotNull() {
       addCriterion("type is not null");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andTypeEqualTo(Integer value) {
       addCriterion("type =", value, "type");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andTypeNotEqualTo(Integer value) {
       addCriterion("type <>", value, "type");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andTypeGreaterThan(Integer value) {
       addCriterion("type >", value, "type");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andTypeGreaterThanOrEqualTo(Integer value) {
       addCriterion("type >=", value, "type");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andTypeLessThan(Integer value) {
       addCriterion("type <", value, "type");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andTypeLessThanOrEqualTo(Integer value) {
       addCriterion("type <=", value, "type");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andTypeIn(List<Integer> values) {
       addCriterion("type in", values, "type");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andTypeNotIn(List<Integer> values) {
       addCriterion("type not in", values, "type");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andTypeBetween(Integer value1, Integer value2) {
       addCriterion("type between", value1, value2, "type");
       return (TOrderSuppliesExample.Criteria)this;
     }
     
     public TOrderSuppliesExample.Criteria andTypeNotBetween(Integer value1, Integer value2) {
       addCriterion("type not between", value1, value2, "type");
       return (TOrderSuppliesExample.Criteria)this;
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


