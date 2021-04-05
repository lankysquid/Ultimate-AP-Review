import java.util.Scanner;
import java.util.ArrayList;

class Runner {
  public Runner() {
    // implement the code here as if it were a main method, it basically is lol
    Scanner scan = new Scanner(System.in);
    int choice = 0;
    System.out.println("Welcome to the Unit 2 Plagirism Checker!");
    System.out.println("Would you like to check exact match (1), check percentage different (2), or exit (3)?");
    choice = scan.nextInt();
    while (choice != 3) {
      if (choice == 1) {
        Checker.checkExact();
      } else {
        Checker.checkPercentage();
      }
      scan.nextLine();
      System.out.println("\nWelcome back! Would you like to check exact match (1), check percentage different (2), or exit (3)?");
      choice = scan.nextInt();
    }
  }
}
