package main.java.com.solovyev.advice.cases;

public class LessThanFiveThousandCase implements Case {
    @Override
    public boolean checkCondition(int days, double money) {
        return false;
    }

    @Override
    public boolean checkCondition(double money) {
        return money < 5000;
    }

    @Override
    public void giveAdvice() {
        System.out.println("Пока рано копить.");
    }
}
