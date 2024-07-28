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

class home extends student {
    void home() {
        System.out.println("Homework");
    }
}

class Multilevel_inheritance {
    public static void main(String[] args) {
        home h1 = new home();
        h1.teach();
        h1.listen();
        h1.home();
    }
}
