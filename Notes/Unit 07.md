## Unit 7 : ArrayList

[Unit 7 : Lesson 1 : ArrayList](https://intro.edhesive.com/courses/46977/pages/unit-7-lesson-1-arraylist?module_item_id=16049501)
### ArrayList
Advantages 
  * Mutable - able to change the size of the array
  * Built in methods - inserting, deleting, and sorting methods

Disadvantages
  * The speed is slower since the ArrayList is able to be changed 
  * Not able to use privitives types 

***ArrayList vs Array***

| Array | ArrayList |
| --- | --- |
| **Fixed** length data structure (not abole to change the length once it is created) | Able to **resize** itself (not a fixed length, change the size anytime) |
| Contains both **primitives** data type and **objects** of a class depending on the definition of the array | Only supports objects like **Strings** and **Wrapper classes** for primitive (Integers and Doubles) |
| Use **asignment operator** to store elements | Java provides **add()** method to insert elements|
| Each array object has the **length variable** which returns the length of the array |  Length of the ArrayList is provided by the **size()** method |
| Use when you know the size is **FIXED** | Use when you **do not** know the size of the elements |

***Declaring ArrayList***
  * Importing the class
    ```java 
    java.util.ArrayList;
    ```
  
    ```java
    java.util.*;
    ```
  * Creating a new ArrayList object
    ```java
    ArrayList < Data Type > name = new ArrayList < Data Type > (parameters);
    ```
    * Example : 
      ```java
      ArrayList < Strings > cat = new ArrayList < Strings> ();
      ```
        * This ArrayList is storing different cat breeds by using the data type of Strings. 
        * No parameters are needed since ArrayList are re-sizeable
  * ArrayList **ONLY HOLDS** objects or wrapping classes
    * Integer for ints
    * Double for double
    * Strings 

***ArrayList Methods***
  * Using the example from above to show the methods used in ArrayLists
    * **.size()** - Returns the number of elements in the ArrayList
    ```java 
    cat.size();
    ```
    * **.add(cat object)** - To add the object at the end of the ArrayList
    ```java
    cat.add("tabby");
  
    ```
    * **.add(int index, cat object)** - Insert the object at index, shifting current objects to the right (higher index)
    ```java
    cat.add(2,"siberian");
    ```
    * **.set(int index, cat object)** - Replaces the item at index with the object
    ```java
    cat.set(1, "savannah");
    ```
    * **.get(int index)** - Returns the item in the ArrayList at the index
    ```java
    cat.get(1);
    ```
    * **remove(int index)** - Removes the item at the index and shifts ramining items to the left (lower index)
    ```java
    cat.remove(2);
    ```

Full Example of ArrayList Using the Methods
```java
ArrayList <String> cat = new ArrayList <String> ();
cat.add("tabby");
cat.add("russian blue");
cat.add(1, "savannah");
cat.add("persian");
cat.set(3, "bengal");
System.out.println(cat.get(0));
System.out.println(cat);
___________________________________________________________
tabby
[tabby, savannah, russian blue, bengal]
```
  * ArrayList will automatically print out the lists in backets [] since they have a built in .toString() method
    
[Unit 7 : Lesson 2 : Traversing ArrayLists](https://intro.edhesive.com/courses/46977/pages/unit-7-lesson-2-traversing-arraylists?module_item_id=16049511)

### Traversing ArrayLists
Ways to traverse (to go though) ArrayLists
* Using a Standard For - Loop
* Using an Enchanced For - Each Loop
* Using a While - Loop

When deciding on which type of loop to use, it depends on 
* If you re going to add or remove anything in the ArrayList 
  * **Standard For - Loops or While - Loops**
    * So you are able to know where you are in the ArrayList meaning the index
    * When using the add or remove method so it wont skip  any of the index and to start from the end to get  every number or object in the ArrayList
    * For example - Creating an ArrayList for a certain sequence
    ```java
    public ArrayList <Integer> sequences (int e){
      ArrayList <Integer> list = new ArrayList <Integer> ();
        for (int i = 0; i < e; i++){
          list.add(new Integer(e + 3 * i);
        }
      return list;
    } 
    System.out.println(sequences(6));
    ___________________________________________________________
    [6, 9, 12, 15, 18, 21]

* If you are just searching for something in the ArrayList
  * **Enchanced For - Each Loop**
    * For checking or searching in the ArrayList and not changing anything as you will not know where you are (index) in the ArrayList 
    * For example - If you want to add numbers together you can do this :
    ```java
    ArrayList <Integer> total = new ArrayList <Integer> ();
    total.add(56);
    total.add(32);
    total.add(9);
    int sum = 0;
    for (Integer value : total){
      sum += value;
    }
    System.out.println("The total of all the elements: " + sum;
    ___________________________________________________________ 
    The total of all the elements: 97
    ``` 

Using Multipe Traversing for Arraylists
* When you want to see if the difference between two ArrayLists
  * ArrayList Number One
  ```java
  ArrayList <String> schedule = new ArrayList <String> ();
  schedule.add("math");
  schedule.add("history");
  schedule.add("english");
  ```
  * ArrayList Number Two
  ```java
  ArrayList <String> schedule2 = new ArrayList <String> ();
  schedule2.add("science");
  schedule2.add("history");
  schedule2.add("english");
  ```
* Now using a standard for loop to check the difference between the Arraylists
```java
for (int i = 0; i < schedule2.size(); i++){
  if (!schedule2.get(i).equals(schedule.get(i))){
    System.out.println("We found where the schedules are different! \nSchedule 1 contains: " + schedule.get(i) + "\nSchedule 2 contains: " + schedule2.get(i));
  }
}
___________________________________________________________
We found where the schedules are different!
Schedule 1 contains: math
Schedule 2 contains: science
```
  * If the ArrayLists are not the same size, then it will result in an indexOutOfBounds

[Unit 7 : Lesson 3 : Array Algorithms with ArrayLists](https://intro.edhesive.com/courses/46977/pages/unit-7-lesson-3-array-algorithms-with-arraylists?module_item_id=16049525)
  ### Array Algorithms with ArrayLists
* By using the different operators connected with ArrayLists, many algorithms can be made to sort and modify these arrays. 
* The (.add) operator is used to objects to an ArrayList.
  * Example:
  ```java 
ArrayList<String> cars = new ArrayList<String>;
  cars.add(“BMW”);
  cars.add(“Ferrari”);
  cars. add(“Fiat”);
  ```
     When printed, this list will read BMW Ferrari Fiat.
* In order to sort through an ArrayList, the same for and for-each loop methods are commonly used. However, with ArrayLists, the user is able to modify lists in different way.

  * COMMON MISTAKE: Infinite loops are a common issue formed by ArrayLists so including correct bounds and using the corrects operators is ESSENTIAL.   
    * Example:
  ```java
for(int x = 0; x<cars.size(); x++{
    cars.add(0,cars.remove(x));
}
System.out.println(cars);

    
* In the example above, the ArrayList is being sorted and the list of 3 cars is actually being reversed. Thus, the new order would be:
  ```
Fiat Ferrari BMW

[Unit 7 : Lesson 4 : Linear Search](https://intro.edhesive.com/courses/46977/pages/unit-7-lesson-4-linear-search?module_item_id=16049538) 
### Linear search
* A linear search is one type of search method that can be used on any String, ArrayList, Array, and data holding values.
  * A linear search works, literally, works in a line.
    * Checks the values one by one for the target and continues in a loop until the target value is found.
* Example:
```java
String target = bear;
String[] animals = new String[4];
animals[0] = dog;
animals[1] = wombat;
animals[2] = bear;
animals[3] = cat;
for(int x = 0; x<animals.length(); x++){
	if (animals.get(x).equals(target)){
	  return x;
}
}

```
In this example, the array “animals” is being run to find the target word “bear.” The for loop does not find the word bear in the first iteration, so it continues two more times until It reaches “bear” in the linear search and returns the index of bear in the array.



[Unit 7 : Lesson 5 : Selection Sort](https://intro.edhesive.com/courses/46977/pages/unit-7-lesson-5-selection-sort?module_item_id=16049550)

- [Conceptual Video](https://www.loom.com/share/452010587ff7423782d3d85e27e93787)

- [Code Along](https://www.loom.com/share/8090571072204ccab8e332ed32a4e6a9)

- [Analysis of the code] (https://www.loom.com/share/6de32ec3b4b2496299bad22aa647e3da)
  
[Unit 7 : Lesson 6 : Insertion Sort](https://intro.edhesive.com/courses/46977/pages/unit-7-lesson-6-insertion-sort?module_item_id=16049559)

- [Conceptual Video](https://www.loom.com/share/7e41f4a80d7940f68284597d370cce36)
- [Code Along](https://www.loom.com/share/3c69279df094419391bb24c3e014f68d)

[BONUS VIDEO: The difference between Insertion and Selection Sort](https://www.loom.com/share/b7b289ff6eea49b4812247b9d7911510)
 - Remember: insertion sort just goes from left to right, inserting each object into the correct position.  Selection Sort starts with the smallest object, then the second smallest, then the thrid smallest, etc.

### *Tracing the sorting algorithms*
- In the Main.java file you may type in 75 or 76 to trace each algorithm going through an array of your choosing.

Lets track the algorithms going through the following array together as a starter example.

|5|3|2|4|1|
|-|

- Selection Sort
  -


  - First Iteration: The smallest object is the 1 in the final slot so selection sort will swap that into the first slot. After the first iteration of Selection sort the array looks like this:
  
  |1|3|2|4|5|
|-|
  - Second Iteration: the next smallest object is the 2 in the third slot.  Selection Sort will swap this object into the correct position which in this case is the second slot so the 2 and the 3 will swap

  |1|2|3|4|5|
|-|
  - Luckily, the sorting is now done. Sometimes this will happen with selection sort where by random chance you swap certain values into the correct spot. This will not always happen but in our case we got off with more effeciency. The algorithm will still continue iterating through the rest of the array to make sure it's all sorted but no more swaps will occur

- Insertion Sort
  -
- First Iteration: Insertion sort starts with the second elements and inserts it into the correct spot that comes before it.  In this case, because 3 < 5, insertion sort would move the 3 earlier. After one pass the array would look like this:

  |3|5|2|4|1|
|-|
- Second Iteration: Moving over by one to look at the 2 in the third slot in the array.  Because 2 < 5, the 2 will swap with the  5.  Now Insertion sort compares the 2 and the 3. Because 2 < 3, the 2 and the 3 will swap. This leave the array looking like this:

  |2|3|5|4|1|
|-|
- Third Iteration: Moving over again to look at the 4.  Once again you keep moving left until you find the right spot. 4 < 5, so the 4 and the 5 swap. 4 is not less than 3 so we stop there and leave the array looking like this:

  |2|3|4|5|1|
|-|

- Fourth Iteration: Lastly, we look at the 1.  The 1 is the smallest element in the array so we keep swapping it over until we hit the end. The final list after 4 iterations looks like this:

  |1|2|3|4|5|
|-|


- Comparing the sorts
  -

  - Insertion sort will max out at length -1 iterations. It will never need to do more. With insertion sort you know what you're getting.
  - Selection sort has a bit more elements of chance. In our example, Selection sort was twice as fast. But sometimes, you can get unlucky and selection sort can get much slower.

  - Both sorts are easy to code. Insertion sort might be a little bit more difficult, especially if you're working on an array list. However, insertion sort is easier to track so if something goes wrong it's easier to decode.

  - For the AP test you will be required to learn both of these but as far as practical applications go they're both simple and easy so you'll only really need to master one.

[Unit 7 : Lesson 7 : Wider Impacts of Data Collection](https://intro.edhesive.com/courses/46977/pages/unit-7-lesson-7-wider-impacts-of-data-collection?module_item_id=16049569)
Companies and orgnaizations collect their data so they have to have a way to protect their data from hackers.  
* Think about data breach

## Unit 7: **ArrayList**
### Lesson 1: ArrayList
#### **What is an ArrayList?**
- It is a list that can only store class data types or objects.
- Mutable, so we can change it, unlike arrays.
- We can add and remove elements without the loss of data.
- It is a class.
- Has a built in toString only if the objects in the ArrayList also have a toString.
- We have to import it like this:
```java
import java.util.ArrayList;
```
- To create a new ArrayList object, write this:
```java
ArrayList<Object> exampleList = new ArrayList<Object>();
```
- To create an ArrayList with a set number of empty boxes(20 in this case), write this:
```java
ArrayList<Object> exampleList = new ArrayList<Object>(20);
```
#### **Methods**
```java
exampleList.add(element);
```
- This method adds element to the end of exampleList.
```java
exampleList.add(index, element);
```
- This method adds element at index in exampleList.
```java
exampleList.set(index, element);
```
- This method replaces the object at index with element.
```java
exampleList.get(index);
```
- This method returns the object at index.
```java
exampleList.remove(index);
```
- This method removes the object at index and returns it.
```java
exampleList.size();
```
- This method returns the number of objects in exampleList.
```java
ArrayList<String> exampleList = new ArrayList<String>();
exampleList.add("hi"); //adds "hi" to end of exampleList    ["hi"]
exampleList.add("sup"); //adds "sup" to end of exampleList    ["hi","sup"]
exampleList.add(0, "hello"); //adds "hello" at index 0    ["hello","hi", "sup"]
exampleList.set(1, "hey"); //replaces String at index 1 with "hey"    ["hello","hey", "sup"]
System.out.println(exampleList.get(2)); //prints String at index 2    ["hello","hey", "sup"]
System.out.println(exampleList.remove(1)); //removes the String at index 1 and prints it out    ["hello","sup"]
System.out.println(exampleList.size()); //prints the number of Strings in exampleList   ["hello","sup"]

> sup
> hey
> 2
```
#### **Wrapper Classes**
- We can only store class data types in ArrayLists.
- We can use Wrapper Classes instead of primitives because of unboxing and autoboxing.
```java
ArrayList<Integer> exampleList = new ArrayList<Integer>();
exampleList.add(10);
exampleList.add(5);
System.out.println(exampleList.get(0));

> 10
```
#### **Extra Review Material**
[Webster's YouTube Lecture](https://www.youtube.com/watch?v=-qGXrjT4cjM)
[Webster's Replit](https://replit.com/@StefanWebster/ArrayList#Main.java)


### Lesson 2: Traversing ArrayLists
##### For all examples below, assume we will be using this ArrayList of cars.
```java
ArrayList<String> cars = new ArrayList<String>();
cars.add("Ford");
cars.add("Toyota");
cars.add("Honda");
cars.add("Chevrolet");
cars.add("Lexus");
```

- There are two main ways to go through an ArrayList
  - For-loops
  - For-each loops
- For-loops
  - To print out elements of an ArrayList using a for loop, you must ensure that you use the .size() method for your upper bound, and the .get(i) method to retrieve your elements.
    **Be careful not to mix up Array methods and ArrayList methods!**
  - Examples of using a for-loop is down below.
- For-each loops
  - Using a for-each loop for an ArrayList is exactly the same as using it for an Array. There are no changes in methods between the two.
  - The format/example is down below.


- If you were to print out ArrayList cars without cycling through each element, it would be printed in the following format.
```java
System.out.print(cars);

> [Ford, Toyota, Honda, Chevrolet, Lexus]
```
- If we used a For loop it woud print the following
```java
for(int i = 0; i < cars.size(); i++)
{
  System.out.println(cars.get(i));
}

> Ford
> Toyota
> Honda
> Chevrolet
> Lexus
```
**/or/**
```java
for(int i = 0; i < cars.size(); i++)
{
  System.out.print(cars.get(i) + " ");
}

> Ford Toyota Honda Chevrolet Lexus
```
- A for-each loop...
```java
for( String a: cars)
{
  System.out.println(a);
}

> Ford
> Toyota
> Honda
> Chevrolet
> Lexus
```


- When traversing forward through an ArrayList, both loops will compile correctly and print each element; however, if you wish to remove each element of an arraylist, you must take a different approach.

#### Let's see what would happen if we tried removing each element while traversing forward through the cars ArrayList.
```java
for(int i = 0; i < cars.size(); i++)
{
  cars.remove(i);
}
System.out.print(cars);
```
##### It removes the first element of cars (Ford), then shifts each element to the left, meaning the elemet at index 0 is now Toyota.
```java
for(int i = 0; i < cars.size(); i++)
{
  cars.remove(i);
}
System.out.print(cars);

> [Toyota, Chevrolet]
```
##### In order to remove all elemnts correctly, you must traverse backwards through the ArrayList.
```java
for(int i = cars.size()-1; i >= 0; i--)
{
  cars.remove(i);
}
```
##### This code will now properly compile and remove each element of the ArrayList.


## Lesson 3: Array Algorithms with ArrayLists
- This lesson shows how array algorithms can be adapted for use with ArrayLists.
- Anything we can do with an Array we can also do with an ArrayList. 
- In this lesson, we demonstrate  algorithms to implement using an ArrayList.
- To demonstrate our algorithms we first create an ArrayList of fruit Strings to work with.
#### ***Lets try this out on a ArrayList***
```java 
System.out.println();
    System.out.println("Example 1 for U7L3");
    ArrayList<String> fruit = new ArrayList<String>();
    fruit.add("Apple"); //adds "Apple" to end of fruit ["Apple"]
    fruit.add("Orange"); //adds "Orange" to end of fruit ["Apple", "Orange"]
    fruit.add("Berry"); //adds "Berry" to end of fruit ["Apple", "Orange", "Berry"]
    fruit.add("Watermelon"); //adds "Watermelon" to end of fruit ["Apple", "Orange", "Berry", "Watermelon"]
    fruit.add("Mango"); //adds "Mango" to end of fruit ["Apple", "Orange", "Berry", "Watermelon", "Mango"]
    System.out.println(fruit);
    //Print out fruit name that have 5 letters
    for(String item : fruit){
   if (item.length()== 5) {
     System.out.println(item);
   }
   }
```

## Lesson 4: Linear Search
- A linear search can apply to any set of values
### ***How a linear search works***
- Start at the beginning set of a data.
- Is the value you got what you were searching for?
- If yes then you stop.
- If no then you keep going until you get the value, or reach the end of the set.
#### ***Lets try this out on a Arraylist***
```java
//Example 1 for U7L4
    System.out.println("\nExample 1 for U7L4");
    String search = "Mango";// String searches for Mango
    System.out.println(fruit);
    for (int i = 0;i < fruit.size(); i++){
      if(fruit.get(i).equals(search)) {
      System.out.print("Mango found at index ");
      System.out.println(i);
      }
    }
```






## Lesson 5: Selection Sort
#### **What does a sorting algorithm do?**
- A sorting algortim organizes the elements of an ArrayList in a certain order.
- There are two basic types of sorting algorithms:
  - Selection Sort
  - Insertion Sort
- This section will cover Selection Sort.

#### **Selection Sort: Least to Greatest** 
1. Find the smallest value in the array.
2. Swap it with the current position starting with the first element.
3. Shift the current position over one.
4. Continue until the end of the array or list is reached.

#### ***Let's try this out on an Arraylist***

###### Initialization of ArrayList and printed unsorted values
```java 
ArrayList<Integer> SelectionList = new ArrayList<Integer>();
SelectionList.add(21); 
SelectionList.add(42); 
SelectionList.add(69); 
SelectionList.add(13);
SelectionList.add(37);
System.out.println("Unsorted:"); 
for(Integer selListPrint : SelectionList){
  System.out.print(selListPrint + " ");
}

> Unsorted:
  21 42 69 13 37
```
###### Implementation of Selection Sort algorithm and printed sorted values
```java
for(int ref = 0; ref < SelectionList.size()-1; ref++){ 
  int minIndex = ref; 
  for(int che = ref + 1; che < SelectionList.size(); che++){ 
    if(SelectionList.get(che) < SelectionList.get(minIndex)){ 
      minIndex = che; 
    } 
  } 
  int temp = SelectionList.get(ref); 
  SelectionList.set(ref, SelectionList.get(minIndex)); 
  SelectionList.set(minIndex, temp);
} 
System.out.println("Sorted:");
for(Integer selListPrint : SelectionList){ 
  System.out.print(selListPrint + " "); 
}

> Sorted:
  13 21 37 42 69
```
#### ***Let's break that down***
###### Line #1 of algorithm
```java
for(int ref = 0; ref < SelectionList.size()-1; ref++){
```
- This for loop has been initialized with int *ref* which is short for reference.
- *ref* is used to increment throughout every index of ArrayList *SelectionList* .
- Every time this loop is run, the element at index *ref* will be replaced with a sorted int.
  - In this case, the sorted int will be the smallest int found past index *ref* at any given iteration of the loop.
  - Therefore, the smallest unsorted int will be sorted to the necessary spot in the array.
###### Line #2 of algorithim
```java
int minIndex = ref;
```
- int *minIndex* is initialized with its value set to *ref* because the element at that index will be compared to the remainder of the unsorted list.
###### Line #3 of algorithim
```java
for(int che = ref + 1; che < SelectionList.size(); che++){
```
- This for loop has been initialized with int *che* which is short for check.
  - Notice how *che* is initialized as *ref* + 1
- *che* is used to increment throughout unsorted elements of the ArrayList which is why it starts at the index after ref.
  - Elements at indices preceding *ref* are sorted, and it would be redundant to recheck them.
###### Lines #4-6 of algorithim
```java
if(SelectionList.get(che) < SelectionList.get(minIndex)){
  minIndex = che;
}
```
- Recall that minIndex would be set to ref before the loop.
- That is because minIndex would be replaced by index *che* if it that contained an element with lower value than the current element at minIndex.
- By the time the loop with this if statement terminates, minIndex would point towards the element with the lowest value of the unsorted part of the list.
###### Line #8-10 of algorithim
```java
int temp = SelectionList.get(ref);
SelectionList.set(ref, SelectionList.get(minIndex));
SelectionList.set(minIndex, temp);
```
- These three lines of code swap the elements at indices ref and minIndex.
  - int *temp* stores the element at index *ref* and the third line moves it into the unsorted list.
  - The element at minIndex is moved to index ref, which is its sorted final position.
- Afterward, a loop may continue until all elements are sorted from least to greatest.

#### **Alternative Applications of Selection Sort**
-  The Selection Sort algorithim is **not** exclusive to ArrayLists and the sorting order of least to greatest.

#### **Selection Sort: Alphabetically Descending**
1. Find the alphabetically last value in the array.
2. Swap it with the current position starting with the first element.
3. Shift the current position over one.
4. Continue until the end of the array or list is reached.

###### Initialization of an Array and printed unsorted values

```java
String[] SelectionList = {"corn", "lettuce", "carrot", "zucchini", "beets", "radish", "mushroom", "asparagus"};
System.out.println("Unsorted:");
for(String selListPrint : SelectionList){
  System.out.print(selListPrint + " ");
}

> Unsorted:
  corn lettuce carrot zucchini beets radish mushroom asparagus

```
###### Implementation of Selection Sort algorithm and printed sorted values
```java
for(int ref = 0; ref < SelectionList.length-1; ref++){ 
  int laterIndex = ref; 
  for(int che = ref + 1; che < SelectionList.length; che++){ 
    if(SelectionList[che].compareTo(SelectionList[laterIndex]) > 0){ 
      laterIndex = che; 
    } 
  } 
  String temp = SelectionList[ref]; 
  SelectionList[ref] = SelectionList[laterIndex];
  SelectionList[laterIndex] = temp;
} 
System.out.println("Sorted:");
for(String selListPrint : SelectionList){
  System.out.print(selListPrint + " ");
}

> Sorted:
  zucchini radish mushroom lettuce corn carrot beets asparagus 
```

#### ***What's Changed?***
- A few things have changed:
###### Line #1 of array initialization

```java
String[] SelectionList = {"corn", "lettuce", "carrot", "zucchini", "beets", "radish", "mushroom", "asparagus"};
```
- The Selection Sort algorithm has been applied to an array of Strings *SelectionList* rather than an arraylist of Integers.
  - Therefore, elements are called with [brackets] and .length is used instead of .size().
###### Line #4-6 of algorithm
```java
if(SelectionList[che].compareTo(SelectionList[laterIndex]) > 0){ 
  laterIndex = che; 
} 
```
- The for loop now saves the index of alphabetically later elements in int *laterIndex*.
  - The .compareTo method would return a positive value if the element at index che is alphabetically later than the element at index laterIndex.
  - *laterIndex* would be replaced if .compareTo() returns a positive number.

#### **Evaluating Selection Sort**
- Advantage:
  - Pretty simple to code. 
- Disadvantage:
  - Slow and inefficient for large data sets.


#### **Additional Materials**
##### Peep the Main.java for the additional explanatory comments
[Webster's YouTube lecture](https://www.youtube.com/watch?v=93oDPoF_6YI&list=PLhdRH8PZCKEhLQP3Zro8ipa1fQkb3XHvF&index=4)
[Webster's Replit](https://replit.com/@StefanWebster/selectionSort)


## Lesson 6: Insertion Sort

#### **Insertion Sort vs. Selection Sort** 
- Insertion Sort and Selection Sort are both sorting methods.
- Instead of checking through the entire section of unsorted elements and *selecting* a desired one to put in order, each unsorted element is *inserted* relative to the other elements to sort.
- Both take a similar amount of time to run.

#### **Insertion Sort: Least to Greatest**
1. Start with a reference variable int ***ref*** **= 1** since there are no values before index 0.
2. Moving **backwards**, compare each element until one a value less than the element at ***ref*** is found.
3. Insert the element at ***ref*** at the position beofre the lower value.
4. Increment ***ref*** 
5. Repear until the end of the array is reached.

#### ***Let's try this out on an ArrayList***
###### Initialization of ArrayList and printed unsorted values.
```java
ArrayList<Integer> InsertionList = new ArrayList<Integer>();
InsertionList.add(45); 
InsertionList.add(32); 
InsertionList.add(78); 
InsertionList.add(98);
InsertionList.add(65);
System.out.println("Unsorted:"); 
for(Integer insListPrint : InsertionList){
  System.out.print(insListPrint + " ");
}

> Unsorted:
  45 32 78 98 65
```

###### Implementation of Insertion Sort algorithm and printed sorted values
```java
for(int ref = 1; ref < InsertionList.size(); ref++){
  int temp = InsertionList.get(ref);
  int possibleIndex = ref;
  while(possibleIndex > 0 && temp < InsertionList.get(possibleIndex - 1)){
    InsertionList.set(possibleIndex, InsertionList.get(possibleIndex - 1));
    possibleIndex--;
  }
  InsertionList.set(possibleIndex, temp);
}
System.out.println("Sorted:"); 
for(Integer insListPrint : InsertionList){
  System.out.print(insListPrint + " ");
}

> Sorted:
  32 45 65 78 98
```
#### ***Let's break that down***
###### Line #1 of algorithm
```java
for(int ref = 1; ref < InsertionList.size(); ref++){
```
- This for loop has been initialized with int *ref* which is short for reference.
- *ref* is used to increment throughout every index except the first of ArrayList InsertionList.
- Every time this loop has run, the element at index *ref* will have been inserted into the right position.

###### Line #2 of algorithm
```java
int temp = InsertionList.get(ref);
```
- int *temp* is initialized with its value set to the element at *ref*.
  - This is because that element will be overwritten as the contents of the array are shifted to make room for the proper location of that element.

###### Line #3 of algorithm
```java
int possibleIndex = ref;
```
- int *possibleIndex* is initialized with index ref.
  - This is because possibleIndex will be decremented until the element at the index preceding it is less than the element at *temp*.
  - However, the current index *ref* may also be the correct location to begin with.

###### Line #4 of algorithm
```java
while(possibleIndex > 0 && temp < InsertionList.get(possibleIndex - 1)){
    InsertionList.set(possibleIndex, InsertionList.get(possibleIndex - 1));
    possibleIndex--;
  }
```
- This while loop is responsible for determining the proper location for the element stored in *temp*.
- While the *possibleIndex* is greater than zero and the value of *temp* is less than elements at indices succeeding *possibleIndex*:
  - Shift the array over by one by duplicating the element at the index preceding *possibleIndex*.
  - Decrement *possibleIndex*.
- Once *possibleIndex* is 0, or if *temp* is larger than the element of the preceding index, terminate the loop.
  - When the loop terminates, *possibleIndex* is the proper location for the value at temp.

###### Lines #4-7 of algorithm
```java
InsertionList.set(possibleIndex, temp);
```
- Set the element at temp to possibleIndex to complete the insertion.
- After the exterior loop is complete, the entire array should be sorted.

#### **Alternative Applications of Insertion Sort**
- Like Selection Sort, the Insertion Sort algorithim is not exclusive to ArrayLists and the sorting order of least to greatest.

#### **Insertion Sort: Alphabetically Descending**
1. Start with a reference variable int ***ref*** **= 1** since there are no values before index 0.
2. Moving **backwards**, compare each element until one an  less than the element at ***ref*** is found.
3. Insert the element at ***ref*** at the position beofre the lower value.
4. Increment ***ref*** 
5. Repear until the end of the array is reached.

###### Initialization of ArrayList and printed unsorted values.

```java
String[] InsertionList = {"grape", "banana", "tomato", "apple", "blueberry", "strawberry", "mango", "watermelon"};
System.out.println("Unsorted:");
for(String insListPrint : InsertionList){
  System.out.print(insListPrint + " ");
}

> Unsorted:
  grape banana tomato apple blueberry strawberry mango watermelon 
```
###### Implementation of Insertion Sort algorithm and printed sorted values
```java
for(int ref = 1; ref < InsertionList.length; ref++){
String temp = InsertionList[ref];
int possibleIndex = ref;
while(possibleIndex > 0 && temp.compareTo(InsertionList[possibleIndex-1]) > 0){
  InsertionList[possibleIndex] = InsertionList[possibleIndex-1];
  possibleIndex--;
}
InsertionList[possibleIndex] = temp;
}
System.out.println("\nSorted:"); 
for(String insListPrint : InsertionList){
  System.out.print(insListPrint + " ");
}

> Sorted:
  watermelon tomato strawberry mango grape blueberry banana apple 
```
#### ***What's Changed?***
- A few things have changed:
###### Line #1 of array initialization

```java
String[] InsertionList = {"grape", "banana", "tomato", "apple", "blueberry", "strawberry", "mango", "watermelon"};
```
- The Insertion Sort algorithm has been applied to an array of Strings *InsertionList* rather than an arraylist of Integers.
  - Therefore, elements are called with [brackets] and .length is used instead of .size().

#### **Additional Materials**
##### Peep the Main.java for the additional explanatory comments
[Webster's YouTube lecture](https://www.youtube.com/watch?v=-tCeurQ25OY&list=PLhdRH8PZCKEhLQP3Zro8ipa1fQkb3XHvF&index=5)
[Webster's Replit](https://replit.com/@StefanWebster/insertionSort)

## Unit 9: **Inheritance**
### Lesson 1: Inheritance
**What is Inheritance?**
Inheritance is an easier way to write code. Instead of having to rewrite the same code for diferent classes. Inheritance allows us to access code from different classes.

**Parent Class**
A parent class is the original class. It contains the methods we don't want to rewrite.

**Child Class**
Child classes use methods located within the parent class.

**Key Words:**
```java
extends;
super;
```

**Extends**
This keyword grants us access to the parent class and its methods. It has to be attached by placing the child classes name then the keywod then finally placing the parent classes name.

**Super**
The keyword super allows us to run methods in the parent class. It can be used by either attaching it before a dot method or by inputing data into as seen in the example.

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
### *_Parent Class_*
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

### *_Child Class_*
(This is only one of three althought they all look similar)
```
public class ChocoChip extends Cookie
{
  public ChocoChip()
  {
  super("Chocolate Chip");
  }
}
```

## Break Down 
* The **main class** is quite basic and simply asks what kind of cookie the user has.
* The **parent class** has the basic cookie and the framework for a special cookie
* The **child class** uses the already established special cookie class to print the custom cookie
