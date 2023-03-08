import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        int a[] = { 2, 3, 4, 5 };
        int[] b = a.clone();
        System.out.println(Arrays.stream(b).max());
    }
}
