package main.java.com.solovyev.converter;

public class JPYCurrencyConverter implements CurrencyConverter {
    @Override
    public double convert(double rubles) {
        return rubles / 0.75;
    }
}
