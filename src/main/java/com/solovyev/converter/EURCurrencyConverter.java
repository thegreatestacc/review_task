package main.java.com.solovyev.converter;

public class EURCurrencyConverter implements CurrencyConverter {
    @Override
    public double convert(double rubles) {
        return rubles / 88.7;
    }
}
