public class MusicSystem implements Device {
    @Override
    public void turnOn() {
        System.out.println("The music player is turned on!");
    }

    @Override
    public void turnOff() {
        System.out.println("The Music player is turned off!");
    }

    @Override
    public void increaseSetting() {
        System.out.println("Increasing volume...");
    }

    @Override
    public void decreaseSetting() {
        System.out.println("Decreasing volume...");
    }

    public void changePlaylist() {
        System.out.println("Changing playlist...");
    }
}