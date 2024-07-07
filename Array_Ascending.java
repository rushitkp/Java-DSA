import java.util.Scanner;
import java.util.Arrays;

public class Array_Ascending {
    public static void main(String1[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Element:");
        int n = sc.nextInt();
        int temp;
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

// public class Array_Ascending {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter Array Element:");
// int n = sc.nextInt();
// int a[] = new int[n];

// for (int i = 0; i < n; i++) {
// a[i] = sc.nextInt();
// }
// Arrays.sort(a);

// System.out.print("Ascending Order:");
// for (int i = 0; i < n; i++) {
// System.out.print(a[i] + " ");
// }
// }
// }
