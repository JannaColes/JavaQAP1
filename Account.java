public class Account {
  private String id;
  private String name;
  private int balance = 0;

  // Constructor with two parameters (id and name)
  public Account(String id, String name) {
    this.id = id;
    this.name = name;
  }

// Constructor with three parameters (id, name and balance)
  public Account(String id,String name, int balance) {
    this.id = id;
    this.name = name;
    this.balance = balance;
  }

  // Getter methods
  public String getID() {
    return id;
  }
  public String getName() {
    return name;
  }

  public int getBalance() {
    return balance;
  }

  // Credit method
  public int credit(int amount) {
    balance += amount;
    return balance;
  }

  // Debit method
  public int debit(int amount) {
    if (amount <= balance) {
      balance -= amount;
    } else {
      System.out.println("Amount exceeded balance");
    }
    return balance;
  }

  // Transfer method
  public int transferTo(Account another, int amount) {
    if (amount <= balance) {
      this.debit(amount);
      another.credit(amount);
    } else {
      System.out.println("Amount exceeded balance:");
    }

    return balance;
  }

  // toString method
  public String toString() {
    return "Account[id=" + id + ",name=" + ",balance=" + balance + "]";
  }

}
