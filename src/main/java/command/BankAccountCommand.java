package command;

public class BankAccountCommand implements Command {

    private int amount;

    private BankAccount account;

    private Action action;

    boolean succeded;

    public BankAccountCommand(int amount, BankAccount account, Action action) {
        this.amount = amount;
        this.account = account;
        this.action = action;
    }

    @Override
    public void call() {
        switch (action){
            case DEPOSIT:
                succeded = true;
                account.deposit(amount);
                break;
            case WITHDRAW:
              succeded = account.withdraw(amount);
                break;
        }
    }

    @Override
    public void undo() {

        if(!succeded)
            return;

        switch (action){
            case DEPOSIT:
                account.withdraw(amount);
                break;
            case WITHDRAW:
                account.deposit(amount);
                break;
        }
    }


    public enum Action{
        DEPOSIT, WITHDRAW;
    }

}
