 package com.zt.pojo.po;
 
 import java.text.ParseException;
 import java.text.SimpleDateFormat;
 import java.util.Date;
 public class RGodownentry
 {
   private Integer id;
   private String godowndh;
   private String deliverydh;
   private String companycode;
   private String companyname;
   private Integer cases;
   private Integer num;
   private Date arrivaltime;
   private Date createtime;
   private String name;
   private String receiptname;
   private Date receipttime;
   private String type;
   
   public Integer getId() {
     return this.id;
   }
   
   public void setId(Integer id) {
     this.id = id;
   }
   
   public String getGodowndh() {
     return this.godowndh;
   }
   
   public void setGodowndh(String godowndh) {
     this.godowndh = (godowndh == null) ? null : godowndh.trim();
   }
   
   public String getDeliverydh() {
     return this.deliverydh;
   }
   
   public void setDeliverydh(String deliverydh) {
     this.deliverydh = (deliverydh == null) ? null : deliverydh.trim();
   }
   
   public String getCompanycode() {
     return this.companycode;
   }
   
   public void setCompanycode(String companycode) {
     this.companycode = (companycode == null) ? null : companycode.trim();
   }
   
   public String getCompanyname() {
     return this.companyname;
   }
   
   public void setCompanyname(String companyname) {
     this.companyname = (companyname == null) ? null : companyname.trim();
   }
   
   public Integer getCases() {
     return this.cases;
   }
   
   public void setCases(Integer cases) {
     this.cases = cases;
   }
   
   public Integer getNum() {
     return this.num;
   }
   
   public void setNum(Integer num) {
     this.num = num;
   }
   
   public Date getArrivaltime() {
     return this.arrivaltime;
   }
   
   public void setArrivaltime(String arrivaltime) throws ParseException {
     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
     Date date = sdf.parse(arrivaltime);
     this.arrivaltime = date;
   }
   
   public Date getCreatetime() {
     return this.createtime;
   }
   
   public void setCreatetime(Date createtime) {
     this.createtime = createtime;
   }
   
   public String getName() {
     return this.name;
   }
   
   public void setName(String name) {
     this.name = (name == null) ? null : name.trim();
   }
   
   public String getReceiptname() {
     return this.receiptname;
   }
   
   public void setReceiptname(String receiptname) {
     this.receiptname = (receiptname == null) ? null : receiptname.trim();
   }
   
   public Date getReceipttime() {
     return this.receipttime;
   }
   
   public void setReceipttime(Date receipttime) {
     this.receipttime = receipttime;
   }
   
   public String getType() {
     return this.type;
   }
   
   public void setType(String type) {
     this.type = (type == null) ? null : type.trim();
   }
 }


