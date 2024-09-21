import java.util.*;

public class evenOddSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int evenSum = 0;
        int oddSum = 0;

        while (x > 0) {
            int r = x % 10;

            if (r % 2 == 0) {
                evenSum = evenSum + r;
            } else {
                oddSum = oddSum + r;

            }
            x = x / 10;

        }
        System.out.println(evenSum + " " + oddSum);
    }

}
