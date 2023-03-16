package HW18;

import java.util.*;

public class Course {
    String name;
    int id;

    public Course(String name) {
        this.name = name;
    }

    public Course(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return id == course.id && Objects.equals(name, course.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    public static void main(String[] args) {
        Course course1 = new Course("Do");
        Course course2 = new Course("Re");
        Course course3 = new Course("Me");
        Course course4 = new Course("Fa");
        List<String> courseList = new ArrayList<>();
        courseList.add(String.valueOf(course1));
        courseList.add(String.valueOf(course2));
        courseList.add(String.valueOf(course3));
        courseList.add(String.valueOf(course4));
        System.out.println("List of courses: " + courseList);
        Collections.sort(courseList);
        System.out.println("List of courses after sort by name: " + courseList);

    }
}
