package Class30;

import Class29.BankAccount;

public class E7Methods {
    public static void main(String[] args) {
        E7Methods e4Methods = new E7Methods();
        BankAccount bankAccount= new BankAccount(20);
        e4Methods.print(bankAccount);


    }

    public void print(BankAccount bankAccount){
       bankAccount.withdraw(10);
    }

}
