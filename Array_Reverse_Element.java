import java.util.Scanner;

public class Array_Reverse_Element {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Element:");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Element value:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Element is:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\nReverse Element is:");
        for (int i = a.length - 1; i > 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}