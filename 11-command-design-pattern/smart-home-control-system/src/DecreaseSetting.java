public class DecreaseSetting implements Command {
    private Device device;

    public DecreaseSetting(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.decreaseSetting();
    }
}
