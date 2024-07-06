class A {
    void A1() {
        System.out.println("A");
    }
}

class B extends A {
    public static void main(String[] args) {
        B b1 = new B();
        b1.A1();
    }
}
