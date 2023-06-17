package Class23;

public class BankAccount {
    private String userName;
    private String password;
    private double accountBalance= 120;


    public BankAccount(String userName, String password){
        this.userName = userName;
        this.password = password;
    }
    public double getAccountBalance(String password){
        if(password.equals(this.password)){
            return accountBalance;
        }else{
            return 0;
        }
    }
    public void setAccountBalance(double balance){
        accountBalance = balance;
    }

    void setPassword(String password){
        this.password = password;
    }

}

class BankTester{
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("loe12", "mex");
        System.out.println(bankAccount.getAccountBalance("mex"));
        bankAccount.setAccountBalance(100000);
    }
}
