import java.util.Scanner;
import java.util.Arrays;

class Bubble_Sort {
    public static void main(String[] args) {
        // int a[] = { 34, 65, 23, 12, 43, 5 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Element:");
        int n = sc.nextInt();
        int temp;
        int a[] = new int[5];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

// public class Bubble_Sort {

// public static void bubbleSort(int a[]) {
// int temp;
// for (int i = 0; i < 5; i++) {
// for (int k = 0; k < 5 - i - 1; k++) {
// if (a[k] > a[k + 1]) {
// temp = a[k];
// a[k] = a[k + 1];
// a[k + 1] = temp;
// }
// }
// }
// }

// public static void main(String[] args) {
// int a[] = { 58, 34, 98, 23, 55 };
// for (int i = 0; i < 5; i++) {
// bubbleSort(a);
// System.out.print(a[i] + " ");
// }
// }
// }
