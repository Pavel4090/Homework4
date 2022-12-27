package homework6;
import java.util.Scanner;
public class CreditCard1 {
    public static void main(String[] args) {
        CreditCard card = new CreditCard();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер счёта");
        card.AccountNumber = sc.nextInt();
        System.out.println("Введите сумму");
        card.SummaOnAccount = sc.nextDouble();
        card.vol1();
        System.out.println("Введите сумму для пополнения баланса");
        Scanner sx = new Scanner(System.in);
        double x = sx.nextDouble();
        card.SummaOnAccount = card.SummaOnAccount + x;
        card.vol2();
        System.out.println("Введите сумму для снятия денег");
        Scanner sv = new Scanner(System.in);
        x = sv.nextDouble();
        card.SummaOnAccount = card.SummaOnAccount - x;
        card.vol1();
    }
}