package HW14;

public class Main {
    public static void main(String[] args) {
        Homework homework = new Homework(1,1,"Download IDEA ");
        Student student = new Student(1,"Nick");
        Lecture lecture = new Lecture(1,1,"First lessons","Smth",1);
        lecture.Hey();
        homework.Hey();



    }
}