## Unit 5 : Writing Classes

[Unit 5 : Lesson 1 : Void Methods](https://intro.edhesive.com/courses/46977/pages/unit-5-lesson-1-void-methods?module_item_id=15671778) 
### Void Methods
* To declare void methods, we need to declare them outside the main method. 
  * To write a void method, start by declaring public;
    * Public indicates that other classes will be able to access the method in contrast to private.
  * Next, write static;
    * Static will be explained in Unit 5 Lesson 8
  * Then, write void;
    * This implies that the method doesn't return anything
  * Lastly, write the name of your method and add parentheses.

* Example:
  ```java
  public static void myMethod()
  {
    System.out.println("This is a method.");
  }
  ```    

* Methods, are contained using curly brackets. Everything inside the brackets gets executed every time the method is called.

*** Declaring Void Methods in Main***

* To call a method from a class it's defined in, we use the name of the method.

  * Example:
    ```java
    public static void main(String[] args) throws IOException
    {
     myMethod(); //Notice we don't need a dot operator or reference
    }
    ```
* This helps us reuse code instead of rewriting more complex code.
* Note: Calling the method within a class does not need a reference. However, calling methods from outside a class does.
  * Example
    ```java
    //Calling a method outside a class requires a reference
    Circle c = new Circle();
    c.setRadius(10);
    ```
* The .setRadius() method is outside of the Circle class which needs a reference to be used.

[Unit 5 : Lesson 2 : Parameters](https://intro.edhesive.com/courses/46977/pages/unit-5-lesson-2-parameters?module_item_id=15671786) 
### Parameters
* Parameters are inputs for methods.

* The data type of the parameter is extremely important: 
  * Primitive vs. Class type.

*** Formal Parameters ***
* A formal parameter is a local variable in a method header that holds the data sent in. 
  * Example:
  ```java
  //double x is the variable in the method header
  public static void squareIt(double m) 
  {
    System.out.println(m * m); 
  }
  ```
* We know double m is the formal parameter since it is in the parentheses of the method.

#### Formal Parameter Rules: ####
* As many parameters as you need.
* Any combination of data types.
  * Example:
  ```java
  public static void contact(String a, int x) 
  {
    System.out.println("Name: " a + " Age: " x); 
  }
  //Note: This would print out Ex. "Name: Amy Age: 17"
  ```
* Values are sent in from main (or the method calling the method).

*** Actual Parameters ***
* The values being sent in the formal parameters are called arguments (or actual parameters).
* The data type of the argument must match the data type of the formal parameter.
* The order in which the data is sent in matters as well.
  * Example:
  ```java
  //This would occur within the main method.
    double m = scan.nextDouble();
    > 1.2
    squareIt(m);
    > 1.44
  ```
* Note that m is a double, which matches the data type found in the formal parameter: squareIt(double m).
  * A string would not be able to run in squareIt because the data type for squareIt is a double, not a string. An error would occur if it was attempted.

[Unit 5 : Lesson 3 : Parameters - Primitive vs. Class](https://intro.edhesive.com/courses/46977/pages/unit-5-lesson-3-parameters-primitive-vs-class?module_item_id=15671794) 
### Parameters - Primitive vs. Class ###
*** Primitive Parameters ***
* Primitives are stored in memory directly, if they are changed in a void method, those changes do not remain.
* The value gets copied and stored in the parameter, which means that once the method returns, the value returns to the original value.

 ```java
 public static void minusOne(int c) 
  {
    c--;
    System.out.println(c);
  }

  public static void main(String[] args) 
  {
    int c = 9; 
    minusOne(x);
    System.out.println(c);
  }
  > 8
  > 9
  ```
  * Notice how the original value reprints itself. By the time the method result gets printed, it gets "garbagecollected". But the original value remains the same

*** Class Type Parameters ***
* Class data types are stored as references/memory address, if they are changed in a void method those changes remain. This is because the reference guides back to the original value instead of a copy, so any changes are saved.
  * Example:
  ```java
  public static void minusOneRadius(Circle circle) 
  {
    circle.setRadius(circle.getRadius() - 1);
    System.out.println(circle);
  } 

  public static void main(String[] args) 
  {
    Circle circle = new Circle(5.0); 
    minusOneRadius(circle);
    System.out.println(circle);
  }
  > circle with radius 4.0
  > circle with radius 4.0
  ```
 * When the reference gets "garbage collected" at the end of the method, the changes to this object remains, meaning the object referenced by circle changed.
    * Remember that Strings are Class data types, but they are immutable, so changes to a String will not alter the original String.

[Unit 5 : Lesson 4 : Return Methods](https://intro.edhesive.com/courses/46977/pages/unit-5-lesson-4-return-methods?module_item_id=15671801) 
### Return Methods
* A method with return statements
* The type of value returned is indicated by the method header.
  * Example:
  ```java 
  public static int maximum(int a, int b) 
{
  if (a > b) 
  {
    return a;
  }
  return b;
}

  * The return type of the method above is an int. 

** Ways to catch the information from return methods **
(Shown for the method above)
* Store it in a variable
  ```java
  int x = maximum(a, b);
  ```
* Print it
  ```java
  System.out.println(maximum(a, b)); 
  ```
* Use it in a boolean condition 
  ```java
  if (maximum(a, b) < 10) 
  {
    System.out.println("both single digit");
  }
  ```
** Rules/ Things to be aware of **
* A  method can only return one value at a time.
* After the return statement is called, any code after it is ignored.
  * For this reason, we don’t need an else statement... Java will never consider the second return statement if the first return statement is called. 
  * Returning a value will also end a loop... this makes methods more efficiant.
* Overloading Methods
  *  You are not allowed to overload a method with two different return types, unless they also have different parameters.  
* Return by Value 
  * Primitive Data Type: Returns a copy of the value in the return statement.
  * Reference data type: Returns a copy of the reference value in the return statement.

[Unit 5 : Lesson 5 : Classes - The Basics](https://intro.edhesive.com/courses/46977/pages/unit-5-lesson-5-classes-the-basics?module_item_id=15671811) 
### Classes - The Basics
Classes have two primary features:
* They have variables: fields
  * Variables should be the first things in your class.
  * Variables should be private.
  * For Example:
  ```java
  public class Book 
{
  private String title;
  private String author;
  private int year;
} 
* They have behaviors: methods

** When creating a new class, remember that... **
* The class name is capitalized
* The class should be in its own file. The file name matching the class name and  followed by a .java extension.

** Constructors **
* Java always adds a default constructor with no parameters.
* Constructors should be public.
* Constructors should have the same name as the method.
Example: 
  ```java 
public Book(String a, String t, int y) 
  {
    author = a;
    title = t;
    year = y;
  }
  ```
  The call in the main method would be:
  ```java
  Book b = new Book("Matilda", "Roald Dahl", 1988);
* You have to validate variable data in the constructor using logic(if/else statements).

** Private Vs. Public Data **
* Public: can be used outside of this particular file.
* Private: can only be used by this class.

** Accessors and Mutators **
* Accessor Method
  * "Getter"
  * Accesses a private variable.
  * Is a return method with no parameter. 
  ```java
  public int getYear() 
{
  return year;
}
* Mutator Method
  * "Setter" 
  * Changes or mutates a private variable. 
  * Is a void method with a parameter passed in. 
  ```java
  public void setYear(int y) 
{
  year = y;
}

** toString() method **
* A public method that always returns a String.
* This method tells Java how to represent objects of a class as strings. 
* Example:
  ```java
  public String toString() 
  {
    return title + "\n\t" + author + "\n\t" + year;
  }

** Comparing Two Objects (.equals) **
* Before we used to use == to compare two values… but this doesn’t work with objects.
* We have to write our own equals method.
* This method is public and will return a boolean.
   Example:
   ```java
   public boolean equals(Book other) 
{
  if (title.equals(other.getTitle()) && author.equals(other.getAuthor())
        && year == other.getYear()) 
  {
    return true;
  }
  return false;
}

[Unit 5 : Lesson 6 : Constructors] (https://intro.edhesive.com/courses/46977/pages/unit-5-lesson-6-constructors?module_item_id=15671817) 
## Constructors
* A constructor is the basis for writing objects in java.
  * It is a method in a class that builds the class in memory.
  * It sets the values of the variables in the class.
* A constructor has the same name as the class it is created in.
* For example, let's say we want to create a book constructor for our book class that creates a book object.
```java
public class Book
{
  private String title;
  private String author;
  private int year;

  public Book (String t, String a, int y)
  {
    title = t;
    author = a;
    year = y;
  }
}
```
* Here the class **Book** is created with three variables: title, author, and year.
  * The constructor takes those variables and assigns them to the inputted parameter variables when a new **Book object** is created.
  * Like so:
  ```java
  Book a = new Book("James and the Giant Peach", "Roald Dahl, 1961);
  ```
* This same process can also be done with methods created in the class.
  * Like so:
  ```java
  public class Book
  {
    private String title;
    private String author;
    private int year;
    
    public Book(String t, String a, int y)
    {
      setTitle(t);
      setAuthor(a);
      setYear(y);
    }
    
    public void setTitle(String t)
    {
      title = t;
    }
    
    public void setAuthor(String a)
    {
      author = a;
    }
    
    public void setYear(int y)
    {
      year = y;
    }
  }
  ```
* The constructor uses the methods created later in the class to assign each variable to its respective input value.
 * This uses less code and is **usually easier to read**.
 ### Constructor Overloading
* There can also be more than one constructor in a class.
  * When there is more than one constructor in a class, it is called **constructor overloading**.
  * This happens when the parameters of the constructors are different.
  * Like so:
  ```java
  private String title;
  private String author;
  private int year;

  public Book(String t, String a, int y)
  {
    title = t;
    author = a;
    year = y;
  }

  public Book()
  {
    title = "none";
    author = "unkown";
    year = 1900;
  }
  ```
* Here, the **second constructor** is **overloaded** and  has no parameters and is thus a ***default constructor***.
### Default Constructor
  * A default constructor has to be created so that instances of that class can be created.
  * If we don't add a default constructor, java will create one for us.
    * The default constructor created by java has no parameters and sets all the member variables to the **default values**. *(class set to null, ints to 0, doubles to 0.0, and booleans to false)*
* A call on a default constructor would look like this:
```java
Book b = new Book();
```
* And the toString for that book would be:
```java
none
    unknown
    1900
```
* These default constructor can be really useful when the object is created, but there was no input parameters passed.
### ***this*** Keyword
* Constructors can also call other constructers in the same class by using the keyword ***this***.
  * The ***this*** keyword will tell java to call the most detailed constructor in the class and populate it with the basic information we provide it.
    * The most detailed constructor is the constructor with the most parameters.
* ***This*** would look like:
```java
public Book() 
{
  this("none", "unknown", 1900);
}
```
* Not only can you use ***this*** to call another method, you can also use it to call the original variables in your class.
  * When you create a constructor that has the same input parameters as the member variables of the class, you can use **"this."** to distinguish bewteen the two and tell java to refer to the member variables.
  * Like so:
  ```java
  public class Book
  {
    private String title;
    private String author;
    private int year;

    public Book (String title, String author, int year)
    {
      this.title = title;
      this.author = author;
      this.year = year;
    }
  }
  ```
### Constructor Chaining
* By allowing constructors to call each other, Java can tell which original constructor to call, allowing us to take advantage of a technique called **constructor chaining**.
  * **Constructor chaining** is when each constructor calls another, allowing you to only change code in one place in the event that any altering is needed.

[Unit 5 : Lesson 7 : Documenting a Class](https://intro.edhesive.com/courses/46977/pages/unit-5-lesson-7-documenting-a-class?module_item_id=15671822)
When writing code, sometimes coders need to write comments to remind themself what the code does exactly 
* Single line of comments 
```java
//this is a single comment
```
* To do a block of code 
```Java
/*
All comments from here
to 
here
*/
```
***Preconditions and Postconditions***
* **Precondition** statements indicates what must be true before  the function is called
* **Postcondition** statemenets indicates what will be true when the function finishes its work

***Javadoc***
* It is a third style of comments that have special tags and can be recognized by /** and */ marking to start and end it
```java
/**
* This method calculates the area of a circle
* @param circ a Circle object
* @return a double repreesnting the area of the circle
*/
```

  * _@param_ means what the parameters are
  * _@return_ means what the mthod should retun at the end

[Unit 5 : Lesson 8 : Static vs. Instance](https://intro.edhesive.com/courses/46977/pages/unit-5-lesson-8-static-vs-instance?module_item_id=15671827) 
## Static vs. Instance
### Static Variables
* **Static** is a *modifier* - it is added to a method or variable.
  * This means that only one copy of that method or variable exists for all objects of that class. 
  * All objects share this variable or method.
* Here is an example of a definition for a **static** variable:
```java
private static int num;
``` 
* We can use these static variables to create **counters**; these counters maintain a constant value across all objects even after you manipulate them.
* In a constructor, adding one to *num* every time a new object is created will keep track of the total amount of objects created from that class.
* Like so:
```java
public Book(String t, String a, int y)
{
  title = t;
  author = a;
  year = y;
    
  num++;
  bookID = num;
}
```
* This specific constructor creates a bookID for every new book created, assigning that ID to the book as a way of keeping track of it.
### Instance Variables
* Simply put, an **instance** variable is a declared variable that is not *static*.
  * In the example above, bookID would be an instance variable because it does not have the static keyword assigned to it.
  * It would be declared like so:
  ```java
  private int bookID;
  ```
  * Instance variables are *unique* to the object they are assigned to.
  * The bookID is unique to the book object it is assigned to in the constructor.       
### Constants
* Static modifiers can also be used to create **constants** in a class.
  * A constant is a *value that does not change*.
  * Constants are traditionally named in all capital letters.
* An example of a constant a person might code is pi.
  * Pi is very long, so you might use a constant to call it easily.
  * Like so:
  ```java
  public static final double PI = 3.141592653589
  ```
  * The **final** modifier locks the value of the variable permanently so that it cannot be changed by any other parts of the code. 
* The Integer.MAX_VALUE is a good example of a constant that can be accessed by any code because it is called from the universal Integer class.
### Static Methods
* The **static** keyword can also be called on methods to make them universally accessable without the need for an object.
  * *Static* means you do not need to create an object to use the method.
* A good example of a static method is the *Math.random()* method.
  * You do not need to create a Math object to use the method. It automatically generates a random number between 0 and 1.
  * These type of static methods use the *class name* and the *dot operator* (.)
* Here is an example of a traditional static method in a class:
```java
public static void addTwo()
```
  * This method adds two new files to a file system.
    * Here's what is would like like if it were called in main:
```java
Files.addTwo();
```
* Static methods also can't access any of the instance variables in their class.
  * **Static methods can only use static variables and other methods**.
* Static methods also *can't call any instance methods from their class* or use the *this* keyword to access member variables and methods.
* The main method we run our code in is actually a static method.
```java
public static void main
``` 
### Instance Methods
* Instance methods require an object have been created in order to be used.
* Here's an example of an instance method called on an object:
```java
Circle c = new Circle(5);
c.getArea();
```
* These methods are called by using the *object name* and the *dot operator* (.)
 
[Unit 5 : Lesson 9 : Wider Impacts of Computing](https://intro.edhesive.com/courses/46977/pages/unit-5-lesson-9-wider-impacts-of-computing?module_item_id=15671831)
Companies and orgnaizations collect their data so they have to have a way to protect their data from hackers.  
* Think about data breach 