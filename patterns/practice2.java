import java.util.*;

public class practice2 {
    public static void main(String[] args) {
        // int n = 5; pattern1
        // int m = 6;

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n; j++) {
        // System.out.print(" * ");
        // }
        // System.out.println();
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *

        // int n = 4; pattern2
        // int m = 5;

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= m; j++) {
        // if (i == 1 || j == 1 || i == n || j == m) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // * * * * *
        // * *
        // * *
        // * * * * *

        // int n = 5; pattern3

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(" * ");
        // }
        // System.out.println();
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *

        // int n = 5; pattern4

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i + 1; j++) {
        // System.out.print(" * ");
        // }
        // System.out.println();
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();

        }

    }
}
