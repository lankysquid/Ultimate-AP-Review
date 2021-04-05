public class Unit08 {
	public static void unit8 () 
  {
    int[][] twoD = new int[3][3];
    System.out.println("Let's create a 3x3 integer array and fill it with values!\nType your values and hit enter to move onto the next cell.");
    Scanner scan3 = new Scanner(System.in);
    for (int r = 0; r < twoD.length; r++) {
      for (int c = 0; c < twoD[0].length; c++) {
        twoD[r][c] = scan3.nextInt();
      }
    }
    System.out.println("Thanks! Now it's filled.");
    System.out.println("Printing the values:");
    for (int r = 0; r < twoD.length; r++) {
      for (int c = 0; c < twoD[0].length; c++) {
        System.out.print(twoD[r][c] + " ");
      }
      System.out.println();
      }
    scan3.close();
  }
 
}