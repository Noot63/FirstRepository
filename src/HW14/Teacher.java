package HW14;

import javax.swing.*;

public class Teacher {
    int id;
    Spring name;

    public Teacher(int id, Spring name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Spring getName() {
        return name;
    }

    public void setName(Spring name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}
