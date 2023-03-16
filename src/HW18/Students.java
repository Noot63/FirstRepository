package HW18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Students implements Comparable <Students> {

    String name;
    String surname;
    int id;

    public Students(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return id == students.id && Objects.equals(name, students.name) && Objects.equals(surname, students.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, id);
    }

    @Override
    public int compareTo(Students o) {
        int result = this.surname.compareTo(o.surname);
        if (result == 0) {
            result = this.name.compareTo(o.name);
        }
        return result;
    }

    public static void main(String[] args) {
        Students student = new Students("Bob", "Marly", 1);
        Students student1 = new Students("Tom", "Hens", 4);
        Students student2 = new Students("Wesley", "Snider", 4);
        Students student3 = new Students("Roy", "King", 2);
        Students student4 = new Students("Alex", "Song", 3);
        List<Students> studList = new ArrayList<>();
        studList.add(student);
        studList.add(student1);
        studList.add(student2);
        studList.add(student3);
        studList.add(student4);
        Collections.sort(studList);
        System.out.println("List of students after sorting by surname (same surnames are also sorted by name): \n" + studList);
    }
}
