package Class29;

public class BankAccount {
    double balance;
    public BankAccount(double balance){
        this.balance= balance;
    }

   public void withdraw(double amountToWithdraw){
        if(amountToWithdraw>balance){
            throw new InsufficientBalance("Insufficient balance");
        }
        balance = balance-amountToWithdraw;
    }
}

