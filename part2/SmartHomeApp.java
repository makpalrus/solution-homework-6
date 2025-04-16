package part2;

public class SmartHomeApp {
    public static void main(String[] args) {

        Light livingRoomLight = new Light();
        Thermostat homeThermostat = new Thermostat();


        Command lightOn = new TurnOnLightCommand(livingRoomLight);
        Command setTemp = new SetThermostatCommand(homeThermostat, 22);


        SmartHomeRemoteControl remote = new SmartHomeRemoteControl();
        remote.setCommand("light", lightOn);
        remote.setCommand("thermostat", setTemp);


        remote.pressButton("light");
        remote.pressButton("thermostat");


        remote.undoButton();
        remote.undoButton();
    }
}
