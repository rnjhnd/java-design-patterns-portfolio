public class CashPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("You have successfully paid ₱" + amount + " in Cash.");
    }
}