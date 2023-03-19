package HW19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) {

        Lecture lecture1 = new Lecture(1, "First lecture");
        Lecture lecture2 = new Lecture(2, "Second lecture");


        ArrayList<String> HomeWorkList1 = new ArrayList();
        HomeWorkList1.add("First task");
        HomeWorkList1.add("Second task");
        HomeWorkList1.add("Third task");
        HomeWorkList1.add("Fourth task");
        System.out.println("Array list of homeworks to lecture 1 " + HomeWorkList1);
      /*  for (int i = 0; i < HomeWorkList1.size(); i++) {
            System.out.println( "Array list of homeworks to lecture 1 " + HomeWorkList1.get(i));
        }*/
        ArrayList<String> HomeWorkList2 = new ArrayList();
        HomeWorkList2.add("5-th task");
        HomeWorkList2.add("6-th task");
        HomeWorkList2.add("7-th task");
        System.out.println( "-------------------------------");
        System.out.println("Array list of homeworks to lecture 2 " + HomeWorkList2);

        /*for (int i = 0; i < HomeWorkList2.size(); i++) {
            System.out.println( "Array list of homeworks to lecture 2 " + HomeWorkList2.get(i));
*/
        Map<Integer, ArrayList<String>> mapLectHw = new HashMap<>();
        mapLectHw.put(lecture1.lectureId, HomeWorkList1);
        mapLectHw.put(lecture2.lectureId, HomeWorkList2);
            System.out.println("Home work to lecture 1: " + mapLectHw.get(1));
            System.out.println("_______________");
            System.out.println("Home work to lecture 2: " + mapLectHw.get(2));
            System.out.println("All keys" + mapLectHw.keySet());
            System.out.println("_______________");
            System.out.println("All values" + mapLectHw.values());
            System.out.println("_______________");
            System.out.println("Deleted home work to lecture 1: " + mapLectHw.remove(1));
            System.out.println("All map of homeworks to lectures after deleting homework to lecture1 " + mapLectHw);
    }
}
