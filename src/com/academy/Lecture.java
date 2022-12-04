package com.academy;

public class Lecture {
    public long ID;
    public long courseID;

    public Lecture(long ID, long courseID) {
        this.ID = ID;
        this.courseID = courseID;
    }
    public Lecture createlecture(long ID, long courseID) {
        return new Lecture(ID, courseID);
    }
}
