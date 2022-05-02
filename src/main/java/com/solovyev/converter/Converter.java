package main.java.com.solovyev.converter;
public class Converter {

    private final USDCurrencyConverter usdCurrencyConverter;
    private final EURCurrencyConverter eurCurrencyConverter;
    private final JPYCurrencyConverter jpyCurrencyConverter;

    public Converter(USDCurrencyConverter usdCurrencyConverter,
                     EURCurrencyConverter eurCurrencyConverter,
                     JPYCurrencyConverter jpyCurrencyConverter) {
        this.usdCurrencyConverter = usdCurrencyConverter;
        this.eurCurrencyConverter = eurCurrencyConverter;
        this.jpyCurrencyConverter = jpyCurrencyConverter;
    }

    public void convert(double rubles, int currency) {

        switch (currency) {
            case 1:
                System.out.println("Ваши сбережения в долларах: " + usdCurrencyConverter.convert(rubles));
                break;
            case 2:
                System.out.println("Ваши сбережения в евро: " + eurCurrencyConverter.convert(rubles));
                break;
            case 3:
                System.out.println("Ваши сбережения в иенах: " + jpyCurrencyConverter.convert(rubles));
                break;
            default:
                System.out.println("Неизвестная валюта");
        }
    }
}
