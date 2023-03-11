package BehaviouralDP.StratergyDp;

public class PayPalStrategy implements PaymentStrategy {
    private String username;
    private String password;

    public PayPalStrategy(String user, String pass) {
        this.username = user;
        this.password = pass;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " Paid by PayPal Account **777");
    }

}
