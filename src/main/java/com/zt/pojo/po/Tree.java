 package com.zt.pojo.po;
 
 import java.util.List;
 
 public class Tree {
   private String id;
   private String text;
   private String state;
   private boolean checked;
   private List<Tree> children;
   
   public String getId() {
     return this.id;
   }
   public void setId(String id) {
     this.id = id;
   }
   public String getText() {
     return this.text;
   }
   public void setText(String text) {
     this.text = text;
   }
   public String getState() {
     return this.state;
   }
   public void setState(String state) {
     this.state = state;
   }
   public boolean isChecked() {
     return this.checked;
   }
   public void setChecked(boolean checked) {
     this.checked = checked;
   }
   public List<Tree> getChildren() {
     return this.children;
   }
   public void setChildren(List<Tree> children) {
     this.children = children;
   }
 }


