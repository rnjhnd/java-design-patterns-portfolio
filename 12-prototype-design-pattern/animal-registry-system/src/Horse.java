class Horse implements Animal {
    private int legs = 4;
    private String sound = "Neigh!";
    private String food = "Oats";
    private String color;

    public Horse(String color) {
        this.color = color;
        System.out.println("Creating a Horse prototype.");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public Horse clone() {
        try {
            return (Horse) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported!");
            return null;
        }
    }

    @Override
    public void makeSound() {
        System.out.println("A Horse says: " + sound);
    }

    @Override
    public String getType() {
        return "Horse";
    }
}