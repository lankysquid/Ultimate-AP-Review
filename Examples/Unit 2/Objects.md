# Unit2
## Objects and Classes

Everything in Java is associated with objects and classes. Classes have different attributes and methods. For example a car has attributes like make and color, while it also has methods such as drive and brake.

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
## External Links
For extra information on these subjects I suggest looking at the following links bellow
 