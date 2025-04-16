package part1;

public class JuniorSupportHandler extends SupportHandler {
    @Override
    public void handle(String issue) {
        if ("refund_request".equals(issue) || "billing_issue".equals(issue)) {
            System.out.println("[JuniorSupport] Handled " + issue);
        } else if (nextHandler != null) {
            System.out.println("[JuniorSupport] Passing to next...");
            nextHandler.handle(issue);
        } else {
            System.out.println("[JuniorSupport] Issue could not be handled.");
        }
    }
}