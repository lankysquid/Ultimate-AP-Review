public class Unit07 {
	public static void ArrayList(){
  System.out.println(PURPLE + "Welcome to Unit 7 : Lesson 1" + RESET + "\nThis lesson is dealing with all the methods that are used in ArrayLists." + RED + "\nBelow is an ArrayList of ice cream flavors!" + RESET);
  ArrayList <String> icecream = new ArrayList <String> ();
  icecream.add("cookie dough");
  icecream.add("chocolate chip");
  icecream.add("strawberry");
  icecream.add("vanilla");
  icecream.add(2, "chocolate");
  icecream.set(1, "cookies n cream");
  icecream.remove(3);

  System.out.println(icecream.get(2));
  System.out.println(icecream);
  System.out.println(icecream.size());
}

public static void Traversing(){
  System.out.println(BLUE + "Welcome to Unit 7 : Lesson 2" + RESET + "\nThis lesson has to do when using loops to go throught the ArrayList" + PURPLE + "\nBelow is using a standard for loop to find the difference between two school schedules" + RESET);
  ArrayList <String> schedule = new ArrayList <String> ();
  schedule.add("math");
  schedule.add("history");
  schedule.add("english");
  ArrayList <String> schedule2 = new ArrayList <String> ();
  schedule2.add("science");
  schedule2.add("history");
  schedule2.add("english");

  System.out.println("Schedule 1: " + schedule + "\nSchedule 2: " + schedule2);
  for (int i = 0; i < schedule2.size(); i++){
    if (!schedule2.get(i).equals(schedule.get(i))){
      System.out.println(RED +"We found where the schedules are different!" + RESET + "\nSchedule 1 contains: " + schedule.get(i) + "\nSchedule 2 contains: " + schedule2.get(i));
    }
  }
}

public static void algorithms(){
  System.out.println(GREEN + "Welcome to Unit 7: Lesson 3" + RESET + "\nThis lesson is on ArrayList algorithms. View the Markdown notes under Unit 7 Lesson 3 to see an example algorithm.");
}

public static void linear(){
  System.out.println(GREEN + "Welcome to Unit 7: Lesson 4" + RESET + "\nThis lesson is on the linear search algorithm. Below you will create an array, then track each value in the algorithm until the target value is found.");
  Scanner scan = new Scanner (System.in);
  String[] characters = new String[4];
  characters[0] = "goofy";
  characters[1] = "mickey";
  characters[2] = "minnie";
  characters[3] = "donald";
  System.out.println("There is a list of four Disney characters(goofy, mickey, minnie, and donald). Please select which should be the target character.");
  String a = scan.nextLine();
  boolean flag = true;
  for(int x = 0; x<4; x++){
    if(characters[x].equals(a)){
      System.out.println(a + " was found in the array at index " + x);
      flag = false;
    }
  }
  System.out.println("The linear search method was shown as the for loop iterated until the target string was found and the index was returned.");
  if (flag)
  System.out.println(a + " was not found in the array");
}

public static void SelSort() {
    System.out.println(GREEN + "Welcome to Unit 7: Lesson 5" + RESET + "\nThis lesson is on the selection sort algorithm. Below you will create an array, then track each value in the algorithm until the array is sorted");

    Scanner in = new Scanner(System.in);
    System.out.println( PURPLE + "How long should the array be?" + RESET);
    int len = in.nextInt();
    int[] elements = new int[len];

    System.out.println(RED + "Please enter the values in the array" + RESET);
    for (int i = 0; i < elements.length; i++) {
      elements[i] = in.nextInt();
    }

    for (int j = 0; j < elements.length -1; j++)
    {
      int minIndex = j;
      for (int k = j + 1; k < elements.length; k++)
      {
        if (elements[k] < elements[minIndex])
        {
          minIndex = k;
        }
      }
      int temp = elements[j];
      elements[j] = elements[minIndex];
      elements[minIndex] = temp;
//Print out the array
    System.out.print("Current Array: [");

    for (int num : elements)
    {
      System.out.print(num + ", ");
    }

    System.out.print("]\n");
    }
    
    System.out.print("\n\n" + YELLOW + "Sorted Array: " + RESET + "[");

    for (int num : elements)
    {
      System.out.print(num + ", ");
    }

    System.out.print("]");
  }

public static void InsSort() {
  System.out.println(YELLOW + "Welcome to Unit 7 : Lesson 6"+ RESET + "\nThis lesson is the insertion sort algorithm");
  Scanner in = new Scanner(System.in);
    System.out.println(BLUE + "How long should the array be?" + RESET);
    int len = in.nextInt();
    int[] elements = new int[len];

    System.out.println(GREEN +"Please enter the values in the array" + RESET);
    for (int i = 0; i < elements.length; i++) {
      elements[i] = in.nextInt();
    }

  for (int j = 1; j < elements.length; j++)
    {
      int temp = elements[j];
      int possibleIndex = j;
      while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
      {
        elements[possibleIndex] = elements[possibleIndex - 1];
        possibleIndex--;
        
      }
      elements[possibleIndex] = temp;

      System.out.print("Current Array: [");

    for (int num : elements)
    {
      System.out.print(num + ", ");
    }

    System.out.print("]\n");
    }

    System.out.print("\n\n" + YELLOW + "Sorted Array: " + RESET + "[");

    for (int num : elements)
    {
      System.out.print(num + ", ");
    }

    System.out.print("]");
  }

  public static void impact7(){
    System.out.println(PURPLE + "Welcome to Unit 7 : Lesson 7" + RESET + "This is lesson, we will explore some of the impacts that large-scale data storage has on socierty");
  }


	/******************
	   //Example 1 for U7L1
    System.out.println();
    System.out.println("Example 1 for U7L1");
    ArrayList<String> exampleList = new ArrayList<String>();
    exampleList.add("hi"); //adds "hi" to end of exampleList    ["hi"]
    exampleList.add("sup"); //adds "sup" to end of exampleList    ["hi","sup"]
    exampleList.add(0, "hello"); //adds "hello" at index 0    ["hello","hi", "sup"]
    exampleList.set(1, "hey"); //replaces String at index 1 with "hey"    ["hello","hey", "sup"]
    System.out.println(exampleList.get(2)); //prints String at index 2    ["hello","hey", "sup"]
    System.out.println(exampleList.remove(1)); //removes the String at index 1 and prints it out    ["hello","sup"]
    System.out.println(exampleList.size()); //prints the number of Strings in exampleList   ["hello","sup"]

    //Example 2 for U7L1
    System.out.println();
    System.out.println("Example 2 for U7L1");
    ArrayList<Integer> exampleList2 = new ArrayList<Integer>();
    exampleList2.add(10);
    exampleList2.add(5);
    System.out.println(exampleList2.get(0));

    //Example 1 for U7L3
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

    //Example 1 for U7L4
    System.out.println("\nExample 1 for U7L4");
    String search = "Mango"; //String searches for Mango
    System.out.println(fruit);
    for (int i = 0;i < fruit.size(); i++){
      if(fruit.get(i).equals(search)) {
      System.out.print("Mango found at index ");
      System.out.println(i);
      }
    }
  
    //Example 1 for U7L5
    System.out.println("\nExample 1 for U7L5");
    ArrayList<Integer> SelectionList1 = new ArrayList<Integer>();
    SelectionList1.add(21); //adds 21 tp the end of SelectionList1  [21]
    SelectionList1.add(42); //adds 42 tp the end of SelectionList1  [21, 42]
    SelectionList1.add(69); //adds 69 tp the end of SelectionList1  [21, 42, 69]
    SelectionList1.add(13); //adds 13 tp the end of SelectionList1  [21, 42, 69, 13]
    SelectionList1.add(37); //adds 37 tp the end of SelectionList1  [21, 42, 69, 13, 37]
    System.out.println("Unsorted:");
    for(Integer selListPrint : SelectionList1){
      System.out.print(selListPrint + " "); //Prints unsorted SelectionList1 ^^^
    }
    for(int ref = 0; ref < SelectionList1.size()-1; ref++){ //creates reference int "ref" that increments through ArrayList SelectionList1 before the last index
      int minIndex = ref; //creates int minIndex and sets it to the current ref
      for(int che = ref + 1; che < SelectionList1.size(); che++){ //creates check int "che" that increments through unsorted SelectionList1 elements
        if(SelectionList1.get(che) < SelectionList1.get(minIndex)){ //checks if element at index che is less than  element at the current minIndex
          minIndex = che; //sets minIndex to che when it finds a smaller element at index che
        } //This if statement will store the index of the element with the smallest unsorted element.
      } //When the for loop terminates, minIndex will point towards the smallest element
      int temp = SelectionList1.get(ref); //stores the element at index ref in a temporary variable
      SelectionList1.set(ref, SelectionList1.get(minIndex)); //sets the element at index ref to the value of the element at minIndex
      SelectionList1.set(minIndex, temp);
    } //The for loop increments ref to the next index where every index before ref has sorted elements
    System.out.println("\nSorted:");
    for(Integer selListPrint : SelectionList1){
      System.out.print(selListPrint + " "); //Prints Sorted SelectionList1
    }
    System.out.println();

    //Example 2 for U7L5
    System.out.println("\nExample 2 for U7L5");
    String[] SelectionList2 = {"corn", "lettuce", "carrot", "zucchini", "beets", "radish", "mushroom", "asparagus"};
    System.out.println("Unsorted:");
    for(String selListPrint : SelectionList2){
      System.out.print(selListPrint + " "); //Prints unsorted SelectionList2 ^^^
    }
    for(int ref = 0; ref < SelectionList2.length-1; ref++){ //creates reference int "ref" that increments through array SelectionList2 before the last index
      int laterIndex = ref; //creates int laterIndex and sets it to the current ref
      for(int che = ref + 1; che < SelectionList2.length; che++){ //creates check int "che" that increments through unsorted SelectionList2 elements
        if(SelectionList2[che].compareTo(SelectionList2[laterIndex]) > 0){ //checks if element at index che is after element at the current laterIndex
          laterIndex = che; //sets laterIndex to che when it finds a alphabetically later element at index che
        } //This if statement will store the index of the element with the alphabetically latest unsorted element
      } //When the for loop terminates, minIndex will point towards the alphabetically last element
      String temp = SelectionList2[ref]; //stores the element at index ref in a temporary variable
      SelectionList2[ref] = SelectionList2[laterIndex]; //sets the element at index ref to the value of the element at minIndex
      SelectionList2[laterIndex] = temp;
    } //The for loop increments ref to the next index where every index before ref has sorted elements
    System.out.println("\nSorted:");
    for(String selListPrint : SelectionList2){
      System.out.print(selListPrint + " "); //Prints Sorted SelectionList2
    }
    System.out.println();

    //Example 1 for U7L6     name it to the right number dude
    System.out.println("\nExample 1 for U7L6");
    ArrayList<Integer> InsertionList1 = new ArrayList<Integer>();
    InsertionList1.add(45); 
    InsertionList1.add(32); 
    InsertionList1.add(78); 
    InsertionList1.add(98);
    InsertionList1.add(65); //InsertionList1 initialized containing [45, 32, 78, 98, 65]
    System.out.println("Unsorted:"); 
    for(Integer insListPrint : InsertionList1){
      System.out.print(insListPrint + " "); //Prints unsorted InsertionList1 ^^^
    }

    for(int ref = 1; ref < InsertionList1.size(); ref++){ //Since the first element is considered sorted, start at 1 and increment until the end of the array. 
      int temp = InsertionList1.get(ref); //int temp stores the element at index ref that will be inserted appopriately.
      int possibleIndex = ref; //int possibleIndex will decrement until the index at the element before it has a value less than temp.
      while(possibleIndex > 0 && temp < InsertionList1.get(possibleIndex - 1)){ //If possible index = 0, then the beginning of the array has been reached which means that temp is the smallest element. Also, if temp is greater than the element before it, then possibleIndex has the correct location. If either of those cases are met, the shifting of elements will cease.
        InsertionList1.set(possibleIndex, InsertionList1.get(possibleIndex - 1)); //while the loop is true, shift element larger than temp to the right.
        possibleIndex--; //move down an index.
      } //At this point, the Array has been shifted properly, the possibleIndex is the correct location for temp.
      InsertionList1.set(possibleIndex, temp); //Set the possibleIndex to temp.
    }//Once the loop terminates, the list should be completely sorted.
    System.out.println("\nSorted:"); 
    for(Integer insListPrint : InsertionList1){
      System.out.print(insListPrint + " ");//Prints sorted InsertionList ^^^
    }
    System.out.println();

    //Example 2 for U7L6
    System.out.println("\nExample 2 for U7L6");
    String[] InsertionList2 = {"grape", "banana", "tomato", "apple", "blueberry", "strawberry", "mango", "watermelon"};
    System.out.println("Unsorted:");
    for(String insListPrint : InsertionList2){
      System.out.print(insListPrint + " "); //Prints unsorted InsertionList2 ^^^
    }
    for(int ref = 1; ref < InsertionList2.length; ref++){
    String temp = InsertionList2[ref];
    int possibleIndex = ref;
    while(possibleIndex > 0 && temp.compareTo(InsertionList2[possibleIndex-1]) > 0){
      InsertionList2[possibleIndex] = InsertionList2[possibleIndex-1];
      possibleIndex--;
    }
    InsertionList2[possibleIndex] = temp;
    }
    System.out.println("\nSorted:"); 
    for(String insListPrint : InsertionList2){
      System.out.print(insListPrint + " ");
    }
    System.out.println("\n");

	*************************/
}