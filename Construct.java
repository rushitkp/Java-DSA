class Demo {
    Demo(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }
}

class Construct {
    public static void main(String args[]) {
        Demo d = new Demo(50, 70);
    }
}