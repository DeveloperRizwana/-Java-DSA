package operatores;

import java.util.*;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = 0; // converted to decimal number
        int pw = 1;

        while (n > 0) {
            int unit_digit = n % 10;
            ans += unit_digit * pw;
            n /= 10;
            pw *= 2;
        }
        System.out.println(ans);
    }

}
