public class String_Compare {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        if (s1 == s2) {
            System.out.println("String are Equal");
        } else {
            System.out.println("String Not Equal");
        }
        if (s1.equals(s3)) {
            System.out.println("String are Equal");
        } else {
            System.out.println("String Not Equal");
        }
        // System.out.println(s1.compareTo(s3));
    }
}
