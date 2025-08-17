public class Cat implements PetActions {
    @Override
    public String makeSound() {
        return "Meow, meow!";
    }

    @Override
    public String eat() {
        return "Eating fish...";
    }
}