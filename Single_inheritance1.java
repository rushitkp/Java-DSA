class student {
    int no=30;
    String name="RR";

    void show() { 
        System.out.println(no + " " + name);
    }
}

class teacher extends student {
    void display() {
        no = 10;
        name = "RK";
        System.out.println(no + " " + name);
    }
}

public class Single_inheritance1 {
    public static void main(String[] args) {
        teacher t1 = new teacher();
        t1.show();
        t1.display();
    }
}
