 package com.zt.service.impl;
 
 import com.zt.dao.mapper.ClosingMapperCustom;
 import com.zt.dao.mapper.TOrderClosingMapper;
 import com.zt.pojo.po.TOrder;
 import com.zt.pojo.po.TOrderClosing;
 import com.zt.pojo.po.TOrderClosingCustom;
 import com.zt.pojo.vo.ClosingQueryVo;
 import com.zt.process.result.ExceptionResultInfo;
 import com.zt.service.CloSingService;
 import java.util.ArrayList;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 
 @Service
 public class CloSingServiceImpl
   implements CloSingService
 {
   @Autowired
   private ClosingMapperCustom closingMapperCustom;
   @Autowired
   private TOrderClosingMapper tOrderClosingMapper;
   
   public List<TOrderClosing> findAllxlsx(TOrderClosingCustom tOrderClosingCustom) throws Exception {
     return this.closingMapperCustom.findAllxlsx(tOrderClosingCustom);
   }
 
   
   public List<TOrderClosing> findAll(TOrderClosingCustom vo) throws Exception {
     List<TOrder> findOrderClosing = this.closingMapperCustom.findOrderClosing();
     if (findOrderClosing.size() != 0) {
       this.closingMapperCustom.insertList(findOrderClosing);
       this.closingMapperCustom.updateOrderClosing(findOrderClosing);
     } 
     return this.closingMapperCustom.findAll(vo);
   }
   
   public Integer count(TOrderClosingCustom vo) throws Exception {
     return this.closingMapperCustom.count(vo);
   }
 
   
   public void update(ClosingQueryVo closingQueryVo) throws Exception {
     TOrderClosing gettOrderClosing = closingQueryVo.gettOrderClosing();
     TOrderClosing findById = this.closingMapperCustom.findById(gettOrderClosing.getId().intValue());
     findById.setCompanyno(gettOrderClosing.getCompanyno());
     findById.setWeight(gettOrderClosing.getWeight());
     findById.setBourn(gettOrderClosing.getBourn());
     this.tOrderClosingMapper.updateByPrimaryKey(findById);
   }
   
   public TOrderClosing findById(int id) {
     return this.closingMapperCustom.findById(id);
   }
   
   public List<Map<String, Object>> findReport(TOrderClosingCustom closingQueryVo) {
     return this.closingMapperCustom.findReport(closingQueryVo);
   }
   
   public Integer findReportCount(TOrderClosingCustom closingQueryVo) {
     return this.closingMapperCustom.findReportCount(closingQueryVo);
   }
   
   public int findReportCountDetails(TOrderClosingCustom tOrderClosingCustom) {
     return this.closingMapperCustom.findReportCountDetails(tOrderClosingCustom);
   }
 
   
   public List<Map<String, Object>> Details(TOrderClosingCustom tOrderClosingCustom) {
     return this.closingMapperCustom.Details(tOrderClosingCustom);
   }
   
   public void updetePriceOut(String ids, TOrderClosingCustom vo) throws ExceptionResultInfo {
     List<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
     List<Integer> errorIds = new ArrayList<Integer>();
     List<Map<String, Object>> closingList = new ArrayList<Map<String, Object>>();
     if (ids == null || "".equals(ids)) {
       list = this.closingMapperCustom.findPriceOut(vo);
       
       errorIds = this.closingMapperCustom.findPriceOutError(vo);
     } else {
       ids = ids.substring(0, ids.length() - 1);
       list = this.closingMapperCustom.findPriceOutID(ids);
       errorIds = this.closingMapperCustom.findPriceOutErrorID(ids);
     } 
     if (list.size() != 0) {
       for (HashMap<String, Object> map : list) {
         Map<String, Object> closingMap = new HashMap<String, Object>();
         int id = ((Integer)map.get("id")).intValue();
         double weight = ((Double)map.get("weight")).doubleValue();
         double maxweight = Double.parseDouble((String)map.get("maxweight"));
         double minweight = Double.parseDouble((String)map.get("minweight"));
         double maxnext = Double.parseDouble((String)map.get("maxnext"));
         double minnext = Double.parseDouble((String)map.get("minnext"));
         double money = 0.0D;
         if (weight <= 3000.0D) {
           if (weight - 1000.0D < 0.0D) {
             money = minweight;
           } else {
             money = (weight - 1000.0D) * minnext / 1000.0D + minweight;
           }
         
         } else if (weight - 3000.0D < 0.0D) {
           money = maxweight;
         } else {
           money = (weight - 3000.0D) * maxnext / 1000.0D + maxweight;
         } 
         
         closingMap.put("money", Double.valueOf(money));
         closingMap.put("id", Integer.valueOf(id));
         closingMap.put("type", Integer.valueOf(1));
         closingList.add(closingMap);
       } 
     }
     if (errorIds.size() != 0) {
       this.closingMapperCustom.updateErrorListOut(errorIds);
     }
     if (closingList.size() != 0) {
       this.closingMapperCustom.updateMoneyOut(closingList);
     }
   }
   
   public void updetePrice(String ids, TOrderClosingCustom vo) throws Exception {
     StringBuffer error = new StringBuffer();
     List<Integer> findPriceAndClosingByError = new ArrayList<Integer>();
     List<Map<String, Object>> closingList = new ArrayList<Map<String, Object>>();
     List<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
     if (ids == null || "".equals(ids)) {
       list = this.closingMapperCustom.findPriceAndClosingByList(vo);
       findPriceAndClosingByError = this.closingMapperCustom.findPriceAndClosingByError(vo);
       boolean bool = false;
     } else {
       ids = ids.substring(0, ids.length() - 1);
       list = this.closingMapperCustom.findPriceAndClosing(ids);
       findPriceAndClosingByError = this.closingMapperCustom.findPriceAndClosingError(ids);
       boolean bool = false;
     } 
     if (list.size() != 0) {
       for (HashMap<String, Object> map : list) {
         Map<String, Object> closingMap = new HashMap<String, Object>();
         int id = ((Integer)map.get("id")).intValue();
         double weight = ((Double)map.get("weight")).doubleValue();
         double maxweight = Double.parseDouble((String)map.get("maxweight"));
         double minweight = Double.parseDouble((String)map.get("minweight"));
         double maxnext = Double.parseDouble((String)map.get("maxnext"));
         double minnext = Double.parseDouble((String)map.get("minnext"));
         double money = 0.0D;
         if (weight <= 3000.0D) {
           if (weight - 1000.0D < 0.0D) {
             money = minweight;
           } else {
             money = (weight - 1000.0D) * minnext / 1000.0D + minweight;
           }
         
         } else if (weight - 3000.0D < 0.0D) {
           money = maxweight;
         } else {
           money = (weight - 3000.0D) * maxnext / 1000.0D + maxweight;
         } 
         
         closingMap.put("money", Double.valueOf(money));
         closingMap.put("id", Integer.valueOf(id));
         closingMap.put("type", Integer.valueOf(1));
         closingList.add(closingMap);
       } 
     }
     
     if (closingList.size() != 0)
       this.closingMapperCustom.updateMoney(closingList); 
     if (error.toString().length() > 0)
       this.closingMapperCustom.updateError(error.toString().substring(error.toString().length(), error.toString().length() - 1)); 
     if (findPriceAndClosingByError.size() != 0) {
       this.closingMapperCustom.updateErrorList(findPriceAndClosingByError);
     }
   }
 
   
   public List<TOrderClosing> outDetailXLSX(TOrderClosingCustom tOrderClosingCustom) {
     return null;
   }
 }


