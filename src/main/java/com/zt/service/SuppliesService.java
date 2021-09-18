package com.zt.service;

import com.zt.pojo.po.SuppliesCustom;
import com.zt.pojo.po.TSupplies;
import com.zt.pojo.vo.SuppliesQueryVo;
import java.util.List;

public interface SuppliesService {
  List<SuppliesCustom> findAll(SuppliesQueryVo paramSuppliesQueryVo) throws Exception;
  
  Integer count(SuppliesQueryVo paramSuppliesQueryVo) throws Exception;
  
  void insert(SuppliesCustom paramSuppliesCustom) throws Exception;
  
  SuppliesCustom findById(Integer paramInteger) throws Exception;
  
  void update(SuppliesCustom paramSuppliesCustom) throws Exception;
  
  void updateSupp(List<TSupplies> paramList, String paramString) throws Exception;
  
  List<TSupplies> findCom() throws Exception;
  
  void updateSuppRapId(List<TSupplies> paramList, String[] paramArrayOfString) throws Exception;
  
  void delete(String paramString);
  
  void updateZ(SuppliesCustom paramSuppliesCustom);
}


