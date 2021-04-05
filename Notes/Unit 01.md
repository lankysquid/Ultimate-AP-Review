### Unit 1
---
**Unit 1 Lesson 1: Output in Java**
* **Command**: A direction that tells a computer what to direction (also known as instructions)
* **Complie**: The program checks for errors
* **Debugging**: The program identify and eliminate errors
* **Strings**: Words, characters, digits, and symbols that are not used for numerical calculations and it is inside `" "`.
**Command Exs**:
* `System.out.print();`
* `System.out.println();`

Example:
```java
System.out.println("Hi");
System.out.print("Mr. Webster");
> Hi
> Mr. Webster
```
---

**Unit 1 Lesson 2: User Input and Variables**
* **Scanner**: Allows programmers to take user input & incorporate it into our programmers.
  * Ex: `Scanner scan = new Scanner(System.in);`
* **Input**: Pulls the info into the computer. You need to have a spot in memory to hold this value.
* **Variable**: A name for a spot in the computer's memory. It can change while the programs run.
* **Declare**: To create a variable in memory.
* **Initialize**: To put the value in the container, we initialize it to a variable.
**The Don'ts**
* **DO NOT** put spaces or other characters (Use letter, number. and special characters).
* **DO NOT** start a variable with a number.
* **DO NOT** use names that already have a meaning in Java.

* The = sign is the assignment operator.
* **Concatenation**: glue String variables and literal Strings together using the '`+`' sign.

Ex: 
```java
int x = "three";
int y = "twenty";
System.out.print(x + y);

> threetweenty
```

**To add comments:**
* Use `//` marks everything from the beginning and the end of the line as a comment.
* Use `/*` and `*/` to make a comment block. It let us write comments in the middle and multi-line comments.

Ex:
```java
//This is a comment!

/*
  This is also a comment!
*/
```
---

**Unit 1 Lesson 3: Data Types**
* **Domain**: What possible values can we store?
* **Functions**: What operations can we do with this data?

**Primitive Data Types**
* **Int**: Stores integers and it smaller than a double in memory.
  * Ex: `int x = 10;`
* **Double**: Stores doubles.
  * Ex: `double x = 19.70;`
* **Boolean**: Holds true or false.
  * Ex: `boolean x = false;`

**Reference Data Types**
* References are variables that hold a reference in memory location and it takes a lot of space because it store each character separately.
* To make a number input, use commands:
  * `Scanner scan = new Scanner(System.in);`
  * `scan.nextLine();`
  * `int x = scan.nextInt();`
  * `double x = scan.nextDouble();`

* We can use Integer.MAX_VALUE or Integer.MIN_VALUE to access the largest and the smallest int values.
* The word **final** can be add into a variable declaration/initialization statement to not permanently change the value.
  * Ex: `final double pi = 3.14159265;`
---
**Unit 1 Lesson 4: Number Calculations**
** Arithmetic Operators**
* Addition: `+`
* Subtraction: `-`
* Multiply: `*`
* Division: `/`

1st Example
```java
int x = 4;
int y = 3;
System.out.print(x/y);
> 1
```
This example truncates off the numbers after the decimal point when using integer division.
2nd Example
```java
int x = 4;
int y = 3;
double z = x/y;
System.out.print(z);
> 1.0
```
This example is integer division. If you divided 2 ints and make it  a double, then it would be 1.0. 
```java
int x = 4;
int y = 3;
double z = x/y;
System.out.print(z);
> 1.33333333333334
```
If you divided a double and a int, then it would be 1.33333333333334.

**Compound Assignment Operators**
* `+=`

Ex:
```java
int x = 7;
x += 4;
> 11
```
* `-=`

Ex:
```java
int x = 7;
x -= 7
> 0
```
* `*=`

Ex:
```java
int x = 7;
x *= 7;
> 49
```
* `/=`

Ex:
```java
int x = 49;
x /= 7;
> 7
```
**Unary Operations**
* `x++` means `x = x + 1`

Ex:
```java
int x = 10;
x++;
> 11
```
* `x--` means `x = x - 1`

Ex:
```java
int x = 10;
x--;
> 9
```
---
**Unit 1 Lesson 5: Modular Division**
* `%` operator takes the remainder.

Ex: 
```java
int x = 11;
int y = 4;
System.out.print(x%y);
> 3
```
* The `%=` is called the compound modulus operator.

Ex:
```java
x %= y;
System.out.print(x);
> 3
```



---
**Unit 1 Lesson 6: Numeric Casts**
* **Casting**: the process of converting 1 data type to another.
* **Widening conversion**: Moves a data type to a bigger box.
  * Ex: 
  ```java
  double y = (double) 9/2;
  > 4.5
  ```
* **Narrowing conversion**: Moves a data type to a smaller box.
  * Ex: 
  ```java
  int y = (int) 3.5;
  > 3
  ```
 * **Truncation**: Chops off the stuff behind the decimal point and throws it away. 

 # Unit 1
**L1: Output in Java:**
In this lesson you learn about strings, which are anything that isn't number calculations and can contain any kind of symbol, including special letters, numbers, and characters. We indicate to Java that something is a String by putting it in double quotes. There are two types one being System.out.print and System.out.println.

Example of Strings 
1) 
public static void main (String str[]) throws IOException {

    System.out.println("Hello World");
}

