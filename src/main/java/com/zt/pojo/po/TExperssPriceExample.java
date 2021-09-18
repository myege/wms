 package com.zt.pojo.po;
 
 import java.util.ArrayList;
 import java.util.List;
 public class TExperssPriceExample
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
     protected List<TExperssPriceExample.Criterion> criteria = new ArrayList<TExperssPriceExample.Criterion>();
 
     
     public boolean isValid() {
       return (this.criteria.size() > 0);
     }
     
     public List<TExperssPriceExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
     
     public List<TExperssPriceExample.Criterion> getCriteria() {
       return this.criteria;
     }
     
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new TExperssPriceExample.Criterion(condition));
     }
     
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new TExperssPriceExample.Criterion(condition, value));
     }
     
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if (value1 == null || value2 == null) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new TExperssPriceExample.Criterion(condition, value1, value2));
     }
     
     public TExperssPriceExample.Criteria andIdIsNull() {
       addCriterion("id is null");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andIdIsNotNull() {
       addCriterion("id is not null");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andIdEqualTo(Integer value) {
       addCriterion("id =", value, "id");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andIdNotEqualTo(Integer value) {
       addCriterion("id <>", value, "id");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andIdGreaterThan(Integer value) {
       addCriterion("id >", value, "id");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("id >=", value, "id");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andIdLessThan(Integer value) {
       addCriterion("id <", value, "id");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andIdLessThanOrEqualTo(Integer value) {
       addCriterion("id <=", value, "id");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andIdIn(List<Integer> values) {
       addCriterion("id in", values, "id");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andIdNotIn(List<Integer> values) {
       addCriterion("id not in", values, "id");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andIdBetween(Integer value1, Integer value2) {
       addCriterion("id between", value1, value2, "id");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
       addCriterion("id not between", value1, value2, "id");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andExpressnoIsNull() {
       addCriterion("expressno is null");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andExpressnoIsNotNull() {
       addCriterion("expressno is not null");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andExpressnoEqualTo(String value) {
       addCriterion("expressno =", value, "expressno");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andExpressnoNotEqualTo(String value) {
       addCriterion("expressno <>", value, "expressno");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andExpressnoGreaterThan(String value) {
       addCriterion("expressno >", value, "expressno");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andExpressnoGreaterThanOrEqualTo(String value) {
       addCriterion("expressno >=", value, "expressno");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andExpressnoLessThan(String value) {
       addCriterion("expressno <", value, "expressno");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andExpressnoLessThanOrEqualTo(String value) {
       addCriterion("expressno <=", value, "expressno");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andExpressnoLike(String value) {
       addCriterion("expressno like", value, "expressno");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andExpressnoNotLike(String value) {
       addCriterion("expressno not like", value, "expressno");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andExpressnoIn(List<String> values) {
       addCriterion("expressno in", values, "expressno");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andExpressnoNotIn(List<String> values) {
       addCriterion("expressno not in", values, "expressno");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andExpressnoBetween(String value1, String value2) {
       addCriterion("expressno between", value1, value2, "expressno");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andExpressnoNotBetween(String value1, String value2) {
       addCriterion("expressno not between", value1, value2, "expressno");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andBournIsNull() {
       addCriterion("bourn is null");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andBournIsNotNull() {
       addCriterion("bourn is not null");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andBournEqualTo(String value) {
       addCriterion("bourn =", value, "bourn");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andBournNotEqualTo(String value) {
       addCriterion("bourn <>", value, "bourn");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andBournGreaterThan(String value) {
       addCriterion("bourn >", value, "bourn");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andBournGreaterThanOrEqualTo(String value) {
       addCriterion("bourn >=", value, "bourn");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andBournLessThan(String value) {
       addCriterion("bourn <", value, "bourn");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andBournLessThanOrEqualTo(String value) {
       addCriterion("bourn <=", value, "bourn");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andBournLike(String value) {
       addCriterion("bourn like", value, "bourn");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andBournNotLike(String value) {
       addCriterion("bourn not like", value, "bourn");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andBournIn(List<String> values) {
       addCriterion("bourn in", values, "bourn");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andBournNotIn(List<String> values) {
       addCriterion("bourn not in", values, "bourn");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andBournBetween(String value1, String value2) {
       addCriterion("bourn between", value1, value2, "bourn");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andBournNotBetween(String value1, String value2) {
       addCriterion("bourn not between", value1, value2, "bourn");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andInitialIsNull() {
       addCriterion("initial is null");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andInitialIsNotNull() {
       addCriterion("initial is not null");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andInitialEqualTo(String value) {
       addCriterion("initial =", value, "initial");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andInitialNotEqualTo(String value) {
       addCriterion("initial <>", value, "initial");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andInitialGreaterThan(String value) {
       addCriterion("initial >", value, "initial");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andInitialGreaterThanOrEqualTo(String value) {
       addCriterion("initial >=", value, "initial");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andInitialLessThan(String value) {
       addCriterion("initial <", value, "initial");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andInitialLessThanOrEqualTo(String value) {
       addCriterion("initial <=", value, "initial");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andInitialLike(String value) {
       addCriterion("initial like", value, "initial");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andInitialNotLike(String value) {
       addCriterion("initial not like", value, "initial");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andInitialIn(List<String> values) {
       addCriterion("initial in", values, "initial");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andInitialNotIn(List<String> values) {
       addCriterion("initial not in", values, "initial");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andInitialBetween(String value1, String value2) {
       addCriterion("initial between", value1, value2, "initial");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andInitialNotBetween(String value1, String value2) {
       addCriterion("initial not between", value1, value2, "initial");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMaxweightIsNull() {
       addCriterion("maxweight is null");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMaxweightIsNotNull() {
       addCriterion("maxweight is not null");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMaxweightEqualTo(String value) {
       addCriterion("maxweight =", value, "maxweight");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMaxweightNotEqualTo(String value) {
       addCriterion("maxweight <>", value, "maxweight");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMaxweightGreaterThan(String value) {
       addCriterion("maxweight >", value, "maxweight");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMaxweightGreaterThanOrEqualTo(String value) {
       addCriterion("maxweight >=", value, "maxweight");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMaxweightLessThan(String value) {
       addCriterion("maxweight <", value, "maxweight");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMaxweightLessThanOrEqualTo(String value) {
       addCriterion("maxweight <=", value, "maxweight");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMaxweightLike(String value) {
       addCriterion("maxweight like", value, "maxweight");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMaxweightNotLike(String value) {
       addCriterion("maxweight not like", value, "maxweight");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMaxweightIn(List<String> values) {
       addCriterion("maxweight in", values, "maxweight");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMaxweightNotIn(List<String> values) {
       addCriterion("maxweight not in", values, "maxweight");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMaxweightBetween(String value1, String value2) {
       addCriterion("maxweight between", value1, value2, "maxweight");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMaxweightNotBetween(String value1, String value2) {
       addCriterion("maxweight not between", value1, value2, "maxweight");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMinweightIsNull() {
       addCriterion("minweight is null");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMinweightIsNotNull() {
       addCriterion("minweight is not null");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMinweightEqualTo(String value) {
       addCriterion("minweight =", value, "minweight");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMinweightNotEqualTo(String value) {
       addCriterion("minweight <>", value, "minweight");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMinweightGreaterThan(String value) {
       addCriterion("minweight >", value, "minweight");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMinweightGreaterThanOrEqualTo(String value) {
       addCriterion("minweight >=", value, "minweight");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMinweightLessThan(String value) {
       addCriterion("minweight <", value, "minweight");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMinweightLessThanOrEqualTo(String value) {
       addCriterion("minweight <=", value, "minweight");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMinweightLike(String value) {
       addCriterion("minweight like", value, "minweight");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMinweightNotLike(String value) {
       addCriterion("minweight not like", value, "minweight");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMinweightIn(List<String> values) {
       addCriterion("minweight in", values, "minweight");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMinweightNotIn(List<String> values) {
       addCriterion("minweight not in", values, "minweight");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMinweightBetween(String value1, String value2) {
       addCriterion("minweight between", value1, value2, "minweight");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMinweightNotBetween(String value1, String value2) {
       addCriterion("minweight not between", value1, value2, "minweight");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMaxnextIsNull() {
       addCriterion("maxnext is null");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMaxnextIsNotNull() {
       addCriterion("maxnext is not null");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMaxnextEqualTo(String value) {
       addCriterion("maxnext =", value, "maxnext");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMaxnextNotEqualTo(String value) {
       addCriterion("maxnext <>", value, "maxnext");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMaxnextGreaterThan(String value) {
       addCriterion("maxnext >", value, "maxnext");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMaxnextGreaterThanOrEqualTo(String value) {
       addCriterion("maxnext >=", value, "maxnext");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMaxnextLessThan(String value) {
       addCriterion("maxnext <", value, "maxnext");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMaxnextLessThanOrEqualTo(String value) {
       addCriterion("maxnext <=", value, "maxnext");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMaxnextLike(String value) {
       addCriterion("maxnext like", value, "maxnext");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMaxnextNotLike(String value) {
       addCriterion("maxnext not like", value, "maxnext");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMaxnextIn(List<String> values) {
       addCriterion("maxnext in", values, "maxnext");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMaxnextNotIn(List<String> values) {
       addCriterion("maxnext not in", values, "maxnext");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMaxnextBetween(String value1, String value2) {
       addCriterion("maxnext between", value1, value2, "maxnext");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMaxnextNotBetween(String value1, String value2) {
       addCriterion("maxnext not between", value1, value2, "maxnext");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMinnextIsNull() {
       addCriterion("minnext is null");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMinnextIsNotNull() {
       addCriterion("minnext is not null");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMinnextEqualTo(String value) {
       addCriterion("minnext =", value, "minnext");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMinnextNotEqualTo(String value) {
       addCriterion("minnext <>", value, "minnext");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMinnextGreaterThan(String value) {
       addCriterion("minnext >", value, "minnext");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMinnextGreaterThanOrEqualTo(String value) {
       addCriterion("minnext >=", value, "minnext");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMinnextLessThan(String value) {
       addCriterion("minnext <", value, "minnext");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMinnextLessThanOrEqualTo(String value) {
       addCriterion("minnext <=", value, "minnext");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMinnextLike(String value) {
       addCriterion("minnext like", value, "minnext");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMinnextNotLike(String value) {
       addCriterion("minnext not like", value, "minnext");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMinnextIn(List<String> values) {
       addCriterion("minnext in", values, "minnext");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMinnextNotIn(List<String> values) {
       addCriterion("minnext not in", values, "minnext");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMinnextBetween(String value1, String value2) {
       addCriterion("minnext between", value1, value2, "minnext");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andMinnextNotBetween(String value1, String value2) {
       addCriterion("minnext not between", value1, value2, "minnext");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andAgingIsNull() {
       addCriterion("aging is null");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andAgingIsNotNull() {
       addCriterion("aging is not null");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andAgingEqualTo(String value) {
       addCriterion("aging =", value, "aging");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andAgingNotEqualTo(String value) {
       addCriterion("aging <>", value, "aging");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andAgingGreaterThan(String value) {
       addCriterion("aging >", value, "aging");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andAgingGreaterThanOrEqualTo(String value) {
       addCriterion("aging >=", value, "aging");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andAgingLessThan(String value) {
       addCriterion("aging <", value, "aging");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andAgingLessThanOrEqualTo(String value) {
       addCriterion("aging <=", value, "aging");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andAgingLike(String value) {
       addCriterion("aging like", value, "aging");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andAgingNotLike(String value) {
       addCriterion("aging not like", value, "aging");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andAgingIn(List<String> values) {
       addCriterion("aging in", values, "aging");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andAgingNotIn(List<String> values) {
       addCriterion("aging not in", values, "aging");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andAgingBetween(String value1, String value2) {
       addCriterion("aging between", value1, value2, "aging");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andAgingNotBetween(String value1, String value2) {
       addCriterion("aging not between", value1, value2, "aging");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andIstaxIsNull() {
       addCriterion("istax is null");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andIstaxIsNotNull() {
       addCriterion("istax is not null");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andIstaxEqualTo(String value) {
       addCriterion("istax =", value, "istax");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andIstaxNotEqualTo(String value) {
       addCriterion("istax <>", value, "istax");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andIstaxGreaterThan(String value) {
       addCriterion("istax >", value, "istax");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andIstaxGreaterThanOrEqualTo(String value) {
       addCriterion("istax >=", value, "istax");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andIstaxLessThan(String value) {
       addCriterion("istax <", value, "istax");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andIstaxLessThanOrEqualTo(String value) {
       addCriterion("istax <=", value, "istax");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andIstaxLike(String value) {
       addCriterion("istax like", value, "istax");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andIstaxNotLike(String value) {
       addCriterion("istax not like", value, "istax");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andIstaxIn(List<String> values) {
       addCriterion("istax in", values, "istax");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andIstaxNotIn(List<String> values) {
       addCriterion("istax not in", values, "istax");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andIstaxBetween(String value1, String value2) {
       addCriterion("istax between", value1, value2, "istax");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andIstaxNotBetween(String value1, String value2) {
       addCriterion("istax not between", value1, value2, "istax");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andTypeIsNull() {
       addCriterion("type is null");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andTypeIsNotNull() {
       addCriterion("type is not null");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andTypeEqualTo(Integer value) {
       addCriterion("type =", value, "type");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andTypeNotEqualTo(Integer value) {
       addCriterion("type <>", value, "type");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andTypeGreaterThan(Integer value) {
       addCriterion("type >", value, "type");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andTypeGreaterThanOrEqualTo(Integer value) {
       addCriterion("type >=", value, "type");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andTypeLessThan(Integer value) {
       addCriterion("type <", value, "type");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andTypeLessThanOrEqualTo(Integer value) {
       addCriterion("type <=", value, "type");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andTypeIn(List<Integer> values) {
       addCriterion("type in", values, "type");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andTypeNotIn(List<Integer> values) {
       addCriterion("type not in", values, "type");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andTypeBetween(Integer value1, Integer value2) {
       addCriterion("type between", value1, value2, "type");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andTypeNotBetween(Integer value1, Integer value2) {
       addCriterion("type not between", value1, value2, "type");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andBournbyIsNull() {
       addCriterion("bournBy is null");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andBournbyIsNotNull() {
       addCriterion("bournBy is not null");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andBournbyEqualTo(String value) {
       addCriterion("bournBy =", value, "bournby");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andBournbyNotEqualTo(String value) {
       addCriterion("bournBy <>", value, "bournby");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andBournbyGreaterThan(String value) {
       addCriterion("bournBy >", value, "bournby");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andBournbyGreaterThanOrEqualTo(String value) {
       addCriterion("bournBy >=", value, "bournby");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andBournbyLessThan(String value) {
       addCriterion("bournBy <", value, "bournby");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andBournbyLessThanOrEqualTo(String value) {
       addCriterion("bournBy <=", value, "bournby");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andBournbyLike(String value) {
       addCriterion("bournBy like", value, "bournby");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andBournbyNotLike(String value) {
       addCriterion("bournBy not like", value, "bournby");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andBournbyIn(List<String> values) {
       addCriterion("bournBy in", values, "bournby");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andBournbyNotIn(List<String> values) {
       addCriterion("bournBy not in", values, "bournby");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andBournbyBetween(String value1, String value2) {
       addCriterion("bournBy between", value1, value2, "bournby");
       return (TExperssPriceExample.Criteria)this;
     }
     
     public TExperssPriceExample.Criteria andBournbyNotBetween(String value1, String value2) {
       addCriterion("bournBy not between", value1, value2, "bournby");
       return (TExperssPriceExample.Criteria)this;
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


