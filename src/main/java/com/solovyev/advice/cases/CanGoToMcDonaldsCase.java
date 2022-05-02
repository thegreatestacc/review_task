package main.java.com.solovyev.advice.cases;

public class CanGoToMcDonaldsCase implements Case {

    @Override
    public boolean checkCondition(int days, double money) {
        return (money < 10000 && days < 10) || (money < 30000 && !(days < 10));
    }

    @Override
    public boolean checkCondition(double money) {
        return false;
    }

    @Override
    public void giveAdvice() {
        System.out.println("Окей, пора в Макдак!");
    }
}
