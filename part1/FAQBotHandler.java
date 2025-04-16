package part1;

public class FAQBotHandler extends SupportHandler {
    @Override
    public void handle(String issue) {
        if ("password_reset".equals(issue)) {
            System.out.println("[FAQBot] Handled password_reset");
        } else if (nextHandler != null) {
            System.out.println("[FAQBot] Passing to next...");
            nextHandler.handle(issue);
        } else {
            System.out.println("[FAQBot] Issue could not be handled.");
        }
    }
}