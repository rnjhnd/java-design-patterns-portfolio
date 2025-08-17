public class IncreaseSetting implements Command {
    private Device device;

    public IncreaseSetting(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.increaseSetting();
    }
}
