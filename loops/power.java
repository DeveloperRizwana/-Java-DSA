import java.util.*;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int sum = 2;

        for (int i = 0; i < n; i++) {
            sum = sum * x;
        }

        System.out.println("x to the power n is : " + sum);
    }
}
