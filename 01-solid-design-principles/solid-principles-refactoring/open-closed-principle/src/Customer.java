public class Customer {
    private String name;
    private DiscountHandler discount;

    public Customer(String name, DiscountHandler discount) {
        this.name = name;
        this.discount = discount;
    }

    public double applyDiscount(double amount) {
        return amount - discount.calculateDiscount(amount);
    }

    public String getName() {
        return name;
    }
}
