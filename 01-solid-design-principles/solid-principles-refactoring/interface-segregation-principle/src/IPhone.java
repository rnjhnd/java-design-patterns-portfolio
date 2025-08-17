public class IPhone implements CallingFunctionality, MessagingFunctionality, WebBrowsingFunctionality, ImageCapturingFunctionality {
    @Override
    public void makeCall(String number) {
        System.out.println("Calling: " + number);
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("Sending a message to: " + number + " (" + message + ")");
    }

    @Override
    public void browseWeb(String url) {
        System.out.println("Exploring the website: " + url);
    }

    @Override
    public void takePicture() {
        System.out.println("Taking a picture...");
    }
}
