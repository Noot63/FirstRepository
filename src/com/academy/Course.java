package com.academy;

 public class Course extends SuperClass  {
     public static int count;

     public Course(String name, int id) {
         super(name, id);
         count++;
     }

     public static int getCount() {
         return count;
     }
 }


