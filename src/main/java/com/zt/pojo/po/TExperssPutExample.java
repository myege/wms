 package com.zt.pojo.po;
 
 import java.util.ArrayList;
 import java.util.List;
 public class TExperssPutExample
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
     protected List<TExperssPutExample.Criterion> criteria = new ArrayList<TExperssPutExample.Criterion>();
 
     
     public boolean isValid() {
       return (this.criteria.size() > 0);
     }
     
     public List<TExperssPutExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
     
     public List<TExperssPutExample.Criterion> getCriteria() {
       return this.criteria;
     }
     
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new TExperssPutExample.Criterion(condition));
     }
     
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new TExperssPutExample.Criterion(condition, value));
     }
     
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if (value1 == null || value2 == null) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new TExperssPutExample.Criterion(condition, value1, value2));
     }
     
     public TExperssPutExample.Criteria andIdIsNull() {
       addCriterion("id is null");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andIdIsNotNull() {
       addCriterion("id is not null");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andIdEqualTo(Integer value) {
       addCriterion("id =", value, "id");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andIdNotEqualTo(Integer value) {
       addCriterion("id <>", value, "id");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andIdGreaterThan(Integer value) {
       addCriterion("id >", value, "id");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("id >=", value, "id");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andIdLessThan(Integer value) {
       addCriterion("id <", value, "id");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andIdLessThanOrEqualTo(Integer value) {
       addCriterion("id <=", value, "id");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andIdIn(List<Integer> values) {
       addCriterion("id in", values, "id");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andIdNotIn(List<Integer> values) {
       addCriterion("id not in", values, "id");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andIdBetween(Integer value1, Integer value2) {
       addCriterion("id between", value1, value2, "id");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
       addCriterion("id not between", value1, value2, "id");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andExpressnoIsNull() {
       addCriterion("expressno is null");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andExpressnoIsNotNull() {
       addCriterion("expressno is not null");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andExpressnoEqualTo(String value) {
       addCriterion("expressno =", value, "expressno");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andExpressnoNotEqualTo(String value) {
       addCriterion("expressno <>", value, "expressno");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andExpressnoGreaterThan(String value) {
       addCriterion("expressno >", value, "expressno");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andExpressnoGreaterThanOrEqualTo(String value) {
       addCriterion("expressno >=", value, "expressno");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andExpressnoLessThan(String value) {
       addCriterion("expressno <", value, "expressno");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andExpressnoLessThanOrEqualTo(String value) {
       addCriterion("expressno <=", value, "expressno");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andExpressnoLike(String value) {
       addCriterion("expressno like", value, "expressno");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andExpressnoNotLike(String value) {
       addCriterion("expressno not like", value, "expressno");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andExpressnoIn(List<String> values) {
       addCriterion("expressno in", values, "expressno");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andExpressnoNotIn(List<String> values) {
       addCriterion("expressno not in", values, "expressno");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andExpressnoBetween(String value1, String value2) {
       addCriterion("expressno between", value1, value2, "expressno");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andExpressnoNotBetween(String value1, String value2) {
       addCriterion("expressno not between", value1, value2, "expressno");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andBournIsNull() {
       addCriterion("bourn is null");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andBournIsNotNull() {
       addCriterion("bourn is not null");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andBournEqualTo(String value) {
       addCriterion("bourn =", value, "bourn");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andBournNotEqualTo(String value) {
       addCriterion("bourn <>", value, "bourn");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andBournGreaterThan(String value) {
       addCriterion("bourn >", value, "bourn");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andBournGreaterThanOrEqualTo(String value) {
       addCriterion("bourn >=", value, "bourn");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andBournLessThan(String value) {
       addCriterion("bourn <", value, "bourn");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andBournLessThanOrEqualTo(String value) {
       addCriterion("bourn <=", value, "bourn");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andBournLike(String value) {
       addCriterion("bourn like", value, "bourn");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andBournNotLike(String value) {
       addCriterion("bourn not like", value, "bourn");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andBournIn(List<String> values) {
       addCriterion("bourn in", values, "bourn");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andBournNotIn(List<String> values) {
       addCriterion("bourn not in", values, "bourn");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andBournBetween(String value1, String value2) {
       addCriterion("bourn between", value1, value2, "bourn");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andBournNotBetween(String value1, String value2) {
       addCriterion("bourn not between", value1, value2, "bourn");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andInitialIsNull() {
       addCriterion("initial is null");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andInitialIsNotNull() {
       addCriterion("initial is not null");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andInitialEqualTo(String value) {
       addCriterion("initial =", value, "initial");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andInitialNotEqualTo(String value) {
       addCriterion("initial <>", value, "initial");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andInitialGreaterThan(String value) {
       addCriterion("initial >", value, "initial");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andInitialGreaterThanOrEqualTo(String value) {
       addCriterion("initial >=", value, "initial");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andInitialLessThan(String value) {
       addCriterion("initial <", value, "initial");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andInitialLessThanOrEqualTo(String value) {
       addCriterion("initial <=", value, "initial");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andInitialLike(String value) {
       addCriterion("initial like", value, "initial");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andInitialNotLike(String value) {
       addCriterion("initial not like", value, "initial");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andInitialIn(List<String> values) {
       addCriterion("initial in", values, "initial");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andInitialNotIn(List<String> values) {
       addCriterion("initial not in", values, "initial");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andInitialBetween(String value1, String value2) {
       addCriterion("initial between", value1, value2, "initial");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andInitialNotBetween(String value1, String value2) {
       addCriterion("initial not between", value1, value2, "initial");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMaxweightIsNull() {
       addCriterion("maxweight is null");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMaxweightIsNotNull() {
       addCriterion("maxweight is not null");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMaxweightEqualTo(String value) {
       addCriterion("maxweight =", value, "maxweight");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMaxweightNotEqualTo(String value) {
       addCriterion("maxweight <>", value, "maxweight");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMaxweightGreaterThan(String value) {
       addCriterion("maxweight >", value, "maxweight");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMaxweightGreaterThanOrEqualTo(String value) {
       addCriterion("maxweight >=", value, "maxweight");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMaxweightLessThan(String value) {
       addCriterion("maxweight <", value, "maxweight");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMaxweightLessThanOrEqualTo(String value) {
       addCriterion("maxweight <=", value, "maxweight");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMaxweightLike(String value) {
       addCriterion("maxweight like", value, "maxweight");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMaxweightNotLike(String value) {
       addCriterion("maxweight not like", value, "maxweight");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMaxweightIn(List<String> values) {
       addCriterion("maxweight in", values, "maxweight");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMaxweightNotIn(List<String> values) {
       addCriterion("maxweight not in", values, "maxweight");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMaxweightBetween(String value1, String value2) {
       addCriterion("maxweight between", value1, value2, "maxweight");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMaxweightNotBetween(String value1, String value2) {
       addCriterion("maxweight not between", value1, value2, "maxweight");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMinweightIsNull() {
       addCriterion("minweight is null");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMinweightIsNotNull() {
       addCriterion("minweight is not null");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMinweightEqualTo(String value) {
       addCriterion("minweight =", value, "minweight");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMinweightNotEqualTo(String value) {
       addCriterion("minweight <>", value, "minweight");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMinweightGreaterThan(String value) {
       addCriterion("minweight >", value, "minweight");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMinweightGreaterThanOrEqualTo(String value) {
       addCriterion("minweight >=", value, "minweight");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMinweightLessThan(String value) {
       addCriterion("minweight <", value, "minweight");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMinweightLessThanOrEqualTo(String value) {
       addCriterion("minweight <=", value, "minweight");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMinweightLike(String value) {
       addCriterion("minweight like", value, "minweight");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMinweightNotLike(String value) {
       addCriterion("minweight not like", value, "minweight");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMinweightIn(List<String> values) {
       addCriterion("minweight in", values, "minweight");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMinweightNotIn(List<String> values) {
       addCriterion("minweight not in", values, "minweight");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMinweightBetween(String value1, String value2) {
       addCriterion("minweight between", value1, value2, "minweight");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMinweightNotBetween(String value1, String value2) {
       addCriterion("minweight not between", value1, value2, "minweight");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMaxnextIsNull() {
       addCriterion("maxnext is null");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMaxnextIsNotNull() {
       addCriterion("maxnext is not null");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMaxnextEqualTo(String value) {
       addCriterion("maxnext =", value, "maxnext");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMaxnextNotEqualTo(String value) {
       addCriterion("maxnext <>", value, "maxnext");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMaxnextGreaterThan(String value) {
       addCriterion("maxnext >", value, "maxnext");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMaxnextGreaterThanOrEqualTo(String value) {
       addCriterion("maxnext >=", value, "maxnext");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMaxnextLessThan(String value) {
       addCriterion("maxnext <", value, "maxnext");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMaxnextLessThanOrEqualTo(String value) {
       addCriterion("maxnext <=", value, "maxnext");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMaxnextLike(String value) {
       addCriterion("maxnext like", value, "maxnext");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMaxnextNotLike(String value) {
       addCriterion("maxnext not like", value, "maxnext");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMaxnextIn(List<String> values) {
       addCriterion("maxnext in", values, "maxnext");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMaxnextNotIn(List<String> values) {
       addCriterion("maxnext not in", values, "maxnext");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMaxnextBetween(String value1, String value2) {
       addCriterion("maxnext between", value1, value2, "maxnext");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMaxnextNotBetween(String value1, String value2) {
       addCriterion("maxnext not between", value1, value2, "maxnext");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMinnextIsNull() {
       addCriterion("minnext is null");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMinnextIsNotNull() {
       addCriterion("minnext is not null");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMinnextEqualTo(String value) {
       addCriterion("minnext =", value, "minnext");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMinnextNotEqualTo(String value) {
       addCriterion("minnext <>", value, "minnext");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMinnextGreaterThan(String value) {
       addCriterion("minnext >", value, "minnext");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMinnextGreaterThanOrEqualTo(String value) {
       addCriterion("minnext >=", value, "minnext");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMinnextLessThan(String value) {
       addCriterion("minnext <", value, "minnext");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMinnextLessThanOrEqualTo(String value) {
       addCriterion("minnext <=", value, "minnext");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMinnextLike(String value) {
       addCriterion("minnext like", value, "minnext");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMinnextNotLike(String value) {
       addCriterion("minnext not like", value, "minnext");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMinnextIn(List<String> values) {
       addCriterion("minnext in", values, "minnext");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMinnextNotIn(List<String> values) {
       addCriterion("minnext not in", values, "minnext");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMinnextBetween(String value1, String value2) {
       addCriterion("minnext between", value1, value2, "minnext");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andMinnextNotBetween(String value1, String value2) {
       addCriterion("minnext not between", value1, value2, "minnext");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andAgingIsNull() {
       addCriterion("aging is null");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andAgingIsNotNull() {
       addCriterion("aging is not null");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andAgingEqualTo(String value) {
       addCriterion("aging =", value, "aging");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andAgingNotEqualTo(String value) {
       addCriterion("aging <>", value, "aging");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andAgingGreaterThan(String value) {
       addCriterion("aging >", value, "aging");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andAgingGreaterThanOrEqualTo(String value) {
       addCriterion("aging >=", value, "aging");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andAgingLessThan(String value) {
       addCriterion("aging <", value, "aging");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andAgingLessThanOrEqualTo(String value) {
       addCriterion("aging <=", value, "aging");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andAgingLike(String value) {
       addCriterion("aging like", value, "aging");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andAgingNotLike(String value) {
       addCriterion("aging not like", value, "aging");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andAgingIn(List<String> values) {
       addCriterion("aging in", values, "aging");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andAgingNotIn(List<String> values) {
       addCriterion("aging not in", values, "aging");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andAgingBetween(String value1, String value2) {
       addCriterion("aging between", value1, value2, "aging");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andAgingNotBetween(String value1, String value2) {
       addCriterion("aging not between", value1, value2, "aging");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andIstaxIsNull() {
       addCriterion("istax is null");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andIstaxIsNotNull() {
       addCriterion("istax is not null");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andIstaxEqualTo(String value) {
       addCriterion("istax =", value, "istax");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andIstaxNotEqualTo(String value) {
       addCriterion("istax <>", value, "istax");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andIstaxGreaterThan(String value) {
       addCriterion("istax >", value, "istax");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andIstaxGreaterThanOrEqualTo(String value) {
       addCriterion("istax >=", value, "istax");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andIstaxLessThan(String value) {
       addCriterion("istax <", value, "istax");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andIstaxLessThanOrEqualTo(String value) {
       addCriterion("istax <=", value, "istax");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andIstaxLike(String value) {
       addCriterion("istax like", value, "istax");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andIstaxNotLike(String value) {
       addCriterion("istax not like", value, "istax");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andIstaxIn(List<String> values) {
       addCriterion("istax in", values, "istax");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andIstaxNotIn(List<String> values) {
       addCriterion("istax not in", values, "istax");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andIstaxBetween(String value1, String value2) {
       addCriterion("istax between", value1, value2, "istax");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andIstaxNotBetween(String value1, String value2) {
       addCriterion("istax not between", value1, value2, "istax");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andTypeIsNull() {
       addCriterion("type is null");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andTypeIsNotNull() {
       addCriterion("type is not null");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andTypeEqualTo(Integer value) {
       addCriterion("type =", value, "type");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andTypeNotEqualTo(Integer value) {
       addCriterion("type <>", value, "type");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andTypeGreaterThan(Integer value) {
       addCriterion("type >", value, "type");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andTypeGreaterThanOrEqualTo(Integer value) {
       addCriterion("type >=", value, "type");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andTypeLessThan(Integer value) {
       addCriterion("type <", value, "type");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andTypeLessThanOrEqualTo(Integer value) {
       addCriterion("type <=", value, "type");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andTypeIn(List<Integer> values) {
       addCriterion("type in", values, "type");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andTypeNotIn(List<Integer> values) {
       addCriterion("type not in", values, "type");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andTypeBetween(Integer value1, Integer value2) {
       addCriterion("type between", value1, value2, "type");
       return (TExperssPutExample.Criteria)this;
     }
     
     public TExperssPutExample.Criteria andTypeNotBetween(Integer value1, Integer value2) {
       addCriterion("type not between", value1, value2, "type");
       return (TExperssPutExample.Criteria)this;
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


