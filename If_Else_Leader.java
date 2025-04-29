import java.util.Scanner;

public class If_Else_Leader {
    public static void main(String1[] args) {
        Scanner r = new Scanner(System.in);
        int colour = r.nextInt();

        if (colour == 1) {
            System.out.println("Red");
        } else if (colour == 2) {
            System.out.println("White");
        } else if (colour == 3) {
            System.out.println("Green");
        } else {    
            System.out.println("Invalid");
        }
    }
}
