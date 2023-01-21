package Service;

import Repository.LectureRepository;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LectureService {
    public static int counterLecture;
    private static long ID;
    public static long counter;

    public static int getI() {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        try {
            i = scanner.nextInt();
            if (i < 0 && i > 5) {
                throw new InputMismatchException();
            }
        } catch (Exception e) {
            System.out.println("Incorrect format, please try again");
            System.out.println();
            return getI();
        }
        return i;
    }

    public static void getListOfLectures() {
        System.out.println("This Course contains the following lectures:");
        for (int j = 0; j < counterLecture; j++) {
            System.out.println("Lecture # " + LectureRepository.lectures[j].id);
        }
    }

    public static void counterLecture() {

    }
}
