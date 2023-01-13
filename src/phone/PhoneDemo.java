package phone;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone firstPhone = new Phone();
        firstPhone.getNumber();
        firstPhone.receiveCall("Nick", "+375291234567");
        Phone secondPhone = new Phone("+375291234567", "Honor");
        String secondPhoneNumber = secondPhone.getNumber();
        secondPhone.receiveCall("Alex");
        Phone thirdPhone = new Phone(secondPhoneNumber, "Samsung", 198.5);
        thirdPhone.sendMessage("+375291234567", "+375441122334", "+375338844662");
    }
}
