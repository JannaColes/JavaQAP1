public class TestDate {
  // Create a Date object with initial values
  public static void main(String[] args) {
    Date myDate = new Date(15, 3, 2022);
 
    // Print the date using the toString method
  System.out.println("Initial Date: " + myDate.toString());

  // Change the date using setter methods
  myDate.setDay(20);
  myDate.setMonth(6);
  myDate.setYear(2023);

  // Print the updated date using the toString method
  System.out.println("Updated Date: " + myDate.toString());
}

}
