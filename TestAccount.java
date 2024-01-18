public class TestAccount {
  public static void main(String[] args) {
    // Create two accounts
    Account acc1 = new Account("A001", "Acc1", 5000);

    Account acc2 = new Account("A002", "Acc2", 4000);

    // Display balance of both accounts
    System.out.println("Balance of Acc1: $" + acc1.getBalance());
    System.out.println("Balance of Acc2: $" + acc2.getBalance());

    // Transfer $1000 from account 1 to account 2
    acc1.transferTo(acc2, 1000);

    // Display balance of both accounts again after transfer
    System.out.println("Balance of Acc1: $" + acc1.getBalance());

    System.out.println("Balance of Acc2: $" + acc2.getBalance());
  }
}
