package HW20;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class LogService {
    private static final String FILE_NAME = "logs.txt";
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");

    public static void saveLogs(List<Log> logs) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Log log : logs) {
                writer.write(log.getDate().format(DATE_FORMATTER) + ", " + log.getLevel() + ", " + log.getName() + ", " + log.getMessage() + ", " + log.getStackTrace());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        LogManager logManager = new LogManager();

        // add logs
        logManager.log("MyClass", Log.Level.INFO, "Program started.");
        try {
            // some code that might throw an exception
        } catch (Exception e) {
            logManager.log("MyClass", Log.Level.ERROR, "An error occurred.", e);
        }
        logManager.log("MyClass", Log.Level.WARNING, "Unexpected input.", new Exception());

        // save logs to file
        LogService.saveLogs(logManager.getLogs());
    }
}
