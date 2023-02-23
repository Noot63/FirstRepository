package HW14;

import javax.swing.*;

public class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(Spring name) {
        this.name = name.toString();
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }

}
