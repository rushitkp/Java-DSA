public class For_Patern11 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}

// public class For_Patern11 {
// public static void main(String[] args) {
// int n = 5;
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= n - i; j++) {
// System.out.print(" ");
// }
// for (int j = 1; j <= 2 * i - 1; j++) {
// System.out.print("*");

// }
// System.out.println();
// }
// }
// }

// *
// ***
// *****
// *******
// *********