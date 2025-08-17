public class Dog implements PetActions {
    @Override
    public String makeSound() {
        return "Woof, woof!";
    }

    @Override
    public String eat() {
        return "Eating meat...";
    }
}