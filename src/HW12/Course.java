package HW12;

public class Course {
    String course1;
    String course2;

    public Course(String course1, String course2) {
        this.course1 = course1;
        this.course2 = course2;
    }

    public String getCourse1() {
        return course1;
    }

    public String getCourse2() {
        return course2;
    }

    public Course() {
    }

    @Override
    public String toString() {
        return "Course{" +
                "course1='" + course1 + '\'' +
                ", course2='" + course2 + '\'' +
                '}';
    }
}
