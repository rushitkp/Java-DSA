public class Prime1 {
    public static boolean Prime(int n) {
        boolean Prime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                Prime = false;
                break;
            }
        }
        return Prime;
    }

    public static void isPrime(int n) {
        for (int i = 2; i <= n; i++) {
            if (Prime(i)) {
                System.out.println(i + " ");
            }
        }
    }

    public static void main(String1[] args) {
        // System.out.println(Prime(2));
        isPrime(20);
    }
}
