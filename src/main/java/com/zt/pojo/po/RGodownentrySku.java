 package com.zt.pojo.po;
 
 import java.text.ParseException;
 import java.text.SimpleDateFormat;
 import java.util.Date;
 public class RGodownentrySku
 {
   private Integer id;
   private String godowndh;
   private String companycode;
   private String itemcode;
   private String sku;
   private Integer sum;
   private Date betterusedata;
   private String itemname;
   
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
   
   public String getCompanycode() {
     return this.companycode;
   }
   
   public void setCompanycode(String companycode) {
     this.companycode = (companycode == null) ? null : companycode.trim();
   }
   
   public String getItemcode() {
     return this.itemcode;
   }
   
   public void setItemcode(String itemcode) {
     this.itemcode = (itemcode == null) ? null : itemcode.trim();
   }
   
   public String getSku() {
     return this.sku;
   }
   
   public void setSku(String sku) {
     this.sku = (sku == null) ? null : sku.trim();
   }
   
   public Integer getSum() {
     return this.sum;
   }
   
   public void setSum(Integer sum) {
     this.sum = sum;
   }
   
   public Date getBetterusedata() {
     return this.betterusedata;
   }
   
   public void setBetterusedata(String betterusedata) throws ParseException {
     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
     Date date = sdf.parse(betterusedata);
     this.betterusedata = date;
   }
   
   public String getItemname() {
     return this.itemname;
   }
   
   public void setItemname(String itemname) {
     this.itemname = (itemname == null) ? null : itemname.trim();
   }
 }


