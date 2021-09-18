package com.zt.service;

import com.zt.pojo.po.JsSupplies;
import com.zt.pojo.po.JsSuppliesCustom;
import com.zt.pojo.po.JsSuppliesSku;
import com.zt.pojo.po.JsSuppliesSkuCustom;
import com.zt.pojo.po.TOrderSupplies;
import com.zt.pojo.vo.JsSuppliesQueryVo;
import java.util.Date;
import java.util.List;

public interface JsSuppliesService {
  List<JsSuppliesCustom> findAll(JsSuppliesQueryVo paramJsSuppliesQueryVo) throws Exception;
  
  int count(JsSuppliesQueryVo paramJsSuppliesQueryVo) throws Exception;
  
  List<JsSuppliesSku> findSkuById(String paramString, int paramInt1, int paramInt2) throws Exception;
  
  void findById(Integer[] paramArrayOfInteger) throws Exception;
  
  List<JsSupplies> findByCodeAndMonth(String paramString, Date paramDate) throws Exception;
  
  List<JsSuppliesCustom> findByCompany(int paramInt1, int paramInt2, String paramString) throws Exception;
  
  List<JsSuppliesSkuCustom> findByIds(String paramString) throws Exception;
  
  List<JsSuppliesCustom> findByIdsu(String paramString) throws Exception;
  
  List<JsSuppliesSkuCustom> findSkuByCss(String paramString, Integer paramInteger1, Integer paramInteger2) throws Exception;
  
  List<TOrderSupplies> totalSku(int paramInt1, int paramInt2, String paramString) throws Exception;
  
  List<JsSuppliesSkuCustom> findByMailNoAndSid(String paramString1, String paramString2, Integer paramInteger) throws Exception;
  
  List<JsSuppliesSkuCustom> findbyCss(int paramInt1, int paramInt2, String paramString) throws Exception;
  
  List<JsSuppliesCustom> findBySame(int paramInt1, int paramInt2, String paramString) throws Exception;
  
  void delete(int paramInt) throws Exception;
}


