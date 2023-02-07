package AdditionalTask1;

public class Computer {
    private final int cost;
    private final String model;
    private final Ram ram;
    private final Hdd hdd;

    Computer(int cost, String model) {
        this.cost = cost;
        this.model = model;
        this.ram = new Ram();
        this.hdd = new Hdd();
    }

    Computer(int cost, String name, Ram ram, Hdd hdd) {
        this.cost = cost;
        this.model = name;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return "Computer parameters are {" +
                "cost=" + cost +
                ", model='" + model + '\'' +
                ", " + ram +
                ", " + hdd +
                '}';
    }
}
