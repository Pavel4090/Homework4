package AdditionalTask1;

public class RAM {
    String name;
    double volume;

    RAM() {
        System.out.println("RAM volume " + volume);
    }
    RAM(String n, double vol) {
        name = n;
        volume = vol;
        System.out.println("RAM name " + name);
        System.out.println("RAM volume " + volume);
    }
}
