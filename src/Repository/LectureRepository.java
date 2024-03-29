package Repository;

import com.academy.Lecture;
 public class LectureRepository extends SuperRepository {
     public static Lecture[] lectures = new Lecture[3];

     public static Lecture[] getLectures() {
         return lectures;
     }
     @Override
     public void getInfo() {
         for (int k = 0; k < lectures.length; k++) {
             System.out.println(lectures);
             System.out.println("Index of array is " + k + ", name is " + lectures[k].getName() + ", id is " + lectures[k].getId());
         }
     }

     @Override
     protected void addEnt() {
         Lecture lecture = new Lecture();
         System.out.println("Amount of added lectures is " + lecture.count);
     }

     @Override
     protected void getById(int id) {
         for (int j = 0; j < lectures.length; j++) {
             Lecture lecture = lectures[j];
             if (lectures[j].getId() == id) {
                 System.out.println(lecture);
             }
         }
     }

     @Override
     protected boolean deleteById(int id) {
         for (int l = 0; l < lectures.length; l++) {
             if (classes[l].getId() == id) {
                 classes[l] = null;
                 return true;
             }
         }
         return false;
     }
 }
