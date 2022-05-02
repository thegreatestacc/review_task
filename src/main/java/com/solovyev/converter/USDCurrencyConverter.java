package main.java.com.solovyev.converter;

public class USDCurrencyConverter implements CurrencyConverter {
    @Override
    public double convert(double rubles) {
        return rubles / 78.5;
    }
}
