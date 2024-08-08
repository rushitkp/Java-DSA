import java.util.ArrayList;

public class Array_Element {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // list.add(5, 10);
        System.out.println(list);

        int element = list.get(3);
        // System.out.println(element);

        // list.remove(0);
        // System.out.println(list);

        // list.set(1, 45);
        // System.out.println(list);

        // System.out.println(list.contains(87));
        // System.out.println(list.contains(45));

        // System.out.println(list.size());

        // for (int i = 0; i < list.size(); i++) {
        // System.out.print(list.get(i) + " ");
        // }
        // System.out.println();

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        } 
        
    }
}
