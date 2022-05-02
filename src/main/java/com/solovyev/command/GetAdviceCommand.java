package main.java.com.solovyev.command;

import main.java.com.solovyev.advice.Adviser;
import main.java.com.solovyev.command.model.DaysBeforeSalary;
import main.java.com.solovyev.command.model.MoneyBeforeSalary;

public class GetAdviceCommand implements Command {

    private final Adviser adviser;

    private final MoneyBeforeSalary moneyBeforeSalary;

    private final DaysBeforeSalary daysBeforeSalary;

    public GetAdviceCommand(
            Adviser adviser,
            MoneyBeforeSalary moneyBeforeSalary,
            DaysBeforeSalary daysBeforeSalary) {
        this.adviser = adviser;
        this.moneyBeforeSalary = moneyBeforeSalary;
        this.daysBeforeSalary = daysBeforeSalary;
    }

    @Override
    public void execute() {
        adviser.getFoodAndCurrencyAdvice(daysBeforeSalary.getValue(), moneyBeforeSalary.getValue());
        adviser.getCurrencyAdvice(moneyBeforeSalary.getValue());
    }

    @Override
    public int commandNumber() {
        return 2;
    }
}
