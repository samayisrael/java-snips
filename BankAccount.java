public class BankAccount {

    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
      this.owner = owner;
      this.balance = Math.max(balance, 0);
    }

    public void withdraw(double withdrawAmount) {
      this.balance = this.balance - withdrawAmount;
    }

    public void deposit(double depositAmount) {
      this.balance = this.balance + depositAmount;
    }

    public String getAccountOwner(){
      return this.owner;
    }

    public double getTheBalanceRight() {
      return this.balance;
    }

}
