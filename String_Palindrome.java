public class String_Palindrome {
    public static void main(String[] args) {
        String str = "level";
        int n = str.length();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                System.out.println("Not Palindrome");
            } else {
                System.out.println("Palindrom");    
            }
        }
    }
}
    