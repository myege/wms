 package com.zt.service.impl;
 
 import com.zt.dao.mapper.LogMapperCustom;
 import com.zt.dao.mapper.ModuleMapperCustom;
 import com.zt.dao.mapper.TModularButtonMapper;
 import com.zt.dao.mapper.TModularMapper;
 import com.zt.pojo.po.ButtonCustom;
 import com.zt.pojo.po.ModuleCustom;
 import com.zt.pojo.po.TModular;
 import com.zt.pojo.po.TModularButton;
 import com.zt.pojo.po.TModularButtonExample;
 import com.zt.pojo.po.TModularExample;
 import com.zt.pojo.vo.ModuleQueryVo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.service.ModuleService;
 import com.zt.util.LogUtil;
 import com.zt.util.Tools;
 import java.util.List;
 import org.apache.commons.beanutils.BeanUtils;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 @Service
 public class ModuleServiceImpl
   implements ModuleService
 {
   @Autowired
   private ModuleMapperCustom moduleMapperCustom;
   @Autowired
   private TModularMapper modularMapper;
   @Autowired
   private TModularButtonMapper buttonMapper;
   @Autowired
   private LogMapperCustom logMapperCustom;
   
   public Integer count(ModuleQueryVo moduleQueryVo) throws Exception {
     return this.moduleMapperCustom.count(moduleQueryVo);
   }
   
   public List<ModuleCustom> findAll(ModuleQueryVo moduleQueryVo) throws Exception {
     return this.moduleMapperCustom.findAll(moduleQueryVo);
   }
   
   public void insert(ModuleCustom moduleCustom) throws Exception {
     if (moduleCustom.getModularid() == null || moduleCustom.getModularname() == null) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 202, null));
     }
     String modularid = moduleCustom.getModularid();
     TModularExample example = new TModularExample();
     TModularExample.Criteria criteria = example.createCriteria();
     criteria.andModularidEqualTo(modularid);
     List<TModular> list = this.modularMapper.selectByExample(example);
     if (list.size() == 1) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 203, new Object[] { "已存在<font color='red'>" + modularid + "</font>的模块业务ID" }));
     }
     moduleCustom.setCreatetime(Tools.getCurrentTime());
     this.modularMapper.insert((TModular)moduleCustom); } public void deleteByIds(Integer[] ids) throws Exception {
     byte b;
     int i;
     Integer[] arrayOfInteger;
     for (i = (arrayOfInteger = ids).length, b = 0; b < i; ) { Integer id = arrayOfInteger[b];
       String modularid = this.modularMapper.selectByPrimaryKey(id).getModularid();
       this.modularMapper.deleteByPrimaryKey(id);
       this.logMapperCustom.insert(LogUtil.getLogCustom("log_t_modular", id, "删除主键为" + id + "的模块"));
       this.moduleMapperCustom.deleteModularid(modularid);
       b++; }
   
   }
   
   public Integer countButton(ModuleQueryVo moduleQueryVo) throws Exception {
     return this.moduleMapperCustom.countButton(moduleQueryVo);
   }
   
   public List<ButtonCustom> findAllButton(ModuleQueryVo moduleQueryVo) throws Exception {
     return this.moduleMapperCustom.findAllButton(moduleQueryVo);
   }
   
   public ModuleCustom findById(Integer id) throws Exception {
     TModular tModular = this.modularMapper.selectByPrimaryKey(id);
     ModuleCustom moduleCustom = new ModuleCustom();
     BeanUtils.copyProperties(moduleCustom, tModular);
     return moduleCustom;
   }
   
   public void update(ModuleCustom moduleCustom) throws Exception {
     String res_modularid = this.modularMapper.selectByPrimaryKey(moduleCustom.getId()).getModularid();
     String tar_modularid = moduleCustom.getModularid();
     this.modularMapper.updateByPrimaryKeySelective((TModular)moduleCustom);
     this.logMapperCustom.insert(LogUtil.getLogCustom("log_t_modular", moduleCustom.getId(), "修改主键为" + moduleCustom.getId() + "的模块"));
     if (!res_modularid.equals(tar_modularid)) {
       this.moduleMapperCustom.updateModularid(res_modularid, tar_modularid);
     }
   }
   
   public void insertButton(ButtonCustom buttonCustom) throws Exception {
     if (buttonCustom.getButtonid() == null || buttonCustom.getButtonname() == null) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 204, null));
     }
     String buttonid = buttonCustom.getButtonid();
     TModularButtonExample example = new TModularButtonExample();
     TModularButtonExample.Criteria criteria = example.createCriteria();
     criteria.andButtonidEqualTo(buttonid);
     List<TModularButton> list = this.buttonMapper.selectByExample(example);
     if (list.size() == 1) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 205, new Object[] { "已存在<font color='red'>" + buttonid + "</font>的按钮业务ID" }));
     }
     buttonCustom.setCreatetime(Tools.getCurrentTime());
     this.buttonMapper.insert((TModularButton)buttonCustom);
   } public void deleteButtonByIds(Integer[] ids) throws Exception {
     byte b;
     int i;
     Integer[] arrayOfInteger;
     for (i = (arrayOfInteger = ids).length, b = 0; b < i; ) { Integer id = arrayOfInteger[b];
       this.buttonMapper.deleteByPrimaryKey(id);
       this.logMapperCustom.insert(LogUtil.getLogCustom("log_t_modular_button", id, "删除主键为" + id + "的按钮"));
       b++; }
   
   }
   
   public ButtonCustom findButtonById(Integer id) throws Exception {
     TModularButton tModularButton = this.buttonMapper.selectByPrimaryKey(id);
     ButtonCustom buttonCustom = new ButtonCustom();
     BeanUtils.copyProperties(buttonCustom, tModularButton);
     return buttonCustom;
   }
   
   public void update(ButtonCustom buttonCustom) throws Exception {
     this.buttonMapper.updateByPrimaryKeySelective((TModularButton)buttonCustom);
   }
 }


