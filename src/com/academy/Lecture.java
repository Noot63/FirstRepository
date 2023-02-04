package com.academy;

 public class  Lecture extends SuperClass{
     public static int count = 0;

     public Lecture() {
         super();
         count++;
     }

     public Lecture(int id) {
         super(id);
     }

     public Lecture(String name, int id) {
         super(name, id);
         count ++;
     }


     public static int getCount() {
         return count;
     }

     public static void setCount(int count) {
         Lecture.count = count;
     }

     @Override
     public String toString() {
         return super.toString();
     }
 }