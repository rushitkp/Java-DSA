
class Calc {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }
}

class Method_Overloading {
    public static void main(String[] args) {
        Calc c = new Calc();
        System.out.println(c.sum(12, 3));
        System.out.println(c.sum((float) 34.3, (float) 3.4));
    }
}