package main.java.com.solovyev.advice.cases;

public class LessThanThirtyThousandCase implements Case {
    @Override
    public boolean checkCondition(int days, double money) {
        return false;
    }

    @Override
    public boolean checkCondition(double money) {
        return money < 30000 && money >= 10000;
    }

    @Override
    public void giveAdvice() {
        System.out.println("Советуем купить в равных долях доллары, евро и отложить рубли.");
    }
}
