import java.util.Scanner;

public class EvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int evensum = 0;
        int oddsum = 0;
        int choice;
        do {
            System.out.print("Enter Number:");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                evensum += num;
            } else {
                oddsum += num;
            }
            System.out.println("Enter 1 Or Zero:");

            choice = sc.nextInt();
        } while (choice == 1);
        System.out.println("Even Sum:" + evensum);
        System.out.println("Odd Sum:" + oddsum);
    }
}