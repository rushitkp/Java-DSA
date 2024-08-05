import java.util.Scanner;

interface user {
    void input();

    void output();
}

class emp implements user {
    String name;
    double sal;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name:");
        name = sc.nextLine();
        System.out.print("Enter Salary:");
        sal = sc.nextDouble();
    }

    public void output() {
        System.out.println(name);
        System.out.println(sal);
    }
}
    
class Interface {
    public static void main(String[] args) {
        emp e = new emp();
        e.input();
        e.output();
    }
}
