public class halfDiamond {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 1; i <= n + 1; i++) {
            int number = 1;
            int x = (i * 2) - 1;
            boolean increasing = true;
            for (int j = 1; j <= x; j++) {
                if (j == 1 || j == x) {
                    System.out.print("*");
                } else {
                    System.out.print(number);
                    if (number == i - 1) {
                        increasing = false;
                    }
                    if (increasing == true) {
                        number++;
                    } else {
                        number--;
                    }
                }
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            int number = 1;
            int x = (i * 2) - 1;
            boolean increasing = true;
            for (int j = 1; j <= x; j++) {
                if (j == 1 || j == x) {
                    System.out.print("*");
                } else {
                    System.out.print(number);
                    if (number == i - 1) {
                        increasing = false;
                    }
                    if (increasing == true) {
                        number++;
                    } else {
                        number--;
                    }
                }
            }
            System.out.println();
        }

    }
}
// *
// *1*
// *121*
// *12321*
// *121*
// *1*
// *