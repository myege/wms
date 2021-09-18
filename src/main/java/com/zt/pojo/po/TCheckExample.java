 package com.zt.pojo.po;

 //import java.sql.Date;
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.Iterator;
 import java.util.List;




 public class TCheckExample
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
     protected List<TCheckExample.Criterion> criteria = new ArrayList<TCheckExample.Criterion>();


     public boolean isValid() {
       return (this.criteria.size() > 0);
     }

     public List<TCheckExample.Criterion> getAllCriteria() {
       return this.criteria;
     }

     public List<TCheckExample.Criterion> getCriteria() {
       return this.criteria;
     }

     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new TCheckExample.Criterion(condition));
     }

     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new TCheckExample.Criterion(condition, value));
     }

     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if (value1 == null || value2 == null) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new TCheckExample.Criterion(condition, value1, value2));
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

     public TCheckExample.Criteria andIdIsNull() {
       addCriterion("id is null");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andIdIsNotNull() {
       addCriterion("id is not null");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andIdEqualTo(Integer value) {
       addCriterion("id =", value, "id");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andIdNotEqualTo(Integer value) {
       addCriterion("id <>", value, "id");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andIdGreaterThan(Integer value) {
       addCriterion("id >", value, "id");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("id >=", value, "id");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andIdLessThan(Integer value) {
       addCriterion("id <", value, "id");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andIdLessThanOrEqualTo(Integer value) {
       addCriterion("id <=", value, "id");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andIdIn(List<Integer> values) {
       addCriterion("id in", values, "id");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andIdNotIn(List<Integer> values) {
       addCriterion("id not in", values, "id");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andIdBetween(Integer value1, Integer value2) {
       addCriterion("id between", value1, value2, "id");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
       addCriterion("id not between", value1, value2, "id");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andCompanycodeIsNull() {
       addCriterion("companycode is null");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andCompanycodeIsNotNull() {
       addCriterion("companycode is not null");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andCompanycodeEqualTo(String value) {
       addCriterion("companycode =", value, "companycode");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andCompanycodeNotEqualTo(String value) {
       addCriterion("companycode <>", value, "companycode");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andCompanycodeGreaterThan(String value) {
       addCriterion("companycode >", value, "companycode");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andCompanycodeGreaterThanOrEqualTo(String value) {
       addCriterion("companycode >=", value, "companycode");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andCompanycodeLessThan(String value) {
       addCriterion("companycode <", value, "companycode");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andCompanycodeLessThanOrEqualTo(String value) {
       addCriterion("companycode <=", value, "companycode");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andCompanycodeLike(String value) {
       addCriterion("companycode like", value, "companycode");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andCompanycodeNotLike(String value) {
       addCriterion("companycode not like", value, "companycode");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andCompanycodeIn(List<String> values) {
       addCriterion("companycode in", values, "companycode");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andCompanycodeNotIn(List<String> values) {
       addCriterion("companycode not in", values, "companycode");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andCompanycodeBetween(String value1, String value2) {
       addCriterion("companycode between", value1, value2, "companycode");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andCompanycodeNotBetween(String value1, String value2) {
       addCriterion("companycode not between", value1, value2, "companycode");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andItemnameIsNull() {
       addCriterion("itemname is null");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andItemnameIsNotNull() {
       addCriterion("itemname is not null");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andItemnameEqualTo(String value) {
       addCriterion("itemname =", value, "itemname");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andItemnameNotEqualTo(String value) {
       addCriterion("itemname <>", value, "itemname");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andItemnameGreaterThan(String value) {
       addCriterion("itemname >", value, "itemname");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andItemnameGreaterThanOrEqualTo(String value) {
       addCriterion("itemname >=", value, "itemname");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andItemnameLessThan(String value) {
       addCriterion("itemname <", value, "itemname");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andItemnameLessThanOrEqualTo(String value) {
       addCriterion("itemname <=", value, "itemname");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andItemnameLike(String value) {
       addCriterion("itemname like", value, "itemname");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andItemnameNotLike(String value) {
       addCriterion("itemname not like", value, "itemname");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andItemnameIn(List<String> values) {
       addCriterion("itemname in", values, "itemname");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andItemnameNotIn(List<String> values) {
       addCriterion("itemname not in", values, "itemname");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andItemnameBetween(String value1, String value2) {
       addCriterion("itemname between", value1, value2, "itemname");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andItemnameNotBetween(String value1, String value2) {
       addCriterion("itemname not between", value1, value2, "itemname");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andItemcodeIsNull() {
       addCriterion("itemcode is null");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andItemcodeIsNotNull() {
       addCriterion("itemcode is not null");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andItemcodeEqualTo(String value) {
       addCriterion("itemcode =", value, "itemcode");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andItemcodeNotEqualTo(String value) {
       addCriterion("itemcode <>", value, "itemcode");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andItemcodeGreaterThan(String value) {
       addCriterion("itemcode >", value, "itemcode");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andItemcodeGreaterThanOrEqualTo(String value) {
       addCriterion("itemcode >=", value, "itemcode");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andItemcodeLessThan(String value) {
       addCriterion("itemcode <", value, "itemcode");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andItemcodeLessThanOrEqualTo(String value) {
       addCriterion("itemcode <=", value, "itemcode");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andItemcodeLike(String value) {
       addCriterion("itemcode like", value, "itemcode");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andItemcodeNotLike(String value) {
       addCriterion("itemcode not like", value, "itemcode");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andItemcodeIn(List<String> values) {
       addCriterion("itemcode in", values, "itemcode");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andItemcodeNotIn(List<String> values) {
       addCriterion("itemcode not in", values, "itemcode");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andItemcodeBetween(String value1, String value2) {
       addCriterion("itemcode between", value1, value2, "itemcode");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andItemcodeNotBetween(String value1, String value2) {
       addCriterion("itemcode not between", value1, value2, "itemcode");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andItemskuIsNull() {
       addCriterion("itemsku is null");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andItemskuIsNotNull() {
       addCriterion("itemsku is not null");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andItemskuEqualTo(String value) {
       addCriterion("itemsku =", value, "itemsku");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andItemskuNotEqualTo(String value) {
       addCriterion("itemsku <>", value, "itemsku");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andItemskuGreaterThan(String value) {
       addCriterion("itemsku >", value, "itemsku");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andItemskuGreaterThanOrEqualTo(String value) {
       addCriterion("itemsku >=", value, "itemsku");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andItemskuLessThan(String value) {
       addCriterion("itemsku <", value, "itemsku");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andItemskuLessThanOrEqualTo(String value) {
       addCriterion("itemsku <=", value, "itemsku");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andItemskuLike(String value) {
       addCriterion("itemsku like", value, "itemsku");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andItemskuNotLike(String value) {
       addCriterion("itemsku not like", value, "itemsku");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andItemskuIn(List<String> values) {
       addCriterion("itemsku in", values, "itemsku");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andItemskuNotIn(List<String> values) {
       addCriterion("itemsku not in", values, "itemsku");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andItemskuBetween(String value1, String value2) {
       addCriterion("itemsku between", value1, value2, "itemsku");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andItemskuNotBetween(String value1, String value2) {
       addCriterion("itemsku not between", value1, value2, "itemsku");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andStorageIsNull() {
       addCriterion("storage is null");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andStorageIsNotNull() {
       addCriterion("storage is not null");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andStorageEqualTo(String value) {
       addCriterion("storage =", value, "storage");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andStorageNotEqualTo(String value) {
       addCriterion("storage <>", value, "storage");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andStorageGreaterThan(String value) {
       addCriterion("storage >", value, "storage");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andStorageGreaterThanOrEqualTo(String value) {
       addCriterion("storage >=", value, "storage");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andStorageLessThan(String value) {
       addCriterion("storage <", value, "storage");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andStorageLessThanOrEqualTo(String value) {
       addCriterion("storage <=", value, "storage");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andStorageLike(String value) {
       addCriterion("storage like", value, "storage");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andStorageNotLike(String value) {
       addCriterion("storage not like", value, "storage");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andStorageIn(List<String> values) {
       addCriterion("storage in", values, "storage");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andStorageNotIn(List<String> values) {
       addCriterion("storage not in", values, "storage");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andStorageBetween(String value1, String value2) {
       addCriterion("storage between", value1, value2, "storage");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andStorageNotBetween(String value1, String value2) {
       addCriterion("storage not between", value1, value2, "storage");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTinventoryIsNull() {
       addCriterion("tinventory is null");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTinventoryIsNotNull() {
       addCriterion("tinventory is not null");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTinventoryEqualTo(Integer value) {
       addCriterion("tinventory =", value, "tinventory");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTinventoryNotEqualTo(Integer value) {
       addCriterion("tinventory <>", value, "tinventory");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTinventoryGreaterThan(Integer value) {
       addCriterion("tinventory >", value, "tinventory");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTinventoryGreaterThanOrEqualTo(Integer value) {
       addCriterion("tinventory >=", value, "tinventory");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTinventoryLessThan(Integer value) {
       addCriterion("tinventory <", value, "tinventory");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTinventoryLessThanOrEqualTo(Integer value) {
       addCriterion("tinventory <=", value, "tinventory");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTinventoryIn(List<Integer> values) {
       addCriterion("tinventory in", values, "tinventory");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTinventoryNotIn(List<Integer> values) {
       addCriterion("tinventory not in", values, "tinventory");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTinventoryBetween(Integer value1, Integer value2) {
       addCriterion("tinventory between", value1, value2, "tinventory");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTinventoryNotBetween(Integer value1, Integer value2) {
       addCriterion("tinventory not between", value1, value2, "tinventory");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andInventoryIsNull() {
       addCriterion("inventory is null");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andInventoryIsNotNull() {
       addCriterion("inventory is not null");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andInventoryEqualTo(Integer value) {
       addCriterion("inventory =", value, "inventory");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andInventoryNotEqualTo(Integer value) {
       addCriterion("inventory <>", value, "inventory");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andInventoryGreaterThan(Integer value) {
       addCriterion("inventory >", value, "inventory");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andInventoryGreaterThanOrEqualTo(Integer value) {
       addCriterion("inventory >=", value, "inventory");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andInventoryLessThan(Integer value) {
       addCriterion("inventory <", value, "inventory");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andInventoryLessThanOrEqualTo(Integer value) {
       addCriterion("inventory <=", value, "inventory");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andInventoryIn(List<Integer> values) {
       addCriterion("inventory in", values, "inventory");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andInventoryNotIn(List<Integer> values) {
       addCriterion("inventory not in", values, "inventory");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andInventoryBetween(Integer value1, Integer value2) {
       addCriterion("inventory between", value1, value2, "inventory");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andInventoryNotBetween(Integer value1, Integer value2) {
       addCriterion("inventory not between", value1, value2, "inventory");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andIsdeleteIsNull() {
       addCriterion("isdelete is null");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andIsdeleteIsNotNull() {
       addCriterion("isdelete is not null");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andIsdeleteEqualTo(Integer value) {
       addCriterion("isdelete =", value, "isdelete");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andIsdeleteNotEqualTo(Integer value) {
       addCriterion("isdelete <>", value, "isdelete");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andIsdeleteGreaterThan(Integer value) {
       addCriterion("isdelete >", value, "isdelete");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andIsdeleteGreaterThanOrEqualTo(Integer value) {
       addCriterion("isdelete >=", value, "isdelete");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andIsdeleteLessThan(Integer value) {
       addCriterion("isdelete <", value, "isdelete");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andIsdeleteLessThanOrEqualTo(Integer value) {
       addCriterion("isdelete <=", value, "isdelete");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andIsdeleteIn(List<Integer> values) {
       addCriterion("isdelete in", values, "isdelete");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andIsdeleteNotIn(List<Integer> values) {
       addCriterion("isdelete not in", values, "isdelete");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andIsdeleteBetween(Integer value1, Integer value2) {
       addCriterion("isdelete between", value1, value2, "isdelete");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andIsdeleteNotBetween(Integer value1, Integer value2) {
       addCriterion("isdelete not between", value1, value2, "isdelete");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andCreatetimeIsNull() {
       addCriterion("createTime is null");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andCreatetimeIsNotNull() {
       addCriterion("createTime is not null");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andCreatetimeEqualTo(Date value) {
       addCriterionForJDBCDate("createTime =", value, "createtime");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andCreatetimeNotEqualTo(Date value) {
       addCriterionForJDBCDate("createTime <>", value, "createtime");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andCreatetimeGreaterThan(Date value) {
       addCriterionForJDBCDate("createTime >", value, "createtime");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
       addCriterionForJDBCDate("createTime >=", value, "createtime");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andCreatetimeLessThan(Date value) {
       addCriterionForJDBCDate("createTime <", value, "createtime");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andCreatetimeLessThanOrEqualTo(Date value) {
       addCriterionForJDBCDate("createTime <=", value, "createtime");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andCreatetimeIn(List<Date> values) {
       addCriterionForJDBCDate("createTime in", values, "createtime");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andCreatetimeNotIn(List<Date> values) {
       addCriterionForJDBCDate("createTime not in", values, "createtime");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andCreatetimeBetween(Date value1, Date value2) {
       addCriterionForJDBCDate("createTime between", value1, value2, "createtime");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andCreatetimeNotBetween(Date value1, Date value2) {
       addCriterionForJDBCDate("createTime not between", value1, value2, "createtime");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTnameIsNull() {
       addCriterion("tname is null");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTnameIsNotNull() {
       addCriterion("tname is not null");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTnameEqualTo(String value) {
       addCriterion("tname =", value, "tname");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTnameNotEqualTo(String value) {
       addCriterion("tname <>", value, "tname");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTnameGreaterThan(String value) {
       addCriterion("tname >", value, "tname");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTnameGreaterThanOrEqualTo(String value) {
       addCriterion("tname >=", value, "tname");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTnameLessThan(String value) {
       addCriterion("tname <", value, "tname");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTnameLessThanOrEqualTo(String value) {
       addCriterion("tname <=", value, "tname");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTnameLike(String value) {
       addCriterion("tname like", value, "tname");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTnameNotLike(String value) {
       addCriterion("tname not like", value, "tname");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTnameIn(List<String> values) {
       addCriterion("tname in", values, "tname");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTnameNotIn(List<String> values) {
       addCriterion("tname not in", values, "tname");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTnameBetween(String value1, String value2) {
       addCriterion("tname between", value1, value2, "tname");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTnameNotBetween(String value1, String value2) {
       addCriterion("tname not between", value1, value2, "tname");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTcodeIsNull() {
       addCriterion("tcode is null");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTcodeIsNotNull() {
       addCriterion("tcode is not null");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTcodeEqualTo(String value) {
       addCriterion("tcode =", value, "tcode");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTcodeNotEqualTo(String value) {
       addCriterion("tcode <>", value, "tcode");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTcodeGreaterThan(String value) {
       addCriterion("tcode >", value, "tcode");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTcodeGreaterThanOrEqualTo(String value) {
       addCriterion("tcode >=", value, "tcode");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTcodeLessThan(String value) {
       addCriterion("tcode <", value, "tcode");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTcodeLessThanOrEqualTo(String value) {
       addCriterion("tcode <=", value, "tcode");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTcodeLike(String value) {
       addCriterion("tcode like", value, "tcode");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTcodeNotLike(String value) {
       addCriterion("tcode not like", value, "tcode");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTcodeIn(List<String> values) {
       addCriterion("tcode in", values, "tcode");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTcodeNotIn(List<String> values) {
       addCriterion("tcode not in", values, "tcode");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTcodeBetween(String value1, String value2) {
       addCriterion("tcode between", value1, value2, "tcode");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTcodeNotBetween(String value1, String value2) {
       addCriterion("tcode not between", value1, value2, "tcode");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTskuIsNull() {
       addCriterion("tsku is null");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTskuIsNotNull() {
       addCriterion("tsku is not null");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTskuEqualTo(String value) {
       addCriterion("tsku =", value, "tsku");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTskuNotEqualTo(String value) {
       addCriterion("tsku <>", value, "tsku");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTskuGreaterThan(String value) {
       addCriterion("tsku >", value, "tsku");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTskuGreaterThanOrEqualTo(String value) {
       addCriterion("tsku >=", value, "tsku");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTskuLessThan(String value) {
       addCriterion("tsku <", value, "tsku");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTskuLessThanOrEqualTo(String value) {
       addCriterion("tsku <=", value, "tsku");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTskuLike(String value) {
       addCriterion("tsku like", value, "tsku");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTskuNotLike(String value) {
       addCriterion("tsku not like", value, "tsku");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTskuIn(List<String> values) {
       addCriterion("tsku in", values, "tsku");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTskuNotIn(List<String> values) {
       addCriterion("tsku not in", values, "tsku");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTskuBetween(String value1, String value2) {
       addCriterion("tsku between", value1, value2, "tsku");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTskuNotBetween(String value1, String value2) {
       addCriterion("tsku not between", value1, value2, "tsku");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTcompanyIsNull() {
       addCriterion("tcompany is null");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTcompanyIsNotNull() {
       addCriterion("tcompany is not null");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTcompanyEqualTo(String value) {
       addCriterion("tcompany =", value, "tcompany");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTcompanyNotEqualTo(String value) {
       addCriterion("tcompany <>", value, "tcompany");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTcompanyGreaterThan(String value) {
       addCriterion("tcompany >", value, "tcompany");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTcompanyGreaterThanOrEqualTo(String value) {
       addCriterion("tcompany >=", value, "tcompany");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTcompanyLessThan(String value) {
       addCriterion("tcompany <", value, "tcompany");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTcompanyLessThanOrEqualTo(String value) {
       addCriterion("tcompany <=", value, "tcompany");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTcompanyLike(String value) {
       addCriterion("tcompany like", value, "tcompany");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTcompanyNotLike(String value) {
       addCriterion("tcompany not like", value, "tcompany");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTcompanyIn(List<String> values) {
       addCriterion("tcompany in", values, "tcompany");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTcompanyNotIn(List<String> values) {
       addCriterion("tcompany not in", values, "tcompany");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTcompanyBetween(String value1, String value2) {
       addCriterion("tcompany between", value1, value2, "tcompany");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andTcompanyNotBetween(String value1, String value2) {
       addCriterion("tcompany not between", value1, value2, "tcompany");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andCodeIsNull() {
       addCriterion("code is null");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andCodeIsNotNull() {
       addCriterion("code is not null");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andCodeEqualTo(String value) {
       addCriterion("code =", value, "code");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andCodeNotEqualTo(String value) {
       addCriterion("code <>", value, "code");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andCodeGreaterThan(String value) {
       addCriterion("code >", value, "code");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andCodeGreaterThanOrEqualTo(String value) {
       addCriterion("code >=", value, "code");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andCodeLessThan(String value) {
       addCriterion("code <", value, "code");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andCodeLessThanOrEqualTo(String value) {
       addCriterion("code <=", value, "code");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andCodeLike(String value) {
       addCriterion("code like", value, "code");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andCodeNotLike(String value) {
       addCriterion("code not like", value, "code");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andCodeIn(List<String> values) {
       addCriterion("code in", values, "code");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andCodeNotIn(List<String> values) {
       addCriterion("code not in", values, "code");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andCodeBetween(String value1, String value2) {
       addCriterion("code between", value1, value2, "code");
       return (TCheckExample.Criteria)this;
     }

     public TCheckExample.Criteria andCodeNotBetween(String value1, String value2) {
       addCriterion("code not between", value1, value2, "code");
       return (TCheckExample.Criteria)this;
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



