package HW11;


import static HW11.Role.STUDENT;
import static HW11.Role.TEACHER;

public class Lecture {
    Role role;
    public int personId;

    public Lecture(Role role, int personId) {
        this.role = role;
        this.personId = personId;
    }

    public Lecture(Role role) {
        this.role = role;
    }

    public static Lecture[] lectures = new Lecture[5];

    public Lecture(int i, Person teacher) {

    }

    @Override
    public String toString() {
        return "Lecture{" +
                "role=" + role +
                ", personId=" + personId +
                '}';
    }

    public static void roleInfo(Role role) {
        switch (role) {
            case STUDENT:
                for (int i = 0; i < lectures.length; i++) {
                    Lecture lecture = lectures[i];
                    if (lectures[i].role == STUDENT) {
                        System.out.println("Role is " + lectures[i].role + ". PersonId is " + lectures[i].personId + ". Access only for reading");
                        System.out.println(lecture);
                    }
                }
                break;
            case TEACHER:
                for (int i = 0; i < lectures.length; i++) {
                    Lecture lecture1 = lectures[i];
                    if (lectures[i].role == TEACHER) {
                        System.out.println("Role is " + lectures[i].role + ". PersonId is " + lectures[i].personId + ". You have edit access");
                        System.out.println(lecture1);
                    }
                }
                break;
            default:
                System.out.println("Incorrect");
                break;
        }
    }

    public static void roleInfo1(int id) {
        for (int j = 0; j < lectures.length; j++) {
            Lecture lecture = lectures[j];
            if (lectures[j].personId == id) {
                System.out.println(lecture);
                System.out.println(" Personal Id is " + lectures[j].personId + ". Role is " + lectures[j].role);
            }
        }
    }

    public static void roleAndIdInfo(Role role, int id) {
        for (int j = 0; j < lectures.length; j++) {
            Lecture lecture = lectures[j];
            if (lectures[j].role == role && lectures[j].personId == id) {
                System.out.println("Role is " + lectures[j].role + ". Personal Id is " + lectures[j].personId);
            } else {
                System.out.println("Absent role with this Id");
                System.out.println(lecture);
            }
        }
    }

    }



