package part2;

public class SetThermostatCommand implements Command {
    private Thermostat thermostat;
    private int temp;
    private int previousTemp;

    public SetThermostatCommand(Thermostat thermostat, int temp) {
        this.thermostat = thermostat;
        this.temp = temp;
    }

    @Override
    public void execute() {
        previousTemp = thermostat.getTemperature();
        Logger.log("Executing SetThermostatCommand (to " + temp + "°C)");
        thermostat.setTemperature(temp);
    }

    @Override
    public void undo() {
        Logger.log("Undoing SetThermostatCommand (reverting to " + previousTemp + "°C)");
        thermostat.setTemperature(previousTemp);
    }
}