package main.java.com.solovyev;

import main.java.com.solovyev.advice.Adviser;
import main.java.com.solovyev.command.*;
import main.java.com.solovyev.command.model.DaysBeforeSalary;
import main.java.com.solovyev.command.model.MoneyBeforeSalary;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Practicum {
    public static void main(String[] args) {

        Map<Integer, Double> expenses = new HashMap<>();
        Adviser adviser = new Adviser();
        UserInterface userInterface = new ConsoleInterface();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько денег у вас осталось до зарплаты?");
        MoneyBeforeSalary moneyBeforeSalary = new MoneyBeforeSalary(scanner.nextDouble());
        System.out.println("Сколько дней до зарплаты?");
        DaysBeforeSalary daysBeforeSalary = new DaysBeforeSalary(scanner.nextInt());

        Map<Integer, Command> commands = Stream.of(
                        new ConvertCommand(userInterface, moneyBeforeSalary),
                        new PrintAllExpensesCommand(userInterface, expenses),
                        new SaveExpenseCommand(expenses, userInterface, moneyBeforeSalary),
                        new GetAdviceCommand(adviser, moneyBeforeSalary, daysBeforeSalary), //deleted user interface
                        new TheBiggestExpenseCommand(expenses, userInterface),
                        new ExitCommand(userInterface))
                .collect(Collectors.toMap(Command::commandNumber, Function.identity()));

        while (true) {
            userInterface.displayOptions();
            Command command = commands.get(userInterface.readUserInput());
            if (command == null) {
                System.out.println("Извините, такой команды пока нет.");
                continue;
            }
            command.execute();
        }
    }
}