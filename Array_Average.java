import java.util.Scanner;

class Array_Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Element:");
        int n = sc.nextInt();

        int sum = 0;
        double avg;
        int a[] = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Array Element:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        for (int i = 0; i < a.length; i++) {
            sum = a[i] + sum;
        }
        avg = sum / n;
        System.out.println("\nSum:" + sum + " " + "Average:" + avg);

    }
}
