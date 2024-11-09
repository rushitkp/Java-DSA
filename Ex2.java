import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter Your Number: ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
        } while (true);
    }
}
