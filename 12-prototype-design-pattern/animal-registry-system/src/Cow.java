public class Cow implements Animal {
    private int legs = 4;
    private String sound = "Moo!";
    private String food = "Hay";

    public Cow() {
        System.out.println("Creating a Cow prototype.");
    }

    @Override
    public Cow clone() {
        try {
            return (Cow) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported!");
            return null;
        }
    }

    @Override
    public void makeSound() {
        System.out.println("A Cow says: " + sound);
    }

    @Override
    public String getType() {
        return "Cow";
    }
}