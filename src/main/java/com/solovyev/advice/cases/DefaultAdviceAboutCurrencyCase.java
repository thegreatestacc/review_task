package main.java.com.solovyev.advice.cases;

public class DefaultAdviceAboutCurrencyCase implements Case {

    @Override
    public boolean checkCondition(int days, double money) {
        return false;
    }

    @Override
    public boolean checkCondition(double money) {
        return money >= 30000;
    }

    @Override
    public void giveAdvice() {
        System.out.println("С каждой зарплаты покупайте валюту и начните изучать инвестиции.");
    }
}
