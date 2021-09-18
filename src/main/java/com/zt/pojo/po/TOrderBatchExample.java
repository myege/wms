 package com.zt.pojo.po;
 
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 public class TOrderBatchExample
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
     protected List<TOrderBatchExample.Criterion> criteria = new ArrayList<TOrderBatchExample.Criterion>();
 
     
     public boolean isValid() {
       return (this.criteria.size() > 0);
     }
     
     public List<TOrderBatchExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
     
     public List<TOrderBatchExample.Criterion> getCriteria() {
       return this.criteria;
     }
     
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new TOrderBatchExample.Criterion(condition));
     }
     
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new TOrderBatchExample.Criterion(condition, value));
     }
     
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if (value1 == null || value2 == null) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new TOrderBatchExample.Criterion(condition, value1, value2));
     }
     
     public TOrderBatchExample.Criteria andIdIsNull() {
       addCriterion("id is null");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIdIsNotNull() {
       addCriterion("id is not null");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIdEqualTo(Integer value) {
       addCriterion("id =", value, "id");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIdNotEqualTo(Integer value) {
       addCriterion("id <>", value, "id");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIdGreaterThan(Integer value) {
       addCriterion("id >", value, "id");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("id >=", value, "id");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIdLessThan(Integer value) {
       addCriterion("id <", value, "id");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIdLessThanOrEqualTo(Integer value) {
       addCriterion("id <=", value, "id");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIdIn(List<Integer> values) {
       addCriterion("id in", values, "id");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIdNotIn(List<Integer> values) {
       addCriterion("id not in", values, "id");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIdBetween(Integer value1, Integer value2) {
       addCriterion("id between", value1, value2, "id");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
       addCriterion("id not between", value1, value2, "id");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andBatchnoIsNull() {
       addCriterion("batchNo is null");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andBatchnoIsNotNull() {
       addCriterion("batchNo is not null");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andBatchnoEqualTo(String value) {
       addCriterion("batchNo =", value, "batchno");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andBatchnoNotEqualTo(String value) {
       addCriterion("batchNo <>", value, "batchno");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andBatchnoGreaterThan(String value) {
       addCriterion("batchNo >", value, "batchno");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andBatchnoGreaterThanOrEqualTo(String value) {
       addCriterion("batchNo >=", value, "batchno");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andBatchnoLessThan(String value) {
       addCriterion("batchNo <", value, "batchno");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andBatchnoLessThanOrEqualTo(String value) {
       addCriterion("batchNo <=", value, "batchno");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andBatchnoLike(String value) {
       addCriterion("batchNo like", value, "batchno");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andBatchnoNotLike(String value) {
       addCriterion("batchNo not like", value, "batchno");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andBatchnoIn(List<String> values) {
       addCriterion("batchNo in", values, "batchno");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andBatchnoNotIn(List<String> values) {
       addCriterion("batchNo not in", values, "batchno");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andBatchnoBetween(String value1, String value2) {
       addCriterion("batchNo between", value1, value2, "batchno");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andBatchnoNotBetween(String value1, String value2) {
       addCriterion("batchNo not between", value1, value2, "batchno");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIsprintIsNull() {
       addCriterion("isPrint is null");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIsprintIsNotNull() {
       addCriterion("isPrint is not null");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIsprintEqualTo(Integer value) {
       addCriterion("isPrint =", value, "isprint");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIsprintNotEqualTo(Integer value) {
       addCriterion("isPrint <>", value, "isprint");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIsprintGreaterThan(Integer value) {
       addCriterion("isPrint >", value, "isprint");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIsprintGreaterThanOrEqualTo(Integer value) {
       addCriterion("isPrint >=", value, "isprint");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIsprintLessThan(Integer value) {
       addCriterion("isPrint <", value, "isprint");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIsprintLessThanOrEqualTo(Integer value) {
       addCriterion("isPrint <=", value, "isprint");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIsprintIn(List<Integer> values) {
       addCriterion("isPrint in", values, "isprint");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIsprintNotIn(List<Integer> values) {
       addCriterion("isPrint not in", values, "isprint");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIsprintBetween(Integer value1, Integer value2) {
       addCriterion("isPrint between", value1, value2, "isprint");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIsprintNotBetween(Integer value1, Integer value2) {
       addCriterion("isPrint not between", value1, value2, "isprint");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIspickIsNull() {
       addCriterion("isPick is null");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIspickIsNotNull() {
       addCriterion("isPick is not null");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIspickEqualTo(Integer value) {
       addCriterion("isPick =", value, "ispick");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIspickNotEqualTo(Integer value) {
       addCriterion("isPick <>", value, "ispick");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIspickGreaterThan(Integer value) {
       addCriterion("isPick >", value, "ispick");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIspickGreaterThanOrEqualTo(Integer value) {
       addCriterion("isPick >=", value, "ispick");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIspickLessThan(Integer value) {
       addCriterion("isPick <", value, "ispick");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIspickLessThanOrEqualTo(Integer value) {
       addCriterion("isPick <=", value, "ispick");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIspickIn(List<Integer> values) {
       addCriterion("isPick in", values, "ispick");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIspickNotIn(List<Integer> values) {
       addCriterion("isPick not in", values, "ispick");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIspickBetween(Integer value1, Integer value2) {
       addCriterion("isPick between", value1, value2, "ispick");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIspickNotBetween(Integer value1, Integer value2) {
       addCriterion("isPick not between", value1, value2, "ispick");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andCreatetimeIsNull() {
       addCriterion("createTime is null");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andCreatetimeIsNotNull() {
       addCriterion("createTime is not null");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andCreatetimeEqualTo(Date value) {
       addCriterion("createTime =", value, "createtime");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andCreatetimeNotEqualTo(Date value) {
       addCriterion("createTime <>", value, "createtime");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andCreatetimeGreaterThan(Date value) {
       addCriterion("createTime >", value, "createtime");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
       addCriterion("createTime >=", value, "createtime");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andCreatetimeLessThan(Date value) {
       addCriterion("createTime <", value, "createtime");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andCreatetimeLessThanOrEqualTo(Date value) {
       addCriterion("createTime <=", value, "createtime");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andCreatetimeIn(List<Date> values) {
       addCriterion("createTime in", values, "createtime");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andCreatetimeNotIn(List<Date> values) {
       addCriterion("createTime not in", values, "createtime");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andCreatetimeBetween(Date value1, Date value2) {
       addCriterion("createTime between", value1, value2, "createtime");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andCreatetimeNotBetween(Date value1, Date value2) {
       addCriterion("createTime not between", value1, value2, "createtime");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIsdeletedIsNull() {
       addCriterion("isDeleted is null");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIsdeletedIsNotNull() {
       addCriterion("isDeleted is not null");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIsdeletedEqualTo(Integer value) {
       addCriterion("isDeleted =", value, "isdeleted");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIsdeletedNotEqualTo(Integer value) {
       addCriterion("isDeleted <>", value, "isdeleted");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIsdeletedGreaterThan(Integer value) {
       addCriterion("isDeleted >", value, "isdeleted");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIsdeletedGreaterThanOrEqualTo(Integer value) {
       addCriterion("isDeleted >=", value, "isdeleted");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIsdeletedLessThan(Integer value) {
       addCriterion("isDeleted <", value, "isdeleted");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIsdeletedLessThanOrEqualTo(Integer value) {
       addCriterion("isDeleted <=", value, "isdeleted");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIsdeletedIn(List<Integer> values) {
       addCriterion("isDeleted in", values, "isdeleted");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIsdeletedNotIn(List<Integer> values) {
       addCriterion("isDeleted not in", values, "isdeleted");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIsdeletedBetween(Integer value1, Integer value2) {
       addCriterion("isDeleted between", value1, value2, "isdeleted");
       return (TOrderBatchExample.Criteria)this;
     }
     
     public TOrderBatchExample.Criteria andIsdeletedNotBetween(Integer value1, Integer value2) {
       addCriterion("isDeleted not between", value1, value2, "isdeleted");
       return (TOrderBatchExample.Criteria)this;
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


