package command;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        List<BankAccountCommand> commands = new ArrayList<>();
        commands.add(new BankAccountCommand(100, bankAccount, BankAccountCommand.Action.DEPOSIT));
        commands.add( new BankAccountCommand(1000, bankAccount, BankAccountCommand.Action.WITHDRAW));

        for(Command c : commands){
            c.call();
        }
        System.out.println(bankAccount);

        Collections.reverse(commands);

        for (Command c: commands){
            c.undo();
        }

        System.out.println(bankAccount);
    }
}
