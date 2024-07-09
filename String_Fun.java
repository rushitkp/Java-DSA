public class String_Fun {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder();
        // for (char i = 'A'; i < 'Z'; i++) {
        // sb.append(i);
        // System.out.print(i + " ");
        // }
        // System.out.println(sb.length());

        String str = "HEllo ";
        String str1 = "World";
        String c = "    Java    ";
        String d = "";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.concat(str1));
        System.out.println(str.length());
        System.out.println(c.trim());
        System.out.println(d.isEmpty());
        System.out.println(str.charAt(2));
        System.out.println(str.indexOf(str));
        System.out.println(str.equals(str1));
        System.out.println(str.replace('H', 'S'));

    }
}