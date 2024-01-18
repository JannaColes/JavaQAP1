public class Date {
  // Private instance variables
  private int day;
  private int month;
  private int year;

  // Constructor with three parameters (day, month and year)
  public Date(int day, int month, int year) {
    setDate(day, month, year);
  }

  // Getter methods
  public int getDay() {
    return day;
  }

  public int getMonth() {
    return month;
  }

  public int getYear() {
    return year;
  }

  // Setter methods
  public void setDay(int day) {
    this.day = day;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public void setYear(int year) {
    this.year = year;
  }

  // Method to set the entire date
  public void setDate(int day, int month, int year) {
    setDay(day);
    setMonth(month);
    setYear(year);
  }

  // toString method to display the date in the specified format
  public String toString() {
    return String.format("%02d/%02d/%04d" , day, month, year);
  }
}

