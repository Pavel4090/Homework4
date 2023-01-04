package homework6;

import java.util.Scanner;

public class CreditCard {

    Integer accountNumber;
    double summaOnAccount;

    void cardplus() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер счёта");
        accountNumber = sc.nextInt();
        System.out.println("Введите сумму");
        summaOnAccount = sc.nextDouble();
        System.out.println("Номер счёта " + accountNumber);
        System.out.println("Сумма на счету " + summaOnAccount);
        System.out.println("Введите сумму для пополнения баланса");
        Scanner sx = new Scanner(System.in);
        double z = sx.nextDouble();
        summaOnAccount = summaOnAccount + z;
    }

    void cardminus() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер счёта");
        accountNumber = sc.nextInt();
        System.out.println("Введите сумму");
        summaOnAccount = sc.nextDouble();
        System.out.println("Номер счёта " + accountNumber);
        System.out.println("Сумма на счету " + summaOnAccount);
        System.out.println("Введите сумму для снятия денег ");
        Scanner sx = new Scanner(System.in);
        double z = sx.nextDouble();
        summaOnAccount = summaOnAccount - z;
    }

    void vol() {
        System.out.println("Номер Счёта " + accountNumber);
        System.out.println("Сумма на счету " + summaOnAccount);
    }
}
