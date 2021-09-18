 package com.zt.service.impl;
 
 import com.zt.dao.mapper.GodownentryMapperCustom;
 import com.zt.dao.mapper.PlangodownentryMapperCustom;
 import com.zt.dao.mapper.RPlangodownentryMapper;
 import com.zt.dao.mapper.RPlangodownentrySkuMapper;
 import com.zt.pojo.po.RGodownentry;
 import com.zt.pojo.po.RGodownentrySku;
 import com.zt.pojo.po.RPlangodownentry;
 import com.zt.pojo.po.RPlangodownentrySku;
 import com.zt.pojo.vo.PlangodownentryQueryVo;
 import com.zt.service.PlangodownentryService;
 import com.zt.util.Tools;
 import java.text.SimpleDateFormat;
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 
 @Service
 public class PlangodownentryServiceImpl
   implements PlangodownentryService {
   @Autowired
   private PlangodownentryMapperCustom plangodownentryMapperCustom;
   @Autowired
   private RPlangodownentryMapper rPlangodownentryMapper;
   @Autowired
   private RPlangodownentrySkuMapper rPlangodownentrySkuMapper;
   @Autowired
   private GodownentryMapperCustom godownentryMapperCustom;
   
   public List<RPlangodownentry> findAll(PlangodownentryQueryVo vo) throws Exception {
     return this.plangodownentryMapperCustom.findAll(vo);
   }
   
   public Integer count(PlangodownentryQueryVo vo) throws Exception {
     return this.plangodownentryMapperCustom.count(vo);
   }
 
   
   public List<RPlangodownentrySku> findByGodowndh(String godowndh) throws Exception {
     return this.plangodownentryMapperCustom.findByGodowndh(godowndh);
   }
   
   public int updateSum(int id, int sum, String dv) throws Exception {
     RPlangodownentrySku selectByPrimaryKey = this.rPlangodownentrySkuMapper.selectByPrimaryKey(Integer.valueOf(id));
     Integer truesum = selectByPrimaryKey.getTruesum();
     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
     String dstr = dv;
     Date date = sdf.parse(dstr);
     if (truesum.intValue() + sum < 0) {
       return 2;
     }
     this.plangodownentryMapperCustom.updateSum(id, sum, date);
     return 1;
   }
 
   
   public void update(Integer[] ids, String name) throws Exception {
     List<RGodownentry> list = new ArrayList<RGodownentry>();
     List<RGodownentrySku> skuList = new ArrayList<RGodownentrySku>(); byte b; int i; Integer[] arrayOfInteger;
     for (i = (arrayOfInteger = ids).length, b = 0; b < i; ) { int id = arrayOfInteger[b].intValue();
       RPlangodownentry key = this.rPlangodownentryMapper.selectByPrimaryKey(Integer.valueOf(id));
       key.setName(name);
       key.setArrivaltime(Tools.getCurrentTime());
       String godowndh = key.getGodowndh();
       List<RPlangodownentrySku> findByGodowndh = this.plangodownentryMapperCustom.findByGodowndh(godowndh);
       for (RPlangodownentrySku findSki : findByGodowndh) {
         RGodownentrySku sku = new RGodownentrySku();
         sku.setCompanycode(findSki.getCompanycode());
 
         
         sku.setBetterusedata(Tools.format("yyyy-MM-dd", findSki.getBetterusedata()));
         sku.setGodowndh(findSki.getGodowndh());
         sku.setItemcode(findSki.getItemcode());
         sku.setItemname(findSki.getItemname());
         sku.setSku(findSki.getSku());
         sku.setSum(findSki.getTruesum());
         skuList.add(sku);
       } 
       RGodownentry god = new RGodownentry();
       god.setGodowndh(key.getGodowndh());
       god.setDeliverydh(key.getDeliverydh());
       god.setCompanycode(key.getCompanycode());
       god.setCompanyname(key.getCompanyname());
       god.setCases(key.getCases());
       god.setNum(key.getNum());
       god.setArrivaltime(Tools.format("yyyy-MM-dd", Tools.getCurrentTime()));
       god.setCreatetime(key.getCreatetime());
       god.setName(name);
       god.setType("1");
       list.add(god); b++; }
     
     this.godownentryMapperCustom.impGod(list);
     this.godownentryMapperCustom.impGodSku(skuList);
     this.plangodownentryMapperCustom.updateType(ids);
   }
 }


