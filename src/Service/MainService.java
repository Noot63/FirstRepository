package Service;

import javax.swing.plaf.synth.SynthGraphicsUtils;
import java.util.Scanner;

public class MainService {
    static Scanner scanner = new Scanner(System.in);

    public static int choiceone() {
        System.out.println("Вкажіть номер категорії");
        System.out.println("1. Курси");
        System.out.println("2. Вчителі");
        System.out.println("3. Студенти");
        System.out.println("4. Лекції");
        return scanner.nextInt();
    }

    public static int choicetwo() {
        System.out.println("Зробіть вибір:");
        System.out.println("1. Створити нову");
        System.out.println("2. Відкрити існуючу");
        return scanner.nextInt();
    }

    public static int choiceOfCategory(int insert) {
        return switch (insert) {
            case 1:
                System.out.println("Ви вибрали'курси'");
                yield 1;
            case 2:
                System.out.println("Ви вибрали 'вчителі'");
                yield 2;
            case 3:
                System.out.println("Ви вибрали 'студенти'");
                yield 3;
            case 4:
                System.out.println("Ви вибрали 'лекції'");
                yield 4;
            default: // error
                System.out.println("Категорії не існує");
                System.out.println("1 - Так");
                System.out.println("2 - Ні");
                int option = scanner.nextInt();
                if (option == 1) {
                    yield choiceOfCategory(choiceone());
                     } else if (option == 2) {
                        System.out.println("Ви закінчили роботу");
                        yield 2;
                    } else {
                        System.out.println("ERROR");
                        yield choiceOfCategory(0);
                    }

        };
    }
}
