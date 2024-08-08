import java.util.ArrayList;

public class Array_Element1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(32);
        list.add(5);
        list.add(4);
        list.add(34);
        list.add(23);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        System.out.println("Max Element:" + max);
    }
}
