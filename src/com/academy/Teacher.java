package com.academy;

public class Teacher extends SuperClass{
    public int count;
    private String name;

    public Teacher() {
        count++;
    }

    public Teacher(int id) {
        super(id);
    }

    public Teacher(String name) {
        super(name);
    }

    public Teacher(String name, int id) {
        super(name, id);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}




