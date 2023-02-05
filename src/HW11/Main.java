package HW11;

import static HW11.Lecture.*;
import static HW11.Person.createTeacher;
import static HW11.Role.STUDENT;
import static HW11.Role.TEACHER;

public class Main {

        public static void main(String[] args) {

            Lecture.lectures[0] = new Lecture(TEACHER, 1);
            Lecture.lectures[1] = new Lecture(STUDENT, 1);
            Lecture.lectures[2] = new Lecture(TEACHER, 2);
            Lecture.lectures[3] = new Lecture(STUDENT, 2);
            Lecture.lectures[4] = new Lecture(STUDENT, 3);




        roleInfo1(2);
        System.out.println("____________________________-");
        roleInfo(STUDENT);

        System.out.println("____________________________");
        roleAndIdInfo(TEACHER, 2);
            System.out.println("____________________________");
            createTeacher(Role.STUDENT);
            createTeacher(Role.TEACHER);

    }



    }


