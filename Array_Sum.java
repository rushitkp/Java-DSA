import java.util.Scanner;

public class Array_Sum {
    public static void main(String1[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Element:");
        int n = sc.nextInt();
        int sum = 0;
        int a[] = new int[n];
        System.out.print("Enter Array Value:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Element is: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

            sum = a[i] + sum;
        }
        System.out.println("\nSum:" + sum);
    }
}


