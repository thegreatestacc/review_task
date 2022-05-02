package main.java.com.solovyev.command;

import main.java.com.solovyev.command.model.MoneyBeforeSalary;
import main.java.com.solovyev.converter.Converter;
import main.java.com.solovyev.converter.USDCurrencyConverter;
import main.java.com.solovyev.converter.EURCurrencyConverter;
import main.java.com.solovyev.converter.JPYCurrencyConverter;

public class ConvertCommand implements Command {

    private final UserInterface userInterface;
    private final MoneyBeforeSalary moneyBeforeSalary;
    Converter converter = new Converter(
            new USDCurrencyConverter(),
            new EURCurrencyConverter(),
            new JPYCurrencyConverter()
    );

    public ConvertCommand(UserInterface userInterface, MoneyBeforeSalary moneyBeforeSalary) {
        this.userInterface = userInterface;
        this.moneyBeforeSalary = moneyBeforeSalary;
    }

    @Override
    public void execute() {
        userInterface.showMessage("Ваши сбережения: " + moneyBeforeSalary.getValue() + " RUB");
        userInterface.showMessage("В какую валюту хотите конвертировать? Доступные варианты: 1 - USD, 2 - EUR, 3 - JPY.");
        int currency = userInterface.readUserInput();
        converter.convert(moneyBeforeSalary.getValue(), currency);
    }

    @Override
    public int commandNumber() {
        return 1;
    }
}
