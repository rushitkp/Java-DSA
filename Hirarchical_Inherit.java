class teacher {
    void teach() {
        System.out.println("Teach");
    }
}

class student extends teacher {
    void listen() {
        System.out.println("Listen");
    }
}

class home extends teacher {

    void home() {
        System.out.println("Homework");
    }
}

class Hirarchical_Inherit {
    public static void main(String[] args) {
        student s1 = new student();
        s1.teach();
        s1.listen();
        home h1 = new home();
        h1.teach();
        h1.home();
    }
}
