 package com.zt.pojo.po;
 
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 public class TOrderBatchPickListExample
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
     protected List<TOrderBatchPickListExample.Criterion> criteria = new ArrayList<TOrderBatchPickListExample.Criterion>();
 
     
     public boolean isValid() {
       return (this.criteria.size() > 0);
     }
     
     public List<TOrderBatchPickListExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
     
     public List<TOrderBatchPickListExample.Criterion> getCriteria() {
       return this.criteria;
     }
     
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new TOrderBatchPickListExample.Criterion(condition));
     }
     
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new TOrderBatchPickListExample.Criterion(condition, value));
     }
     
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if (value1 == null || value2 == null) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new TOrderBatchPickListExample.Criterion(condition, value1, value2));
     }
     
     public TOrderBatchPickListExample.Criteria andIdIsNull() {
       addCriterion("id is null");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andIdIsNotNull() {
       addCriterion("id is not null");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andIdEqualTo(Integer value) {
       addCriterion("id =", value, "id");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andIdNotEqualTo(Integer value) {
       addCriterion("id <>", value, "id");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andIdGreaterThan(Integer value) {
       addCriterion("id >", value, "id");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("id >=", value, "id");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andIdLessThan(Integer value) {
       addCriterion("id <", value, "id");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andIdLessThanOrEqualTo(Integer value) {
       addCriterion("id <=", value, "id");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andIdIn(List<Integer> values) {
       addCriterion("id in", values, "id");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andIdNotIn(List<Integer> values) {
       addCriterion("id not in", values, "id");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andIdBetween(Integer value1, Integer value2) {
       addCriterion("id between", value1, value2, "id");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
       addCriterion("id not between", value1, value2, "id");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andOrdernoIsNull() {
       addCriterion("orderNo is null");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andOrdernoIsNotNull() {
       addCriterion("orderNo is not null");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andOrdernoEqualTo(String value) {
       addCriterion("orderNo =", value, "orderno");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andOrdernoNotEqualTo(String value) {
       addCriterion("orderNo <>", value, "orderno");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andOrdernoGreaterThan(String value) {
       addCriterion("orderNo >", value, "orderno");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andOrdernoGreaterThanOrEqualTo(String value) {
       addCriterion("orderNo >=", value, "orderno");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andOrdernoLessThan(String value) {
       addCriterion("orderNo <", value, "orderno");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andOrdernoLessThanOrEqualTo(String value) {
       addCriterion("orderNo <=", value, "orderno");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andOrdernoLike(String value) {
       addCriterion("orderNo like", value, "orderno");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andOrdernoNotLike(String value) {
       addCriterion("orderNo not like", value, "orderno");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andOrdernoIn(List<String> values) {
       addCriterion("orderNo in", values, "orderno");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andOrdernoNotIn(List<String> values) {
       addCriterion("orderNo not in", values, "orderno");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andOrdernoBetween(String value1, String value2) {
       addCriterion("orderNo between", value1, value2, "orderno");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andOrdernoNotBetween(String value1, String value2) {
       addCriterion("orderNo not between", value1, value2, "orderno");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andMailnoIsNull() {
       addCriterion("mailNo is null");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andMailnoIsNotNull() {
       addCriterion("mailNo is not null");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andMailnoEqualTo(String value) {
       addCriterion("mailNo =", value, "mailno");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andMailnoNotEqualTo(String value) {
       addCriterion("mailNo <>", value, "mailno");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andMailnoGreaterThan(String value) {
       addCriterion("mailNo >", value, "mailno");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andMailnoGreaterThanOrEqualTo(String value) {
       addCriterion("mailNo >=", value, "mailno");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andMailnoLessThan(String value) {
       addCriterion("mailNo <", value, "mailno");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andMailnoLessThanOrEqualTo(String value) {
       addCriterion("mailNo <=", value, "mailno");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andMailnoLike(String value) {
       addCriterion("mailNo like", value, "mailno");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andMailnoNotLike(String value) {
       addCriterion("mailNo not like", value, "mailno");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andMailnoIn(List<String> values) {
       addCriterion("mailNo in", values, "mailno");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andMailnoNotIn(List<String> values) {
       addCriterion("mailNo not in", values, "mailno");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andMailnoBetween(String value1, String value2) {
       addCriterion("mailNo between", value1, value2, "mailno");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andMailnoNotBetween(String value1, String value2) {
       addCriterion("mailNo not between", value1, value2, "mailno");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andBatchnoIsNull() {
       addCriterion("batchNo is null");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andBatchnoIsNotNull() {
       addCriterion("batchNo is not null");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andBatchnoEqualTo(String value) {
       addCriterion("batchNo =", value, "batchno");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andBatchnoNotEqualTo(String value) {
       addCriterion("batchNo <>", value, "batchno");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andBatchnoGreaterThan(String value) {
       addCriterion("batchNo >", value, "batchno");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andBatchnoGreaterThanOrEqualTo(String value) {
       addCriterion("batchNo >=", value, "batchno");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andBatchnoLessThan(String value) {
       addCriterion("batchNo <", value, "batchno");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andBatchnoLessThanOrEqualTo(String value) {
       addCriterion("batchNo <=", value, "batchno");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andBatchnoLike(String value) {
       addCriterion("batchNo like", value, "batchno");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andBatchnoNotLike(String value) {
       addCriterion("batchNo not like", value, "batchno");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andBatchnoIn(List<String> values) {
       addCriterion("batchNo in", values, "batchno");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andBatchnoNotIn(List<String> values) {
       addCriterion("batchNo not in", values, "batchno");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andBatchnoBetween(String value1, String value2) {
       addCriterion("batchNo between", value1, value2, "batchno");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andBatchnoNotBetween(String value1, String value2) {
       addCriterion("batchNo not between", value1, value2, "batchno");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andItemcodeIsNull() {
       addCriterion("itemCode is null");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andItemcodeIsNotNull() {
       addCriterion("itemCode is not null");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andItemcodeEqualTo(String value) {
       addCriterion("itemCode =", value, "itemcode");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andItemcodeNotEqualTo(String value) {
       addCriterion("itemCode <>", value, "itemcode");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andItemcodeGreaterThan(String value) {
       addCriterion("itemCode >", value, "itemcode");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andItemcodeGreaterThanOrEqualTo(String value) {
       addCriterion("itemCode >=", value, "itemcode");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andItemcodeLessThan(String value) {
       addCriterion("itemCode <", value, "itemcode");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andItemcodeLessThanOrEqualTo(String value) {
       addCriterion("itemCode <=", value, "itemcode");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andItemcodeLike(String value) {
       addCriterion("itemCode like", value, "itemcode");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andItemcodeNotLike(String value) {
       addCriterion("itemCode not like", value, "itemcode");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andItemcodeIn(List<String> values) {
       addCriterion("itemCode in", values, "itemcode");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andItemcodeNotIn(List<String> values) {
       addCriterion("itemCode not in", values, "itemcode");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andItemcodeBetween(String value1, String value2) {
       addCriterion("itemCode between", value1, value2, "itemcode");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andItemcodeNotBetween(String value1, String value2) {
       addCriterion("itemCode not between", value1, value2, "itemcode");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andItemnameIsNull() {
       addCriterion("itemName is null");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andItemnameIsNotNull() {
       addCriterion("itemName is not null");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andItemnameEqualTo(String value) {
       addCriterion("itemName =", value, "itemname");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andItemnameNotEqualTo(String value) {
       addCriterion("itemName <>", value, "itemname");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andItemnameGreaterThan(String value) {
       addCriterion("itemName >", value, "itemname");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andItemnameGreaterThanOrEqualTo(String value) {
       addCriterion("itemName >=", value, "itemname");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andItemnameLessThan(String value) {
       addCriterion("itemName <", value, "itemname");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andItemnameLessThanOrEqualTo(String value) {
       addCriterion("itemName <=", value, "itemname");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andItemnameLike(String value) {
       addCriterion("itemName like", value, "itemname");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andItemnameNotLike(String value) {
       addCriterion("itemName not like", value, "itemname");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andItemnameIn(List<String> values) {
       addCriterion("itemName in", values, "itemname");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andItemnameNotIn(List<String> values) {
       addCriterion("itemName not in", values, "itemname");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andItemnameBetween(String value1, String value2) {
       addCriterion("itemName between", value1, value2, "itemname");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andItemnameNotBetween(String value1, String value2) {
       addCriterion("itemName not between", value1, value2, "itemname");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andPickcountIsNull() {
       addCriterion("pickCount is null");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andPickcountIsNotNull() {
       addCriterion("pickCount is not null");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andPickcountEqualTo(Integer value) {
       addCriterion("pickCount =", value, "pickcount");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andPickcountNotEqualTo(Integer value) {
       addCriterion("pickCount <>", value, "pickcount");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andPickcountGreaterThan(Integer value) {
       addCriterion("pickCount >", value, "pickcount");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andPickcountGreaterThanOrEqualTo(Integer value) {
       addCriterion("pickCount >=", value, "pickcount");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andPickcountLessThan(Integer value) {
       addCriterion("pickCount <", value, "pickcount");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andPickcountLessThanOrEqualTo(Integer value) {
       addCriterion("pickCount <=", value, "pickcount");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andPickcountIn(List<Integer> values) {
       addCriterion("pickCount in", values, "pickcount");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andPickcountNotIn(List<Integer> values) {
       addCriterion("pickCount not in", values, "pickcount");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andPickcountBetween(Integer value1, Integer value2) {
       addCriterion("pickCount between", value1, value2, "pickcount");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andPickcountNotBetween(Integer value1, Integer value2) {
       addCriterion("pickCount not between", value1, value2, "pickcount");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andPickstoragelocationIsNull() {
       addCriterion("pickStorageLocation is null");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andPickstoragelocationIsNotNull() {
       addCriterion("pickStorageLocation is not null");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andPickstoragelocationEqualTo(String value) {
       addCriterion("pickStorageLocation =", value, "pickstoragelocation");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andPickstoragelocationNotEqualTo(String value) {
       addCriterion("pickStorageLocation <>", value, "pickstoragelocation");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andPickstoragelocationGreaterThan(String value) {
       addCriterion("pickStorageLocation >", value, "pickstoragelocation");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andPickstoragelocationGreaterThanOrEqualTo(String value) {
       addCriterion("pickStorageLocation >=", value, "pickstoragelocation");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andPickstoragelocationLessThan(String value) {
       addCriterion("pickStorageLocation <", value, "pickstoragelocation");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andPickstoragelocationLessThanOrEqualTo(String value) {
       addCriterion("pickStorageLocation <=", value, "pickstoragelocation");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andPickstoragelocationLike(String value) {
       addCriterion("pickStorageLocation like", value, "pickstoragelocation");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andPickstoragelocationNotLike(String value) {
       addCriterion("pickStorageLocation not like", value, "pickstoragelocation");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andPickstoragelocationIn(List<String> values) {
       addCriterion("pickStorageLocation in", values, "pickstoragelocation");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andPickstoragelocationNotIn(List<String> values) {
       addCriterion("pickStorageLocation not in", values, "pickstoragelocation");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andPickstoragelocationBetween(String value1, String value2) {
       addCriterion("pickStorageLocation between", value1, value2, "pickstoragelocation");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andPickstoragelocationNotBetween(String value1, String value2) {
       addCriterion("pickStorageLocation not between", value1, value2, "pickstoragelocation");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andCreatetimeIsNull() {
       addCriterion("createTime is null");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andCreatetimeIsNotNull() {
       addCriterion("createTime is not null");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andCreatetimeEqualTo(Date value) {
       addCriterion("createTime =", value, "createtime");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andCreatetimeNotEqualTo(Date value) {
       addCriterion("createTime <>", value, "createtime");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andCreatetimeGreaterThan(Date value) {
       addCriterion("createTime >", value, "createtime");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
       addCriterion("createTime >=", value, "createtime");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andCreatetimeLessThan(Date value) {
       addCriterion("createTime <", value, "createtime");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andCreatetimeLessThanOrEqualTo(Date value) {
       addCriterion("createTime <=", value, "createtime");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andCreatetimeIn(List<Date> values) {
       addCriterion("createTime in", values, "createtime");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andCreatetimeNotIn(List<Date> values) {
       addCriterion("createTime not in", values, "createtime");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andCreatetimeBetween(Date value1, Date value2) {
       addCriterion("createTime between", value1, value2, "createtime");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andCreatetimeNotBetween(Date value1, Date value2) {
       addCriterion("createTime not between", value1, value2, "createtime");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andIsdeletedIsNull() {
       addCriterion("isDeleted is null");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andIsdeletedIsNotNull() {
       addCriterion("isDeleted is not null");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andIsdeletedEqualTo(String value) {
       addCriterion("isDeleted =", value, "isdeleted");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andIsdeletedNotEqualTo(String value) {
       addCriterion("isDeleted <>", value, "isdeleted");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andIsdeletedGreaterThan(String value) {
       addCriterion("isDeleted >", value, "isdeleted");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andIsdeletedGreaterThanOrEqualTo(String value) {
       addCriterion("isDeleted >=", value, "isdeleted");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andIsdeletedLessThan(String value) {
       addCriterion("isDeleted <", value, "isdeleted");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andIsdeletedLessThanOrEqualTo(String value) {
       addCriterion("isDeleted <=", value, "isdeleted");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andIsdeletedLike(String value) {
       addCriterion("isDeleted like", value, "isdeleted");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andIsdeletedNotLike(String value) {
       addCriterion("isDeleted not like", value, "isdeleted");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andIsdeletedIn(List<String> values) {
       addCriterion("isDeleted in", values, "isdeleted");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andIsdeletedNotIn(List<String> values) {
       addCriterion("isDeleted not in", values, "isdeleted");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andIsdeletedBetween(String value1, String value2) {
       addCriterion("isDeleted between", value1, value2, "isdeleted");
       return (TOrderBatchPickListExample.Criteria)this;
     }
     
     public TOrderBatchPickListExample.Criteria andIsdeletedNotBetween(String value1, String value2) {
       addCriterion("isDeleted not between", value1, value2, "isdeleted");
       return (TOrderBatchPickListExample.Criteria)this;
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


