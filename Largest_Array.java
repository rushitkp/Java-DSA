public class Largest_Array {

    public static int getLargest(int num[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];
            }
        }
        return largest;
    }

    public static void main(String1[] args) {
        int num[] = { -2, 5, 0, 3, 34 };
        System.out.println("Largest Number:" + getLargest(num));
    }
}
