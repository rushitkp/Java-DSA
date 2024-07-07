import java.util.Scanner;

public class Array_Length {
    public static void main(String1[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Element:");
        int n = sc.nextInt();
        
        int a[] = new int[n];
        System.out.println("Enter Array Element:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // System.out.print("Array Element:");
        // for (int i = 0; i < n; i++) {
        // System.out.println(a[i] + " ");
        // }
        System.out.println("Array Lenth is:" + a.length);
    }
}
