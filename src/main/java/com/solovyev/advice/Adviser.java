package main.java.com.solovyev.advice;

import main.java.com.solovyev.advice.cases.*;

import java.util.List;

public class Adviser {
    List<Case> casesFoodAndCurrency = List.of(
            new LessThanThreeThousandCase(),
            new CanGoToMcDonaldsCase(),
            new CanOrderCrabCase(),
            new CanBySomeCurrencyAndGoToRestaurantCase()
    );

    List<Case> currencyCases = List.of(
            new LessThanFiveThousandCase(),
            new LessThanTenThousandCase(),
            new LessThanThirtyThousandCase(),
            new DefaultAdviceAboutCurrencyCase()
    );

    public void getFoodAndCurrencyAdvice(int days, double money) {
        for (Case c : casesFoodAndCurrency) {
            if (c.checkCondition(days, money)) {
                c.giveAdvice();
                break;
            }
        }
    }

    public void getCurrencyAdvice(double money) {
        for (Case c : currencyCases) {
            if (c.checkCondition(money)){
                c.giveAdvice();
            }
        }
    }
}
