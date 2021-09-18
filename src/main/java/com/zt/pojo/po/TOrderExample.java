 package com.zt.pojo.po;
 
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 public class TOrderExample
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
     protected List<TOrderExample.Criterion> criteria = new ArrayList<TOrderExample.Criterion>();
 
     
     public boolean isValid() {
       return (this.criteria.size() > 0);
     }
     
     public List<TOrderExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
     
     public List<TOrderExample.Criterion> getCriteria() {
       return this.criteria;
     }
     
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new TOrderExample.Criterion(condition));
     }
     
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new TOrderExample.Criterion(condition, value));
     }
     
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if (value1 == null || value2 == null) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new TOrderExample.Criterion(condition, value1, value2));
     }
     
     public TOrderExample.Criteria andIdIsNull() {
       addCriterion("id is null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andIdIsNotNull() {
       addCriterion("id is not null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andIdEqualTo(Integer value) {
       addCriterion("id =", value, "id");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andIdNotEqualTo(Integer value) {
       addCriterion("id <>", value, "id");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andIdGreaterThan(Integer value) {
       addCriterion("id >", value, "id");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("id >=", value, "id");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andIdLessThan(Integer value) {
       addCriterion("id <", value, "id");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andIdLessThanOrEqualTo(Integer value) {
       addCriterion("id <=", value, "id");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andIdIn(List<Integer> values) {
       addCriterion("id in", values, "id");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andIdNotIn(List<Integer> values) {
       addCriterion("id not in", values, "id");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andIdBetween(Integer value1, Integer value2) {
       addCriterion("id between", value1, value2, "id");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
       addCriterion("id not between", value1, value2, "id");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andOrdernoIsNull() {
       addCriterion("orderNo is null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andOrdernoIsNotNull() {
       addCriterion("orderNo is not null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andOrdernoEqualTo(String value) {
       addCriterion("orderNo =", value, "orderno");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andOrdernoNotEqualTo(String value) {
       addCriterion("orderNo <>", value, "orderno");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andOrdernoGreaterThan(String value) {
       addCriterion("orderNo >", value, "orderno");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andOrdernoGreaterThanOrEqualTo(String value) {
       addCriterion("orderNo >=", value, "orderno");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andOrdernoLessThan(String value) {
       addCriterion("orderNo <", value, "orderno");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andOrdernoLessThanOrEqualTo(String value) {
       addCriterion("orderNo <=", value, "orderno");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andOrdernoLike(String value) {
       addCriterion("orderNo like", value, "orderno");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andOrdernoNotLike(String value) {
       addCriterion("orderNo not like", value, "orderno");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andOrdernoIn(List<String> values) {
       addCriterion("orderNo in", values, "orderno");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andOrdernoNotIn(List<String> values) {
       addCriterion("orderNo not in", values, "orderno");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andOrdernoBetween(String value1, String value2) {
       addCriterion("orderNo between", value1, value2, "orderno");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andOrdernoNotBetween(String value1, String value2) {
       addCriterion("orderNo not between", value1, value2, "orderno");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andMailnoIsNull() {
       addCriterion("mailNo is null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andMailnoIsNotNull() {
       addCriterion("mailNo is not null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andMailnoEqualTo(String value) {
       addCriterion("mailNo =", value, "mailno");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andMailnoNotEqualTo(String value) {
       addCriterion("mailNo <>", value, "mailno");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andMailnoGreaterThan(String value) {
       addCriterion("mailNo >", value, "mailno");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andMailnoGreaterThanOrEqualTo(String value) {
       addCriterion("mailNo >=", value, "mailno");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andMailnoLessThan(String value) {
       addCriterion("mailNo <", value, "mailno");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andMailnoLessThanOrEqualTo(String value) {
       addCriterion("mailNo <=", value, "mailno");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andMailnoLike(String value) {
       addCriterion("mailNo like", value, "mailno");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andMailnoNotLike(String value) {
       addCriterion("mailNo not like", value, "mailno");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andMailnoIn(List<String> values) {
       addCriterion("mailNo in", values, "mailno");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andMailnoNotIn(List<String> values) {
       addCriterion("mailNo not in", values, "mailno");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andMailnoBetween(String value1, String value2) {
       addCriterion("mailNo between", value1, value2, "mailno");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andMailnoNotBetween(String value1, String value2) {
       addCriterion("mailNo not between", value1, value2, "mailno");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andCompanycodeIsNull() {
       addCriterion("companyCode is null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andCompanycodeIsNotNull() {
       addCriterion("companyCode is not null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andCompanycodeEqualTo(String value) {
       addCriterion("companyCode =", value, "companycode");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andCompanycodeNotEqualTo(String value) {
       addCriterion("companyCode <>", value, "companycode");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andCompanycodeGreaterThan(String value) {
       addCriterion("companyCode >", value, "companycode");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andCompanycodeGreaterThanOrEqualTo(String value) {
       addCriterion("companyCode >=", value, "companycode");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andCompanycodeLessThan(String value) {
       addCriterion("companyCode <", value, "companycode");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andCompanycodeLessThanOrEqualTo(String value) {
       addCriterion("companyCode <=", value, "companycode");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andCompanycodeLike(String value) {
       addCriterion("companyCode like", value, "companycode");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andCompanycodeNotLike(String value) {
       addCriterion("companyCode not like", value, "companycode");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andCompanycodeIn(List<String> values) {
       addCriterion("companyCode in", values, "companycode");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andCompanycodeNotIn(List<String> values) {
       addCriterion("companyCode not in", values, "companycode");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andCompanycodeBetween(String value1, String value2) {
       addCriterion("companyCode between", value1, value2, "companycode");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andCompanycodeNotBetween(String value1, String value2) {
       addCriterion("companyCode not between", value1, value2, "companycode");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivemanIsNull() {
       addCriterion("receiveMan is null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivemanIsNotNull() {
       addCriterion("receiveMan is not null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivemanEqualTo(String value) {
       addCriterion("receiveMan =", value, "receiveman");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivemanNotEqualTo(String value) {
       addCriterion("receiveMan <>", value, "receiveman");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivemanGreaterThan(String value) {
       addCriterion("receiveMan >", value, "receiveman");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivemanGreaterThanOrEqualTo(String value) {
       addCriterion("receiveMan >=", value, "receiveman");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivemanLessThan(String value) {
       addCriterion("receiveMan <", value, "receiveman");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivemanLessThanOrEqualTo(String value) {
       addCriterion("receiveMan <=", value, "receiveman");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivemanLike(String value) {
       addCriterion("receiveMan like", value, "receiveman");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivemanNotLike(String value) {
       addCriterion("receiveMan not like", value, "receiveman");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivemanIn(List<String> values) {
       addCriterion("receiveMan in", values, "receiveman");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivemanNotIn(List<String> values) {
       addCriterion("receiveMan not in", values, "receiveman");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivemanBetween(String value1, String value2) {
       addCriterion("receiveMan between", value1, value2, "receiveman");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivemanNotBetween(String value1, String value2) {
       addCriterion("receiveMan not between", value1, value2, "receiveman");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivemanphoneIsNull() {
       addCriterion("receiveManPhone is null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivemanphoneIsNotNull() {
       addCriterion("receiveManPhone is not null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivemanphoneEqualTo(String value) {
       addCriterion("receiveManPhone =", value, "receivemanphone");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivemanphoneNotEqualTo(String value) {
       addCriterion("receiveManPhone <>", value, "receivemanphone");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivemanphoneGreaterThan(String value) {
       addCriterion("receiveManPhone >", value, "receivemanphone");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivemanphoneGreaterThanOrEqualTo(String value) {
       addCriterion("receiveManPhone >=", value, "receivemanphone");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivemanphoneLessThan(String value) {
       addCriterion("receiveManPhone <", value, "receivemanphone");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivemanphoneLessThanOrEqualTo(String value) {
       addCriterion("receiveManPhone <=", value, "receivemanphone");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivemanphoneLike(String value) {
       addCriterion("receiveManPhone like", value, "receivemanphone");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivemanphoneNotLike(String value) {
       addCriterion("receiveManPhone not like", value, "receivemanphone");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivemanphoneIn(List<String> values) {
       addCriterion("receiveManPhone in", values, "receivemanphone");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivemanphoneNotIn(List<String> values) {
       addCriterion("receiveManPhone not in", values, "receivemanphone");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivemanphoneBetween(String value1, String value2) {
       addCriterion("receiveManPhone between", value1, value2, "receivemanphone");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivemanphoneNotBetween(String value1, String value2) {
       addCriterion("receiveManPhone not between", value1, value2, "receivemanphone");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivemanaddressIsNull() {
       addCriterion("receiveManAddress is null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivemanaddressIsNotNull() {
       addCriterion("receiveManAddress is not null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivemanaddressEqualTo(String value) {
       addCriterion("receiveManAddress =", value, "receivemanaddress");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivemanaddressNotEqualTo(String value) {
       addCriterion("receiveManAddress <>", value, "receivemanaddress");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivemanaddressGreaterThan(String value) {
       addCriterion("receiveManAddress >", value, "receivemanaddress");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivemanaddressGreaterThanOrEqualTo(String value) {
       addCriterion("receiveManAddress >=", value, "receivemanaddress");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivemanaddressLessThan(String value) {
       addCriterion("receiveManAddress <", value, "receivemanaddress");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivemanaddressLessThanOrEqualTo(String value) {
       addCriterion("receiveManAddress <=", value, "receivemanaddress");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivemanaddressLike(String value) {
       addCriterion("receiveManAddress like", value, "receivemanaddress");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivemanaddressNotLike(String value) {
       addCriterion("receiveManAddress not like", value, "receivemanaddress");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivemanaddressIn(List<String> values) {
       addCriterion("receiveManAddress in", values, "receivemanaddress");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivemanaddressNotIn(List<String> values) {
       addCriterion("receiveManAddress not in", values, "receivemanaddress");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivemanaddressBetween(String value1, String value2) {
       addCriterion("receiveManAddress between", value1, value2, "receivemanaddress");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivemanaddressNotBetween(String value1, String value2) {
       addCriterion("receiveManAddress not between", value1, value2, "receivemanaddress");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceiveprovinceIsNull() {
       addCriterion("receiveProvince is null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceiveprovinceIsNotNull() {
       addCriterion("receiveProvince is not null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceiveprovinceEqualTo(String value) {
       addCriterion("receiveProvince =", value, "receiveprovince");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceiveprovinceNotEqualTo(String value) {
       addCriterion("receiveProvince <>", value, "receiveprovince");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceiveprovinceGreaterThan(String value) {
       addCriterion("receiveProvince >", value, "receiveprovince");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceiveprovinceGreaterThanOrEqualTo(String value) {
       addCriterion("receiveProvince >=", value, "receiveprovince");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceiveprovinceLessThan(String value) {
       addCriterion("receiveProvince <", value, "receiveprovince");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceiveprovinceLessThanOrEqualTo(String value) {
       addCriterion("receiveProvince <=", value, "receiveprovince");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceiveprovinceLike(String value) {
       addCriterion("receiveProvince like", value, "receiveprovince");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceiveprovinceNotLike(String value) {
       addCriterion("receiveProvince not like", value, "receiveprovince");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceiveprovinceIn(List<String> values) {
       addCriterion("receiveProvince in", values, "receiveprovince");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceiveprovinceNotIn(List<String> values) {
       addCriterion("receiveProvince not in", values, "receiveprovince");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceiveprovinceBetween(String value1, String value2) {
       addCriterion("receiveProvince between", value1, value2, "receiveprovince");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceiveprovinceNotBetween(String value1, String value2) {
       addCriterion("receiveProvince not between", value1, value2, "receiveprovince");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivecityIsNull() {
       addCriterion("receiveCity is null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivecityIsNotNull() {
       addCriterion("receiveCity is not null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivecityEqualTo(String value) {
       addCriterion("receiveCity =", value, "receivecity");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivecityNotEqualTo(String value) {
       addCriterion("receiveCity <>", value, "receivecity");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivecityGreaterThan(String value) {
       addCriterion("receiveCity >", value, "receivecity");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivecityGreaterThanOrEqualTo(String value) {
       addCriterion("receiveCity >=", value, "receivecity");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivecityLessThan(String value) {
       addCriterion("receiveCity <", value, "receivecity");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivecityLessThanOrEqualTo(String value) {
       addCriterion("receiveCity <=", value, "receivecity");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivecityLike(String value) {
       addCriterion("receiveCity like", value, "receivecity");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivecityNotLike(String value) {
       addCriterion("receiveCity not like", value, "receivecity");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivecityIn(List<String> values) {
       addCriterion("receiveCity in", values, "receivecity");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivecityNotIn(List<String> values) {
       addCriterion("receiveCity not in", values, "receivecity");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivecityBetween(String value1, String value2) {
       addCriterion("receiveCity between", value1, value2, "receivecity");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivecityNotBetween(String value1, String value2) {
       addCriterion("receiveCity not between", value1, value2, "receivecity");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivecountyIsNull() {
       addCriterion("receiveCounty is null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivecountyIsNotNull() {
       addCriterion("receiveCounty is not null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivecountyEqualTo(String value) {
       addCriterion("receiveCounty =", value, "receivecounty");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivecountyNotEqualTo(String value) {
       addCriterion("receiveCounty <>", value, "receivecounty");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivecountyGreaterThan(String value) {
       addCriterion("receiveCounty >", value, "receivecounty");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivecountyGreaterThanOrEqualTo(String value) {
       addCriterion("receiveCounty >=", value, "receivecounty");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivecountyLessThan(String value) {
       addCriterion("receiveCounty <", value, "receivecounty");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivecountyLessThanOrEqualTo(String value) {
       addCriterion("receiveCounty <=", value, "receivecounty");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivecountyLike(String value) {
       addCriterion("receiveCounty like", value, "receivecounty");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivecountyNotLike(String value) {
       addCriterion("receiveCounty not like", value, "receivecounty");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivecountyIn(List<String> values) {
       addCriterion("receiveCounty in", values, "receivecounty");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivecountyNotIn(List<String> values) {
       addCriterion("receiveCounty not in", values, "receivecounty");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivecountyBetween(String value1, String value2) {
       addCriterion("receiveCounty between", value1, value2, "receivecounty");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andReceivecountyNotBetween(String value1, String value2) {
       addCriterion("receiveCounty not between", value1, value2, "receivecounty");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSendnameIsNull() {
       addCriterion("sendName is null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSendnameIsNotNull() {
       addCriterion("sendName is not null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSendnameEqualTo(String value) {
       addCriterion("sendName =", value, "sendname");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSendnameNotEqualTo(String value) {
       addCriterion("sendName <>", value, "sendname");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSendnameGreaterThan(String value) {
       addCriterion("sendName >", value, "sendname");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSendnameGreaterThanOrEqualTo(String value) {
       addCriterion("sendName >=", value, "sendname");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSendnameLessThan(String value) {
       addCriterion("sendName <", value, "sendname");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSendnameLessThanOrEqualTo(String value) {
       addCriterion("sendName <=", value, "sendname");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSendnameLike(String value) {
       addCriterion("sendName like", value, "sendname");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSendnameNotLike(String value) {
       addCriterion("sendName not like", value, "sendname");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSendnameIn(List<String> values) {
       addCriterion("sendName in", values, "sendname");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSendnameNotIn(List<String> values) {
       addCriterion("sendName not in", values, "sendname");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSendnameBetween(String value1, String value2) {
       addCriterion("sendName between", value1, value2, "sendname");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSendnameNotBetween(String value1, String value2) {
       addCriterion("sendName not between", value1, value2, "sendname");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSendtelIsNull() {
       addCriterion("sendTel is null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSendtelIsNotNull() {
       addCriterion("sendTel is not null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSendtelEqualTo(String value) {
       addCriterion("sendTel =", value, "sendtel");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSendtelNotEqualTo(String value) {
       addCriterion("sendTel <>", value, "sendtel");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSendtelGreaterThan(String value) {
       addCriterion("sendTel >", value, "sendtel");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSendtelGreaterThanOrEqualTo(String value) {
       addCriterion("sendTel >=", value, "sendtel");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSendtelLessThan(String value) {
       addCriterion("sendTel <", value, "sendtel");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSendtelLessThanOrEqualTo(String value) {
       addCriterion("sendTel <=", value, "sendtel");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSendtelLike(String value) {
       addCriterion("sendTel like", value, "sendtel");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSendtelNotLike(String value) {
       addCriterion("sendTel not like", value, "sendtel");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSendtelIn(List<String> values) {
       addCriterion("sendTel in", values, "sendtel");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSendtelNotIn(List<String> values) {
       addCriterion("sendTel not in", values, "sendtel");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSendtelBetween(String value1, String value2) {
       addCriterion("sendTel between", value1, value2, "sendtel");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSendtelNotBetween(String value1, String value2) {
       addCriterion("sendTel not between", value1, value2, "sendtel");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSendaddressIsNull() {
       addCriterion("sendAddress is null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSendaddressIsNotNull() {
       addCriterion("sendAddress is not null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSendaddressEqualTo(String value) {
       addCriterion("sendAddress =", value, "sendaddress");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSendaddressNotEqualTo(String value) {
       addCriterion("sendAddress <>", value, "sendaddress");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSendaddressGreaterThan(String value) {
       addCriterion("sendAddress >", value, "sendaddress");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSendaddressGreaterThanOrEqualTo(String value) {
       addCriterion("sendAddress >=", value, "sendaddress");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSendaddressLessThan(String value) {
       addCriterion("sendAddress <", value, "sendaddress");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSendaddressLessThanOrEqualTo(String value) {
       addCriterion("sendAddress <=", value, "sendaddress");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSendaddressLike(String value) {
       addCriterion("sendAddress like", value, "sendaddress");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSendaddressNotLike(String value) {
       addCriterion("sendAddress not like", value, "sendaddress");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSendaddressIn(List<String> values) {
       addCriterion("sendAddress in", values, "sendaddress");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSendaddressNotIn(List<String> values) {
       addCriterion("sendAddress not in", values, "sendaddress");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSendaddressBetween(String value1, String value2) {
       addCriterion("sendAddress between", value1, value2, "sendaddress");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSendaddressNotBetween(String value1, String value2) {
       addCriterion("sendAddress not between", value1, value2, "sendaddress");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andItemcountIsNull() {
       addCriterion("itemCount is null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andItemcountIsNotNull() {
       addCriterion("itemCount is not null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andItemcountEqualTo(Integer value) {
       addCriterion("itemCount =", value, "itemcount");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andItemcountNotEqualTo(Integer value) {
       addCriterion("itemCount <>", value, "itemcount");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andItemcountGreaterThan(Integer value) {
       addCriterion("itemCount >", value, "itemcount");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andItemcountGreaterThanOrEqualTo(Integer value) {
       addCriterion("itemCount >=", value, "itemcount");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andItemcountLessThan(Integer value) {
       addCriterion("itemCount <", value, "itemcount");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andItemcountLessThanOrEqualTo(Integer value) {
       addCriterion("itemCount <=", value, "itemcount");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andItemcountIn(List<Integer> values) {
       addCriterion("itemCount in", values, "itemcount");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andItemcountNotIn(List<Integer> values) {
       addCriterion("itemCount not in", values, "itemcount");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andItemcountBetween(Integer value1, Integer value2) {
       addCriterion("itemCount between", value1, value2, "itemcount");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andItemcountNotBetween(Integer value1, Integer value2) {
       addCriterion("itemCount not between", value1, value2, "itemcount");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andExpresscodeIsNull() {
       addCriterion("expressCode is null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andExpresscodeIsNotNull() {
       addCriterion("expressCode is not null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andExpresscodeEqualTo(String value) {
       addCriterion("expressCode =", value, "expresscode");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andExpresscodeNotEqualTo(String value) {
       addCriterion("expressCode <>", value, "expresscode");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andExpresscodeGreaterThan(String value) {
       addCriterion("expressCode >", value, "expresscode");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andExpresscodeGreaterThanOrEqualTo(String value) {
       addCriterion("expressCode >=", value, "expresscode");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andExpresscodeLessThan(String value) {
       addCriterion("expressCode <", value, "expresscode");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andExpresscodeLessThanOrEqualTo(String value) {
       addCriterion("expressCode <=", value, "expresscode");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andExpresscodeLike(String value) {
       addCriterion("expressCode like", value, "expresscode");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andExpresscodeNotLike(String value) {
       addCriterion("expressCode not like", value, "expresscode");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andExpresscodeIn(List<String> values) {
       addCriterion("expressCode in", values, "expresscode");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andExpresscodeNotIn(List<String> values) {
       addCriterion("expressCode not in", values, "expresscode");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andExpresscodeBetween(String value1, String value2) {
       addCriterion("expressCode between", value1, value2, "expresscode");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andExpresscodeNotBetween(String value1, String value2) {
       addCriterion("expressCode not between", value1, value2, "expresscode");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andOrderstatusIsNull() {
       addCriterion("orderStatus is null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andOrderstatusIsNotNull() {
       addCriterion("orderStatus is not null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andOrderstatusEqualTo(Integer value) {
       addCriterion("orderStatus =", value, "orderstatus");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andOrderstatusNotEqualTo(Integer value) {
       addCriterion("orderStatus <>", value, "orderstatus");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andOrderstatusGreaterThan(Integer value) {
       addCriterion("orderStatus >", value, "orderstatus");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andOrderstatusGreaterThanOrEqualTo(Integer value) {
       addCriterion("orderStatus >=", value, "orderstatus");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andOrderstatusLessThan(Integer value) {
       addCriterion("orderStatus <", value, "orderstatus");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andOrderstatusLessThanOrEqualTo(Integer value) {
       addCriterion("orderStatus <=", value, "orderstatus");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andOrderstatusIn(List<Integer> values) {
       addCriterion("orderStatus in", values, "orderstatus");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andOrderstatusNotIn(List<Integer> values) {
       addCriterion("orderStatus not in", values, "orderstatus");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andOrderstatusBetween(Integer value1, Integer value2) {
       addCriterion("orderStatus between", value1, value2, "orderstatus");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andOrderstatusNotBetween(Integer value1, Integer value2) {
       addCriterion("orderStatus not between", value1, value2, "orderstatus");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andOrderstepIsNull() {
       addCriterion("orderStep is null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andOrderstepIsNotNull() {
       addCriterion("orderStep is not null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andOrderstepEqualTo(Integer value) {
       addCriterion("orderStep =", value, "orderstep");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andOrderstepNotEqualTo(Integer value) {
       addCriterion("orderStep <>", value, "orderstep");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andOrderstepGreaterThan(Integer value) {
       addCriterion("orderStep >", value, "orderstep");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andOrderstepGreaterThanOrEqualTo(Integer value) {
       addCriterion("orderStep >=", value, "orderstep");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andOrderstepLessThan(Integer value) {
       addCriterion("orderStep <", value, "orderstep");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andOrderstepLessThanOrEqualTo(Integer value) {
       addCriterion("orderStep <=", value, "orderstep");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andOrderstepIn(List<Integer> values) {
       addCriterion("orderStep in", values, "orderstep");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andOrderstepNotIn(List<Integer> values) {
       addCriterion("orderStep not in", values, "orderstep");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andOrderstepBetween(Integer value1, Integer value2) {
       addCriterion("orderStep between", value1, value2, "orderstep");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andOrderstepNotBetween(Integer value1, Integer value2) {
       addCriterion("orderStep not between", value1, value2, "orderstep");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andBatchnoIsNull() {
       addCriterion("batchNo is null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andBatchnoIsNotNull() {
       addCriterion("batchNo is not null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andBatchnoEqualTo(String value) {
       addCriterion("batchNo =", value, "batchno");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andBatchnoNotEqualTo(String value) {
       addCriterion("batchNo <>", value, "batchno");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andBatchnoGreaterThan(String value) {
       addCriterion("batchNo >", value, "batchno");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andBatchnoGreaterThanOrEqualTo(String value) {
       addCriterion("batchNo >=", value, "batchno");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andBatchnoLessThan(String value) {
       addCriterion("batchNo <", value, "batchno");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andBatchnoLessThanOrEqualTo(String value) {
       addCriterion("batchNo <=", value, "batchno");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andBatchnoLike(String value) {
       addCriterion("batchNo like", value, "batchno");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andBatchnoNotLike(String value) {
       addCriterion("batchNo not like", value, "batchno");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andBatchnoIn(List<String> values) {
       addCriterion("batchNo in", values, "batchno");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andBatchnoNotIn(List<String> values) {
       addCriterion("batchNo not in", values, "batchno");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andBatchnoBetween(String value1, String value2) {
       addCriterion("batchNo between", value1, value2, "batchno");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andBatchnoNotBetween(String value1, String value2) {
       addCriterion("batchNo not between", value1, value2, "batchno");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andWeightIsNull() {
       addCriterion("weight is null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andWeightIsNotNull() {
       addCriterion("weight is not null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andWeightEqualTo(String value) {
       addCriterion("weight =", value, "weight");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andWeightNotEqualTo(String value) {
       addCriterion("weight <>", value, "weight");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andWeightGreaterThan(String value) {
       addCriterion("weight >", value, "weight");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andWeightGreaterThanOrEqualTo(String value) {
       addCriterion("weight >=", value, "weight");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andWeightLessThan(String value) {
       addCriterion("weight <", value, "weight");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andWeightLessThanOrEqualTo(String value) {
       addCriterion("weight <=", value, "weight");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andWeightLike(String value) {
       addCriterion("weight like", value, "weight");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andWeightNotLike(String value) {
       addCriterion("weight not like", value, "weight");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andWeightIn(List<String> values) {
       addCriterion("weight in", values, "weight");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andWeightNotIn(List<String> values) {
       addCriterion("weight not in", values, "weight");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andWeightBetween(String value1, String value2) {
       addCriterion("weight between", value1, value2, "weight");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andWeightNotBetween(String value1, String value2) {
       addCriterion("weight not between", value1, value2, "weight");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andWeighttimeIsNull() {
       addCriterion("weightTime is null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andWeighttimeIsNotNull() {
       addCriterion("weightTime is not null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andWeighttimeEqualTo(Date value) {
       addCriterion("weightTime =", value, "weighttime");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andWeighttimeNotEqualTo(Date value) {
       addCriterion("weightTime <>", value, "weighttime");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andWeighttimeGreaterThan(Date value) {
       addCriterion("weightTime >", value, "weighttime");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andWeighttimeGreaterThanOrEqualTo(Date value) {
       addCriterion("weightTime >=", value, "weighttime");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andWeighttimeLessThan(Date value) {
       addCriterion("weightTime <", value, "weighttime");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andWeighttimeLessThanOrEqualTo(Date value) {
       addCriterion("weightTime <=", value, "weighttime");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andWeighttimeIn(List<Date> values) {
       addCriterion("weightTime in", values, "weighttime");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andWeighttimeNotIn(List<Date> values) {
       addCriterion("weightTime not in", values, "weighttime");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andWeighttimeBetween(Date value1, Date value2) {
       addCriterion("weightTime between", value1, value2, "weighttime");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andWeighttimeNotBetween(Date value1, Date value2) {
       addCriterion("weightTime not between", value1, value2, "weighttime");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andWeightuseridIsNull() {
       addCriterion("weightUserId is null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andWeightuseridIsNotNull() {
       addCriterion("weightUserId is not null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andWeightuseridEqualTo(Integer value) {
       addCriterion("weightUserId =", value, "weightuserid");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andWeightuseridNotEqualTo(Integer value) {
       addCriterion("weightUserId <>", value, "weightuserid");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andWeightuseridGreaterThan(Integer value) {
       addCriterion("weightUserId >", value, "weightuserid");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andWeightuseridGreaterThanOrEqualTo(Integer value) {
       addCriterion("weightUserId >=", value, "weightuserid");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andWeightuseridLessThan(Integer value) {
       addCriterion("weightUserId <", value, "weightuserid");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andWeightuseridLessThanOrEqualTo(Integer value) {
       addCriterion("weightUserId <=", value, "weightuserid");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andWeightuseridIn(List<Integer> values) {
       addCriterion("weightUserId in", values, "weightuserid");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andWeightuseridNotIn(List<Integer> values) {
       addCriterion("weightUserId not in", values, "weightuserid");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andWeightuseridBetween(Integer value1, Integer value2) {
       addCriterion("weightUserId between", value1, value2, "weightuserid");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andWeightuseridNotBetween(Integer value1, Integer value2) {
       addCriterion("weightUserId not between", value1, value2, "weightuserid");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andCreatetimeIsNull() {
       addCriterion("createTime is null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andCreatetimeIsNotNull() {
       addCriterion("createTime is not null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andCreatetimeEqualTo(Date value) {
       addCriterion("createTime =", value, "createtime");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andCreatetimeNotEqualTo(Date value) {
       addCriterion("createTime <>", value, "createtime");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andCreatetimeGreaterThan(Date value) {
       addCriterion("createTime >", value, "createtime");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
       addCriterion("createTime >=", value, "createtime");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andCreatetimeLessThan(Date value) {
       addCriterion("createTime <", value, "createtime");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andCreatetimeLessThanOrEqualTo(Date value) {
       addCriterion("createTime <=", value, "createtime");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andCreatetimeIn(List<Date> values) {
       addCriterion("createTime in", values, "createtime");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andCreatetimeNotIn(List<Date> values) {
       addCriterion("createTime not in", values, "createtime");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andCreatetimeBetween(Date value1, Date value2) {
       addCriterion("createTime between", value1, value2, "createtime");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andCreatetimeNotBetween(Date value1, Date value2) {
       addCriterion("createTime not between", value1, value2, "createtime");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andIsdeletedIsNull() {
       addCriterion("isDeleted is null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andIsdeletedIsNotNull() {
       addCriterion("isDeleted is not null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andIsdeletedEqualTo(Integer value) {
       addCriterion("isDeleted =", value, "isdeleted");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andIsdeletedNotEqualTo(Integer value) {
       addCriterion("isDeleted <>", value, "isdeleted");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andIsdeletedGreaterThan(Integer value) {
       addCriterion("isDeleted >", value, "isdeleted");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andIsdeletedGreaterThanOrEqualTo(Integer value) {
       addCriterion("isDeleted >=", value, "isdeleted");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andIsdeletedLessThan(Integer value) {
       addCriterion("isDeleted <", value, "isdeleted");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andIsdeletedLessThanOrEqualTo(Integer value) {
       addCriterion("isDeleted <=", value, "isdeleted");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andIsdeletedIn(List<Integer> values) {
       addCriterion("isDeleted in", values, "isdeleted");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andIsdeletedNotIn(List<Integer> values) {
       addCriterion("isDeleted not in", values, "isdeleted");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andIsdeletedBetween(Integer value1, Integer value2) {
       addCriterion("isDeleted between", value1, value2, "isdeleted");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andIsdeletedNotBetween(Integer value1, Integer value2) {
       addCriterion("isDeleted not between", value1, value2, "isdeleted");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andItemnameIsNull() {
       addCriterion("itemName is null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andItemnameIsNotNull() {
       addCriterion("itemName is not null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andItemnameEqualTo(String value) {
       addCriterion("itemName =", value, "itemname");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andItemnameNotEqualTo(String value) {
       addCriterion("itemName <>", value, "itemname");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andItemnameGreaterThan(String value) {
       addCriterion("itemName >", value, "itemname");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andItemnameGreaterThanOrEqualTo(String value) {
       addCriterion("itemName >=", value, "itemname");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andItemnameLessThan(String value) {
       addCriterion("itemName <", value, "itemname");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andItemnameLessThanOrEqualTo(String value) {
       addCriterion("itemName <=", value, "itemname");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andItemnameLike(String value) {
       addCriterion("itemName like", value, "itemname");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andItemnameNotLike(String value) {
       addCriterion("itemName not like", value, "itemname");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andItemnameIn(List<String> values) {
       addCriterion("itemName in", values, "itemname");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andItemnameNotIn(List<String> values) {
       addCriterion("itemName not in", values, "itemname");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andItemnameBetween(String value1, String value2) {
       addCriterion("itemName between", value1, value2, "itemname");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andItemnameNotBetween(String value1, String value2) {
       addCriterion("itemName not between", value1, value2, "itemname");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSignstatusIsNull() {
       addCriterion("signStatus is null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSignstatusIsNotNull() {
       addCriterion("signStatus is not null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSignstatusEqualTo(Integer value) {
       addCriterion("signStatus =", value, "signstatus");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSignstatusNotEqualTo(Integer value) {
       addCriterion("signStatus <>", value, "signstatus");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSignstatusGreaterThan(Integer value) {
       addCriterion("signStatus >", value, "signstatus");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSignstatusGreaterThanOrEqualTo(Integer value) {
       addCriterion("signStatus >=", value, "signstatus");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSignstatusLessThan(Integer value) {
       addCriterion("signStatus <", value, "signstatus");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSignstatusLessThanOrEqualTo(Integer value) {
       addCriterion("signStatus <=", value, "signstatus");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSignstatusIn(List<Integer> values) {
       addCriterion("signStatus in", values, "signstatus");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSignstatusNotIn(List<Integer> values) {
       addCriterion("signStatus not in", values, "signstatus");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSignstatusBetween(Integer value1, Integer value2) {
       addCriterion("signStatus between", value1, value2, "signstatus");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSignstatusNotBetween(Integer value1, Integer value2) {
       addCriterion("signStatus not between", value1, value2, "signstatus");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSigndateIsNull() {
       addCriterion("signDate is null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSigndateIsNotNull() {
       addCriterion("signDate is not null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSigndateEqualTo(Date value) {
       addCriterion("signDate =", value, "signdate");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSigndateNotEqualTo(Date value) {
       addCriterion("signDate <>", value, "signdate");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSigndateGreaterThan(Date value) {
       addCriterion("signDate >", value, "signdate");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSigndateGreaterThanOrEqualTo(Date value) {
       addCriterion("signDate >=", value, "signdate");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSigndateLessThan(Date value) {
       addCriterion("signDate <", value, "signdate");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSigndateLessThanOrEqualTo(Date value) {
       addCriterion("signDate <=", value, "signdate");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSigndateIn(List<Date> values) {
       addCriterion("signDate in", values, "signdate");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSigndateNotIn(List<Date> values) {
       addCriterion("signDate not in", values, "signdate");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSigndateBetween(Date value1, Date value2) {
       addCriterion("signDate between", value1, value2, "signdate");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSigndateNotBetween(Date value1, Date value2) {
       addCriterion("signDate not between", value1, value2, "signdate");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSignprescriptionIsNull() {
       addCriterion("signPrescription is null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSignprescriptionIsNotNull() {
       addCriterion("signPrescription is not null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSignprescriptionEqualTo(String value) {
       addCriterion("signPrescription =", value, "signprescription");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSignprescriptionNotEqualTo(String value) {
       addCriterion("signPrescription <>", value, "signprescription");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSignprescriptionGreaterThan(String value) {
       addCriterion("signPrescription >", value, "signprescription");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSignprescriptionGreaterThanOrEqualTo(String value) {
       addCriterion("signPrescription >=", value, "signprescription");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSignprescriptionLessThan(String value) {
       addCriterion("signPrescription <", value, "signprescription");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSignprescriptionLessThanOrEqualTo(String value) {
       addCriterion("signPrescription <=", value, "signprescription");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSignprescriptionLike(String value) {
       addCriterion("signPrescription like", value, "signprescription");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSignprescriptionNotLike(String value) {
       addCriterion("signPrescription not like", value, "signprescription");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSignprescriptionIn(List<String> values) {
       addCriterion("signPrescription in", values, "signprescription");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSignprescriptionNotIn(List<String> values) {
       addCriterion("signPrescription not in", values, "signprescription");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSignprescriptionBetween(String value1, String value2) {
       addCriterion("signPrescription between", value1, value2, "signprescription");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andSignprescriptionNotBetween(String value1, String value2) {
       addCriterion("signPrescription not between", value1, value2, "signprescription");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andLogisticstrackIsNull() {
       addCriterion("logisticsTrack is null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andLogisticstrackIsNotNull() {
       addCriterion("logisticsTrack is not null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andLogisticstrackEqualTo(String value) {
       addCriterion("logisticsTrack =", value, "logisticstrack");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andLogisticstrackNotEqualTo(String value) {
       addCriterion("logisticsTrack <>", value, "logisticstrack");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andLogisticstrackGreaterThan(String value) {
       addCriterion("logisticsTrack >", value, "logisticstrack");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andLogisticstrackGreaterThanOrEqualTo(String value) {
       addCriterion("logisticsTrack >=", value, "logisticstrack");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andLogisticstrackLessThan(String value) {
       addCriterion("logisticsTrack <", value, "logisticstrack");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andLogisticstrackLessThanOrEqualTo(String value) {
       addCriterion("logisticsTrack <=", value, "logisticstrack");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andLogisticstrackLike(String value) {
       addCriterion("logisticsTrack like", value, "logisticstrack");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andLogisticstrackNotLike(String value) {
       addCriterion("logisticsTrack not like", value, "logisticstrack");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andLogisticstrackIn(List<String> values) {
       addCriterion("logisticsTrack in", values, "logisticstrack");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andLogisticstrackNotIn(List<String> values) {
       addCriterion("logisticsTrack not in", values, "logisticstrack");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andLogisticstrackBetween(String value1, String value2) {
       addCriterion("logisticsTrack between", value1, value2, "logisticstrack");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andLogisticstrackNotBetween(String value1, String value2) {
       addCriterion("logisticsTrack not between", value1, value2, "logisticstrack");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andMarkdestinationIsNull() {
       addCriterion("markDestination is null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andMarkdestinationIsNotNull() {
       addCriterion("markDestination is not null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andMarkdestinationEqualTo(String value) {
       addCriterion("markDestination =", value, "markdestination");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andMarkdestinationNotEqualTo(String value) {
       addCriterion("markDestination <>", value, "markdestination");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andMarkdestinationGreaterThan(String value) {
       addCriterion("markDestination >", value, "markdestination");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andMarkdestinationGreaterThanOrEqualTo(String value) {
       addCriterion("markDestination >=", value, "markdestination");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andMarkdestinationLessThan(String value) {
       addCriterion("markDestination <", value, "markdestination");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andMarkdestinationLessThanOrEqualTo(String value) {
       addCriterion("markDestination <=", value, "markdestination");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andMarkdestinationLike(String value) {
       addCriterion("markDestination like", value, "markdestination");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andMarkdestinationNotLike(String value) {
       addCriterion("markDestination not like", value, "markdestination");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andMarkdestinationIn(List<String> values) {
       addCriterion("markDestination in", values, "markdestination");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andMarkdestinationNotIn(List<String> values) {
       addCriterion("markDestination not in", values, "markdestination");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andMarkdestinationBetween(String value1, String value2) {
       addCriterion("markDestination between", value1, value2, "markdestination");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andMarkdestinationNotBetween(String value1, String value2) {
       addCriterion("markDestination not between", value1, value2, "markdestination");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andBillprovidesitenameIsNull() {
       addCriterion("billProvideSiteName is null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andBillprovidesitenameIsNotNull() {
       addCriterion("billProvideSiteName is not null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andBillprovidesitenameEqualTo(String value) {
       addCriterion("billProvideSiteName =", value, "billprovidesitename");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andBillprovidesitenameNotEqualTo(String value) {
       addCriterion("billProvideSiteName <>", value, "billprovidesitename");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andBillprovidesitenameGreaterThan(String value) {
       addCriterion("billProvideSiteName >", value, "billprovidesitename");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andBillprovidesitenameGreaterThanOrEqualTo(String value) {
       addCriterion("billProvideSiteName >=", value, "billprovidesitename");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andBillprovidesitenameLessThan(String value) {
       addCriterion("billProvideSiteName <", value, "billprovidesitename");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andBillprovidesitenameLessThanOrEqualTo(String value) {
       addCriterion("billProvideSiteName <=", value, "billprovidesitename");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andBillprovidesitenameLike(String value) {
       addCriterion("billProvideSiteName like", value, "billprovidesitename");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andBillprovidesitenameNotLike(String value) {
       addCriterion("billProvideSiteName not like", value, "billprovidesitename");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andBillprovidesitenameIn(List<String> values) {
       addCriterion("billProvideSiteName in", values, "billprovidesitename");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andBillprovidesitenameNotIn(List<String> values) {
       addCriterion("billProvideSiteName not in", values, "billprovidesitename");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andBillprovidesitenameBetween(String value1, String value2) {
       addCriterion("billProvideSiteName between", value1, value2, "billprovidesitename");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andBillprovidesitenameNotBetween(String value1, String value2) {
       addCriterion("billProvideSiteName not between", value1, value2, "billprovidesitename");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andBillprovidesitecodeIsNull() {
       addCriterion("billProvideSiteCode is null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andBillprovidesitecodeIsNotNull() {
       addCriterion("billProvideSiteCode is not null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andBillprovidesitecodeEqualTo(String value) {
       addCriterion("billProvideSiteCode =", value, "billprovidesitecode");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andBillprovidesitecodeNotEqualTo(String value) {
       addCriterion("billProvideSiteCode <>", value, "billprovidesitecode");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andBillprovidesitecodeGreaterThan(String value) {
       addCriterion("billProvideSiteCode >", value, "billprovidesitecode");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andBillprovidesitecodeGreaterThanOrEqualTo(String value) {
       addCriterion("billProvideSiteCode >=", value, "billprovidesitecode");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andBillprovidesitecodeLessThan(String value) {
       addCriterion("billProvideSiteCode <", value, "billprovidesitecode");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andBillprovidesitecodeLessThanOrEqualTo(String value) {
       addCriterion("billProvideSiteCode <=", value, "billprovidesitecode");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andBillprovidesitecodeLike(String value) {
       addCriterion("billProvideSiteCode like", value, "billprovidesitecode");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andBillprovidesitecodeNotLike(String value) {
       addCriterion("billProvideSiteCode not like", value, "billprovidesitecode");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andBillprovidesitecodeIn(List<String> values) {
       addCriterion("billProvideSiteCode in", values, "billprovidesitecode");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andBillprovidesitecodeNotIn(List<String> values) {
       addCriterion("billProvideSiteCode not in", values, "billprovidesitecode");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andBillprovidesitecodeBetween(String value1, String value2) {
       addCriterion("billProvideSiteCode between", value1, value2, "billprovidesitecode");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andBillprovidesitecodeNotBetween(String value1, String value2) {
       addCriterion("billProvideSiteCode not between", value1, value2, "billprovidesitecode");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andIsclosingIsNull() {
       addCriterion("isclosing is null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andIsclosingIsNotNull() {
       addCriterion("isclosing is not null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andIsclosingEqualTo(Integer value) {
       addCriterion("isclosing =", value, "isclosing");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andIsclosingNotEqualTo(Integer value) {
       addCriterion("isclosing <>", value, "isclosing");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andIsclosingGreaterThan(Integer value) {
       addCriterion("isclosing >", value, "isclosing");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andIsclosingGreaterThanOrEqualTo(Integer value) {
       addCriterion("isclosing >=", value, "isclosing");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andIsclosingLessThan(Integer value) {
       addCriterion("isclosing <", value, "isclosing");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andIsclosingLessThanOrEqualTo(Integer value) {
       addCriterion("isclosing <=", value, "isclosing");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andIsclosingIn(List<Integer> values) {
       addCriterion("isclosing in", values, "isclosing");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andIsclosingNotIn(List<Integer> values) {
       addCriterion("isclosing not in", values, "isclosing");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andIsclosingBetween(Integer value1, Integer value2) {
       addCriterion("isclosing between", value1, value2, "isclosing");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andIsclosingNotBetween(Integer value1, Integer value2) {
       addCriterion("isclosing not between", value1, value2, "isclosing");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andShippingIsNull() {
       addCriterion("shipping is null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andShippingIsNotNull() {
       addCriterion("shipping is not null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andShippingEqualTo(Integer value) {
       addCriterion("shipping =", value, "shipping");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andShippingNotEqualTo(Integer value) {
       addCriterion("shipping <>", value, "shipping");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andShippingGreaterThan(Integer value) {
       addCriterion("shipping >", value, "shipping");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andShippingGreaterThanOrEqualTo(Integer value) {
       addCriterion("shipping >=", value, "shipping");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andShippingLessThan(Integer value) {
       addCriterion("shipping <", value, "shipping");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andShippingLessThanOrEqualTo(Integer value) {
       addCriterion("shipping <=", value, "shipping");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andShippingIn(List<Integer> values) {
       addCriterion("shipping in", values, "shipping");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andShippingNotIn(List<Integer> values) {
       addCriterion("shipping not in", values, "shipping");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andShippingBetween(Integer value1, Integer value2) {
       addCriterion("shipping between", value1, value2, "shipping");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andShippingNotBetween(Integer value1, Integer value2) {
       addCriterion("shipping not between", value1, value2, "shipping");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andDuihaoIsNull() {
       addCriterion("duihao is null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andDuihaoIsNotNull() {
       addCriterion("duihao is not null");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andDuihaoEqualTo(String value) {
       addCriterion("duihao =", value, "duihao");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andDuihaoNotEqualTo(String value) {
       addCriterion("duihao <>", value, "duihao");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andDuihaoGreaterThan(String value) {
       addCriterion("duihao >", value, "duihao");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andDuihaoGreaterThanOrEqualTo(String value) {
       addCriterion("duihao >=", value, "duihao");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andDuihaoLessThan(String value) {
       addCriterion("duihao <", value, "duihao");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andDuihaoLessThanOrEqualTo(String value) {
       addCriterion("duihao <=", value, "duihao");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andDuihaoLike(String value) {
       addCriterion("duihao like", value, "duihao");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andDuihaoNotLike(String value) {
       addCriterion("duihao not like", value, "duihao");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andDuihaoIn(List<String> values) {
       addCriterion("duihao in", values, "duihao");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andDuihaoNotIn(List<String> values) {
       addCriterion("duihao not in", values, "duihao");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andDuihaoBetween(String value1, String value2) {
       addCriterion("duihao between", value1, value2, "duihao");
       return (TOrderExample.Criteria)this;
     }
     
     public TOrderExample.Criteria andDuihaoNotBetween(String value1, String value2) {
       addCriterion("duihao not between", value1, value2, "duihao");
       return (TOrderExample.Criteria)this;
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


