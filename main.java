import CreationalDP.Phone;

public class main {
    public static void main(String[] args) {
        Phone p = new Phone.Builder().setModel("Nokia").getPhone();
        p.toString();
    }
}
