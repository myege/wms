 package com.zt.service.impl;
 
 import com.zt.dao.mapper.CompanyMapperCustom;
 import com.zt.dao.mapper.GodownentryMapperCustom;
 import com.zt.dao.mapper.LogRInventoryMapper;
 import com.zt.dao.mapper.RGodownentryMapper;
 import com.zt.dao.mapper.RGodownentrySkuMapper;
 import com.zt.dao.mapper.RInventoryMapper;
 import com.zt.dao.mapper.RShelvesMapper;
 import com.zt.dao.mapper.TCompanyMapper;
 import com.zt.dao.mapper.TFloorStorageMapper;
 import com.zt.dao.mapper.TItemMapper;
 import com.zt.pojo.po.CompanyCustom;
 import com.zt.pojo.po.LogRInventory;
 import com.zt.pojo.po.RGodownentry;
 import com.zt.pojo.po.RGodownentrySku;
 import com.zt.pojo.po.RInventory;
 import com.zt.pojo.po.RInventoryExample;
 import com.zt.pojo.po.RShelves;
 import com.zt.pojo.po.RShelvesExample;
 import com.zt.pojo.po.TCompany;
 import com.zt.pojo.po.TCompanyExample;
 import com.zt.pojo.po.TFloorStorage;
 import com.zt.pojo.po.TFloorStorageExample;
 import com.zt.pojo.po.TItem;
 import com.zt.pojo.po.TItemExample;
 import com.zt.service.PADService;
 import com.zt.util.Tools;
 import java.text.SimpleDateFormat;
 import java.util.Date;
 import java.util.List;
 import java.util.Locale;
 import java.util.Random;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 @Service
 public class PADServiceImpl
   implements PADService
 {
   @Autowired
   private CompanyMapperCustom companyMapperCustom;
   @Autowired
   private TItemMapper iItemMapper;
   @Autowired
   private RShelvesMapper rShelvesMapper;
   @Autowired
   private RGodownentryMapper godownentryMapper;
   @Autowired
   private GodownentryMapperCustom godownentryMapperCustom;
   
   public String addgodSku(String code, String sum, String time, String company) throws Exception {
     if (code == null || code.equals("") || sum == null || sum.equals("") || time == null || time.equals("") || company == null || company.equals("")) {
       return "请填写完整信息,或者返回上级";
     }
     try {
       Integer.parseInt(sum);
     } catch (NumberFormatException e) {
       return "数量请填写数字";
     } 
     if (Integer.parseInt(sum) < 0) {
       return "数量不能小于0";
     }
     try {
       Integer.parseInt(time);
     } catch (NumberFormatException e) {
       return "日期请填写数字";
     } 
     if (Integer.parseInt(time) < 0) {
       return "数量不能小于0";
     }
     if (time.length() != 8) {
       return "填写正确日期";
     }
     Integer yue = Integer.valueOf(Integer.parseInt(time.substring(4, 6)));
     Integer ri = Integer.valueOf(Integer.parseInt(time.substring(6, 8)));
     if (yue.intValue() < 0 || yue.intValue() >= 12) {
       return "填写正确月份";
     }
     if (ri.intValue() < 0 || ri.intValue() >= 31) {
       return "填写正确日期";
     }
     
     SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
     RGodownentry god = new RGodownentry();
     RGodownentrySku sku = new RGodownentrySku();
     TItemExample item = new TItemExample();
     TItemExample.Criteria itemcc = item.createCriteria();
     itemcc.andItemcodeEqualTo(code);
     itemcc.andCompanycodeEqualTo(company);
     List<TItem> itemtu = this.tItemMapper.selectByExample(item);
     if (itemtu.size() == 0) {
       return "商家没有该条码";
     }
     TItem tItem = itemtu.get(0);
     SimpleDateFormat fo = new SimpleDateFormat("yyyy-MM-dd");
     String pattern = "EEE MMM dd HH:mm:ss zzz yyyy";
     SimpleDateFormat df = new SimpleDateFormat(pattern, Locale.US);
     Date arrival = df.parse(String.valueOf(new Date()));
     String format3 = fo.format(arrival);
     god.setArrivaltime(format3);
     god.setCases(Integer.valueOf(Integer.parseInt(sum)));
     god.setCompanycode(company);
     TCompanyExample com = new TCompanyExample();
     TCompanyExample.Criteria comcc = com.createCriteria();
     comcc.andCompanycodeEqualTo(company);
     List<TCompany> listCom = this.tCompanyMapper.selectByExample(com);
     TCompany tFloorStorage = listCom.get(0);
     god.setCompanyname(tFloorStorage.getCompanyname());
     god.setCreatetime(Tools.getCurrentTime());
     god.setDeliverydh("PDA" + formatter.format(new Date()));
     Random rnd = new Random();
     int num = 100 + rnd.nextInt(900);
     String godDh = "RK" + formatter.format(new Date()) + num;
     god.setGodowndh(godDh);
     god.setName("PDA");
     god.setNum(Integer.valueOf(Integer.parseInt(sum)));
     god.setReceiptname("PDA");
     god.setReceipttime(Tools.getCurrentTime());
     god.setType("1");
 
     
     Date d = (new SimpleDateFormat("yyyyMMdd")).parse(time);
     sku.setBetterusedata(fo.format(d));
     sku.setCompanycode(company);
     sku.setGodowndh(god.getGodowndh());
     sku.setItemcode(code);
     sku.setItemname(tItem.getItemname());
     sku.setSku(tItem.getSku());
     sku.setSum(Integer.valueOf(Integer.parseInt(sum)));
 
     
     RShelves rs = new RShelves();
     rs.setReceiptname("PDA");
     rs.setGodowndh(godDh);
     rs.setCompanycode(company);
     rs.setItemcode(sku.getItemcode());
     rs.setItemname(sku.getItemname());
     rs.setSku(sku.getSku());
     rs.setSum(sku.getSum());
     rs.setBetterusedata(sku.getBetterusedata());
     rs.setType(Integer.valueOf(0));
     
     this.rShelvesMapper.insert(rs);
     this.godownentryMapper.insert(god);
     this.rGodownentrySkuMapper.insert(sku);
     return "收货成功"; } @Autowired private RGodownentrySkuMapper rGodownentrySkuMapper; @Autowired private TItemMapper tItemMapper; @Autowired
   private TFloorStorageMapper tFloorStorageMapper; @Autowired
   private RInventoryMapper rInventoryMapper; @Autowired
   private TCompanyMapper tCompanyMapper; @Autowired
   private LogRInventoryMapper logRInventoryMapper; public List<CompanyCustom> findCompanies() { return this.companyMapperCustom.findAll(null); }
 
   
   public String shangj(String company, String sum, String storage, String itemcode) throws Exception {
     if (company == null || company.equals("") || sum == null || sum.equals("") || storage == null || storage.equals("") || itemcode == null || itemcode.equals("")) {
       return "请填写完整信息,或者返回上级";
     }
     try {
       Integer.parseInt(sum);
     } catch (NumberFormatException e) {
       return "数量请填写数字";
     } 
     if (Integer.parseInt(sum) < 0) {
       return "数量不能小于0";
     }
     RShelvesExample godow = new RShelvesExample();
     RShelvesExample.Criteria criteriaGod = godow.createCriteria();
     criteriaGod.andItemcodeEqualTo(itemcode);
     criteriaGod.andCompanycodeEqualTo(company);
     criteriaGod.andSumEqualTo(Integer.valueOf(Integer.parseInt(sum)));
     criteriaGod.andTypeEqualTo(Integer.valueOf(0));
     List<RShelves> selectByExample = this.rShelvesMapper.selectByExample(godow);
     if (selectByExample.size() == 0) {
       return "上架区没有该商品或者数量不正确";
     }
     RShelves she = selectByExample.get(0);
     she.setType(Integer.valueOf(1));
     she.setShelvedate(Tools.getCurrentTime());
     she.setName("PDA");
     she.setTostorage(storage);
     
     TFloorStorageExample floorexamp = new TFloorStorageExample();
     TFloorStorageExample.Criteria criteriafloorexamp = floorexamp.createCriteria();
     criteriafloorexamp.andStorageEqualTo(storage);
     List<TFloorStorage> floors = this.tFloorStorageMapper.selectByExample(floorexamp);
     if (floors.size() == 0) {
       return "没有该库位";
     }
     TFloorStorage tFloorStorage = floors.get(0);
     int type = Integer.parseInt(tFloorStorage.getType());
     if (type != 0) {
       return "库位已存在商品";
     }
     
     Integer sprt = tFloorStorage.getSprt();
 
     
     RInventory inventory = new RInventory();
     inventory.setSort(sprt);
     inventory.setBetterusedata(she.getBetterusedata());
     inventory.setCompanycode(company);
     inventory.setDefective(Integer.valueOf(0));
     inventory.setInventory(Integer.valueOf(Integer.parseInt(sum)));
     inventory.setInventoryfrozen(Integer.valueOf(0));
     inventory.setInventoryoccupy(Integer.valueOf(0));
     inventory.setItemcode(itemcode);
     inventory.setItemname(she.getItemname());
     inventory.setItemsku(she.getSku());
     inventory.setOmwtype(Integer.valueOf(0));
     inventory.setShift(Integer.valueOf(0));
     inventory.setStorage(storage);
     inventory.setSum(Integer.valueOf(Integer.parseInt(sum)));
     inventory.setType("0");
     tFloorStorage.setType("1");
     this.rInventoryMapper.insert(inventory);
     this.tFloorStorageMapper.updateByPrimaryKey(tFloorStorage);
     this.rShelvesMapper.updateByPrimaryKey(she);
     
     LogRInventory log = new LogRInventory();
     log.setCreatetime(Tools.getCurrentTime());
     log.setParentid(tFloorStorage.getId());
     log.setRemark("商家编码：" + company + "；商品条码：" + itemcode + "；上架：" + sum + "件");
     log.setStorage(storage);
     log.setSum(Integer.valueOf(Integer.parseInt(sum)));
     log.setType("上架");
     this.logRInventoryMapper.insert(log);
     return "上架成功";
   }
 
   
   public String yk(String company, String sum, String tstorage, String itemcode, String fstorage) throws Exception {
     if (company == null || company.equals("") || sum == null || sum.equals("") || 
       tstorage == null || tstorage.equals("") || itemcode == null || itemcode.equals("") || 
       fstorage == null || fstorage.equals("")) {
       return "请填写完整信息,或者返回上级";
     }
     if (tstorage.equals(fstorage)) {
       return "不能移库给自己";
     }
 
     
     try { Integer.parseInt(sum); }
     catch (NumberFormatException e) { return "数量请填写数字"; }
      if (Integer.parseInt(sum) < 0)
       return "数量不能小于0"; 
     RInventoryExample inven = new RInventoryExample();
     RInventoryExample.Criteria criteriainv = inven.createCriteria();
     criteriainv.andItemcodeEqualTo(itemcode);
     criteriainv.andCompanycodeEqualTo(company);
     criteriainv.andStorageEqualTo(fstorage);
     criteriainv.andTypeEqualTo("0");
     List<RInventory> selectByExample = this.rInventoryMapper.selectByExample(inven);
     if (selectByExample.size() == 0) {
       return "转移库位放置的不是该商品，或者不存在";
     }
     RInventory finv = selectByExample.get(0);
     int fsum = finv.getInventory().intValue();
     if (fsum < Integer.parseInt(sum)) {
       return "库存商品数量不足";
     }
     
     TFloorStorageExample floorexamp = new TFloorStorageExample();
     TFloorStorageExample.Criteria criteriafloorexamp = floorexamp.createCriteria();
     criteriafloorexamp.andStorageEqualTo(tstorage);
     List<TFloorStorage> floors = this.tFloorStorageMapper.selectByExample(floorexamp);
     if (floors.size() == 0) {
       return "没有该库位";
     }
     TFloorStorage tFloorStorage = floors.get(0);
     int type = Integer.parseInt(tFloorStorage.getType());
     RInventory tInventory = new RInventory();
     if (type == 0) {
       tInventory.setBetterusedata(finv.getBetterusedata());
       tInventory.setCompanycode(company);
       tInventory.setDefective(Integer.valueOf(0));
       tInventory.setInventory(Integer.valueOf(Integer.parseInt(sum)));
       tInventory.setInventoryfrozen(Integer.valueOf(0));
       tInventory.setInventoryoccupy(Integer.valueOf(0));
       tInventory.setItemcode(itemcode);
       tInventory.setItemname(finv.getItemname());
       tInventory.setItemsku(finv.getItemsku());
       tInventory.setOmwtype(Integer.valueOf(0));
       tInventory.setShift(Integer.valueOf(0));
       tInventory.setSort(tFloorStorage.getSprt());
       tInventory.setStorage(tstorage);
       tInventory.setSum(Integer.valueOf(Integer.parseInt(sum)));
       tInventory.setType("0");
       tFloorStorage.setType("1");
       this.tFloorStorageMapper.updateByPrimaryKey(tFloorStorage);
       this.rInventoryMapper.insert(tInventory);
     } else if (type == 1) {
       RInventoryExample tinven = new RInventoryExample();
       RInventoryExample.Criteria tcriteriainv = tinven.createCriteria();
       tcriteriainv.andItemcodeEqualTo(itemcode);
       tcriteriainv.andCompanycodeEqualTo(company);
       tcriteriainv.andStorageEqualTo(tstorage);
       tcriteriainv.andTypeEqualTo("0");
       List<RInventory> tinvList = this.rInventoryMapper.selectByExample(tinven);
       if (tinvList.size() == 0) {
         return "转移库位保存的不是该商品，或者不存在";
       }
       tInventory = tinvList.get(0);
       tInventory.setOmwtype(Integer.valueOf(2));
       tInventory.setInventory(Integer.valueOf(tInventory.getInventory().intValue() + Integer.parseInt(sum)));
       this.rInventoryMapper.updateByPrimaryKey(tInventory);
     } 
     
     finv.setOmwtype(Integer.valueOf(2));
     finv.setInventory(Integer.valueOf(finv.getInventory().intValue() - Integer.parseInt(sum)));
     int frozen = finv.getInventoryfrozen().intValue();
     int inventory = finv.getInventory().intValue();
     int occupy = finv.getInventoryoccupy().intValue();
     TFloorStorage floorStorage = null;
     TFloorStorageExample floor = new TFloorStorageExample();
     TFloorStorageExample.Criteria floorexam = floor.createCriteria();
     floorexam.andStorageEqualTo(fstorage);
     List<TFloorStorage> floorType = this.tFloorStorageMapper.selectByExample(floor);
     if (frozen == 0 && inventory == 0 && occupy == 0) {
       finv.setType("1");
       if (floorType.size() == 0)
         return "没有该库位"; 
       floorStorage = floors.get(0);
       floorStorage.setType("0");
       this.tFloorStorageMapper.updateByPrimaryKey(floorStorage);
     } 
     this.rInventoryMapper.updateByPrimaryKey(finv);
     
     LogRInventory log = new LogRInventory();
     log.setCreatetime(Tools.getCurrentTime());
     
     log.setParentid(finv.getId());
     log.setRemark("商家编码：" + company + "；商品条码：" + itemcode + "；原有库存：" + (inventory + Integer.parseInt(sum)) + "；接受库位" + tstorage + 
         "；现有库存：" + inventory);
     log.setStorage(fstorage); log.setSum(Integer.valueOf(Integer.parseInt(sum)));
     log.setType("移库");
     this.logRInventoryMapper.insert(log);
     
     LogRInventory logGet = new LogRInventory();
     logGet.setCreatetime(Tools.getCurrentTime());
     logGet.setParentid(tFloorStorage.getId());
     log.setStorage(tstorage);
     logGet.setRemark("商家编码：" + company + "；商品条码：" + itemcode + "；原有库存：" + (tInventory.getInventory().intValue() - Integer.parseInt(sum)) + "；出库库位" + fstorage + 
         "；现有库存：" + tInventory.getInventory());
     
     logGet.setSum(Integer.valueOf(Integer.parseInt(sum)));
     logGet.setType("接受");
     this.logRInventoryMapper.insert(logGet);
     return "移库完成";
   }
 }


