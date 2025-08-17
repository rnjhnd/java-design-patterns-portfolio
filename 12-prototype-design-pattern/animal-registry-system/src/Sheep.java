public class Sheep implements Animal {
    private int legs = 4;
    private String sound = "Baa!";
    private String food = "Grass";
    private String name;

    public Sheep(String name) {
        this.name = name;
        System.out.println("Creating a Sheep prototype.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Sheep clone() {
        try {
            return (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported!");
            return null;
        }
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: " + sound);
    }

    @Override
    public String getType() {
        return "Sheep";
    }
}