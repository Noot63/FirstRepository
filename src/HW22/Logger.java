package HW22;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Logger {
        private static Logger instance = new Logger();
        private LoggerLevel level;

        private Logger() {
            loadLoggerLevel();
        }

        public static Logger getInstance() {
            return instance;
        }

        public void log(String message, LoggerLevel level) {
            if (level.ordinal() >= this.level.ordinal()) {
                System.out.println(level + ": " + message);
            }
        }

        public void setLevel(LoggerLevel level) {
            this.level = level;
            saveLoggerLevel();
        }

        private void loadLoggerLevel() {
            try {
                Properties props = new Properties();
                props.load(new FileInputStream("logger.properties"));
                this.level = LoggerLevel.fromString(props.getProperty("level"));
            } catch (IOException e) {
                System.out.println("Failed to load logger level. Using default level (WARNING).");
                this.level = LoggerLevel.WARNING;
            }
        }

        private void saveLoggerLevel() {
            try {
                Properties props = new Properties();
                props.setProperty("level", this.level.toString());
                props.store(new FileOutputStream("logger.properties"), null);
            } catch (IOException e) {
                System.out.println("Failed to save logger level.");
            }
        }
    }


