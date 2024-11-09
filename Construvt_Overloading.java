class A {
    int a;
    double b;
    String c;

    A() {
        a = 10;
        b = 2.3;
        c = "Rk";
    }

    A(int x) {
        a = x;
    }

    A(double y, String s) {
        b = y;
        c = s;
    }
}

public class Construvt_Overloading {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A(20);
        A a3 = new A(4.4, "RR");
        System.out.println(a1.a + " " + a1.b + " " + a1.c);
        System.out.println(a2.a);
        System.out.println(a3.b + " " + a3.c);
    }
}
