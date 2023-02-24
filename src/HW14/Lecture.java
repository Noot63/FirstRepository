package HW14;

public class Lecture extends Homework {
    private String role ;
    int id;
    public static Homework[] homework = new Homework[2];

    public Lecture(int id, int lectureId, String task, String role, int id1) {
        super(id, lectureId, task);
        this.role = role;
        this.id = id1;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public static Homework[] getHomework() {
        return homework;
    }

    public static void setHomework(Homework[] homework) {
        Lecture.homework = homework;
    }

    @Override
    public void Hey() {
        System.out.println(getTask() + " " + getLectureId() + " " + this.role + " " + "say hello");
    }



}
