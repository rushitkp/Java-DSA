import java.util.Scanner;

public class Array_Max {
    public static void main(String1[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Element:");
        int n = sc.nextInt();

        int max;
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.print("MAX:" + max);
    }
}
