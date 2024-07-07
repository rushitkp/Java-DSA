import java.util.Scanner;

public class Ex1 {
    public static void main(String1[] args) {
        Scanner sc = new Scanner(System.in);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // int avg = (a + b + c) / 3;
        // System.out.println(avg);

        // int x = sc.nextInt();
        // int area = x * x;
        // System.out.println(area);

        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float total = pencil + pen + eraser;
        System.out.println(total);

        float newTotal = total + (0.18f + total);
        System.out.println(newTotal);
    }
}
