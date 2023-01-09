package AdditionalTask1;

public class HDD {
    String name;
    double volume;
    String type;

    HDD(String model, double vol, String typ) {
        name = model;
        volume = vol;
        type = typ;
        System.out.println("HDD name " + name);
        System.out.println("HDD volume " + volume);
        System.out.println("HDD type " + type);
    }

    HDD() {
        System.out.println("HDD volume " + volume);
    }
}
