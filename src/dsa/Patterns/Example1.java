package dsa.Patterns;

public class Example1 {
    public static void main(String[] args) {
        /*
        * PATTERN {
        *   *
        *   **
        *   ***
        *   ****
        *   *****
        * }
        * */
        pattern1(4);

        /*
        *   *****
        *   *****
        *   *****
        *   *****
        *   *****
        * */
        pattern2(4);

        /*
        *   *****
        *   ****
        *   ***
        *   **
        *   *
        * */
        pattern3(4);
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row ; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
        System.out.println("Done");
    }
    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= n ; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
        System.out.println("Done");
    }
    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= n - row +1 ; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
        System.out.println("Done");
    }
}
