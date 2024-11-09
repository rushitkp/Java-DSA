public class For_Patern1 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// * * * * *
// * * * *
// * * *
// * *
// *

// import java.util.Scanner;

// class For_Patern1 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter Number:");
// int n = sc.nextInt();
// for (int i = 1; i <= n; i++) {
// for (int j = n; j >= i; j--) {
// System.out.print("* ");
// }
// System.out.println();
// }
// }
// }

// n - i + 1
// n + 1 - i