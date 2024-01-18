public class Time {
  // Private instance variables to store hour, minute and second
  private int hour;
  private int minute;
  private int second;

  // Constructor to initialize the  time object with the specified hour, minute and second
  public Time(int hour, int minute, int second) {
    setTime(hour, minute, second);
  }

  // Getter methods
  public int getHour() {
    return hour;
  }

  public int getMinute() {
    return minute;
  }

  public int getSecond() {
    return second;
  }

  // Setter methods for the hour, minute and second variables using input validation
  public void setHour(int hour) {
    if (hour >= 0 && hour <= 23) {
      this.hour = hour;
    }
  }

  public void setMinute(int minute) {
    if (minute >= 0 && minute <= 59) {
      this.minute = minute;
    }
  }

  public void setSecond(int second) {
    if (second >= 0 && second <= 59) {
      this.second = second;
    }
  }
  
  public void setTime(int hour, int minute, int second) {
    setHour(hour);
    setMinute(minute);
    setSecond(second);
  }

  // Override the toString method to return the time in the specified format
  public String toString() {
    return String.format("%02d:%02d:%02d", hour, minute, second);
  }

  // Method to increment the time by one second
  public Time nextSecond() {
    second++;
    if (second == 60) {
      second = 0;
      minute++;
      if (minute == 60){
        minute = 0;
        hour++;
        if (hour == 24) {
          hour = 0;
        }
      }
    }
    return this;
  }

  // Method to decrement the time by one second
  public Time previousSecond() {
    second--;
    if (second < 0) {
      second = 59;
      minute--;
      if (minute < 0) {
        minute = 59;
        hour--;
        if (hour < 0) {
          hour = 23;
        }
      }
    }
    return this;
  }
}
