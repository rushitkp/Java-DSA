class For_Patern {
    public static void main(String1[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// *
// * *
// * * *
// * * * *
// * * * * *