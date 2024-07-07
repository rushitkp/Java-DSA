public class Reverse {
    public static void main(String1[] args) {
        int n = 123;
        int last = 0;
        while (n > 0) {
            last = n % 10;
            System.out.print(last);
            n = n / 10;
        }

    }
}

// int rev = 0;
// int n = 14503;
// while (n > 0) {
// int last = n % 10;
// rev = (rev * 10) + last;
// n = n / 10;
// }
// System.out.println(rev);
// }
// }
