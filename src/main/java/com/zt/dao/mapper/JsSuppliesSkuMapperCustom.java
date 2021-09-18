package com.zt.dao.mapper;

import com.zt.pojo.po.JsSuppliesCustom;
import com.zt.pojo.po.JsSuppliesSku;
import com.zt.pojo.po.JsSuppliesSkuCustom;
import com.zt.pojo.po.TOrderSupplies;
import java.util.Date;
import java.util.List;

public interface JsSuppliesSkuMapperCustom {
  List<JsSuppliesSku> findSkuById(String paramString, Date paramDate);
  
  void updateJs(JsSuppliesCustom paramJsSuppliesCustom);
  
  List<JsSuppliesSku> findSkuById(String paramString, int paramInt1, int paramInt2);
  
  List<JsSuppliesSkuCustom> findByIds(String paramString);
  
  List<JsSuppliesSkuCustom> findSkuByCss(String paramString, Integer paramInteger1, Integer paramInteger2);
  
  List<TOrderSupplies> totalSku(int paramInt1, int paramInt2, String paramString);
  
  List<JsSuppliesSkuCustom> findByMailNoAndSid(String paramString1, String paramString2, Integer paramInteger);
  
  List<JsSuppliesSkuCustom> findByCss(int paramInt1, int paramInt2, String paramString);
}


