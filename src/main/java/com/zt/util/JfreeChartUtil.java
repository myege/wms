 package com.zt.util;
 
 import java.awt.Font;
 import java.awt.Rectangle;
 import org.jfree.chart.JFreeChart;
 import org.jfree.chart.axis.CategoryAxis;
 import org.jfree.chart.axis.NumberAxis;
 import org.jfree.chart.labels.CategoryItemLabelGenerator;
 import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
 import org.jfree.chart.plot.CategoryPlot;
 import org.jfree.chart.renderer.category.LineAndShapeRenderer;
 
 
 
 public class JfreeChartUtil
 {
   public static void setJfreeLine(JFreeChart chart) {
     chart.getTitle().setFont(new Font("宋体", 1, 18));
     
     chart.getLegend().setItemFont(new Font("宋体", 1, 15));
     
     CategoryPlot categoryPlot = (CategoryPlot)chart.getPlot();
     
     CategoryAxis categoryAxis = categoryPlot.getDomainAxis();
     
     NumberAxis numberAxis = (NumberAxis)categoryPlot.getRangeAxis();
     
     categoryAxis.setTickLabelFont(new Font("宋体", 1, 15));
     
     categoryAxis.setLabelFont(new Font("宋体", 1, 15));
     
     numberAxis.setTickLabelFont(new Font("宋体", 1, 15));
     
     numberAxis.setLabelFont(new Font("宋体", 1, 15));
 
 
 
     
     numberAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
 
     
     LineAndShapeRenderer lineAndShapeRenderer = (LineAndShapeRenderer)categoryPlot.getRenderer();
     
     lineAndShapeRenderer.setBaseItemLabelGenerator((CategoryItemLabelGenerator)new StandardCategoryItemLabelGenerator());
     lineAndShapeRenderer.setBaseItemLabelsVisible(true);
     lineAndShapeRenderer.setBaseItemLabelFont(new Font("宋体", 1, 15));
     
     Rectangle shape = new Rectangle(5, 5);
     lineAndShapeRenderer.setSeriesShape(0, shape);
     lineAndShapeRenderer.setSeriesShapesVisible(0, true);
   }
 }


