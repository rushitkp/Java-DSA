class A {
    void a1(int a, int b) {
        System.out.println("A+B=" + (a + b));
    }
}

class B {
    void a1(int a, int b, int c) {
        System.out.println("A+B+C=" + (a + b + c));
    }
}

class Method_Overloading1 {
    public static void main(String[] args) {
        B b2 = new B();
        // b2.a1(10, 20);
        b2.a1(10, 20, 30);
    }
}
