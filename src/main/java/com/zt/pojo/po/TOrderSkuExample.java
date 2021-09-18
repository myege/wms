 package com.zt.pojo.po;
 
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 public class TOrderSkuExample
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
     protected List<TOrderSkuExample.Criterion> criteria = new ArrayList<TOrderSkuExample.Criterion>();
 
     
     public boolean isValid() {
       return (this.criteria.size() > 0);
     }
     
     public List<TOrderSkuExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
     
     public List<TOrderSkuExample.Criterion> getCriteria() {
       return this.criteria;
     }
     
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new TOrderSkuExample.Criterion(condition));
     }
     
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new TOrderSkuExample.Criterion(condition, value));
     }
     
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if (value1 == null || value2 == null) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new TOrderSkuExample.Criterion(condition, value1, value2));
     }
     
     public TOrderSkuExample.Criteria andIdIsNull() {
       addCriterion("id is null");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andIdIsNotNull() {
       addCriterion("id is not null");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andIdEqualTo(Integer value) {
       addCriterion("id =", value, "id");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andIdNotEqualTo(Integer value) {
       addCriterion("id <>", value, "id");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andIdGreaterThan(Integer value) {
       addCriterion("id >", value, "id");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("id >=", value, "id");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andIdLessThan(Integer value) {
       addCriterion("id <", value, "id");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andIdLessThanOrEqualTo(Integer value) {
       addCriterion("id <=", value, "id");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andIdIn(List<Integer> values) {
       addCriterion("id in", values, "id");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andIdNotIn(List<Integer> values) {
       addCriterion("id not in", values, "id");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andIdBetween(Integer value1, Integer value2) {
       addCriterion("id between", value1, value2, "id");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
       addCriterion("id not between", value1, value2, "id");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andOrdernoIsNull() {
       addCriterion("orderNo is null");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andOrdernoIsNotNull() {
       addCriterion("orderNo is not null");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andOrdernoEqualTo(String value) {
       addCriterion("orderNo =", value, "orderno");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andOrdernoNotEqualTo(String value) {
       addCriterion("orderNo <>", value, "orderno");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andOrdernoGreaterThan(String value) {
       addCriterion("orderNo >", value, "orderno");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andOrdernoGreaterThanOrEqualTo(String value) {
       addCriterion("orderNo >=", value, "orderno");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andOrdernoLessThan(String value) {
       addCriterion("orderNo <", value, "orderno");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andOrdernoLessThanOrEqualTo(String value) {
       addCriterion("orderNo <=", value, "orderno");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andOrdernoLike(String value) {
       addCriterion("orderNo like", value, "orderno");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andOrdernoNotLike(String value) {
       addCriterion("orderNo not like", value, "orderno");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andOrdernoIn(List<String> values) {
       addCriterion("orderNo in", values, "orderno");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andOrdernoNotIn(List<String> values) {
       addCriterion("orderNo not in", values, "orderno");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andOrdernoBetween(String value1, String value2) {
       addCriterion("orderNo between", value1, value2, "orderno");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andOrdernoNotBetween(String value1, String value2) {
       addCriterion("orderNo not between", value1, value2, "orderno");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andMailnoIsNull() {
       addCriterion("mailNo is null");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andMailnoIsNotNull() {
       addCriterion("mailNo is not null");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andMailnoEqualTo(String value) {
       addCriterion("mailNo =", value, "mailno");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andMailnoNotEqualTo(String value) {
       addCriterion("mailNo <>", value, "mailno");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andMailnoGreaterThan(String value) {
       addCriterion("mailNo >", value, "mailno");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andMailnoGreaterThanOrEqualTo(String value) {
       addCriterion("mailNo >=", value, "mailno");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andMailnoLessThan(String value) {
       addCriterion("mailNo <", value, "mailno");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andMailnoLessThanOrEqualTo(String value) {
       addCriterion("mailNo <=", value, "mailno");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andMailnoLike(String value) {
       addCriterion("mailNo like", value, "mailno");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andMailnoNotLike(String value) {
       addCriterion("mailNo not like", value, "mailno");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andMailnoIn(List<String> values) {
       addCriterion("mailNo in", values, "mailno");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andMailnoNotIn(List<String> values) {
       addCriterion("mailNo not in", values, "mailno");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andMailnoBetween(String value1, String value2) {
       addCriterion("mailNo between", value1, value2, "mailno");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andMailnoNotBetween(String value1, String value2) {
       addCriterion("mailNo not between", value1, value2, "mailno");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemskuIsNull() {
       addCriterion("itemSku is null");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemskuIsNotNull() {
       addCriterion("itemSku is not null");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemskuEqualTo(String value) {
       addCriterion("itemSku =", value, "itemsku");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemskuNotEqualTo(String value) {
       addCriterion("itemSku <>", value, "itemsku");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemskuGreaterThan(String value) {
       addCriterion("itemSku >", value, "itemsku");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemskuGreaterThanOrEqualTo(String value) {
       addCriterion("itemSku >=", value, "itemsku");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemskuLessThan(String value) {
       addCriterion("itemSku <", value, "itemsku");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemskuLessThanOrEqualTo(String value) {
       addCriterion("itemSku <=", value, "itemsku");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemskuLike(String value) {
       addCriterion("itemSku like", value, "itemsku");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemskuNotLike(String value) {
       addCriterion("itemSku not like", value, "itemsku");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemskuIn(List<String> values) {
       addCriterion("itemSku in", values, "itemsku");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemskuNotIn(List<String> values) {
       addCriterion("itemSku not in", values, "itemsku");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemskuBetween(String value1, String value2) {
       addCriterion("itemSku between", value1, value2, "itemsku");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemskuNotBetween(String value1, String value2) {
       addCriterion("itemSku not between", value1, value2, "itemsku");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemcodeIsNull() {
       addCriterion("itemCode is null");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemcodeIsNotNull() {
       addCriterion("itemCode is not null");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemcodeEqualTo(String value) {
       addCriterion("itemCode =", value, "itemcode");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemcodeNotEqualTo(String value) {
       addCriterion("itemCode <>", value, "itemcode");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemcodeGreaterThan(String value) {
       addCriterion("itemCode >", value, "itemcode");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemcodeGreaterThanOrEqualTo(String value) {
       addCriterion("itemCode >=", value, "itemcode");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemcodeLessThan(String value) {
       addCriterion("itemCode <", value, "itemcode");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemcodeLessThanOrEqualTo(String value) {
       addCriterion("itemCode <=", value, "itemcode");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemcodeLike(String value) {
       addCriterion("itemCode like", value, "itemcode");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemcodeNotLike(String value) {
       addCriterion("itemCode not like", value, "itemcode");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemcodeIn(List<String> values) {
       addCriterion("itemCode in", values, "itemcode");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemcodeNotIn(List<String> values) {
       addCriterion("itemCode not in", values, "itemcode");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemcodeBetween(String value1, String value2) {
       addCriterion("itemCode between", value1, value2, "itemcode");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemcodeNotBetween(String value1, String value2) {
       addCriterion("itemCode not between", value1, value2, "itemcode");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemnameIsNull() {
       addCriterion("itemName is null");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemnameIsNotNull() {
       addCriterion("itemName is not null");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemnameEqualTo(String value) {
       addCriterion("itemName =", value, "itemname");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemnameNotEqualTo(String value) {
       addCriterion("itemName <>", value, "itemname");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemnameGreaterThan(String value) {
       addCriterion("itemName >", value, "itemname");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemnameGreaterThanOrEqualTo(String value) {
       addCriterion("itemName >=", value, "itemname");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemnameLessThan(String value) {
       addCriterion("itemName <", value, "itemname");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemnameLessThanOrEqualTo(String value) {
       addCriterion("itemName <=", value, "itemname");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemnameLike(String value) {
       addCriterion("itemName like", value, "itemname");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemnameNotLike(String value) {
       addCriterion("itemName not like", value, "itemname");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemnameIn(List<String> values) {
       addCriterion("itemName in", values, "itemname");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemnameNotIn(List<String> values) {
       addCriterion("itemName not in", values, "itemname");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemnameBetween(String value1, String value2) {
       addCriterion("itemName between", value1, value2, "itemname");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemnameNotBetween(String value1, String value2) {
       addCriterion("itemName not between", value1, value2, "itemname");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemcountIsNull() {
       addCriterion("itemCount is null");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemcountIsNotNull() {
       addCriterion("itemCount is not null");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemcountEqualTo(Integer value) {
       addCriterion("itemCount =", value, "itemcount");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemcountNotEqualTo(Integer value) {
       addCriterion("itemCount <>", value, "itemcount");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemcountGreaterThan(Integer value) {
       addCriterion("itemCount >", value, "itemcount");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemcountGreaterThanOrEqualTo(Integer value) {
       addCriterion("itemCount >=", value, "itemcount");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemcountLessThan(Integer value) {
       addCriterion("itemCount <", value, "itemcount");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemcountLessThanOrEqualTo(Integer value) {
       addCriterion("itemCount <=", value, "itemcount");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemcountIn(List<Integer> values) {
       addCriterion("itemCount in", values, "itemcount");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemcountNotIn(List<Integer> values) {
       addCriterion("itemCount not in", values, "itemcount");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemcountBetween(Integer value1, Integer value2) {
       addCriterion("itemCount between", value1, value2, "itemcount");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andItemcountNotBetween(Integer value1, Integer value2) {
       addCriterion("itemCount not between", value1, value2, "itemcount");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andUnitpriceIsNull() {
       addCriterion("unitPrice is null");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andUnitpriceIsNotNull() {
       addCriterion("unitPrice is not null");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andUnitpriceEqualTo(String value) {
       addCriterion("unitPrice =", value, "unitprice");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andUnitpriceNotEqualTo(String value) {
       addCriterion("unitPrice <>", value, "unitprice");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andUnitpriceGreaterThan(String value) {
       addCriterion("unitPrice >", value, "unitprice");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andUnitpriceGreaterThanOrEqualTo(String value) {
       addCriterion("unitPrice >=", value, "unitprice");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andUnitpriceLessThan(String value) {
       addCriterion("unitPrice <", value, "unitprice");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andUnitpriceLessThanOrEqualTo(String value) {
       addCriterion("unitPrice <=", value, "unitprice");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andUnitpriceLike(String value) {
       addCriterion("unitPrice like", value, "unitprice");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andUnitpriceNotLike(String value) {
       addCriterion("unitPrice not like", value, "unitprice");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andUnitpriceIn(List<String> values) {
       addCriterion("unitPrice in", values, "unitprice");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andUnitpriceNotIn(List<String> values) {
       addCriterion("unitPrice not in", values, "unitprice");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andUnitpriceBetween(String value1, String value2) {
       addCriterion("unitPrice between", value1, value2, "unitprice");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andUnitpriceNotBetween(String value1, String value2) {
       addCriterion("unitPrice not between", value1, value2, "unitprice");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andAllpriceIsNull() {
       addCriterion("allPrice is null");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andAllpriceIsNotNull() {
       addCriterion("allPrice is not null");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andAllpriceEqualTo(String value) {
       addCriterion("allPrice =", value, "allprice");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andAllpriceNotEqualTo(String value) {
       addCriterion("allPrice <>", value, "allprice");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andAllpriceGreaterThan(String value) {
       addCriterion("allPrice >", value, "allprice");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andAllpriceGreaterThanOrEqualTo(String value) {
       addCriterion("allPrice >=", value, "allprice");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andAllpriceLessThan(String value) {
       addCriterion("allPrice <", value, "allprice");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andAllpriceLessThanOrEqualTo(String value) {
       addCriterion("allPrice <=", value, "allprice");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andAllpriceLike(String value) {
       addCriterion("allPrice like", value, "allprice");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andAllpriceNotLike(String value) {
       addCriterion("allPrice not like", value, "allprice");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andAllpriceIn(List<String> values) {
       addCriterion("allPrice in", values, "allprice");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andAllpriceNotIn(List<String> values) {
       addCriterion("allPrice not in", values, "allprice");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andAllpriceBetween(String value1, String value2) {
       addCriterion("allPrice between", value1, value2, "allprice");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andAllpriceNotBetween(String value1, String value2) {
       addCriterion("allPrice not between", value1, value2, "allprice");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andCreatetimeIsNull() {
       addCriterion("createTime is null");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andCreatetimeIsNotNull() {
       addCriterion("createTime is not null");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andCreatetimeEqualTo(Date value) {
       addCriterion("createTime =", value, "createtime");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andCreatetimeNotEqualTo(Date value) {
       addCriterion("createTime <>", value, "createtime");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andCreatetimeGreaterThan(Date value) {
       addCriterion("createTime >", value, "createtime");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
       addCriterion("createTime >=", value, "createtime");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andCreatetimeLessThan(Date value) {
       addCriterion("createTime <", value, "createtime");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andCreatetimeLessThanOrEqualTo(Date value) {
       addCriterion("createTime <=", value, "createtime");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andCreatetimeIn(List<Date> values) {
       addCriterion("createTime in", values, "createtime");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andCreatetimeNotIn(List<Date> values) {
       addCriterion("createTime not in", values, "createtime");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andCreatetimeBetween(Date value1, Date value2) {
       addCriterion("createTime between", value1, value2, "createtime");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andCreatetimeNotBetween(Date value1, Date value2) {
       addCriterion("createTime not between", value1, value2, "createtime");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andIsdeletedIsNull() {
       addCriterion("isDeleted is null");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andIsdeletedIsNotNull() {
       addCriterion("isDeleted is not null");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andIsdeletedEqualTo(Integer value) {
       addCriterion("isDeleted =", value, "isdeleted");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andIsdeletedNotEqualTo(Integer value) {
       addCriterion("isDeleted <>", value, "isdeleted");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andIsdeletedGreaterThan(Integer value) {
       addCriterion("isDeleted >", value, "isdeleted");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andIsdeletedGreaterThanOrEqualTo(Integer value) {
       addCriterion("isDeleted >=", value, "isdeleted");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andIsdeletedLessThan(Integer value) {
       addCriterion("isDeleted <", value, "isdeleted");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andIsdeletedLessThanOrEqualTo(Integer value) {
       addCriterion("isDeleted <=", value, "isdeleted");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andIsdeletedIn(List<Integer> values) {
       addCriterion("isDeleted in", values, "isdeleted");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andIsdeletedNotIn(List<Integer> values) {
       addCriterion("isDeleted not in", values, "isdeleted");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andIsdeletedBetween(Integer value1, Integer value2) {
       addCriterion("isDeleted between", value1, value2, "isdeleted");
       return (TOrderSkuExample.Criteria)this;
     }
     
     public TOrderSkuExample.Criteria andIsdeletedNotBetween(Integer value1, Integer value2) {
       addCriterion("isDeleted not between", value1, value2, "isdeleted");
       return (TOrderSkuExample.Criteria)this;
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


