package homework6;

public class CreditCard1 {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard();
        CreditCard card2 = new CreditCard();
        CreditCard card3 = new CreditCard();
        card1.card();
        card1.cardplus();
        card1.vol();
        card2.card();
        card2.cardplus();
        card2.vol();
        card3.card();
        card3.cardminus();
        card3.vol();
    }
}