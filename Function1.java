import java.util.Scanner;

class Function1 {

    public static void calc(int a, int b) {
        int sum = a + b;
        System.out.println("Sum=" + sum);
    }

    // public static void a1() {
    // System.out.println("Hello");
    // }        

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num1:");
        int a = sc.nextInt();
        System.out.print("Enter Num2:");
        int b = sc.nextInt();
        calc(a, b);
        // a1();
    }
}
