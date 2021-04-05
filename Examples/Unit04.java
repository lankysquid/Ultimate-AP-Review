public class Unit04 {
	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Scanner Scan = new Scanner(System.in);
    Scanner SCAN = new Scanner(System.in);

System.out.println("\n                Testing Looping Algorithms");
System.out.println("-------------------------------------------------------");

//4.1 while loop
System.out.println("\nWhile Loops:");
System.out.println("-------------------------------------------------------");

  System.out.println("\nEnter a number for this while loop.");
  int x = Integer.parseInt(scan.nextLine());
  while(x > 0){
    System.out.println(x);
    x--;
  }
  System.out.println("While loop done!");

//4.2 algorithms for numbers
System.out.println("\nNumber Algorithms:");
System.out.println("-------------------------------------------------------");
  //insert example here
  System.out.println("\nAlgorithms for numbers:");
  int max = Integer.MIN_VALUE;
  int num = 0;

  while(num != -1)
  {
    System.out.println("Enter a number, or -1 to stop");
    num = Scan.nextInt();

    if(num > max)
    {
      max = num;
    }
  }
  System.out.println("The max entered is: " + max);
//4.3 for loop
System.out.println("\nFor Loops:");
System.out.println("-------------------------------------------------------");
  System.out.println("\nEnter a number for this for loop.");
  int y = Integer.parseInt(scan.nextLine());
  for (int n = y; n > 0; n--){
    System.out.println(n);
  }
  System.out.println("For loop done!");

//4.4 Algorithms for Strings
System.out.println("\nString Algorithms");
System.out.println("-------------------------------------------------------");
  //Algorithm for Traversing Strings
  System.out.println("\nType in a word or sentence to print vertically:");
    String Vertical = SCAN.nextLine();

  System.out.println();
  for (int i = 0; i < Vertical.length(); i++)
  {
    System.out.println(Vertical.substring(i, i + 1));
  }

//Algorithm for Counting Substrings
  System.out.println("\nType a word or sentence:");
    String Look = SCAN.nextLine();
    System.out.println();

  System.out.println("What letter are you looking for?");
    String Find = SCAN.nextLine();

  if (Find.length() > 1) {
    System.out.println("Must only be one letter.");
    Find = SCAN.nextLine();
  }

  System.out.println();
  int Count = 0;

  for (int i = 0; i < Look.length(); i++) 
  {
    if (Look.substring(i, i + 1).equals(Find)) 
    {
      Count++;
    }
  }
  System.out.println("The letter " + Find + " appears " + Count + " times.");

//Algorithm for Removing Substrings
  System.out.println("\nType a word or sentence:");
    String Search = SCAN.nextLine();
    String Temp = "";
    System.out.println();

  System.out.println("What letter will you remove?");
    String Delete = SCAN.nextLine();

  if (Find.length() > 1) {
    System.out.println("Must only be one letter.");
    Delete = SCAN.nextLine();
  }

  for (int i = 0; i < Search.length(); i++) 
  {
    if (!Search.substring(i, i + 1).equals(Delete)) 
    {
      Temp += Search.substring(i, i + 1);
    }
  }
  System.out.println(Temp);

//Algorithm for Reversing String
  System.out.println("\nType a word or sentence you want to reverse:");
  String Flip = SCAN.nextLine();
  String Flipped = "";

  for (int i = Flip.length(); i > 0; i--) 
  {
    Flipped += Flip.substring(i - 1, i);
  }
  System.out.println(Flipped);

//Algorithm for Inbound
  System.out.println("\nType a word you want to change:");
  String Split = SCAN.nextLine();

  for (int i = 0; i < Split.length(); i++) 
  {
    int Index = (i + Split.length()/2) % Split.length();
    System.out.println(Split.substring(Index , Index+1));
  }
  System.out.println();

//4.5 nested loops
System.out.println("\nNested Loops:");
System.out.println("-------------------------------------------------------");
  System.out.println("\nNested loop:");
  String bob = "fun";
  System.out.println(bob);
  // Outer Loop
  for (int a = 0; a < bob.length(); a++)
  {
    //Inner Loop
  for (int b = 0; b < bob.length(); b++)
  {
    System.out.print(bob.substring(a, a + 1));
  }
  }
  System.out.println();

//4.6 algorithm efficiency
System.out.println("\nAlgorithm Efficiency");
System.out.println("-------------------------------------------------------");
  //the following 3 algorithms check if a string has all unique characters

  int count1 = 0;
  int count2 = 0;
  int count3 = 0;

  //Algorithm 1
  boolean unique1 = true;
  System.out.println("\nEnter a string for algorithm efficiency.");
  String s = scan.nextLine();
  String b = s;
  for (int i = 0; i < s.length(); i++){
    for (int j = 0; j < s.length(); j++){
      count1++;
      if (i != j && s.substring(i, i + 1).equals(s.substring(j, j + 1))) 
      {
        unique1 = false;
      }
    }
  }
  System.out.println("Algorithm 1 count: " + count1);
  if (unique1)
  {
    System.out.println("All unique");
  }
  else
  {
    System.out.println("Contains repeats");
  }

  //Algorithm 2
  boolean unique2 = true;
  for (int i = 0; i < b.length() - 1; i++) 
  {
    for (int j = i + 1; j < b.length(); j++) 
    {
      count2++;
      if (b.substring(i, i + 1).equals(b.substring(j, j + 1))) 
      {
        unique2 = false;
      }
    }
  }
  System.out.println("Algorithm 2 count: " + count2);
  if (unique2)
  {
    System.out.println("All unique");
  }
  else
  {
    System.out.println("Contains repeats");
  }

  //Algorithm 3
  //as soon as this algorithm finds a repeated character, it exits the loop. this is due to it being a while loop and having the boolean as a condition.
  boolean unique3 = true;
  int i = 0;
  while (unique3 == true && i < s.length() - 1) 
  {
    int j = i+1;
    while (unique3 == true && j < s.length()) 
    {
      count3++;
      if (s.substring(i, i + 1).equals(s.substring(j, j + 1))) 
      {
        unique3 = false;
      }
      j++;
    }
    i++;
  }
  System.out.println("Algorithm 3 count: " + count3);
  if (unique3)
  {
    System.out.println("All unique");
  }
  else
  {
    System.out.println("Contains repeats");
  }
System.out.println();
System.out.println("-------------------------------------------------------");
System.out.println("END");
  }


	/**************
if(unit == 4){
        //Unit 4 Examples
        System.out.println("\nUnit 4 Examples:");
        System.out.println("\nType 4.1, 4.2, 4.3, 4.4, 4.5, or 4.6 for the corresponding examples:");
        String unitfour = scan.nextLine();

        //4.1 Example
        if(unitfour.equals("4.1")){
          System.out.println("Please enter an integer:");
          int x = Integer.parseInt(scan.nextLine());
          while (x < 25){
            System.out.print(x + ", ");
            x++;
          }
        }

        //4.2 Example
        if(unitfour.equals("4.2")){
          System.out.println("Please enter an integer:");
          int num = Integer.parseInt(scan.nextLine());
          boolean flag = false;
          int count = 0;
          for(int x = num; x>0; x/=10){
            int digit = x%10; 
            if(digit%2 == 0){ 
              flag = true; 
              count++; 
            }
          }
          if(flag){
            System.out.println(count + " even digits were found.");
          }
          else{
            System.out.println("No even digits were found.");
          }
        }

        //4.3 Example
        if(unitfour.equals("4.3")){
          System.out.println("\nPlease enter a String");
          String str = scan.nextLine();
          for(int i = str.length() - 1; i >= 0; i--){
            System.out.print(str.substring(i, i + 1));
            i--;
          }
        }

        //4.4 Example
        if(unitfour.equals("4.4")){
          System.out.println("\nPlease enter a String");
          String str = scan.nextLine();
          System.out.println("Please enter a character you would like to count");
          String str2 = scan.nextLine();
          int count = 0;
          for(int i = 0; i<str.length(); i++){
            if(str.substring(i, i+1).equals(str2)){
              count++;
            }
          }
          System.out.println(count + "\"" + str2 + "\"" + " found.");
        }

        //4.5 Example
        if(unitfour.equals("4.5")){
          System.out.println("Please enter an integer for the outer loop iteration");
          int a = Integer.parseInt(scan.nextLine());
          System.out.println("Please enter an integer for the inner loop iteration");
          int b =Integer.parseInt(scan.nextLine());
          for(int x = 1; x<=a; x++){
            System.out.println("outer loop iterations: " + x);
            System.out.print("inner loop iterations: ");
            for(int y = 1; y<=b; y++){
              System.out.print(y + " ");
            }
            System.out.println();
          }
        }
        //4.6 Example
        if(unitfour.equals("4.6")){
          System.out.println("\nPlease enter a word");
          String str = scan.nextLine();
          boolean flag = false;
          int count1 = 0;
          int count2 = 0;
          //Algorithm 1
          for(int x = 0; x < str.length(); x++){
            for(int y = 0; y < str.length(); y++){
              count1++;
              if(str.substring(x, x+1).equals(str.substring(y, y+1))){
                flag = true;
              }
            }
          }
          if(flag){
            System.out.println(str + " has repeating characters");
          }
          else{
            System.out.println(str + " does not contain repeating characters");
          }
          //Algorithm 2
          for(int x = 0; x < str.length(); x++){
            for(int y = x+1; y < str.length()-1; y++){
              count2++;
              if(str.substring(x, x+1).equals(str.substring(y, y+1))){
                flag = true;
                break;
              }
            }
          }
          if(flag){
            System.out.println(str + " has repeating characters");
          }
          else{
            System.out.println(str + " does not contain repeating characters");
          }
          System.out.println("Algorithm 1 executions: " + count1);
          System.out.println("Algorithm 2 executions: " + count2);
          if(count1>count2){
            System.out.println("Algorithm 2 is more efficient.");
          }
          else if(count2>count1){
            System.out.println("Algorithm 1 is more efficient.");
          }
        }
      }

	*****************/
}