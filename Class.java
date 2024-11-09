public class Class {
    public static void main(String[] args) {
        test t1 = new test();
        // test t1;
        // t1 = new test();
        t1.Show(12,"Rk");
    }
}
class test {
    int a = 10;
    String r = "Hello";

    void Show(int a, String r) {
        System.out.println(a + " " + r);
    }
}
