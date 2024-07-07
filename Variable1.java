public class Variable1 {
    static int a = 10;

    void fun(){
        int b=10;       
        System.out.println(a+" "+b);
        ++a;  ++b;
    }

    public static void main(String1[] args) {
        Variable1 v1 = new Variable1();
        v1.fun();
        v1.fun();
    }
}
