# **Unit 6:**
**L1: One-Dimensional Arrays:**
Arrays are a way to store information of multiple variables without writing them individually. Arrays  are class data types. Arrays can hold any kind of data, including primitive types like ints, other class data types like Strings, or even more arrays.
```java
  int[] list = new int[7]; // an array of 7 elements
```
Each item in the array is called an "element" and each element is loocated at a particular index. The indicies for an array start at 0, not at 1.
  ```java
  int[] arr1 = [3, 5, 7]; //the number "3" is at index 0
  ```
  
**L2: Algorithms - Searching:**
Sometimes, it is necessary to search for a specific element in a given array. To do this, we must iterate through the array using a for loop and create a flag variable to give us the position of the desired element--if it exists. 
```java
int index = -1;
int target = 42; // the number we are searching for
int[] arr = {0, 3, -7, 42, 1102};
// square brackets may also be placed after the array's name
for (int i = 0; i < arr.length; i++) {
	if (arr[i] == target) {
		index = i;
	}
}
// This code may be adapted for other data types by 
// substituting == for .equals().
```
The variable `index` will retain the value `-1` if the target number is not found. Otherwise, the target itself may be accessed with `arr[i]`. In this case, `index == 3`.
Make sure that the second statement in the for loop keeps `i` below the length of the array; otherwise, an `ArrayIndexOutOfBoundsException` will be thrown at runtime.

We can also count the number of occurrences of a specific value in a similar way. Replace `index` with a counter variable starting at zero. Then, increment for each element in the array that matches the target.
```java
int counter = 0;
int target = 12; // the number we are searching for
int[] arr = {0, 12, -7, 42, 1102, 12};
// square brackets may also be placed after the array's name
for (int i = 0; i < arr.length; i++) {
	if (arr[i] == target) {
		counter++;
	}
}
// This code may be adapted for other data types by 
// substituting == for .equals().
```

Finally, it is possible to check whether all elements in an array match a certain condition. First, declare a boolean-type flag variable as `true`. Next iterate through the array as usual, but if any element does **not** satisfy said condition, set the flag to false and break out of the loop. At the end of this process, `flag` will be true if all elements in the array satisfy the condition.
```java
boolean flag = true;
int[] arr = {0, 12, -7, 42, 1102, 12};
// square brackets may also be placed after the array's name
for (int i = 0; i < arr.length; i++) {
	if (!(arr[i] > 0)) { // stopping condition
		flag = false;
		break;
	}
}
```
**L3: Arrays of Strings:**
Arrays in Java may hold primitive data types (`int`, `boolean`, etc.) as seen above. They may also hold class data types such as `String` and other user-defined types.

**Initialization**
```java
String[] words = new String[4];
```
Right now, `words` holds four `null` objects. We must set values for each word to store any information.
```java
words[0] = "my";
// String arrays can also be initialized using 
// curly-bracket {} notation.
```
Alternatively, we can use `Scanner` as described above and iterate through the array to add user-defined words.

**String Methods**
To work with the values stored within a String array, we must call them using the array's name and index; in this case, that would be `words[0]` to access "my" or `words[i]` to get each value within a for loop. After accessing the String, known String methods (`substring`, `compareTo`, `toLowerCase`, etc.) may be called freely.
```java
String[] words = {"my", "hovercraft", "was", "ruined", "by",
"sinusoidal", "depleneration"};
String firstLetters = "";
for (int i = 0; i < words.length; i++) {
	firstLetters += words[i].substring(0, 1);
}
System.out.println(firstLetters);
// >> mhwdbsd
```
Note that when calling a method with a `String[]` argument, changes to the Strings within the array are permanent.

**L4: Algorithms on Arrays:**
Arrays, being significantly less dynamic than their successors, ArrayLists, require certain algorithms in order to solve problems that may arrise.

**Insertion**
When handling arrays, there is no method to insert a specific value into the middle without overwriting the initial value in that index.
```java
int[] list = {1, 2, 3, 4, 5};
list[2] = 10;
```
This would make the list become {1, 2, 10, 4, 5}. Instead you must first shift the values to the right, then overwrite the extra value on the duplicated index:
```java
for (int i = list.length - 1; i > 2; i--)
{
  list[i] = list[i - 1];
}
```
Finally, you can overwright the index that you want to insert the value onto, in this case, the value 3 at index 2. Arrays are not able to expand or shorten, so this will result in the last value being removed during the shift.

**Deletion**
Other popular algorithms used on arrays include the deletion of values. Similar to insertion, there is no method for deletion by default.
```java
int[] list = {1, 2, 3, 4, 5};
list[2] = null;
```
This line is important in the algorithm, but you can't only do this, as it will leave a hole in the middle of the array. Due to the array now being {1, 2, `null`, 4, 5}, you must shift the values to the left.
```java
for (int i = 2; i < list.length - 1; i++)
{
  list[i] = list[i + 1];
}
```
This will result in the array being {1, 2, 4, 5, 5}. What you do with the extra value, in this case 5, at the end is completely up to you, it depends greatly on the situation.

**L5: The For-Each Loop:**
The for-each loop, also known as the enhanced for loop, is an alternative way to use the for loop, which is much more convenient for traversing arrays. The format of a for-each loop is as such:
```java
for (int x : list)
{
  System.out.println(x + " ");
}
```
This specific segment will print out each value from the array `list`, `int x` being similar to your average `int i = 0` in a normal for loop. This format forks for all data types, as instead of `int x` you can also put `double x`, or any type you need to.