**L2: User Input and Variables:**
Scanner allows us to take user input and incorporate it into our programs.
Variables are containers in memory, and when we declare a variable we tell a computer to allocate some space in its memory
In addition we are able to change a variable so it contains a different value, and to intilize or change it we use the assignment operator which is also the equals sign.

Examples of Scanners and Variables
1) 
public static void main (String str[]) throws IOException {
    
    Scanner scan = new Scanner(System.in);
    String ic;
    
    System.out.println("What is your favorite ice cream flavor");
    ic = scan.nextLine();
    System.out.println("The ice cream flavor of " + ic + "can be found in many grocery stores");
}

**L3: Data Types:**
Within java there are two types of data types primitive and reference. Primitive data types hold real values while the  reference data types stores handle to an object in the memory. Primitive data types include ints which hold integer values, doubles which hold a decimal value, and boolean which holds a true or false value.

Examples of Primitive and Reference data types 
1)
 public static void main(String[] args) {
      
    Scanner scan = new Scanner(System.in);
    System.out.println("Insert a integer number");
    int numberOne = scan.nextDouble(); 
    System.out.println("Insert a decimal number");
    double numberTwo = scan.nextDouble();

    System.out.println(" Sum of these numbers are: " + numberSum);
    double numberSum = numberOne + numberTwo;
    
  }

**L4: Number Calculations:**
In Java we can use + for addition, and - for subtraction, but we use * for multiplication and / for division. We can use = as an assignment operator when we want to either set a variable to a number, or do a calculation that sets a variable to the result. (Java also follows the order of operations(PEMDAS), that we know from our math classes.)

Examples of Integer Division:
1)
```java
int x = 7;
int y = 2; 
System.out.println(x/y);
```
In this first example, we divide 7 by 2. 7 divided by 2 is 3.5, but since this is integer division, it only looks at the integer, so the number 3, would be the output. 

2)
```java
int x = 7;
int y = 2;
double z = x/y;
System.out.println(z);
```
In this second example, we created a double variable z, to hold the value of 7 divided by 2. 7 divided by 2 is still 3 because of integer division, but since z is a double, 3.0 would be the output, this time. 

3)
```java
int x = 7;
int y = 2;
double z = 1.0*x/y;
System.out.println(z);
```
In this this example, we multiply the operation by 1.0 first, a double, which would make x and y doubles, resulting in the answer to be the exact double, with the output of 3.5. 

Because dividing by 0, such as 10/0, is not possible, dividing by 0 in Java would result in an error to occur when executing code.  

Examples of Compound Assignment Operators: 

1)
```java
int x = 5;
x++;
x--;
```
In this first example, x++ adds 1 to 5, making x 6, then x-- subtracts 1 from 6,  with x back to 5. 

2)
```java
int x = 5;
x+= 2; 
```
In this second example, x += 2 adds 2 to 5, making it 7. Similarly, x -= 2 would make 5 become 3. This also works for multiplication with * and division with /.


**L5: Modular Division:**
In Java we can use Modular Division, which is also called Remainder Division, for calculations in which we want the remainder of a numerical expression. To do this, we use the % operator. We can make use of Modular Division to determine if numbers are even or odd, or break down time into days, hours, minutes, and seconds. 

1)

```java
int x = 5;
int y = 2;
System.out.println(x % y);
```

In this first case, we have 5%2, which you can think of as similar to 5/2. We know that 5 can be made up of two 2s, to make 4, with a remainder of 1, so 5%2 would give us the value of 1. 

2) 

```java
int x = 6;
int y = 2;
System.out.println(x % y);
```

In this second case, we have 6%2, which you can think of as 6/2. Since 6 can be divided by two without any remainder, we would get the value of 0 returned.

3)

```java
int x = 5;
int y = 2;
x %= y;
System.out.println(x); 
```

In this third case, we can do a calculation similar to the compound assignment operator from lesson 5. We can read the third line above as x = x%y. 5 mod 2 is 1, so x now would have a value of 1.

Special Cases in Modular Division:
The first special case is when you have an expression like 5%10. Since we know that 5 cannot be divided by 10 to get a whole number, when we do a smaller number mod a bigger number, we get the smaller number returned, so in this example, 5 would be the result.

The second special case is when you try to do Modular Division with 0 as the second number, and similar to Lesson 5, an error will occur.

**L6: Numeric Casts:**
1) Casting
In Java when you divide two integers, Java truncates the value and returns it. Truncation is when Java chops off the numbers after the decimal point (not rounding).
To avoid truncation you have to cast your variables.
```java
  int a = 5;
  int b = 2;
  double y = 5/2; //this would return the number 2
  
  double y = (double) 5/2; //this would make the quotient a double value and return 2.5
```
Casting your variables allows you to return values as if they were different data types. You can cast an int to a double or vice versa, but when you go form a larger data type to a smaller one Java just cuts your nunber off.
2) Rounding 
In Java when you cast a double variable as an int, Java doesn't round. Regardless of what's after the decimal place it's turncates it.
If you want to round a number you have to add `0.5` to the beginning of your equation.
(If the number is negative subtract `0.5`)
```java
  double num = 4.7;
  int roundNum = (int) (num + 0.5);
  System.out.println(roundNum);
> 5 //4.7 rounded 
```