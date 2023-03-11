package BehaviouralDP.StratergyDp;

public class Item {
    private String upcCode;
    private int price;

    public Item(String upcString, int priceString) {
        this.upcCode = upcString;
        this.price = priceString;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public int getPrice() {
        return price;
    }

}
