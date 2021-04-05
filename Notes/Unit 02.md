# Unit 2
**Objects**

As a quick reminder, an object is pretty much just a piece of data of a certain type. The most well known object is probably the String, but objects can be created by the programmer for a variety of purposes. When thinking of a String, you may know about the the various methods that come with it, like compareTo() and equals(). compareTo() is a unique method that was written for Strings, while equals() was overridden from the "mother" Object class. Here is how to establish objects and their related methods:
## Creating a Class
To create a class we use the keyword class and then declare it as either public or private
```java
public class Example{
  String x = "This is an example";
}
```
In this example the name of the class is Example which we can utilize later.

## Creating an Object
The Object is created from the class
We use the new keyword to show the Object
To create an Object of the class "Example" we have to do something like what is shown below:
```java
public class Example{
  String x = "This is an example";
}

public static void main(String[] args){
  Example Object = new Example();
}
```
## Static VS Non-Static
In a static class you can access it without creating an Object 
In a public class you have to create an object to access it

## Constructors
A constructor is a method that initializes objects
```java
public class Example{
  String x; // creating class attribute

  public Example(){
    x = "This is an example";
  }

  public static void main(String[] args){
  Example Object = new Example();
  System.out.println(Object.x)
}
}
```
## Overloaded Constructors
A constructor is a method that initializes objects, but has multiple ways of inputing
```java
public class Example{
  String x; // creating class attribute

  public Example(){
    x = "This is an example";
  }

  public Example(String a){
    x = a
  }

  public static void main(String[] args){
  Example Object = new Example();
  System.out.println(Object.x)
  // > "This is an example"
  Example Object = new Example("This is another example");
  System.out.println(Object.x)
  // > "This is another example"
  Example Object = new Example(5);
  System.out.println(Object.x)
  // > creates an error
}
}
```
## Return Methods
A method that is used to a return a value back
```java
public class Example{
  String x; // creating class attribute

  public Example(){
    x = 5;
  }

  public Example(int a){
    x = a
  }

  public int returnNum(){
    return x;
  }

  public static void main(String[] args){
  Example Object = new Example();
  System.out.println(Object.returnNum());
  // > 5
  
}
}
```
## Void VS Non-Void Methods
* Void methods preform a function but dont give back any nformation
* Non-void returns a value (return methods)
```java
public class Example{
  String x; // creating class attribute

  public Example(){
    x = 5;
  }

  public Example(int a){
    x = a
  }

  public void returnNum(){
    System.out.println(x);
  }

  public static void main(String[] args){
  Example Object = new Example(7);
  Object.returnNum();
  // > 7
  
}
}
```
## Wrapper Classes
* Integer and Double
  * If we want to store an int or a double we use wrapper classes
```java
Integer x = new Integer(30);
```
We can use Integer like how we use int
```java
Integer x = new Integer(30);
System.out.println(a.equals(30));
//>true
```
## Math Classes
```java
//Absolute Value
abs(double num)
// Exponents
pow(double base, double exponent)
// Random numbers
random()
// Square Root
sqrt()
```
## Escape Characters and String Concatenation

You can use special characters in Strings to avoid having errors or to format your text easier. You can also use the + symbol to add objects to Strings to display. Here's an example of both:
```
// ESCAPE CHARACTERS

// \n = New line when the symbol is read
// \" = Insert a literal quote (aka add a " mark rather than using one)
// \t = Makes a new line and tabs when the symbol is read
// \' = Insert a literal single quote (same as double quote)
/* \\ = Insert a literal backslash (using just one will 
        cause an error due to the other escape characters being expected) */

String newLine = ("This is the first line\nThis is the second line!");
String quote = ("Hamlet has the famous quote \"To be or not to be\");

// STRING CONCATENATION 

int x = 7;
String message = "The number chosen is " + x;
// will display "The number chosen is 7"

// you can also add strings like math
String message = "hi";
String full = "The man said " + message;
// will display "The man said hi"
```
## External Links
For extra information on these subjects I suggest looking at the following links below
<https://www.geeksforgeeks.org/classes-objects-java/>
<https://www.w3schools.com/java/java_classes.asp>


# Unit 2: Objects
This unit covers the basics of objects, methods, return types, and classes, focusing specifically on the String, wrapper, and Math classes.



## lesson 1: Strings and Class Types
### key terms
* Primative Data Type: These data types are only able to hold 1 variable at a time, and hold a copy of the variable. 
  * int, double, boolean
* Class Data Type: Holds several pieces of data with different types and have custom methods to act upon them. Instead of holding the variable they hold the memory address of the data.
  * Strings
* Null: a place holder for empty variables
* Mutable: the data in the memory can be changed.
* Immutable: The data in memory can't be changed. Al that can be done is change what memory the code references.
  * Strings are an example of an immutable class.

### Declaration
* Primiative Data types are kept in the memory as a copy when declared.
* Class Data types are kept in a part of the memory as a reference. This means that when the class is called it only calls the reference to the memory rather than a copy.
  * When a new variable is set equal to another variable then both variables point to the same memory space, and have the same reference.

