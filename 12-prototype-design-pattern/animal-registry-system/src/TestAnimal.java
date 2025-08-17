public class TestAnimal{
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        Animal fluffy = registry.createSheep("Fluffy");
        fluffy.makeSound();
        System.out.println("Type: " + fluffy.getType() + ", Name: " + ((Sheep) fluffy).getName());

        Animal bessy = registry.createCow();
        bessy.makeSound();
        System.out.println("Type: " + bessy.getType());

        Animal speedy = registry.createHorse("Black");
        speedy.makeSound();
        System.out.println("Type: " + speedy.getType() + ", Color: " + ((Horse) speedy).getColor());

        Animal anotherFluffy = registry.createSheep("Another Fluffy");
        anotherFluffy.makeSound();
    }
}