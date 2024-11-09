import java.util.Scanner;

public class Continue1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter Number:");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                continue;
            }
            System.out.print("Number is:" + n + "\n");
        } while (true);

    }
}
