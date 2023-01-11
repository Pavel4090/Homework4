package AdditionalTask1;

import java.util.Scanner;

public class ComputerDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter model for first computer: ");
        final String firstComputerModel = scanner.nextLine();
        System.out.print("Enter cost for first computer: ");
        final int firstComputerCost = scanner.nextInt();
        Computer firstComputer = new Computer(firstComputerCost, firstComputerModel);
        System.out.println(firstComputer);

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter model for second computer: ");
        final String secondComputerModel = scanner1.nextLine();
        System.out.println("Enter cost for second computer: ");
        final int secondComputerCost = scanner1.nextInt();
        Ram ram = new Ram("Ram", 16);
        Hdd hdd = new Hdd("Hdd", 256, "Inside");
        Computer secondComputer = new Computer(secondComputerCost, secondComputerModel, ram, hdd);
        System.out.println(secondComputer);
    }
}
