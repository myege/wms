package com.zt.dao.mapper;

import com.zt.pojo.po.SuppliesCustom;
import com.zt.pojo.po.TSupplies;
import com.zt.pojo.vo.SuppliesQueryVo;
import java.util.List;

public interface SuppliesMapperCustom {
  List<SuppliesCustom> findAll(SuppliesQueryVo paramSuppliesQueryVo) throws Exception;
  
  Integer count(SuppliesQueryVo paramSuppliesQueryVo) throws Exception;
  
  void updateSupp(List<TSupplies> paramList) throws Exception;
  
  List<TSupplies> findCom() throws Exception;
  
  void delete(String paramString);
}


