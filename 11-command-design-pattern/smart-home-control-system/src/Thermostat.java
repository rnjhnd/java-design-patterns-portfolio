public class Thermostat implements Device {
    @Override
    public void turnOn() {
        System.out.println("The thermostat is turned on!");
    }

    @Override
    public void turnOff() {
        System.out.println("The thermostat is turned off!");
    }

    @Override
    public void increaseSetting() {
        System.out.println("Increasing temperature...");
    }

    @Override
    public void decreaseSetting() {
        System.out.println("Decreasing temperature...");
    }
}