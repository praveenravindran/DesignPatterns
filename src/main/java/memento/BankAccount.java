package memento;

public class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public Memento deposit(int amount){
        this.balance += amount;
        return new Memento(balance);
    }

    public void restore(Memento memento){
        this.balance = memento.getBalance();
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return String.valueOf(balance);
    }
}
