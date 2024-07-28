class Animal {
    void A() {
        System.out.println("Dog");
    }
}

class Deer extends Animal {
    @Override
    void A() {
        System.out.println("Deer");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        Animal d = new Deer();
        d.A();
    }
}