## lesson 2: Escape Characters and String Concatenation
### keyterms
* String Concatenation: the use of + or = to combine 2 different Strings into 1 String.
  * if a string is added before integers are added then the integers are treated as strings.
```java
  System.out.print("number" + 1 + 3);
  //prints "number 13"
  System.out.print("number" + (1 + 3));
  //prints "number 4"
```
* Escape Characters: String shortcuts that are used to edit how a String is printed in the console.
  * Quotation Mark: \"
  * Add a new line without println: \n
  * Add a tab: \t
  * Add apostrophy: \'
  * Add backslash: \\
```java
	System.out.print("\"Something Depressing\" \n\t-nietzsche \'probably\'");
  /* This prints
  "Something Depressing"
      -nietzsche 'probably'
  */
```

## lesson 3: String Functions

### keyterms
* Index: a numarical representation of the position of a value in an array. the index starts at 0. 
  * Somthing to always remember is that the index of the last value is not equal to the array's length/size. If an Array have 7 variable the index of the last one will be 6.
### Methods
```java
String a = "hello";
String b = "HELLO";
String c = "h";
String d = "Apple";
a.length();
//returns the number of characters in a word including quotation and spacing.
//example returns 5
a.equals(b);
//returns true or false depending on whether or not the strings are exactly the same.
//example returns false
a.indexOf(String c);
//returns the index of the first letter that matches the input string.
//example returns 0
a.substring(1,3);
//returns a string of letters starting at the first inputed index, and ending with the letter before the second input.
//example returns "el"
a.substring(2);
//returns a String consisting of the index of the first letter till the end of the String.
//example returns "llo"
a.toUppercase();
//returns the string, but all the letters are uppercased.
//example returns "HELLO"
b.toLowercase();
//returns the string, but all the letters are lowercased.
//example returns "hello"
a.compareTo(d);
//returns 0 if the strings are the same, returns a positive value if the a String comes before the d String alphebetically, and returns a negative value if the opposite is true.
//example returns negative
```

---


## Lesson 4: Classes and Objects

### What are classes?
- template/outline/blueprint/idea for an object
- determines which methods (or behaviors) are available for an object to use, what types of data an object will store, and the restrictions on these data values

### Objects
- have properties (also called fields)
- have behaviors defined by methods
- when an object is stored, a reference pointing to that object is stored, instead of the actual instance of the object

### How do we create an object?
- ** Declaration **
    - declaration is the first and essential step that gives info about the data type and name of a variable that you create
    - `String s` is an example
    - Always begins with stating the data type or class name (in this case, a * String *)
    - Then, the variable name is stated (in this case, the name is * s *)
- ** Instantiation **
  - ** ONLY FOR OBJECTS **
  - creates a new instance of an object based on the guidelines of the class to which it belongs
  - `new String("HIIII")` is an example of instantiation
  - the keyword ** new ** signifies the creation of a NEW object
  - you must follow the exact signature of a constructor in the class to which the object belongs (more details on constructors in the next lesson)
- between the declaration of a variable and the instantiation of an object, there is an ** assignment operator ** which is denoted by an equal (=) sign

```java
//standard example of an object declared and instantiated
Scanner scan = new Scanner(System.in);
```

NOTE: `Scanner scan` represents ** declaration **, `new Scanner(System.in)` is the ** instantiation ** of a Scanner object, and the * = * sign between the two is the ** assignment operator **

```java
//advanced example
House myHouse = new House();
```

NOTE: `House myHouse` represents ** declaration **, `new House()` is the ** instantiation ** of a House object, and the * = * sign between the two is the ** assignment operator **

