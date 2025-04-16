package part2;

public class TurnOnLightCommand implements Command {
    private Light light;

    public TurnOnLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        Logger.log("Executing TurnOnLightCommand");
        light.turnOn();
    }

    @Override
    public void undo() {
        Logger.log("Undoing TurnOnLightCommand");
        light.turnOff();
    }
}
