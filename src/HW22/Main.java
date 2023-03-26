package HW22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a message (or 'exit' to quit):");
            String message = scanner.nextLine();
            if (message.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println(" Enter a logger level (DEBUG, INFO, WARNING, ERROR, OFF ):");
            String level = scanner.nextLine();
            logger.log(message, LoggerLevel.fromString(level));
        }
    }
}
