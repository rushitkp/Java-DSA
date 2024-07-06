import java.util.Scanner;

public class Nagative_Positive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        float no = sc.nextFloat();

        if (no > 0) {
            System.out.println("Number is Positive");
        } else if (no < 0) {
            System.out.println("Number is Nagative");
        } else {
            System.out.println("Number is Zero");
        }
    }
}
