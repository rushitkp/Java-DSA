class A {
    int a;
    String s;

    // A() {
    //     a = 20;
    //     s = "Rk";
    //     System.out.println(a);
    //     System.out.println(s);
    // }

    void Show() {
        System.out.println(a);
        System.out.println(s);
    }
}

class Default_Construct {
    public static void main(String[] args) {
        A a1 = new A();
        a1.Show();
    }
}
