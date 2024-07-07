abstract class teacher {
    abstract void listen();
}

class student extends teacher {

    void listen() {
        System.out.println("Listen");
        // System.out.println(x + y);
    }
}

class Abstract_Class {
    public static void main(String1[] args) {
        student s1 = new student();
        s1.listen();
    }
}
