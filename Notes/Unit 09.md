# Unit 9: Inheritance
## 9.1 - Inheritance
Inheritance refers to one or more child classes being utilizing the methods and attributes of their parent class. The child classes are typically more specific parts of the parent class that may require more variables or methods than its parent.

For example, lets say there is a class called student that shows the students ID, year, and GPA of a student.
```java
public class student
{
  private int id;
  private int year;
  private double gpa;
} 
```
Lets say we want to create another student class that says the type of sport the student plays. We can do this by using inheritance.
```java
public class sportStudent extends student
{
  private String sport;
  [...]
}
```
By using the keyword ```extends```, the following class inherits the mehtods and attributes from the class student.

In order to utilize the functionality of the parent method we use the keyword ```super```. 
```java
public class student
{
  private int id;
  private int year;
  private double gpa;

  public student(int i, int y, double g)
  {
    id = i;
    year = y;
    gpa = g;
  }
} 
```
For example, in order to access the constructor behavior of the student class above, we would call the constructor using super.
```java
public class sportStudent extends student
{
  private String sport;

  public sportStudent(int i, int y, double g, String s)
  {
    super(i,y,g);
    sport = s;
  }
}
```
You can also use super to call parent class methods within the child class. For example, lets say the parent class has a toString() method, and we want to add onto it within the child class. We would do the following.
```java
public class sportStudent extends student
{
  private String sport;

  public sportStudent(int i, int y, double g, String s)
  {
    super(i,y,g);
    sport = s;
  }

  public String toString()
  {
    return super.toString()+"\nSport: "+sport;
  }

}
```
The parent-child classes use what is called an **IS-A** relationship. This means that when we say sportStudent extends student, we are saying that the child class, sportStudent, IS A student.

It is salso a good thing to remember that all classes inherit from the object class and the parent class has no knowledge of what the child class contains or does.

The following link is a good website for all subjects and goes into further depth on the topic. 
**https://www.tutorialspoint.com/java/java_inheritance.htm**
## 9.2 - Inheritance Overriding Methods
This lesson covereded further utilization of the super keyword and Overriding.

Overriding is similar to overloading, but it is important to know the difference.

***Overloading*** means using the same method names in one class except with different signatures or parameters. Java determines which method to use based on the parameter that is used.

When ***overriding***, you are still using the same method name but in two different classes that share a parent-child relationship. The method within the parent class is redefined in the child class. Java knows which method to use based on the type of object that is called.

For example, lets say there is a class called feline that contains the method speak().
```java
public class feline
{

  [...]

  public void speak()
  {
    System.out.println("mow");
  }

}
```
Lets then assume a child class called tiger is created.
```java
public class tiger extends feline
{

  [...]

  public void speak()
  {
    System.out.println("rawr");
  }

}
```
Here, the method speak() is overridden to output something different than the parent method, all while still using the same method name.

Also, the parent classes varibles cannot be accessed unless there is a getter for the variable. In this case, you would use ``super.getWhateverVariable()``.

The edhesive lesson also gave a good example using quadrilaterals on overloading and accessing private parent class variables.
## 9.3 Is-a and Has-a Relationships
This lesson focuses deeper on is-a relationships, and gives representations of class hierarchies.

An example of heirarchy would be a class called Product that divides into more specific products. A child class can also have child classes.
```java
public class Product

public class Electronics extends Product
public class Media extends Product
public class Clothing extends Product

public class Women extends Clothing
public class Men extends Clothing
```
The hierarchy utilizes encapsulation, a term we will need to know that refers to encapsulating the common attributes and behaviors of all the classes into one large super class.

Here are examples of ways to initialize an object using heirarchy.
```Clothing a = new Women()``` & ```Product b = new Electronics()``` : These are two valid ways of creating because women is subclass of clothing and electronics is a subclass of product. Variable a will be a women object and variable b will be an electronics object.

```Product c = new Women()```:  this is also valid because while women is not a direct subclass of product, it is a subclass of clothing which is a subclass of product which functions.

```Women d = new Clothing()```:  The variable d is declared as a women object, meaning that java is expecting to see the methods and attributes required in the women class.

```Media e = new Men()```: This will cause an error because the two subclasses are not directly related. While media comes from product, the men subclass comes from clothing, and it cannot simply go up to product and then back down to media.

