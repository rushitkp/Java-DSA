import java.util.Scanner;

class Multipication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}