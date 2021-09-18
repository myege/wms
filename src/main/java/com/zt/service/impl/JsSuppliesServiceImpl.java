 package com.zt.service.impl;
 
 import com.zt.dao.mapper.JsSuppliesMapper;
 import com.zt.dao.mapper.JsSuppliesMapperCustom;
 import com.zt.dao.mapper.JsSuppliesSkuMapper;
 import com.zt.dao.mapper.JsSuppliesSkuMapperCustom;
 import com.zt.dao.mapper.OrderMapperCustom;
 import com.zt.pojo.po.JsSupplies;
 import com.zt.pojo.po.JsSuppliesCustom;
 import com.zt.pojo.po.JsSuppliesSku;
 import com.zt.pojo.po.JsSuppliesSkuCustom;
 import com.zt.pojo.po.TOrderSupplies;
 import com.zt.pojo.vo.JsSuppliesQueryVo;
 import com.zt.service.JsSuppliesService;
 import com.zt.util.Tools;
 import java.util.Date;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 
 @Service
 public class JsSuppliesServiceImpl
   implements JsSuppliesService
 {
   @Autowired
   private JsSuppliesMapper jsSuppliesMapper;
   @Autowired
   private JsSuppliesMapperCustom jsSuppliesMapperCustom;
   @Autowired
   private JsSuppliesSkuMapperCustom jsSuppliesSkuMapperCustom;
   @Autowired
   private OrderMapperCustom orderMapperCustom;
   @Autowired
   private JsSuppliesSkuMapper jsSuppliesSkuMapper;
   
   public List<JsSuppliesCustom> findAll(JsSuppliesQueryVo jsSuppliesQueryVo) {
     return this.jsSuppliesMapperCustom.findAll(jsSuppliesQueryVo);
   }
   
   public int count(JsSuppliesQueryVo jsSuppliesQueryVo) { return this.jsSuppliesMapperCustom.count(jsSuppliesQueryVo); } public void findById(Integer[] ids) throws Exception {
     byte b;
     int i;
     Integer[] arrayOfInteger;
     for (i = (arrayOfInteger = ids).length, b = 0; b < i; ) { Integer id = arrayOfInteger[b];
       
       JsSuppliesCustom jsSuppliesCustom = this.jsSuppliesMapperCustom.selectById(id);
       if (jsSuppliesCustom != null) {
 
         
         jsSuppliesCustom.setPaystatus(Integer.valueOf(1));
         jsSuppliesCustom.setPaytime(Tools.getCurrentTime());
         this.jsSuppliesMapperCustom.updateJs((JsSupplies)jsSuppliesCustom);
       } 
       b++; }
   
   }
   public List<JsSupplies> findByCodeAndMonth(String companycode, Date buytime) {
     return this.jsSuppliesMapperCustom.findByCodeAndMonth(companycode, buytime);
   }
 
   
   public List<JsSuppliesCustom> findByCompany(int suppliesyear, int suppliesmonth, String companycode) throws Exception {
     return this.jsSuppliesMapperCustom.findByCompanycode(suppliesyear, suppliesmonth, companycode);
   }
 
   
   public List<JsSuppliesSku> findSkuById(String companycode, int suppliesyear, int suppliesmonth) throws Exception {
     return this.jsSuppliesSkuMapperCustom.findSkuById(companycode, suppliesyear, suppliesmonth);
   }
   
   public List<JsSuppliesSkuCustom> findByIds(String ids) throws Exception {
     return this.jsSuppliesSkuMapperCustom.findByIds(ids);
   }
 
   
   public List<JsSuppliesCustom> findByIdsu(String idsu) throws Exception {
     return this.jsSuppliesMapperCustom.findByIdsu(idsu);
   }
 
 
   
   public List<JsSuppliesSkuCustom> findSkuByCss(String scompanycode, Integer suppliesyear, Integer suppliesmonth) throws Exception {
     return this.jsSuppliesSkuMapperCustom.findSkuByCss(scompanycode, suppliesyear, suppliesmonth);
   }
 
   
   public List<TOrderSupplies> totalSku(int suppliesyear, int suppliesmonth, String companycode) throws Exception {
     return this.jsSuppliesSkuMapperCustom.totalSku(suppliesyear, suppliesmonth, companycode);
   }
 
   
   public List<JsSuppliesSkuCustom> findByMailNoAndSid(String mailno, String suppliesid, Integer type) {
     return this.jsSuppliesSkuMapperCustom.findByMailNoAndSid(mailno, suppliesid, type);
   }
   
   public List<JsSuppliesSkuCustom> findbyCss(int suppliesyear, int suppliesmonth, String companycode) {
     return this.jsSuppliesSkuMapperCustom.findByCss(suppliesyear, suppliesmonth, companycode);
   }
   
   public List<JsSuppliesCustom> findBySame(int suppliesyear, int suppliesmonth, String companycode) {
     return this.jsSuppliesMapperCustom.findBySame(suppliesyear, suppliesmonth, companycode);
   }
 
   
   public void delete(int id) throws Exception {
     this.jsSuppliesMapper.deleteByPrimaryKey(Integer.valueOf(id));
   }
 }


