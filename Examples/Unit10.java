public class Unit10 {
	 public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("\nSorting an int array. This also provides the runtime of the mergeSort method in milliseconds. Try making a huge array (maybe 1000) and choose randomize.\n");
    System.out.println("Length of the array?");
    int input = Integer.parseInt(scan.nextLine());
    while (input <= 0) {
      System.out.println("Invalid number. Please try again.\n");
      input = Integer.parseInt(scan.nextLine()); 
    }
    int[] array = new int[input];
    input = -1;
    System.out.println("\nDo you want to input your own numbers or have random numbers used?");
    System.out.println("0 - Input own numbers\n1 - Randomize (numbers 1-1000 inclusive)");
    input = Integer.parseInt(scan.nextLine());
    while (input != 0 && input != 1) {
      System.out.println("Invalid number. Please try again.\n");
      System.out.println("0 - Input own numbers\n1 - Randomize");
      input = Integer.parseInt(scan.nextLine());
    }
    if (input == 0) {
      System.out.println("\nInput numbers.");
      for (int i = 0; i < array.length; i++) {
        array[i] = Integer.parseInt(scan.nextLine());
      }
      System.out.println("\nUnsorted array:\n" + Sort.toStringArray(array));
      long startTime = System.nanoTime();
      Sort.mergeSort(array);
      long endTime = System.nanoTime();
      System.out.println("\nSorted Array:\n" + Sort.toStringArray(array));
      System.out.println("\nRuntime: " + ((double)(endTime-startTime)/1000000) + " milliseconds.");
    } else {
      for (int i = 0; i < array.length; i++) {
        array[i] = (int)(Math.random() * 1000) + 1;
      }
      System.out.println("\nUnsorted array:\n" + Sort.toStringArray(array));
      long startTime = System.nanoTime();
      Sort.mergeSort(array);
      long endTime = System.nanoTime();
      System.out.println("\nSorted Array:\n" + Sort.toStringArray(array));
      System.out.println("\nRuntime: " + ((double)(endTime-startTime)/1000000) + " milliseconds.");
    }
  }
	/********************
 if(unit == 10){
      //Unit 10 Examples
        System.out.println("\nUnit 10 Examples: ");
        System.out.println("\nType 10.1, 10.2, 10.3, or 10.4 for the corresponding examples:");
        String test = scan.nextLine();

        //10.1 Example
        if(test.equals("10.1")){
            System.out.println("\nPlease enter an integer");
            int x = Integer.parseInt(scan.nextLine());
            System.out.println();
            baseCaseExample(x);
        }

        //10.2 Example
        if(test.equals("10.2")){
            System.out.println("\nPlease enter a string");
            String str = scan.nextLine();
            System.out.print("\n" + returnRecursion(str));
        } 

        //10.3 Example
        if(test.equals("10.3")){
            String[] arr = new String[10];
            arr[0] = "alpha";
            arr[1] = "bravo";
            arr[2] = "charlie";
            arr[3] = "delta";
            arr[4] = "echo";
            arr[5] = "foxtrot";
            arr[6] = "golf";
            arr[7] = "hotel";
            arr[8] = "india";
            arr[9] = "juliet";

            System.out.println("\nPlease enter your target(1 of the first 10 code words for the military phonetic alphabet):");
            String target = scan.nextLine();
            System.out.println("\nIndex of target: " + binarySearch(arr, target));
            
        }

        //10.4 Example
        if(test.equals("10.4")){
          int[] numbers = new int[] {45, 23, 43, 12, 4, 8, 76, 48, 62, 32, 26, 45, 90, 54, 32, 54, 2, 16, 28, 42};
          System.out.print("\nOriginal list: ");
          for(int x = 0; x<numbers.length; x++){
            System.out.print(numbers[x] + ", ");
          }
          sort(numbers, 0, numbers.length);
          System.out.print("\nSorted list: ");
          for(int y = 0; y<numbers.length; y++){
            System.out.print(numbers[y] + ", ");
          }
        }
      }

      System.out.println("\nType which unit you would like to see: 4, 6, or 10.\nEnter -1 to quit");
      unit = Integer.parseInt(scan.nextLine());
    }
  }
    //10.1 Method
    public static void baseCaseExample(int x){
        if(x == 3){
            System.out.print("This should print 3: " + x);
            }
        if(x > 3){
            System.out.print(x + " ");
            baseCaseExample(x - 1);
        }
        if(x < 3){
            System.out.print(x + " ");
            baseCaseExample(x + 1);
        }
    }
    
    //10.2 Method
    public static String returnRecursion(String str){
        if(str.length() <= 3){
            return str;
        }
        return "$" + returnRecursion(str.substring(0, str.length()-1));
    }

    //10.3 Method
    public static int binarySearch(String[] array, String target){
    boolean found = false;
    int ind = -1;
    int low = 0;
    int high = array.length;
        while(found == false){
            int mid = (low + high)/2;
            if(array[mid].equals(target)){
                found = true;
                ind = mid;
            }
            if(target.compareTo(array[mid]) > 0){
                low = mid;
            }else if(target.compareTo(array[mid]) < 0){
                high = mid;
            }
        }
        return ind;
    }   

    //10.4 method

  public static void sort(int [] arr, int begin, int end){
    if(begin<end){
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


	******/
}