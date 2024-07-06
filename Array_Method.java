import java.util.Arrays;

public class Array_Method {
    public static void main(String[] args) {
        String a[] = { "Red", "Blue", "White", "Orange" };
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.asList(a));
        System.out.println(a.length);

        int arr[][] = { { 10, 20 }, { 30, 40 } };
        System.out.println(Arrays.deepToString(arr));
    }           
}           
    