# Unit 10
## **Intro to Recursion (Unit 10, Lesson 1)**
* Recursive methods are methods that call themselves
### See an Example
```java
public static void recursion(int x){
  System.out.println(x);
  if(x-5<=0){
    System.out.println("Done!");
      } else {
        recursion(x-5);
      }
  }
```

* Note that this method contains a base case - if(x-5 <= 0){System.out.println("Done!")}. All recursive methods require a base case
* Each successive recursive call should bring the method closer to the base case, otherwise, you run the risk of the method running indefinitely
* A base case is a case in which the result is known and doesn't require further recursion

### Find the Output
```java
recursion(22);
```

* First, we reach the System.out.println(x) statement, x = 12, 12 is printed.
* x = 12, 12-5 = 7 > 0, so the if statement is ignored and there is a call to recur(7)
* Going through the method again, we reach System.out.println(x), x = 7, 7 is printed.
* x = 7, 7-5 = 2 > 0, so the if statement is ignored and there is a call to recur(2)
* Going through the method again, we reach System.out.println(x), x = 2, 2 is printed.
* x = 2, 2-5 < 0, so the if statement is fulfilled and "Done!" is printed.
* Our final output is:
```java
12
7
2
Done!
```
## **Recursive Functions with Returns (Unit 10, Lesson 2)**
### **Examples**
```java
public static int addition(int num) {
	if (n == 0) {
		return 0;
	} else {
		return num + sum(num - 1)
	}
}
```
![Example 1 Explanation](https://i.imgur.com/0P2A8yC.png)
* This method will store the value of `num` and call the method again with `num - 1` as its parameter. It will continue until the `base case` is met where it will return 0. It will start adding the values in the opposite direction the values were stored.
* In this case, it will start adding the numbers starting from 0 and adding 1, 2, 3, 4 and 5.
```java
public static double mult(int num) {
	if (n == 0) {
		return 1;
	} else {
		return num * mult(num - 1);
	}
}
```
![Example 2 Explanation](https://i.imgur.com/cMnfXbT.png)
* This method is similar to the addition, but we are multiplying the numbers. Our `base case` is still 0, but we have to return 1 because we're multiplying.
* This method will return factorial of the parameter because its product of `num` and all the integers below it.
* Anything done with recursion can be done with itteration, but it might be neater/easier to use recursion
  * Sometimes itteration is better option than recursion

## **Binary Search (Unit 10, Lesson 3)**
* The binary search is very fast compared to the linear search
  * However, it is more difficult to code (not as difficult as merge sort) and the array must already be sorted
  

 The Binary search divides the array in half.
* we find the value at the midpoint of the array
  * we then compare it to our target value
    * if the mid value is our target, then we are done and return the index
      * If our mid value is lower than target, then we don't need to look at values from the lower half, eliminating half of an array
* Then with our second half, we divide it into a half again and each time we do this, we eliminate a half until we find the index of our target and return in
## Let's now look at the steps of the binary search in Java

```java
Our header would look like:
public int binarySearch ( int[] arr, int t, int low, int high)
```
* we take in the array, our target value, our lowest index, and our highest index
* Then, with the low and high index, we would find the mid index by adding them up and then dividing by two as shown below
  * We would check if our target value equals the value at the mid index, and if it does, return the mid index
```java
int mid = (low + high)/2;

if (arr[mid] == target) {
return mid;
}
if (high < low) {
      return -1; 
    }
```
* We would find out if we went through the whole array, meaning ran out of elements, by checking if high is less than low as shown above
  * If high is less than low, that means we couldn't find our target and return -1
* Now, if our target value is lower than the value at mid, that means we don't have to look at the second larger half
  * So, through the proccess of recursion, we would simply take the index mid - 1 and put in the high index since we want to go from low to mid
  ```java
    if (target < arr[mid]){
      return recursiveBinarySearch(arr, target, low, mid - 1);
    }
    ```
* if target is bigger than the value at index mid, we would go from mid to high
  * The proccess of goung from mid to high is the similar to going from low to mid, but instead of replacing the index of high in the method parameter with mid -1, we would replace the index of low with mid +1, which makes it go from mid to high
  ```java
  if (target > arr[mid]){
      return recursiveBinarySearch(arr, target, mid + 1, high);
    }
  ```
  * We return -1 at the end if we don't achieve our goal

  


## **Merge Sort (Unit 10, Lesson 4)**
* Good for sorting huge arrays, very fast due to recursive nature
* Hard to code

A merge Sort gradually breaks down in array until every single element is isolated. It then compares the elements and merges them together in order to make the array whole again.
* Note: Learning how code the merge sort is **NOT** required for the AP Exam

### Understanding How It Works
![Merge Sort Diagram](https://media.geeksforgeeks.org/wp-content/cdn-uploads/Merge-Sort-Tutorial.png)
* Goes from left to right  
**References**
  * [Merge Sort video](https://www.youtube.com/watch?v=JSceec-wEyw)
  * [Visualizer of Merge Sort Step-by-Step](https://www.hackerearth.com/practice/algorithms/sorting/merge-sort/visualize/)

### How It Works From the Code (YOU CAN SKIP THIS SECTION IF YOU WANT TO, THIS GOES IN-DEPTH WITH THE CODING)
* Merge sort algorithm separates into 2-3 methods (depending on how you write it)
* One method is recursive

**WHILE LOOKING THROUGH THIS, IT IS RECOEMMENDED TO HAVE THE SORT.JAVA CODE SIDE-BY-SIDE WITH THIS DOCUMENT**
**THIS DOCUMENT WILL SPECIFY LINE NUMBERS IN THE SORT CLASS**

**`mergeSortHelp` method** (the recursive method) (Lines 24-31) 
* Parameters:
  * `elements` - the array you want sorted
  * `from` - starting index
  * `to` - ending index
  * `temp` - temporary array that is the same length as elements

* recursive call splits elements array in half
* `mergeSortHelp` keeps being called and splits the array until the condition `from < to` is false, which is when the single elements are isolated (when `from == to`)

### Figure 1
![Figure 1](https://i.imgur.com/ccEB4zf.jpg)
### Figure 2
![Figure 2](https://i.imgur.com/QR5RJ9d.jpg)

**`merge` method** (longest method) (Lines 33-65)
* `mid` - index considered the middle index between `from` and `to`
* while loop (Line 38) runs 
* if statement condition evaluated (Line 39)
```java
if (elements[firstHalf] < elements[secondHalf])
which is
if (elements[0] < elements[1])
which is
if (38 < 27)
``` 
* compares `38` and `27`
  * condition is false, runs code in `{}` of else statement (Line 43-44)
```java
temp[index] = elements[secondHalf];
which is
temp[0] = 27;
```
* `secondHalf` increases by one (Line 44)
* `index` increases by one, focusing on temp[1] now (Line 46)
* while loop (Line 44) ends
  * Note: the condition for while loop (Line 44) became false when `secondHalf` increased by one, because `secondHalf > to` and not `secondHalf <= to`
* while loop (Line 49) runs 
* `temp[1]` is set to `38` (Line 50)


```java
temp[index] = elements[firstHalf];
which is
temp[1] = 38;
```
* `firstHalf` and `index` increase by one (Line 51-52)
* while loop (Line 49) ends
* while loop (Line 55) is skipped (by the time the method reached the loop, its condition was false)
* for loop (Line 62) runs, putting values in `temp` array to `elements` array
```java
for (int i = from; i <= to; i++) {
  elements[i] = temp[i];
}

which becomes

for (int i = 0; i <= 1; i++) {
  elements[i] = temp[i];
}
```
### Figure 3
![Figure 3](https://i.imgur.com/2hLDi9f.jpg)

* Afterwards, this is done with indices 2-3 in the `merge` method that happens with `mSH(elements, 2, 3, temp)` in **Figure 2**
* Then it extends to sorting indices 0-3 altogether
* keeps going until it extends to all indices of the `elements` array

**`mergeSort` method** (Lines 19-22)
* the method that would be called in the `main` method
* calls `mergeSortHelp`
  * `0` passed as `from` parameter - first index of the array
  * `elements.length-1` passed as `to` parameter - last index of the array (NOT `elements.length`, causes IndexOutOfBoundException error)

**array `elements` (E) and array `temp` (T) as `mergeSort` method happens**
```java
Starts as:
E[38, 27, 43, 3, 9, 82, 10]

During method:
T[0, 0, 0, 0, 0, 0, 0] //mergeSort method starts, temp is initialized (Line 20)

T[27, 0, 0, 0, 0, 0, 0] //merge(elements, 0, 0, 1, temp) starts
T[27, 38, 0, 0, 0, 0, 0]
E[27, 27, 43, 3, 9, 82, 10] //for loop (Line 62) starts
E[27, 38, 43, 3, 9, 82, 10] //for loop (Line 62) ends, merge(elements, 0, 0, 1, temp) ends

T[27, 38, 3, 0, 0, 0, 0] //merge(elements, 2, 2, 3, temp) starts
T[27, 38, 3, 43, 0, 0, 0]
E[27, 38, 3, 3, 9, 82, 10] //for loop (Line 62) starts
E[27, 38, 3, 43, 9, 82, 10] //for loop (Line 62) ends, merge(elements, 2, 2, 3, temp) ends

T[3, 38, 3, 43, 0, 0, 0] //merge(elements, 0, 1, 3, temp) starts
T[3, 27, 3, 43, 0, 0, 0]
T[3, 27, 38, 43, 0, 0, 0]
T[3, 27, 38, 43, 0, 0, 0]
E[3, 38, 43, 3, 9, 82, 10] //for loop (Line 62) starts
E[3, 27, 43, 3, 9, 82, 10]
E[3, 27, 38, 3, 9, 82, 10]
E[3, 27, 38, 43, 9, 82, 10] //for loop (Line 62) ends, merge(elements, 0, 1, 3, temp) ends

T[3, 27, 38, 43, 9, 0, 0] //merge(elements, 4, 4, 5, temp) starts
T[3, 27, 38, 43, 9, 82, 0]
E[3, 27, 38, 43, 9, 82, 10] //for loop (Line 62) starts
E[3, 27, 38, 43, 9, 82, 10] //for loop (Line 62) ends, merge(elements, 4, 4, 5, temp) ends

T[3, 27, 38, 43, 9, 82, 0] //merge(elements, 4, 5, 6, temp) starts
T[3, 27, 38, 43, 9, 10, 0]
T[3, 27, 38, 43, 9, 10, 82]
E[3, 27, 38, 43, 9, 82, 10] //for loop (Line 62) starts
E[3, 27, 38, 43, 9, 10, 10]
E[3, 27, 38, 43, 9, 10, 82] //for loop (Line 62) ends, merge(elements, 4, 5, 6, temp) ends 

T[3, 27, 38, 43, 9, 10, 82] //merge(elements, 0, 3, 6, temp) starts
T[3, 9, 38, 43, 9, 10, 82]
T[3, 9, 10, 43, 9, 10, 82]
T[3, 9, 10, 27, 9, 10, 82]
T[3, 9, 10, 27, 38, 10, 82]
T[3, 9, 10, 27, 38, 43, 82]
T[3, 9, 10, 27, 38, 43, 82]
E[3, 27, 38, 43, 9, 10, 82] //for loop (Line 62) starts
E[3, 9, 38, 43, 9, 10, 82]
E[3, 9, 10, 43, 9, 10, 82]
E[3, 9, 10, 27, 9, 10, 82]
E[3, 9, 10, 27, 38, 10, 82]
E[3, 9, 10, 27, 38, 43, 82]
E[3, 9, 10, 27, 38, 43, 82] //for loop (Line 62) ends, merge(elements, 0, 3, 6, temp) starts
//mergeSort method ends, array temp is garbage collected


After method:
E[3, 9, 10, 27, 38, 43, 82]
```

## Unit 10
#### Recursion
* Calls a method within itself
* Requires a **base case**, or else there will be an infinite loop
  * The base case is a test to stop the recursion, often an if statement
```java
public static void baseCaseExample(int x){
    //This is the base case
    //If x is equal to 3, the recursion will end 
    if(x == 3){
        System.out.print("This should print 3: " + x);
    }
    /*These are the recursive calls
    They will call the method again, except with different values
    The value of x will be printed before each recursive call*/ 
    if(x > 3){
        System.out.print(x + " ");
        baseCaseExample(x - 1);
    }
    if(x < 3){
        System.out.print(x + " ");
        baseCaseExample(x + 1);
    }
}
```
* In the example, if the method was called with 
  * baseCaseExample(6);
* The output would be 6 5 4 This should print 3: 3

#### Recursive functions with Returns
* Same as recursive functions without returns, there must be a base case
* Recursions can do what iterations do, and sometimes are optimal compared to iterations
```java
public static String returnRecursion(String str){
    //This is the base case
    //When the length of str is less than or equal to 3, the first 
    //3 letters of str is printed
    if(str.length() <= 3){
        return str;
    }
    /*This will add a $ before the final return statement of str 
    The recursion calls the method with the last letter removed 
    from the string*/
    return "$" + returnRecursion(str.substring(0, str.length()-1));
}
```
* If the method above is called with 
  * returnRecursion("banana");
* The string returned will be $$$ban 
#### Binary Search 
* A type of searching algorithm
* Divides the code in half over and over again until the target is found
* Data set must be sorted or else binary sort won't work
* Very fast for searching large data set
* More difficult to code
```java
public static int binarySearch(String[] array, String target){
    boolean found = false;
    int ind = -1;
    //Sets the values for low and high
    int low = 0;
    int high = array.length;
    //Loops until target is found
    while(found == false){
        int mid = (low + high)/2
        if(array[mid].equals(target){
            found = true;
            ind = mid;
        }
    /*If the target is less than the middle, anything above the 
    middle is cut off and we only search through low to mid, and if 
    the target is greater than the middle, we do the opposite*/
        if(target.compareTo(array[mid]) > 0){
            low = mid;
        }else if(target.compareTo(array[mid]) < 0){
            high = mid;
        }
    }
    return ind;
}
```
* The method will continuously cut the array in half until the target is found, and will return -1 if the target is not found

#### Merge Sort
* This is an algorithm for sorting using recursion.
* It is more difficult to write, but it is much faster on larger data sets than selection sort or insertion sort.
* To do this, the data is first split into its parts, then the parts are merged back together in order.
```java
public static void sort(int [] arr, int begin, int end){
  if(begin < end){
    int mid = (begin+end)/2;
    if(mid==begin){
      return;
    }
    sort(arr, begin, mid);
    sort(arr, mid, end);
    merge(arr, begin, end);
  }
}

public static void merge(int[] arr, int begin, int end){
  int[] temp = new int[end-begin];
  int first = begin;
  int second = (begin+end)/2;
  int tempIndex = 0;
  int mid = second;
  while(first < mid && second < end){
    if(arr[first] < arr[second]){
      temp[tempIndex++] = arr[first++];
    }
    else{
      temp[tempIndex++] = arr[second++];
    }
  }
  while(first<mid){
    temp[tempIndex++] = arr[first++];
  }
  while(second<end){
    temp[tempIndex++] = arr[second++];
  }
  for(int x = 0;x<end-begin; x++){
    arr[begin+x] = temp[x];
  }
}
```
* In the code above, the sort method will split the array it takes in as a parameter in half. Then it recursively calls sort so that those halves are split in half and so on until the sub-arrays are a single unit.
* Then each of those sub-arrays call merge, where they are merged together based on comparison.
  * The temp array temporarily holds the numbers sorted.
  * The first while loop moves through the set of numbers taken in by the method, and compare for the smallest number, which is then merged into temp.
  * The following while loops clears any leftovers not merged into temp
  * The for loop copies the ordered segment from temp into the array.
