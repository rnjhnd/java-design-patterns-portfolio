public class BasicPhone implements CallingFunctionality, MessagingFunctionality {
    @Override
    public void makeCall(String number) {
        System.out.println("Calling: " + number);
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("Sending a message to: " + number + " (" + message + ")");
    }
}
