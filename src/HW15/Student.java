package HW15;

public class Student {
    public int id;

    public Student(int id, Student[] students) {
        this.id = id;
        this.students = students;
    }

    public Student(int id) {

    }

    public int getId() {
        return id;
    }

    Student[] students = new Student[1];

    public Student student(int id) throws EntityNotFoundException {
        final Student student = new Student(1);
        student.id = 10;
        students[0] = student;

        for (int i = 0; i < students.length; i++) {
            if (students[i].id == this.id) {
                return students[i];
            }

        }
        throw new EntityNotFoundException("Student not exist");


    }

    public static void main(String[] args) {


        Lecture lectures = new Lecture(1);

        try {
            lectures.lecture(1);
        } catch (IllegalStateException e) {
            System.out.println("Student not found :" + e.getMessage());
        }

        System.out.println("Still work");


    }
}

