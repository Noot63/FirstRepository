package Repository;

import com.academy.Lecture;

public class LectureRepository {
    public static Lecture[] lectures = new Lecture[4];

    public static void main(String[] args) {
        Lecture lecture = new Lecture();
    }

    public static Lecture[] getLectures() {
        return lectures;
    }
}