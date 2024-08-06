public class Static {

    Static(){
        System.out.println("Default COnstructor");
    }

    static{
        System.out.println("Static block");
    }
    {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Static s1 = new Static();
    }
}
