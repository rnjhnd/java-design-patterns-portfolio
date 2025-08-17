public class EWalletPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("You have successfully paid ₱" + amount + " using GCash.");
    }
}