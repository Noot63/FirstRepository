import Repository.CourseRepository;
import Repository.LectureRepository;
import Repository.StudentRepository;
import Repository.TeacherRepository;
import Service.LectureService;
import com.academy.Course;
import com.academy.Lecture;
import com.academy.Student;
import com.academy.Teacher;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

import static Service.LectureService.getI;
import static com.academy.Lecture.*;


public class Main {
    public static void main(String[] args) {

        LectureRepository.lectures[0] = new Lecture("Знайомство з Java", 1);

        System.out.println("Довжина масиву " + LectureRepository.lectures.length);
        System.out.println("Кількість створених лекцій становить " + count);

        for (int i = 0; i <= 1; i++) {
            if (LectureRepository.lectures.length > count) {
                LectureRepository.lectures[1] = new Lecture("Змінні та операції над ними", 2);
                LectureRepository.lectures[2] = new Lecture("Типи даних та модификації доступу", 3);
                LectureRepository.lectures[3] = new Lecture("Git - структура", 4);
                System.out.println("Ви створили 3 лекції. Нова кількість створених лекцій - " + count);
            } else {
                int lecturesLength = LectureRepository.lectures.length * 3 / 2 + 4;
                Arrays.copyOf(LectureRepository.lectures, lecturesLength);

                System.out.println("Довжина масиву збільшилася за формулою (length*3/2+4). Нова довжина масиву " + lecturesLength);
                System.out.println("Остання кількість створених лекцій становить " + count);
            }
        }


        int a = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Щоб відобразити ідентифікатори всіх об’єктів у масиві Lecture, натисніть 1.");
            System.out.println("Для виходу натисніть 0.");

            a = scanner.nextInt();

            switch (a) {
                case 1:
                    for (int j = 0; j < LectureRepository.getLectures().length; j++) {
                        System.out.println("Назва лекції " + LectureRepository.getLectures()[j].name + ", id is " + LectureRepository.getLectures()[j].id);
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Спробуйте ще раз");
            }
        } while (a != 0);
    }
}


