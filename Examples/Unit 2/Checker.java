import java.util.Scanner;

public class Checker {
  public static void checkExact() {
    // this method checks if the two inputted texts are exactly the same

    // defining variables
    Scanner scan = new Scanner(System.in);
    String firstText;
    String secondText;

    // get text pieces to compare
    System.out.println("\nWhat is the first piece of text?");
    firstText = scan.nextLine();
    System.out.println("What is the text you want to compare the first text to?");
    secondText = scan.nextLine();

    // compare the texts with compareTo
    if (firstText.compareTo(secondText) == 0) {
      System.out.println("They are the same text!");
    } else if (firstText.compareTo(secondText) > 0) {
      System.out.println("The second text has more characters than the first text!");
    } else {
      System.out.println("The first text has more characters than the second text!");
    }
  }

  public static void checkPercentage() {
    /* this is the more interesting method, 
    it checks the difference in percentage, 
    as in calculates what percent of characters 
    are the same and what percent are different */

    // variable declaration
    int sameChar = 0;
    int diffChar = 0;
    int firstLength;
    int secondLength;
    int longerString;
    double sameCharResult;
    double diffCharResult;
    String firstText;
    String secondText;
    Scanner scan = new Scanner(System.in);

    // get text pieces
    System.out.println("\nWhat is the first piece of text?");
    firstText = scan.nextLine();
    System.out.println("What is the text you want to compare the first text to?");
    secondText = scan.nextLine();
    System.out.println("\n");
    
    // get longer string, then fill shorter string with spaces so as to not cause an overflow
    firstLength = firstText.length();
    secondLength = secondText.length();
    if (firstLength > secondLength) {
      longerString = firstLength;
      for (int i = 0; i < longerString - secondLength; i++) {
        secondText += " ";
      }
    } else {
      longerString = secondLength;
      for (int i = 0; i < longerString - firstLength; i++) {
        firstText += " ";
      }
    }
    
    // compare strings char by char, incrementing respective counter. could be inefficient for long text but hey not my problem atm
    for (int i = 0; i < longerString; i++) {
      if (firstText.charAt(i) == secondText.charAt(i)) {
        sameChar++;
      } else {
        diffChar++;
      }
    }
    
    // calculate percentage then display it
    sameCharResult = (double) sameChar / longerString * 100;
    diffCharResult = (double) diffChar / longerString * 100;
    System.out.println("The two strings are " + sameCharResult + "% the same!");
    System.out.println("The two strings are " + diffCharResult + "% different!");
  }
}