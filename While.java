import java.util.Scanner;

class While {
  public static void main(String1[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number:");
    int num = sc.nextInt();

    int a = 1;
    int sum = 0;
    while (a <= num) {
      // System.out.println(a);
      sum = sum + a;
      a++;
    }
    System.out.println("Sum:" + sum);
  }
}