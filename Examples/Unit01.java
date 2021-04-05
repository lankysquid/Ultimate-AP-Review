public class Unit01 {
	public static void unit1 () {
    Scanner scan = new Scanner(System.in);
    //Difference between print and println
    System.out.println("Here is the difference between System.out.println and System.out.print");
    System.out.println("This can make a new line while System.out.print does not.");
    //user input
    System.out.println("Input a String, an int, and a double. I will repeat them back to you.");
    String x = scan.nextLine();
    int y = scan.nextInt();
    double z = scan.nextDouble();
    System.out.println("\n" + x + "\n" + y + "\n" + z);

    //calculations
    System.out.println("Input 2 ints to run the four basic operations on:");
    int a = scan.nextInt();
    int b = scan.nextInt();
    System.out.println(a + " + " + b + " = " + (a + b));
    System.out.println(a + " - " + b + " = " + (a - b));
    System.out.println(a + " * " + b + " = " + (a * b));
    System.out.println(a + " / " + b + " = " + (a / b));
    //calculation operators
    System.out.println("Input 2 ints to use the shortened basic operations:");
    int g = scan.nextInt();
    int h = scan.nextInt();
    System.out.println(g + " += " + h + " = " + (g += h));
    System.out.println(g + " -= " + h + " = " + (g -= h));
    System.out.println(g + " *= " + h + " = " + (g *= h));
    System.out.println(g + " /= " + h + " = " + (g /= h));
    //modular division
    System.out.println("Input 2 ints again to run the modulus (remainder) on:");
    int c = scan.nextInt();
    int d = scan.nextInt();
    System.out.println(c + " % " + d + " = " + (c % d));
    //modular operator
    System.out.println("Enter 2 ints to use the shortened modulus on:");
    int m = scan.nextInt();
    int n = scan.nextInt();
    System.out.println(m + " %= " + n + " = " + (m %= n));
    //casting
    //Widening Conversion
    System.out.println("Input 2 ints for widening conversion:");
    int i = scan.nextInt();
    int j = scan.nextInt();
    double k = (double) (i + j);
    System.out.println("The widening conversion for the two numbers totaled you inputted is: " + (k));
    //Narrowing Conversion
    System.out.println("Input a double for narrowing conversion:");
    double p = scan.nextDouble();
    int s = (int) (p);
    System.out.println("The narrowing conversion for the double you input is: " + (s));
    scan.close();
  }

/***********************
System.out.println("Hello World");

    // unit 1 lesson 2
    Scanner scan = new Scanner(System.in);
    String ic;
    
    System.out.println("What is your favorite ice cream flavor");
    ic = scan.nextLine();
    System.out.println("The ice cream flavor of " + ic + "can be found in many grocery stores");

    // unit 1 lesson 3
    public static void main (String str[]) throws IOException {
    
    Scanner scan = new Scanner(System.in);
    String ic;
    
    System.out.println("What is your favorite ice cream flavor");
    ic = scan.nextLine();
    System.out.println("The ice cream flavor of " + ic + "can be found in many grocery stores");
}

    //unti 1 lesson 4
    //Number Calculations
    int x = 7;
    int y = 2;
    double z = 1.0*x/y;
    System.out.println(z);
    //this would return z as 3.5

    //unit 1 lesson 5 
    //Modular Division
    int x = 5;
    int y = 2;
    x %= y;
    System.out.println(x); 
    //this would return x as 1

    //unit 1 lesson 6
       //Casting
       int a = 5;
       int b = 2;
       double y = 5/2; //this would return the number 2
        
       double y = (double) 5/2; //this would make the quotient a double value and return 2.5
      //Runding
      double num = 4.7;
      int roundNum = (int) (num + 0.5);
        System.out.println(roundNum);
      //> 5 -- 4.7 rounded 


**************************/
}