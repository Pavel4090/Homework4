package homework6;

import java.util.Scanner;

public class CreditCard2 {
    public static void main(String[] args) {
        CreditCard card = new CreditCard();
        CreditCard card1 = new CreditCard();
        CreditCard card2 = new CreditCard();
        card.AccountNumber = 1;
        card.SummaOnAccount = 15;
        card1.AccountNumber = 2;
        card1.SummaOnAccount = 35;
        card2.AccountNumber = 3;
        card2.SummaOnAccount = 65;
        System.out.println("Введите сумму для пополнения баланса");
        Scanner sx = new Scanner(System.in);
        double x = sx.nextDouble();
        card.SummaOnAccount = card.SummaOnAccount + x;
        System.out.println("Введите сумму для пополнения баланса");
        Scanner ss = new Scanner(System.in);
        x = ss.nextDouble();
        card1.SummaOnAccount = card1.SummaOnAccount + x;
        System.out.println("Введите сумму для снятия денег");
        Scanner sv = new Scanner(System.in);
        x = sv.nextDouble();
        card2.SummaOnAccount = card2.SummaOnAccount - x;
        card.vol1();
        System.out.println(" ");
        card1.vol1();
        System.out.println(" ");
        card2.vol1();
        System.out.println(" ");
    }
}