class A {
    int x, y;
    String z;

    A(int a, int b) {
        x = a;
        y = b;
    }

    A(int a, int b, String c) {
        System.out.println(a + " " + b + " " + c);
        // x = a;
        // y = b;
        // z = c;
    }

    void Show() {
        System.out.println(x);
        System.out.println(y);
        // System.out.println(z);
    }
}

public class Parameter_Construct {
    public static void main(String[] args) {
        A a1 = new A(100, 200);
        a1.Show();
        A a2 = new A(101, 200, "RK");
        // a2.Show();
    }
}
