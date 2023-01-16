package phone;

import java.util.Arrays;

public class Phone {

    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {

    }

    public void receiveCall(String name) {
        System.out.println("Calling " + name);
    }

    public String getNumber() {
        if (this.number == null) {
            System.out.println("Number is undefinding");
        }
        return number;
    }

    public void receiveCall(String name, String number) {
        System.out.println(name + " is calling this number " + number);
    }

    public void sendMessage(String... numbers) {
        System.out.println("The message is send to " + Arrays.toString(numbers));
    }
}
