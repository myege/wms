 package com.zt.pojo.vo;
 
 import com.zt.pojo.po.ButtonCustom;
 import com.zt.pojo.po.ModuleCustom;
 
 public class ModuleQueryVo
 {
   private PageQuery pageQuery;
   
   public PageQuery getPageQuery() {
     return this.pageQuery;
   } private ModuleCustom moduleCustom; private ButtonCustom buttonCustom;
   public void setPageQuery(PageQuery pageQuery) {
     this.pageQuery = pageQuery;
   }
   public ModuleCustom getModuleCustom() {
     return this.moduleCustom;
   }
   public void setModuleCustom(ModuleCustom moduleCustom) {
     this.moduleCustom = moduleCustom;
   }
   public ButtonCustom getButtonCustom() {
     return this.buttonCustom;
   }
   public void setButtonCustom(ButtonCustom buttonCustom) {
     this.buttonCustom = buttonCustom;
   }
 }


