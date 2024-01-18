public class TestDate {
  public static void main(String[] args) {
    Date myDate = new Date(15, 3, 2022);
 
  System.out.println("Initial Date: " + myDate.toString());

  myDate.setDay(20);
  myDate.setMonth(6);
  myDate.setYear(2023);

  System.out.println("Updated Date: " + myDate.toString());
}

}
