package AdditionalTask1;

public class Hdd {
    private String name;
    private double volume;
    private String type;

    public Hdd() {

    }
    Hdd(String model, double vol, String type) {
        this.name = model;
        this.volume = vol;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Hdd.name " + name + '\'' + ", Hdd.volume " + volume + '\'' + ", Hdd.type " + type;
    }
}
