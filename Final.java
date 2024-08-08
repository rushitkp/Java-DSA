final class Final {
    public static void main(String[] args) {
        B f1 = new B();
        f1.num();
        f1.pin();
        f1.show();
    }
}

class A {
    final void num() {
        System.out.println("123456789");
    }

    final void pin() {
        System.out.println("1234");
    }
}

class B extends A {
    final void show() {
        System.out.println("Show");
    }
}