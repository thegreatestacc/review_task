package main.java.com.solovyev.advice.cases;

public interface Case {

    boolean checkCondition(int days, double money);

    boolean checkCondition(double money);

    void giveAdvice();
}
