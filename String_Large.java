public class String_Large {
    public static void main(String[] args) {
        String fruites[] = { "apple", "mango", "banana" };
        String large = fruites[0];

        for (int i = 0; i < fruites.length; i++) {
            if (large.compareTo(fruites[i]) < 0) {
                large = fruites[i];
            }
        }
        System.out.println(large);
    }
}
