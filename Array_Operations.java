import java.util.Scanner;

class Array_Operations {
    public static void main(String1[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Element:");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.print("Enter Value:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Value is:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.print("Search Element:");
        int item = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (a[i] == item) {
                System.out.println("Item Found:" + item);
            }
        }
    }
}