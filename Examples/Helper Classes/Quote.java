import java.util.*;
public class Quote
{
  //U2 lesson 1, 2, and 3 (Brandon F)
  //Code allows a user to save quotes into an array, search them by name, and find the length of names, orgainize them alphabetically, and see how many quotes belong to the same person.
  private String quote;
  private String name;
  private ArrayList<Quote> allQuotes = new ArrayList<Quote>();

  //constructor: these are what create the class itself.

  public Quote(String q, String n)
  {
    quote = q;
    name = n;
  }
  public Quote()
  {
    quote = "quote";
    name = "name";
  }

  //Set and Get Methods: these are what allow  the coder to create the variables of an object and change them from the Main.

  public String getName()
  {
    return name;
  }
  public String getQuote()
  {
    return quote;
  }
  public void setQuote(String q)
  {
    quote = q;
  }
  public void setName(String n)
  {
    name = n;
  }

  //The toString method prints the class in the console.

  public String toString()
  {
    return "\n\"" + quote + "\"" + "\n\t- " + name + "\"";
  }

  public void addQuote(Quote a)
  {
    allQuotes.add(a);
  }

  //returns the number of quotes who were said by the same person.

  public static int numberOfQuotesByName(ArrayList<Quote> q, String n)
  {
    int tot=0;
    for(int a=0; a<=q.size()-1; a++)
    {
      if(q.get(a).getName().equals(n))
      {
        tot++;
      }
    }
    return tot;
  }

  public void printAllQuotes()
  {
    for(int a=0; a<=allQuotes.size(); a++)
    {
      System.out.println(allQuotes.get(a).toString());
    }
  }

  public void printQuotesByName(String n)
  {
    for(int a=0; a<=allQuotes.size()-1; a++)
    {
      if(allQuotes.get(a).getName().equals(n))
      {
        System.out.println(allQuotes.get(a).toString());
      }
    }
  }

  //This sorts the quotes by the name of who said the quote using the compareTo method.

  public static void sortQuotesByName(ArrayList<Quote> q)
  {
    for (int a = 1; a < q.size(); a++)
    {
      Quote temp = q.get(a);
      int ind = a; 
      
      while (ind > 0 && temp.getName().compareTo(q.get(ind-1).getName()) < 0)
      {
        q.set(ind, q.get(ind-1));
        ind--;
      }
      q.set(ind, temp);
    }
  }
  
}