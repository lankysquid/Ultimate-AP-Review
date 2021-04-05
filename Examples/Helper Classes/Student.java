public class Student { // Unit 5 Lesson 5, 6, 7

  private String name;
  private int gradeLvl;
  private int idNumber;

  public Student() {
    this("Unknown", 9, 0);
  }

  public Student(String n, int grd, int id) {
    name = n;
    idNumber = id;
    setGrade(grd);
  }

  /*
   * @return a String, the student's name
   */
  public String getName() {
    return name;
  }

  /*
   * @return an int, the student's grade level
   */
  public int getGrade() {
    return gradeLvl;
  }

  /*
   * @return an int, the student's id number
   */
  public int getID() {
    return idNumber;
  }

  /*
   * Sets a student's grade level to a new grade level
   * Postcondition: Grade level will always be 9 inclusive to 12 inclusive
   * @param newGrade an int indicating what new grade level to set the student to
   */
  public void setGrade(int newGrade) {
    if (newGrade >= 9 && newGrade <=12)
      gradeLvl = newGrade;
    else gradeLvl = 9;
  }

  /*
   * @return a String formatted to display student name, id number, and grade level
   */
public String toString() {
  return name + "\n" + "Student ID: " + idNumber + "\nGrade Level: " + gradeLvl;
}

  /*
   * Compares two students to see if they are the same student
   * Precondition: Student a is not null
   * Postcondition: Will always return either true or false
   * @param a Student by which the method is comparing to
   * @return a boolean true if students have same name, grade level, and id number, false if otherwise
   */
public boolean equals(Student a) {
  if (name.equals(a.getName()) && gradeLvl == a.getGrade() && idNumber == a.getID())
    return true;
  return false;
}
  
}