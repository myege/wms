 package com.zt.pojo.po;
 
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 public class TTemplateExample
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
     protected List<TTemplateExample.Criterion> criteria = new ArrayList<TTemplateExample.Criterion>();
 
     
     public boolean isValid() {
       return (this.criteria.size() > 0);
     }
     
     public List<TTemplateExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
     
     public List<TTemplateExample.Criterion> getCriteria() {
       return this.criteria;
     }
     
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new TTemplateExample.Criterion(condition));
     }
     
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new TTemplateExample.Criterion(condition, value));
     }
     
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if (value1 == null || value2 == null) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new TTemplateExample.Criterion(condition, value1, value2));
     }
     
     public TTemplateExample.Criteria andIdIsNull() {
       addCriterion("id is null");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andIdIsNotNull() {
       addCriterion("id is not null");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andIdEqualTo(Integer value) {
       addCriterion("id =", value, "id");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andIdNotEqualTo(Integer value) {
       addCriterion("id <>", value, "id");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andIdGreaterThan(Integer value) {
       addCriterion("id >", value, "id");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("id >=", value, "id");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andIdLessThan(Integer value) {
       addCriterion("id <", value, "id");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andIdLessThanOrEqualTo(Integer value) {
       addCriterion("id <=", value, "id");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andIdIn(List<Integer> values) {
       addCriterion("id in", values, "id");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andIdNotIn(List<Integer> values) {
       addCriterion("id not in", values, "id");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andIdBetween(Integer value1, Integer value2) {
       addCriterion("id between", value1, value2, "id");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
       addCriterion("id not between", value1, value2, "id");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andTemplatenumberIsNull() {
       addCriterion("templateNumber is null");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andTemplatenumberIsNotNull() {
       addCriterion("templateNumber is not null");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andTemplatenumberEqualTo(String value) {
       addCriterion("templateNumber =", value, "templatenumber");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andTemplatenumberNotEqualTo(String value) {
       addCriterion("templateNumber <>", value, "templatenumber");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andTemplatenumberGreaterThan(String value) {
       addCriterion("templateNumber >", value, "templatenumber");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andTemplatenumberGreaterThanOrEqualTo(String value) {
       addCriterion("templateNumber >=", value, "templatenumber");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andTemplatenumberLessThan(String value) {
       addCriterion("templateNumber <", value, "templatenumber");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andTemplatenumberLessThanOrEqualTo(String value) {
       addCriterion("templateNumber <=", value, "templatenumber");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andTemplatenumberLike(String value) {
       addCriterion("templateNumber like", value, "templatenumber");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andTemplatenumberNotLike(String value) {
       addCriterion("templateNumber not like", value, "templatenumber");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andTemplatenumberIn(List<String> values) {
       addCriterion("templateNumber in", values, "templatenumber");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andTemplatenumberNotIn(List<String> values) {
       addCriterion("templateNumber not in", values, "templatenumber");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andTemplatenumberBetween(String value1, String value2) {
       addCriterion("templateNumber between", value1, value2, "templatenumber");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andTemplatenumberNotBetween(String value1, String value2) {
       addCriterion("templateNumber not between", value1, value2, "templatenumber");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andTemplatenameIsNull() {
       addCriterion("templateName is null");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andTemplatenameIsNotNull() {
       addCriterion("templateName is not null");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andTemplatenameEqualTo(String value) {
       addCriterion("templateName =", value, "templatename");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andTemplatenameNotEqualTo(String value) {
       addCriterion("templateName <>", value, "templatename");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andTemplatenameGreaterThan(String value) {
       addCriterion("templateName >", value, "templatename");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andTemplatenameGreaterThanOrEqualTo(String value) {
       addCriterion("templateName >=", value, "templatename");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andTemplatenameLessThan(String value) {
       addCriterion("templateName <", value, "templatename");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andTemplatenameLessThanOrEqualTo(String value) {
       addCriterion("templateName <=", value, "templatename");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andTemplatenameLike(String value) {
       addCriterion("templateName like", value, "templatename");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andTemplatenameNotLike(String value) {
       addCriterion("templateName not like", value, "templatename");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andTemplatenameIn(List<String> values) {
       addCriterion("templateName in", values, "templatename");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andTemplatenameNotIn(List<String> values) {
       addCriterion("templateName not in", values, "templatename");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andTemplatenameBetween(String value1, String value2) {
       addCriterion("templateName between", value1, value2, "templatename");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andTemplatenameNotBetween(String value1, String value2) {
       addCriterion("templateName not between", value1, value2, "templatename");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andCategoryIsNull() {
       addCriterion("category is null");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andCategoryIsNotNull() {
       addCriterion("category is not null");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andCategoryEqualTo(String value) {
       addCriterion("category =", value, "category");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andCategoryNotEqualTo(String value) {
       addCriterion("category <>", value, "category");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andCategoryGreaterThan(String value) {
       addCriterion("category >", value, "category");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andCategoryGreaterThanOrEqualTo(String value) {
       addCriterion("category >=", value, "category");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andCategoryLessThan(String value) {
       addCriterion("category <", value, "category");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andCategoryLessThanOrEqualTo(String value) {
       addCriterion("category <=", value, "category");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andCategoryLike(String value) {
       addCriterion("category like", value, "category");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andCategoryNotLike(String value) {
       addCriterion("category not like", value, "category");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andCategoryIn(List<String> values) {
       addCriterion("category in", values, "category");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andCategoryNotIn(List<String> values) {
       addCriterion("category not in", values, "category");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andCategoryBetween(String value1, String value2) {
       addCriterion("category between", value1, value2, "category");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andCategoryNotBetween(String value1, String value2) {
       addCriterion("category not between", value1, value2, "category");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andCreatetimeIsNull() {
       addCriterion("createTime is null");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andCreatetimeIsNotNull() {
       addCriterion("createTime is not null");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andCreatetimeEqualTo(Date value) {
       addCriterion("createTime =", value, "createtime");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andCreatetimeNotEqualTo(Date value) {
       addCriterion("createTime <>", value, "createtime");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andCreatetimeGreaterThan(Date value) {
       addCriterion("createTime >", value, "createtime");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
       addCriterion("createTime >=", value, "createtime");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andCreatetimeLessThan(Date value) {
       addCriterion("createTime <", value, "createtime");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andCreatetimeLessThanOrEqualTo(Date value) {
       addCriterion("createTime <=", value, "createtime");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andCreatetimeIn(List<Date> values) {
       addCriterion("createTime in", values, "createtime");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andCreatetimeNotIn(List<Date> values) {
       addCriterion("createTime not in", values, "createtime");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andCreatetimeBetween(Date value1, Date value2) {
       addCriterion("createTime between", value1, value2, "createtime");
       return (TTemplateExample.Criteria)this;
     }
     
     public TTemplateExample.Criteria andCreatetimeNotBetween(Date value1, Date value2) {
       addCriterion("createTime not between", value1, value2, "createtime");
       return (TTemplateExample.Criteria)this;
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


