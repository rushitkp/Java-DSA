public class String_Reverse {
    public static void main(String[] args) {
        // StringBuffer sb = new StringBuffer("Hello World");
        // System.out.println(sb.reverse());

        // StringBuilder sc = new StringBuilder("Java Coding");
        // System.out.println(sc.reverse());

        // String s = new String("Hello");
        int l;
        String str = "Hello";
        String str2 = "";
        l = str.length();

        for (int i = l - 1; i >= 0; i--) {
            str2 = str2 + str.charAt(i);
        }
        System.out.println(str2);
    }
}
