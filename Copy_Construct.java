class A {
    int a;
    String s;

    A() {
        a = 10;
        s = "Hello";
        System.out.println(a + " " + s);
    }

    A(A ref) {
        a = ref.a;
        s = ref.s;
        System.out.println(a + " " + s);
    }
}

public class Copy_Construct {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
    }
}
