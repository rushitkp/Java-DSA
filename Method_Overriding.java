class Animal {
    void A() {
        System.out.println("Dog");
    }
}

class Deer extends Animal {
    // @Override
    void A() {
        System.out.println("Deer"); 
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.A();
        Animal a = new Animal();
        a.A();
    }
}
