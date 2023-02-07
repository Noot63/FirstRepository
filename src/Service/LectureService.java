package Service;

import Repository.LectureRepository;
import com.academy.Lecture;

import java.util.InputMismatchException;
import java.util.Scanner;

import static Repository.LectureRepository.lectures;

public class LectureService {
    public static void main(String[] args) {
        Lecture lecture = new Lecture("Вступ", 1);
        lectures[0] = lecture;
        lectures[1] = new Lecture("Класи", 2);
        lectures[2] = new Lecture("Методи", 3);

    }
}