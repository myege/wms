 package com.zt.pojo.po;
 
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 public class JsSuppliesExample
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
     protected List<JsSuppliesExample.Criterion> criteria = new ArrayList<JsSuppliesExample.Criterion>();
 
     
     public boolean isValid() {
       return (this.criteria.size() > 0);
     }
     
     public List<JsSuppliesExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
     
     public List<JsSuppliesExample.Criterion> getCriteria() {
       return this.criteria;
     }
     
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new JsSuppliesExample.Criterion(condition));
     }
     
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new JsSuppliesExample.Criterion(condition, value));
     }
     
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if (value1 == null || value2 == null) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new JsSuppliesExample.Criterion(condition, value1, value2));
     }
     
     public JsSuppliesExample.Criteria andIdIsNull() {
       addCriterion("id is null");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andIdIsNotNull() {
       addCriterion("id is not null");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andIdEqualTo(Integer value) {
       addCriterion("id =", value, "id");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andIdNotEqualTo(Integer value) {
       addCriterion("id <>", value, "id");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andIdGreaterThan(Integer value) {
       addCriterion("id >", value, "id");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("id >=", value, "id");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andIdLessThan(Integer value) {
       addCriterion("id <", value, "id");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andIdLessThanOrEqualTo(Integer value) {
       addCriterion("id <=", value, "id");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andIdIn(List<Integer> values) {
       addCriterion("id in", values, "id");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andIdNotIn(List<Integer> values) {
       addCriterion("id not in", values, "id");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andIdBetween(Integer value1, Integer value2) {
       addCriterion("id between", value1, value2, "id");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
       addCriterion("id not between", value1, value2, "id");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andCompanycodeIsNull() {
       addCriterion("companyCode is null");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andCompanycodeIsNotNull() {
       addCriterion("companyCode is not null");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andCompanycodeEqualTo(String value) {
       addCriterion("companyCode =", value, "companycode");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andCompanycodeNotEqualTo(String value) {
       addCriterion("companyCode <>", value, "companycode");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andCompanycodeGreaterThan(String value) {
       addCriterion("companyCode >", value, "companycode");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andCompanycodeGreaterThanOrEqualTo(String value) {
       addCriterion("companyCode >=", value, "companycode");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andCompanycodeLessThan(String value) {
       addCriterion("companyCode <", value, "companycode");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andCompanycodeLessThanOrEqualTo(String value) {
       addCriterion("companyCode <=", value, "companycode");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andCompanycodeLike(String value) {
       addCriterion("companyCode like", value, "companycode");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andCompanycodeNotLike(String value) {
       addCriterion("companyCode not like", value, "companycode");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andCompanycodeIn(List<String> values) {
       addCriterion("companyCode in", values, "companycode");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andCompanycodeNotIn(List<String> values) {
       addCriterion("companyCode not in", values, "companycode");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andCompanycodeBetween(String value1, String value2) {
       addCriterion("companyCode between", value1, value2, "companycode");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andCompanycodeNotBetween(String value1, String value2) {
       addCriterion("companyCode not between", value1, value2, "companycode");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andMoneyIsNull() {
       addCriterion("money is null");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andMoneyIsNotNull() {
       addCriterion("money is not null");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andMoneyEqualTo(Double value) {
       addCriterion("money =", value, "money");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andMoneyNotEqualTo(Double value) {
       addCriterion("money <>", value, "money");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andMoneyGreaterThan(Double value) {
       addCriterion("money >", value, "money");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andMoneyGreaterThanOrEqualTo(Double value) {
       addCriterion("money >=", value, "money");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andMoneyLessThan(Double value) {
       addCriterion("money <", value, "money");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andMoneyLessThanOrEqualTo(Double value) {
       addCriterion("money <=", value, "money");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andMoneyIn(List<Double> values) {
       addCriterion("money in", values, "money");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andMoneyNotIn(List<Double> values) {
       addCriterion("money not in", values, "money");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andMoneyBetween(Double value1, Double value2) {
       addCriterion("money between", value1, value2, "money");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andMoneyNotBetween(Double value1, Double value2) {
       addCriterion("money not between", value1, value2, "money");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andPaystatusIsNull() {
       addCriterion("payStatus is null");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andPaystatusIsNotNull() {
       addCriterion("payStatus is not null");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andPaystatusEqualTo(Integer value) {
       addCriterion("payStatus =", value, "paystatus");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andPaystatusNotEqualTo(Integer value) {
       addCriterion("payStatus <>", value, "paystatus");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andPaystatusGreaterThan(Integer value) {
       addCriterion("payStatus >", value, "paystatus");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andPaystatusGreaterThanOrEqualTo(Integer value) {
       addCriterion("payStatus >=", value, "paystatus");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andPaystatusLessThan(Integer value) {
       addCriterion("payStatus <", value, "paystatus");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andPaystatusLessThanOrEqualTo(Integer value) {
       addCriterion("payStatus <=", value, "paystatus");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andPaystatusIn(List<Integer> values) {
       addCriterion("payStatus in", values, "paystatus");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andPaystatusNotIn(List<Integer> values) {
       addCriterion("payStatus not in", values, "paystatus");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andPaystatusBetween(Integer value1, Integer value2) {
       addCriterion("payStatus between", value1, value2, "paystatus");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andPaystatusNotBetween(Integer value1, Integer value2) {
       addCriterion("payStatus not between", value1, value2, "paystatus");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andBuytimeIsNull() {
       addCriterion("buyTime is null");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andBuytimeIsNotNull() {
       addCriterion("buyTime is not null");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andBuytimeEqualTo(String value) {
       addCriterion("buyTime =", value, "buytime");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andBuytimeNotEqualTo(String value) {
       addCriterion("buyTime <>", value, "buytime");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andBuytimeGreaterThan(String value) {
       addCriterion("buyTime >", value, "buytime");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andBuytimeGreaterThanOrEqualTo(String value) {
       addCriterion("buyTime >=", value, "buytime");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andBuytimeLessThan(String value) {
       addCriterion("buyTime <", value, "buytime");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andBuytimeLessThanOrEqualTo(String value) {
       addCriterion("buyTime <=", value, "buytime");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andBuytimeLike(String value) {
       addCriterion("buyTime like", value, "buytime");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andBuytimeNotLike(String value) {
       addCriterion("buyTime not like", value, "buytime");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andBuytimeIn(List<String> values) {
       addCriterion("buyTime in", values, "buytime");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andBuytimeNotIn(List<String> values) {
       addCriterion("buyTime not in", values, "buytime");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andBuytimeBetween(String value1, String value2) {
       addCriterion("buyTime between", value1, value2, "buytime");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andBuytimeNotBetween(String value1, String value2) {
       addCriterion("buyTime not between", value1, value2, "buytime");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andPaytimeIsNull() {
       addCriterion("payTime is null");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andPaytimeIsNotNull() {
       addCriterion("payTime is not null");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andPaytimeEqualTo(Date value) {
       addCriterion("payTime =", value, "paytime");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andPaytimeNotEqualTo(Date value) {
       addCriterion("payTime <>", value, "paytime");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andPaytimeGreaterThan(Date value) {
       addCriterion("payTime >", value, "paytime");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andPaytimeGreaterThanOrEqualTo(Date value) {
       addCriterion("payTime >=", value, "paytime");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andPaytimeLessThan(Date value) {
       addCriterion("payTime <", value, "paytime");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andPaytimeLessThanOrEqualTo(Date value) {
       addCriterion("payTime <=", value, "paytime");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andPaytimeIn(List<Date> values) {
       addCriterion("payTime in", values, "paytime");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andPaytimeNotIn(List<Date> values) {
       addCriterion("payTime not in", values, "paytime");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andPaytimeBetween(Date value1, Date value2) {
       addCriterion("payTime between", value1, value2, "paytime");
       return (JsSuppliesExample.Criteria)this;
     }
     
     public JsSuppliesExample.Criteria andPaytimeNotBetween(Date value1, Date value2) {
       addCriterion("payTime not between", value1, value2, "paytime");
       return (JsSuppliesExample.Criteria)this;
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


