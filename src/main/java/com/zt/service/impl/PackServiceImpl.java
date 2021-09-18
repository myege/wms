 package com.zt.service.impl;
 
 import com.zt.dao.mapper.LogMapperCustom;
 import com.zt.dao.mapper.OrderMapperCustom;
 import com.zt.dao.mapper.TOrderMapper;
 import com.zt.dao.mapper.TOrderSuppliesMapper;
 import com.zt.pojo.po.TOrder;
 import com.zt.service.PackService;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 
 @Service
 public class PackServiceImpl implements PackService {
   @Autowired
   private TOrderSuppliesMapper tOrderSuppliesMapper;
   @Autowired
   private OrderMapperCustom orderMapperCustom;
   @Autowired
   private TOrderMapper orderMapper;
   @Autowired
   private LogMapperCustom logMapperCustom;
   
   public void update(String mail) throws Exception {
     List<TOrder> listo = this.orderMapperCustom.findByMailno(mail);
     TOrder tt = listo.get(0);
     tt.setOrderstep(Integer.valueOf(4));
     this.orderMapper.updateByPrimaryKey(tt);
   }
 }


