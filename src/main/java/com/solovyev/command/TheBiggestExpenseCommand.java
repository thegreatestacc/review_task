package main.java.com.solovyev.command;

import java.util.Map;
import java.util.Optional;

public class TheBiggestExpenseCommand implements Command {

    private final Map<Integer, Double> expenses;

    private final UserInterface userInterface;

    public TheBiggestExpenseCommand(Map<Integer, Double> expenses,
                                    UserInterface userInterface) {
        this.expenses = expenses;
        this.userInterface = userInterface;
    }

    @Override
    public void execute() {
        Optional<Map.Entry<Integer, Double>> optional = expenses.entrySet().stream()
                .max(Map.Entry.comparingByValue());
        if (optional.isEmpty()) {
            userInterface.showMessage("Самая большая трата за неделю не найдена");
        } else userInterface.showMessage(String.format("Самая большая трата за неделю: %s", optional.get().getValue()));
    }

    @Override
    public int commandNumber() {
        return 5;
    }
}
