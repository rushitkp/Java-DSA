public class Method_Overloading3 {
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a1.add(2, 3));
        System.out.println(a1.add((float) 4.5, (float) 3.6));
        System.out.println(a1.add((float) 20.3, (float) 36.4, (float) 5.5));
    }
}

class A {
    int add(int a, int b) {
        return a + b;
    }

    float add(float a, float b) {
        return a + b;
    }

    float add(float a, float b, float c) {
        return a + b + c;
    }
}
