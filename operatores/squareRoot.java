package operatores;

import java.util.*;

public class squareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int output = 0;
        // int i = 0;
        while (output * output <= n) {
            output += 1;
        }
        output -= 1;
        System.out.println(output);

    }

}
