package part2;
import java.util.HashMap;
import java.util.Map;

public class SmartHomeRemoteControl {
    private Map<String, Command> slots = new HashMap<>();
    private Command lastCommand;

    public void assignCommand(String slot, Command command) {
        slots.put(slot, command);
    }

    public void pressButton(String slot) {
        Command command = slots.get(slot);
        if (command != null) {
            System.out.println("[Remote] Pressed " + slot);
            command.execute();
            lastCommand = command;
        } else {
            System.out.println("[Remote] No command assigned to slot " + slot);
        }
    }

    public void undoButton() {
        if (lastCommand != null) {
            System.out.println("[Remote] Undoing last command");
            lastCommand.undo();
        }
    }
}
