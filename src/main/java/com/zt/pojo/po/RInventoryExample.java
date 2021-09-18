 package com.zt.pojo.po;

 //import java.sql.Date;
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.Iterator;
 import java.util.List;




 public class RInventoryExample
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
     protected List<RInventoryExample.Criterion> criteria = new ArrayList<RInventoryExample.Criterion>();


     public boolean isValid() {
       return (this.criteria.size() > 0);
     }

     public List<RInventoryExample.Criterion> getAllCriteria() {
       return this.criteria;
     }

     public List<RInventoryExample.Criterion> getCriteria() {
       return this.criteria;
     }

     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new RInventoryExample.Criterion(condition));
     }

     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new RInventoryExample.Criterion(condition, value));
     }

     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if (value1 == null || value2 == null) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new RInventoryExample.Criterion(condition, value1, value2));
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

     public RInventoryExample.Criteria andIdIsNull() {
       addCriterion("id is null");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andIdIsNotNull() {
       addCriterion("id is not null");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andIdEqualTo(Integer value) {
       addCriterion("id =", value, "id");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andIdNotEqualTo(Integer value) {
       addCriterion("id <>", value, "id");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andIdGreaterThan(Integer value) {
       addCriterion("id >", value, "id");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("id >=", value, "id");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andIdLessThan(Integer value) {
       addCriterion("id <", value, "id");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andIdLessThanOrEqualTo(Integer value) {
       addCriterion("id <=", value, "id");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andIdIn(List<Integer> values) {
       addCriterion("id in", values, "id");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andIdNotIn(List<Integer> values) {
       addCriterion("id not in", values, "id");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andIdBetween(Integer value1, Integer value2) {
       addCriterion("id between", value1, value2, "id");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
       addCriterion("id not between", value1, value2, "id");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andCompanycodeIsNull() {
       addCriterion("companyCode is null");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andCompanycodeIsNotNull() {
       addCriterion("companyCode is not null");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andCompanycodeEqualTo(String value) {
       addCriterion("companyCode =", value, "companycode");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andCompanycodeNotEqualTo(String value) {
       addCriterion("companyCode <>", value, "companycode");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andCompanycodeGreaterThan(String value) {
       addCriterion("companyCode >", value, "companycode");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andCompanycodeGreaterThanOrEqualTo(String value) {
       addCriterion("companyCode >=", value, "companycode");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andCompanycodeLessThan(String value) {
       addCriterion("companyCode <", value, "companycode");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andCompanycodeLessThanOrEqualTo(String value) {
       addCriterion("companyCode <=", value, "companycode");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andCompanycodeLike(String value) {
       addCriterion("companyCode like", value, "companycode");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andCompanycodeNotLike(String value) {
       addCriterion("companyCode not like", value, "companycode");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andCompanycodeIn(List<String> values) {
       addCriterion("companyCode in", values, "companycode");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andCompanycodeNotIn(List<String> values) {
       addCriterion("companyCode not in", values, "companycode");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andCompanycodeBetween(String value1, String value2) {
       addCriterion("companyCode between", value1, value2, "companycode");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andCompanycodeNotBetween(String value1, String value2) {
       addCriterion("companyCode not between", value1, value2, "companycode");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andItemnameIsNull() {
       addCriterion("itemName is null");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andItemnameIsNotNull() {
       addCriterion("itemName is not null");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andItemnameEqualTo(String value) {
       addCriterion("itemName =", value, "itemname");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andItemnameNotEqualTo(String value) {
       addCriterion("itemName <>", value, "itemname");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andItemnameGreaterThan(String value) {
       addCriterion("itemName >", value, "itemname");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andItemnameGreaterThanOrEqualTo(String value) {
       addCriterion("itemName >=", value, "itemname");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andItemnameLessThan(String value) {
       addCriterion("itemName <", value, "itemname");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andItemnameLessThanOrEqualTo(String value) {
       addCriterion("itemName <=", value, "itemname");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andItemnameLike(String value) {
       addCriterion("itemName like", value, "itemname");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andItemnameNotLike(String value) {
       addCriterion("itemName not like", value, "itemname");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andItemnameIn(List<String> values) {
       addCriterion("itemName in", values, "itemname");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andItemnameNotIn(List<String> values) {
       addCriterion("itemName not in", values, "itemname");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andItemnameBetween(String value1, String value2) {
       addCriterion("itemName between", value1, value2, "itemname");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andItemnameNotBetween(String value1, String value2) {
       addCriterion("itemName not between", value1, value2, "itemname");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andItemcodeIsNull() {
       addCriterion("itemCode is null");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andItemcodeIsNotNull() {
       addCriterion("itemCode is not null");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andItemcodeEqualTo(String value) {
       addCriterion("itemCode =", value, "itemcode");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andItemcodeNotEqualTo(String value) {
       addCriterion("itemCode <>", value, "itemcode");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andItemcodeGreaterThan(String value) {
       addCriterion("itemCode >", value, "itemcode");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andItemcodeGreaterThanOrEqualTo(String value) {
       addCriterion("itemCode >=", value, "itemcode");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andItemcodeLessThan(String value) {
       addCriterion("itemCode <", value, "itemcode");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andItemcodeLessThanOrEqualTo(String value) {
       addCriterion("itemCode <=", value, "itemcode");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andItemcodeLike(String value) {
       addCriterion("itemCode like", value, "itemcode");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andItemcodeNotLike(String value) {
       addCriterion("itemCode not like", value, "itemcode");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andItemcodeIn(List<String> values) {
       addCriterion("itemCode in", values, "itemcode");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andItemcodeNotIn(List<String> values) {
       addCriterion("itemCode not in", values, "itemcode");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andItemcodeBetween(String value1, String value2) {
       addCriterion("itemCode between", value1, value2, "itemcode");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andItemcodeNotBetween(String value1, String value2) {
       addCriterion("itemCode not between", value1, value2, "itemcode");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andStorageIsNull() {
       addCriterion("storage is null");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andStorageIsNotNull() {
       addCriterion("storage is not null");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andStorageEqualTo(String value) {
       addCriterion("storage =", value, "storage");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andStorageNotEqualTo(String value) {
       addCriterion("storage <>", value, "storage");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andStorageGreaterThan(String value) {
       addCriterion("storage >", value, "storage");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andStorageGreaterThanOrEqualTo(String value) {
       addCriterion("storage >=", value, "storage");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andStorageLessThan(String value) {
       addCriterion("storage <", value, "storage");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andStorageLessThanOrEqualTo(String value) {
       addCriterion("storage <=", value, "storage");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andStorageLike(String value) {
       addCriterion("storage like", value, "storage");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andStorageNotLike(String value) {
       addCriterion("storage not like", value, "storage");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andStorageIn(List<String> values) {
       addCriterion("storage in", values, "storage");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andStorageNotIn(List<String> values) {
       addCriterion("storage not in", values, "storage");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andStorageBetween(String value1, String value2) {
       addCriterion("storage between", value1, value2, "storage");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andStorageNotBetween(String value1, String value2) {
       addCriterion("storage not between", value1, value2, "storage");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andSumIsNull() {
       addCriterion("sum is null");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andSumIsNotNull() {
       addCriterion("sum is not null");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andSumEqualTo(Integer value) {
       addCriterion("sum =", value, "sum");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andSumNotEqualTo(Integer value) {
       addCriterion("sum <>", value, "sum");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andSumGreaterThan(Integer value) {
       addCriterion("sum >", value, "sum");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andSumGreaterThanOrEqualTo(Integer value) {
       addCriterion("sum >=", value, "sum");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andSumLessThan(Integer value) {
       addCriterion("sum <", value, "sum");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andSumLessThanOrEqualTo(Integer value) {
       addCriterion("sum <=", value, "sum");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andSumIn(List<Integer> values) {
       addCriterion("sum in", values, "sum");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andSumNotIn(List<Integer> values) {
       addCriterion("sum not in", values, "sum");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andSumBetween(Integer value1, Integer value2) {
       addCriterion("sum between", value1, value2, "sum");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andSumNotBetween(Integer value1, Integer value2) {
       addCriterion("sum not between", value1, value2, "sum");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andInventoryIsNull() {
       addCriterion("inventory is null");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andInventoryIsNotNull() {
       addCriterion("inventory is not null");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andInventoryEqualTo(Integer value) {
       addCriterion("inventory =", value, "inventory");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andInventoryNotEqualTo(Integer value) {
       addCriterion("inventory <>", value, "inventory");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andInventoryGreaterThan(Integer value) {
       addCriterion("inventory >", value, "inventory");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andInventoryGreaterThanOrEqualTo(Integer value) {
       addCriterion("inventory >=", value, "inventory");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andInventoryLessThan(Integer value) {
       addCriterion("inventory <", value, "inventory");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andInventoryLessThanOrEqualTo(Integer value) {
       addCriterion("inventory <=", value, "inventory");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andInventoryIn(List<Integer> values) {
       addCriterion("inventory in", values, "inventory");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andInventoryNotIn(List<Integer> values) {
       addCriterion("inventory not in", values, "inventory");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andInventoryBetween(Integer value1, Integer value2) {
       addCriterion("inventory between", value1, value2, "inventory");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andInventoryNotBetween(Integer value1, Integer value2) {
       addCriterion("inventory not between", value1, value2, "inventory");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andInventoryoccupyIsNull() {
       addCriterion("InventoryOccupy is null");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andInventoryoccupyIsNotNull() {
       addCriterion("InventoryOccupy is not null");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andInventoryoccupyEqualTo(Integer value) {
       addCriterion("InventoryOccupy =", value, "inventoryoccupy");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andInventoryoccupyNotEqualTo(Integer value) {
       addCriterion("InventoryOccupy <>", value, "inventoryoccupy");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andInventoryoccupyGreaterThan(Integer value) {
       addCriterion("InventoryOccupy >", value, "inventoryoccupy");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andInventoryoccupyGreaterThanOrEqualTo(Integer value) {
       addCriterion("InventoryOccupy >=", value, "inventoryoccupy");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andInventoryoccupyLessThan(Integer value) {
       addCriterion("InventoryOccupy <", value, "inventoryoccupy");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andInventoryoccupyLessThanOrEqualTo(Integer value) {
       addCriterion("InventoryOccupy <=", value, "inventoryoccupy");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andInventoryoccupyIn(List<Integer> values) {
       addCriterion("InventoryOccupy in", values, "inventoryoccupy");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andInventoryoccupyNotIn(List<Integer> values) {
       addCriterion("InventoryOccupy not in", values, "inventoryoccupy");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andInventoryoccupyBetween(Integer value1, Integer value2) {
       addCriterion("InventoryOccupy between", value1, value2, "inventoryoccupy");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andInventoryoccupyNotBetween(Integer value1, Integer value2) {
       addCriterion("InventoryOccupy not between", value1, value2, "inventoryoccupy");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andInventoryfrozenIsNull() {
       addCriterion("InventoryFrozen is null");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andInventoryfrozenIsNotNull() {
       addCriterion("InventoryFrozen is not null");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andInventoryfrozenEqualTo(Integer value) {
       addCriterion("InventoryFrozen =", value, "inventoryfrozen");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andInventoryfrozenNotEqualTo(Integer value) {
       addCriterion("InventoryFrozen <>", value, "inventoryfrozen");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andInventoryfrozenGreaterThan(Integer value) {
       addCriterion("InventoryFrozen >", value, "inventoryfrozen");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andInventoryfrozenGreaterThanOrEqualTo(Integer value) {
       addCriterion("InventoryFrozen >=", value, "inventoryfrozen");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andInventoryfrozenLessThan(Integer value) {
       addCriterion("InventoryFrozen <", value, "inventoryfrozen");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andInventoryfrozenLessThanOrEqualTo(Integer value) {
       addCriterion("InventoryFrozen <=", value, "inventoryfrozen");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andInventoryfrozenIn(List<Integer> values) {
       addCriterion("InventoryFrozen in", values, "inventoryfrozen");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andInventoryfrozenNotIn(List<Integer> values) {
       addCriterion("InventoryFrozen not in", values, "inventoryfrozen");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andInventoryfrozenBetween(Integer value1, Integer value2) {
       addCriterion("InventoryFrozen between", value1, value2, "inventoryfrozen");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andInventoryfrozenNotBetween(Integer value1, Integer value2) {
       addCriterion("InventoryFrozen not between", value1, value2, "inventoryfrozen");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andTypeIsNull() {
       addCriterion("type is null");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andTypeIsNotNull() {
       addCriterion("type is not null");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andTypeEqualTo(String value) {
       addCriterion("type =", value, "type");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andTypeNotEqualTo(String value) {
       addCriterion("type <>", value, "type");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andTypeGreaterThan(String value) {
       addCriterion("type >", value, "type");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andTypeGreaterThanOrEqualTo(String value) {
       addCriterion("type >=", value, "type");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andTypeLessThan(String value) {
       addCriterion("type <", value, "type");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andTypeLessThanOrEqualTo(String value) {
       addCriterion("type <=", value, "type");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andTypeLike(String value) {
       addCriterion("type like", value, "type");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andTypeNotLike(String value) {
       addCriterion("type not like", value, "type");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andTypeIn(List<String> values) {
       addCriterion("type in", values, "type");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andTypeNotIn(List<String> values) {
       addCriterion("type not in", values, "type");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andTypeBetween(String value1, String value2) {
       addCriterion("type between", value1, value2, "type");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andTypeNotBetween(String value1, String value2) {
       addCriterion("type not between", value1, value2, "type");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andBetterusedataIsNull() {
       addCriterion("betterUseData is null");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andBetterusedataIsNotNull() {
       addCriterion("betterUseData is not null");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andBetterusedataEqualTo(Date value) {
       addCriterionForJDBCDate("betterUseData =", value, "betterusedata");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andBetterusedataNotEqualTo(Date value) {
       addCriterionForJDBCDate("betterUseData <>", value, "betterusedata");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andBetterusedataGreaterThan(Date value) {
       addCriterionForJDBCDate("betterUseData >", value, "betterusedata");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andBetterusedataGreaterThanOrEqualTo(Date value) {
       addCriterionForJDBCDate("betterUseData >=", value, "betterusedata");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andBetterusedataLessThan(Date value) {
       addCriterionForJDBCDate("betterUseData <", value, "betterusedata");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andBetterusedataLessThanOrEqualTo(Date value) {
       addCriterionForJDBCDate("betterUseData <=", value, "betterusedata");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andBetterusedataIn(List<Date> values) {
       addCriterionForJDBCDate("betterUseData in", values, "betterusedata");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andBetterusedataNotIn(List<Date> values) {
       addCriterionForJDBCDate("betterUseData not in", values, "betterusedata");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andBetterusedataBetween(Date value1, Date value2) {
       addCriterionForJDBCDate("betterUseData between", value1, value2, "betterusedata");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andBetterusedataNotBetween(Date value1, Date value2) {
       addCriterionForJDBCDate("betterUseData not between", value1, value2, "betterusedata");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andOmwtypeIsNull() {
       addCriterion("omwtype is null");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andOmwtypeIsNotNull() {
       addCriterion("omwtype is not null");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andOmwtypeEqualTo(Integer value) {
       addCriterion("omwtype =", value, "omwtype");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andOmwtypeNotEqualTo(Integer value) {
       addCriterion("omwtype <>", value, "omwtype");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andOmwtypeGreaterThan(Integer value) {
       addCriterion("omwtype >", value, "omwtype");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andOmwtypeGreaterThanOrEqualTo(Integer value) {
       addCriterion("omwtype >=", value, "omwtype");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andOmwtypeLessThan(Integer value) {
       addCriterion("omwtype <", value, "omwtype");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andOmwtypeLessThanOrEqualTo(Integer value) {
       addCriterion("omwtype <=", value, "omwtype");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andOmwtypeIn(List<Integer> values) {
       addCriterion("omwtype in", values, "omwtype");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andOmwtypeNotIn(List<Integer> values) {
       addCriterion("omwtype not in", values, "omwtype");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andOmwtypeBetween(Integer value1, Integer value2) {
       addCriterion("omwtype between", value1, value2, "omwtype");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andOmwtypeNotBetween(Integer value1, Integer value2) {
       addCriterion("omwtype not between", value1, value2, "omwtype");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andItemskuIsNull() {
       addCriterion("itemSku is null");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andItemskuIsNotNull() {
       addCriterion("itemSku is not null");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andItemskuEqualTo(String value) {
       addCriterion("itemSku =", value, "itemsku");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andItemskuNotEqualTo(String value) {
       addCriterion("itemSku <>", value, "itemsku");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andItemskuGreaterThan(String value) {
       addCriterion("itemSku >", value, "itemsku");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andItemskuGreaterThanOrEqualTo(String value) {
       addCriterion("itemSku >=", value, "itemsku");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andItemskuLessThan(String value) {
       addCriterion("itemSku <", value, "itemsku");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andItemskuLessThanOrEqualTo(String value) {
       addCriterion("itemSku <=", value, "itemsku");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andItemskuLike(String value) {
       addCriterion("itemSku like", value, "itemsku");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andItemskuNotLike(String value) {
       addCriterion("itemSku not like", value, "itemsku");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andItemskuIn(List<String> values) {
       addCriterion("itemSku in", values, "itemsku");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andItemskuNotIn(List<String> values) {
       addCriterion("itemSku not in", values, "itemsku");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andItemskuBetween(String value1, String value2) {
       addCriterion("itemSku between", value1, value2, "itemsku");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andItemskuNotBetween(String value1, String value2) {
       addCriterion("itemSku not between", value1, value2, "itemsku");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andSortIsNull() {
       addCriterion("sort is null");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andSortIsNotNull() {
       addCriterion("sort is not null");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andSortEqualTo(Integer value) {
       addCriterion("sort =", value, "sort");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andSortNotEqualTo(Integer value) {
       addCriterion("sort <>", value, "sort");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andSortGreaterThan(Integer value) {
       addCriterion("sort >", value, "sort");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andSortGreaterThanOrEqualTo(Integer value) {
       addCriterion("sort >=", value, "sort");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andSortLessThan(Integer value) {
       addCriterion("sort <", value, "sort");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andSortLessThanOrEqualTo(Integer value) {
       addCriterion("sort <=", value, "sort");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andSortIn(List<Integer> values) {
       addCriterion("sort in", values, "sort");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andSortNotIn(List<Integer> values) {
       addCriterion("sort not in", values, "sort");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andSortBetween(Integer value1, Integer value2) {
       addCriterion("sort between", value1, value2, "sort");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andSortNotBetween(Integer value1, Integer value2) {
       addCriterion("sort not between", value1, value2, "sort");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andDefectiveIsNull() {
       addCriterion("defective is null");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andDefectiveIsNotNull() {
       addCriterion("defective is not null");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andDefectiveEqualTo(Integer value) {
       addCriterion("defective =", value, "defective");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andDefectiveNotEqualTo(Integer value) {
       addCriterion("defective <>", value, "defective");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andDefectiveGreaterThan(Integer value) {
       addCriterion("defective >", value, "defective");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andDefectiveGreaterThanOrEqualTo(Integer value) {
       addCriterion("defective >=", value, "defective");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andDefectiveLessThan(Integer value) {
       addCriterion("defective <", value, "defective");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andDefectiveLessThanOrEqualTo(Integer value) {
       addCriterion("defective <=", value, "defective");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andDefectiveIn(List<Integer> values) {
       addCriterion("defective in", values, "defective");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andDefectiveNotIn(List<Integer> values) {
       addCriterion("defective not in", values, "defective");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andDefectiveBetween(Integer value1, Integer value2) {
       addCriterion("defective between", value1, value2, "defective");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andDefectiveNotBetween(Integer value1, Integer value2) {
       addCriterion("defective not between", value1, value2, "defective");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andShiftIsNull() {
       addCriterion("shift is null");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andShiftIsNotNull() {
       addCriterion("shift is not null");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andShiftEqualTo(Integer value) {
       addCriterion("shift =", value, "shift");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andShiftNotEqualTo(Integer value) {
       addCriterion("shift <>", value, "shift");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andShiftGreaterThan(Integer value) {
       addCriterion("shift >", value, "shift");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andShiftGreaterThanOrEqualTo(Integer value) {
       addCriterion("shift >=", value, "shift");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andShiftLessThan(Integer value) {
       addCriterion("shift <", value, "shift");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andShiftLessThanOrEqualTo(Integer value) {
       addCriterion("shift <=", value, "shift");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andShiftIn(List<Integer> values) {
       addCriterion("shift in", values, "shift");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andShiftNotIn(List<Integer> values) {
       addCriterion("shift not in", values, "shift");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andShiftBetween(Integer value1, Integer value2) {
       addCriterion("shift between", value1, value2, "shift");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andShiftNotBetween(Integer value1, Integer value2) {
       addCriterion("shift not between", value1, value2, "shift");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andIspushdefectsIsNull() {
       addCriterion("isPushDefects is null");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andIspushdefectsIsNotNull() {
       addCriterion("isPushDefects is not null");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andIspushdefectsEqualTo(Integer value) {
       addCriterion("isPushDefects =", value, "ispushdefects");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andIspushdefectsNotEqualTo(Integer value) {
       addCriterion("isPushDefects <>", value, "ispushdefects");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andIspushdefectsGreaterThan(Integer value) {
       addCriterion("isPushDefects >", value, "ispushdefects");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andIspushdefectsGreaterThanOrEqualTo(Integer value) {
       addCriterion("isPushDefects >=", value, "ispushdefects");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andIspushdefectsLessThan(Integer value) {
       addCriterion("isPushDefects <", value, "ispushdefects");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andIspushdefectsLessThanOrEqualTo(Integer value) {
       addCriterion("isPushDefects <=", value, "ispushdefects");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andIspushdefectsIn(List<Integer> values) {
       addCriterion("isPushDefects in", values, "ispushdefects");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andIspushdefectsNotIn(List<Integer> values) {
       addCriterion("isPushDefects not in", values, "ispushdefects");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andIspushdefectsBetween(Integer value1, Integer value2) {
       addCriterion("isPushDefects between", value1, value2, "ispushdefects");
       return (RInventoryExample.Criteria)this;
     }

     public RInventoryExample.Criteria andIspushdefectsNotBetween(Integer value1, Integer value2) {
       addCriterion("isPushDefects not between", value1, value2, "ispushdefects");
       return (RInventoryExample.Criteria)this;
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



