public class Student implements DiscountHandler {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.10;
    }
}