package com.zt.service;

import com.zt.pojo.po.CompanyCustom;
import com.zt.pojo.po.ItemCustom;
import com.zt.pojo.po.RGodownentry;
import com.zt.pojo.po.RGodownentrySku;
import com.zt.pojo.vo.GodownentryQueryVo;
import java.util.List;
import java.util.Map;

public interface GodownentryService {
  List<RGodownentry> findAll(GodownentryQueryVo paramGodownentryQueryVo) throws Exception;
  
  Integer count(GodownentryQueryVo paramGodownentryQueryVo) throws Exception;
  
  void insert(RGodownentry paramRGodownentry) throws Exception;
  
  List<CompanyCustom> findNameByCode(String paramString) throws Exception;
  
  void delete(Integer[] paramArrayOfInteger) throws Exception;
  
  List<ItemCustom> findByCode(Map<String, String> paramMap) throws Exception;
  
  void update(Integer[] paramArrayOfInteger, String paramString) throws Exception;
  
  List<RGodownentrySku> findSkuById(String paramString) throws Exception;
  
  void impGog(String paramString1, String paramString2, String paramString3, String paramString4) throws Exception;
}


