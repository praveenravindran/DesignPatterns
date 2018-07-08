package command;

public class BankAccount {
    private int balance;
    private int overDraftLimit = -500;

    public void deposit(int amount){
        balance += amount;
        System.out.println("Deposited amount " + amount + " and balance is " + balance );
    }

    public boolean withdraw(int amount){
        if(balance - amount >= overDraftLimit){
            balance -= amount;
            System.out.println("Withdrew amount " + amount + " and balnce is " + balance);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "BankAccount balance= " + balance;
    }
}
