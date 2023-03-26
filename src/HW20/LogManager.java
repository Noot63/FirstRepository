package HW20;

import java.util.ArrayList;
import java.util.List;

public class LogManager {
    private List<Log> logs;

    public LogManager() {
        logs = new ArrayList<>();
    }

    public void log(String name, Log.Level level, String message) {
        Log log = new Log(name, level, message);
        logs.add(log);
    }

    public void log(String name, Log.Level level, String message, Exception exception) {
        Log log = new Log(name, level, message, exception);
        logs.add(log);
    }

    public List<Log> getLogs() {
        return logs;
    }
}