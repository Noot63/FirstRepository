package HW20;


import java.time.LocalDateTime;

public class Log {
    public enum Level {
        ERROR,
        WARNING,
        INFO,
        DEBUG
    }

    private String name;
    private Level level;
    private String message;
    private LocalDateTime date;
    private String stackTrace;

    public Log(String name, Level level, String message) {
        this.name = name;
        this.level = level;
        this.message = message;
        this.date = LocalDateTime.now();
        this.stackTrace = "";
    }

    public Log(String name, Level level, String message, Exception exception) {
        this.name = name;
        this.level = level;
        this.message = message;
        this.date = LocalDateTime.now();
        this.stackTrace = getStackTrace(exception);
    }

    private String getStackTrace(Exception exception) {
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement element : exception.getStackTrace()) {
            sb.append(element.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public Level getLevel() {
        return level;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getStackTrace() {
        return stackTrace;
    }

    @Override
    public String toString() {
        return date + ", " + level + ", " + name + ", " + message + ", " + stackTrace;
    }
}