## Lesson 5: Using Constructors
### Classes in Packages
Note: You can access the edhesive.shapes package documentation [here](https://amooc.github.io/edhesiveshapes/) to follow along with the examples in this lesson.

- different classes are divided into different ** packages ** and these packages exist within ** libraries **
  - so, the hierarchy is ** classes < packages < libraries **
  - ex: the Scanner class is part of the java.util package; java is the library
  - ex: the String class is part of the java.lang package; java is the library

Let's break down this import statement:
```java
import edhesive.shapes.*;
```
- edhesive is the library
- shapes is the package
- the `*` means that we will get access to ALL classes in the shapes package; if we want just access one class from the shapes package, we can replace the `*` with the class name

### Using Constructors
- In order to instantiate an object, we must use an existing ** constructor ** and the ** new ** keyword
- A constructor is a special type of method

Example:
```java
Circle c = new Circle();
```

- `Circle()` is the signature of a constructor we would find in the Circle class (view the above link for reference)
- NOTE: when there is nothing within the parentheses of a constructor, it is called a ** default constructor **

Example: 
```java
RegularPolygon rp = new RegularPolygon(2.5);
```

- ** parameter **: the value(s) within the parentheses of a constructor (more on parameters in Unit 5 Lesson 2)
  - if a primitive data type is passed in as a parameter, then the copy of that value is passed in (this value is also called a ** pass by value **)
  - if an object data type is passed in, then the copy of the memory reference of the object is passed in (this reference is also called a ** pass by reference **)
- ensure that the number of parameters in the constructor you use matches the number that is present in a constructor within the class--otherwise, Java will throw an error

### Overloaded Constructors
Let's look at an example: 
```java
Rectangle aRectangle = new Rectangle();
Rectangle myRectangle = new Rectangle(4.5);
Rectangle yourRectangle = new Rectangle(3.2, 3.2);
```

- Notice that these three constructors all have the same name but different parameters
- This is what we call ** overloaded constructors **--the name of the constructors are the same BUT they have different * numbers * of parameters, different * data types * of parameters, or a different * order of data types * of parameters

###


## Lesson 6: Using Methods
### Methods Overview
- methods are behaviors or actions that objects of the class can perform
- we use ** dot notation ** to ** call ** or use a method
- when we call a method, code runs somewhere else in the program, and the normal code sequence pauses
  - when a method has finished running, the normal code sequence resumes

Here is some pseudo code showing the typical format for calling a method:
```java
variable.someMethod();
variable.someMethod(5);
```
- the `variable` represents an ** object **
- immediately after the object, we must have a "."
- then, we use the method name (above, the method name is `someMethod`)
- finally, we place no or some parameter(s) within the parentheses

### Return Types
#### Void
- ** no ** return value

#### Non-Void (String, int, double, boolean, any other class)
- sends back a specified data type value or reference

Example:
```java
String s = "Hello";
int length = s.length();
```
- `s.length()` method call returns the length of String s, which is a primitive int data type value
- this value is then stored into the length variable

### Documentation/Application Programming Interface (API)
- this is detailed info about code
- it abstracts complex methods into their functionalities so that they can be reused

### Overloaded Methods
- same as with overloaded constructors (see Unit 2 Lesson 5)
- ** IMPORTANT: ** if the method signature (name and parameters) is the same for two methods BUT the return types are different, it's ** NOT overloading **

Example of overloaded methods:
```java
RegularPolygon myPolygon = new RegularPolygon();
myPolygon.addSides(); //adds 1 side to the object myPolygon

RegularPolygon yourPolygon = new RegularPolygon();
yourPolygon.addSides(3); //adds the specified 3 sides to the object yourPolygon
```

---


--- Christie P
## lesson 7: Wrapper Classes
* A **wrapper class**...
  * "wraps" a primitive data type, like an int or double, in a similarly named class, such as Integer or Double. 
  * stores variables as a reference in memory
  * allows coders to still use ArrayList, since ArrayList cannot use primitive data types
  * Ex. 
    * ```java 
    Integer x = new Integer(10);
    Double y = new Double(10.0);
* The **Integer** or **Double** Class 
  * have built-in methods, such as ```.compareTo``` and ```.equals```
  * have accessible constant variables, ```MAX_VALUE``` (2³¹-1) and ```MIN_VALUE``` (-2³¹).
  * ```intVALUE()``` returns the value of Integer as an int
  * ```doubleVALUE()``` returns the value of Double as a double 
  
### Autoboxing 
* converts the primitive data type, such as an int or double, to its respective Wrapper class, Integer or Double
* Ex. 
  * ```java 
  int x = 50; 
  Integer y = x; 
  * In this example, Java was expecting an Integer value to be passed into y; however, a primitive data type was passed in. By autoboxing, Java converted the primitive data type into an Integer so that y could hold the value of x. 

### Unboxing
* converts the Wrapper class, such as Integer or Double, to its respective primitive data type, int or double
* Ex. 
  * ```java
  Double x = new Double(50.0); 
  double y = x;
  * In this example, Java was expecting a double value to be passed into y; however, a Double was passed in. By unboxing, Java converted the Double to a primitive data type double so that y could hold the value of x. 

## Lesson 8: Math Functions
* The **Math Class** has...
  * static methods that are attached to the class itself, which means that the coder does not need to declare a new Math object in order to use the method 
### 4 Important Methods 
  * **Absolute Value method** - an overloaded method that can take either ints or doubles into its parameters and returns the absolute value of the object 
    * ```java 
      double x = Math.abs(-9.0);
      System.out.println(x);
      > 9.0
  * **Power/Exponent method** - takes two doubles as input and returns the first raised to the second as a double
    * ```java
    double x = Math.pow(3,4);
    System.out.println(x);
    > 81.0
  * **Square Root method** - takes a double as input and returns its square root as a double
    * ```java
    System.out.println(Math.sqrt(25));
    > 5.0
  * **Random Numbers method** - returns a random double between 0 inclusive and 1 exclusive
    * To set the minimum number and range of an integer that might print out, follow this format as follows: 
      * ``(int)(Math.random() * range) + min;``
    * Ex. To print out a number that could range from 1-100
      * ```java 
      System.out.println((int)(Math.random() * 100));
      > 72
