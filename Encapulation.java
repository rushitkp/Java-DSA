class A {

    private int value;

    public void setValue(int x) {
        value = x;
    }

    public int getValue() {
        return value;
    }
}

class Encapulation {
    public static void main(String[] args) {
        A a1 = new A();
        a1.setValue(100);
        System.out.println(a1.getValue());
    }
}