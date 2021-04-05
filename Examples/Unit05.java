public class Unit05 {
	public static void vMethods(){
  System.out.println(BLUE + "Welcome to Unit 5 : Lesson 1." + RESET + PURPLE  + "\nThis lesson shows you how to write void methods, and how to declare them. ");
  System.out.println(CYAN + "To write a Void method: write public static void + the name of your method + parentheses." + RESET + RED + "\nEx. public static void art()" + RESET + CYAN + "\nTry it by writing out the example: " + RESET);
  String test = "public static void art()";
  Scanner scan = new Scanner(System.in);
  String me = scan.nextLine();
  if (me.equals(test)){
    System.out.println(GREEN + "Great job!" + RESET);
    System.out.println(CYAN + "Remember that a method prints out what is within the curly brackets; which is written after the parentheses of your method: {}." + "\nLastly, when you wish to declare your method, write: name of method + () + ;" + RESET);
  System.out.println(RED + "Ex. art();" + RESET + YELLOW + "\nUnit 5 Lesson 1 Completed.");
  } else if(!(me.equals(test))){
    System.out.println(RED + "Please try again." + RESET);
  }
}

public static void parameters(){
  System.out.println(PURPLE + "Welcome to Unit 5 : Lesson 2." + RESET + BLUE + "\nThis lesson will show you how to write parameters, and how to distinguish Formal and Actual parrameters. \n" + RESET + CYAN + "Parameters in general are inputs for methods. The data type of the parameter is extremely important: Primitive vs. Class type.\n There are two different types of parameters, the first one is Formal. A Formal parameter is a local variable in a method header that holds the data sent in. " + RESET + RED + "\nEx. public static void art(String c)" + RESET + CYAN + "\nString c is the local variable in the method art, therefore, it is the formal parameter with the class type String. The Formal parameter rules are as followed: As many parameters as you need. Any combination of data types so long as they are separated by a comma." + RESET + RED + "\nEx. public static void math(int a, string b)" + RESET);

  System.out.println(CYAN + "\nNext is Actual parameters. Actual parameters are values being sent in the formal parameters. The data type of the argument must match the data type of the formal parameter. The order in which the data is sent in matters as well." + RED + "\nEx. Say we have double x = 1.2 and our method was squareIt(double x){ System.out.println(x * x)}. When we call squareIt(x); the answer will be > 1.44" + RESET + CYAN + "\nNotice how x is a double, which matches the data type found in the formal parameter: squareIt(double x).");

  System.out.println(YELLOW + "\nUnit 5 Lesson 2 Completed." + RESET);
}

public static void ppc(){
System.out.println(CYAN + "Welcome to Unit 5 : Lesson 1." + RESET + BLUE + "\nThis lesson will explain the difference between Primitive and Class parameters." + RESET);
System.out.println(PURPLE + "Primitive parameters have their values copied and changed. But once the method is called and the method value printed, the copy gets deleted, while the original value remains the same. \nClass parameters on the otherhand holds the original value address, so any changes made within the class also changes the original value." + RESET + RED + "\nNote: The easiest way to differenciate Primitive and Class parameters are that Primitive parameters are executed similar to a void method learnt in Lesson 1. While Class parameters initalize a reference first before declared." + RESET + BLUE + "\n Ex. Circle circle = new Circle(5.0); \nminusOneRadius(circle);");
  System.out.println(YELLOW + "\nUnit 5 Lesson 3 Completed." + RESET);
}

public static void method2(){
  System.out.println(RED + "Welcome to Unit 5 : Lesson 4" + RESET + " This lesson introduces return statements. Return statements return a specific type of value(int, double, boolean, String). This value is indicated by the method header." + BLUE + "\nThe following method will return the greatest integer." + RESET);
  System.out.println("Please enter the value of the two integers.");
  Scanner scan = new Scanner(System.in);
  int a = scan.nextInt();
  int b = scan.nextInt();
  System.out.println("The greater integer is: " + maximum(a,b));
}
// helper method for method2()
public static int maximum(int a, int b) 
{
if (a > b) 
{
  return a;
}
return b;
}

public static void method3(){
 System.out.println(YELLOW + "Welcome to Unit 5 : Lesson 5" + RESET + "\n This lesson covers the basics of classes. \n Below I have created a Book class. The information you provide will be placed in this classes constructor and will be printed out by the toString method.");
 System.out.println(BLUE + "Please enter the author of the book." + RESET);
 Scanner scan = new Scanner(System.in);
 String author = scan.nextLine();
 System.out.println(PURPLE + "Please enter the name of the book." + RESET);
 String name = scan.nextLine();
 System.out.println(CYAN + "Please enter the year the book was published." + RESET);
 int year = scan.nextInt();
 System.out.println("When this object is called, it will print out: \n" + RED + name + " by " + author + " was published in " + year + "." + RESET);
}

public static void constructor()
{
  System.out.println(RED + "Welcome to Unit 5: Lesson 6" + RESET + "\nThis lesson covers how to create and call constructors. \nType in the parameters for a car constructor below:");
  Scanner scan = new Scanner(System.in);
  System.out.println("Type in the first variable(model):");
  String name = scan.nextLine();
  System.out.println("Type in the second variable (year):");
  String year = scan.nextLine();
  System.out.println("Here's what that String would look like in the class: \npublic Car(String n, int y) {\n\t"+ name + " = n; \n\t" + year + " = y; \n}");
} 

public static void documenting(){
  System.out.println(BLUE + "Welcome to Unit 5 : Lesson 7" + RESET + "\nThis lesson is about preconditions and postconditions and using javadocs. As well as using comments in our code");
  System.out.println(YELLOW + "This is what preconditions and postconditions look like in code" + RESET + "\n/** \nThis is a method to calculate the area of a circle \n * @param circ a Circle ojbect \n * @return a double representing the area for the circle \n*/ ");
}

public static void instanceandsttic()
{
  System.out.println(YELLOW + "Welcome to Unit 5: Lesson 8" + RESET +"\nThis lesson is about static and instance member variables and methods. \nStatic is a modifier - it is added to a method or variable. \nOnly one copy of that method or variable exists for all objects of that class. \n\tAll objects share this variable or method.");
  System.out.println("Instance variables and methods are variables and methods that are not static. \nInstance variables are unique to the object they are assigned to. \nInstance methods require an object to have been created in order to use them.\n Static methods use the class name and the dot operator (.) when called.\nInstance methods use the object name and the dot operator (.) when called.\nRefer to the MarkDown for a more detailed explanation.");
}

public static void impact5(){
  System.out.println(GREEN + "Welcome to Unit 5 : Lesson 9" + RESET + "This lesson covers issues dealing with the impact of computing systems on society");
}
/************

    //UNIT 5
    if (unit == 5) {
      System.out.println("Input a number to select a lesson:\n1. Lesson 1\n2. Lesson 2, 3, 4\n3. Lesson 5, 6, 7\n");
      int lesson = Integer.parseInt(scan.nextLine());


      if (lesson == 1)
      {
        System.out.println("\nType a phrase that you would like to be repeated.");
        String a = scan.nextLine();
        System.out.println("How many times would you like this phrase to be repeated?");
        int b = scan.nextInt();
        repeat(a,b);
        //repeats user inputted message y for x amount(s) of times 
      }


      //Hanna Saeidzadeh
      if (lesson == 2)
      {
        System.out.println("\nUnit 5 Lesson 2, 3, 4");
        
        //lesson 2
        double value = 2.4;
        // value is an actual parameter
        System.out.println("\nUsing MulTiply method to show difference between formal and actual parameters: ");
        Square.MulTiply(value);

        //lesson 3
        int a = 56; 
        int b = 70; 
        ValCall object = new ValCall(); 
        System.out.println("\nExample for primitive-type parameter:");
        System.out.println("a: " + a + " & b: " + b); 
        object.Primitive(a, b); 
         System.out.println("a: " + a + " & b: " + b);
      

        //lesson 3
        RefCall objectI = new RefCall(20, 34);
        System.out.println("\nExample for class-type parameter:");
        System.out.println( "a: " + objectI.a + " & b: " + objectI.b);
        objectI.ChangeVal(objectI);
        System.out.println("a: " + objectI.a + " & b: " + objectI.b);


        //lesson 4
        int num = 4;
        boolean x = ReturnStatement.numEven(num);
        System.out.println("\nImplementing isEven method, which is a return method: ");
        System.out.println("Is variable num even? " + x);
      }
      

      if(lesson == 3)
      {
        // Lesson 5, 6, 7 (Ryan)
        System.out.println("\nUnit 5: Lesson 5, 6, 7\n");

        Student a = new Student(); // Case A
        Student b = new Student("Ryan Bui", 11, 119467); // Case B
        // Student c = new Student("Jeffrey"); Case C (will not compile)

        System.out.println("Case A: \n" + a);
        System.out.println("\nCase B: \n" + b);        
        }
	  }
  } 

  
  //hi, this method is to demonstrate Unit 5 Lesson 1 on void methods :) -Christie
  public static void repeat(String x, int y){
    for (int z = 0; z < y; z++)
      System.out.println(x);
  }


****************/
}