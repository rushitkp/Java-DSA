// public class Linear_Search { 

//     public static int Search(int num[], int key) {
//         for (int i = 0; i <= num.length; i++) {
//             if (num[i] == key) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int num[] = { 10, 20, 30, 30, 40, 50 };
//         int key = 30;

//         int index = Search(num, key);
//         if (index == -1) {
//             System.out.println("Not Found");
//         } else {
//             System.out.println("Number Found:" + key);
//         }
//     }
// }

import java.util.Scanner;

class Linear_Search {
    public static void main(String[] args) {
        // int n, item;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int num[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println("Enter the item to search: ");
        int item = sc.nextInt();

        // System.out.println("Array Elements:");
        // for (int i = 0; i < n; i++) {
        // System.out.print(num[i] + " ");
        // }

        for (int i = 0; i < n; i++) {
            if (num[i] == item) {
                System.out.println("Item Found: " + item);
                break;
            }
        }
    }
}   
