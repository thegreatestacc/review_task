package main.java.com.solovyev.advice.cases;

public class LessThanTenThousandCase implements Case {
    @Override
    public boolean checkCondition(int days, double money) {
        return false;
    }

    @Override
    public boolean checkCondition(double money) {
        return money < 10000 && money >= 5000;
    }

    @Override
    public void giveAdvice() {
        System.out.println("Купите доллары!");
    }
}
