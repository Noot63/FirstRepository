package HW21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        List<Student> students = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            students.add(new Student(i));
        }

        List<Task> tasks = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            tasks.add(new Task(i));
        }
        Collections.shuffle(tasks);

        for (int i = 0; i < students.size(); i++) {
            students.get(i).setTask(tasks.get(i));
        }

        System.out.println("Контрольна робота розпочалась!");

        for (Student student : students) {
            student.start();
        }

        Thread.sleep(12000);

        for (Student student : students) {
            student.setFinished(true);
        }

        System.out.println("Контрольна робота завершилась!");

        List<Student> finishedStudents = new ArrayList<>();
        List<Student> unfinishedStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.isFinished()) {
                finishedStudents.add(student);
            } else {
                unfinishedStudents.add(student);
            }
        }

        finishedStudents.sort((s1, s2) -> s1.getFinishTime() - s2.getFinishTime());

        System.out.println("Студенти, які встигли:");
        for (int i = 0; i < finishedStudents.size(); i++) {
            System.out.println((i + 1) + ". Студент " + finishedStudents.get(i).getId() + " закінчив за "
                    + finishedStudents.get(i).getFinishTime() + " секунд");
        }

        System.out.println("Студенти, які не встигли:");
        for (Student student : unfinishedStudents) {
            System.out.println("Студент " + student.getId() + " не встиг");
        }
    }

}

