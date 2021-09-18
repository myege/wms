 package com.zt.pojo.po;
 
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 public class JsSuppliesSkuExample
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
     protected List<JsSuppliesSkuExample.Criterion> criteria = new ArrayList<JsSuppliesSkuExample.Criterion>();
 
     
     public boolean isValid() {
       return (this.criteria.size() > 0);
     }
     
     public List<JsSuppliesSkuExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
     
     public List<JsSuppliesSkuExample.Criterion> getCriteria() {
       return this.criteria;
     }
     
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new JsSuppliesSkuExample.Criterion(condition));
     }
     
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new JsSuppliesSkuExample.Criterion(condition, value));
     }
     
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if (value1 == null || value2 == null) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new JsSuppliesSkuExample.Criterion(condition, value1, value2));
     }
     
     public JsSuppliesSkuExample.Criteria andIdIsNull() {
       addCriterion("id is null");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andIdIsNotNull() {
       addCriterion("id is not null");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andIdEqualTo(Integer value) {
       addCriterion("id =", value, "id");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andIdNotEqualTo(Integer value) {
       addCriterion("id <>", value, "id");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andIdGreaterThan(Integer value) {
       addCriterion("id >", value, "id");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("id >=", value, "id");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andIdLessThan(Integer value) {
       addCriterion("id <", value, "id");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andIdLessThanOrEqualTo(Integer value) {
       addCriterion("id <=", value, "id");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andIdIn(List<Integer> values) {
       addCriterion("id in", values, "id");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andIdNotIn(List<Integer> values) {
       addCriterion("id not in", values, "id");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andIdBetween(Integer value1, Integer value2) {
       addCriterion("id between", value1, value2, "id");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
       addCriterion("id not between", value1, value2, "id");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andCompanycodeIsNull() {
       addCriterion("companyCode is null");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andCompanycodeIsNotNull() {
       addCriterion("companyCode is not null");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andCompanycodeEqualTo(String value) {
       addCriterion("companyCode =", value, "companycode");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andCompanycodeNotEqualTo(String value) {
       addCriterion("companyCode <>", value, "companycode");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andCompanycodeGreaterThan(String value) {
       addCriterion("companyCode >", value, "companycode");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andCompanycodeGreaterThanOrEqualTo(String value) {
       addCriterion("companyCode >=", value, "companycode");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andCompanycodeLessThan(String value) {
       addCriterion("companyCode <", value, "companycode");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andCompanycodeLessThanOrEqualTo(String value) {
       addCriterion("companyCode <=", value, "companycode");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andCompanycodeLike(String value) {
       addCriterion("companyCode like", value, "companycode");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andCompanycodeNotLike(String value) {
       addCriterion("companyCode not like", value, "companycode");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andCompanycodeIn(List<String> values) {
       addCriterion("companyCode in", values, "companycode");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andCompanycodeNotIn(List<String> values) {
       addCriterion("companyCode not in", values, "companycode");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andCompanycodeBetween(String value1, String value2) {
       addCriterion("companyCode between", value1, value2, "companycode");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andCompanycodeNotBetween(String value1, String value2) {
       addCriterion("companyCode not between", value1, value2, "companycode");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andMailnoIsNull() {
       addCriterion("mailNo is null");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andMailnoIsNotNull() {
       addCriterion("mailNo is not null");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andMailnoEqualTo(String value) {
       addCriterion("mailNo =", value, "mailno");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andMailnoNotEqualTo(String value) {
       addCriterion("mailNo <>", value, "mailno");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andMailnoGreaterThan(String value) {
       addCriterion("mailNo >", value, "mailno");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andMailnoGreaterThanOrEqualTo(String value) {
       addCriterion("mailNo >=", value, "mailno");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andMailnoLessThan(String value) {
       addCriterion("mailNo <", value, "mailno");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andMailnoLessThanOrEqualTo(String value) {
       addCriterion("mailNo <=", value, "mailno");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andMailnoLike(String value) {
       addCriterion("mailNo like", value, "mailno");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andMailnoNotLike(String value) {
       addCriterion("mailNo not like", value, "mailno");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andMailnoIn(List<String> values) {
       addCriterion("mailNo in", values, "mailno");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andMailnoNotIn(List<String> values) {
       addCriterion("mailNo not in", values, "mailno");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andMailnoBetween(String value1, String value2) {
       addCriterion("mailNo between", value1, value2, "mailno");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andMailnoNotBetween(String value1, String value2) {
       addCriterion("mailNo not between", value1, value2, "mailno");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andSuppliesidIsNull() {
       addCriterion("suppliesId is null");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andSuppliesidIsNotNull() {
       addCriterion("suppliesId is not null");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andSuppliesidEqualTo(String value) {
       addCriterion("suppliesId =", value, "suppliesid");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andSuppliesidNotEqualTo(String value) {
       addCriterion("suppliesId <>", value, "suppliesid");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andSuppliesidGreaterThan(String value) {
       addCriterion("suppliesId >", value, "suppliesid");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andSuppliesidGreaterThanOrEqualTo(String value) {
       addCriterion("suppliesId >=", value, "suppliesid");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andSuppliesidLessThan(String value) {
       addCriterion("suppliesId <", value, "suppliesid");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andSuppliesidLessThanOrEqualTo(String value) {
       addCriterion("suppliesId <=", value, "suppliesid");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andSuppliesidLike(String value) {
       addCriterion("suppliesId like", value, "suppliesid");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andSuppliesidNotLike(String value) {
       addCriterion("suppliesId not like", value, "suppliesid");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andSuppliesidIn(List<String> values) {
       addCriterion("suppliesId in", values, "suppliesid");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andSuppliesidNotIn(List<String> values) {
       addCriterion("suppliesId not in", values, "suppliesid");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andSuppliesidBetween(String value1, String value2) {
       addCriterion("suppliesId between", value1, value2, "suppliesid");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andSuppliesidNotBetween(String value1, String value2) {
       addCriterion("suppliesId not between", value1, value2, "suppliesid");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andSuppliesnameIsNull() {
       addCriterion("suppliesName is null");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andSuppliesnameIsNotNull() {
       addCriterion("suppliesName is not null");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andSuppliesnameEqualTo(String value) {
       addCriterion("suppliesName =", value, "suppliesname");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andSuppliesnameNotEqualTo(String value) {
       addCriterion("suppliesName <>", value, "suppliesname");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andSuppliesnameGreaterThan(String value) {
       addCriterion("suppliesName >", value, "suppliesname");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andSuppliesnameGreaterThanOrEqualTo(String value) {
       addCriterion("suppliesName >=", value, "suppliesname");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andSuppliesnameLessThan(String value) {
       addCriterion("suppliesName <", value, "suppliesname");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andSuppliesnameLessThanOrEqualTo(String value) {
       addCriterion("suppliesName <=", value, "suppliesname");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andSuppliesnameLike(String value) {
       addCriterion("suppliesName like", value, "suppliesname");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andSuppliesnameNotLike(String value) {
       addCriterion("suppliesName not like", value, "suppliesname");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andSuppliesnameIn(List<String> values) {
       addCriterion("suppliesName in", values, "suppliesname");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andSuppliesnameNotIn(List<String> values) {
       addCriterion("suppliesName not in", values, "suppliesname");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andSuppliesnameBetween(String value1, String value2) {
       addCriterion("suppliesName between", value1, value2, "suppliesname");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andSuppliesnameNotBetween(String value1, String value2) {
       addCriterion("suppliesName not between", value1, value2, "suppliesname");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andPriceIsNull() {
       addCriterion("price is null");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andPriceIsNotNull() {
       addCriterion("price is not null");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andPriceEqualTo(Double value) {
       addCriterion("price =", value, "price");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andPriceNotEqualTo(Double value) {
       addCriterion("price <>", value, "price");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andPriceGreaterThan(Double value) {
       addCriterion("price >", value, "price");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andPriceGreaterThanOrEqualTo(Double value) {
       addCriterion("price >=", value, "price");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andPriceLessThan(Double value) {
       addCriterion("price <", value, "price");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andPriceLessThanOrEqualTo(Double value) {
       addCriterion("price <=", value, "price");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andPriceIn(List<Double> values) {
       addCriterion("price in", values, "price");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andPriceNotIn(List<Double> values) {
       addCriterion("price not in", values, "price");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andPriceBetween(Double value1, Double value2) {
       addCriterion("price between", value1, value2, "price");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andPriceNotBetween(Double value1, Double value2) {
       addCriterion("price not between", value1, value2, "price");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andNumberIsNull() {
       addCriterion("number is null");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andNumberIsNotNull() {
       addCriterion("number is not null");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andNumberEqualTo(Integer value) {
       addCriterion("number =", value, "number");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andNumberNotEqualTo(Integer value) {
       addCriterion("number <>", value, "number");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andNumberGreaterThan(Integer value) {
       addCriterion("number >", value, "number");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andNumberGreaterThanOrEqualTo(Integer value) {
       addCriterion("number >=", value, "number");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andNumberLessThan(Integer value) {
       addCriterion("number <", value, "number");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andNumberLessThanOrEqualTo(Integer value) {
       addCriterion("number <=", value, "number");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andNumberIn(List<Integer> values) {
       addCriterion("number in", values, "number");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andNumberNotIn(List<Integer> values) {
       addCriterion("number not in", values, "number");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andNumberBetween(Integer value1, Integer value2) {
       addCriterion("number between", value1, value2, "number");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andNumberNotBetween(Integer value1, Integer value2) {
       addCriterion("number not between", value1, value2, "number");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andMoneyIsNull() {
       addCriterion("money is null");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andMoneyIsNotNull() {
       addCriterion("money is not null");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andMoneyEqualTo(Double value) {
       addCriterion("money =", value, "money");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andMoneyNotEqualTo(Double value) {
       addCriterion("money <>", value, "money");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andMoneyGreaterThan(Double value) {
       addCriterion("money >", value, "money");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andMoneyGreaterThanOrEqualTo(Double value) {
       addCriterion("money >=", value, "money");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andMoneyLessThan(Double value) {
       addCriterion("money <", value, "money");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andMoneyLessThanOrEqualTo(Double value) {
       addCriterion("money <=", value, "money");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andMoneyIn(List<Double> values) {
       addCriterion("money in", values, "money");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andMoneyNotIn(List<Double> values) {
       addCriterion("money not in", values, "money");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andMoneyBetween(Double value1, Double value2) {
       addCriterion("money between", value1, value2, "money");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andMoneyNotBetween(Double value1, Double value2) {
       addCriterion("money not between", value1, value2, "money");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andBuytimeIsNull() {
       addCriterion("buyTime is null");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andBuytimeIsNotNull() {
       addCriterion("buyTime is not null");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andBuytimeEqualTo(Date value) {
       addCriterion("buyTime =", value, "buytime");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andBuytimeNotEqualTo(Date value) {
       addCriterion("buyTime <>", value, "buytime");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andBuytimeGreaterThan(Date value) {
       addCriterion("buyTime >", value, "buytime");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andBuytimeGreaterThanOrEqualTo(Date value) {
       addCriterion("buyTime >=", value, "buytime");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andBuytimeLessThan(Date value) {
       addCriterion("buyTime <", value, "buytime");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andBuytimeLessThanOrEqualTo(Date value) {
       addCriterion("buyTime <=", value, "buytime");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andBuytimeIn(List<Date> values) {
       addCriterion("buyTime in", values, "buytime");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andBuytimeNotIn(List<Date> values) {
       addCriterion("buyTime not in", values, "buytime");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andBuytimeBetween(Date value1, Date value2) {
       addCriterion("buyTime between", value1, value2, "buytime");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andBuytimeNotBetween(Date value1, Date value2) {
       addCriterion("buyTime not between", value1, value2, "buytime");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andTypeIsNull() {
       addCriterion("type is null");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andTypeIsNotNull() {
       addCriterion("type is not null");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andTypeEqualTo(Integer value) {
       addCriterion("type =", value, "type");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andTypeNotEqualTo(Integer value) {
       addCriterion("type <>", value, "type");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andTypeGreaterThan(Integer value) {
       addCriterion("type >", value, "type");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andTypeGreaterThanOrEqualTo(Integer value) {
       addCriterion("type >=", value, "type");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andTypeLessThan(Integer value) {
       addCriterion("type <", value, "type");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andTypeLessThanOrEqualTo(Integer value) {
       addCriterion("type <=", value, "type");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andTypeIn(List<Integer> values) {
       addCriterion("type in", values, "type");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andTypeNotIn(List<Integer> values) {
       addCriterion("type not in", values, "type");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andTypeBetween(Integer value1, Integer value2) {
       addCriterion("type between", value1, value2, "type");
       return (JsSuppliesSkuExample.Criteria)this;
     }
     
     public JsSuppliesSkuExample.Criteria andTypeNotBetween(Integer value1, Integer value2) {
       addCriterion("type not between", value1, value2, "type");
       return (JsSuppliesSkuExample.Criteria)this;
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


