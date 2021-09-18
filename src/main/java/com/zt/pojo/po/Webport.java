 package com.zt.pojo.po;
 public class Webport
 {
   private Integer id;
   private String url;
   private String tab;
   private String code;
   private String bm;
   private String tj;
   private String addr;
   
   public Integer getId() {
     return this.id;
   }
   
   public void setId(Integer id) {
     this.id = id;
   }
   
   public String getUrl() {
     return this.url;
   }
   
   public void setUrl(String url) {
     this.url = (url == null) ? null : url.trim();
   }
   
   public String getTab() {
     return this.tab;
   }
   
   public void setTab(String tab) {
     this.tab = (tab == null) ? null : tab.trim();
   }
   
   public String getCode() {
     return this.code;
   }
   
   public void setCode(String code) {
     this.code = (code == null) ? null : code.trim();
   }
   
   public String getBm() {
     return this.bm;
   }
   
   public void setBm(String bm) {
     this.bm = (bm == null) ? null : bm.trim();
   }
   
   public String getTj() {
     return this.tj;
   }
   
   public void setTj(String tj) {
     this.tj = (tj == null) ? null : tj.trim();
   }
   
   public String getAddr() {
     return this.addr;
   }
   
   public void setAddr(String addr) {
     this.addr = (addr == null) ? null : addr.trim();
   }
 }


