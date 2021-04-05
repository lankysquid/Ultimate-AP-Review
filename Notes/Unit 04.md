# Unit 4: Interation
## 4.1 - While Loops
One of the first iterations we went over in class was the while loop. While loops allow blocks of code to be repeated as long as the condition is met.

There are two components that while loops possess: the condition, and the code to execute as long as the condition is true. Because it is a while loop and not a for loop, the code block will continue to be executed as long as the condition is held true.
```java
while (condition)
{
  (code to be repeated)
}
```
In the following code, the int x will start from 10, have itself printed on a new line, and then have 1 subtracted from it. This process will repeat until x is equal to 0, because of the condition.
```java
//Countdown from 10 to 1
int x = 10;
while (x > 0){
  System.out.println(x);
  x--;
}
```
This code will print a countdown starting from 10 and ending at 1. If we wanted to let it count down to 0, then the condition inside the parentheses of the while loop has to include a >= instead of > since the while loop will stop running once x hits 0, since 0 is not greater than 0.
```java
//Countdown from 10 to 0
int x = 10;
while (x >= 0){
  System.out.println(x);
  x--;
}
```
There must be a change in the counter variable, or else the while loop will repeat infinitely.
```java
//This will print an infinite amount of 10's on separate lines since the variable x will always be greater than 0.
int x = 10;
while (x > 0){
  System.out.println(x);
  //There is no change to the counter variable.
}
```
### Here are a couple links for videos about while loops:
[**Mr. Webster's video**](https://www.youtube.com/watch?v=7yTi5q_M-GI)
[**Alex Lee's video**](https://www.youtube.com/watch?v=SGJ9DpxGCkY)
## 4.2 - Algorithms for Numbers
Algorithms must have operations that can be done by a computer, produce a result, and stop in a finite amount of time.  This lesson gives some examples of algorithms that tell us information about numbers, many of which use while loops.
### Algorithms Without Loops
The simplest algorithms don't require any loops at all. For example, to tell if a number is evenly divisible by another we can simply check if the first number modulus the second is 0 or not:
```java
int b = scan.nextInt();
int a = scan.nextInt();
if (a % b == 0) 
{
  System.out.println("b divides a");
}
```
### Algorithms With Loops
Suppose we wanted to check how many numbers a user entered satisfy a condition which would be every number under 10. We just need to use a count variable and increase this whenever the condition is met.
```java
int count = 0;
int num = 0;
while (num != -1) 
{
  System.out.println("enter a positive int, or -1 to stop");
  num = scan.nextInt();
  if (num < 10) 
  {
    count++;
  }
}

count--; // Subtract 1 as we don't want to count the input of "-1"
System.out.println("There are " + count + " numbers are less than 10");
```
### Using Flag Variables
A useful tool to making Algorthims with loops and making conditions are Flag variables, which are variables that are used to indicate whether something has or has not yet happened. At the beginning of the program we initialize flag variables to a false value, or 0, to indicate that the event we are looking for has not occurred.
```java
int flag = 0;
Then, in the program--perhaps in a loop--
we have an if statement that checks if the event we are looking for has happened,
and if it has, we change the flag variable to a true value, or 1.

if (x == targetNum) 
{
  flag = 1;
}
Then, at the end of the program, after the other commands, 
we can use if statements to check the value of the flag variable and report back:

if (flag == 0) 
{
  System.out.println("target not found");
} 
else 
{
  System.out.println("target found");
}
```
## 4.3 - For Loops
Just like the while loop, the for loop is another way to iterate. The difference between a for loop and a while loops is that a for loop has a deidcated *loop control variable* (typically i, but you can use any variable name), which acts as a counting variable. There are **three** components of a for loops header:
* **Initializer**
  * The initializer is the starting value of the loop's run.
  `i = 0`
* **Boolean Statement**
  * The boolean statement, like a while loop, tells the loops when to stop. It is checked before every iteration, causing the loops to exit once it is false.
  `i < name.length()`
* **Counter Variable**
  * The counter variable tells the loops what to count by. It changes the value of the initalizer after every iteration.
  `i++`

```java
//This code will print out the letters of the string on separate lines.
String name = "Webster";
for (int i = 0; i < name.length(); i++){
  System.out.println(name.substring(i, i + 1));
}
```
### Here are a couple links to videos about for loops:
[**Mr. Webster's video**](https://www.youtube.com/watch?v=Pm9-GmegKkI&t=5s)
[**Alex Lee's video**](https://www.youtube.com/watch?v=3jMaKlNBjug)

## 4.4 - Algorithms for Strings
Much like how there are algorithms for numbers, there are also many algorithms for altering Strings. Similarly, they have many uses and are done with loops.

***
### Traversing Strings
Going through each character of a String is know as **iteration**. Iterating through a String can easily be done with a for loop.
```java
String FunFact = "Mr. Webster hates Elon Musk";

//Prints each character of String FunFact one letter at a time on the same line
for (int i = 0; i < FunFact.length(); i++)
{
  System.out.print(FunFact.substring(i, i + 1));
}
```
> Input: **Mr. Webster hates Elon Musk**
> Output: **Mr. Webster hates Elon Musk**

***
### Counting Substrings
Just like the example above, the same loop can be used for checking groups or individual characters one by one. Here, we check how many times the letter`"w"` occurs in the String represented by the int variable `Count`.
```java
String Web = "Webster walks west while we wait";
int Count = 0;

for (int i = 0; i < Web.length(); i++) 
{
  if (Web.substring(i, i + 1).equals("w")) 
  {
    //Adds 1 for every "w" in String Web
    Count++;
  }
}
```
>Input: **Webster walks west while we wait**
>Output: **5**

***
### Removing Substrings
Using the same logic as the previous algorithm, you can check the String for letters that you would like to remove. In this case, we are removing `"p"` from the String.
```java
String Animal = "Hippopotamus";
String NewAnimal = "";

for (int i = 0; i < Animal.length(); i++) 
{
  //Removes all characters that are equal to "p" from String Animal
  if (!Animal.substring(i, i + 1).equals("p")) 
  {
    NewAnimal += Animal.substring(i, i + 1);
  }
}
Animal = NewAnimal;
```
>Input: **Hippopotamus**
>Output: **Hiootamus**

***
### Concatenating Strings
**Concatenation** is when Strings are added to each other. The example below represents this by removing the first letter of a String and adding it to the end. The output of this algorithm is a reversed String.
```java
String Name = "The turn tables";
String Flipped = "";

//Adds letters one by one to String Flipped from the last to first letters of String Name
for (int i = Name.length(); i > 0; i--) 
{
  Flipped += Name.substring(i - 1, i);
}
```
>Input: **The turn tables**
>Output: **selbat nrut ehT**

***
### Staying Inbounds
In order to avoid errors with substrings that are *out of bounds*, we can use **modulus** in order to safely stay inside the String. For this example, the first half of a String is moved to the end. In order to prevent the index from being *out of bounds*, modulus makes it so that the remainder is used when the index becomes larger than the length of the String.
```java
String Split = "Webster";
for (int i = 0; i < Split.length(); i++) 
{
  //Prints a String where the first half is moved to the end
  int Index = (i + Split.length()/2) % Split.length();
  System.out.print(Split.substring(Index , Index+1));
}
```
>Input: **Webster**
>Output: **sterWeb**

***
[**Mr. Webster's Lesson on String Algorithms**](https://www.youtube.com/watch?v=_NQJEnwv_Dw)

***
## 4.5 - Nested Loops
### Here is a video on nested loops:
[**Alex Lee's video on nested loops**](https://www.youtube.com/watch?v=7yTi5q_M-GI)
#### Nested iteration statements

```java

String bob = "fun";
// Outer Loop
for (int a = 0; a < fun.length(); a++)
{
  //Inner Loop
 for (int b = 0; b < fun.length; b++)
 {
   System.out.print(bob.substring(a, a + 1));
 }
}
```
The outer loop checks for the length of the string and keep moving on to the next letter until there is none left, while the inner loop will repeat the letter up to the number of how long the string is. In this case, it is 3. The two loops are working together in order to print the desired result.

## 4.6 - Algorithm Efficiency
The more efficient the code is, the faster it will run. Efficiency is based on resources and speed. A way to compare the efficiency between codes is to count the executions.
```java
String name = "Webster";
int count = 0;
ArrayList<String> list = new ArrayList<String>();
for (int i = 0; i < name.length(); i++)){
  count++;
  list.add(i)
}
for (int i = 0; i < list.size(); i++){
  count++;
  System.out.println(i);
}
System.out.println(count);
```
```java
String name = "Webster";
int count = 0;
for (int i = 0; i < name.length(); i++){
  count++;
  System.out.println(i);
}
System.out.println(count);
```
The two blocks of code above essentially do the same thing; they print out each individual letter of the string on a new line. However, the first block of code is a complicated way of doing it, and the second block of code is a simpler way of doing it with less lines of code and a lower count.