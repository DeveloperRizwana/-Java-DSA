import java.util.*;

public class practice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print((char) ('A' + j + i - 1));
            }
            System.out.println();
        }
    }

}
// ABCD
// BCDE
// CDEF
// DEFG