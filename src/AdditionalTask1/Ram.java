package AdditionalTask1;

public class Ram {
    private String name;
    private double volume;
    public Ram() {

    }

    public Ram(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Ram.name " + name + '\'' + ", Ram.volume " + volume;
    }
}
