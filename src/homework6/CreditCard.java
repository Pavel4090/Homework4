package homework6;

import java.util.Arrays;

public class CreditCard {
    Integer AccountNumber;
    double SummaOnAccount;
    void vol1 () {
        for (String s : Arrays.asList("Номер счета " + AccountNumber, "Сумма на счету " + SummaOnAccount)) {
            System.out.println(s);
        }
    }
    void vol2 () {
        System.out.println("Сумма на счету" + SummaOnAccount);
    }
}
