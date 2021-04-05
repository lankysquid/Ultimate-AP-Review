## Unit 8

**What is a 2-D array?**
* 2-D arrays are arrays with rows **and** columns
* They are used to represent a **table**
* It is an **array of arrays**

**How 2-D arrays are similar to 1-D Arrays**
* They can only store **one type** of data
* Their indices go from `0` to `length-1`
* They can store **large amounts of data**

**What a 2-D array looks like**
*If you wanted to represent this student's schedule:*

| Class    | Teacher   | Grade |
|----------|-----------|-------|
| Math     | Wilson    | B+    |
| Science  | Sakaguchi | A-    |
| History  | Solarez   | B     |
| Comp Sci | Webster   | A+    |
| Art      | Harbourt  | A     |
| PE       | Ramirez   | A-    |

*You could use this array of arrays:*
```java
[ ["Class", "Teacher", "Grade"],
  ["Math", "Wilson", "B+"],
  ["Science", "Sakaguchi", "A-"],
  ["History", "Solarez", "B"],
  ["Comp Sci", "Webster", "A+"],
  ["Art", "Harbourt", "A"],
  ["PE", "Ramirez", "A-"] ]
```

**How to declare a 2-D array**
* To create an empty integer array with 4 rows and 3 columns
`int[][] grid  = new int[4][3];`
* You can also use curly brackets to initialize an array with the values
`int[][] grid = {{1, 5, 2}, {3, 8, 6}, {9, 4, 7}};`
  * It is easier to how that line of code works when the rows are separated
   ```java 
   int[][] grid = {{1, 5, 2},
                {3, 8, 6},
                {9, 4, 7}};
* View the **Main_Unit8.java** for an example

**How to loop through a 2-D array**
* Looping through row by row (Row-major)
  * ```java
for (int r = 0; r < twoD.length; r++)  
//through rows first
  {
    for (int c = 0; c < twoD[0].length; c++) 
    //through columns second
    {
      //do an action here for each cell
    }
  //do an action here after each row
}

* Looping through column by column (Column-major)
  * ```java
for (int c = 0; c < twoD[0].length; c++)  
//through columns first
  {
    for (int r = 0; r < twoD.length; r++) 
    //through rows second
    {
      //do an action here for each cell
    }
  //do an action here after each column
}

* Also, you can use enhanced for-loops!
  * ```java
for (int[] row : twoD)  
    for (int cell : row) 

---
### [Unit 8: Lesson 2: 2-D Array Algorithms] (https://intro.edhesive.com/courses/46977/modules/items/16049600)

**Example test code**
We will be working with the 2-D array `wishlist` which stores different categories of a person's wishlist and how much different items cost:
```
| Clothes | Technology | Furniture |
|---------|------------|-----------|
| $29     | $399       | $2400     |
| $38     | $1299      | $2415     |
```


**Creating a averaged 2-D array?**
We can first initialize this array with the following code:
```java
int[][] wishlist = {{1, 2, 3},
                      {29, 399, 2400},
                      {38, 1299, 2415}};
```
**MOST 2-D array algorithms work by creating a separate 1-D array as a return value**
* So what we can create is a separate 1-D array
  `double[] averageWL = new double[3];`
  and use it h:
```java

public static void calcAverages(int[][] wishList, double[] average)
{
  for (int r = 0; r < wishList.length; r++) 
  {
    double sum = 0;
    for (int c = 0; c < wishList[0].length; c++)
    {
      sum += wishList[r][c];
    }
    averageWL[r] = sum/wishList[0].length;
  }
}
```

**Determining if students are improving**
* In order to determine if sutdents are imporving we would need to use a method that checks if each test stcore is becoming progressivly better
  * The method example:

```java
public static boolean improving(int[] scores)
{
  for (int i = 1; i < scores.length; i++)
  {
    if (scores[i] < scores[i-1])
    {
      return false;
    }
    return true;
    }
}
```


**How to pass a 2-D Array Into A Method**
* Passing the 2-D Array in a method will get the average for the test scores
  * The method example:
```java
  public static double avgTest(int[][] ts, int col)
{
  double sum = 0;
  for (int r = 0; r<ts.length; r++)
  {
    sum += ts[r][col];
  }
  return sum/ts.length;
}
```
# Unit 8
**2D Arrays**

Unit 8 is all about 2D arrays, which are essentially 2 arrays stapled together, though I don't think that's a great way to think of it. It consists of a specified amount of rows and columns, each value of which can be filled individually. A 2D array is initialized like this:
```java
int[][] array = new int[4][4] // 4 rows and 4 columns
String[][] strings = new string[2][7] // 2 rows and 7 columns
```

and have a variety of uses. The majority of which involve storing multiple sets of related data. For example, for the 4 and 4 array, you can store the scores of 4 rounds of bowling for 4 players.

**2D Array Algorithms**

You can specify which specific value of a 2D array you want to manipulate by specifying which row and column it is apart of. Of couse if you don't know this, you can look for it using a modified searching algorithm. You can use this for ints and modify it accordingly for other data types:
```java
int rows = 3;
int columns = 4;
int value = 7;
int[][] array = new int[rows][columns];

// fill array with numbers...

// this loop goes through every value, 
// as it loops through every row, 
// then every value in the column, then repeat
for (int i = 0; i < array.length; i++) {
  for (int j = 0; j < array[0].length; j++) {
    if (array[i][j] == value) {
      System.out.println(value + " was found at index ["+ i + "][" + j + "]");
      break;
    }
  }
}
```
## External Links
For extra information on these subjects I suggest looking at the following link below
<https://www.educative.io/edpresso/how-to-use-2-d-arrays-in-java>
