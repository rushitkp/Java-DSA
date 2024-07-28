class A {
    void add() {
        int a = 10, b = 20, c;
        c = a + b;
        System.out.println(c);
    }
}

class B extends A {
    void add(int x, int y) {
        int c = x + y;
        System.out.println(c);
    }
}

public class Method_Overloading2 {
    public static void main(String[] args) {
        B b1 = new B();
        b1.add();
        b1.add(2, 7);
    }
}
