package main.java.com.solovyev.command;

public class ExitCommand implements Command {

    private final UserInterface userInterface;

    public ExitCommand(UserInterface userInterface) {
        this.userInterface = userInterface;
    }

    @Override
    public void execute() {
        userInterface.showMessage("Выход из программы...");
        System.exit(0);
    }

    @Override
    public int commandNumber() {
        return 0;
    }
}
