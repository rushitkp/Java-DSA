import java.util.Scanner;

public class Break1 {
    public static void main(String1[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter Number:");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
            // n++;
            System.out.println(n);
        } while (true);
        System.out.println("Exit");
    }
}
