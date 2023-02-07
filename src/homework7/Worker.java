package homework7;

public class Worker implements PositionStamp {
    String name;

    public Worker(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
