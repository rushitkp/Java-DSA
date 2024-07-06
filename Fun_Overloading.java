import java.util.Scanner;

public class Fun_Overloading {
    public static int f1(int a, int b) {
        // int sum = a + b;
        return a + b;
        // return sum;
    }

    public static float f1(float a, float b, float c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Number a:");
        // int a = sc.nextInt();
        // System.out.print("Enter Number b:");
        // int b = sc.nextInt();
        System.out.println("Sum=" + f1(10, 20));
        System.out.println("Sum=" + f1(10.3f, 20.45f, 30.32f));
    }
}
