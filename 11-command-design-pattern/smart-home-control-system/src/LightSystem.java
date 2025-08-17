public class LightSystem implements Device {
    @Override
    public void turnOn() {
        System.out.println("Light is turned on!");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is turned off!");
    }

    @Override
    public void increaseSetting() {
        System.out.println("Increasing brightness...");
    }

    @Override
    public void decreaseSetting() {
        System.out.println("Decreasing brightness...");
    }
}