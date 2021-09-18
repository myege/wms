 package com.zt.pojo.po;
 
 import java.util.Date;
 public class TOrderSku
 {
   private Integer id;
   private String orderno;
   private String mailno;
   private String itemsku;
   private String itemcode;
   private String itemname;
   private Integer itemcount;
   private String unitprice;
   private String allprice;
   private Date createtime;
   private Integer isdeleted;
   private String pickstoragelocation;
   private String duihao;
   
   public String getDuihao() {
     return this.duihao;
   }
   
   public void setDuihao(String duihao) {
     this.duihao = duihao;
   }
   
   public String getPickstoragelocation() {
     return this.pickstoragelocation;
   }
   
   public void setPickstoragelocation(String pickstoragelocation) {
     this.pickstoragelocation = pickstoragelocation;
   }
   
   public Integer getId() {
     return this.id;
   }
   
   public void setId(Integer id) {
     this.id = id;
   }
   
   public String getOrderno() {
     return this.orderno;
   }
   
   public void setOrderno(String orderno) {
     this.orderno = (orderno == null) ? null : orderno.trim();
   }
   
   public String getMailno() {
     return this.mailno;
   }
   
   public void setMailno(String mailno) {
     this.mailno = (mailno == null) ? null : mailno.trim();
   }
   
   public String getItemsku() {
     return this.itemsku;
   }
   
   public void setItemsku(String itemsku) {
     this.itemsku = (itemsku == null) ? null : itemsku.trim();
   }
   
   public String getItemcode() {
     return this.itemcode;
   }
   
   public void setItemcode(String itemcode) {
     this.itemcode = (itemcode == null) ? null : itemcode.trim();
   }
   
   public String getItemname() {
     return this.itemname;
   }
   
   public void setItemname(String itemname) {
     this.itemname = (itemname == null) ? null : itemname.trim();
   }
   
   public Integer getItemcount() {
     return this.itemcount;
   }
   
   public void setItemcount(Integer itemcount) {
     this.itemcount = itemcount;
   }
   
   public String getUnitprice() {
     return this.unitprice;
   }
   
   public void setUnitprice(String unitprice) {
     this.unitprice = (unitprice == null) ? null : unitprice.trim();
   }
   
   public String getAllprice() {
     return this.allprice;
   }
   
   public void setAllprice(String allprice) {
     this.allprice = (allprice == null) ? null : allprice.trim();
   }
   
   public Date getCreatetime() {
     return this.createtime;
   }
   
   public void setCreatetime(Date createtime) {
     this.createtime = createtime;
   }
   
   public Integer getIsdeleted() {
     return this.isdeleted;
   }
   
   public void setIsdeleted(Integer isdeleted) {
     this.isdeleted = isdeleted;
   }
 }


