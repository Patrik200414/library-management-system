package library.management.logger;

import java.time.LocalDateTime;

public class ConsoleLogger implements Logger{
    @Override
    public void infoLogger(String message) {
        logMessage("INFO", message);
    }

    @Override
    public void errorLogger(String message) {
        logMessage("ERROR", message);
    }

    public void logMessage(String type, String message){
        String unit = String.format("[%s] %s: %s", LocalDateTime.now(), type, message);
        System.out.println(unit);
    }
}
