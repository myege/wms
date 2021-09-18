 package com.zt.pojo.po;
 
 import java.util.ArrayList;
 import java.util.List;
 public class WebportExample
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
     protected List<WebportExample.Criterion> criteria = new ArrayList<WebportExample.Criterion>();
 
     
     public boolean isValid() {
       return (this.criteria.size() > 0);
     }
     
     public List<WebportExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
     
     public List<WebportExample.Criterion> getCriteria() {
       return this.criteria;
     }
     
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new WebportExample.Criterion(condition));
     }
     
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new WebportExample.Criterion(condition, value));
     }
     
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if (value1 == null || value2 == null) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new WebportExample.Criterion(condition, value1, value2));
     }
     
     public WebportExample.Criteria andIdIsNull() {
       addCriterion("id is null");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andIdIsNotNull() {
       addCriterion("id is not null");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andIdEqualTo(Integer value) {
       addCriterion("id =", value, "id");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andIdNotEqualTo(Integer value) {
       addCriterion("id <>", value, "id");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andIdGreaterThan(Integer value) {
       addCriterion("id >", value, "id");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("id >=", value, "id");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andIdLessThan(Integer value) {
       addCriterion("id <", value, "id");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andIdLessThanOrEqualTo(Integer value) {
       addCriterion("id <=", value, "id");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andIdIn(List<Integer> values) {
       addCriterion("id in", values, "id");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andIdNotIn(List<Integer> values) {
       addCriterion("id not in", values, "id");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andIdBetween(Integer value1, Integer value2) {
       addCriterion("id between", value1, value2, "id");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
       addCriterion("id not between", value1, value2, "id");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andUrlIsNull() {
       addCriterion("Url is null");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andUrlIsNotNull() {
       addCriterion("Url is not null");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andUrlEqualTo(String value) {
       addCriterion("Url =", value, "url");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andUrlNotEqualTo(String value) {
       addCriterion("Url <>", value, "url");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andUrlGreaterThan(String value) {
       addCriterion("Url >", value, "url");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andUrlGreaterThanOrEqualTo(String value) {
       addCriterion("Url >=", value, "url");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andUrlLessThan(String value) {
       addCriterion("Url <", value, "url");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andUrlLessThanOrEqualTo(String value) {
       addCriterion("Url <=", value, "url");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andUrlLike(String value) {
       addCriterion("Url like", value, "url");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andUrlNotLike(String value) {
       addCriterion("Url not like", value, "url");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andUrlIn(List<String> values) {
       addCriterion("Url in", values, "url");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andUrlNotIn(List<String> values) {
       addCriterion("Url not in", values, "url");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andUrlBetween(String value1, String value2) {
       addCriterion("Url between", value1, value2, "url");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andUrlNotBetween(String value1, String value2) {
       addCriterion("Url not between", value1, value2, "url");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andTabIsNull() {
       addCriterion("tab is null");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andTabIsNotNull() {
       addCriterion("tab is not null");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andTabEqualTo(String value) {
       addCriterion("tab =", value, "tab");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andTabNotEqualTo(String value) {
       addCriterion("tab <>", value, "tab");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andTabGreaterThan(String value) {
       addCriterion("tab >", value, "tab");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andTabGreaterThanOrEqualTo(String value) {
       addCriterion("tab >=", value, "tab");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andTabLessThan(String value) {
       addCriterion("tab <", value, "tab");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andTabLessThanOrEqualTo(String value) {
       addCriterion("tab <=", value, "tab");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andTabLike(String value) {
       addCriterion("tab like", value, "tab");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andTabNotLike(String value) {
       addCriterion("tab not like", value, "tab");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andTabIn(List<String> values) {
       addCriterion("tab in", values, "tab");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andTabNotIn(List<String> values) {
       addCriterion("tab not in", values, "tab");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andTabBetween(String value1, String value2) {
       addCriterion("tab between", value1, value2, "tab");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andTabNotBetween(String value1, String value2) {
       addCriterion("tab not between", value1, value2, "tab");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andCodeIsNull() {
       addCriterion("Code is null");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andCodeIsNotNull() {
       addCriterion("Code is not null");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andCodeEqualTo(String value) {
       addCriterion("Code =", value, "code");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andCodeNotEqualTo(String value) {
       addCriterion("Code <>", value, "code");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andCodeGreaterThan(String value) {
       addCriterion("Code >", value, "code");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andCodeGreaterThanOrEqualTo(String value) {
       addCriterion("Code >=", value, "code");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andCodeLessThan(String value) {
       addCriterion("Code <", value, "code");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andCodeLessThanOrEqualTo(String value) {
       addCriterion("Code <=", value, "code");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andCodeLike(String value) {
       addCriterion("Code like", value, "code");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andCodeNotLike(String value) {
       addCriterion("Code not like", value, "code");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andCodeIn(List<String> values) {
       addCriterion("Code in", values, "code");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andCodeNotIn(List<String> values) {
       addCriterion("Code not in", values, "code");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andCodeBetween(String value1, String value2) {
       addCriterion("Code between", value1, value2, "code");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andCodeNotBetween(String value1, String value2) {
       addCriterion("Code not between", value1, value2, "code");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andBmIsNull() {
       addCriterion("bm is null");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andBmIsNotNull() {
       addCriterion("bm is not null");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andBmEqualTo(String value) {
       addCriterion("bm =", value, "bm");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andBmNotEqualTo(String value) {
       addCriterion("bm <>", value, "bm");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andBmGreaterThan(String value) {
       addCriterion("bm >", value, "bm");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andBmGreaterThanOrEqualTo(String value) {
       addCriterion("bm >=", value, "bm");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andBmLessThan(String value) {
       addCriterion("bm <", value, "bm");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andBmLessThanOrEqualTo(String value) {
       addCriterion("bm <=", value, "bm");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andBmLike(String value) {
       addCriterion("bm like", value, "bm");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andBmNotLike(String value) {
       addCriterion("bm not like", value, "bm");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andBmIn(List<String> values) {
       addCriterion("bm in", values, "bm");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andBmNotIn(List<String> values) {
       addCriterion("bm not in", values, "bm");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andBmBetween(String value1, String value2) {
       addCriterion("bm between", value1, value2, "bm");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andBmNotBetween(String value1, String value2) {
       addCriterion("bm not between", value1, value2, "bm");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andTjIsNull() {
       addCriterion("tj is null");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andTjIsNotNull() {
       addCriterion("tj is not null");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andTjEqualTo(String value) {
       addCriterion("tj =", value, "tj");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andTjNotEqualTo(String value) {
       addCriterion("tj <>", value, "tj");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andTjGreaterThan(String value) {
       addCriterion("tj >", value, "tj");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andTjGreaterThanOrEqualTo(String value) {
       addCriterion("tj >=", value, "tj");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andTjLessThan(String value) {
       addCriterion("tj <", value, "tj");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andTjLessThanOrEqualTo(String value) {
       addCriterion("tj <=", value, "tj");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andTjLike(String value) {
       addCriterion("tj like", value, "tj");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andTjNotLike(String value) {
       addCriterion("tj not like", value, "tj");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andTjIn(List<String> values) {
       addCriterion("tj in", values, "tj");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andTjNotIn(List<String> values) {
       addCriterion("tj not in", values, "tj");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andTjBetween(String value1, String value2) {
       addCriterion("tj between", value1, value2, "tj");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andTjNotBetween(String value1, String value2) {
       addCriterion("tj not between", value1, value2, "tj");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andAddrIsNull() {
       addCriterion("addr is null");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andAddrIsNotNull() {
       addCriterion("addr is not null");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andAddrEqualTo(String value) {
       addCriterion("addr =", value, "addr");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andAddrNotEqualTo(String value) {
       addCriterion("addr <>", value, "addr");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andAddrGreaterThan(String value) {
       addCriterion("addr >", value, "addr");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andAddrGreaterThanOrEqualTo(String value) {
       addCriterion("addr >=", value, "addr");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andAddrLessThan(String value) {
       addCriterion("addr <", value, "addr");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andAddrLessThanOrEqualTo(String value) {
       addCriterion("addr <=", value, "addr");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andAddrLike(String value) {
       addCriterion("addr like", value, "addr");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andAddrNotLike(String value) {
       addCriterion("addr not like", value, "addr");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andAddrIn(List<String> values) {
       addCriterion("addr in", values, "addr");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andAddrNotIn(List<String> values) {
       addCriterion("addr not in", values, "addr");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andAddrBetween(String value1, String value2) {
       addCriterion("addr between", value1, value2, "addr");
       return (WebportExample.Criteria)this;
     }
     
     public WebportExample.Criteria andAddrNotBetween(String value1, String value2) {
       addCriterion("addr not between", value1, value2, "addr");
       return (WebportExample.Criteria)this;
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


