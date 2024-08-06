class A {
    A() {
        int x = 10;
        int y = 20;
        System.out.println("X+Y=" + (x + y));   
    }

    {
        int a = 50;
        int b = 50;

        System.out.println("A+B=" + (a + b));
    }
}

public class Instance {
    public static void main(String[] args) {
        A a1 = new A();
    }
}
