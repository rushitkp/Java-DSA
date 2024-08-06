public class Super {
    public static void main(String[] args) {
        Bird b1 = new Bird();
        System.out.println(b1.color);
    }
}

class Animal {
    String color;
    Animal() {
        System.out.println("Animal");
    }
}

class Bird extends Animal {
    Bird() {
        super.color = "Green";
        System.out.println("Bird");
    }
}