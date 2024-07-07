// import java.util.Scanner;

// public class Factorial {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Positive Integer:");
//         int num = sc.nextInt();
//         // int num=4;
//         int fact = 1;
//         for (int i = 1; i <= num; i++) {
//             fact = fact * i; // fact*=i
//         }
//         System.out.println("Factorial:" + fact);
//     }
// }

class Factorial {

    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String1[] args) {
        System.out.println(fact(3));
    }
}
