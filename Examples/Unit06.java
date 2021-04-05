public class Unit06 {
	/**********************
	int[] list = new int[7]; // an array of 7 elements
     
    int[] arr1 = {3, 5, 7}; //the number "3" is at index 0
    // unit 6 lesson 2
    int index = -1;
    int target = 42; 
    int[] arr = {0, 3, -7, 42, 1102};
    for (int i = 0; i < arr.length; i++) {
	    if (arr[i] == target) {
		    index = i;
	    }
    }
    // unit 6 lesson 3
    String[] words = {"my", "hovercraft", "was", "ruined", "by", "sinusoidal", "depleneration"};
    String firstLetters = "";
    for (int i = 0; i < words.length; i++) {
	    firstLetters += words[i].substring(0, 1);
    }
    System.out.println(firstLetters);

    // unit 6 lesson 4

      //insertion algorithm

    for (int i = list.length - 1; i > 2; i--)
    {
      list[i] = list[i - 1];
    }
    list[2] = 10;

      //deletion algorithm

    list[2] = null;
    for (int i = 2; i < list.length - 1; i++)
    {
    list[i] = list[i + 1];
    }

    // unit 6 lesson 5
      //calculates the sum of an array's values
    public static int sum (int[] list)
    {
      int sum = 0;
      for (int x : list)
      {
        sum += x;
      }
    return sum;
    }

		************************/

	/************
	if(unit == 6){
        System.out.println("\nUnit 6 Examples: ");
        System.out.println("\nType 6.1, 6.2, 6.3, 6.4, or 6.5 for the corresponding examples:");
        String input = scan.nextLine();
        //6.1 Example
        if(input.equals("6.1")){
          int [] declareNewList = new int [3];
          System.out.println("Enter integer values.");
          declareNewList[0] = Integer.parseInt(scan.nextLine());
          declareNewList[1] = Integer.parseInt(scan.nextLine());
          declareNewList[2] = Integer.parseInt(scan.nextLine());
          System.out.println("Array length: 3\nContents: " + declareNewList[0] + ", " + declareNewList[1] + ", " + declareNewList[2] + " .");
        }
        //6.2 Example
        if(input.equals("6.2")){
          System.out.println("Pick a number to search: 8, 14, 3, -1, 7, 0, 2");
          int find = Integer.parseInt(scan.nextLine());
          int[] list = {-1, 7, 2, 0, 3, 14, 8};
          int pos =  0;
          for (int i = 0; i <= list.length; i++)
          {
            if(list[i] == find)
            {
              pos = i;
              break;
            }
          }
          System.out.println(find + " is located at index " + pos);
        }
        //6.3 Example
        if(input.equals("6.3")){
          System.out.println("Enter a list of 5 part guests: ");
          String guest [] = new String [5];
          for(int i = 0; i < guest.length; i++){
           guest[i] = scan.nextLine();
          }
           System.out.println("Guest invited: ");
           for (int i = 0; i < guest.length; i++){
             System.out.println(guest[i]);
          }         
        }
        //6.4 Example
        if(input.equals("6.4")){
          String [] guestList = {"Mew", "Gulf", "Ohm", "Fluke", "Boun", "Prem", "Saint", "Zee"};
          System.out.println("Enter name to add to the party guest list: ");
          String newGuest = scan.nextLine();
          System.out.println("Where on the list would you like to add them?");
          int add = Integer.parseInt(scan.nextLine());
          for(int i = 0; i < guestList.length; i++){
            if(i == add){
              guestList[i] = newGuest;
            }
          }
          System.out.println("Updated Guest List: ");
          for(int i = 0; i < guestList.length; i++){
            System.out.println(guestList[i]);
          }
        }
        //6.5 Example
        if(input.equals("6.5")){
          int lucky [] = new int [3];
          System.out.println("Enter 3 integers.");
          lucky[0] = Integer.parseInt(scan.nextLine());
          lucky[1] = Integer.parseInt(scan.nextLine());
          lucky[2] = Integer.parseInt(scan.nextLine());
          for (int i : lucky) 
          {
            System.out.print(i + " ");
          }
        }
      }
	***********/
}