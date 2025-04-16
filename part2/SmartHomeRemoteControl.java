package part2;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class SmartHomeRemoteControl {
    private final Map<String, Command> slots = new HashMap<>();
    private final Deque<Command> undoStack = new ArrayDeque<>();

    public void setCommand(String slot, Command command) {
        slots.put(slot, command);
        Logger.log("Assigned " + command.getClass().getSimpleName() + " to slot: " + slot);
    }

    public void pressButton(String slot) {
        Command command = slots.get(slot);
        if (command != null) {
            command.execute();
            undoStack.push(command);
            Logger.log("Pushed to undo stack: " + command.getClass().getSimpleName());
        } else {
            System.out.println("[Remote] No command assigned to: " + slot);
        }
    }

    public void undoButton() {
        if (!undoStack.isEmpty()) {
            Command last = undoStack.pop();
            last.undo();
            Logger.log("Command undone: " + last.getClass().getSimpleName());
        } else {
            System.out.println("[Remote] Nothing to undo.");
        }
    }
}
