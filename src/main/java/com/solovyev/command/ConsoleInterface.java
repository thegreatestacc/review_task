package main.java.com.solovyev.command;

import java.util.Scanner;

public class ConsoleInterface implements UserInterface {

    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void displayOptions() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Конвертировать валюту");
        System.out.println("2 - Получить совет");
        System.out.println("3 - Ввести трату");
        System.out.println("4 - Показать траты за неделю");
        System.out.println("5 - Показать самую большую сумму расходов за неделю");
        System.out.println("0 - Выход");
    }

    @Override
    public int readUserInput() {
        return scanner.nextInt();
    }

    @Override
    public void showMessage(String s) {
        System.out.println(s);
    }
}
