 package com.zt.service.impl;

 import com.zt.dao.mapper.JsSuppliesMapperCustom;
 import com.zt.dao.mapper.JsSuppliesSkuMapperCustom;
 import com.zt.dao.mapper.LogMapperCustom;
 import com.zt.dao.mapper.OrderMapperCustom;
 import com.zt.dao.mapper.SuppliesMapperCustom;
 import com.zt.dao.mapper.TOrderSuppliesMapper;
 import com.zt.dao.mapper.TOrderSuppliesMapperCustom;
 import com.zt.dao.mapper.TSuppliesMapper;
 import com.zt.pojo.po.SuppliesCustom;
 import com.zt.pojo.po.TOrder;
 import com.zt.pojo.po.TOrderSupplies;
 import com.zt.pojo.po.TSupplies;
 import com.zt.pojo.po.TSuppliesExample;
 import com.zt.pojo.vo.SuppliesQueryVo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.service.SuppliesService;
 import com.zt.util.LogUtil;
 import com.zt.util.Tools;
 import java.text.DecimalFormat;
 import java.util.ArrayList;
 import java.util.List;
 import org.springframework.beans.BeanUtils;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;



 @Service
 public class SuppliesServiceImpl
   implements SuppliesService
 {
   @Autowired
   private TSuppliesMapper tSuppliesMapper;
   @Autowired
   private SuppliesMapperCustom suppliesMapperCustom;
   @Autowired
   private LogMapperCustom logMapperCustom;
   @Autowired
   private TOrderSuppliesMapper tOrderSuppliesMapper;

   public List<SuppliesCustom> findAll(SuppliesQueryVo suppliesQueryVo) throws Exception {
     return this.suppliesMapperCustom.findAll(suppliesQueryVo); } @Autowired
   private JsSuppliesMapperCustom jsSuppliesCustom; @Autowired
   private JsSuppliesSkuMapperCustom jsSuppliesSkuCustom; @Autowired
   private OrderMapperCustom orderMapperCustom; @Autowired
   private TOrderSuppliesMapperCustom tOrderSuppliesMapperCustom; public Integer count(SuppliesQueryVo suppliesQueryVo) throws Exception { return this.suppliesMapperCustom.count(suppliesQueryVo); }


   public void insert(SuppliesCustom suppliesCustom) throws Exception {
     String name = suppliesCustom.getSuppliesname();
     String price = suppliesCustom.getPrice();
     String reg = "^[0-9]+(.[0-9]+)?$";
     if (name == null || price == null) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages2", 602, new Object[] { "请认真填写表格" }));
     }
     boolean matches = price.matches(reg);
     if (!matches) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages2", 602, new Object[] { "单价只能为数字" }));
     }
     TSuppliesExample ts = new TSuppliesExample();
     TSuppliesExample.Criteria tt = ts.createCriteria();
     tt.andSuppliesnameEqualTo(name);
     List<TSupplies> list = this.tSuppliesMapper.selectByExample(ts);
     if (list != null && list.size() != 0) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 999, new Object[] { "耗材ID或者名字已被存在" }));
     }


     suppliesCustom.setNumber(Integer.valueOf(0));
     this.tSuppliesMapper.insert((TSupplies)suppliesCustom);
     TSuppliesExample example = new TSuppliesExample();
     TSuppliesExample.Criteria cc = example.createCriteria();

     List<TSupplies> list2 = this.tSuppliesMapper.selectByExample(example);
     TSupplies tss = list2.get(list2.size() - 1);
     Integer suppid = tss.getId();
     DecimalFormat df = new DecimalFormat("0000");
     String str2 = df.format(suppid);


     suppliesCustom.setSuppliesid("ZTHC" + str2);
     suppliesCustom.setId(suppid);
     this.tSuppliesMapper.updateByPrimaryKeySelective((TSupplies)suppliesCustom);
   }

   public SuppliesCustom findById(Integer id) throws Exception {
     SuppliesCustom sc = new SuppliesCustom();
     TSupplies supplies = this.tSuppliesMapper.selectByPrimaryKey(id);
     BeanUtils.copyProperties(supplies, sc);
     return sc;
   }

   public void update(SuppliesCustom suppliesCustom) throws Exception {
     TSupplies supp = this.tSuppliesMapper.selectByPrimaryKey(suppliesCustom.getId());
     supp.setNumber(Integer.valueOf(supp.getNumber().intValue() + suppliesCustom.getNumber().intValue()));
     this.tSuppliesMapper.updateByPrimaryKeySelective(supp);
     this.logMapperCustom.insert(LogUtil.getLogCustom("log_t_supplies", suppliesCustom.getId(), "修改了主键为" + suppliesCustom.getId() + "的耗材"));
   }



   public void updateZ(SuppliesCustom suppliesCustom) {
     this.tSuppliesMapper.updateByPrimaryKeySelective((TSupplies)suppliesCustom);
     this.logMapperCustom.insert(LogUtil.getLogCustom("log_t_supplies", suppliesCustom.getId(), "修改了主键为" + suppliesCustom.getId() + "的耗材"));
   }

   public void updateSupp(List<TSupplies> list, String mailNo) throws Exception {
     this.suppliesMapperCustom.updateSupp(list);
     List<TOrder> tOrder = this.orderMapperCustom.findByMailno(mailNo);
     for (TOrder t : tOrder) {
       for (TSupplies tsupp : list) {
         TOrderSupplies orderSupplies = new TOrderSupplies();
         orderSupplies.setCreatetime(Tools.getCurrentTime());
         orderSupplies.setIsdeleted(Integer.valueOf(0)); orderSupplies.setIstoztz(Integer.valueOf(0));
         orderSupplies.setSuppliesid((new StringBuilder(String.valueOf(tsupp.getSuppliesid()))).toString());
         orderSupplies.setSuppliesname(tsupp.getSuppliesname());
         orderSupplies.setSuppliesnum(tsupp.getNumber());
         orderSupplies.setMailno(mailNo);
         orderSupplies.setCompanycode(t.getCompanycode());
         orderSupplies.setPrice(tsupp.getPrice());
         orderSupplies.setType(Integer.valueOf(0));
         this.tOrderSuppliesMapper.insert(orderSupplies);
       }
     }
   }

   public void updateSuppRapId(List<TSupplies> list, String[] mailNos) throws Exception {
     this.suppliesMapperCustom.updateSupp(list);
     List<TOrder> tOrder = this.orderMapperCustom.findByMailnos(mailNos);
     List<TOrderSupplies> listSupp = new ArrayList<TOrderSupplies>();
     for (TOrder t : tOrder) {
       for (TSupplies tsupp : list) {
         TOrderSupplies orderSupplies = new TOrderSupplies();
         orderSupplies.setCreatetime(Tools.getCurrentTime());
         orderSupplies.setIsdeleted(Integer.valueOf(0)); orderSupplies.setIstoztz(Integer.valueOf(0));
         orderSupplies.setSuppliesid(tsupp.getId().toString());
         orderSupplies.setSuppliesname(tsupp.getSuppliesname());
         orderSupplies.setSuppliesnum(tsupp.getNumber());
         orderSupplies.setMailno(t.getMailno());
         orderSupplies.setCompanycode(t.getCompanycode());
         orderSupplies.setPrice(tsupp.getPrice());
         orderSupplies.setType(Integer.valueOf(0));
         listSupp.add(orderSupplies);
       }
     }

     this.tOrderSuppliesMapperCustom.add(listSupp);
   }






   public List<TSupplies> findCom() throws Exception {
     return this.suppliesMapperCustom.findCom();
   }

   public void delete(String ids) {
     this.suppliesMapperCustom.delete(ids);
   }
 }



