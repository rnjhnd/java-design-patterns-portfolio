public class PetDemo {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Skittle", "Stephen");
        Pet pet2 = new Pet("Beluga", "James");

        PetActions dog = new Dog();

        System.out.println("Pet Name: " + pet1.getPetName());
        System.out.println("Owner: " + pet1.getOwner());
        System.out.println(dog.makeSound());
        System.out.println(dog.eat());
        System.out.println();

        PetActions cat = new Cat();

        System.out.println("Pet Name: " + pet2.getPetName());
        System.out.println("Owner: " + pet2.getOwner());
        System.out.println(cat.makeSound());
        System.out.println(cat.eat());
    }
}