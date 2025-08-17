public class SeniorCitizen implements DiscountHandler {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.20;
    }
}