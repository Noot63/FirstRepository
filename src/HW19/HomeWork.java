package HW19;

public class HomeWork {

    int lectureId;
    String task;

    public HomeWork(int lectureId, String task) {
        this.lectureId = lectureId;
        this.task = task;
    }

    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "HomeWork{" +
                "lectureId=" + lectureId +
                ", task='" + task + '\'' +
                '}';
    }
}
