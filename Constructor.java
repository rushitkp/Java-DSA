public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student(2);
        System.out.println(s1.a);
        // s1.a(2);
        // System.out.println(s1.a);
        // s1.s("Hello");
    }
}

class Student {
    // String s;
    int a;

    Student(int a) {
        this.a = a;

        // System.out.println("Constructor");

    }
}