abstract class teacher {
    abstract void listen();
}

class student extends teacher {
    void listen() {
        int x = 5, y = 10;
        System.out.println(x + y);
    }
}

class Abstract_Class {
    public static void main(String[] args) {
        student s1 = new student();
        s1.listen();
    }
}