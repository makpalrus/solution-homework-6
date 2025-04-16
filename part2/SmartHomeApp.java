package part2;

public class SmartHomeApp {
    public static void main(String[] args) {
        Light light = new Light();
        Thermostat thermostat = new Thermostat();

        Command lightOn = new TurnOnLightCommand(light);
        Command setTemp = new SetThermostatCommand(thermostat, 22);

        SmartHomeRemoteControl remote = new SmartHomeRemoteControl();
        remote.assignCommand("lights", lightOn);
        remote.assignCommand("climate", setTemp);

        remote.pressButton("lights");
        remote.pressButton("climate");
        remote.undoButton();
    }
}