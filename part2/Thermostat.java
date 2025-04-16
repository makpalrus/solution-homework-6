package part2;

public
class Thermostat {
    private int temperature = 20;
    private int prevTemperature = 20;

    public void setTemperature(int temp) {
        prevTemperature = temperature;
        temperature = temp;
        System.out.println("[Thermostat] Setting temperature to " + temp + "°C");
    }

    public void revertTemperature() {
        System.out.println("[Thermostat] Reverting to previous temperature: " + prevTemperature + "°C");
        temperature = prevTemperature;
    }

    public int getTemperature() {
        return temperature;
    }
}