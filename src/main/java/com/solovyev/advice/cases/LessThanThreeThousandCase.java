package main.java.com.solovyev.advice.cases;

public class LessThanThreeThousandCase implements Case {

    @Override
    public boolean checkCondition(int days, double money) {
        return money < 3000;
    }

    @Override
    public boolean checkCondition(double money) {
        return false;
    }

    @Override
    public void giveAdvice() {
        System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
    }
}
