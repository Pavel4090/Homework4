package AdditionalTask1;

public class Computer {
    int cost;
    String model;
    String name1;
    String name2;

    Computer(int cos, String name) {
        this.cost = cos;
        this.model = name;
        System.out.println("Computer cost " + cost);
        System.out.println("Computer model " + model);
    }

    Computer(int cos, String name, String n1, String n2) {
        this.cost = cos;
        this.model = name;
        this.name1 = n1;
        this.name2 = n2;
        System.out.println("Computer cost " + cost);
        System.out.println("Computer model " + model);
    }

}
