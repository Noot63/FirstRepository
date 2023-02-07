package com.academy;

public class Student extends SuperClass{
    int courseId;
    static int count;

    public Student(String name, int id, int courseId) {
        super(name, id);
        this.courseId = courseId;
        count ++;
    }

    public Student(int id) {
        super(id);
        count++;
    }

    public Student(String name, int id) {
        super(name, id);
        count++;
    }
}

