public class Unit03 {
	 public static void unit3() {
    Scanner scan = new Scanner(System.in);
    //if statements
    System.out.println("Enter 2 integers:");
    int x = scan.nextInt();
    int y = scan.nextInt();
    if (x == y){
      System.out.println("YES!");
    } else {
      System.out.println("NOT THE SAME!");
    }
    //relational operators and order of operations
    System.out.println("Enter the 4 doubles for your school report card:");
    double a = scan.nextDouble();
    double b = scan.nextDouble();
    double c = scan.nextDouble();
    double d = scan.nextDouble();
    double avg = (a + b + c + d)/4.0;
    if (avg >= 59.0){
      System.out.println("PASSING");
    } else if (avg <= 59.0){
      System.out.println("NOT PASSING");
    } else if (avg == 59.0){
      System.out.println("YOU BARELY PASSED");
    } else {
      System.out.println("N/A");
    }
    //boolean operators
    System.out.println("Enter a number between 1 to 10:");
    int n = scan.nextInt();
    if (n >= 1 && n <= 10) {
      System.out.println("True");
    } else if (n >= 1 || n <= 10){
      System.out.println("True");
    }else {
      System.out.println("False");
    }
    //De Morgan's law
    int r = scan.nextInt();
    if(!(r < 1 && r > 10)){
      System.out.println("r is greater than 1 or r is less than 10");
    } else {
      System.out.println("It failed.");
    }
    //Comparing objects
    System.out.println("Please enter two strings.");
    String str1 = scan.nextLine();
    String str2 = scan.nextLine();
    if (str1.equals(str2)){
      System.out.print("These strings are equal!");
    } else {
     System.out.print("These strings are not equal."); 
    }
    scan.close();
  }
}