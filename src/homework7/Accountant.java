package homework7;

public class Accountant implements PositionStamp {

    String name;

    public Accountant(String name) {
        this.name = name;
    }

    @Override
    public void Print() {
        System.out.println(name);
    }
}
