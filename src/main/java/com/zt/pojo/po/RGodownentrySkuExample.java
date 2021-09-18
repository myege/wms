 package com.zt.pojo.po;

 //import java.sql.Date;
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.Iterator;
 import java.util.List;




 public class RGodownentrySkuExample
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
     protected List<RGodownentrySkuExample.Criterion> criteria = new ArrayList<RGodownentrySkuExample.Criterion>();


     public boolean isValid() {
       return (this.criteria.size() > 0);
     }

     public List<RGodownentrySkuExample.Criterion> getAllCriteria() {
       return this.criteria;
     }

     public List<RGodownentrySkuExample.Criterion> getCriteria() {
       return this.criteria;
     }

     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new RGodownentrySkuExample.Criterion(condition));
     }

     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new RGodownentrySkuExample.Criterion(condition, value));
     }

     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if (value1 == null || value2 == null) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new RGodownentrySkuExample.Criterion(condition, value1, value2));
     }

     protected void addCriterionForJDBCDate(String condition, Date value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       addCriterion(condition, new Date(value.getTime()), property);
     }

     protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
       if (values == null || values.size() == 0) {
         throw new RuntimeException("Value list for " + property + " cannot be null or empty");
       }
       List<Date> dateList = new ArrayList<Date>();
       Iterator<Date> iter = values.iterator();
       while (iter.hasNext()) {
         dateList.add(new Date(((Date)iter.next()).getTime()));
       }
       addCriterion(condition, dateList, property);
     }

     protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
       if (value1 == null || value2 == null) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       addCriterion(condition, new Date(value1.getTime()), new Date(value2.getTime()), property);
     }

     public RGodownentrySkuExample.Criteria andIdIsNull() {
       addCriterion("id is null");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andIdIsNotNull() {
       addCriterion("id is not null");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andIdEqualTo(Integer value) {
       addCriterion("id =", value, "id");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andIdNotEqualTo(Integer value) {
       addCriterion("id <>", value, "id");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andIdGreaterThan(Integer value) {
       addCriterion("id >", value, "id");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("id >=", value, "id");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andIdLessThan(Integer value) {
       addCriterion("id <", value, "id");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andIdLessThanOrEqualTo(Integer value) {
       addCriterion("id <=", value, "id");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andIdIn(List<Integer> values) {
       addCriterion("id in", values, "id");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andIdNotIn(List<Integer> values) {
       addCriterion("id not in", values, "id");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andIdBetween(Integer value1, Integer value2) {
       addCriterion("id between", value1, value2, "id");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
       addCriterion("id not between", value1, value2, "id");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andGodowndhIsNull() {
       addCriterion("godownDh is null");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andGodowndhIsNotNull() {
       addCriterion("godownDh is not null");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andGodowndhEqualTo(String value) {
       addCriterion("godownDh =", value, "godowndh");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andGodowndhNotEqualTo(String value) {
       addCriterion("godownDh <>", value, "godowndh");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andGodowndhGreaterThan(String value) {
       addCriterion("godownDh >", value, "godowndh");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andGodowndhGreaterThanOrEqualTo(String value) {
       addCriterion("godownDh >=", value, "godowndh");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andGodowndhLessThan(String value) {
       addCriterion("godownDh <", value, "godowndh");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andGodowndhLessThanOrEqualTo(String value) {
       addCriterion("godownDh <=", value, "godowndh");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andGodowndhLike(String value) {
       addCriterion("godownDh like", value, "godowndh");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andGodowndhNotLike(String value) {
       addCriterion("godownDh not like", value, "godowndh");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andGodowndhIn(List<String> values) {
       addCriterion("godownDh in", values, "godowndh");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andGodowndhNotIn(List<String> values) {
       addCriterion("godownDh not in", values, "godowndh");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andGodowndhBetween(String value1, String value2) {
       addCriterion("godownDh between", value1, value2, "godowndh");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andGodowndhNotBetween(String value1, String value2) {
       addCriterion("godownDh not between", value1, value2, "godowndh");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andCompanycodeIsNull() {
       addCriterion("companyCode is null");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andCompanycodeIsNotNull() {
       addCriterion("companyCode is not null");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andCompanycodeEqualTo(String value) {
       addCriterion("companyCode =", value, "companycode");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andCompanycodeNotEqualTo(String value) {
       addCriterion("companyCode <>", value, "companycode");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andCompanycodeGreaterThan(String value) {
       addCriterion("companyCode >", value, "companycode");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andCompanycodeGreaterThanOrEqualTo(String value) {
       addCriterion("companyCode >=", value, "companycode");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andCompanycodeLessThan(String value) {
       addCriterion("companyCode <", value, "companycode");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andCompanycodeLessThanOrEqualTo(String value) {
       addCriterion("companyCode <=", value, "companycode");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andCompanycodeLike(String value) {
       addCriterion("companyCode like", value, "companycode");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andCompanycodeNotLike(String value) {
       addCriterion("companyCode not like", value, "companycode");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andCompanycodeIn(List<String> values) {
       addCriterion("companyCode in", values, "companycode");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andCompanycodeNotIn(List<String> values) {
       addCriterion("companyCode not in", values, "companycode");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andCompanycodeBetween(String value1, String value2) {
       addCriterion("companyCode between", value1, value2, "companycode");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andCompanycodeNotBetween(String value1, String value2) {
       addCriterion("companyCode not between", value1, value2, "companycode");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andItemcodeIsNull() {
       addCriterion("itemCode is null");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andItemcodeIsNotNull() {
       addCriterion("itemCode is not null");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andItemcodeEqualTo(String value) {
       addCriterion("itemCode =", value, "itemcode");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andItemcodeNotEqualTo(String value) {
       addCriterion("itemCode <>", value, "itemcode");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andItemcodeGreaterThan(String value) {
       addCriterion("itemCode >", value, "itemcode");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andItemcodeGreaterThanOrEqualTo(String value) {
       addCriterion("itemCode >=", value, "itemcode");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andItemcodeLessThan(String value) {
       addCriterion("itemCode <", value, "itemcode");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andItemcodeLessThanOrEqualTo(String value) {
       addCriterion("itemCode <=", value, "itemcode");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andItemcodeLike(String value) {
       addCriterion("itemCode like", value, "itemcode");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andItemcodeNotLike(String value) {
       addCriterion("itemCode not like", value, "itemcode");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andItemcodeIn(List<String> values) {
       addCriterion("itemCode in", values, "itemcode");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andItemcodeNotIn(List<String> values) {
       addCriterion("itemCode not in", values, "itemcode");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andItemcodeBetween(String value1, String value2) {
       addCriterion("itemCode between", value1, value2, "itemcode");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andItemcodeNotBetween(String value1, String value2) {
       addCriterion("itemCode not between", value1, value2, "itemcode");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andSkuIsNull() {
       addCriterion("sku is null");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andSkuIsNotNull() {
       addCriterion("sku is not null");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andSkuEqualTo(String value) {
       addCriterion("sku =", value, "sku");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andSkuNotEqualTo(String value) {
       addCriterion("sku <>", value, "sku");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andSkuGreaterThan(String value) {
       addCriterion("sku >", value, "sku");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andSkuGreaterThanOrEqualTo(String value) {
       addCriterion("sku >=", value, "sku");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andSkuLessThan(String value) {
       addCriterion("sku <", value, "sku");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andSkuLessThanOrEqualTo(String value) {
       addCriterion("sku <=", value, "sku");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andSkuLike(String value) {
       addCriterion("sku like", value, "sku");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andSkuNotLike(String value) {
       addCriterion("sku not like", value, "sku");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andSkuIn(List<String> values) {
       addCriterion("sku in", values, "sku");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andSkuNotIn(List<String> values) {
       addCriterion("sku not in", values, "sku");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andSkuBetween(String value1, String value2) {
       addCriterion("sku between", value1, value2, "sku");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andSkuNotBetween(String value1, String value2) {
       addCriterion("sku not between", value1, value2, "sku");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andSumIsNull() {
       addCriterion("sum is null");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andSumIsNotNull() {
       addCriterion("sum is not null");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andSumEqualTo(Integer value) {
       addCriterion("sum =", value, "sum");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andSumNotEqualTo(Integer value) {
       addCriterion("sum <>", value, "sum");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andSumGreaterThan(Integer value) {
       addCriterion("sum >", value, "sum");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andSumGreaterThanOrEqualTo(Integer value) {
       addCriterion("sum >=", value, "sum");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andSumLessThan(Integer value) {
       addCriterion("sum <", value, "sum");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andSumLessThanOrEqualTo(Integer value) {
       addCriterion("sum <=", value, "sum");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andSumIn(List<Integer> values) {
       addCriterion("sum in", values, "sum");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andSumNotIn(List<Integer> values) {
       addCriterion("sum not in", values, "sum");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andSumBetween(Integer value1, Integer value2) {
       addCriterion("sum between", value1, value2, "sum");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andSumNotBetween(Integer value1, Integer value2) {
       addCriterion("sum not between", value1, value2, "sum");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andBetterusedataIsNull() {
       addCriterion("betterUseData is null");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andBetterusedataIsNotNull() {
       addCriterion("betterUseData is not null");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andBetterusedataEqualTo(Date value) {
       addCriterionForJDBCDate("betterUseData =", value, "betterusedata");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andBetterusedataNotEqualTo(Date value) {
       addCriterionForJDBCDate("betterUseData <>", value, "betterusedata");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andBetterusedataGreaterThan(Date value) {
       addCriterionForJDBCDate("betterUseData >", value, "betterusedata");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andBetterusedataGreaterThanOrEqualTo(Date value) {
       addCriterionForJDBCDate("betterUseData >=", value, "betterusedata");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andBetterusedataLessThan(Date value) {
       addCriterionForJDBCDate("betterUseData <", value, "betterusedata");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andBetterusedataLessThanOrEqualTo(Date value) {
       addCriterionForJDBCDate("betterUseData <=", value, "betterusedata");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andBetterusedataIn(List<Date> values) {
       addCriterionForJDBCDate("betterUseData in", values, "betterusedata");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andBetterusedataNotIn(List<Date> values) {
       addCriterionForJDBCDate("betterUseData not in", values, "betterusedata");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andBetterusedataBetween(Date value1, Date value2) {
       addCriterionForJDBCDate("betterUseData between", value1, value2, "betterusedata");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andBetterusedataNotBetween(Date value1, Date value2) {
       addCriterionForJDBCDate("betterUseData not between", value1, value2, "betterusedata");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andItemnameIsNull() {
       addCriterion("itemName is null");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andItemnameIsNotNull() {
       addCriterion("itemName is not null");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andItemnameEqualTo(String value) {
       addCriterion("itemName =", value, "itemname");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andItemnameNotEqualTo(String value) {
       addCriterion("itemName <>", value, "itemname");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andItemnameGreaterThan(String value) {
       addCriterion("itemName >", value, "itemname");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andItemnameGreaterThanOrEqualTo(String value) {
       addCriterion("itemName >=", value, "itemname");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andItemnameLessThan(String value) {
       addCriterion("itemName <", value, "itemname");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andItemnameLessThanOrEqualTo(String value) {
       addCriterion("itemName <=", value, "itemname");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andItemnameLike(String value) {
       addCriterion("itemName like", value, "itemname");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andItemnameNotLike(String value) {
       addCriterion("itemName not like", value, "itemname");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andItemnameIn(List<String> values) {
       addCriterion("itemName in", values, "itemname");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andItemnameNotIn(List<String> values) {
       addCriterion("itemName not in", values, "itemname");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andItemnameBetween(String value1, String value2) {
       addCriterion("itemName between", value1, value2, "itemname");
       return (RGodownentrySkuExample.Criteria)this;
     }

     public RGodownentrySkuExample.Criteria andItemnameNotBetween(String value1, String value2) {
       addCriterion("itemName not between", value1, value2, "itemname");
       return (RGodownentrySkuExample.Criteria)this;
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



