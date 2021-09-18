 package com.zt.util;

 import com.zt.process.result.ResultInfoUtil;
 import java.io.FileInputStream;
 import java.io.InputStream;
 import java.text.DecimalFormat;
 import java.util.HashMap;
 import java.util.Map;
 import org.apache.poi.xssf.usermodel.XSSFCell;
 import org.apache.poi.xssf.usermodel.XSSFRow;
 import org.apache.poi.xssf.usermodel.XSSFSheet;
 import org.apache.poi.xssf.usermodel.XSSFWorkbook;














 public class StorageExcelUtil
 {
   public static Map<Integer, Object[]> read(String xlsPath) throws Exception {
     Integer errorRow = null;
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

               if (row != null)

               {
                 if (rowNum == 0) {
                   cellNum = row.getLastCellNum();
                 }
                 Object[] item = new Object[cellNum];


                 for (int i = 0; i < cellNum; i++) {

                   XSSFCell cell = row.getCell(i);
                   if (cell != null) {
                     item[i] = getValue(cell);
                   }
                 }

                 items.put(Integer.valueOf(rowNum), item); }
             } catch (Exception e) {
               errorRow = Integer.valueOf(rowNum);
               e.printStackTrace();
               throw new IllegalArgumentException();
             }
           }
         }
       }
       return items;
     } catch (Exception e) {
       if (errorRow == null) {
         ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 200, null));
       } else {
         ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 201, (Object[])new String[] { errorRow.toString() }));
       }
       return null;
     }
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



