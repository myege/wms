 package com.zt.pojo.po;
 
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 public class TOrderClosingExample
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
     protected List<TOrderClosingExample.Criterion> criteria = new ArrayList<TOrderClosingExample.Criterion>();
 
     
     public boolean isValid() {
       return (this.criteria.size() > 0);
     }
     
     public List<TOrderClosingExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
     
     public List<TOrderClosingExample.Criterion> getCriteria() {
       return this.criteria;
     }
     
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new TOrderClosingExample.Criterion(condition));
     }
     
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new TOrderClosingExample.Criterion(condition, value));
     }
     
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if (value1 == null || value2 == null) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new TOrderClosingExample.Criterion(condition, value1, value2));
     }
     
     public TOrderClosingExample.Criteria andIdIsNull() {
       addCriterion("id is null");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andIdIsNotNull() {
       addCriterion("id is not null");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andIdEqualTo(Integer value) {
       addCriterion("id =", value, "id");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andIdNotEqualTo(Integer value) {
       addCriterion("id <>", value, "id");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andIdGreaterThan(Integer value) {
       addCriterion("id >", value, "id");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("id >=", value, "id");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andIdLessThan(Integer value) {
       addCriterion("id <", value, "id");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andIdLessThanOrEqualTo(Integer value) {
       addCriterion("id <=", value, "id");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andIdIn(List<Integer> values) {
       addCriterion("id in", values, "id");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andIdNotIn(List<Integer> values) {
       addCriterion("id not in", values, "id");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andIdBetween(Integer value1, Integer value2) {
       addCriterion("id between", value1, value2, "id");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
       addCriterion("id not between", value1, value2, "id");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOrdernoIsNull() {
       addCriterion("orderNo is null");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOrdernoIsNotNull() {
       addCriterion("orderNo is not null");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOrdernoEqualTo(String value) {
       addCriterion("orderNo =", value, "orderno");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOrdernoNotEqualTo(String value) {
       addCriterion("orderNo <>", value, "orderno");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOrdernoGreaterThan(String value) {
       addCriterion("orderNo >", value, "orderno");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOrdernoGreaterThanOrEqualTo(String value) {
       addCriterion("orderNo >=", value, "orderno");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOrdernoLessThan(String value) {
       addCriterion("orderNo <", value, "orderno");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOrdernoLessThanOrEqualTo(String value) {
       addCriterion("orderNo <=", value, "orderno");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOrdernoLike(String value) {
       addCriterion("orderNo like", value, "orderno");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOrdernoNotLike(String value) {
       addCriterion("orderNo not like", value, "orderno");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOrdernoIn(List<String> values) {
       addCriterion("orderNo in", values, "orderno");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOrdernoNotIn(List<String> values) {
       addCriterion("orderNo not in", values, "orderno");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOrdernoBetween(String value1, String value2) {
       addCriterion("orderNo between", value1, value2, "orderno");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOrdernoNotBetween(String value1, String value2) {
       addCriterion("orderNo not between", value1, value2, "orderno");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andCompanynoIsNull() {
       addCriterion("companyNo is null");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andCompanynoIsNotNull() {
       addCriterion("companyNo is not null");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andCompanynoEqualTo(String value) {
       addCriterion("companyNo =", value, "companyno");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andCompanynoNotEqualTo(String value) {
       addCriterion("companyNo <>", value, "companyno");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andCompanynoGreaterThan(String value) {
       addCriterion("companyNo >", value, "companyno");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andCompanynoGreaterThanOrEqualTo(String value) {
       addCriterion("companyNo >=", value, "companyno");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andCompanynoLessThan(String value) {
       addCriterion("companyNo <", value, "companyno");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andCompanynoLessThanOrEqualTo(String value) {
       addCriterion("companyNo <=", value, "companyno");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andCompanynoLike(String value) {
       addCriterion("companyNo like", value, "companyno");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andCompanynoNotLike(String value) {
       addCriterion("companyNo not like", value, "companyno");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andCompanynoIn(List<String> values) {
       addCriterion("companyNo in", values, "companyno");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andCompanynoNotIn(List<String> values) {
       addCriterion("companyNo not in", values, "companyno");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andCompanynoBetween(String value1, String value2) {
       addCriterion("companyNo between", value1, value2, "companyno");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andCompanynoNotBetween(String value1, String value2) {
       addCriterion("companyNo not between", value1, value2, "companyno");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andBournIsNull() {
       addCriterion("bourn is null");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andBournIsNotNull() {
       addCriterion("bourn is not null");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andBournEqualTo(String value) {
       addCriterion("bourn =", value, "bourn");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andBournNotEqualTo(String value) {
       addCriterion("bourn <>", value, "bourn");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andBournGreaterThan(String value) {
       addCriterion("bourn >", value, "bourn");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andBournGreaterThanOrEqualTo(String value) {
       addCriterion("bourn >=", value, "bourn");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andBournLessThan(String value) {
       addCriterion("bourn <", value, "bourn");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andBournLessThanOrEqualTo(String value) {
       addCriterion("bourn <=", value, "bourn");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andBournLike(String value) {
       addCriterion("bourn like", value, "bourn");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andBournNotLike(String value) {
       addCriterion("bourn not like", value, "bourn");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andBournIn(List<String> values) {
       addCriterion("bourn in", values, "bourn");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andBournNotIn(List<String> values) {
       addCriterion("bourn not in", values, "bourn");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andBournBetween(String value1, String value2) {
       addCriterion("bourn between", value1, value2, "bourn");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andBournNotBetween(String value1, String value2) {
       addCriterion("bourn not between", value1, value2, "bourn");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andInitialIsNull() {
       addCriterion("initial is null");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andInitialIsNotNull() {
       addCriterion("initial is not null");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andInitialEqualTo(String value) {
       addCriterion("initial =", value, "initial");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andInitialNotEqualTo(String value) {
       addCriterion("initial <>", value, "initial");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andInitialGreaterThan(String value) {
       addCriterion("initial >", value, "initial");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andInitialGreaterThanOrEqualTo(String value) {
       addCriterion("initial >=", value, "initial");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andInitialLessThan(String value) {
       addCriterion("initial <", value, "initial");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andInitialLessThanOrEqualTo(String value) {
       addCriterion("initial <=", value, "initial");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andInitialLike(String value) {
       addCriterion("initial like", value, "initial");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andInitialNotLike(String value) {
       addCriterion("initial not like", value, "initial");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andInitialIn(List<String> values) {
       addCriterion("initial in", values, "initial");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andInitialNotIn(List<String> values) {
       addCriterion("initial not in", values, "initial");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andInitialBetween(String value1, String value2) {
       addCriterion("initial between", value1, value2, "initial");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andInitialNotBetween(String value1, String value2) {
       addCriterion("initial not between", value1, value2, "initial");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andWeightIsNull() {
       addCriterion("weight is null");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andWeightIsNotNull() {
       addCriterion("weight is not null");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andWeightEqualTo(Double value) {
       addCriterion("weight =", value, "weight");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andWeightNotEqualTo(Double value) {
       addCriterion("weight <>", value, "weight");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andWeightGreaterThan(Double value) {
       addCriterion("weight >", value, "weight");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andWeightGreaterThanOrEqualTo(Double value) {
       addCriterion("weight >=", value, "weight");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andWeightLessThan(Double value) {
       addCriterion("weight <", value, "weight");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andWeightLessThanOrEqualTo(Double value) {
       addCriterion("weight <=", value, "weight");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andWeightIn(List<Double> values) {
       addCriterion("weight in", values, "weight");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andWeightNotIn(List<Double> values) {
       addCriterion("weight not in", values, "weight");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andWeightBetween(Double value1, Double value2) {
       addCriterion("weight between", value1, value2, "weight");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andWeightNotBetween(Double value1, Double value2) {
       addCriterion("weight not between", value1, value2, "weight");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andExperssnoIsNull() {
       addCriterion("experssno is null");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andExperssnoIsNotNull() {
       addCriterion("experssno is not null");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andExperssnoEqualTo(String value) {
       addCriterion("experssno =", value, "experssno");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andExperssnoNotEqualTo(String value) {
       addCriterion("experssno <>", value, "experssno");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andExperssnoGreaterThan(String value) {
       addCriterion("experssno >", value, "experssno");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andExperssnoGreaterThanOrEqualTo(String value) {
       addCriterion("experssno >=", value, "experssno");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andExperssnoLessThan(String value) {
       addCriterion("experssno <", value, "experssno");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andExperssnoLessThanOrEqualTo(String value) {
       addCriterion("experssno <=", value, "experssno");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andExperssnoLike(String value) {
       addCriterion("experssno like", value, "experssno");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andExperssnoNotLike(String value) {
       addCriterion("experssno not like", value, "experssno");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andExperssnoIn(List<String> values) {
       addCriterion("experssno in", values, "experssno");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andExperssnoNotIn(List<String> values) {
       addCriterion("experssno not in", values, "experssno");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andExperssnoBetween(String value1, String value2) {
       addCriterion("experssno between", value1, value2, "experssno");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andExperssnoNotBetween(String value1, String value2) {
       addCriterion("experssno not between", value1, value2, "experssno");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andTypeIsNull() {
       addCriterion("type is null");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andTypeIsNotNull() {
       addCriterion("type is not null");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andTypeEqualTo(Integer value) {
       addCriterion("type =", value, "type");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andTypeNotEqualTo(Integer value) {
       addCriterion("type <>", value, "type");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andTypeGreaterThan(Integer value) {
       addCriterion("type >", value, "type");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andTypeGreaterThanOrEqualTo(Integer value) {
       addCriterion("type >=", value, "type");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andTypeLessThan(Integer value) {
       addCriterion("type <", value, "type");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andTypeLessThanOrEqualTo(Integer value) {
       addCriterion("type <=", value, "type");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andTypeIn(List<Integer> values) {
       addCriterion("type in", values, "type");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andTypeNotIn(List<Integer> values) {
       addCriterion("type not in", values, "type");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andTypeBetween(Integer value1, Integer value2) {
       addCriterion("type between", value1, value2, "type");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andTypeNotBetween(Integer value1, Integer value2) {
       addCriterion("type not between", value1, value2, "type");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andMoneyIsNull() {
       addCriterion("money is null");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andMoneyIsNotNull() {
       addCriterion("money is not null");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andMoneyEqualTo(Double value) {
       addCriterion("money =", value, "money");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andMoneyNotEqualTo(Double value) {
       addCriterion("money <>", value, "money");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andMoneyGreaterThan(Double value) {
       addCriterion("money >", value, "money");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andMoneyGreaterThanOrEqualTo(Double value) {
       addCriterion("money >=", value, "money");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andMoneyLessThan(Double value) {
       addCriterion("money <", value, "money");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andMoneyLessThanOrEqualTo(Double value) {
       addCriterion("money <=", value, "money");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andMoneyIn(List<Double> values) {
       addCriterion("money in", values, "money");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andMoneyNotIn(List<Double> values) {
       addCriterion("money not in", values, "money");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andMoneyBetween(Double value1, Double value2) {
       addCriterion("money between", value1, value2, "money");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andMoneyNotBetween(Double value1, Double value2) {
       addCriterion("money not between", value1, value2, "money");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andCreatetimeIsNull() {
       addCriterion("createTime is null");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andCreatetimeIsNotNull() {
       addCriterion("createTime is not null");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andCreatetimeEqualTo(Date value) {
       addCriterion("createTime =", value, "createtime");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andCreatetimeNotEqualTo(Date value) {
       addCriterion("createTime <>", value, "createtime");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andCreatetimeGreaterThan(Date value) {
       addCriterion("createTime >", value, "createtime");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
       addCriterion("createTime >=", value, "createtime");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andCreatetimeLessThan(Date value) {
       addCriterion("createTime <", value, "createtime");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andCreatetimeLessThanOrEqualTo(Date value) {
       addCriterion("createTime <=", value, "createtime");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andCreatetimeIn(List<Date> values) {
       addCriterion("createTime in", values, "createtime");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andCreatetimeNotIn(List<Date> values) {
       addCriterion("createTime not in", values, "createtime");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andCreatetimeBetween(Date value1, Date value2) {
       addCriterion("createTime between", value1, value2, "createtime");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andCreatetimeNotBetween(Date value1, Date value2) {
       addCriterion("createTime not between", value1, value2, "createtime");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andEndtimeIsNull() {
       addCriterion("endTime is null");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andEndtimeIsNotNull() {
       addCriterion("endTime is not null");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andEndtimeEqualTo(Date value) {
       addCriterion("endTime =", value, "endtime");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andEndtimeNotEqualTo(Date value) {
       addCriterion("endTime <>", value, "endtime");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andEndtimeGreaterThan(Date value) {
       addCriterion("endTime >", value, "endtime");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
       addCriterion("endTime >=", value, "endtime");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andEndtimeLessThan(Date value) {
       addCriterion("endTime <", value, "endtime");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andEndtimeLessThanOrEqualTo(Date value) {
       addCriterion("endTime <=", value, "endtime");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andEndtimeIn(List<Date> values) {
       addCriterion("endTime in", values, "endtime");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andEndtimeNotIn(List<Date> values) {
       addCriterion("endTime not in", values, "endtime");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andEndtimeBetween(Date value1, Date value2) {
       addCriterion("endTime between", value1, value2, "endtime");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andEndtimeNotBetween(Date value1, Date value2) {
       addCriterion("endTime not between", value1, value2, "endtime");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andExperssIsNull() {
       addCriterion("experss is null");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andExperssIsNotNull() {
       addCriterion("experss is not null");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andExperssEqualTo(String value) {
       addCriterion("experss =", value, "experss");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andExperssNotEqualTo(String value) {
       addCriterion("experss <>", value, "experss");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andExperssGreaterThan(String value) {
       addCriterion("experss >", value, "experss");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andExperssGreaterThanOrEqualTo(String value) {
       addCriterion("experss >=", value, "experss");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andExperssLessThan(String value) {
       addCriterion("experss <", value, "experss");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andExperssLessThanOrEqualTo(String value) {
       addCriterion("experss <=", value, "experss");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andExperssLike(String value) {
       addCriterion("experss like", value, "experss");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andExperssNotLike(String value) {
       addCriterion("experss not like", value, "experss");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andExperssIn(List<String> values) {
       addCriterion("experss in", values, "experss");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andExperssNotIn(List<String> values) {
       addCriterion("experss not in", values, "experss");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andExperssBetween(String value1, String value2) {
       addCriterion("experss between", value1, value2, "experss");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andExperssNotBetween(String value1, String value2) {
       addCriterion("experss not between", value1, value2, "experss");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOutmoneyIsNull() {
       addCriterion("outMoney is null");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOutmoneyIsNotNull() {
       addCriterion("outMoney is not null");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOutmoneyEqualTo(Double value) {
       addCriterion("outMoney =", value, "outmoney");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOutmoneyNotEqualTo(Double value) {
       addCriterion("outMoney <>", value, "outmoney");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOutmoneyGreaterThan(Double value) {
       addCriterion("outMoney >", value, "outmoney");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOutmoneyGreaterThanOrEqualTo(Double value) {
       addCriterion("outMoney >=", value, "outmoney");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOutmoneyLessThan(Double value) {
       addCriterion("outMoney <", value, "outmoney");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOutmoneyLessThanOrEqualTo(Double value) {
       addCriterion("outMoney <=", value, "outmoney");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOutmoneyIn(List<Double> values) {
       addCriterion("outMoney in", values, "outmoney");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOutmoneyNotIn(List<Double> values) {
       addCriterion("outMoney not in", values, "outmoney");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOutmoneyBetween(Double value1, Double value2) {
       addCriterion("outMoney between", value1, value2, "outmoney");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOutmoneyNotBetween(Double value1, Double value2) {
       addCriterion("outMoney not between", value1, value2, "outmoney");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOuttimeIsNull() {
       addCriterion("outTime is null");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOuttimeIsNotNull() {
       addCriterion("outTime is not null");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOuttimeEqualTo(Date value) {
       addCriterion("outTime =", value, "outtime");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOuttimeNotEqualTo(Date value) {
       addCriterion("outTime <>", value, "outtime");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOuttimeGreaterThan(Date value) {
       addCriterion("outTime >", value, "outtime");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOuttimeGreaterThanOrEqualTo(Date value) {
       addCriterion("outTime >=", value, "outtime");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOuttimeLessThan(Date value) {
       addCriterion("outTime <", value, "outtime");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOuttimeLessThanOrEqualTo(Date value) {
       addCriterion("outTime <=", value, "outtime");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOuttimeIn(List<Date> values) {
       addCriterion("outTime in", values, "outtime");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOuttimeNotIn(List<Date> values) {
       addCriterion("outTime not in", values, "outtime");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOuttimeBetween(Date value1, Date value2) {
       addCriterion("outTime between", value1, value2, "outtime");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOuttimeNotBetween(Date value1, Date value2) {
       addCriterion("outTime not between", value1, value2, "outtime");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOuttypeIsNull() {
       addCriterion("outtype is null");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOuttypeIsNotNull() {
       addCriterion("outtype is not null");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOuttypeEqualTo(Integer value) {
       addCriterion("outtype =", value, "outtype");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOuttypeNotEqualTo(Integer value) {
       addCriterion("outtype <>", value, "outtype");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOuttypeGreaterThan(Integer value) {
       addCriterion("outtype >", value, "outtype");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOuttypeGreaterThanOrEqualTo(Integer value) {
       addCriterion("outtype >=", value, "outtype");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOuttypeLessThan(Integer value) {
       addCriterion("outtype <", value, "outtype");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOuttypeLessThanOrEqualTo(Integer value) {
       addCriterion("outtype <=", value, "outtype");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOuttypeIn(List<Integer> values) {
       addCriterion("outtype in", values, "outtype");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOuttypeNotIn(List<Integer> values) {
       addCriterion("outtype not in", values, "outtype");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOuttypeBetween(Integer value1, Integer value2) {
       addCriterion("outtype between", value1, value2, "outtype");
       return (TOrderClosingExample.Criteria)this;
     }
     
     public TOrderClosingExample.Criteria andOuttypeNotBetween(Integer value1, Integer value2) {
       addCriterion("outtype not between", value1, value2, "outtype");
       return (TOrderClosingExample.Criteria)this;
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


