package part2;

import java.time.LocalDateTime;

public class Logger {
    public static void log(String message) {
        System.out.println("[Log][" + LocalDateTime.now() + "] " + message);
    }
}