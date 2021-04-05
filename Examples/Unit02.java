public class Unit02 {

/*********
	 if (unit == 2) {
      System.out.println("\nInput a number to select a lesson: \n1. Lesson 1, 2, 3 \n2. Lesson 4, 5, 6 \n3. Lesson 7, 8");
      int lesson = Integer.parseInt(scan.nextLine());

      if (lesson == 1)
      {
        //lesson 1, 2, 3 (Brandon)
        System.out.println("\nUnit 2: Lessons 1, 2, 3");

        //Creating the object using a constructor
        Quote a = new Quote();
        Quote b = new Quote("Not all who wander are lost", "J.R.R. Tolkien");
        Quote c = new Quote("All great thoughts are concived by walking", "Friedrich Nietzche");
        Quote d = new Quote("Even the smallest person can change the course of the future", "J.R.R. Tolkien");

        //Setting up an arraylist
        ArrayList <Quote> quotes = new ArrayList <Quote>();
        quotes.add(a);
        quotes.add(b);
        quotes.add(c);
        quotes.add(d);

        //Using .compareTo() to sort a list of strings (Please see Quote Class)
        System.out.println(" ");
        System.out.println(quotes);
        Quote.sortQuotesByName(quotes);
        System.out.println(quotes);

        //Returning a string's Length using .length()
        System.out.println(" ");
        System.out.println("The quote \"" + a.getQuote() + "\" said by " + a.getName() + " has " + a.getQuote().length() + " characters.");

        //Using .equals() to see how many quotes were said by the same person (Please see Quote class)
        System.out.println(" ");
        System.out.println(Quote.numberOfQuotesByName(quotes, "J.R.R. Tolkien") + " quotes in this list were said by J.R.R. Tolkien");
        System.out.println(" ");

      }


      if (lesson == 2)
      {
        //Unit 2
        //Lesson 4, 5, 6 (Alison)
        System.out.println("\nUnit 2: Lesson 4, 5, 6\n");

        //using declaration, instantiation, and overloaded constructors
        House myHouse = new House();
        House yourHouse = new House("1111 Green Ave \nSunset Valley, Delirium Province 107978");
        House randomHouse = new House(5, true, "5678 Bullbery Drive \nWest Cranberry, Autowa Province 587923");
        
        //display initial states of houses
        //toString method, a non-void method which returns a String, is called
        System.out.println(myHouse + "\n");
        System.out.println(yourHouse + "\n");
        System.out.println(randomHouse + "\n");

        //calling void methods
        myHouse.addResident();
        yourHouse.addResident(3);

        //calling non-void methods that return int data type
        System.out.println("Number of residents in myHouse: " + myHouse.getNumResidents());
        System.out.println("Number of residents in yourHouse: " + yourHouse.getNumResidents());
      }


      if (lesson == 3)
      {
        System.out.println("Input a number to select a Math Method or 5 to exit: " + "\n" + "1. Absolute Value method" + "\n" + "2. Power/Exponent method" + "\n" + "3. Square Root method" + "\n" + "4. Random Numbers method");
        int mathmethod = scan.nextInt();
        while (mathmethod != 5){
          if (mathmethod == 1){
            System.out.println("Enter a number to return its absolute value");
            double abs = scan.nextDouble();
            System.out.println(Math.abs(abs));
            //returns absolute value
          }
          if (mathmethod == 2){
            System.out.println("Enter two numbers to return the first raised to the second");
            double first = scan.nextDouble();
            double second = scan.nextDouble();
            System.out.println(Math.pow(first,second));
            //returns first raised to the second
          }
          if (mathmethod == 3){
            System.out.println("Enter a number to return its square root");
            double sqroot = scan.nextDouble();
            System.out.println(Math.sqrt(sqroot));
            //returns square root
          }
          if (mathmethod == 4){
            System.out.println("Enter two number as the minimum number and range, respectively, to return a random number ");
            double min = scan.nextDouble();
            double range = scan.nextDouble();
            System.out.println((int)(Math.random()*range)+min);
            //returns random number given min and range
          }
          System.out.println("Input a number to select a Math Method or 5 to exit: " + "\n" + "1. Absolute Value method" + "\n" + "2. Power/Exponent method" + "\n" + "3. Square Root method" + "\n" + "4. Random Numbers method");
          mathmethod = scan.nextInt();
          //loops to try math methods until user says to stop 
        }
      }
    }
*****/
}