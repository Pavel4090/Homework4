package homework7;

public class Director implements PositionStamp {
    String name;

    public Director(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