Study the patterns above and click [**here**](https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html) for some extra help on this and all of unit 9 becasuse this stuff is tough. Alos a look at the review questions and the test can help in understanding the type of questions we may get in relation to this.

Finally, another note on the **super** keyword. IT is vital to remember that within child classes, whether it is written or not, the constructor will call a ``super();`` before anything else, meaning that it calls the parent class constructor with a blank signature regardless.

Also, another keyword to know is ```polymorphism``` which refers to the parent-child class system. Poly refers to many child classes while morphism refers to parent classes taking on the form of their child class.


## Unit 9: Inheritance
### Lesson 2:  Inheritance Overriding Methods
**What is Overriding**
Overriding is similar to something similar we learned before, Overloading. 
* Overloading is when there are two methods with the same name in a class. 
* Overriding is when the parent class and child class have a method with the same name except the parents method is extended by the childs method.

## **Example**
### **Main Class**
```java
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int j;

    Scanner scan = new Scanner(System.in);
    Cookie cook = new Cookie();
    System.out.print(cook);

    System.out.println("What kind of cookie is it? Please type the number. \n1.Chocolate Chip \n2.Sugar Cookie \n3.Oatmeal Raisin \n4.Get Cookie \n");
    j=scan.nextInt();

    
    
    if(j == 1){
      ChocoChip Choco = new ChocoChip();
      System.out.println(Choco);
    }
    
    else if(j == 2){
      Sugar sug = new Sugar();
      System.out.println(sug);
    }

    else if(j == 3){
      OatRai OatmealRaisin = new OatRai();
      System.out.println(OatmealRaisin);
      System.out.print(OatmealRaisin.getCookie());
    }

    else if(j == 4){
      System.out.println(cook.getCookie());
    }

    else{
      System.out.println("Invalid Answer. Please try again later");
    }
  }
}
```

### _*Parent Class*_
```java
public class Cookie
{

 public Cookie()
 {
   System.out.println("You have a cookie, no clue what flavor though :(");
 }

 public Cookie(String s)
 {
   System.out.println("You have a " + s + " cookie, Congrats!!");
 }

 public String getCookie()
 {
   return ("no clue");
 }
}
```

### _*Child Class*_
```java
public class OatRai extends Cookie
{
  public OatRai()
  {
  super("Oatmeal Raisin");
  }

  public String getCookie()
  {
     return (super.getCookie() + " why you chose Oatmeal Raisin though");
  }
}


```
## Break Down
Both the parent and child class conatin the _getCookie_ method. The one located in the child class adds onto the already existing one in the parent class.


## Lesson 3: Is-A Has-A Relationships
- A parent class can have multiple children classes but a child class can't have multiple parent classes.
#### **Encapsulation**
- Let's assume you have a parent class of Plants with two children classes of Trees and Flowers.
  - Flowers has three subclasses of Roses, Tulips, and Daisies.
  ```java
  public class Plants

  public class Trees extends Plants
  public class Flowers extends Plants

  public class Roses extends Flowers
  public class Tulips extends Flowers
  public class Daisies extends Flowers
  ```
- A parent class can take on the shape of any of its child classes.
- Examples

```java
Roses a = new Flowers();
```
- Since we have declared a as a variable of the Roses type, Java expects to see all methods and attributes required for a Roses object in the object instantiated. This will not be true for a Flowers object.

```java
Plants b = new Trees();
```
- While the classes on either side are different, because Trees is a subclass of Plants, this statement will not cause an error. A Trees object has every attribute and method which a Plants object has, so we can use one in place of a Plants object in our code. The result will be that the variable b will contain a Plants object.
### Implicit "Super"
##### **Only applies to constructors**

- When you have a parent class and child class, the super() method is always implied.
#### Look at the example below.
```java
public class Flowers extends Plants
{
  public Flowers()
  {
    System.out.print("Hello");
  }
}

public class Roses extends Plants
{
  public Roses()
  {
    System.out.print("Goodbye");
  }
}
```
```java
public class Roses extends Plants
{
  public Roses()
  {
    super();
    System.out.print("Goodbye");
  }
}
```
**the Roses class is the same for both methods**