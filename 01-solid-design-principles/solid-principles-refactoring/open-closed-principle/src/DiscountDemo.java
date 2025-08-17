public class DiscountDemo {
    public static void main(String[] args) {
        Customer senior = new Customer("LeBron", new SeniorCitizen());
        Customer student = new Customer("Austin", new Student());
        Customer regular = new Customer("Luka", new Regular());

        double amount = 150.0;

        System.out.println("\nHello, " + senior.getName() + "!" + "\nYour Senior Citizen Discount has been applied. The amount to be paid is: ₱" + senior.applyDiscount(amount));

        System.out.println("\nHello, " + student.getName() + "!" + "\nYour Student Discount has been applied. The amount to be paid is: ₱" + student.applyDiscount(amount));

        System.out.println("\nHello, " + regular.getName() + "!" + "\nThe amount to be paid is: ₱" + regular.applyDiscount(amount));
    }
}