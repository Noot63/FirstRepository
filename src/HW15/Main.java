package HW15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int girl = 0;

        do {
            System.out.println("Select girl of  all Student");
            System.out.println("1. Rachel");
            System.out.println("2. Monica");
            System.out.println("3. Ross");
            System.out.println("4. Exit");
            girl = scanner.nextInt();

            if (girl > 4) {
                System.out.println("please input correct");
                throw new IllegalStateException();
            }


            switch (girl) {
                case 1:
                case 2:
                    System.out.println("Girl");
                    break;
                case 3:
                    System.out.println("Boy");
                    break;
                case 4:
                    System.out.println("Exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("please input correct");
            }

        } while (true);

    }
}



