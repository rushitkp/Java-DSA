import java.util.Scanner;

class Calc1 {
    public static void main(String1[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter English Marks: ");
        int English = sc.nextInt();
        System.out.print("Enter Hindi Marks: ");
        int Hindi = sc.nextInt();
        System.out.print("Enter Gujarati Marks: ");
        int Gujarati = sc.nextInt();
        System.out.print("Enter Mathes Marks: ");
        int Mathes = sc.nextInt();
        System.out.print("Enter Sanskrit Marks: ");
        int Sanskrit = sc.nextInt();

        float per = ((English + Hindi + Gujarati + Mathes + Sanskrit) / 500.0f) * 100;
        System.out.println("Percentage:" + per);
    }
}
