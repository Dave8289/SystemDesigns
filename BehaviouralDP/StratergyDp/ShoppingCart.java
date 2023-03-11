package BehaviouralDP.StratergyDp;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Item> list;

    public ShoppingCart() {
        this.list = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.list.add(item);
    }

    public void removeItem(Item item) {
        this.list.remove(item);
    }

    public int totalPrice() {
        int sum = 0;
        for (Item it : list) {
            sum += it.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentMethod) {
        int sum = totalPrice();
        paymentMethod.pay(sum);
    }
}
