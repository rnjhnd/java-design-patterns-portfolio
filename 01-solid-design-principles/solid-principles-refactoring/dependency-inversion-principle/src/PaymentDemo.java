public class PaymentDemo {
    public static void main(String[] args) {
        PaymentProcessor ewalletProcessor = new PaymentProcessor(new EWalletPayment());
        PaymentProcessor creditCardProcessor = new PaymentProcessor(new CreditCardPayment());
        PaymentProcessor cashProcessor = new PaymentProcessor(new CashPayment());

        ewalletProcessor.processPayment(500.0);
        creditCardProcessor.processPayment(2500.0);
        cashProcessor.processPayment(300.0);
    }
}