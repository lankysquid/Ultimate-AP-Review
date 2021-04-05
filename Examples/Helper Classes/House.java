public class House {
  //Alison
  private int numResidents;
  private boolean occupied;
  private String address;

  /*show use of:
   declaration and instantiation, 
   overloaded constructors and methods, 
   methods with void and non-void return types
  */

  //overloaded cosntructors
  public House () 
  {
    this(null);
  }

  public House (String address)
  {
    this(0, false, address);
  }

  public House (int numResidents, boolean occupied, String address)
  {
    this.numResidents = 0;
    this.address = "Unknown";
    
    this.occupied = occupied;
    if (numResidents > 0)
      this.numResidents = numResidents;
    if (address != null)
      this.address = address;
  }

  //overloaded methods
  public void addResident() 
  {
    this.numResidents++;
  }

  public void addResident(int numResidents)
  {
    if (numResidents > 0)
      this.numResidents += numResidents;
  }

  public int getNumResidents ()
  {
    return numResidents;
  }

  public String toString() 
  {
    String occupiedText = "Occupied";
    if (!occupied)
      occupiedText = "Not " + occupiedText;
    return "Address:\n" + address + 
          "\nNumber of Residents: " + getNumResidents() + 
          "\n" + occupiedText;
  }


}