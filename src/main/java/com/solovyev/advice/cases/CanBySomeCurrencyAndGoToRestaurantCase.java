package main.java.com.solovyev.advice.cases;

public class CanBySomeCurrencyAndGoToRestaurantCase implements Case {

    @Override
    public boolean checkCondition(int days, double money) {
        return (days < 10 && money < 30000) || (days < 10 && money > 30000);
    }

    @Override
    public boolean checkCondition(double money) {
        return false;
    }

    @Override
    public void giveAdvice() {
        System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место. :)");
    }
}
