public class For_Patern5 {
    public static void main(String1[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// for (int j = 5; j >= i; j--)

// * * * * *
// * * * *
// * * *
// * *
// *