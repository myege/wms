 package com.zt.pojo.po;

 //import java.sql.Date;
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.Iterator;
 import java.util.List;




 public class RShelvesExample
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
     protected List<RShelvesExample.Criterion> criteria = new ArrayList<RShelvesExample.Criterion>();


     public boolean isValid() {
       return (this.criteria.size() > 0);
     }

     public List<RShelvesExample.Criterion> getAllCriteria() {
       return this.criteria;
     }

     public List<RShelvesExample.Criterion> getCriteria() {
       return this.criteria;
     }

     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new RShelvesExample.Criterion(condition));
     }

     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new RShelvesExample.Criterion(condition, value));
     }

     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if (value1 == null || value2 == null) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new RShelvesExample.Criterion(condition, value1, value2));
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

     public RShelvesExample.Criteria andIdIsNull() {
       addCriterion("id is null");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andIdIsNotNull() {
       addCriterion("id is not null");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andIdEqualTo(Integer value) {
       addCriterion("id =", value, "id");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andIdNotEqualTo(Integer value) {
       addCriterion("id <>", value, "id");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andIdGreaterThan(Integer value) {
       addCriterion("id >", value, "id");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("id >=", value, "id");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andIdLessThan(Integer value) {
       addCriterion("id <", value, "id");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andIdLessThanOrEqualTo(Integer value) {
       addCriterion("id <=", value, "id");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andIdIn(List<Integer> values) {
       addCriterion("id in", values, "id");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andIdNotIn(List<Integer> values) {
       addCriterion("id not in", values, "id");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andIdBetween(Integer value1, Integer value2) {
       addCriterion("id between", value1, value2, "id");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
       addCriterion("id not between", value1, value2, "id");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andGodowndhIsNull() {
       addCriterion("godownDh is null");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andGodowndhIsNotNull() {
       addCriterion("godownDh is not null");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andGodowndhEqualTo(String value) {
       addCriterion("godownDh =", value, "godowndh");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andGodowndhNotEqualTo(String value) {
       addCriterion("godownDh <>", value, "godowndh");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andGodowndhGreaterThan(String value) {
       addCriterion("godownDh >", value, "godowndh");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andGodowndhGreaterThanOrEqualTo(String value) {
       addCriterion("godownDh >=", value, "godowndh");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andGodowndhLessThan(String value) {
       addCriterion("godownDh <", value, "godowndh");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andGodowndhLessThanOrEqualTo(String value) {
       addCriterion("godownDh <=", value, "godowndh");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andGodowndhLike(String value) {
       addCriterion("godownDh like", value, "godowndh");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andGodowndhNotLike(String value) {
       addCriterion("godownDh not like", value, "godowndh");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andGodowndhIn(List<String> values) {
       addCriterion("godownDh in", values, "godowndh");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andGodowndhNotIn(List<String> values) {
       addCriterion("godownDh not in", values, "godowndh");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andGodowndhBetween(String value1, String value2) {
       addCriterion("godownDh between", value1, value2, "godowndh");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andGodowndhNotBetween(String value1, String value2) {
       addCriterion("godownDh not between", value1, value2, "godowndh");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andCompanycodeIsNull() {
       addCriterion("companyCode is null");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andCompanycodeIsNotNull() {
       addCriterion("companyCode is not null");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andCompanycodeEqualTo(String value) {
       addCriterion("companyCode =", value, "companycode");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andCompanycodeNotEqualTo(String value) {
       addCriterion("companyCode <>", value, "companycode");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andCompanycodeGreaterThan(String value) {
       addCriterion("companyCode >", value, "companycode");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andCompanycodeGreaterThanOrEqualTo(String value) {
       addCriterion("companyCode >=", value, "companycode");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andCompanycodeLessThan(String value) {
       addCriterion("companyCode <", value, "companycode");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andCompanycodeLessThanOrEqualTo(String value) {
       addCriterion("companyCode <=", value, "companycode");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andCompanycodeLike(String value) {
       addCriterion("companyCode like", value, "companycode");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andCompanycodeNotLike(String value) {
       addCriterion("companyCode not like", value, "companycode");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andCompanycodeIn(List<String> values) {
       addCriterion("companyCode in", values, "companycode");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andCompanycodeNotIn(List<String> values) {
       addCriterion("companyCode not in", values, "companycode");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andCompanycodeBetween(String value1, String value2) {
       addCriterion("companyCode between", value1, value2, "companycode");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andCompanycodeNotBetween(String value1, String value2) {
       addCriterion("companyCode not between", value1, value2, "companycode");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andItemcodeIsNull() {
       addCriterion("itemCode is null");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andItemcodeIsNotNull() {
       addCriterion("itemCode is not null");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andItemcodeEqualTo(String value) {
       addCriterion("itemCode =", value, "itemcode");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andItemcodeNotEqualTo(String value) {
       addCriterion("itemCode <>", value, "itemcode");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andItemcodeGreaterThan(String value) {
       addCriterion("itemCode >", value, "itemcode");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andItemcodeGreaterThanOrEqualTo(String value) {
       addCriterion("itemCode >=", value, "itemcode");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andItemcodeLessThan(String value) {
       addCriterion("itemCode <", value, "itemcode");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andItemcodeLessThanOrEqualTo(String value) {
       addCriterion("itemCode <=", value, "itemcode");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andItemcodeLike(String value) {
       addCriterion("itemCode like", value, "itemcode");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andItemcodeNotLike(String value) {
       addCriterion("itemCode not like", value, "itemcode");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andItemcodeIn(List<String> values) {
       addCriterion("itemCode in", values, "itemcode");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andItemcodeNotIn(List<String> values) {
       addCriterion("itemCode not in", values, "itemcode");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andItemcodeBetween(String value1, String value2) {
       addCriterion("itemCode between", value1, value2, "itemcode");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andItemcodeNotBetween(String value1, String value2) {
       addCriterion("itemCode not between", value1, value2, "itemcode");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andSkuIsNull() {
       addCriterion("sku is null");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andSkuIsNotNull() {
       addCriterion("sku is not null");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andSkuEqualTo(String value) {
       addCriterion("sku =", value, "sku");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andSkuNotEqualTo(String value) {
       addCriterion("sku <>", value, "sku");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andSkuGreaterThan(String value) {
       addCriterion("sku >", value, "sku");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andSkuGreaterThanOrEqualTo(String value) {
       addCriterion("sku >=", value, "sku");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andSkuLessThan(String value) {
       addCriterion("sku <", value, "sku");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andSkuLessThanOrEqualTo(String value) {
       addCriterion("sku <=", value, "sku");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andSkuLike(String value) {
       addCriterion("sku like", value, "sku");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andSkuNotLike(String value) {
       addCriterion("sku not like", value, "sku");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andSkuIn(List<String> values) {
       addCriterion("sku in", values, "sku");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andSkuNotIn(List<String> values) {
       addCriterion("sku not in", values, "sku");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andSkuBetween(String value1, String value2) {
       addCriterion("sku between", value1, value2, "sku");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andSkuNotBetween(String value1, String value2) {
       addCriterion("sku not between", value1, value2, "sku");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andSumIsNull() {
       addCriterion("sum is null");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andSumIsNotNull() {
       addCriterion("sum is not null");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andSumEqualTo(Integer value) {
       addCriterion("sum =", value, "sum");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andSumNotEqualTo(Integer value) {
       addCriterion("sum <>", value, "sum");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andSumGreaterThan(Integer value) {
       addCriterion("sum >", value, "sum");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andSumGreaterThanOrEqualTo(Integer value) {
       addCriterion("sum >=", value, "sum");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andSumLessThan(Integer value) {
       addCriterion("sum <", value, "sum");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andSumLessThanOrEqualTo(Integer value) {
       addCriterion("sum <=", value, "sum");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andSumIn(List<Integer> values) {
       addCriterion("sum in", values, "sum");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andSumNotIn(List<Integer> values) {
       addCriterion("sum not in", values, "sum");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andSumBetween(Integer value1, Integer value2) {
       addCriterion("sum between", value1, value2, "sum");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andSumNotBetween(Integer value1, Integer value2) {
       addCriterion("sum not between", value1, value2, "sum");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andBetterusedataIsNull() {
       addCriterion("betterUseData is null");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andBetterusedataIsNotNull() {
       addCriterion("betterUseData is not null");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andBetterusedataEqualTo(Date value) {
       addCriterionForJDBCDate("betterUseData =", value, "betterusedata");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andBetterusedataNotEqualTo(Date value) {
       addCriterionForJDBCDate("betterUseData <>", value, "betterusedata");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andBetterusedataGreaterThan(Date value) {
       addCriterionForJDBCDate("betterUseData >", value, "betterusedata");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andBetterusedataGreaterThanOrEqualTo(Date value) {
       addCriterionForJDBCDate("betterUseData >=", value, "betterusedata");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andBetterusedataLessThan(Date value) {
       addCriterionForJDBCDate("betterUseData <", value, "betterusedata");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andBetterusedataLessThanOrEqualTo(Date value) {
       addCriterionForJDBCDate("betterUseData <=", value, "betterusedata");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andBetterusedataIn(List<Date> values) {
       addCriterionForJDBCDate("betterUseData in", values, "betterusedata");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andBetterusedataNotIn(List<Date> values) {
       addCriterionForJDBCDate("betterUseData not in", values, "betterusedata");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andBetterusedataBetween(Date value1, Date value2) {
       addCriterionForJDBCDate("betterUseData between", value1, value2, "betterusedata");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andBetterusedataNotBetween(Date value1, Date value2) {
       addCriterionForJDBCDate("betterUseData not between", value1, value2, "betterusedata");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andReceiptnameIsNull() {
       addCriterion("receiptName is null");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andReceiptnameIsNotNull() {
       addCriterion("receiptName is not null");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andReceiptnameEqualTo(String value) {
       addCriterion("receiptName =", value, "receiptname");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andReceiptnameNotEqualTo(String value) {
       addCriterion("receiptName <>", value, "receiptname");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andReceiptnameGreaterThan(String value) {
       addCriterion("receiptName >", value, "receiptname");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andReceiptnameGreaterThanOrEqualTo(String value) {
       addCriterion("receiptName >=", value, "receiptname");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andReceiptnameLessThan(String value) {
       addCriterion("receiptName <", value, "receiptname");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andReceiptnameLessThanOrEqualTo(String value) {
       addCriterion("receiptName <=", value, "receiptname");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andReceiptnameLike(String value) {
       addCriterion("receiptName like", value, "receiptname");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andReceiptnameNotLike(String value) {
       addCriterion("receiptName not like", value, "receiptname");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andReceiptnameIn(List<String> values) {
       addCriterion("receiptName in", values, "receiptname");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andReceiptnameNotIn(List<String> values) {
       addCriterion("receiptName not in", values, "receiptname");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andReceiptnameBetween(String value1, String value2) {
       addCriterion("receiptName between", value1, value2, "receiptname");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andReceiptnameNotBetween(String value1, String value2) {
       addCriterion("receiptName not between", value1, value2, "receiptname");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andShelvedateIsNull() {
       addCriterion("shelveDate is null");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andShelvedateIsNotNull() {
       addCriterion("shelveDate is not null");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andShelvedateEqualTo(Date value) {
       addCriterion("shelveDate =", value, "shelvedate");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andShelvedateNotEqualTo(Date value) {
       addCriterion("shelveDate <>", value, "shelvedate");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andShelvedateGreaterThan(Date value) {
       addCriterion("shelveDate >", value, "shelvedate");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andShelvedateGreaterThanOrEqualTo(Date value) {
       addCriterion("shelveDate >=", value, "shelvedate");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andShelvedateLessThan(Date value) {
       addCriterion("shelveDate <", value, "shelvedate");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andShelvedateLessThanOrEqualTo(Date value) {
       addCriterion("shelveDate <=", value, "shelvedate");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andShelvedateIn(List<Date> values) {
       addCriterion("shelveDate in", values, "shelvedate");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andShelvedateNotIn(List<Date> values) {
       addCriterion("shelveDate not in", values, "shelvedate");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andShelvedateBetween(Date value1, Date value2) {
       addCriterion("shelveDate between", value1, value2, "shelvedate");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andShelvedateNotBetween(Date value1, Date value2) {
       addCriterion("shelveDate not between", value1, value2, "shelvedate");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andNameIsNull() {
       addCriterion("name is null");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andNameIsNotNull() {
       addCriterion("name is not null");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andNameEqualTo(String value) {
       addCriterion("name =", value, "name");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andNameNotEqualTo(String value) {
       addCriterion("name <>", value, "name");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andNameGreaterThan(String value) {
       addCriterion("name >", value, "name");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andNameGreaterThanOrEqualTo(String value) {
       addCriterion("name >=", value, "name");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andNameLessThan(String value) {
       addCriterion("name <", value, "name");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andNameLessThanOrEqualTo(String value) {
       addCriterion("name <=", value, "name");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andNameLike(String value) {
       addCriterion("name like", value, "name");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andNameNotLike(String value) {
       addCriterion("name not like", value, "name");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andNameIn(List<String> values) {
       addCriterion("name in", values, "name");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andNameNotIn(List<String> values) {
       addCriterion("name not in", values, "name");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andNameBetween(String value1, String value2) {
       addCriterion("name between", value1, value2, "name");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andNameNotBetween(String value1, String value2) {
       addCriterion("name not between", value1, value2, "name");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andItemnameIsNull() {
       addCriterion("itemName is null");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andItemnameIsNotNull() {
       addCriterion("itemName is not null");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andItemnameEqualTo(String value) {
       addCriterion("itemName =", value, "itemname");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andItemnameNotEqualTo(String value) {
       addCriterion("itemName <>", value, "itemname");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andItemnameGreaterThan(String value) {
       addCriterion("itemName >", value, "itemname");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andItemnameGreaterThanOrEqualTo(String value) {
       addCriterion("itemName >=", value, "itemname");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andItemnameLessThan(String value) {
       addCriterion("itemName <", value, "itemname");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andItemnameLessThanOrEqualTo(String value) {
       addCriterion("itemName <=", value, "itemname");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andItemnameLike(String value) {
       addCriterion("itemName like", value, "itemname");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andItemnameNotLike(String value) {
       addCriterion("itemName not like", value, "itemname");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andItemnameIn(List<String> values) {
       addCriterion("itemName in", values, "itemname");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andItemnameNotIn(List<String> values) {
       addCriterion("itemName not in", values, "itemname");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andItemnameBetween(String value1, String value2) {
       addCriterion("itemName between", value1, value2, "itemname");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andItemnameNotBetween(String value1, String value2) {
       addCriterion("itemName not between", value1, value2, "itemname");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andTypeIsNull() {
       addCriterion("type is null");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andTypeIsNotNull() {
       addCriterion("type is not null");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andTypeEqualTo(Integer value) {
       addCriterion("type =", value, "type");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andTypeNotEqualTo(Integer value) {
       addCriterion("type <>", value, "type");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andTypeGreaterThan(Integer value) {
       addCriterion("type >", value, "type");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andTypeGreaterThanOrEqualTo(Integer value) {
       addCriterion("type >=", value, "type");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andTypeLessThan(Integer value) {
       addCriterion("type <", value, "type");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andTypeLessThanOrEqualTo(Integer value) {
       addCriterion("type <=", value, "type");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andTypeIn(List<Integer> values) {
       addCriterion("type in", values, "type");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andTypeNotIn(List<Integer> values) {
       addCriterion("type not in", values, "type");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andTypeBetween(Integer value1, Integer value2) {
       addCriterion("type between", value1, value2, "type");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andTypeNotBetween(Integer value1, Integer value2) {
       addCriterion("type not between", value1, value2, "type");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andTostorageIsNull() {
       addCriterion("toStorage is null");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andTostorageIsNotNull() {
       addCriterion("toStorage is not null");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andTostorageEqualTo(String value) {
       addCriterion("toStorage =", value, "tostorage");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andTostorageNotEqualTo(String value) {
       addCriterion("toStorage <>", value, "tostorage");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andTostorageGreaterThan(String value) {
       addCriterion("toStorage >", value, "tostorage");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andTostorageGreaterThanOrEqualTo(String value) {
       addCriterion("toStorage >=", value, "tostorage");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andTostorageLessThan(String value) {
       addCriterion("toStorage <", value, "tostorage");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andTostorageLessThanOrEqualTo(String value) {
       addCriterion("toStorage <=", value, "tostorage");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andTostorageLike(String value) {
       addCriterion("toStorage like", value, "tostorage");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andTostorageNotLike(String value) {
       addCriterion("toStorage not like", value, "tostorage");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andTostorageIn(List<String> values) {
       addCriterion("toStorage in", values, "tostorage");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andTostorageNotIn(List<String> values) {
       addCriterion("toStorage not in", values, "tostorage");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andTostorageBetween(String value1, String value2) {
       addCriterion("toStorage between", value1, value2, "tostorage");
       return (RShelvesExample.Criteria)this;
     }

     public RShelvesExample.Criteria andTostorageNotBetween(String value1, String value2) {
       addCriterion("toStorage not between", value1, value2, "tostorage");
       return (RShelvesExample.Criteria)this;
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



