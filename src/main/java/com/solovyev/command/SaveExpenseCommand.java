package main.java.com.solovyev.command;

import main.java.com.solovyev.command.model.MoneyBeforeSalary;

import java.util.Map;

public class SaveExpenseCommand implements Command {


    private final Map<Integer, Double> exp;

    private final UserInterface userInterface;

    private final MoneyBeforeSalary moneyBeforeSalary;

    public SaveExpenseCommand(Map<Integer, Double> exp,
                              UserInterface userInterface,
                              MoneyBeforeSalary moneyBeforeSalary) {
        this.exp = exp;
        this.userInterface = userInterface;
        this.moneyBeforeSalary = moneyBeforeSalary;
    }

    @Override
    public void execute() {
        userInterface.showMessage("За какой день вы хотите ввести трату: 1-ПН, 2-ВТ, 3-СР, 4-ЧТ, 5-ПТ, 6-СБ, 7-ВС?");
//        int day = Integer.parseInt(userInterface.readUserInput());
        int day = userInterface.readUserInput();
        userInterface.showMessage("Введите размер траты:");
//        double expense = Double.parseDouble(userInterface.readUserInput());
        double expense = userInterface.readUserInput();
        double difference = moneyBeforeSalary.getValue() - expense;
        moneyBeforeSalary.setValue(difference);
        exp.put(day, expense);
//        expenses.set(day - 1, expenses.get(day - 1) + expense);
        userInterface.showMessage("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary.getValue());

        if (moneyBeforeSalary.getValue() < 1000) {
            userInterface.showMessage("На вашем счету осталось совсем немного. Стоит начать экономить!");
        }
    }

    @Override
    public int commandNumber() {
        return 3;
    }
}
