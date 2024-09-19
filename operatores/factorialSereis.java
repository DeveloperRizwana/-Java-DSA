package operatores;

import java.util.*;

public class factorialSereis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        int factorial = 1;
        while (i <= n) {
            factorial = factorial * i;

            i++;
            System.out.println(factorial);
        }

    }

}
