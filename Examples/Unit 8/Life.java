import java.io.*;
import java.util.Scanner;

public class Life {
  static int[][] board = new int[5][5];

  public static void readBoard() {
    System.out.println("Please input the values of the matrix separated by commas");
    System.out.println("Sample input: 0,0,0,0,0 [line.lenght() = 5]");
    System.out.println("line.lenght() = " + board.length);

    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < board.length; i++) {
      int[] line = { 0,0,0,0,0 };
      System.out.print("Line ["+i+"] ");
      String[] inp = sc.nextLine().split(",", 0);
      for (int j = 0; j < inp.length; j++) {
        if (j >= 10) break;
        if (Integer.parseInt(inp[j]) > 1) {
          line[j] = 1;
        } else if (Integer.parseInt(inp[j]) < 0) {
          line[j] = 0;
        } else {
          line[j] = Integer.parseInt(inp[j]);
        }
      }
      board[i] = line;
    }
    sc.close();
  }

  public static void printBoard() {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static int getNeighbors(int i, int j) {
    int neighbors = 0;
    if (board[i][j] == 1) neighbors = -1;

    for (int k = i-1; i <= i+1; i++) {
      for (int l = j-1; j <= j+1; j++) {
        if (k >= 0 && k <= board.length) {
           if (l >= 0 && l <= board[0].length) {
             if (board[k][l] == 1) neighbors++;
          }
        }
      }
    }

    return neighbors;
  }

  public static int[][] nextGeneration() {
    int[][] nextBoard = new int[board.length][board[0].length];
    int newCell = 0;

    for (int i = 0; i < nextBoard.length; i++) {
      for (int j = 0; j < nextBoard[0].length; j++) {
        newCell = getNeighbors(i, j);
        if (board[i][j] == 1 && (newCell == 2 || newCell == 3)) {
          nextBoard[i][j] = 1;
        } else if (board[i][j] == 0 && newCell == 3) {
          nextBoard[i][j] = 1;
        } else { 
          nextBoard[i][j] = 0;
        }
      }
    }

    return nextBoard;
  }

  public Life() {
    System.out.println("This is unit 8!");
    System.out.println("Conway's Game of Life");
    System.out.println("Warning extremely slow!");
    System.out.println("or 'real time' ;)");
    readBoard();

    printBoard();

    for (int i = 0; i < 5; i++) {
      System.out.println("Generation: " + i);
      board = nextGeneration();
      printBoard();
    }
  }
}