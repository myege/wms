 package com.zt.pojo.po;
 
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 public class TUsersExample
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
     protected List<TUsersExample.Criterion> criteria = new ArrayList<TUsersExample.Criterion>();
 
     
     public boolean isValid() {
       return (this.criteria.size() > 0);
     }
     
     public List<TUsersExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
     
     public List<TUsersExample.Criterion> getCriteria() {
       return this.criteria;
     }
     
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new TUsersExample.Criterion(condition));
     }
     
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new TUsersExample.Criterion(condition, value));
     }
     
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if (value1 == null || value2 == null) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new TUsersExample.Criterion(condition, value1, value2));
     }
     
     public TUsersExample.Criteria andIdIsNull() {
       addCriterion("id is null");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andIdIsNotNull() {
       addCriterion("id is not null");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andIdEqualTo(Integer value) {
       addCriterion("id =", value, "id");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andIdNotEqualTo(Integer value) {
       addCriterion("id <>", value, "id");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andIdGreaterThan(Integer value) {
       addCriterion("id >", value, "id");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("id >=", value, "id");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andIdLessThan(Integer value) {
       addCriterion("id <", value, "id");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andIdLessThanOrEqualTo(Integer value) {
       addCriterion("id <=", value, "id");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andIdIn(List<Integer> values) {
       addCriterion("id in", values, "id");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andIdNotIn(List<Integer> values) {
       addCriterion("id not in", values, "id");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andIdBetween(Integer value1, Integer value2) {
       addCriterion("id between", value1, value2, "id");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
       addCriterion("id not between", value1, value2, "id");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andUsernameIsNull() {
       addCriterion("userName is null");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andUsernameIsNotNull() {
       addCriterion("userName is not null");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andUsernameEqualTo(String value) {
       addCriterion("userName =", value, "username");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andUsernameNotEqualTo(String value) {
       addCriterion("userName <>", value, "username");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andUsernameGreaterThan(String value) {
       addCriterion("userName >", value, "username");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andUsernameGreaterThanOrEqualTo(String value) {
       addCriterion("userName >=", value, "username");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andUsernameLessThan(String value) {
       addCriterion("userName <", value, "username");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andUsernameLessThanOrEqualTo(String value) {
       addCriterion("userName <=", value, "username");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andUsernameLike(String value) {
       addCriterion("userName like", value, "username");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andUsernameNotLike(String value) {
       addCriterion("userName not like", value, "username");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andUsernameIn(List<String> values) {
       addCriterion("userName in", values, "username");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andUsernameNotIn(List<String> values) {
       addCriterion("userName not in", values, "username");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andUsernameBetween(String value1, String value2) {
       addCriterion("userName between", value1, value2, "username");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andUsernameNotBetween(String value1, String value2) {
       addCriterion("userName not between", value1, value2, "username");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andPasswordIsNull() {
       addCriterion("password is null");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andPasswordIsNotNull() {
       addCriterion("password is not null");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andPasswordEqualTo(String value) {
       addCriterion("password =", value, "password");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andPasswordNotEqualTo(String value) {
       addCriterion("password <>", value, "password");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andPasswordGreaterThan(String value) {
       addCriterion("password >", value, "password");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andPasswordGreaterThanOrEqualTo(String value) {
       addCriterion("password >=", value, "password");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andPasswordLessThan(String value) {
       addCriterion("password <", value, "password");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andPasswordLessThanOrEqualTo(String value) {
       addCriterion("password <=", value, "password");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andPasswordLike(String value) {
       addCriterion("password like", value, "password");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andPasswordNotLike(String value) {
       addCriterion("password not like", value, "password");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andPasswordIn(List<String> values) {
       addCriterion("password in", values, "password");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andPasswordNotIn(List<String> values) {
       addCriterion("password not in", values, "password");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andPasswordBetween(String value1, String value2) {
       addCriterion("password between", value1, value2, "password");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andPasswordNotBetween(String value1, String value2) {
       addCriterion("password not between", value1, value2, "password");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andNameIsNull() {
       addCriterion("name is null");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andNameIsNotNull() {
       addCriterion("name is not null");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andNameEqualTo(String value) {
       addCriterion("name =", value, "name");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andNameNotEqualTo(String value) {
       addCriterion("name <>", value, "name");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andNameGreaterThan(String value) {
       addCriterion("name >", value, "name");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andNameGreaterThanOrEqualTo(String value) {
       addCriterion("name >=", value, "name");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andNameLessThan(String value) {
       addCriterion("name <", value, "name");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andNameLessThanOrEqualTo(String value) {
       addCriterion("name <=", value, "name");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andNameLike(String value) {
       addCriterion("name like", value, "name");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andNameNotLike(String value) {
       addCriterion("name not like", value, "name");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andNameIn(List<String> values) {
       addCriterion("name in", values, "name");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andNameNotIn(List<String> values) {
       addCriterion("name not in", values, "name");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andNameBetween(String value1, String value2) {
       addCriterion("name between", value1, value2, "name");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andNameNotBetween(String value1, String value2) {
       addCriterion("name not between", value1, value2, "name");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andModularIsNull() {
       addCriterion("modular is null");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andModularIsNotNull() {
       addCriterion("modular is not null");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andModularEqualTo(String value) {
       addCriterion("modular =", value, "modular");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andModularNotEqualTo(String value) {
       addCriterion("modular <>", value, "modular");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andModularGreaterThan(String value) {
       addCriterion("modular >", value, "modular");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andModularGreaterThanOrEqualTo(String value) {
       addCriterion("modular >=", value, "modular");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andModularLessThan(String value) {
       addCriterion("modular <", value, "modular");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andModularLessThanOrEqualTo(String value) {
       addCriterion("modular <=", value, "modular");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andModularLike(String value) {
       addCriterion("modular like", value, "modular");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andModularNotLike(String value) {
       addCriterion("modular not like", value, "modular");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andModularIn(List<String> values) {
       addCriterion("modular in", values, "modular");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andModularNotIn(List<String> values) {
       addCriterion("modular not in", values, "modular");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andModularBetween(String value1, String value2) {
       addCriterion("modular between", value1, value2, "modular");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andModularNotBetween(String value1, String value2) {
       addCriterion("modular not between", value1, value2, "modular");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andCompanycodeIsNull() {
       addCriterion("companyCode is null");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andCompanycodeIsNotNull() {
       addCriterion("companyCode is not null");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andCompanycodeEqualTo(String value) {
       addCriterion("companyCode =", value, "companycode");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andCompanycodeNotEqualTo(String value) {
       addCriterion("companyCode <>", value, "companycode");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andCompanycodeGreaterThan(String value) {
       addCriterion("companyCode >", value, "companycode");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andCompanycodeGreaterThanOrEqualTo(String value) {
       addCriterion("companyCode >=", value, "companycode");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andCompanycodeLessThan(String value) {
       addCriterion("companyCode <", value, "companycode");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andCompanycodeLessThanOrEqualTo(String value) {
       addCriterion("companyCode <=", value, "companycode");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andCompanycodeLike(String value) {
       addCriterion("companyCode like", value, "companycode");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andCompanycodeNotLike(String value) {
       addCriterion("companyCode not like", value, "companycode");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andCompanycodeIn(List<String> values) {
       addCriterion("companyCode in", values, "companycode");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andCompanycodeNotIn(List<String> values) {
       addCriterion("companyCode not in", values, "companycode");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andCompanycodeBetween(String value1, String value2) {
       addCriterion("companyCode between", value1, value2, "companycode");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andCompanycodeNotBetween(String value1, String value2) {
       addCriterion("companyCode not between", value1, value2, "companycode");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andCreatetimeIsNull() {
       addCriterion("createTime is null");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andCreatetimeIsNotNull() {
       addCriterion("createTime is not null");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andCreatetimeEqualTo(Date value) {
       addCriterion("createTime =", value, "createtime");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andCreatetimeNotEqualTo(Date value) {
       addCriterion("createTime <>", value, "createtime");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andCreatetimeGreaterThan(Date value) {
       addCriterion("createTime >", value, "createtime");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
       addCriterion("createTime >=", value, "createtime");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andCreatetimeLessThan(Date value) {
       addCriterion("createTime <", value, "createtime");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andCreatetimeLessThanOrEqualTo(Date value) {
       addCriterion("createTime <=", value, "createtime");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andCreatetimeIn(List<Date> values) {
       addCriterion("createTime in", values, "createtime");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andCreatetimeNotIn(List<Date> values) {
       addCriterion("createTime not in", values, "createtime");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andCreatetimeBetween(Date value1, Date value2) {
       addCriterion("createTime between", value1, value2, "createtime");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andCreatetimeNotBetween(Date value1, Date value2) {
       addCriterion("createTime not between", value1, value2, "createtime");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andIsdeleteIsNull() {
       addCriterion("isDelete is null");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andIsdeleteIsNotNull() {
       addCriterion("isDelete is not null");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andIsdeleteEqualTo(Integer value) {
       addCriterion("isDelete =", value, "isdelete");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andIsdeleteNotEqualTo(Integer value) {
       addCriterion("isDelete <>", value, "isdelete");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andIsdeleteGreaterThan(Integer value) {
       addCriterion("isDelete >", value, "isdelete");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andIsdeleteGreaterThanOrEqualTo(Integer value) {
       addCriterion("isDelete >=", value, "isdelete");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andIsdeleteLessThan(Integer value) {
       addCriterion("isDelete <", value, "isdelete");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andIsdeleteLessThanOrEqualTo(Integer value) {
       addCriterion("isDelete <=", value, "isdelete");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andIsdeleteIn(List<Integer> values) {
       addCriterion("isDelete in", values, "isdelete");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andIsdeleteNotIn(List<Integer> values) {
       addCriterion("isDelete not in", values, "isdelete");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andIsdeleteBetween(Integer value1, Integer value2) {
       addCriterion("isDelete between", value1, value2, "isdelete");
       return (TUsersExample.Criteria)this;
     }
     
     public TUsersExample.Criteria andIsdeleteNotBetween(Integer value1, Integer value2) {
       addCriterion("isDelete not between", value1, value2, "isdelete");
       return (TUsersExample.Criteria)this;
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


