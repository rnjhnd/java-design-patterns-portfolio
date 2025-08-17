public class PhoneDemo {
    public static void main(String[] args) {
        BasicPhone basicPhone = new BasicPhone();
        System.out.println("----- Basic Phone -----");
        basicPhone.makeCall("0917 123 4567");
        basicPhone.sendSMS("0927 456 1234", "Hello, This message was sent from a Basic Phone!");
        System.out.println();

        Samsung samsung = new Samsung();
        System.out.println("----- Samsung -----");
        samsung.makeCall("0938 654 0987");
        samsung.sendSMS("0949 321 5678", "Hello, This message was sent from a Samsung Phone!");
        samsung.browseWeb("https://www.samsung.com");
        samsung.takePicture();
        System.out.println();

        IPhone iPhone = new IPhone();
        System.out.println("----- IPhone -----");
        iPhone.makeCall("0998 246 8102");
        iPhone.sendSMS("0945 678 9101", "Hello, This message was sent from an iPhone!");
        iPhone.browseWeb("https://www.apple.com");
        iPhone.takePicture();

    }
}

