package main.java.com.solovyev.command;

import java.util.Map;

public class PrintAllExpensesCommand implements Command {

    private final UserInterface userInterface;
    private final Map<Integer, Double> expenses;

    public PrintAllExpensesCommand(
            UserInterface userInterface,
            Map<Integer, Double> expenses) {
        this.expenses = expenses;
        this.userInterface = userInterface;
    }

    @Override
    public void execute() {
        for (Map.Entry<Integer, Double> entry : expenses.entrySet()) {
            String message = "День " + entry.getKey() + ". Потрачено " + entry.getValue() + " рублей";
            userInterface.showMessage(message);
        }
    }

    @Override
    public int commandNumber() {
        return 4;
    }
}
