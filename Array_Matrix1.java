import java.util.Scanner;

public class Array_Matrix1 {

    public static void arr(int n, int m, int a[][]) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String1[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int m = sc.nextInt();

        int a[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        // int a[][] = { { 2, 4, 6, 8, 9, 10, 12, 14, 16 } };
        // int n = a.length;
        // int m = a[0].length;
        arr(n, m, a);
    }
}
