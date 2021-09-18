 package com.zt.pojo.po;

 //import java.sql.Date;
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.Iterator;
 import java.util.List;




 public class RPlangodownentrySkuExample
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
     protected List<RPlangodownentrySkuExample.Criterion> criteria = new ArrayList<RPlangodownentrySkuExample.Criterion>();


     public boolean isValid() {
       return (this.criteria.size() > 0);
     }

     public List<RPlangodownentrySkuExample.Criterion> getAllCriteria() {
       return this.criteria;
     }

     public List<RPlangodownentrySkuExample.Criterion> getCriteria() {
       return this.criteria;
     }

     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new RPlangodownentrySkuExample.Criterion(condition));
     }

     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new RPlangodownentrySkuExample.Criterion(condition, value));
     }

     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if (value1 == null || value2 == null) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new RPlangodownentrySkuExample.Criterion(condition, value1, value2));
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

     public RPlangodownentrySkuExample.Criteria andIdIsNull() {
       addCriterion("id is null");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andIdIsNotNull() {
       addCriterion("id is not null");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andIdEqualTo(Integer value) {
       addCriterion("id =", value, "id");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andIdNotEqualTo(Integer value) {
       addCriterion("id <>", value, "id");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andIdGreaterThan(Integer value) {
       addCriterion("id >", value, "id");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("id >=", value, "id");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andIdLessThan(Integer value) {
       addCriterion("id <", value, "id");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andIdLessThanOrEqualTo(Integer value) {
       addCriterion("id <=", value, "id");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andIdIn(List<Integer> values) {
       addCriterion("id in", values, "id");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andIdNotIn(List<Integer> values) {
       addCriterion("id not in", values, "id");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andIdBetween(Integer value1, Integer value2) {
       addCriterion("id between", value1, value2, "id");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
       addCriterion("id not between", value1, value2, "id");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andGodowndhIsNull() {
       addCriterion("godownDh is null");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andGodowndhIsNotNull() {
       addCriterion("godownDh is not null");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andGodowndhEqualTo(String value) {
       addCriterion("godownDh =", value, "godowndh");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andGodowndhNotEqualTo(String value) {
       addCriterion("godownDh <>", value, "godowndh");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andGodowndhGreaterThan(String value) {
       addCriterion("godownDh >", value, "godowndh");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andGodowndhGreaterThanOrEqualTo(String value) {
       addCriterion("godownDh >=", value, "godowndh");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andGodowndhLessThan(String value) {
       addCriterion("godownDh <", value, "godowndh");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andGodowndhLessThanOrEqualTo(String value) {
       addCriterion("godownDh <=", value, "godowndh");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andGodowndhLike(String value) {
       addCriterion("godownDh like", value, "godowndh");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andGodowndhNotLike(String value) {
       addCriterion("godownDh not like", value, "godowndh");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andGodowndhIn(List<String> values) {
       addCriterion("godownDh in", values, "godowndh");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andGodowndhNotIn(List<String> values) {
       addCriterion("godownDh not in", values, "godowndh");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andGodowndhBetween(String value1, String value2) {
       addCriterion("godownDh between", value1, value2, "godowndh");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andGodowndhNotBetween(String value1, String value2) {
       addCriterion("godownDh not between", value1, value2, "godowndh");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andCompanycodeIsNull() {
       addCriterion("companyCode is null");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andCompanycodeIsNotNull() {
       addCriterion("companyCode is not null");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andCompanycodeEqualTo(String value) {
       addCriterion("companyCode =", value, "companycode");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andCompanycodeNotEqualTo(String value) {
       addCriterion("companyCode <>", value, "companycode");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andCompanycodeGreaterThan(String value) {
       addCriterion("companyCode >", value, "companycode");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andCompanycodeGreaterThanOrEqualTo(String value) {
       addCriterion("companyCode >=", value, "companycode");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andCompanycodeLessThan(String value) {
       addCriterion("companyCode <", value, "companycode");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andCompanycodeLessThanOrEqualTo(String value) {
       addCriterion("companyCode <=", value, "companycode");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andCompanycodeLike(String value) {
       addCriterion("companyCode like", value, "companycode");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andCompanycodeNotLike(String value) {
       addCriterion("companyCode not like", value, "companycode");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andCompanycodeIn(List<String> values) {
       addCriterion("companyCode in", values, "companycode");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andCompanycodeNotIn(List<String> values) {
       addCriterion("companyCode not in", values, "companycode");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andCompanycodeBetween(String value1, String value2) {
       addCriterion("companyCode between", value1, value2, "companycode");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andCompanycodeNotBetween(String value1, String value2) {
       addCriterion("companyCode not between", value1, value2, "companycode");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andItemcodeIsNull() {
       addCriterion("itemCode is null");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andItemcodeIsNotNull() {
       addCriterion("itemCode is not null");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andItemcodeEqualTo(String value) {
       addCriterion("itemCode =", value, "itemcode");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andItemcodeNotEqualTo(String value) {
       addCriterion("itemCode <>", value, "itemcode");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andItemcodeGreaterThan(String value) {
       addCriterion("itemCode >", value, "itemcode");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andItemcodeGreaterThanOrEqualTo(String value) {
       addCriterion("itemCode >=", value, "itemcode");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andItemcodeLessThan(String value) {
       addCriterion("itemCode <", value, "itemcode");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andItemcodeLessThanOrEqualTo(String value) {
       addCriterion("itemCode <=", value, "itemcode");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andItemcodeLike(String value) {
       addCriterion("itemCode like", value, "itemcode");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andItemcodeNotLike(String value) {
       addCriterion("itemCode not like", value, "itemcode");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andItemcodeIn(List<String> values) {
       addCriterion("itemCode in", values, "itemcode");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andItemcodeNotIn(List<String> values) {
       addCriterion("itemCode not in", values, "itemcode");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andItemcodeBetween(String value1, String value2) {
       addCriterion("itemCode between", value1, value2, "itemcode");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andItemcodeNotBetween(String value1, String value2) {
       addCriterion("itemCode not between", value1, value2, "itemcode");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andSkuIsNull() {
       addCriterion("sku is null");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andSkuIsNotNull() {
       addCriterion("sku is not null");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andSkuEqualTo(String value) {
       addCriterion("sku =", value, "sku");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andSkuNotEqualTo(String value) {
       addCriterion("sku <>", value, "sku");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andSkuGreaterThan(String value) {
       addCriterion("sku >", value, "sku");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andSkuGreaterThanOrEqualTo(String value) {
       addCriterion("sku >=", value, "sku");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andSkuLessThan(String value) {
       addCriterion("sku <", value, "sku");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andSkuLessThanOrEqualTo(String value) {
       addCriterion("sku <=", value, "sku");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andSkuLike(String value) {
       addCriterion("sku like", value, "sku");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andSkuNotLike(String value) {
       addCriterion("sku not like", value, "sku");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andSkuIn(List<String> values) {
       addCriterion("sku in", values, "sku");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andSkuNotIn(List<String> values) {
       addCriterion("sku not in", values, "sku");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andSkuBetween(String value1, String value2) {
       addCriterion("sku between", value1, value2, "sku");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andSkuNotBetween(String value1, String value2) {
       addCriterion("sku not between", value1, value2, "sku");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andSumIsNull() {
       addCriterion("sum is null");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andSumIsNotNull() {
       addCriterion("sum is not null");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andSumEqualTo(Integer value) {
       addCriterion("sum =", value, "sum");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andSumNotEqualTo(Integer value) {
       addCriterion("sum <>", value, "sum");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andSumGreaterThan(Integer value) {
       addCriterion("sum >", value, "sum");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andSumGreaterThanOrEqualTo(Integer value) {
       addCriterion("sum >=", value, "sum");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andSumLessThan(Integer value) {
       addCriterion("sum <", value, "sum");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andSumLessThanOrEqualTo(Integer value) {
       addCriterion("sum <=", value, "sum");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andSumIn(List<Integer> values) {
       addCriterion("sum in", values, "sum");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andSumNotIn(List<Integer> values) {
       addCriterion("sum not in", values, "sum");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andSumBetween(Integer value1, Integer value2) {
       addCriterion("sum between", value1, value2, "sum");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andSumNotBetween(Integer value1, Integer value2) {
       addCriterion("sum not between", value1, value2, "sum");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andBetterusedataIsNull() {
       addCriterion("betterUseData is null");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andBetterusedataIsNotNull() {
       addCriterion("betterUseData is not null");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andBetterusedataEqualTo(Date value) {
       addCriterionForJDBCDate("betterUseData =", value, "betterusedata");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andBetterusedataNotEqualTo(Date value) {
       addCriterionForJDBCDate("betterUseData <>", value, "betterusedata");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andBetterusedataGreaterThan(Date value) {
       addCriterionForJDBCDate("betterUseData >", value, "betterusedata");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andBetterusedataGreaterThanOrEqualTo(Date value) {
       addCriterionForJDBCDate("betterUseData >=", value, "betterusedata");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andBetterusedataLessThan(Date value) {
       addCriterionForJDBCDate("betterUseData <", value, "betterusedata");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andBetterusedataLessThanOrEqualTo(Date value) {
       addCriterionForJDBCDate("betterUseData <=", value, "betterusedata");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andBetterusedataIn(List<Date> values) {
       addCriterionForJDBCDate("betterUseData in", values, "betterusedata");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andBetterusedataNotIn(List<Date> values) {
       addCriterionForJDBCDate("betterUseData not in", values, "betterusedata");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andBetterusedataBetween(Date value1, Date value2) {
       addCriterionForJDBCDate("betterUseData between", value1, value2, "betterusedata");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andBetterusedataNotBetween(Date value1, Date value2) {
       addCriterionForJDBCDate("betterUseData not between", value1, value2, "betterusedata");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andItemnameIsNull() {
       addCriterion("itemName is null");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andItemnameIsNotNull() {
       addCriterion("itemName is not null");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andItemnameEqualTo(String value) {
       addCriterion("itemName =", value, "itemname");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andItemnameNotEqualTo(String value) {
       addCriterion("itemName <>", value, "itemname");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andItemnameGreaterThan(String value) {
       addCriterion("itemName >", value, "itemname");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andItemnameGreaterThanOrEqualTo(String value) {
       addCriterion("itemName >=", value, "itemname");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andItemnameLessThan(String value) {
       addCriterion("itemName <", value, "itemname");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andItemnameLessThanOrEqualTo(String value) {
       addCriterion("itemName <=", value, "itemname");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andItemnameLike(String value) {
       addCriterion("itemName like", value, "itemname");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andItemnameNotLike(String value) {
       addCriterion("itemName not like", value, "itemname");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andItemnameIn(List<String> values) {
       addCriterion("itemName in", values, "itemname");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andItemnameNotIn(List<String> values) {
       addCriterion("itemName not in", values, "itemname");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andItemnameBetween(String value1, String value2) {
       addCriterion("itemName between", value1, value2, "itemname");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andItemnameNotBetween(String value1, String value2) {
       addCriterion("itemName not between", value1, value2, "itemname");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andTruesumIsNull() {
       addCriterion("trueSum is null");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andTruesumIsNotNull() {
       addCriterion("trueSum is not null");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andTruesumEqualTo(Integer value) {
       addCriterion("trueSum =", value, "truesum");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andTruesumNotEqualTo(Integer value) {
       addCriterion("trueSum <>", value, "truesum");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andTruesumGreaterThan(Integer value) {
       addCriterion("trueSum >", value, "truesum");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andTruesumGreaterThanOrEqualTo(Integer value) {
       addCriterion("trueSum >=", value, "truesum");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andTruesumLessThan(Integer value) {
       addCriterion("trueSum <", value, "truesum");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andTruesumLessThanOrEqualTo(Integer value) {
       addCriterion("trueSum <=", value, "truesum");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andTruesumIn(List<Integer> values) {
       addCriterion("trueSum in", values, "truesum");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andTruesumNotIn(List<Integer> values) {
       addCriterion("trueSum not in", values, "truesum");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andTruesumBetween(Integer value1, Integer value2) {
       addCriterion("trueSum between", value1, value2, "truesum");
       return (RPlangodownentrySkuExample.Criteria)this;
     }

     public RPlangodownentrySkuExample.Criteria andTruesumNotBetween(Integer value1, Integer value2) {
       addCriterion("trueSum not between", value1, value2, "truesum");
       return (RPlangodownentrySkuExample.Criteria)this;
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



