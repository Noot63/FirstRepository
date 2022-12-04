import com.academy.Course;
import com.academy.Lecture;
import com.academy.Student;

import java.sql.SQLOutput;



public class Main {
    // public static void main(String[] args){
    //   Lecture firstLecture = new Lecture();
    //  Lecture secondLecture = new Lecture();
    // Lecture thirdLecture = new Lecture();

    //System.out.println(Lecture.counter);
    //   System.out.println(Student.counter);


    public static void main(String[] args) {
        Course course = new Course(1);

        Lecture lecture = new Lecture(1, course.getID());
        Lecture lecturesecond = new Lecture(2, course.getID());
        Lecture lecturethird = new Lecture(3, course.getID());
        Lecture lecturefource = new Lecture(4, course.getID());
        Lecture lecturefifse = new Lecture(5, course.getID());
        Lecture lecturesix = new Lecture(6, course.getID());

        System.out.println(lecturesix);

    }
}

