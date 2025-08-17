public class TurnOff implements Command {
    private Device device;

    public TurnOff(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOff();
    }
}