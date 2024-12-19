package operatores;

import java.util.Scanner;

public class reverseInteger {
    public static int reverse(int x) {
        int reversed = 0;
        int sign = -1;

        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x /10;
        }
        return reversed * sign;
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x");
        int x = sc.nextInt();
        int result = reverse(x);
        System.out.println(result);

    }
    
}
