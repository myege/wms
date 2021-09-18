 package com.zt.pojo.po;
 
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 public class LogTCompanyExample
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
     protected List<LogTCompanyExample.Criterion> criteria = new ArrayList<LogTCompanyExample.Criterion>();
 
     
     public boolean isValid() {
       return (this.criteria.size() > 0);
     }
     
     public List<LogTCompanyExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
     
     public List<LogTCompanyExample.Criterion> getCriteria() {
       return this.criteria;
     }
     
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new LogTCompanyExample.Criterion(condition));
     }
     
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new LogTCompanyExample.Criterion(condition, value));
     }
     
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if (value1 == null || value2 == null) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new LogTCompanyExample.Criterion(condition, value1, value2));
     }
     
     public LogTCompanyExample.Criteria andIdIsNull() {
       addCriterion("id is null");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andIdIsNotNull() {
       addCriterion("id is not null");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andIdEqualTo(Integer value) {
       addCriterion("id =", value, "id");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andIdNotEqualTo(Integer value) {
       addCriterion("id <>", value, "id");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andIdGreaterThan(Integer value) {
       addCriterion("id >", value, "id");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("id >=", value, "id");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andIdLessThan(Integer value) {
       addCriterion("id <", value, "id");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andIdLessThanOrEqualTo(Integer value) {
       addCriterion("id <=", value, "id");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andIdIn(List<Integer> values) {
       addCriterion("id in", values, "id");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andIdNotIn(List<Integer> values) {
       addCriterion("id not in", values, "id");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andIdBetween(Integer value1, Integer value2) {
       addCriterion("id between", value1, value2, "id");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
       addCriterion("id not between", value1, value2, "id");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andOperationidIsNull() {
       addCriterion("operationId is null");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andOperationidIsNotNull() {
       addCriterion("operationId is not null");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andOperationidEqualTo(Integer value) {
       addCriterion("operationId =", value, "operationid");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andOperationidNotEqualTo(Integer value) {
       addCriterion("operationId <>", value, "operationid");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andOperationidGreaterThan(Integer value) {
       addCriterion("operationId >", value, "operationid");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andOperationidGreaterThanOrEqualTo(Integer value) {
       addCriterion("operationId >=", value, "operationid");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andOperationidLessThan(Integer value) {
       addCriterion("operationId <", value, "operationid");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andOperationidLessThanOrEqualTo(Integer value) {
       addCriterion("operationId <=", value, "operationid");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andOperationidIn(List<Integer> values) {
       addCriterion("operationId in", values, "operationid");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andOperationidNotIn(List<Integer> values) {
       addCriterion("operationId not in", values, "operationid");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andOperationidBetween(Integer value1, Integer value2) {
       addCriterion("operationId between", value1, value2, "operationid");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andOperationidNotBetween(Integer value1, Integer value2) {
       addCriterion("operationId not between", value1, value2, "operationid");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andUsersidIsNull() {
       addCriterion("usersId is null");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andUsersidIsNotNull() {
       addCriterion("usersId is not null");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andUsersidEqualTo(Integer value) {
       addCriterion("usersId =", value, "usersid");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andUsersidNotEqualTo(Integer value) {
       addCriterion("usersId <>", value, "usersid");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andUsersidGreaterThan(Integer value) {
       addCriterion("usersId >", value, "usersid");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andUsersidGreaterThanOrEqualTo(Integer value) {
       addCriterion("usersId >=", value, "usersid");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andUsersidLessThan(Integer value) {
       addCriterion("usersId <", value, "usersid");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andUsersidLessThanOrEqualTo(Integer value) {
       addCriterion("usersId <=", value, "usersid");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andUsersidIn(List<Integer> values) {
       addCriterion("usersId in", values, "usersid");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andUsersidNotIn(List<Integer> values) {
       addCriterion("usersId not in", values, "usersid");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andUsersidBetween(Integer value1, Integer value2) {
       addCriterion("usersId between", value1, value2, "usersid");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andUsersidNotBetween(Integer value1, Integer value2) {
       addCriterion("usersId not between", value1, value2, "usersid");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andUsersnameIsNull() {
       addCriterion("usersName is null");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andUsersnameIsNotNull() {
       addCriterion("usersName is not null");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andUsersnameEqualTo(String value) {
       addCriterion("usersName =", value, "usersname");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andUsersnameNotEqualTo(String value) {
       addCriterion("usersName <>", value, "usersname");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andUsersnameGreaterThan(String value) {
       addCriterion("usersName >", value, "usersname");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andUsersnameGreaterThanOrEqualTo(String value) {
       addCriterion("usersName >=", value, "usersname");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andUsersnameLessThan(String value) {
       addCriterion("usersName <", value, "usersname");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andUsersnameLessThanOrEqualTo(String value) {
       addCriterion("usersName <=", value, "usersname");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andUsersnameLike(String value) {
       addCriterion("usersName like", value, "usersname");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andUsersnameNotLike(String value) {
       addCriterion("usersName not like", value, "usersname");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andUsersnameIn(List<String> values) {
       addCriterion("usersName in", values, "usersname");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andUsersnameNotIn(List<String> values) {
       addCriterion("usersName not in", values, "usersname");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andUsersnameBetween(String value1, String value2) {
       addCriterion("usersName between", value1, value2, "usersname");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andUsersnameNotBetween(String value1, String value2) {
       addCriterion("usersName not between", value1, value2, "usersname");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andCreatetimeIsNull() {
       addCriterion("createTime is null");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andCreatetimeIsNotNull() {
       addCriterion("createTime is not null");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andCreatetimeEqualTo(Date value) {
       addCriterion("createTime =", value, "createtime");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andCreatetimeNotEqualTo(Date value) {
       addCriterion("createTime <>", value, "createtime");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andCreatetimeGreaterThan(Date value) {
       addCriterion("createTime >", value, "createtime");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
       addCriterion("createTime >=", value, "createtime");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andCreatetimeLessThan(Date value) {
       addCriterion("createTime <", value, "createtime");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andCreatetimeLessThanOrEqualTo(Date value) {
       addCriterion("createTime <=", value, "createtime");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andCreatetimeIn(List<Date> values) {
       addCriterion("createTime in", values, "createtime");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andCreatetimeNotIn(List<Date> values) {
       addCriterion("createTime not in", values, "createtime");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andCreatetimeBetween(Date value1, Date value2) {
       addCriterion("createTime between", value1, value2, "createtime");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andCreatetimeNotBetween(Date value1, Date value2) {
       addCriterion("createTime not between", value1, value2, "createtime");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andContentIsNull() {
       addCriterion("content is null");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andContentIsNotNull() {
       addCriterion("content is not null");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andContentEqualTo(String value) {
       addCriterion("content =", value, "content");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andContentNotEqualTo(String value) {
       addCriterion("content <>", value, "content");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andContentGreaterThan(String value) {
       addCriterion("content >", value, "content");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andContentGreaterThanOrEqualTo(String value) {
       addCriterion("content >=", value, "content");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andContentLessThan(String value) {
       addCriterion("content <", value, "content");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andContentLessThanOrEqualTo(String value) {
       addCriterion("content <=", value, "content");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andContentLike(String value) {
       addCriterion("content like", value, "content");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andContentNotLike(String value) {
       addCriterion("content not like", value, "content");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andContentIn(List<String> values) {
       addCriterion("content in", values, "content");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andContentNotIn(List<String> values) {
       addCriterion("content not in", values, "content");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andContentBetween(String value1, String value2) {
       addCriterion("content between", value1, value2, "content");
       return (LogTCompanyExample.Criteria)this;
     }
     
     public LogTCompanyExample.Criteria andContentNotBetween(String value1, String value2) {
       addCriterion("content not between", value1, value2, "content");
       return (LogTCompanyExample.Criteria)this;
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


