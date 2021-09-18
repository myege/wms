 package com.zt.util;
 
 import java.io.FileInputStream;
 import java.io.InputStream;
 import java.text.DecimalFormat;
 import java.util.Date;
 import java.util.HashMap;
 import java.util.Map;
 import org.apache.poi.xssf.usermodel.XSSFCell;
 import org.apache.poi.xssf.usermodel.XSSFRow;
 import org.apache.poi.xssf.usermodel.XSSFSheet;
 import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 public class ExcelGodUtil
 {
   public static Map<Integer, Object[]> read(String xlsPath) {
     try {
       InputStream is = new FileInputStream(xlsPath);
       XSSFWorkbook hssfWorkbook = new XSSFWorkbook(is);
       
       Map<Integer, Object[]> items = (Map)new HashMap<Integer, Object>();
       int cellNum = 0;
       
       for (int numSheet = 0; numSheet < hssfWorkbook.getNumberOfSheets(); numSheet++) {
         
         XSSFSheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
         if (hssfSheet != null)
         {
 
 
           
           for (int rowNum = 0; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
             
             try {
               XSSFRow row = hssfSheet.getRow(rowNum);
               if (rowNum != 0)
               {
                 
                 if (row != null)
                 
                 { 
                   if (rowNum == 1) {
                     cellNum = row.getLastCellNum();
                   }
                   Object[] item = new Object[cellNum];
 
                   
                   for (int i = 0; i < cellNum; i++) {
                     
                     XSSFCell cell = row.getCell(i);
                     if (cell != null) {
                       if (i == 2 || i == 5) {
                         item[i] = getDateValue(cell);
                       } else {
                         item[i] = getValue(cell);
                       } 
                     }
                   } 
 
                   
                   items.put(Integer.valueOf(rowNum), item); }  } 
             } catch (Exception e) {
               e.printStackTrace();
               throw new IllegalArgumentException("第" + rowNum + "行数据格式错误！");
             } 
           } 
         }
       } 
       return items;
     } catch (Exception e) {
       throw new IllegalArgumentException("读取Excel文件失败，请确保格式正确工整！");
     } 
   }
   
   private static Date getDateValue(XSSFCell cell) {
     Date date = null;
     try {
       date = cell.getDateCellValue();
     } catch (Exception e) {
       throw new IllegalArgumentException("日期格式不对");
     } 
     return date;
   }
   
   public static String getValue(XSSFCell cell) {
     DecimalFormat df = new DecimalFormat("0");
     if (cell.getCellType() == 4)
       return String.valueOf(cell.getBooleanCellValue()); 
     if (cell.getCellType() == 0)
       return String.valueOf(df.format(cell.getNumericCellValue())); 
     if (cell.getCellType() == 3) {
       return null;
     }
     return String.valueOf(cell.getStringCellValue());
   }
 }