A for-each loop can be used for many things, one being to get the sum of an array's elements:
```java
public static int sum (int[] list)
{
  int sum = 0;
  for (int x : list)
  {
    sum += x;
  }
  return sum;
}
```

**Limitations**
There are a few limitations to the for-each loop, so this does mean that standard for loops are still pretty commonly used. For example, in this segment, the loop is meant to subtract 1 from each value.
```java
int[] list = {1, 2, 3, 4, 5};
for (int x : list)
{
  x++;
}
```
However, when printing the array `list`, the values will still print as {1, 2, 3, 4, 5} instead of {0, 1, 2, 3, 4}. The contents of the array will not be modified, as a for-each loop is using a copy of the original array. Any changes made to an array in a for-each loop is only going to affect that copy.
## Unit 6
#### One-Dimensional Arrays 
* Used to store large amounts of information without needing to set up various Variables
* Arrays are objects, meaning they are a class data type; can hold any type of data
```java
  int [] declareNewList = new int [18];
```
  * The code above demonstrates a simple integer array declaration that will store 18 elements

* Array Indices v. Elements
  * Indices are the place holder to which every element is stored at, the first index is 0, followed by 1, 2, 3, etc. 
  * Elments are the actual data being stored at each index
```java 
int[] list = {-1, 7, 2, 0, 3, 14, 8};
//Arrays use "[]" brackets
```
* Here we declared a new list, with our own values which are the elements and they are being stored in indices 0-6. Ex. number 3 is an element stored at index 4
#### Algorithm-Searching
* An algorithm is a general set of isntructions which can be executed by a computer to return an finite amount of time
* If we want to iterate through all the characters in an array, we are traversing a string 
```java
int[] list = {-1, 7, 2, 0, 3, 14, 8};
int pos =  0;
for (int i = 0; i < list.length; i++)
{
  if(list[i] == 3)
  {
    pos = i;
    break;
  }
}
System.out.println(pos);
```
* In the code above, a list is created with 7 elements, and a "pos" variable. Our pos variable will store the index number at which the element we are looking for is located at. Once the == operator is true, pos will store the index of the value and the code will "break". In other words, the program will be kicked from the code, and the next line will run: the index stored will be printed.  
* Notice the second parameter is ***list.length***. We ***MUST*** use .length to avoid a out of bounce error.

#### Arrays of Strings
* Arrays can hold class data types, such as String
```java
String[] internships = new String [10];
//Delcaration of a String class type array
internships[0] = "NASA";
//Index 0, stores an internship at NASA
```
* Although index 0 already has a declared value, the other values in our internships array, will have printed out a null value. 
* We can use a loop to have the user input data into the index as shown in the code below
```java
for (int x = 0; x < internships.length; i++)
{
  System.out.println("Enter a new internship opportunity");
  internships[x] = scan.nextLine();
}
```
* If we know the methods to certain objects, we can access the methods in an array and use them to do functions such as grabbing the last value of an array. 
```java
for (int i = 0; i < internships.length; i++)
{
  String firstLetter = internships[i].substring(0, 1);
  String lastLetter = internships[i].substring(internships[i].length() - 1);
  System.out.print(firstLetter + lastLetter);
}
```
* The code above demonstrates how we can use objects methods to manipulate and help us use code. If we were to pass the word "Kanawut", than the vairable firstLetter would store "K", and variable lastLetter would store "t". Finally, both K and t would print : Kt.  
#### Algorithm on Arrays
* Algoritms can be used on arrays to solve certain prblems.
* Insertion is used when wanting to insert a value into the middle of an array.
```java
int[] list = {-1, 7, 2, 0, 3, 14, 8};
for (int i = list.length - 1; i > 5; i--)
{
  list[i] = list[i - 1];
}
```
* In the code above, the loop works backwards and stops at the point where we want to insert a value, in this example its at index 5. The loop changes the list and the array's values become -1, 7, 2, 0, 3, 14, 14. Now that we have two values of 14, we can insert a value by replacing the value on index 5. This loop gets rid of the last value in this list.
* Deletion is used when removing a value from the middle of an array.
```java
int[] list = {-1, 7, 2, 0, 3, 14, 8};
for (int i = 4; i < list.length - 1; i++)
{
  list[i] = list[i + 1];
}
```
In the example above, the loop gets rid of the value located at index 3 and shifts everything after index 3 to the left. This turns the array's values to -1, 7, 2, 0, 14, 8, 8. The loop was able to delete the value at index 4, but it also added an extra value of 8 at the end of the array.
*  Shifting elements in an array can also be done with algorithms.
```java
int x = list[0];
for (int i = 0; i < list.length - 1; i++)
{
  list[i] = list[i + 1];
}
list[list.length - 1] = x;
```
* The code above shifts all elemtnts to the left and the first element is moved to the end.
```java
int x = list[list.length - 1];
for(int i = list.length -1; i > 0; i--)
{
  list[i] = list[i - 1];
}
list[0] = x;
```
* The code above is an algorithm that shifts all elements to the right.
#### The For-each loop
* The for-each loop is another way for traversing standard arrays. It is used because it doesn't require stressing over declaring a new int and comparing it to the length of the array.
```java
for (int i : arr) 
{
  System.out.println(i + " ");
}
```
* The example above is basically saying to print the contents of an array named arr for each item "i" of datatype int in the array.
* Unlike for loops which perorm an action a certain number of times, for-each loops perform an action for every item in the list. 