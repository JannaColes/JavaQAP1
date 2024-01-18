public class TestAccount {
  public static void main(String[] args) {
    Account acc1 = new Account("A001", "Acc1", 5000);

    Account acc2 = new Account("A002", "Acc2", 4000);

    System.out.println("Balance of Acc1: $" + acc1.getBalance());
    System.out.println("Balance of Acc2: $" + acc2.getBalance());

    acc1.transferTo(acc2, 1000);

    System.out.println("Balance of Acc1: $" + acc1.getBalance());

    System.out.println("Balance of Acc2: $" + acc2.getBalance());
  }
}
