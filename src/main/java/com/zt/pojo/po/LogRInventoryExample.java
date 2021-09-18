 package com.zt.pojo.po;
 
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 public class LogRInventoryExample
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
     protected List<LogRInventoryExample.Criterion> criteria = new ArrayList<LogRInventoryExample.Criterion>();
 
     
     public boolean isValid() {
       return (this.criteria.size() > 0);
     }
     
     public List<LogRInventoryExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
     
     public List<LogRInventoryExample.Criterion> getCriteria() {
       return this.criteria;
     }
     
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new LogRInventoryExample.Criterion(condition));
     }
     
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new LogRInventoryExample.Criterion(condition, value));
     }
     
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if (value1 == null || value2 == null) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new LogRInventoryExample.Criterion(condition, value1, value2));
     }
     
     public LogRInventoryExample.Criteria andIdIsNull() {
       addCriterion("id is null");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andIdIsNotNull() {
       addCriterion("id is not null");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andIdEqualTo(Integer value) {
       addCriterion("id =", value, "id");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andIdNotEqualTo(Integer value) {
       addCriterion("id <>", value, "id");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andIdGreaterThan(Integer value) {
       addCriterion("id >", value, "id");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("id >=", value, "id");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andIdLessThan(Integer value) {
       addCriterion("id <", value, "id");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andIdLessThanOrEqualTo(Integer value) {
       addCriterion("id <=", value, "id");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andIdIn(List<Integer> values) {
       addCriterion("id in", values, "id");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andIdNotIn(List<Integer> values) {
       addCriterion("id not in", values, "id");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andIdBetween(Integer value1, Integer value2) {
       addCriterion("id between", value1, value2, "id");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
       addCriterion("id not between", value1, value2, "id");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andParentidIsNull() {
       addCriterion("parentId is null");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andParentidIsNotNull() {
       addCriterion("parentId is not null");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andParentidEqualTo(Integer value) {
       addCriterion("parentId =", value, "parentid");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andParentidNotEqualTo(Integer value) {
       addCriterion("parentId <>", value, "parentid");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andParentidGreaterThan(Integer value) {
       addCriterion("parentId >", value, "parentid");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andParentidGreaterThanOrEqualTo(Integer value) {
       addCriterion("parentId >=", value, "parentid");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andParentidLessThan(Integer value) {
       addCriterion("parentId <", value, "parentid");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andParentidLessThanOrEqualTo(Integer value) {
       addCriterion("parentId <=", value, "parentid");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andParentidIn(List<Integer> values) {
       addCriterion("parentId in", values, "parentid");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andParentidNotIn(List<Integer> values) {
       addCriterion("parentId not in", values, "parentid");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andParentidBetween(Integer value1, Integer value2) {
       addCriterion("parentId between", value1, value2, "parentid");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andParentidNotBetween(Integer value1, Integer value2) {
       addCriterion("parentId not between", value1, value2, "parentid");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andStorageIsNull() {
       addCriterion("storage is null");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andStorageIsNotNull() {
       addCriterion("storage is not null");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andStorageEqualTo(String value) {
       addCriterion("storage =", value, "storage");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andStorageNotEqualTo(String value) {
       addCriterion("storage <>", value, "storage");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andStorageGreaterThan(String value) {
       addCriterion("storage >", value, "storage");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andStorageGreaterThanOrEqualTo(String value) {
       addCriterion("storage >=", value, "storage");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andStorageLessThan(String value) {
       addCriterion("storage <", value, "storage");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andStorageLessThanOrEqualTo(String value) {
       addCriterion("storage <=", value, "storage");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andStorageLike(String value) {
       addCriterion("storage like", value, "storage");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andStorageNotLike(String value) {
       addCriterion("storage not like", value, "storage");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andStorageIn(List<String> values) {
       addCriterion("storage in", values, "storage");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andStorageNotIn(List<String> values) {
       addCriterion("storage not in", values, "storage");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andStorageBetween(String value1, String value2) {
       addCriterion("storage between", value1, value2, "storage");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andStorageNotBetween(String value1, String value2) {
       addCriterion("storage not between", value1, value2, "storage");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andSumIsNull() {
       addCriterion("sum is null");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andSumIsNotNull() {
       addCriterion("sum is not null");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andSumEqualTo(Integer value) {
       addCriterion("sum =", value, "sum");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andSumNotEqualTo(Integer value) {
       addCriterion("sum <>", value, "sum");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andSumGreaterThan(Integer value) {
       addCriterion("sum >", value, "sum");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andSumGreaterThanOrEqualTo(Integer value) {
       addCriterion("sum >=", value, "sum");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andSumLessThan(Integer value) {
       addCriterion("sum <", value, "sum");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andSumLessThanOrEqualTo(Integer value) {
       addCriterion("sum <=", value, "sum");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andSumIn(List<Integer> values) {
       addCriterion("sum in", values, "sum");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andSumNotIn(List<Integer> values) {
       addCriterion("sum not in", values, "sum");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andSumBetween(Integer value1, Integer value2) {
       addCriterion("sum between", value1, value2, "sum");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andSumNotBetween(Integer value1, Integer value2) {
       addCriterion("sum not between", value1, value2, "sum");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andTypeIsNull() {
       addCriterion("type is null");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andTypeIsNotNull() {
       addCriterion("type is not null");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andTypeEqualTo(String value) {
       addCriterion("type =", value, "type");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andTypeNotEqualTo(String value) {
       addCriterion("type <>", value, "type");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andTypeGreaterThan(String value) {
       addCriterion("type >", value, "type");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andTypeGreaterThanOrEqualTo(String value) {
       addCriterion("type >=", value, "type");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andTypeLessThan(String value) {
       addCriterion("type <", value, "type");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andTypeLessThanOrEqualTo(String value) {
       addCriterion("type <=", value, "type");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andTypeLike(String value) {
       addCriterion("type like", value, "type");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andTypeNotLike(String value) {
       addCriterion("type not like", value, "type");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andTypeIn(List<String> values) {
       addCriterion("type in", values, "type");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andTypeNotIn(List<String> values) {
       addCriterion("type not in", values, "type");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andTypeBetween(String value1, String value2) {
       addCriterion("type between", value1, value2, "type");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andTypeNotBetween(String value1, String value2) {
       addCriterion("type not between", value1, value2, "type");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andRemarkIsNull() {
       addCriterion("remark is null");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andRemarkIsNotNull() {
       addCriterion("remark is not null");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andRemarkEqualTo(String value) {
       addCriterion("remark =", value, "remark");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andRemarkNotEqualTo(String value) {
       addCriterion("remark <>", value, "remark");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andRemarkGreaterThan(String value) {
       addCriterion("remark >", value, "remark");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andRemarkGreaterThanOrEqualTo(String value) {
       addCriterion("remark >=", value, "remark");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andRemarkLessThan(String value) {
       addCriterion("remark <", value, "remark");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andRemarkLessThanOrEqualTo(String value) {
       addCriterion("remark <=", value, "remark");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andRemarkLike(String value) {
       addCriterion("remark like", value, "remark");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andRemarkNotLike(String value) {
       addCriterion("remark not like", value, "remark");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andRemarkIn(List<String> values) {
       addCriterion("remark in", values, "remark");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andRemarkNotIn(List<String> values) {
       addCriterion("remark not in", values, "remark");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andRemarkBetween(String value1, String value2) {
       addCriterion("remark between", value1, value2, "remark");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andRemarkNotBetween(String value1, String value2) {
       addCriterion("remark not between", value1, value2, "remark");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andCreatetimeIsNull() {
       addCriterion("createTime is null");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andCreatetimeIsNotNull() {
       addCriterion("createTime is not null");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andCreatetimeEqualTo(Date value) {
       addCriterion("createTime =", value, "createtime");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andCreatetimeNotEqualTo(Date value) {
       addCriterion("createTime <>", value, "createtime");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andCreatetimeGreaterThan(Date value) {
       addCriterion("createTime >", value, "createtime");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
       addCriterion("createTime >=", value, "createtime");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andCreatetimeLessThan(Date value) {
       addCriterion("createTime <", value, "createtime");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andCreatetimeLessThanOrEqualTo(Date value) {
       addCriterion("createTime <=", value, "createtime");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andCreatetimeIn(List<Date> values) {
       addCriterion("createTime in", values, "createtime");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andCreatetimeNotIn(List<Date> values) {
       addCriterion("createTime not in", values, "createtime");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andCreatetimeBetween(Date value1, Date value2) {
       addCriterion("createTime between", value1, value2, "createtime");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andCreatetimeNotBetween(Date value1, Date value2) {
       addCriterion("createTime not between", value1, value2, "createtime");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andOrdernoIsNull() {
       addCriterion("orderNo is null");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andOrdernoIsNotNull() {
       addCriterion("orderNo is not null");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andOrdernoEqualTo(String value) {
       addCriterion("orderNo =", value, "orderno");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andOrdernoNotEqualTo(String value) {
       addCriterion("orderNo <>", value, "orderno");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andOrdernoGreaterThan(String value) {
       addCriterion("orderNo >", value, "orderno");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andOrdernoGreaterThanOrEqualTo(String value) {
       addCriterion("orderNo >=", value, "orderno");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andOrdernoLessThan(String value) {
       addCriterion("orderNo <", value, "orderno");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andOrdernoLessThanOrEqualTo(String value) {
       addCriterion("orderNo <=", value, "orderno");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andOrdernoLike(String value) {
       addCriterion("orderNo like", value, "orderno");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andOrdernoNotLike(String value) {
       addCriterion("orderNo not like", value, "orderno");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andOrdernoIn(List<String> values) {
       addCriterion("orderNo in", values, "orderno");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andOrdernoNotIn(List<String> values) {
       addCriterion("orderNo not in", values, "orderno");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andOrdernoBetween(String value1, String value2) {
       addCriterion("orderNo between", value1, value2, "orderno");
       return (LogRInventoryExample.Criteria)this;
     }
     
     public LogRInventoryExample.Criteria andOrdernoNotBetween(String value1, String value2) {
       addCriterion("orderNo not between", value1, value2, "orderno");
       return (LogRInventoryExample.Criteria)this;
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


