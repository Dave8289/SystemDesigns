package BehaviouralDP.StratergyDp;

public class CreditCardStrategy implements PaymentStrategy {
    String cardNum;
    String name;
    String cvv;
    String expiryDate;

    public CreditCardStrategy(String cardNum, String name, String cvv, String expiryDate) {
        this.cardNum = cardNum;
        this.name = name;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid by CardCard ***761 ");
    }

}
