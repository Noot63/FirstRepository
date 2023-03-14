package HW18;

import java.util.Objects;
import java.util.TreeSet;

public class Teacher implements Comparable<Teacher>{
    String name;
    String surname;
    int id;

    public Teacher(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return id == teacher.id && Objects.equals(name, teacher.name) && Objects.equals(surname, teacher.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, id);
    }
    @Override
    public int compareTo(Teacher o) {
        return this.surname.compareTo(o.surname);
    }



    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Bob", "Soros", 1);
        Teacher teacher2 = new Teacher("Ben", "Der", 2);
        Teacher teacher3 = new Teacher("Clod", "Makelele", 3);
        Teacher teacher4 = new Teacher("Leo", "Messi", 4);
        Teacher teacher5 = new Teacher("Mao", "Lee", 5);

        TreeSet<Teacher> teachersTreeSet = new TreeSet<>();
        teachersTreeSet.add(teacher1);
        teachersTreeSet.add(teacher2);
        teachersTreeSet.add(teacher3);
        teachersTreeSet.add(teacher4);
        teachersTreeSet.add(teacher5);
        System.out.println("List of teachers after sorting by surname: \n " + teachersTreeSet);

    }



}
