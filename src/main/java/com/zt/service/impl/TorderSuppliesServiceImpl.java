 package com.zt.service.impl;
 
 import com.zt.dao.mapper.TOrderSuppliesMapperCustom;
 import com.zt.pojo.po.TOrderSupplies;
 import com.zt.pojo.vo.TOrderSuppQueryVo;
 import com.zt.service.TorderSuppliesService;
 import com.zt.util.Tools;
 import java.util.List;
 import org.apache.poi.hssf.usermodel.HSSFCell;
 import org.apache.poi.hssf.usermodel.HSSFCellStyle;
 import org.apache.poi.hssf.usermodel.HSSFRow;
 import org.apache.poi.hssf.usermodel.HSSFSheet;
 import org.apache.poi.hssf.usermodel.HSSFWorkbook;
 import org.apache.poi.ss.usermodel.CellStyle;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 @Service
 public class TorderSuppliesServiceImpl
   implements TorderSuppliesService
 {
   @Autowired
   private TOrderSuppliesMapperCustom tOrderSuppliesMapperCustom;
   
   public List<TOrderSupplies> findAll(TOrderSuppQueryVo torderSuppliesQueryVo) throws Exception {
     return this.tOrderSuppliesMapperCustom.findAll(torderSuppliesQueryVo);
   }
 
 
   
   public Integer count(TOrderSuppQueryVo tOrderSuppQueryVo) throws Exception {
     return this.tOrderSuppliesMapperCustom.count(tOrderSuppQueryVo);
   }
   
   public HSSFWorkbook exportInventory(String ids, TOrderSuppQueryVo inventoryQueryVo) throws Exception {
     List<TOrderSupplies> list = null;
     HSSFWorkbook ob = new HSSFWorkbook();
     if (ids != null) {
       list = this.tOrderSuppliesMapperCustom.findByIds(ids);
     } else {
       list = this.tOrderSuppliesMapperCustom.findAll(inventoryQueryVo);
     } 
 
     
     HSSFSheet sheet = ob.createSheet("sheet1");
     sheet.setDefaultColumnWidth(20);
 
     
     HSSFRow row = sheet.createRow(0);
     HSSFCellStyle hSSFCellStyle = ob.createCellStyle();
     hSSFCellStyle.setAlignment((short)2);
     HSSFCell cell = row.createCell(0);
     
     cell.setCellValue("商家编码");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     cell = row.createCell(1);
     cell.setCellValue("运单号");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     cell = row.createCell(2);
     cell.setCellValue("耗材编号");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     cell = row.createCell(3);
     cell.setCellValue("耗材名称");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     cell = row.createCell(4);
     cell.setCellValue("耗材单价");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     cell = row.createCell(5);
     cell.setCellValue("耗材数量");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     cell = row.createCell(6);
     cell.setCellValue("创建时间");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     int i = 1;
     for (TOrderSupplies inventoryCustom : list) {
       row = sheet.createRow(i++);
       cell = row.createCell(0);
       cell.setCellValue(inventoryCustom.getCompanycode());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       
       cell = row.createCell(1);
       cell.setCellValue(inventoryCustom.getMailno());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       
       cell = row.createCell(2);
       cell.setCellValue(inventoryCustom.getSuppliesid());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       
       cell = row.createCell(3);
       cell.setCellValue(inventoryCustom.getSuppliesname());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       
       cell = row.createCell(4);
       cell.setCellValue(inventoryCustom.getPrice());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       
       cell = row.createCell(5);
       cell.setCellValue(inventoryCustom.getSuppliesnum().intValue());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       
       cell = row.createCell(6);
       String format = Tools.format("yyyy-MM-dd", inventoryCustom.getCreatetime());
       
       cell.setCellValue(format);
       cell.setCellStyle((CellStyle)hSSFCellStyle);
     } 
     
     return ob;
   }
 }


