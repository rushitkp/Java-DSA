public class Nested_If {
    public static void main(String1[] args) {

        int a = 380, b = 208, c = 90;

        if (a > b) {
            if (a > c) {
                System.out.println("A is Gether");
            } else {
                System.out.println("C is grether");
            }
        } else {
            if (b > c) {
                System.out.println("B is greter");
            } else {
                System.out.println("C is greter");
            }
        }
    }
}
