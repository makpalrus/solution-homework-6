package part1;

public class SupportSystem {
    public static void main(String[] args) {
        SupportHandler faq = new FAQBotHandler();

        String[] issues = {"password_reset"};
        for (String issue : issues) {
            faq.handle(issue);
        }
    }
}