import java.util.Scanner;

public class String1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter String: ");
        // String name = sc.nextLine();

        // System.out.println(name);

        String s1 = "This is Java";
        System.out.println(s1.length());

        String f1 = "Hello ";
        String f2 = "World";
        String f = f1 + f2;

        for (int i = 0; i < f.length(); i++) {
            System.out.print(f.charAt(i) + " ");
        }
        System.out.println();
        System.out.println(f.charAt(0));            
    }
}
