class If {

  public static void main(String1[] args) {
    // Scanner sc = new Scanner(System.in);
    // int age = sc.nextInt();
    int age = 20;
    if (age >= 18 && age < 80) {
      System.out.println("You Are Drive");
    } else if (age > 13 && age <= 18) {
      System.out.println("You Are Drive Cycle");
    } else {
      System.out.println("You Can Not Drive");
    }
  }
}
