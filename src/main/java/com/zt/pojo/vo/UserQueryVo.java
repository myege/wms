 package com.zt.pojo.vo;
 
 import com.zt.pojo.po.UserCustom;
 
 public class UserQueryVo
 {
   private UserCustom userCustom;
   private PageQuery pageQuery;
   
   public PageQuery getPageQuery() {
     return this.pageQuery;
   }
   
   public void setPageQuery(PageQuery pageQuery) {
     this.pageQuery = pageQuery;
   }
   
   public UserCustom getUserCustom() {
     return this.userCustom;
   }
   
   public void setUserCustom(UserCustom userCustom) {
     this.userCustom = userCustom;
   }
 }


