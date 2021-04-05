import java.io.*;
import java.util.Scanner;

public class Multiply{
  static int[][] tab;

  public Multiply(){
    Scanner scan = new Scanner(System.in);
    boolean play = true;
    System.out.println("Height of table?");
    int a = scan.nextInt();
    System.out.println("Width of table?");
    int b = scan.nextInt();
    tab = createTable(a,b);
    while(play){
      System.out.println("Welcome what would you like to do? 1) View table 2) View specific value 3) Exit");
      int choice = scan.nextInt();
      if(choice == 1){
        printTable();
      }
      else if(choice == 2){
        System.out.println("Which x coordinate?");
        int c = scan.nextInt();
        System.out.println("Which y coordinate?");
        int d = scan.nextInt();
        printValue(c,d);
      }
      else if(choice == 3){
        System.out.println("Goodbye!");
        play = false;
      }

    }
  }

  public static int[][] createTable(int h,int w){
    int[][] table = new int[h][w];
    for(int i = 0; i < h; i++){
      table[0][i] = i+1;
    }
    for(int j = 0; j < w; j++){
      table[j][0] = j+1;
    }
    for(int k = 0; k < h; k++){
      for(int l = 0; l < w; l++){
        table[k][l] = k*l;
      }
    }
    return table;
  }
  public static void printTable(){
    System.out.println("");
    for(int a = 0; a < tab.length; a++){
      for(int b = 0; b < tab[0].length; b++){
        System.out.print(tab[a][b] + " ");
      }
      System.out.println("");
    }
  }
  public static void printValue(int first, int second){
    System.out.println("The value is: " + tab[first][second]);
  }

}