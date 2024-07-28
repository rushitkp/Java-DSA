class teacher {
    void teach() {
        System.out.println("Teaching");
    }
}

class student extends teacher {
    void listen() {
        System.out.println("Listen");
    }
}
class Single_Inheritance {
    public static void main(String[] args) {
        student s1 = new student();
        s1.teach();
        s1.listen();
    }
}
