package HW22;

public enum LoggerLevel {

    DEBUG,
    INFO,
    WARNING,
    ERROR,
    OFF;

    public static LoggerLevel fromString(String level) {
        switch (level.toUpperCase()) {
            case "DEBUG":
                return DEBUG;
            case "INFO":
                return INFO;
            case "WARNING":
                return WARNING;
            case "ERROR":
                return ERROR;
            case "OFF":
                return OFF;
            default:
                throw new IllegalArgumentException("Invalid logger level: " + level);
        }
    }
}