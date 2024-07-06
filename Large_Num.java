import java.util.Scanner;

class Large_Num {
    public static void main(String[] args) {
        int a = 70, b = 20, c = 30;
        // Scanner sc = new Scanner(System.in);
        // System.out.print("A=");
        // int a = sc.nextInt();
        // System.out.print("B=");
        // int b = sc.nextInt();
        // System.out.print("C=");
        // int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("A is largest");
        } else if (b >= c) {
            System.out.println("B is largest");
        } else {
            System.out.println("C is largest");
        }
    }
}
