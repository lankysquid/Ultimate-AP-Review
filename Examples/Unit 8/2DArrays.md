# Unit 8
## 2D-Arrays
In contrast to 1 dimensional arrays or just regular arrays, 2 dimensional arrays have more than one row. 2-D Arrays are useful in keeping data that is best represented by a table. 2-D Arrays are indexed the same and work almost the same way as 1-D arrays; in a sense, a 2-D Array is an array of arrays. 
### Declaring 2-D Arrays
Like 1-D arrays we often first define an empty array with a defined size:
```java
int[][] table  = new int[5][4];
```
* Here we create a 2-D array with 5 rows and 4 columns.

While declaring a 2-D array we could also define each element in the array:
```java
int[][] table1 = {{0,0,1}, {1,2,2}, {3,3,4}};
```
### Traversing 2-D Arrays
Traversing a 2-D array is very similar to 1-D array. If we imagine looping through a regular 1-D array as checking each column then all that we need to do to check every element in a 2D array is to loop through the rows. 




```java
for(int i = 0; i < table1.length(); i++){ // table1.length() gives us the length of a column
  for(int j = 0; j < table1[0].length(); j++){ // table1[0].length() gives us the length of a row
    System.out.print(table1[i][j] + " ");
  }
  System.out.println();
}
```
Output: 
```java
 0 0 1
 1 2 2
 3 3 4
 ```
* In the above example we start with row 0, we then check every element in row 0 and then do the same with the next row all the way until  row (table1[0].length() - 1)

If we wanted to do the opposite where we check every element in a column then it would look like the example below. 

```java
for(int i = 0; i < table1[0].length(); i++){ // table1.length() gives us the length of a column
  for(int j = 0; j < table1.length(); j++){ // table1[0].length() gives us the length of a row
    System.out.print(table1[i][j] + " ");
  }
  System.out.println();
}
```
Output: 
```java
 0 1 3
 1 2 3
 1 2 4
 ```
As always, we can also loop through using an enhanced for loop

```java
for (int[] i: table1)  //Each row is a 1d array of ints
{
  for (int j : i) //Each element in the row is an int
  {
    System.out.print (j + " ");
  }
  System.out.println( );
}
```
Ouput:
```java
0 0 1
1 2 2
3 3 4
```




## Implementing 2-D Arrays in Algorithms
*2-D Arrays hold a variety of purposes within algorithms.*

### Traversing a 2-D Array
+ Typically, a **nested for-loop** can be used to traverse through a 2-D Array.

+ **nested for-loop:** A for loop inside of another for loop. One loop can work through the rows and the other the columns.

```java
for (int row = 0;  row < 3;  row++) {
   for (int column = 0;  column < 4;  column++) {
  }
}   
```
+ Here, we can see a set of nested for loops. The inside loop iterates through the colums, while the outside loop runs through the rows.


## Extra Resources

+ [2-D Arrays Video](vhttps://www.youtube.com/watch?v=DYEYzvgowXc) 
+ [2-D Arrays Notes](http://math.hws.edu/eck/cs124/javanotes6/c7/s5.html#arrays.5.2)