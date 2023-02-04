package Service;

import com.academy.Teacher;

import static Repository.TeacherRepository.teachers;


    class TeacherService {
        public static void main(String[] args) {
            teachers[0] = new Teacher("Jack", 1);
            teachers[1] = new Teacher("Natan", 2);
            teachers[2] = new Teacher("Max", 3);
            teachers[3] = new Teacher("Tom", 4);

        }
    }


