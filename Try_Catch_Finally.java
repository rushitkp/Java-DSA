public class Try_Catch_Finally {
    public static void main(String[] args) {
        try {
            int a = 20, b = 0, c;
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Exception:" + e);
        } finally {
            System.out.println("End");
        }
    }
}

