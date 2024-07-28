class A {
    int a = 100;
    int b = 200;
    int c = 300;

    void add() {
        // a = 10;
        // b = 20;
        c = a + b;
        System.out.println("Add:" + c);
    }

    void sub() {
        a = 10;
        b = 20;
        c = a - b;
        System.out.println("Sub:" + c);
    }
}

class B extends A {
    void mul() {
        a = 10;
        b = 20;
        c = a * b;
        System.out.println("Mul:" + c);
    }

    void div() {
        a = 10;
        b = 20;
        c = a / b;
        System.out.println("Mul:" + c);
    }
}

class C extends B {
    void rem() {
        a = 10;
        b = 20;
        c = a % b;
        System.out.println("Rem:" + c);
    }
}

public class Multilevel_Inheritance1 {
    public static void main(String[] args) {
        C c1 = new C();
        c1.add();
        c1.sub();
        c1.mul();
        c1.div();
        c1.rem();
    }
}
