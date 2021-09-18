 package com.zt.pojo.po;
 
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 public class TQjzyExample
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
     protected List<TQjzyExample.Criterion> criteria = new ArrayList<TQjzyExample.Criterion>();
 
     
     public boolean isValid() {
       return (this.criteria.size() > 0);
     }
     
     public List<TQjzyExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
     
     public List<TQjzyExample.Criterion> getCriteria() {
       return this.criteria;
     }
     
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new TQjzyExample.Criterion(condition));
     }
     
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new TQjzyExample.Criterion(condition, value));
     }
     
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if (value1 == null || value2 == null) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new TQjzyExample.Criterion(condition, value1, value2));
     }
     
     public TQjzyExample.Criteria andIdIsNull() {
       addCriterion("id is null");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andIdIsNotNull() {
       addCriterion("id is not null");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andIdEqualTo(Integer value) {
       addCriterion("id =", value, "id");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andIdNotEqualTo(Integer value) {
       addCriterion("id <>", value, "id");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andIdGreaterThan(Integer value) {
       addCriterion("id >", value, "id");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("id >=", value, "id");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andIdLessThan(Integer value) {
       addCriterion("id <", value, "id");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andIdLessThanOrEqualTo(Integer value) {
       addCriterion("id <=", value, "id");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andIdIn(List<Integer> values) {
       addCriterion("id in", values, "id");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andIdNotIn(List<Integer> values) {
       addCriterion("id not in", values, "id");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andIdBetween(Integer value1, Integer value2) {
       addCriterion("id between", value1, value2, "id");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
       addCriterion("id not between", value1, value2, "id");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andCompanycodeIsNull() {
       addCriterion("companyCode is null");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andCompanycodeIsNotNull() {
       addCriterion("companyCode is not null");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andCompanycodeEqualTo(String value) {
       addCriterion("companyCode =", value, "companycode");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andCompanycodeNotEqualTo(String value) {
       addCriterion("companyCode <>", value, "companycode");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andCompanycodeGreaterThan(String value) {
       addCriterion("companyCode >", value, "companycode");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andCompanycodeGreaterThanOrEqualTo(String value) {
       addCriterion("companyCode >=", value, "companycode");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andCompanycodeLessThan(String value) {
       addCriterion("companyCode <", value, "companycode");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andCompanycodeLessThanOrEqualTo(String value) {
       addCriterion("companyCode <=", value, "companycode");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andCompanycodeLike(String value) {
       addCriterion("companyCode like", value, "companycode");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andCompanycodeNotLike(String value) {
       addCriterion("companyCode not like", value, "companycode");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andCompanycodeIn(List<String> values) {
       addCriterion("companyCode in", values, "companycode");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andCompanycodeNotIn(List<String> values) {
       addCriterion("companyCode not in", values, "companycode");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andCompanycodeBetween(String value1, String value2) {
       addCriterion("companyCode between", value1, value2, "companycode");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andCompanycodeNotBetween(String value1, String value2) {
       addCriterion("companyCode not between", value1, value2, "companycode");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andItemnameIsNull() {
       addCriterion("itemName is null");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andItemnameIsNotNull() {
       addCriterion("itemName is not null");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andItemnameEqualTo(String value) {
       addCriterion("itemName =", value, "itemname");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andItemnameNotEqualTo(String value) {
       addCriterion("itemName <>", value, "itemname");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andItemnameGreaterThan(String value) {
       addCriterion("itemName >", value, "itemname");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andItemnameGreaterThanOrEqualTo(String value) {
       addCriterion("itemName >=", value, "itemname");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andItemnameLessThan(String value) {
       addCriterion("itemName <", value, "itemname");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andItemnameLessThanOrEqualTo(String value) {
       addCriterion("itemName <=", value, "itemname");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andItemnameLike(String value) {
       addCriterion("itemName like", value, "itemname");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andItemnameNotLike(String value) {
       addCriterion("itemName not like", value, "itemname");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andItemnameIn(List<String> values) {
       addCriterion("itemName in", values, "itemname");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andItemnameNotIn(List<String> values) {
       addCriterion("itemName not in", values, "itemname");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andItemnameBetween(String value1, String value2) {
       addCriterion("itemName between", value1, value2, "itemname");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andItemnameNotBetween(String value1, String value2) {
       addCriterion("itemName not between", value1, value2, "itemname");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andItemskuIsNull() {
       addCriterion("itemSku is null");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andItemskuIsNotNull() {
       addCriterion("itemSku is not null");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andItemskuEqualTo(String value) {
       addCriterion("itemSku =", value, "itemsku");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andItemskuNotEqualTo(String value) {
       addCriterion("itemSku <>", value, "itemsku");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andItemskuGreaterThan(String value) {
       addCriterion("itemSku >", value, "itemsku");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andItemskuGreaterThanOrEqualTo(String value) {
       addCriterion("itemSku >=", value, "itemsku");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andItemskuLessThan(String value) {
       addCriterion("itemSku <", value, "itemsku");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andItemskuLessThanOrEqualTo(String value) {
       addCriterion("itemSku <=", value, "itemsku");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andItemskuLike(String value) {
       addCriterion("itemSku like", value, "itemsku");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andItemskuNotLike(String value) {
       addCriterion("itemSku not like", value, "itemsku");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andItemskuIn(List<String> values) {
       addCriterion("itemSku in", values, "itemsku");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andItemskuNotIn(List<String> values) {
       addCriterion("itemSku not in", values, "itemsku");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andItemskuBetween(String value1, String value2) {
       addCriterion("itemSku between", value1, value2, "itemsku");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andItemskuNotBetween(String value1, String value2) {
       addCriterion("itemSku not between", value1, value2, "itemsku");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andNumIsNull() {
       addCriterion("num is null");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andNumIsNotNull() {
       addCriterion("num is not null");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andNumEqualTo(Integer value) {
       addCriterion("num =", value, "num");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andNumNotEqualTo(Integer value) {
       addCriterion("num <>", value, "num");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andNumGreaterThan(Integer value) {
       addCriterion("num >", value, "num");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andNumGreaterThanOrEqualTo(Integer value) {
       addCriterion("num >=", value, "num");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andNumLessThan(Integer value) {
       addCriterion("num <", value, "num");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andNumLessThanOrEqualTo(Integer value) {
       addCriterion("num <=", value, "num");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andNumIn(List<Integer> values) {
       addCriterion("num in", values, "num");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andNumNotIn(List<Integer> values) {
       addCriterion("num not in", values, "num");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andNumBetween(Integer value1, Integer value2) {
       addCriterion("num between", value1, value2, "num");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andNumNotBetween(Integer value1, Integer value2) {
       addCriterion("num not between", value1, value2, "num");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andReceivedaddressIsNull() {
       addCriterion("receivedAddress is null");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andReceivedaddressIsNotNull() {
       addCriterion("receivedAddress is not null");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andReceivedaddressEqualTo(String value) {
       addCriterion("receivedAddress =", value, "receivedaddress");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andReceivedaddressNotEqualTo(String value) {
       addCriterion("receivedAddress <>", value, "receivedaddress");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andReceivedaddressGreaterThan(String value) {
       addCriterion("receivedAddress >", value, "receivedaddress");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andReceivedaddressGreaterThanOrEqualTo(String value) {
       addCriterion("receivedAddress >=", value, "receivedaddress");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andReceivedaddressLessThan(String value) {
       addCriterion("receivedAddress <", value, "receivedaddress");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andReceivedaddressLessThanOrEqualTo(String value) {
       addCriterion("receivedAddress <=", value, "receivedaddress");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andReceivedaddressLike(String value) {
       addCriterion("receivedAddress like", value, "receivedaddress");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andReceivedaddressNotLike(String value) {
       addCriterion("receivedAddress not like", value, "receivedaddress");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andReceivedaddressIn(List<String> values) {
       addCriterion("receivedAddress in", values, "receivedaddress");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andReceivedaddressNotIn(List<String> values) {
       addCriterion("receivedAddress not in", values, "receivedaddress");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andReceivedaddressBetween(String value1, String value2) {
       addCriterion("receivedAddress between", value1, value2, "receivedaddress");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andReceivedaddressNotBetween(String value1, String value2) {
       addCriterion("receivedAddress not between", value1, value2, "receivedaddress");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andReceiverIsNull() {
       addCriterion("receiver is null");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andReceiverIsNotNull() {
       addCriterion("receiver is not null");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andReceiverEqualTo(String value) {
       addCriterion("receiver =", value, "receiver");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andReceiverNotEqualTo(String value) {
       addCriterion("receiver <>", value, "receiver");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andReceiverGreaterThan(String value) {
       addCriterion("receiver >", value, "receiver");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andReceiverGreaterThanOrEqualTo(String value) {
       addCriterion("receiver >=", value, "receiver");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andReceiverLessThan(String value) {
       addCriterion("receiver <", value, "receiver");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andReceiverLessThanOrEqualTo(String value) {
       addCriterion("receiver <=", value, "receiver");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andReceiverLike(String value) {
       addCriterion("receiver like", value, "receiver");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andReceiverNotLike(String value) {
       addCriterion("receiver not like", value, "receiver");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andReceiverIn(List<String> values) {
       addCriterion("receiver in", values, "receiver");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andReceiverNotIn(List<String> values) {
       addCriterion("receiver not in", values, "receiver");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andReceiverBetween(String value1, String value2) {
       addCriterion("receiver between", value1, value2, "receiver");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andReceiverNotBetween(String value1, String value2) {
       addCriterion("receiver not between", value1, value2, "receiver");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andTypeIsNull() {
       addCriterion("type is null");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andTypeIsNotNull() {
       addCriterion("type is not null");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andTypeEqualTo(Integer value) {
       addCriterion("type =", value, "type");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andTypeNotEqualTo(Integer value) {
       addCriterion("type <>", value, "type");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andTypeGreaterThan(Integer value) {
       addCriterion("type >", value, "type");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andTypeGreaterThanOrEqualTo(Integer value) {
       addCriterion("type >=", value, "type");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andTypeLessThan(Integer value) {
       addCriterion("type <", value, "type");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andTypeLessThanOrEqualTo(Integer value) {
       addCriterion("type <=", value, "type");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andTypeIn(List<Integer> values) {
       addCriterion("type in", values, "type");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andTypeNotIn(List<Integer> values) {
       addCriterion("type not in", values, "type");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andTypeBetween(Integer value1, Integer value2) {
       addCriterion("type between", value1, value2, "type");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andTypeNotBetween(Integer value1, Integer value2) {
       addCriterion("type not between", value1, value2, "type");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andCreatetimeIsNull() {
       addCriterion("createTime is null");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andCreatetimeIsNotNull() {
       addCriterion("createTime is not null");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andCreatetimeEqualTo(Date value) {
       addCriterion("createTime =", value, "createtime");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andCreatetimeNotEqualTo(Date value) {
       addCriterion("createTime <>", value, "createtime");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andCreatetimeGreaterThan(Date value) {
       addCriterion("createTime >", value, "createtime");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
       addCriterion("createTime >=", value, "createtime");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andCreatetimeLessThan(Date value) {
       addCriterion("createTime <", value, "createtime");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andCreatetimeLessThanOrEqualTo(Date value) {
       addCriterion("createTime <=", value, "createtime");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andCreatetimeIn(List<Date> values) {
       addCriterion("createTime in", values, "createtime");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andCreatetimeNotIn(List<Date> values) {
       addCriterion("createTime not in", values, "createtime");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andCreatetimeBetween(Date value1, Date value2) {
       addCriterion("createTime between", value1, value2, "createtime");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andCreatetimeNotBetween(Date value1, Date value2) {
       addCriterion("createTime not between", value1, value2, "createtime");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andStorageIsNull() {
       addCriterion("storage is null");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andStorageIsNotNull() {
       addCriterion("storage is not null");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andStorageEqualTo(String value) {
       addCriterion("storage =", value, "storage");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andStorageNotEqualTo(String value) {
       addCriterion("storage <>", value, "storage");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andStorageGreaterThan(String value) {
       addCriterion("storage >", value, "storage");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andStorageGreaterThanOrEqualTo(String value) {
       addCriterion("storage >=", value, "storage");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andStorageLessThan(String value) {
       addCriterion("storage <", value, "storage");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andStorageLessThanOrEqualTo(String value) {
       addCriterion("storage <=", value, "storage");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andStorageLike(String value) {
       addCriterion("storage like", value, "storage");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andStorageNotLike(String value) {
       addCriterion("storage not like", value, "storage");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andStorageIn(List<String> values) {
       addCriterion("storage in", values, "storage");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andStorageNotIn(List<String> values) {
       addCriterion("storage not in", values, "storage");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andStorageBetween(String value1, String value2) {
       addCriterion("storage between", value1, value2, "storage");
       return (TQjzyExample.Criteria)this;
     }
     
     public TQjzyExample.Criteria andStorageNotBetween(String value1, String value2) {
       addCriterion("storage not between", value1, value2, "storage");
       return (TQjzyExample.Criteria)this;
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


