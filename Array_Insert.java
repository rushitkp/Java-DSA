import java.util.Scanner;

public class Array_Insert {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Element:");
        int n = sc.nextInt():

        int a[] = new int[size + 1];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter Array Location:");
        int loc = sc.nextInt();
        System.out.print("Enter New Item:");
        int item = sc.nextInt();

        for (int i = size; i > loc; i--) {
            a[i] = a[i - 1];
        }
        a[loc] = item;
        size++;
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
