package BehaviouralDP.StratergyDp;

public class ShoppingCartTest {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();
        Item i1 = new Item("1", 20);
        Item i2 = new Item("2", 30);

        cart.addItem(i1);
        cart.addItem(i2);

        cart.pay(new PayPalStrategy("123", "2432"));
    }
}
