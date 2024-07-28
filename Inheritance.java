class A {
    void show() {
        System.out.println("Orange");
    }
}

class B extends A {
    void show1() {
        System.out.println("White");
    }
}

class C extends B {
    void show2() {
        System.out.println("Green");
    }
}

class Inheritance {
    public static void main(String[] args) {
        C c1 = new C();
        c1.show();
        c1.show1();
        c1.show2();
    }
}