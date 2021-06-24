

public class Main {
    public static void main(String[] args) {


       BankAccount myBankAccount = new BankAccount("Samay", 100000);

       myBankAccount.withdraw(1000);
       System.out.println(myBankAccount.getTheBalanceRight());


    }
}
